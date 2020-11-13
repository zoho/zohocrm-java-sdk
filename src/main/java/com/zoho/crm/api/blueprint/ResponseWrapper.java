package com.zoho.crm.api.blueprint;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class ResponseWrapper implements Model, ResponseHandler
{
	private BluePrint blueprint;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of blueprint
	 * @return An instance of BluePrint
	 */
	public BluePrint getBlueprint()
	{
		return  this.blueprint;

	}

	/**
	 * The method to set the value to blueprint
	 * @param blueprint An instance of BluePrint
	 */
	public void setBlueprint(BluePrint blueprint)
	{
		 this.blueprint=blueprint;

		 this.keyModified.put("blueprint", 1);

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