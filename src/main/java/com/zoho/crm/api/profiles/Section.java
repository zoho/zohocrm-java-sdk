package com.zoho.crm.api.profiles;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class Section implements Model
{
	private String name;

	private List<Category> categories;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


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
	 * The method to get the value of categories
	 * @return An instance of List<Category>
	 */
	public List<Category> getCategories()
	{
		return  this.categories;

	}

	/**
	 * The method to set the value to categories
	 * @param categories An instance of List<Category>
	 */
	public void setCategories(List<Category> categories)
	{
		 this.categories=categories;

		 this.keyModified.put("categories", 1);

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