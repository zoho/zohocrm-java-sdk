package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class LeadConverter implements Model
{
	private Boolean overwrite;

	private Boolean notifyLeadOwner;

	private Boolean notifyNewEntityOwner;

	private String accounts;

	private String contacts;

	private String assignTo;

	private Record deals;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of overwrite
	 * @return A Boolean representing the overwrite
	 */
	public Boolean getOverwrite()
	{
		return  this.overwrite;

	}

	/**
	 * The method to set the value to overwrite
	 * @param overwrite A Boolean representing the overwrite
	 */
	public void setOverwrite(Boolean overwrite)
	{
		 this.overwrite=overwrite;

		 this.keyModified.put("overwrite", 1);

	}

	/**
	 * The method to get the value of notifyLeadOwner
	 * @return A Boolean representing the notifyLeadOwner
	 */
	public Boolean getNotifyLeadOwner()
	{
		return  this.notifyLeadOwner;

	}

	/**
	 * The method to set the value to notifyLeadOwner
	 * @param notifyLeadOwner A Boolean representing the notifyLeadOwner
	 */
	public void setNotifyLeadOwner(Boolean notifyLeadOwner)
	{
		 this.notifyLeadOwner=notifyLeadOwner;

		 this.keyModified.put("notify_lead_owner", 1);

	}

	/**
	 * The method to get the value of notifyNewEntityOwner
	 * @return A Boolean representing the notifyNewEntityOwner
	 */
	public Boolean getNotifyNewEntityOwner()
	{
		return  this.notifyNewEntityOwner;

	}

	/**
	 * The method to set the value to notifyNewEntityOwner
	 * @param notifyNewEntityOwner A Boolean representing the notifyNewEntityOwner
	 */
	public void setNotifyNewEntityOwner(Boolean notifyNewEntityOwner)
	{
		 this.notifyNewEntityOwner=notifyNewEntityOwner;

		 this.keyModified.put("notify_new_entity_owner", 1);

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
	 * The method to get the value of assignTo
	 * @return A String representing the assignTo
	 */
	public String getAssignTo()
	{
		return  this.assignTo;

	}

	/**
	 * The method to set the value to assignTo
	 * @param assignTo A String representing the assignTo
	 */
	public void setAssignTo(String assignTo)
	{
		 this.assignTo=assignTo;

		 this.keyModified.put("assign_to", 1);

	}

	/**
	 * The method to get the value of deals
	 * @return An instance of Record
	 */
	public Record getDeals()
	{
		return  this.deals;

	}

	/**
	 * The method to set the value to deals
	 * @param deals An instance of Record
	 */
	public void setDeals(Record deals)
	{
		 this.deals=deals;

		 this.keyModified.put("Deals", 1);

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