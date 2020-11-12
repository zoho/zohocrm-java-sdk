package com.zoho.crm.api.modules;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class RelatedListProperties implements Model
{
	private String sortBy;

	private List<String> fields;

	private String sortOrder;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of sortBy
	 * @return A String representing the sortBy
	 */
	public String getSortBy()
	{
		return  this.sortBy;

	}

	/**
	 * The method to set the value to sortBy
	 * @param sortBy A String representing the sortBy
	 */
	public void setSortBy(String sortBy)
	{
		 this.sortBy=sortBy;

		 this.keyModified.put("sort_by", 1);

	}

	/**
	 * The method to get the value of fields
	 * @return An instance of List<String>
	 */
	public List<String> getFields()
	{
		return  this.fields;

	}

	/**
	 * The method to set the value to fields
	 * @param fields An instance of List<String>
	 */
	public void setFields(List<String> fields)
	{
		 this.fields=fields;

		 this.keyModified.put("fields", 1);

	}

	/**
	 * The method to get the value of sortOrder
	 * @return A String representing the sortOrder
	 */
	public String getSortOrder()
	{
		return  this.sortOrder;

	}

	/**
	 * The method to set the value to sortOrder
	 * @param sortOrder A String representing the sortOrder
	 */
	public void setSortOrder(String sortOrder)
	{
		 this.sortOrder=sortOrder;

		 this.keyModified.put("sort_order", 1);

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