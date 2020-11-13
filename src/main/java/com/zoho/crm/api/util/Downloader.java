package com.zoho.crm.api.util;

import java.io.InputStream;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import org.json.JSONArray;
import org.json.JSONObject;

import com.zoho.crm.api.Initializer;

/**
 * This class is to process the download file and stream response.
 */
public class Downloader extends Converter
{

	public Downloader(CommonAPIHandler commonAPIHandler)
	{
		super(commonAPIHandler);
	}

	@Override
	public Object formRequest(Object requestInstance, String pack, Integer instanceNumber, JSONObject memberDetail) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void appendToRequest(HttpEntityEnclosingRequestBase requestBase, Object requestObject) throws Exception
	{
		return;
	}

	@Override
	public Object getWrappedResponse(Object response, String pack) throws Exception
	{
		return getResponse(response, pack);
	}
	
	@Override
	public Object getResponse(Object response, String pack) throws Exception
	{
		JSONObject recordJsonDetails = Initializer.jsonDetails.getJSONObject(pack);
		
		Object instance = null;
		
		if (recordJsonDetails.has(Constants.INTERFACE) && recordJsonDetails.getBoolean(Constants.INTERFACE))
		{
			JSONArray classes = recordJsonDetails.getJSONArray(Constants.CLASSES);
			
			for(Object classObject : classes)
			{
				String className = classObject.toString();
				
				if(className.contains(Constants.FILEBODYWRAPPER))
				{
					return getResponse(response, className);
				}
			}
			
			return instance;
		}
		else
		{
			instance = Class.forName(pack).newInstance();
			
			for (String memberName : recordJsonDetails.keySet())
			{
				JSONObject memberJsonDetails = recordJsonDetails.getJSONObject(memberName);
			
				Field field = instance.getClass().getDeclaredField(memberName);
				
				field.setAccessible(true);
				
				String type = (String) memberJsonDetails.get(Constants.TYPE);
				
				Object instanceValue = null;
				
				if (type.equalsIgnoreCase(Constants.STREAM_WRAPPER_CLASS_PATH))
				{
					String contentDisposition = ((HttpResponse)response).getFirstHeader(Constants.CONTENT_DISPOSITION).getValue();
				
					String fileName = contentDisposition.split("=")[1];
			        
					if(fileName.contains("''"))
			        {
			            fileName = fileName.split("''")[1];
			        }
					
					if(fileName.contains("\""))
			        {
			        	fileName = fileName.replace("\"", "");
			        }
					
					HttpEntity entity = ((HttpResponse)response).getEntity();
					
					@SuppressWarnings("rawtypes")
					Constructor constructor = Class.forName(type).getConstructor(String.class, InputStream.class);
					
					Object fileInstance = constructor.newInstance(fileName, entity.getContent());
					
					instanceValue = fileInstance;
					
					field.set(instance, instanceValue);
				}
			}
		}
		
		return instance;
	}
}