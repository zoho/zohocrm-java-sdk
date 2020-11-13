package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Reminder implements Model
{
	private String period;

	private String unit;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of period
	 * @return A String representing the period
	 */
	public String getPeriod()
	{
		return  this.period;

	}

	/**
	 * The method to set the value to period
	 * @param period A String representing the period
	 */
	public void setPeriod(String period)
	{
		 this.period=period;

		 this.keyModified.put("period", 1);

	}

	/**
	 * The method to get the value of unit
	 * @return A String representing the unit
	 */
	public String getUnit()
	{
		return  this.unit;

	}

	/**
	 * The method to set the value to unit
	 * @param unit A String representing the unit
	 */
	public void setUnit(String unit)
	{
		 this.unit=unit;

		 this.keyModified.put("unit", 1);

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