package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Result implements Model
{
	private String downloadUrl;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of downloadUrl
	 * @return A String representing the downloadUrl
	 */
	public String getDownloadUrl()
	{
		return  this.downloadUrl;

	}

	/**
	 * The method to set the value to downloadUrl
	 * @param downloadUrl A String representing the downloadUrl
	 */
	public void setDownloadUrl(String downloadUrl)
	{
		 this.downloadUrl=downloadUrl;

		 this.keyModified.put("download_url", 1);

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