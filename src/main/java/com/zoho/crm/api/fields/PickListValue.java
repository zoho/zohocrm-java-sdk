package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class PickListValue implements Model
{
	private String displayValue;

	private Integer sequenceNumber;

	private String expectedDataType;

	private List<Object> maps;

	private String actualValue;

	private String sysRefName;

	private String type;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of displayValue
	 * @return A String representing the displayValue
	 */
	public String getDisplayValue()
	{
		return  this.displayValue;

	}

	/**
	 * The method to set the value to displayValue
	 * @param displayValue A String representing the displayValue
	 */
	public void setDisplayValue(String displayValue)
	{
		 this.displayValue=displayValue;

		 this.keyModified.put("display_value", 1);

	}

	/**
	 * The method to get the value of sequenceNumber
	 * @return An Integer representing the sequenceNumber
	 */
	public Integer getSequenceNumber()
	{
		return  this.sequenceNumber;

	}

	/**
	 * The method to set the value to sequenceNumber
	 * @param sequenceNumber An Integer representing the sequenceNumber
	 */
	public void setSequenceNumber(Integer sequenceNumber)
	{
		 this.sequenceNumber=sequenceNumber;

		 this.keyModified.put("sequence_number", 1);

	}

	/**
	 * The method to get the value of expectedDataType
	 * @return A String representing the expectedDataType
	 */
	public String getExpectedDataType()
	{
		return  this.expectedDataType;

	}

	/**
	 * The method to set the value to expectedDataType
	 * @param expectedDataType A String representing the expectedDataType
	 */
	public void setExpectedDataType(String expectedDataType)
	{
		 this.expectedDataType=expectedDataType;

		 this.keyModified.put("expected_data_type", 1);

	}

	/**
	 * The method to get the value of maps
	 * @return An instance of List<Object>
	 */
	public List<Object> getMaps()
	{
		return  this.maps;

	}

	/**
	 * The method to set the value to maps
	 * @param maps An instance of List<Object>
	 */
	public void setMaps(List<Object> maps)
	{
		 this.maps=maps;

		 this.keyModified.put("maps", 1);

	}

	/**
	 * The method to get the value of actualValue
	 * @return A String representing the actualValue
	 */
	public String getActualValue()
	{
		return  this.actualValue;

	}

	/**
	 * The method to set the value to actualValue
	 * @param actualValue A String representing the actualValue
	 */
	public void setActualValue(String actualValue)
	{
		 this.actualValue=actualValue;

		 this.keyModified.put("actual_value", 1);

	}

	/**
	 * The method to get the value of sysRefName
	 * @return A String representing the sysRefName
	 */
	public String getSysRefName()
	{
		return  this.sysRefName;

	}

	/**
	 * The method to set the value to sysRefName
	 * @param sysRefName A String representing the sysRefName
	 */
	public void setSysRefName(String sysRefName)
	{
		 this.sysRefName=sysRefName;

		 this.keyModified.put("sys_ref_name", 1);

	}

	/**
	 * The method to get the value of type
	 * @return A String representing the type
	 */
	public String getType()
	{
		return  this.type;

	}

	/**
	 * The method to set the value to type
	 * @param type A String representing the type
	 */
	public void setType(String type)
	{
		 this.type=type;

		 this.keyModified.put("type", 1);

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