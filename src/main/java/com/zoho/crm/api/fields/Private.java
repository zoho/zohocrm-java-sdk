package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Private implements Model
{
	private Boolean restricted;

	private Boolean export;

	private String type;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of restricted
	 * @return A Boolean representing the restricted
	 */
	public Boolean getRestricted()
	{
		return  this.restricted;

	}

	/**
	 * The method to set the value to restricted
	 * @param restricted A Boolean representing the restricted
	 */
	public void setRestricted(Boolean restricted)
	{
		 this.restricted=restricted;

		 this.keyModified.put("restricted", 1);

	}

	/**
	 * The method to get the value of export
	 * @return A Boolean representing the export
	 */
	public Boolean getExport()
	{
		return  this.export;

	}

	/**
	 * The method to set the value to export
	 * @param export A Boolean representing the export
	 */
	public void setExport(Boolean export)
	{
		 this.export=export;

		 this.keyModified.put("export", 1);

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