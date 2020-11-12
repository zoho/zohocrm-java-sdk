package com.zoho.crm.api.roles;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ResponseWrapper implements Model, ResponseHandler
{
	private List<Role> roles;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of roles
	 * @return An instance of List<Role>
	 */
	public List<Role> getRoles()
	{
		return  this.roles;

	}

	/**
	 * The method to set the value to roles
	 * @param roles An instance of List<Role>
	 */
	public void setRoles(List<Role> roles)
	{
		 this.roles=roles;

		 this.keyModified.put("roles", 1);

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