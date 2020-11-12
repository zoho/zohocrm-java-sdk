package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class AutoNumber implements Model
{
	private String prefix;

	private String suffix;

	private Integer startNumber;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of prefix
	 * @return A String representing the prefix
	 */
	public String getPrefix()
	{
		return  this.prefix;

	}

	/**
	 * The method to set the value to prefix
	 * @param prefix A String representing the prefix
	 */
	public void setPrefix(String prefix)
	{
		 this.prefix=prefix;

		 this.keyModified.put("prefix", 1);

	}

	/**
	 * The method to get the value of suffix
	 * @return A String representing the suffix
	 */
	public String getSuffix()
	{
		return  this.suffix;

	}

	/**
	 * The method to set the value to suffix
	 * @param suffix A String representing the suffix
	 */
	public void setSuffix(String suffix)
	{
		 this.suffix=suffix;

		 this.keyModified.put("suffix", 1);

	}

	/**
	 * The method to get the value of startNumber
	 * @return An Integer representing the startNumber
	 */
	public Integer getStartNumber()
	{
		return  this.startNumber;

	}

	/**
	 * The method to set the value to startNumber
	 * @param startNumber An Integer representing the startNumber
	 */
	public void setStartNumber(Integer startNumber)
	{
		 this.startNumber=startNumber;

		 this.keyModified.put("start_number", 1);

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