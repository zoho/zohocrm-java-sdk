package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

public class BulkWriteResponse implements Model, ResponseWrapper
{
	private String status;

	private String characterEncoding;

	private List<Resource> resource;

	private Long id;

	private CallBack callback;

	private Result result;

	private User createdBy;

	private String operation;

	private OffsetDateTime createdTime;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of status
	 * @return A String representing the status
	 */
	public String getStatus()
	{
		return  this.status;

	}

	/**
	 * The method to set the value to status
	 * @param status A String representing the status
	 */
	public void setStatus(String status)
	{
		 this.status=status;

		 this.keyModified.put("status", 1);

	}

	/**
	 * The method to get the value of characterEncoding
	 * @return A String representing the characterEncoding
	 */
	public String getCharacterEncoding()
	{
		return  this.characterEncoding;

	}

	/**
	 * The method to set the value to characterEncoding
	 * @param characterEncoding A String representing the characterEncoding
	 */
	public void setCharacterEncoding(String characterEncoding)
	{
		 this.characterEncoding=characterEncoding;

		 this.keyModified.put("character_encoding", 1);

	}

	/**
	 * The method to get the value of resource
	 * @return An instance of List<Resource>
	 */
	public List<Resource> getResource()
	{
		return  this.resource;

	}

	/**
	 * The method to set the value to resource
	 * @param resource An instance of List<Resource>
	 */
	public void setResource(List<Resource> resource)
	{
		 this.resource=resource;

		 this.keyModified.put("resource", 1);

	}

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
	 * The method to get the value of callback
	 * @return An instance of CallBack
	 */
	public CallBack getCallback()
	{
		return  this.callback;

	}

	/**
	 * The method to set the value to callback
	 * @param callback An instance of CallBack
	 */
	public void setCallback(CallBack callback)
	{
		 this.callback=callback;

		 this.keyModified.put("callback", 1);

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