package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class RecurringActivity implements Model
{
	private String rrule;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of rrule
	 * @return A String representing the rrule
	 */
	public String getRrule()
	{
		return  this.rrule;

	}

	/**
	 * The method to set the value to rrule
	 * @param rrule A String representing the rrule
	 */
	public void setRrule(String rrule)
	{
		 this.rrule=rrule;

		 this.keyModified.put("RRULE", 1);

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