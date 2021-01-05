package com.zoho.crm.api.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.record.FileDetails;
import com.zoho.crm.api.record.Record;

/**
 * This class processes the API response object to the POJO object and POJO object to a JSON object.
 */
public class JSONConverter extends Converter
{
	public JSONConverter(CommonAPIHandler commonAPIHandler)
	{
		super(commonAPIHandler);
	}

	private HashMap<String, ArrayList<Object>> uniqueValuesMap = new HashMap<String, ArrayList<Object>>();

	@SuppressWarnings("deprecation")
	@Override
	public void appendToRequest(HttpEntityEnclosingRequestBase requestBase, Object requestObject) throws Exception
	{
		requestBase.setEntity(new StringEntity(requestObject.toString(), HTTP.UTF_8));
	}

	@Override
	public Object formRequest(Object requestInstance, String pack, Integer instanceNumber, JSONObject memberDetail) throws Exception// if structure
	{
		JSONObject classDetail = (JSONObject) Initializer.jsonDetails.get(pack);

		if (classDetail.has(Constants.INTERFACE) && classDetail.getBoolean(Constants.INTERFACE))// useless
		{
			JSONArray classes = classDetail.getJSONArray(Constants.CLASSES);

			String requestObjectClassName = requestInstance.getClass().getCanonicalName();

			for (Object className : classes)
			{
				if (((String) className).equalsIgnoreCase(requestObjectClassName))
				{
					classDetail = (JSONObject) Initializer.jsonDetails.get(requestObjectClassName);

					break;
				}
			}
		}

		if (requestInstance instanceof Record)
		{
			String moduleAPIName = this.commonAPIHandler.getModuleAPIName();

			JSONObject returnJSON = isRecordRequest(requestInstance, classDetail, instanceNumber, memberDetail);

			this.commonAPIHandler.setModuleAPIName(moduleAPIName);

			return returnJSON;
		}
		else
		{
			return isNotRecordRequest(requestInstance, classDetail, instanceNumber, memberDetail);
		}

	}

	private JSONObject isNotRecordRequest(Object requestInstance, JSONObject classDetail, Integer instanceNumber, JSONObject classMemberDetail) throws Exception
	{
		Boolean lookUp = false;

		Boolean skipMandatory = false;

		String classMemberName = null;

		if (classMemberDetail != null)
		{
			lookUp = classMemberDetail.optBoolean(Constants.LOOKUP);

			skipMandatory = classMemberDetail.optBoolean(Constants.SKIP_MANDATORY);

			classMemberName = this.buildName(classMemberDetail.getString(Constants.NAME));
		}

		JSONObject requestJSON = new JSONObject();

		HashMap<String, Boolean> requiredKeys = new HashMap<String, Boolean>();

		HashMap<String, Boolean> primaryKeys = new HashMap<String, Boolean>();
		
		HashMap<String, Boolean> requiredInUpdateKeys = new HashMap<String, Boolean>();

		for (String memberName : classDetail.keySet())
		{
			Object modification = null;

			JSONObject memberDetail = (JSONObject) classDetail.get(memberName);

			// check and neglect read_only
			if ((memberDetail.has(Constants.READ_ONLY) && memberDetail.getBoolean(Constants.READ_ONLY)) || !memberDetail.has(Constants.NAME))// read only or no keyName
			{
				continue;
			}

			String keyName = memberDetail.getString(Constants.NAME);

			try
			{
				Method isKeyModified = requestInstance.getClass().getMethod(Constants.IS_KEY_MODIFIED, String.class);

				modification = isKeyModified.invoke(requestInstance, keyName);
			}
			catch (InvocationTargetException | NoSuchMethodException ex)
			{
				throw new SDKException(Constants.EXCEPTION_IS_KEY_MODIFIED, ex);
			}

			if (memberDetail.has(Constants.REQUIRED) && memberDetail.getBoolean(Constants.REQUIRED))
			{
				requiredKeys.put(keyName, true);
			}

			if (memberDetail.has(Constants.REQUIRED_IN_UPDATE) && memberDetail.getBoolean(Constants.REQUIRED_IN_UPDATE))
			{
				requiredInUpdateKeys.put(keyName, true);
			}
			
			if ((memberDetail.has(Constants.PRIMARY) && memberDetail.getBoolean(Constants.PRIMARY) && (!memberDetail.has(Constants.REQUIRED_IN_UPDATE) || memberDetail.getBoolean(Constants.REQUIRED_IN_UPDATE))))
			{
				primaryKeys.put(keyName, true);
			}

			Object fieldValue = null;

			if (modification != null && (Integer) modification != 0)
			{
				Field field = requestInstance.getClass().getDeclaredField(memberName);

				field.setAccessible(true);

				fieldValue = field.get(requestInstance);

				if (this.valueChecker(requestInstance.getClass().getSimpleName(), memberName, memberDetail, fieldValue, uniqueValuesMap, instanceNumber) == true)
				{
					if (fieldValue != null)
					{
						requiredKeys.remove(keyName);

						primaryKeys.remove(keyName);
						
						requiredInUpdateKeys.remove(keyName);
					}

					if (requestInstance instanceof FileDetails)
					{
						requestJSON.put(keyName.toLowerCase(), (fieldValue != null ? fieldValue : JSONObject.NULL));
					}
					else
					{
						requestJSON.put(keyName, setData(memberDetail, fieldValue));
					}
				}
			}
		}

		if (skipMandatory || checkException(classMemberName, requestInstance, instanceNumber, lookUp, requiredKeys, primaryKeys, requiredInUpdateKeys))
		{
			return requestJSON;
		}
		
		return requestJSON;
	}
	
