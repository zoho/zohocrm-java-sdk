package com.zoho.crm.api.sharerecords;

import com.zoho.crm.api.modules.Module;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class SharedThrough implements Model
{
	private Module module;

	private Long id;

	private String entityName;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


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
	 * The method to get the value of entityName
	 * @return A String representing the entityName
	 */
	public String getEntityName()
	{
		return  this.entityName;

	}

	/**
	 * The method to set the value to entityName
	 * @param entityName A String representing the entityName
	 */
	public void setEntityName(String entityName)
	{
		 this.entityName=entityName;

		 this.keyModified.put("entity_name", 1);

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