package com.zoho.crm.api.org;

import com.zoho.crm.api.util.StreamWrapper;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class FileBodyWrapper implements Model
{
	private StreamWrapper file;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of file
	 * @return An instance of StreamWrapper
	 */
	public StreamWrapper getFile()
	{
		return  this.file;

	}

	/**
	 * The method to set the value to file
	 * @param file An instance of StreamWrapper
	 */
	public void setFile(StreamWrapper file)
	{
		 this.file=file;

		 this.keyModified.put("file", 1);

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