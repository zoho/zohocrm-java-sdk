package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Currency implements Model
{
	private String roundingOption;

	private Integer precision;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of roundingOption
	 * @return A String representing the roundingOption
	 */
	public String getRoundingOption()
	{
		return  this.roundingOption;

	}

	/**
	 * The method to set the value to roundingOption
	 * @param roundingOption A String representing the roundingOption
	 */
	public void setRoundingOption(String roundingOption)
	{
		 this.roundingOption=roundingOption;

		 this.keyModified.put("rounding_option", 1);

	}

	/**
	 * The method to get the value of precision
	 * @return An Integer representing the precision
	 */
	public Integer getPrecision()
	{
		return  this.precision;

	}

	/**
	 * The method to set the value to precision
	 * @param precision An Integer representing the precision
	 */
	public void setPrecision(Integer precision)
	{
		 this.precision=precision;

		 this.keyModified.put("precision", 1);

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