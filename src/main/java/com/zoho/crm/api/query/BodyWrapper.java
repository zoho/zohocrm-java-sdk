package com.zoho.crm.api.query;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class BodyWrapper implements Model
{
	private String selectQuery;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of selectQuery
	 * @return A String representing the selectQuery
	 */
	public String getSelectQuery()
	{
		return  this.selectQuery;

	}

	/**
	 * The method to set the value to selectQuery
	 * @param selectQuery A String representing the selectQuery
	 */
	public void setSelectQuery(String selectQuery)
	{
		 this.selectQuery=selectQuery;

		 this.keyModified.put("select_query", 1);

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