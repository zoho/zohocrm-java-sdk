package com.zoho.crm.api.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.exception.SDKException;

/**
 * This class is to process the upload file and stream.
 */
public class FormDataConverter extends Converter
{
	public FormDataConverter(CommonAPIHandler commonAPIHandler)
	{
		super(commonAPIHandler);
	}

	private HashMap<String, ArrayList<Object>> uniqueValuesMap = new HashMap<String, ArrayList<Object>>();

	@Override
	public Object formRequest(Object requestInstance, String pack, Integer instanceNumber, JSONObject classMemberDetail) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, SDKException
	{
		JSONObject classDetail = (JSONObject) Initializer.jsonDetails.get(pack);
		
		HashMap<String,Object> request = new HashMap<String, Object>();
		
		for (String memberName : classDetail.keySet())
		{
			Object modification = null;
		
			Method method;
			
			JSONObject memberDetail = (JSONObject) classDetail.get(memberName);
			
			// check and neglect read_only
			if ((memberDetail.has(Constants.READ_ONLY) && memberDetail.getBoolean(Constants.READ_ONLY)) || !memberDetail.has(Constants.NAME))
			{
				continue;
			}
			
			try
			{
				method = requestInstance.getClass().getMethod(Constants.IS_KEY_MODIFIED, String.class);
			
				modification = method.invoke(requestInstance, memberDetail.getString(Constants.NAME));
			}
			catch (InvocationTargetException | NoSuchMethodException ex)
			{
				throw new SDKException(Constants.EXCEPTION_IS_KEY_MODIFIED, ex);
			}
			
			// check required
			if ((modification == null || (Integer)modification == 0) && memberDetail.has(Constants.REQUIRED) && memberDetail.getBoolean(Constants.REQUIRED))
			{
				throw new SDKException(Constants.MANDATORY_VALUE_ERROR, Constants.MANDATORY_KEY_ERROR + memberName);
			}
			
			Field field = requestInstance.getClass().getDeclaredField(memberName);
			
			field.setAccessible(true);
			
			Object fieldValue = field.get(requestInstance);

			if (modification != null && (Integer)modification != 0 && this.valueChecker(requestInstance.getClass().getSimpleName(), memberName, memberDetail, fieldValue, uniqueValuesMap, instanceNumber) == true)
			{
				String keyName = (String) memberDetail.get(Constants.NAME);
				
				String type = (String) memberDetail.get(Constants.TYPE);
				
				if (type.equalsIgnoreCase(Constants.LIST_NAMESPACE))
				{
					request.put(keyName, setJSONArray(fieldValue, memberDetail));
				}
				else if (type.equalsIgnoreCase(Constants.MAP_NAMESPACE))
				{
					request.put(keyName, setJSONObject(fieldValue, memberDetail));
				}
				else if (memberDetail.has(Constants.STRUCTURE_NAME))
				{
					request.put(keyName, formRequest(fieldValue, memberDetail.getString(Constants.STRUCTURE_NAME), 1, memberDetail));
				}
				else
				{
					request.put(keyName, fieldValue);
				}
			}
		}
		
		return request;
	}
	
	@Override
	public void appendToRequest(HttpEntityEnclosingRequestBase requestBase, Object requestObject) throws Exception
	{
		MultipartEntityBuilder multipartEntity = MultipartEntityBuilder.create();
		
		multipartEntity.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		
		if(requestObject instanceof HashMap<?,?>)
		{
			this.addFileBody(requestObject, multipartEntity);
		}
		
		requestBase.setEntity(multipartEntity.build());
	}
	
