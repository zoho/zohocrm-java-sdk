package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.Map;

public class FieldMapping implements Model
{
	private String apiName;

	private Integer index;

	private String format;

	private String findBy;

	private Map<String, Object> defaultValue;

	private String module;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of apiName
	 * @return A String representing the apiName
	 */
	public String getAPIName()
	{
		return  this.apiName;

	}

	/**
	 * The method to set the value to apiName
	 * @param apiName A String representing the apiName
	 */
	public void setAPIName(String apiName)
	{
		 this.apiName=apiName;

		 this.keyModified.put("api_name", 1);

	}

	/**
	 * The method to get the value of index
	 * @return An Integer representing the index
	 */
	public Integer getIndex()
	{
		return  this.index;

	}

	/**
	 * The method to set the value to index
	 * @param index An Integer representing the index
	 */
	public void setIndex(Integer index)
	{
		 this.index=index;

		 this.keyModified.put("index", 1);

	}

	/**
	 * The method to get the value of format
	 * @return A String representing the format
	 */
	public String getFormat()
	{
		return  this.format;

	}

	/**
	 * The method to set the value to format
	 * @param format A String representing the format
	 */
	public void setFormat(String format)
	{
		 this.format=format;

		 this.keyModified.put("format", 1);

	}

	/**
	 * The method to get the value of findBy
	 * @return A String representing the findBy
	 */
	public String getFindBy()
	{
		return  this.findBy;

	}

	/**
	 * The method to set the value to findBy
	 * @param findBy A String representing the findBy
	 */
	public void setFindBy(String findBy)
	{
		 this.findBy=findBy;

		 this.keyModified.put("find_by", 1);

	}

	/**
	 * The method to get the value of defaultValue
	 * @return An instance of Map<String,Object>
	 */
	public Map<String, Object> getDefaultValue()
	{
		return  this.defaultValue;

	}

	/**
	 * The method to set the value to defaultValue
	 * @param defaultValue An instance of Map<String,Object>
	 */
	public void setDefaultValue(Map<String, Object> defaultValue)
	{
		 this.defaultValue=defaultValue;

		 this.keyModified.put("default_value", 1);

	}

	/**
	 * The method to get the value of module
	 * @return A String representing the module
	 */
	public String getModule()
	{
		return  this.module;

	}

	/**
	 * The method to set the value to module
	 * @param module A String representing the module
	 */
	public void setModule(String module)
	{
		 this.module=module;

		 this.keyModified.put("module", 1);

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