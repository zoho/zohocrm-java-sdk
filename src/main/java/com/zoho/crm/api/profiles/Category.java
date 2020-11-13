package com.zoho.crm.api.profiles;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class Category implements Model
{
	private String displayLabel;

	private List<String> permissionsDetails;

	private String name;

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
	 * The method to get the value of permissionsDetails
	 * @return An instance of List<String>
	 */
	public List<String> getPermissionsDetails()
	{
		return  this.permissionsDetails;

	}

	/**
	 * The method to set the value to permissionsDetails
	 * @param permissionsDetails An instance of List<String>
	 */
	public void setPermissionsDetails(List<String> permissionsDetails)
	{
		 this.permissionsDetails=permissionsDetails;

		 this.keyModified.put("permissions_details", 1);

	}

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return  this.name;

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.name=name;

		 this.keyModified.put("name", 1);

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