package com.zoho.crm.api.org;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.Map;

public class SuccessResponse implements Model, ActionResponse
{
	private Choice<String> status;

	private Choice<String> code;

	private Choice<String> message;

	private Map<String, Object> details;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of status
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getStatus()
	{
		return  this.status;

	}

	/**
	 * The method to set the value to status
	 * @param status An instance of Choice<String>
	 */
	public void setStatus(Choice<String> status)
	{
		 this.status=status;

		 this.keyModified.put("status", 1);

	}

	/**
	 * The method to get the value of code
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getCode()
	{
		return  this.code;

	}

	/**
	 * The method to set the value to code
	 * @param code An instance of Choice<String>
	 */
	public void setCode(Choice<String> code)
	{
		 this.code=code;

		 this.keyModified.put("code", 1);

	}

	/**
	 * The method to get the value of message
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getMessage()
	{
		return  this.message;

	}

	/**
	 * The method to set the value to message
	 * @param message An instance of Choice<String>
	 */
	public void setMessage(Choice<String> message)
	{
		 this.message=message;

		 this.keyModified.put("message", 1);

	}

	/**
	 * The method to get the value of details
	 * @return An instance of Map<String,Object>
	 */
	public Map<String, Object> getDetails()
	{
		return  this.details;

	}

	/**
	 * The method to set the value to details
	 * @param details An instance of Map<String,Object>
	 */
	public void setDetails(Map<String, Object> details)
	{
		 this.details=details;

		 this.keyModified.put("details", 1);

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