package com.zoho.crm.api.record;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class DeletedRecord implements Model
{
	private User deletedBy;

	private Long id;

	private String displayName;

	private String type;

	private User createdBy;

	private OffsetDateTime deletedTime;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of deletedBy
	 * @return An instance of User
	 */
	public User getDeletedBy()
	{
		return  this.deletedBy;

	}

	/**
	 * The method to set the value to deletedBy
	 * @param deletedBy An instance of User
	 */
	public void setDeletedBy(User deletedBy)
	{
		 this.deletedBy=deletedBy;

		 this.keyModified.put("deleted_by", 1);

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
	 * The method to get the value of displayName
	 * @return A String representing the displayName
	 */
	public String getDisplayName()
	{
		return  this.displayName;

	}

	/**
	 * The method to set the value to displayName
	 * @param displayName A String representing the displayName
	 */
	public void setDisplayName(String displayName)
	{
		 this.displayName=displayName;

		 this.keyModified.put("display_name", 1);

	}

	/**
	 * The method to get the value of type
	 * @return A String representing the type
	 */
	public String getType()
	{
		return  this.type;

	}

	/**
	 * The method to set the value to type
	 * @param type A String representing the type
	 */
	public void setType(String type)
	{
		 this.type=type;

		 this.keyModified.put("type", 1);

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
	 * The method to get the value of deletedTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getDeletedTime()
	{
		return  this.deletedTime;

	}

	/**
	 * The method to set the value to deletedTime
	 * @param deletedTime An instance of OffsetDateTime
	 */
	public void setDeletedTime(OffsetDateTime deletedTime)
	{
		 this.deletedTime=deletedTime;

		 this.keyModified.put("deleted_time", 1);

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