package com.zoho.crm.api.bulkread;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class Criteria implements Model
{
	private String apiName;

	private Object value;

	private Choice<String> groupOperator;

	private List<Criteria> group;

	private Choice<String> comparator;

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
	 * The method to get the value of value
	 * @return An instance of Object
	 */
	public Object getValue()
	{
		return  this.value;

	}

	/**
	 * The method to set the value to value
	 * @param value An instance of Object
	 */
	public void setValue(Object value)
	{
		 this.value=value;

		 this.keyModified.put("value", 1);

	}

	/**
	 * The method to get the value of groupOperator
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getGroupOperator()
	{
		return  this.groupOperator;

	}

	/**
	 * The method to set the value to groupOperator
	 * @param groupOperator An instance of Choice<String>
	 */
	public void setGroupOperator(Choice<String> groupOperator)
	{
		 this.groupOperator=groupOperator;

		 this.keyModified.put("group_operator", 1);

	}

	/**
	 * The method to get the value of group
	 * @return An instance of List<Criteria>
	 */
	public List<Criteria> getGroup()
	{
		return  this.group;

	}

	/**
	 * The method to set the value to group
	 * @param group An instance of List<Criteria>
	 */
	public void setGroup(List<Criteria> group)
	{
		 this.group=group;

		 this.keyModified.put("group", 1);

	}

	/**
	 * The method to get the value of comparator
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getComparator()
	{
		return  this.comparator;

	}

	/**
	 * The method to set the value to comparator
	 * @param comparator An instance of Choice<String>
	 */
	public void setComparator(Choice<String> comparator)
	{
		 this.comparator=comparator;

		 this.keyModified.put("comparator", 1);

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