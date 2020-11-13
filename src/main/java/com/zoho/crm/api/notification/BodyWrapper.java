package com.zoho.crm.api.notification;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class BodyWrapper implements Model
{
	private List<Notification> watch;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of watch
	 * @return An instance of List<Notification>
	 */
	public List<Notification> getWatch()
	{
		return  this.watch;

	}

	/**
	 * The method to set the value to watch
	 * @param watch An instance of List<Notification>
	 */
	public void setWatch(List<Notification> watch)
	{
		 this.watch=watch;

		 this.keyModified.put("watch", 1);

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