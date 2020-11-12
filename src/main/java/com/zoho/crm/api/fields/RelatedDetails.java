package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class RelatedDetails implements Model
{
	private String displayLabel;

	private String apiName;

	private Module module;

	private Long id;

	private String type;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of displayLabel
	 * @return A String representing the displayLabel
	 */
	public String getDisplayLabel()
	{
		return  this.displayLabel;

	}

	/**
	 * The method to set the value to displayLabel
	 * @param displayLabel A String representing the displayLabel
	 */
	public void setDisplayLabel(String displayLabel)
	{
		 this.displayLabel=displayLabel;

		 this.keyModified.put("display_label", 1);

	}

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
	 * The method to get the value of module
	 * @return An instance of Module
	 */
	public Module getModule()
	{
		return  this.module;

	}

	/**
	 * The method to set the value to module
	 * @param module An instance of Module
	 */
	public void setModule(Module module)
	{
		 this.module=module;

		 this.keyModified.put("module", 1);

	}

	/**
	 * The method to get the value of id
	 * @return A Long representing the id
	 */
	public Long getId()
	{
		return  this.id;

	}

	/**
	 * The method to set the value to id
	 * @param id A Long representing the id
	 */
	public void setId(Long id)
	{
		 this.id=id;

		 this.keyModified.put("id", 1);

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

		 this.keyModified.put("_type", 1);

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