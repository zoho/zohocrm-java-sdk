package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Unique implements Model
{
	private String casesensitive;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of casesensitive
	 * @return A String representing the casesensitive
	 */
	public String getCasesensitive()
	{
		return  this.casesensitive;

	}

	/**
	 * The method to set the value to casesensitive
	 * @param casesensitive A String representing the casesensitive
	 */
	public void setCasesensitive(String casesensitive)
	{
		 this.casesensitive=casesensitive;

		 this.keyModified.put("casesensitive", 1);

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