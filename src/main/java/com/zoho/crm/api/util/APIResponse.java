package com.zoho.crm.api.util;

import java.util.HashMap;

/**
 * This class is the common API response object.
 * @param <T> is POJO class type
 */
public class APIResponse<T>
{	
	private HashMap<String,String> headers;
	
	private int statusCode;
	
	private Model object;
	
	private boolean isExpected;

	/**
	 * Creates an APIResponse&lt;T&gt; class instance with the specified parameters.
	 * @param headers A HashMap&lt;String, String&gt; containing the API response headers. 
	 * @param statusCode A Integer containing the API response HTTP status code.
	 * @param object A Object containing the API response POJO class instance.
	 * @param exe A Boolean containing the API response instance expected type or not.
	 */
	public APIResponse(HashMap<String,String> headers, int statusCode, Model object, boolean exe)
	{
		this.headers = headers;
		
		this.statusCode = statusCode;
		
		this.object = object;
		
		this.isExpected = exe;
	}

	/**
	 * This is a getter method to get API response headers.
	 * @return A HashMap&lt;String, String&gt; representing the API response headers.
	 */
	public HashMap<String, String> getHeaders()
	{
		return this.headers;
	}
	
	/**
	 * This is a getter method to get the API response HTTP status code.
	 * @return A Integer representing the API response HTTP status code.
	 */
	public int getStatusCode()
	{
		return this.statusCode;
	}
	
	/**
	 * This is a getter method to get an API response instance that is the expected type or not.
	 * @return A Boolean representing the instance is expected type or not.
	 */
	public boolean isExpected()
	{
		return this.isExpected;
	}

	/**
	 * This is a getter method to get the API response Model Interface instance.
	 * @return A Model Interface instance.
	 */
	public Model getModel()
	{
		return this.object;
	}
	
	/**
	 * This method to get an API response POJO class instance.
	 * @return A POJO class instance.
	 */
	@SuppressWarnings("unchecked")
	public T getObject()
	{
		return (T) this.object;
	}
}