	private Boolean checkException(String memberName, Object requestInstance, Integer instanceNumber, Boolean lookUp, HashMap<String, Boolean> requiredKeys, HashMap<String, Boolean> primaryKeys,  HashMap<String, Boolean> requiredInUpdateKeys) throws SDKException
	{
		if(requiredInUpdateKeys.size() > 0 && this.commonAPIHandler.getCategoryMethod().equalsIgnoreCase(Constants.REQUEST_CATEGORY_UPDATE))
		{
			JSONObject error = new JSONObject();

			error.put(Constants.FIELD, memberName);

			error.put(Constants.TYPE, requestInstance.getClass().getCanonicalName());

			error.put(Constants.KEYS, requiredInUpdateKeys.keySet().toString());

			error.put(Constants.INSTANCE_NUMBER, instanceNumber);

			throw new SDKException(Constants.MANDATORY_VALUE_ERROR, Constants.MANDATORY_KEY_ERROR, error, null);
		}
		
		if(this.commonAPIHandler.isMandatoryChecker() != null && this.commonAPIHandler.isMandatoryChecker())
		{
			if (this.commonAPIHandler.getCategoryMethod().equalsIgnoreCase(Constants.REQUEST_CATEGORY_CREATE))
			{
				if (lookUp)
				{
					if (primaryKeys.size() > 0)
					{
						JSONObject error = new JSONObject();

						error.put(Constants.FIELD, memberName);

						error.put(Constants.TYPE, requestInstance.getClass().getCanonicalName());

						error.put(Constants.KEYS, primaryKeys.keySet().toString());

						error.put(Constants.INSTANCE_NUMBER, instanceNumber);

						throw new SDKException(Constants.MANDATORY_VALUE_ERROR, Constants.PRIMARY_KEY_ERROR, error, null);
					}
				}
				else if (requiredKeys.size() > 0)
				{
					JSONObject error = new JSONObject();

					error.put(Constants.FIELD, memberName);

					error.put(Constants.TYPE, requestInstance.getClass().getCanonicalName());

					error.put(Constants.KEYS, requiredKeys.keySet().toString());

					error.put(Constants.INSTANCE_NUMBER, instanceNumber);

					throw new SDKException(Constants.MANDATORY_VALUE_ERROR, Constants.MANDATORY_KEY_ERROR, error, null);
				}
			}

			if (this.commonAPIHandler.getCategoryMethod().equalsIgnoreCase(Constants.REQUEST_CATEGORY_UPDATE) && primaryKeys.size() > 0)
			{
				JSONObject error = new JSONObject();

				error.put(Constants.FIELD, memberName);

				error.put(Constants.TYPE, requestInstance.getClass().getCanonicalName());

				error.put(Constants.KEYS, primaryKeys.keySet().toString());

				error.put(Constants.INSTANCE_NUMBER, instanceNumber);

				throw new SDKException(Constants.MANDATORY_VALUE_ERROR, Constants.PRIMARY_KEY_ERROR, error, null);
			}
		}
		else if (lookUp && this.commonAPIHandler.getCategoryMethod().equalsIgnoreCase(Constants.REQUEST_CATEGORY_UPDATE))
		{
			if (primaryKeys.size() > 0)
			{
				JSONObject error = new JSONObject();

				error.put(Constants.FIELD, memberName);

				error.put(Constants.TYPE, requestInstance.getClass().getCanonicalName());

				error.put(Constants.KEYS, primaryKeys.keySet().toString());

				error.put(Constants.INSTANCE_NUMBER, instanceNumber);

				throw new SDKException(Constants.MANDATORY_VALUE_ERROR, Constants.PRIMARY_KEY_ERROR, error, null);
			}
		}
		
		return true;
	}

