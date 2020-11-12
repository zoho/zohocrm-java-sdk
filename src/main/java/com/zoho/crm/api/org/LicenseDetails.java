package com.zoho.crm.api.org;

import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class LicenseDetails implements Model
{
	private OffsetDateTime paidExpiry;

	private Long usersLicensePurchased;

	private String trialType;

	private String trialExpiry;

	private Boolean paid;

	private String paidType;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of paidExpiry
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getPaidExpiry()
	{
		return  this.paidExpiry;

	}

	/**
	 * The method to set the value to paidExpiry
	 * @param paidExpiry An instance of OffsetDateTime
	 */
	public void setPaidExpiry(OffsetDateTime paidExpiry)
	{
		 this.paidExpiry=paidExpiry;

		 this.keyModified.put("paid_expiry", 1);

	}

	/**
	 * The method to get the value of usersLicensePurchased
	 * @return A Long representing the usersLicensePurchased
	 */
	public Long getUsersLicensePurchased()
	{
		return  this.usersLicensePurchased;

	}

	/**
	 * The method to set the value to usersLicensePurchased
	 * @param usersLicensePurchased A Long representing the usersLicensePurchased
	 */
	public void setUsersLicensePurchased(Long usersLicensePurchased)
	{
		 this.usersLicensePurchased=usersLicensePurchased;

		 this.keyModified.put("users_license_purchased", 1);

	}

	/**
	 * The method to get the value of trialType
	 * @return A String representing the trialType
	 */
	public String getTrialType()
	{
		return  this.trialType;

	}

	/**
	 * The method to set the value to trialType
	 * @param trialType A String representing the trialType
	 */
	public void setTrialType(String trialType)
	{
		 this.trialType=trialType;

		 this.keyModified.put("trial_type", 1);

	}

	/**
	 * The method to get the value of trialExpiry
	 * @return A String representing the trialExpiry
	 */
	public String getTrialExpiry()
	{
		return  this.trialExpiry;

	}

	/**
	 * The method to set the value to trialExpiry
	 * @param trialExpiry A String representing the trialExpiry
	 */
	public void setTrialExpiry(String trialExpiry)
	{
		 this.trialExpiry=trialExpiry;

		 this.keyModified.put("trial_expiry", 1);

	}

	/**
	 * The method to get the value of paid
	 * @return A Boolean representing the paid
	 */
	public Boolean getPaid()
	{
		return  this.paid;

	}

	/**
	 * The method to set the value to paid
	 * @param paid A Boolean representing the paid
	 */
	public void setPaid(Boolean paid)
	{
		 this.paid=paid;

		 this.keyModified.put("paid", 1);

	}

	/**
	 * The method to get the value of paidType
	 * @return A String representing the paidType
	 */
	public String getPaidType()
	{
		return  this.paidType;

	}

	/**
	 * The method to set the value to paidType
	 * @param paidType A String representing the paidType
	 */
	public void setPaidType(String paidType)
	{
		 this.paidType=paidType;

		 this.keyModified.put("paid_type", 1);

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