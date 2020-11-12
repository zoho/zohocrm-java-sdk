package com.zoho.crm.api.bulkread;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class JobDetail implements Model
{
	private Long id;

	private String operation;

	private Choice<String> state;

	private Query query;

	private User createdBy;

	private OffsetDateTime createdTime;

	private Result result;

	private String fileType;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


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
	 * The method to get the value of operation
	 * @return A String representing the operation
	 */
	public String getOperation()
	{
		return  this.operation;

	}

	/**
	 * The method to set the value to operation
	 * @param operation A String representing the operation
	 */
	public void setOperation(String operation)
	{
		 this.operation=operation;

		 this.keyModified.put("operation", 1);

	}

	/**
	 * The method to get the value of state
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getState()
	{
		return  this.state;

	}

	/**
	 * The method to set the value to state
	 * @param state An instance of Choice<String>
	 */
	public void setState(Choice<String> state)
	{
		 this.state=state;

		 this.keyModified.put("state", 1);

	}

	/**
	 * The method to get the value of query
	 * @return An instance of Query
	 */
	public Query getQuery()
	{
		return  this.query;

	}

	/**
	 * The method to set the value to query
	 * @param query An instance of Query
	 */
	public void setQuery(Query query)
	{
		 this.query=query;

		 this.keyModified.put("query", 1);

	}

	/**
	 * The method to get the value of createdBy
	 * @return An instance of User
	 */
	public User getCreatedBy()
	{
		return  this.createdBy;

	}

	/**
	 * The method to set the value to createdBy
	 * @param createdBy An instance of User
	 */
	public void setCreatedBy(User createdBy)
	{
		 this.createdBy=createdBy;

		 this.keyModified.put("created_by", 1);

	}

	/**
	 * The method to get the value of createdTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getCreatedTime()
	{
		return  this.createdTime;

	}

	/**
	 * The method to set the value to createdTime
	 * @param createdTime An instance of OffsetDateTime
	 */
	public void setCreatedTime(OffsetDateTime createdTime)
	{
		 this.createdTime=createdTime;

		 this.keyModified.put("created_time", 1);

	}

	/**
	 * The method to get the value of result
	 * @return An instance of Result
	 */
	public Result getResult()
	{
		return  this.result;

	}

	/**
	 * The method to set the value to result
	 * @param result An instance of Result
	 */
	public void setResult(Result result)
	{
		 this.result=result;

		 this.keyModified.put("result", 1);

	}

	/**
	 * The method to get the value of fileType
	 * @return A String representing the fileType
	 */
	public String getFileType()
	{
		return  this.fileType;

	}

	/**
	 * The method to set the value to fileType
	 * @param fileType A String representing the fileType
	 */
	public void setFileType(String fileType)
	{
		 this.fileType=fileType;

		 this.keyModified.put("file_type", 1);

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