	private JSONObject isRecordRequest(Object recordInstance, JSONObject classDetail, Integer instanceNumber, JSONObject memberDetail) throws JSONException, Exception
	{
		Boolean lookUp = false;

		Boolean skipMandatory = false;

		String classMemberName = null;

		if (memberDetail != null)
		{
			lookUp = memberDetail.optBoolean(Constants.LOOKUP);

			skipMandatory = memberDetail.optBoolean(Constants.SKIP_MANDATORY);

			classMemberName = memberDetail.optString(Constants.NAME);
		}

		JSONObject requestJSON = new JSONObject();

		JSONObject moduleDetail = new JSONObject();

		String moduleAPIName = this.commonAPIHandler.getModuleAPIName();

		if (moduleAPIName != null)// entry
		{
			this.commonAPIHandler.setModuleAPIName(null);

			JSONObject fullDetail = Utility.searchJSONDetails(moduleAPIName);// to get correct moduleapiname in proper format

			if (fullDetail != null)// from Jsondetails
			{
				moduleDetail = fullDetail.getJSONObject(Constants.MODULEDETAILS);
			}
			else// from user spec
			{
				moduleDetail = getModuleDetailFromUserSpecJSON(moduleAPIName);
			}
		}
		else// inner case
		{
			moduleDetail = classDetail;

			classDetail = Initializer.jsonDetails.getJSONObject(Constants.RECORD_NAMESPACE);
		} // class detail must contain record structure at this point

		Class<?> cl = recordInstance.getClass();

		Class<?> scl = cl.getSuperclass();

		if (scl.getCanonicalName().equals(Constants.RECORD_NAMESPACE))
		{
			cl = scl;
		}

		Field keyValueField = cl.getDeclaredField(Constants.KEY_VALUES);

		keyValueField.setAccessible(true);

		Field keyModifiedField = cl.getDeclaredField(Constants.KEY_MODIFIED);

		keyModifiedField.setAccessible(true);

		@SuppressWarnings("unchecked")
		HashMap<String, Object> keyValues = (HashMap<String, Object>) keyValueField.get(recordInstance);

		@SuppressWarnings("unchecked")
		HashMap<String, Object> keyModified = (HashMap<String, Object>) keyModifiedField.get(recordInstance);

		HashMap<String, Boolean> requiredKeys = new HashMap<String, Boolean>();

		HashMap<String, Boolean> primaryKeys = new HashMap<String, Boolean>();

		if (!skipMandatory)
		{
			for (String keyName : moduleDetail.keySet())
			{
				JSONObject keyDetail = moduleDetail.getJSONObject(keyName);

				String name = keyDetail.getString(Constants.NAME);

				if (keyDetail.has(Constants.REQUIRED) && keyDetail.getBoolean(Constants.REQUIRED))
				{
					requiredKeys.put(name, true);
				}

				if (keyDetail.has(Constants.PRIMARY) && keyDetail.getBoolean(Constants.PRIMARY))
				{
					primaryKeys.put(name, true);
				}
			}
			
			for (String keyName : classDetail.keySet())
			{
				JSONObject keyDetail = classDetail.getJSONObject(keyName);

				String name = keyDetail.getString(Constants.NAME);

				if (keyDetail.has(Constants.REQUIRED) && keyDetail.getBoolean(Constants.REQUIRED))
				{
					requiredKeys.put(name, true);
				}

				if (keyDetail.has(Constants.PRIMARY) && keyDetail.getBoolean(Constants.PRIMARY))
				{
					primaryKeys.put(name, true);
				}
			}
		}

		for (String keyName : keyModified.keySet())
		{
			if ((Integer) keyModified.get(keyName) != 1)
			{
				continue;
			}

			JSONObject keyDetail = new JSONObject();

			Object keyValue = keyValues.containsKey(keyName) ? keyValues.get(keyName) : null;

			Object jsonValue = null;

			String memberName = buildName(keyName);

			if (moduleDetail.length() > 0 && (moduleDetail.has(keyName) || moduleDetail.has(memberName)))
			{
				if (moduleDetail.has(keyName))
				{
					keyDetail = (JSONObject) moduleDetail.getJSONObject(keyName);// incase of user spec json
				}
				else
				{
					keyDetail = (JSONObject) moduleDetail.getJSONObject(memberName);// json details
				}
			}
			else if (classDetail.has(memberName))
			{
				keyDetail = classDetail.getJSONObject(memberName);
			}

			if (keyDetail.length() > 0)
			{
				if ((keyDetail.has(Constants.READ_ONLY) && keyDetail.getBoolean(Constants.READ_ONLY)) || !keyDetail.has(Constants.NAME))// read only or no keyName
				{
					continue;
				}

				if (this.valueChecker(cl.getSimpleName(), memberName, keyDetail, keyValue, uniqueValuesMap, instanceNumber) == true)
				{
					jsonValue = setData(keyDetail, keyValue);
				}
			}
			else
			{
				jsonValue = redirectorForObjectToJSON(keyValue);
			}

			if(keyValue != null)
			{
				requiredKeys.remove(keyName);

				primaryKeys.remove(keyName);
			}
			
			requestJSON.put(keyName, jsonValue);
		}

		if (skipMandatory || checkException(classMemberName, recordInstance, instanceNumber, lookUp, requiredKeys, primaryKeys, new HashMap<String, Boolean>()))
		{
			return requestJSON;
		}
		
		return requestJSON;
	}

