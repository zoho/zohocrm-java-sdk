package com.zoho.crm.api;

import java.util.HashMap;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.Constants;
import com.zoho.crm.api.util.DataTypeConverter;

/**
 * This class represents the HTTP parameter name and value.
 */
public class ParameterMap
{
	private  HashMap<String, String> parameterMap = new HashMap<String, String>();
	
	/**
	 * This is a getter method to get parameter map.
	 * @return A HashMap&lt;String, String&gt; representing the API request parameters.
	 */
	public HashMap<String, String> getParameterMap()
	{
		return parameterMap;
	}

	/**
	 * This method to add parameter name and value.
	 * @param <T> A T containing the specified data type.
	 * @param param A Param&lt;T&gt; class instance.
	 * @param value A T containing the parameter value.
	 * @throws SDKException 
	 */
	public <T> void add(Param<T> param, T value) throws SDKException
	{
		if(param == null)
		{
			throw new SDKException(Constants.PARAMETER_NULL_ERROR, Constants.PARAM_INSTANCE_NULL_ERROR);
		}
		
		String paramName = param.getName();
		
		if(paramName == null)
		{
			throw new SDKException(Constants.PARAM_NAME_NULL_ERROR, Constants.PARAM_NAME_NULL_ERROR_MESSAGE);
		}
		
		if(value == null)
		{
			throw new SDKException(Constants.PARAMETER_NULL_ERROR, paramName + Constants.NULL_VALUE_ERROR_MESSAGE);
		}
		
		String paramValue = null;
		
		try 
		{
			paramValue = DataTypeConverter.postConvert(value, value.getClass().getName()).toString();
		} 
		catch (Exception e) 
		{
			paramValue = value.toString();
		}
		
		if(parameterMap.containsKey(paramName) && !parameterMap.get(paramName).isEmpty())
		{
			String existingParamValue = parameterMap.get(paramName);
			
			existingParamValue = existingParamValue + "," + paramValue;
			
			parameterMap.put(paramName, existingParamValue);
		}
		else
		{
			parameterMap.put(paramName, paramValue);
		}
	}
}