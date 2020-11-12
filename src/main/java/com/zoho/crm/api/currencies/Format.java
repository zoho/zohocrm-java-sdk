package com.zoho.crm.api.currencies;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Format implements Model
{
	private Choice<String> decimalSeparator;

	private Choice<String> thousandSeparator;

	private Choice<String> decimalPlaces;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of decimalSeparator
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getDecimalSeparator()
	{
		return  this.decimalSeparator;

	}

	/**
	 * The method to set the value to decimalSeparator
	 * @param decimalSeparator An instance of Choice<String>
	 */
	public void setDecimalSeparator(Choice<String> decimalSeparator)
	{
		 this.decimalSeparator=decimalSeparator;

		 this.keyModified.put("decimal_separator", 1);

	}

	/**
	 * The method to get the value of thousandSeparator
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getThousandSeparator()
	{
		return  this.thousandSeparator;

	}

	/**
	 * The method to set the value to thousandSeparator
	 * @param thousandSeparator An instance of Choice<String>
	 */
	public void setThousandSeparator(Choice<String> thousandSeparator)
	{
		 this.thousandSeparator=thousandSeparator;

		 this.keyModified.put("thousand_separator", 1);

	}

	/**
	 * The method to get the value of decimalPlaces
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getDecimalPlaces()
	{
		return  this.decimalPlaces;

	}

	/**
	 * The method to set the value to decimalPlaces
	 * @param decimalPlaces An instance of Choice<String>
	 */
	public void setDecimalPlaces(Choice<String> decimalPlaces)
	{
		 this.decimalPlaces=decimalPlaces;

		 this.keyModified.put("decimal_places", 1);

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