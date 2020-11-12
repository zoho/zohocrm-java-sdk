package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class ViewType implements Model
{
	private Boolean view;

	private Boolean edit;

	private Boolean create;

	private Boolean quickCreate;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of view
	 * @return A Boolean representing the view
	 */
	public Boolean getView()
	{
		return  this.view;

	}

	/**
	 * The method to set the value to view
	 * @param view A Boolean representing the view
	 */
	public void setView(Boolean view)
	{
		 this.view=view;

		 this.keyModified.put("view", 1);

	}

	/**
	 * The method to get the value of edit
	 * @return A Boolean representing the edit
	 */
	public Boolean getEdit()
	{
		return  this.edit;

	}

	/**
	 * The method to set the value to edit
	 * @param edit A Boolean representing the edit
	 */
	public void setEdit(Boolean edit)
	{
		 this.edit=edit;

		 this.keyModified.put("edit", 1);

	}

	/**
	 * The method to get the value of create
	 * @return A Boolean representing the create
	 */
	public Boolean getCreate()
	{
		return  this.create;

	}

	/**
	 * The method to set the value to create
	 * @param create A Boolean representing the create
	 */
	public void setCreate(Boolean create)
	{
		 this.create=create;

		 this.keyModified.put("create", 1);

	}

	/**
	 * The method to get the value of quickCreate
	 * @return A Boolean representing the quickCreate
	 */
	public Boolean getQuickCreate()
	{
		return  this.quickCreate;

	}

	/**
	 * The method to set the value to quickCreate
	 * @param quickCreate A Boolean representing the quickCreate
	 */
	public void setQuickCreate(Boolean quickCreate)
	{
		 this.quickCreate=quickCreate;

		 this.keyModified.put("quick_create", 1);

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