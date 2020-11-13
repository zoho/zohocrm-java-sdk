package com.zoho.crm.api.customviews;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Translation implements Model
{
	private String publicViews;

	private String otherUsersViews;

	private String sharedWithMe;

	private String createdByMe;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of publicViews
	 * @return A String representing the publicViews
	 */
	public String getPublicViews()
	{
		return  this.publicViews;

	}

	/**
	 * The method to set the value to publicViews
	 * @param publicViews A String representing the publicViews
	 */
	public void setPublicViews(String publicViews)
	{
		 this.publicViews=publicViews;

		 this.keyModified.put("public_views", 1);

	}

	/**
	 * The method to get the value of otherUsersViews
	 * @return A String representing the otherUsersViews
	 */
	public String getOtherUsersViews()
	{
		return  this.otherUsersViews;

	}

	/**
	 * The method to set the value to otherUsersViews
	 * @param otherUsersViews A String representing the otherUsersViews
	 */
	public void setOtherUsersViews(String otherUsersViews)
	{
		 this.otherUsersViews=otherUsersViews;

		 this.keyModified.put("other_users_views", 1);

	}

	/**
	 * The method to get the value of sharedWithMe
	 * @return A String representing the sharedWithMe
	 */
	public String getSharedWithMe()
	{
		return  this.sharedWithMe;

	}

	/**
	 * The method to set the value to sharedWithMe
	 * @param sharedWithMe A String representing the sharedWithMe
	 */
	public void setSharedWithMe(String sharedWithMe)
	{
		 this.sharedWithMe=sharedWithMe;

		 this.keyModified.put("shared_with_me", 1);

	}

	/**
	 * The method to get the value of createdByMe
	 * @return A String representing the createdByMe
	 */
	public String getCreatedByMe()
	{
		return  this.createdByMe;

	}

	/**
	 * The method to set the value to createdByMe
	 * @param createdByMe A String representing the createdByMe
	 */
	public void setCreatedByMe(String createdByMe)
	{
		 this.createdByMe=createdByMe;

		 this.keyModified.put("created_by_me", 1);

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