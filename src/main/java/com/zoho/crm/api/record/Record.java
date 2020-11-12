package com.zoho.crm.api.record;

import com.zoho.crm.api.tags.Tag;
import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

public class Record implements Model
{
	protected HashMap<String, Object> keyValues=new HashMap<String, Object>();

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of id
	 * @return A Long representing the id
	 */
	public Long getId()
	{
		return (Long) this.getKeyValue("id");

	}

	/**
	 * The method to set the value to id
	 * @param id A Long representing the id
	 */
	public void setId(Long id)
	{
		 this.addKeyValue("id", id);

	}

	/**
	 * The method to get the value of createdBy
	 * @return An instance of User
	 */
	public User getCreatedBy()
	{
		return (User) this.getKeyValue("Created_By");

	}

	/**
	 * The method to set the value to createdBy
	 * @param createdBy An instance of User
	 */
	public void setCreatedBy(User createdBy)
	{
		 this.addKeyValue("Created_By", createdBy);

	}

	/**
	 * The method to get the value of createdTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getCreatedTime()
	{
		return (OffsetDateTime) this.getKeyValue("Created_Time");

	}

	/**
	 * The method to set the value to createdTime
	 * @param createdTime An instance of OffsetDateTime
	 */
	public void setCreatedTime(OffsetDateTime createdTime)
	{
		 this.addKeyValue("Created_Time", createdTime);

	}

	/**
	 * The method to get the value of modifiedBy
	 * @return An instance of User
	 */
	public User getModifiedBy()
	{
		return (User) this.getKeyValue("Modified_By");

	}

	/**
	 * The method to set the value to modifiedBy
	 * @param modifiedBy An instance of User
	 */
	public void setModifiedBy(User modifiedBy)
	{
		 this.addKeyValue("Modified_By", modifiedBy);

	}

	/**
	 * The method to get the value of modifiedTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getModifiedTime()
	{
		return (OffsetDateTime) this.getKeyValue("Modified_Time");

	}

	/**
	 * The method to set the value to modifiedTime
	 * @param modifiedTime An instance of OffsetDateTime
	 */
	public void setModifiedTime(OffsetDateTime modifiedTime)
	{
		 this.addKeyValue("Modified_Time", modifiedTime);

	}

	/**
	 * The method to get the value of tag
	 * @return An instance of List<Tag>
	 */
	public List<Tag> getTag()
	{
		return (List<Tag>) this.getKeyValue("Tag");

	}

	/**
	 * The method to set the value to tag
	 * @param tag An instance of List<Tag>
	 */
	public void setTag(List<Tag> tag)
	{
		 this.addKeyValue("Tag", tag);

	}

	/**
	 * The method to add field value
	 * @param <T> T containing the specified type
	 * @param field An instance of Field<T>
	 * @param value T
	 */
	public <T>void addFieldValue(Field<T> field, T value)
	{
		 this.addKeyValue(field.getAPIName(), value);

	}

	/**
	 * The method to add key value
	 * @param apiName A String representing the apiName
	 * @param value An instance of Object
	 */
	public void addKeyValue(String apiName, Object value)
	{
		 this.keyValues.put(apiName, value);

		 this.keyModified.put(apiName, 1);

	}

	/**
	 * The method to get key value
	 * @param apiName A String representing the apiName
	 * @return An instance of Object
	 */
	public Object getKeyValue(String apiName)
	{
		if((( this.keyValues.containsKey(apiName))))
		{
			return  this.keyValues.get(apiName);

		}
		return null;

	}

	/**
	 * The method to get key values
	 * @return An instance of HashMap<String,Object>
	 */
	public HashMap<String, Object> getKeyValues()
	{
		return  this.keyValues;

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