package com.zoho.crm.api.currencies;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class BaseCurrencyActionWrapper implements Model, BaseCurrencyActionHandler
{
	private ActionResponse baseCurrency;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of baseCurrency
	 * @return An instance of ActionResponse
	 */
	public ActionResponse getBaseCurrency()
	{
		return  this.baseCurrency;

	}

	/**
	 * The method to set the value to baseCurrency
	 * @param baseCurrency An instance of ActionResponse
	 */
	public void setBaseCurrency(ActionResponse baseCurrency)
	{
		 this.baseCurrency=baseCurrency;

		 this.keyModified.put("base_currency", 1);

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