	private Object setData(JSONObject memberDetail, Object fieldValue) throws JSONException, Exception
	{
		if (fieldValue != null)
		{
			String type = (String) memberDetail.get(Constants.TYPE);

			if (type.equalsIgnoreCase(Constants.LIST_NAMESPACE))
			{
				return setJSONArray(fieldValue, memberDetail);
			}
			else if (type.equalsIgnoreCase(Constants.MAP_NAMESPACE))
			{
				return setJSONObject(fieldValue, memberDetail);
			}
			else if (type.equals(Constants.CHOICE_NAMESPACE) || (memberDetail.has(Constants.STRUCTURE_NAME) && memberDetail.getString(Constants.STRUCTURE_NAME).equals(Constants.CHOICE_NAMESPACE)))
			{
				return (((Choice<?>) fieldValue).getValue());
			}
			else if (memberDetail.has(Constants.STRUCTURE_NAME) && memberDetail.has(Constants.MODULE))
			{
				return isRecordRequest(fieldValue, getModuleDetailFromUserSpecJSON(memberDetail.getString(Constants.MODULE)), null, memberDetail);
			}
			else if (memberDetail.has(Constants.STRUCTURE_NAME))
			{
				return formRequest(fieldValue, memberDetail.getString(Constants.STRUCTURE_NAME), null, memberDetail);
			}
			else
			{
				return DataTypeConverter.postConvert(fieldValue, type);
			}
		}

		return JSONObject.NULL;
	}

