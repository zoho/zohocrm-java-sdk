package com.zoho.crm.api.sharerecords;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class ShareRecord implements Model
{
	private Boolean shareRelatedRecords;

	private SharedThrough sharedThrough;

	private OffsetDateTime sharedTime;

	private String permission;

	private User sharedBy;

	private User user;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of shareRelatedRecords
	 * @return A Boolean representing the shareRelatedRecords
	 */
	public Boolean getShareRelatedRecords()
	{
		return  this.shareRelatedRecords;

	}

	/**
	 * The method to set the value to shareRelatedRecords
	 * @param shareRelatedRecords A Boolean representing the shareRelatedRecords
	 */
	public void setShareRelatedRecords(Boolean shareRelatedRecords)
	{
		 this.shareRelatedRecords=shareRelatedRecords;

		 this.keyModified.put("share_related_records", 1);

	}

	/**
	 * The method to get the value of sharedThrough
	 * @return An instance of SharedThrough
	 */
	public SharedThrough getSharedThrough()
	{
		return  this.sharedThrough;

	}

	/**
	 * The method to set the value to sharedThrough
	 * @param sharedThrough An instance of SharedThrough
	 */
	public void setSharedThrough(SharedThrough sharedThrough)
	{
		 this.sharedThrough=sharedThrough;

		 this.keyModified.put("shared_through", 1);

	}

	/**
	 * The method to get the value of sharedTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getSharedTime()
	{
		return  this.sharedTime;

	}

	/**
	 * The method to set the value to sharedTime
	 * @param sharedTime An instance of OffsetDateTime
	 */
	public void setSharedTime(OffsetDateTime sharedTime)
	{
		 this.sharedTime=sharedTime;

		 this.keyModified.put("shared_time", 1);

	}

	/**
	 * The method to get the value of permission
	 * @return A String representing the permission
	 */
	public String getPermission()
	{
		return  this.permission;

	}

	/**
	 * The method to set the value to permission
	 * @param permission A String representing the permission
	 */
	public void setPermission(String permission)
	{
		 this.permission=permission;

		 this.keyModified.put("permission", 1);

	}

	/**
	 * The method to get the value of sharedBy
	 * @return An instance of User
	 */
	public User getSharedBy()
	{
		return  this.sharedBy;

	}

	/**
	 * The method to set the value to sharedBy
	 * @param sharedBy An instance of User
	 */
	public void setSharedBy(User sharedBy)
	{
		 this.sharedBy=sharedBy;

		 this.keyModified.put("shared_by", 1);

	}

	/**
	 * The method to get the value of user
	 * @return An instance of User
	 */
	public User getUser()
	{
		return  this.user;

	}

	/**
	 * The method to set the value to user
	 * @param user An instance of User
	 */
	public void setUser(User user)
	{
		 this.user=user;

		 this.keyModified.put("user", 1);

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