	private void addFileBody(Object requestObject, MultipartEntityBuilder multipartEntity) throws IOException
	{
		@SuppressWarnings("unchecked")
		HashMap<String,Object> requestObjectMap = (HashMap<String,Object>) requestObject;
		
		for(Entry<String,Object> requestData : requestObjectMap.entrySet())
		{
			if(requestData.getValue() instanceof JSONArray)
			{
				JSONArray keysDetail = (JSONArray) requestData.getValue();

				for (int keyIndex = 0; keyIndex < keysDetail.length(); keyIndex++)
				{
					Object fileObject = keysDetail.get(keyIndex);
					
					if(fileObject instanceof StreamWrapper)
					{
						StreamWrapper streamWrapper = (StreamWrapper) fileObject;
						
						byte[] buffer = new byte[8192];
						
						ByteArrayOutputStream output = new ByteArrayOutputStream();
						
						int bytesRead;
						
						while ((bytesRead = streamWrapper.getStream().read(buffer)) != -1)
						{
						    output.write(buffer, 0, bytesRead);
						}
						
						multipartEntity.addPart(requestData.getKey(), new ByteArrayBody(output.toByteArray(), streamWrapper.getName()));
					}
				}
			}
			else if(requestData.getValue() instanceof StreamWrapper)
			{
				StreamWrapper streamWrapper = (StreamWrapper)requestData.getValue();
				
				byte[] buffer = new byte[8192];
				
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				
				int bytesRead;
				
				while ((bytesRead = streamWrapper.getStream().read(buffer)) != -1)
				{
				    output.write(buffer, 0, bytesRead);
				}
				
				multipartEntity.addPart(requestData.getKey(), new ByteArrayBody(output.toByteArray(), streamWrapper.getName()));
			}
			else
			{
				multipartEntity.addPart(requestData.getKey(), (ContentBody) requestData.getValue());
			}
		}
	}

	private JSONObject setJSONObject(Object fieldValue, JSONObject memberDetail) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, JSONException, SDKException
	{
		JSONObject jsonObject = new JSONObject();
		
		HashMap<?, ?> requestObject = (HashMap<?, ?>) fieldValue;

		if (memberDetail == null)
		{
			for (Object key : requestObject.keySet())
			{
				jsonObject.put((String) key, redirectorForObjectToJSON(requestObject.get(key)));
			}
		}
		else
		{
			JSONArray keysDetail = memberDetail.getJSONArray(Constants.KEYS);
			
			for (int keyIndex = 0; keyIndex < keysDetail.length(); keyIndex++)
			{
				JSONObject keyDetail = keysDetail.getJSONObject(keyIndex);
				
				String keyName = keyDetail.getString(Constants.NAME);
				
				Object keyValue = null;
				
				if (requestObject.containsKey(keyName) && requestObject.get(keyName) != null)
				{
					if (keyDetail.has(Constants.STRUCTURE_NAME))
					{
						keyValue = formRequest(requestObject.get(keyName), keyDetail.getString(Constants.STRUCTURE_NAME), 1, memberDetail);
						
						jsonObject.put(keyName, keyValue);
					}
					else
					{
						keyValue = requestObject.get(keyName);
						
						jsonObject.put(keyName, redirectorForObjectToJSON(keyValue));
					}
				}
			}
		}
		
		return jsonObject;
	}

	private JSONArray setJSONArray(Object fieldValue, JSONObject memberDetail) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, SDKException
	{
		JSONArray jsonArray = new JSONArray();
		
		ArrayList<?> requestObjects = (ArrayList<?>) fieldValue;
		
		if (memberDetail == null)
		{
			for (Object request : requestObjects)
			{
				jsonArray.put(redirectorForObjectToJSON(request));
			}
		}
		else
		{
			if (memberDetail.has(Constants.STRUCTURE_NAME))
			{
				int instanceCount = 0;
				
				String pack = memberDetail.getString(Constants.STRUCTURE_NAME);
				
				for (Object request : requestObjects)
				{
					jsonArray.put(formRequest(request, pack, ++instanceCount, memberDetail));
				}
			}
			else
			{
				for (Object request : requestObjects)
				{
					jsonArray.put(redirectorForObjectToJSON(request));
				}
			}
		}
		
		return jsonArray;
	}

	private Object redirectorForObjectToJSON(Object request) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, JSONException, SDKException
	{
		if (request instanceof List)
		{
			return setJSONArray(request, null);
		}
		else if (request instanceof Map)
		{
			return setJSONObject(request, null);
		}
		else
		{
			return request;
		}
	}

	@Override
	public Object getWrappedResponse(Object response, String pack) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object getResponse(Object response, String pack) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException, UnsupportedOperationException, IOException
	{
		// TODO Auto-generated method stub
		return null;
	}
}