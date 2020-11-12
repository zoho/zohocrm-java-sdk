package com.zoho.crm.api.tags;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class CountWrapper implements Model, CountHandler
{
	private String count;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of count
	 * @return A String representing the count
	 */
	public String getCount()
	{
		return  this.count;

	}

	/**
	 * The method to set the value to count
	 * @param count A String representing the count
	 */
	public void setCount(String count)
	{
		 this.count=count;

		 this.keyModified.put("count", 1);

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