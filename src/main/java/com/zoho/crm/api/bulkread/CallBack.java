package com.zoho.crm.api.bulkread;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class CallBack implements Model
{
	private String url;

	private Choice<String> method;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of url
	 * @return A String representing the url
	 */
	public String getUrl()
	{
		return  this.url;

	}

	/**
	 * The method to set the value to url
	 * @param url A String representing the url
	 */
	public void setUrl(String url)
	{
		 this.url=url;

		 this.keyModified.put("url", 1);

	}

	/**
	 * The method to get the value of method
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getMethod()
	{
		return  this.method;

	}

	/**
	 * The method to set the value to method
	 * @param method An instance of Choice<String>
	 */
	public void setMethod(Choice<String> method)
	{
		 this.method=method;

		 this.keyModified.put("method", 1);

	}

	/**
	 * The method to check if the user has modified the given key
	 * @param key A String representing the key
	 * @return An Integer representing the modification
	 */
	public Integer isKeyModified(String key)
	{
		if((( this.keyModified.containsKey(key))))
		{
			return  this.keyModified.get(key);

		}
		return null;

	}

	/**
	 * The method to mark the given key as modified
	 * @param key A String representing the key
	 * @param modification An Integer representing the modification
	 */
	public void setKeyModified(String key, Integer modification)
	{
		 this.keyModified.put(key, modification);

	}
}