	private JSONObject setJSONObject(Object fieldValue, JSONObject memberDetail) throws Exception
	{
		JSONObject jsonObject = new JSONObject();

		HashMap<?, ?> requestObject = (HashMap<?, ?>) fieldValue;

		if (requestObject.size() > 0)
		{
			if (memberDetail == null || (memberDetail != null && !memberDetail.has(Constants.KEYS)))
			{
				for (Object key : requestObject.keySet())
				{
					jsonObject.put((String) key, redirectorForObjectToJSON(requestObject.get(key)));
				}
			}
			else
			{
				if (memberDetail.has(Constants.KEYS))
				{
					JSONArray keysDetail = memberDetail.getJSONArray(Constants.KEYS);

					for (int keyIndex = 0; keyIndex < keysDetail.length(); keyIndex++)
					{
						JSONObject keyDetail = keysDetail.getJSONObject(keyIndex);

						String keyName = keyDetail.getString(Constants.NAME);

						Object keyValue = null;

						if (requestObject.containsKey(keyName) && requestObject.get(keyName) != null)
						{
							keyValue = setData(keyDetail, (requestObject).get(keyName));

							jsonObject.put(keyName, keyValue);
						}
					}
				}
			}
		}

		return jsonObject;
	}

	private JSONArray setJSONArray(Object fieldValue, JSONObject memberDetail) throws Exception
	{
		JSONArray jsonArray = new JSONArray();

		ArrayList<?> requestObjects = (ArrayList<?>) fieldValue;

		if (requestObjects.size() > 0)
		{
			if (memberDetail == null || (memberDetail != null && !memberDetail.has(Constants.STRUCTURE_NAME)))
			{
				for (Object request : requestObjects)
				{
					jsonArray.put(redirectorForObjectToJSON(request));
				}
			}
			else
			{
				String pack = memberDetail.getString(Constants.STRUCTURE_NAME);

				if (pack.equalsIgnoreCase(Constants.CHOICE_NAMESPACE))
				{
					for (Object request : requestObjects)
					{
						jsonArray.put(((Choice<?>) request).getValue());
					}
				}
				else if (memberDetail.has(Constants.MODULE) && memberDetail.get(Constants.MODULE) != null)
				{
					int instanceCount = 0;

					for (Object request : requestObjects)
					{
						jsonArray.put(isRecordRequest(request, getModuleDetailFromUserSpecJSON(memberDetail.getString(Constants.MODULE)), instanceCount, memberDetail));

						instanceCount++;
					}
				}
				else
				{
					int instanceCount = 0;

					for (Object request : requestObjects)
					{
						jsonArray.put(formRequest(request, pack, instanceCount, memberDetail));

						instanceCount++;
					}
				}
			}
		}

		return jsonArray;
	}

	private Object redirectorForObjectToJSON(Object request) throws Exception
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
		HttpEntity responseEntity = ((HttpResponse) response).getEntity();

		if (responseEntity != null)
		{
			Object responseObject = EntityUtils.toString(responseEntity);

			return getResponse(responseObject, pack);
		}

