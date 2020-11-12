package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class File implements Model
{
	private Choice<String> status;

	private String name;

	private Integer addedCount;

	private Integer skippedCount;

	private Integer updatedCount;

	private Integer totalCount;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of status
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getStatus()
	{
		return  this.status;

	}

	/**
	 * The method to set the value to status
	 * @param status An instance of Choice<String>
	 */
	public void setStatus(Choice<String> status)
	{
		 this.status=status;

		 this.keyModified.put("status", 1);

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
	 * The method to get the value of addedCount
	 * @return An Integer representing the addedCount
	 */
	public Integer getAddedCount()
	{
		return  this.addedCount;

	}

	/**
	 * The method to set the value to addedCount
	 * @param addedCount An Integer representing the addedCount
	 */
	public void setAddedCount(Integer addedCount)
	{
		 this.addedCount=addedCount;

		 this.keyModified.put("added_count", 1);

	}

	/**
	 * The method to get the value of skippedCount
	 * @return An Integer representing the skippedCount
	 */
	public Integer getSkippedCount()
	{
		return  this.skippedCount;

	}

	/**
	 * The method to set the value to skippedCount
	 * @param skippedCount An Integer representing the skippedCount
	 */
	public void setSkippedCount(Integer skippedCount)
	{
		 this.skippedCount=skippedCount;

		 this.keyModified.put("skipped_count", 1);

	}

	/**
	 * The method to get the value of updatedCount
	 * @return An Integer representing the updatedCount
	 */
	public Integer getUpdatedCount()
	{
		return  this.updatedCount;

	}

	/**
	 * The method to set the value to updatedCount
	 * @param updatedCount An Integer representing the updatedCount
	 */
	public void setUpdatedCount(Integer updatedCount)
	{
		 this.updatedCount=updatedCount;

		 this.keyModified.put("updated_count", 1);

	}

	/**
	 * The method to get the value of totalCount
	 * @return An Integer representing the totalCount
	 */
	public Integer getTotalCount()
	{
		return  this.totalCount;

	}

	/**
	 * The method to set the value to totalCount
	 * @param totalCount An Integer representing the totalCount
	 */
	public void setTotalCount(Integer totalCount)
	{
		 this.totalCount=totalCount;

		 this.keyModified.put("total_count", 1);

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