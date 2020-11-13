package com.zoho.crm.api.sharerecords;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ResponseWrapper implements Model, ResponseHandler
{
	private List<ShareRecord> share;

	private List<User> shareableUser;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of share
	 * @return An instance of List<ShareRecord>
	 */
	public List<ShareRecord> getShare()
	{
		return  this.share;

	}

	/**
	 * The method to set the value to share
	 * @param share An instance of List<ShareRecord>
	 */
	public void setShare(List<ShareRecord> share)
	{
		 this.share=share;

		 this.keyModified.put("share", 1);

	}

	/**
	 * The method to get the value of shareableUser
	 * @return An instance of List<User>
	 */
	public List<User> getShareableUser()
	{
		return  this.shareableUser;

	}

	/**
	 * The method to set the value to shareableUser
	 * @param shareableUser An instance of List<User>
	 */
	public void setShareableUser(List<User> shareableUser)
	{
		 this.shareableUser=shareableUser;

		 this.keyModified.put("shareable_user", 1);

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