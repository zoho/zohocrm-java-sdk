package com.zoho.crm.api;

import java.util.HashMap;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.Constants;
import com.zoho.crm.api.util.DataTypeConverter;

/**
 * This class represents the HTTP header name and value.
 */
public class HeaderMap
{
	private  HashMap<String, String> headerMap = new HashMap<String, String>();

	/**
	 * This is a getter method to get header map.
	 * @return A HashMap&lt;String, String&gt; representing the API request headers.
	 */
	public HashMap<String, String> getHeaderMap()
	{
		return headerMap;
	}

	/**
	 * This method is to add header name and value.
	 * @param <T> A T containing the specified data type.
	 * @param header A Header&lt;T&gt; class instance.
	 * @param value A T containing the header value.
	 * @throws SDKException 
	 */
	public <T> void add(Header<T> header, T value) throws SDKException
	{
		if(header == null)
		{
			throw new SDKException(Constants.HEADER_NULL_ERROR, Constants.HEADER_INSTANCE_NULL_ERROR);
		}
		
		String headerName = header.getName();
		
		if(headerName == null)
		{
			throw new SDKException(Constants.HEADER_NAME_NULL_ERROR, Constants.HEADER_NAME_NULL_ERROR_MESSAGE);
		}
		
		if(value == null)
		{
			throw new SDKException(Constants.HEADER_NULL_ERROR, headerName + Constants.NULL_VALUE_ERROR_MESSAGE);
		}
		
		String headerValue = null;
		
		try 
		{
			headerValue = DataTypeConverter.postConvert(value, value.getClass().getName()).toString();
		} 
		catch (Exception e) 
		{
			headerValue = value.toString();
		}
		
		if(headerMap.containsKey(headerName) && !headerMap.get(headerName).isEmpty())
		{
			String existingHeaderValue = headerMap.get(headerName);
			
			existingHeaderValue = existingHeaderValue + "," + headerValue;
			
			headerMap.put(headerName, existingHeaderValue);
		}
		else
		{
			headerMap.put(headerName, headerValue);
		}
	}
}