package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class SuccessfulConvert implements Model, ConvertActionResponse
{
	private String contacts;

	private String deals;

	private String accounts;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of contacts
	 * @return A String representing the contacts
	 */
	public String getContacts()
	{
		return  this.contacts;

	}

	/**
	 * The method to set the value to contacts
	 * @param contacts A String representing the contacts
	 */
	public void setContacts(String contacts)
	{
		 this.contacts=contacts;

		 this.keyModified.put("Contacts", 1);

	}

	/**
	 * The method to get the value of deals
	 * @return A String representing the deals
	 */
	public String getDeals()
	{
		return  this.deals;

	}

	/**
	 * The method to set the value to deals
	 * @param deals A String representing the deals
	 */
	public void setDeals(String deals)
	{
		 this.deals=deals;

		 this.keyModified.put("Deals", 1);

	}

	/**
	 * The method to get the value of accounts
	 * @return A String representing the accounts
	 */
	public String getAccounts()
	{
		return  this.accounts;

	}

	/**
	 * The method to set the value to accounts
	 * @param accounts A String representing the accounts
	 */
	public void setAccounts(String accounts)
	{
		 this.accounts=accounts;

		 this.keyModified.put("Accounts", 1);

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