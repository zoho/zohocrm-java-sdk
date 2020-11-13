package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class RequestWrapper implements Model
{
	private String characterEncoding;

	private Choice<String> operation;

	private CallBack callback;

	private List<Resource> resource;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of characterEncoding
	 * @return A String representing the characterEncoding
	 */
	public String getCharacterEncoding()
	{
		return  this.characterEncoding;

	}

	/**
	 * The method to set the value to characterEncoding
	 * @param characterEncoding A String representing the characterEncoding
	 */
	public void setCharacterEncoding(String characterEncoding)
	{
		 this.characterEncoding=characterEncoding;

		 this.keyModified.put("character_encoding", 1);

	}

	/**
	 * The method to get the value of operation
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getOperation()
	{
		return  this.operation;

	}

	/**
	 * The method to set the value to operation
	 * @param operation An instance of Choice<String>
	 */
	public void setOperation(Choice<String> operation)
	{
		 this.operation=operation;

		 this.keyModified.put("operation", 1);

	}

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
	 * The method to get the value of resource
	 * @return An instance of List<Resource>
	 */
	public List<Resource> getResource()
	{
		return  this.resource;

	}

	/**
	 * The method to set the value to resource
	 * @param resource An instance of List<Resource>
	 */
	public void setResource(List<Resource> resource)
	{
		 this.resource=resource;

		 this.keyModified.put("resource", 1);

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