		return null;
	}

	@Override
	public Object getResponse(Object response, String packageName) throws Exception// new structure comes here
	{
		JSONObject classDetail = Initializer.jsonDetails.getJSONObject(packageName);

		String responseString = response.toString();

		if (responseString == null || responseString.equals("null") || responseString.isEmpty() || responseString.trim().length() == 0)
		{
			return null;
		}

		JSONObject responseJson = new JSONObject(responseString);

		Object instance = null;

		if (classDetail.has(Constants.INTERFACE) && classDetail.getBoolean(Constants.INTERFACE))// if interface
		{
			JSONArray classes = classDetail.getJSONArray(Constants.CLASSES);

			instance = findMatch(classes, responseJson);// find match returns instance(calls getresponse() recursively)
		}
		else
		{
			Constructor<?> constructor = Class.forName(packageName).getDeclaredConstructors()[0];

			if (Modifier.isPrivate(constructor.getModifiers()))
			{
				constructor.setAccessible(true);
			}

			instance = constructor.newInstance();

			if (instance instanceof Record)// if record -> based on response json data will be assigned to field Values
			{
				String moduleAPIName = this.commonAPIHandler.getModuleAPIName();

				instance = isRecordResponse(responseJson, classDetail, packageName);

				this.commonAPIHandler.setModuleAPIName(moduleAPIName);
			}
			else
			{
				instance = notRecordResponse(instance, responseJson, classDetail);// based on json details data will be assigned
			}
		}

		return instance;
	}

	private Object notRecordResponse(Object instance, JSONObject responseJson, JSONObject classDetail) throws Exception
	{
		for (String memberName : classDetail.keySet())
		{
			JSONObject keyDetail = classDetail.getJSONObject(memberName);

			String keyName = keyDetail.has(Constants.NAME) ? keyDetail.getString(Constants.NAME) : null;

			if (keyName != null && responseJson.has(keyName) && responseJson.get(keyName) != null && !responseJson.isNull(keyName))
			{
				Object keyData = responseJson.get(keyName);

				Field member = instance.getClass().getDeclaredField(memberName);

				member.setAccessible(true);

				Object memberValue = getData(keyData, keyDetail);

				member.set(instance, memberValue);
			}
		}

		return instance;
	}

	private Object isRecordResponse(JSONObject responseJson, JSONObject classDetail, String pack) throws JSONException, Exception
	{
		Object recordInstance = Class.forName(pack).newInstance();

		String moduleAPIName = this.commonAPIHandler.getModuleAPIName();

		JSONObject moduleDetail = new JSONObject();

		if (moduleAPIName != null)// entry
		{
			this.commonAPIHandler.setModuleAPIName(null);

			JSONObject fullDetail = Utility.searchJSONDetails(moduleAPIName);// to get correct moduleapiname in proper format

			if (fullDetail != null)// from Jsondetails
			{
				moduleDetail = fullDetail.getJSONObject(Constants.MODULEDETAILS);

				recordInstance = Class.forName(fullDetail.getString(Constants.MODULEPACKAGENAME)).newInstance();
			}
			else// from user spec
			{
				moduleDetail = getModuleDetailFromUserSpecJSON(moduleAPIName);
			}
		}
		
		for(String key : JSONObject.getNames(classDetail))
		{
			moduleDetail.put(key, classDetail.get(key));
		}
		
		JSONObject recordDetail = Initializer.jsonDetails.getJSONObject(Constants.RECORD_NAMESPACE);
		
		// after above steps, recordDetail must always contain record structure detail,module detail could be any,entry case pack detail is record

		Field member = null;

		Class<?> cl = recordInstance.getClass();

		Class<?> scl = cl.getSuperclass();

		if (scl.getCanonicalName().equals(Constants.RECORD_NAMESPACE))
		{
			cl = scl;
		}

		member = cl.getDeclaredField(Constants.KEY_VALUES);

		member.setAccessible(true);

		HashMap<String, Object> keyValues = new HashMap<String, Object>();

		for (String keyName : responseJson.keySet())
		{
			String memberName = buildName(keyName);

			JSONObject keyDetail = new JSONObject();

			if (moduleDetail.length() > 0 && (moduleDetail.has(keyName) || moduleDetail.has(memberName)))
			{
				if (moduleDetail.has(keyName))
				{
					keyDetail = (JSONObject) moduleDetail.getJSONObject(keyName);// incase of user spec json
				}
				else
				{
					keyDetail = (JSONObject) moduleDetail.getJSONObject(memberName);// json details
				}
			}
			else if (recordDetail.has(memberName))
			{
				keyDetail = (JSONObject) recordDetail.getJSONObject(memberName);
			}

			Object keyValue = null;

			Object keyData = responseJson.get(keyName);

			if (keyDetail.length() > 0)
			{
				keyName = keyDetail.getString(Constants.NAME);

				keyValue = getData(keyData, keyDetail);
			}
			else// if not key detail
			{
				keyValue = redirectorForJSONToObject(keyData);
			}

			keyValues.put(keyName, keyValue);
		}

		member.set(recordInstance, keyValues);

		return recordInstance;
	}

	private Object getData(Object keyData, JSONObject memberDetail) throws Exception
	{
		Object memberValue = null;

		if (keyData != JSONObject.NULL)
		{
			String type = (String) memberDetail.get(Constants.TYPE);

			if (type.equalsIgnoreCase(Constants.LIST_NAMESPACE))
			{
				memberValue = getCollectionsData((JSONArray) keyData, memberDetail);
			}
			else if (type.equalsIgnoreCase(Constants.MAP_NAMESPACE))
			{
				memberValue = getMapData((JSONObject) keyData, memberDetail);
			}
			else if (type.equals(Constants.CHOICE_NAMESPACE) || (memberDetail.has(Constants.STRUCTURE_NAME) && memberDetail.getString(Constants.STRUCTURE_NAME).equals(Constants.CHOICE_NAMESPACE)))
			{
				memberValue = Class.forName(type).getConstructors()[0].newInstance(keyData);
			}
			else if (memberDetail.has(Constants.STRUCTURE_NAME) && memberDetail.has(Constants.MODULE))
			{
				memberValue = isRecordResponse((JSONObject) keyData, getModuleDetailFromUserSpecJSON(memberDetail.getString(Constants.MODULE)), memberDetail.getString(Constants.STRUCTURE_NAME));
			}
			else if (memberDetail.has(Constants.STRUCTURE_NAME))
			{
				memberValue = getResponse(keyData, memberDetail.getString(Constants.STRUCTURE_NAME));
			}
			else
			{
				memberValue = DataTypeConverter.preConvert(keyData, type);
			}
		}

		return memberValue;
	}

	private Map<String, Object> getMapData(JSONObject response, JSONObject memberDetail) throws Exception
	{
		Map<String, Object> mapInstance = new HashMap<>();

		if (response.length() > 0)
		{
			if (memberDetail == null || (memberDetail != null && !memberDetail.has(Constants.KEYS)))
			{
				for (String key : response.keySet())
				{
					mapInstance.put(key, redirectorForJSONToObject(response.get(key)));
				}
			}
			else// member must have keys
			{
				if (memberDetail.has(Constants.KEYS))
				{
					JSONArray keysDetail = memberDetail.getJSONArray(Constants.KEYS);

					for (int keyIndex = 0; keyIndex < keysDetail.length(); keyIndex++)
					{
						JSONObject keyDetail = keysDetail.getJSONObject(keyIndex);

						String keyName = keyDetail.getString(Constants.NAME);

						Object keyValue = null;

						if (response.has(keyName) && response.get(keyName) != null)
						{
							keyValue = getData(response.get(keyName), keyDetail);

							mapInstance.put(keyName, keyValue);
						}
					}
				}
			}
		}

		return mapInstance;
	}

	private ArrayList<Object> getCollectionsData(JSONArray responses, JSONObject memberDetail) throws Exception
	{
		ArrayList<Object> values = new ArrayList<Object>();

		if (responses.length() > 0)
		{
			if (memberDetail == null || (memberDetail != null && !memberDetail.has(Constants.STRUCTURE_NAME)))
			{
				for (Object response : responses)
				{
					values.add(redirectorForJSONToObject(response));
				}
			}
			else// need to have structure Name in memberDetail
			{
				String pack = memberDetail.getString(Constants.STRUCTURE_NAME);

				if (pack.equalsIgnoreCase(Constants.CHOICE_NAMESPACE))
				{
					for (Object response : responses)
					{
						values.add(Class.forName(Constants.CHOICE_NAMESPACE).getConstructors()[0].newInstance(response));
					}
				}
				else if (memberDetail.has(Constants.MODULE) && memberDetail.get(Constants.MODULE) != null)
				{
					for (Object response : responses)
					{
						values.add(isRecordResponse((JSONObject) response, getModuleDetailFromUserSpecJSON(memberDetail.getString(Constants.MODULE)), pack));
					}
				}
				else
				{
					for (Object response : responses)
					{
						values.add(getResponse(response, pack));
					}
				}
			}
		}

		return values;
	}

	private JSONObject getModuleDetailFromUserSpecJSON(String module) throws IOException
	{
		JSONObject moduleDetail;

		String recordFieldDetailsPath = Initializer.getInitializer().getResourcePath() + File.separator + Constants.FIELD_DETAILS_DIRECTORY + File.separator + getEncodedFileName();

		moduleDetail = Utility.getJSONObject(Initializer.getJSON(recordFieldDetailsPath), module);

		return moduleDetail;
	}

	private Object redirectorForJSONToObject(Object keyData) throws Exception// only if structure doesn't exist
	{
		if (keyData instanceof JSONObject)
		{
			return getMapData((JSONObject) keyData, null);
		}
		else if (keyData instanceof JSONArray)
		{
			return getCollectionsData((JSONArray) keyData, null);
		}
		else if (keyData == JSONObject.NULL)
		{
			return null;
		}
		else
		{
			return keyData;
		}
	}

	private Object findMatch(JSONArray classes, JSONObject responseJson) throws Exception
	{
		String pack = "";

		float ratio = 0;

		for (Object className : classes)
		{
			float matchRatio = findRatio((String) className, responseJson);

			if (matchRatio == 1.0)
			{
				pack = (String) className;

				ratio = 1;

				break;
			}
			else if (matchRatio > ratio)
			{
				pack = (String) className;

				ratio = matchRatio;
			}
		}

		return getResponse(responseJson, pack);
	}

	private float findRatio(String className, JSONObject responseJson)
	{
		JSONObject classDetail = (JSONObject) Initializer.jsonDetails.get(className);

		float totalPoints = classDetail.keySet().size();

		float matches = 0;

		if (totalPoints == 0)
		{
			return 0;
		}
		else
		{
			for (String memberName : classDetail.keySet())
			{
				JSONObject memberDetail = classDetail.getJSONObject(memberName);

				String keyName = memberDetail.has(Constants.NAME) ? memberDetail.getString(Constants.NAME) : null;

				if (keyName != null && responseJson.has(keyName) && responseJson.get(keyName) != null)
				{// key not empty

					Object keyData = responseJson.get(keyName);

					String type = keyData.getClass().getTypeName();

					String structureName = memberDetail.has(Constants.STRUCTURE_NAME) ? memberDetail.getString(Constants.STRUCTURE_NAME) : null;

					if (keyData instanceof JSONObject)
					{
						type = Constants.MAP_NAMESPACE;
					}

					if (keyData instanceof JSONArray)
					{
						type = Constants.LIST_NAMESPACE;
					}

					if (type.equals(memberDetail.get(Constants.TYPE)))
					{
						matches++;
					}
					else if (memberDetail.getString(Constants.TYPE).equalsIgnoreCase(Constants.CHOICE_NAMESPACE))
					{
						for (Object value : memberDetail.getJSONArray(Constants.VALUES))
						{
							if (value.equals(keyData))
							{
								matches++;

								break;
							}
						}
					}

					if (structureName != null && structureName.equals(memberDetail.get(Constants.TYPE)))
					{
						if (memberDetail.has(Constants.VALUES))
						{
							for (Object value : memberDetail.getJSONArray(Constants.VALUES))
							{
								if (value.equals(keyData))
								{
									matches++;

									break;
								}
							}
						}
						else
						{
							matches++;
						}
					}
				}
			}
		}

		return matches / totalPoints;
	}

	public String buildName(String memberName)
	{
		List<String> name = Arrays.asList(memberName.split("_"));

		String sdkName = new String();

		int index;

		if (name.isEmpty())
		{
			index = 1;
		}

		sdkName = (name.get(0).substring(0, 1).toLowerCase()).concat(name.get(0).substring(1));

		index = 1;

		for (int nameIndex = index; nameIndex < name.size(); nameIndex++)
		{
			String firstLetterUppercase = "";
			
			if(name.get(nameIndex).length() > 0)
			{
				firstLetterUppercase = (name.get(nameIndex).substring(0, 1).toUpperCase()).concat(name.get(nameIndex).substring(1));
			}

			sdkName = sdkName.concat(firstLetterUppercase);
		}

		return sdkName;
	}
}
