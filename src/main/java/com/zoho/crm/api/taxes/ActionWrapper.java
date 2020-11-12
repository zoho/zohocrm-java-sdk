package com.zoho.crm.api.taxes;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ActionWrapper implements Model, ActionHandler
{
	private List<ActionResponse> taxes;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of taxes
	 * @return An instance of List<ActionResponse>
	 */
	public List<ActionResponse> getTaxes()
	{
		return  this.taxes;

	}

	/**
	 * The method to set the value to taxes
	 * @param taxes An instance of List<ActionResponse>
	 */
	public void setTaxes(List<ActionResponse> taxes)
	{
		 this.taxes=taxes;

		 this.keyModified.put("taxes", 1);

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