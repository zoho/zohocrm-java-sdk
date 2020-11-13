package com.zoho.crm.api.bulkread;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class Query implements Model
{
	private String module;

	private String cvid;

	private List<String> fields;

	private Integer page;

	private Criteria criteria;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


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
	 * The method to get the value of cvid
	 * @return A String representing the cvid
	 */
	public String getCvid()
	{
		return  this.cvid;

	}

	/**
	 * The method to set the value to cvid
	 * @param cvid A String representing the cvid
	 */
	public void setCvid(String cvid)
	{
		 this.cvid=cvid;

		 this.keyModified.put("cvid", 1);

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
	 * The method to get the value of page
	 * @return An Integer representing the page
	 */
	public Integer getPage()
	{
		return  this.page;

	}

	/**
	 * The method to set the value to page
	 * @param page An Integer representing the page
	 */
	public void setPage(Integer page)
	{
		 this.page=page;

		 this.keyModified.put("page", 1);

	}

	/**
	 * The method to get the value of criteria
	 * @return An instance of Criteria
	 */
	public Criteria getCriteria()
	{
		return  this.criteria;

	}

	/**
	 * The method to set the value to criteria
	 * @param criteria An instance of Criteria
	 */
	public void setCriteria(Criteria criteria)
	{
		 this.criteria=criteria;

		 this.keyModified.put("criteria", 1);

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