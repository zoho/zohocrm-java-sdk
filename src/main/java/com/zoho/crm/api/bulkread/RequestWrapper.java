package com.zoho.crm.api.bulkread;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class RequestWrapper implements Model
{
	private CallBack callback;

	private Query query;

	private Choice<String> fileType;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of callback
	 * @return An instance of CallBack
	 */
	public CallBack getCallback()
	{
		return  this.callback;

	}

	/**
	 * The method to set the value to callback
	 * @param callback An instance of CallBack
	 */
	public void setCallback(CallBack callback)
	{
		 this.callback=callback;

		 this.keyModified.put("callback", 1);

	}

	/**
	 * The method to get the value of query
	 * @return An instance of Query
	 */
	public Query getQuery()
	{
		return  this.query;

	}

	/**
	 * The method to set the value to query
	 * @param query An instance of Query
	 */
	public void setQuery(Query query)
	{
		 this.query=query;

		 this.keyModified.put("query", 1);

	}

	/**
	 * The method to get the value of fileType
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getFileType()
	{
		return  this.fileType;

	}

	/**
	 * The method to set the value to fileType
	 * @param fileType An instance of Choice<String>
	 */
	public void setFileType(Choice<String> fileType)
	{
		 this.fileType=fileType;

		 this.keyModified.put("file_type", 1);

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