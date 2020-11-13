package com.zoho.crm.api.customviews;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Range implements Model
{
	private Integer from;

	private Integer to;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of from
	 * @return An Integer representing the from
	 */
	public Integer getFrom()
	{
		return  this.from;

	}

	/**
	 * The method to set the value to from
	 * @param from An Integer representing the from
	 */
	public void setFrom(Integer from)
	{
		 this.from=from;

		 this.keyModified.put("from", 1);

	}

	/**
	 * The method to get the value of to
	 * @return An Integer representing the to
	 */
	public Integer getTo()
	{
		return  this.to;

	}

	/**
	 * The method to set the value to to
	 * @param to An Integer representing the to
	 */
	public void setTo(Integer to)
	{
		 this.to=to;

		 this.keyModified.put("to", 1);

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