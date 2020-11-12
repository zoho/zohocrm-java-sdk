package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ResponseWrapper implements Model, ResponseHandler
{
	private List<Field> fields;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of fields
	 * @return An instance of List<Field>
	 */
	public List<Field> getFields()
	{
		return  this.fields;

	}

	/**
	 * The method to set the value to fields
	 * @param fields An instance of List<Field>
	 */
	public void setFields(List<Field> fields)
	{
		 this.fields=fields;

		 this.keyModified.put("fields", 1);

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