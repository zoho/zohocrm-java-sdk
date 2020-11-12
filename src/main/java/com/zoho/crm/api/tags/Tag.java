package com.zoho.crm.api.tags;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class Tag implements Model
{
	private OffsetDateTime createdTime;

	private OffsetDateTime modifiedTime;

	private String name;

	private User modifiedBy;

	private Long id;

	private User createdBy;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


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
	 * The method to get the value of modifiedTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getModifiedTime()
	{
		return  this.modifiedTime;

	}

	/**
	 * The method to set the value to modifiedTime
	 * @param modifiedTime An instance of OffsetDateTime
	 */
	public void setModifiedTime(OffsetDateTime modifiedTime)
	{
		 this.modifiedTime=modifiedTime;

		 this.keyModified.put("modified_time", 1);

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
	 * The method to get the value of modifiedBy
	 * @return An instance of User
	 */
	public User getModifiedBy()
	{
		return  this.modifiedBy;

	}

	/**
	 * The method to set the value to modifiedBy
	 * @param modifiedBy An instance of User
	 */
	public void setModifiedBy(User modifiedBy)
	{
		 this.modifiedBy=modifiedBy;

		 this.keyModified.put("modified_by", 1);

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