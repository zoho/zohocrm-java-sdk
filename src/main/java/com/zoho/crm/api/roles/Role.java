package com.zoho.crm.api.roles;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Role implements Model
{
	private String displayLabel;

	private User forecastManager;

	private Boolean shareWithPeers;

	private String name;

	private String description;

	private Long id;

	private User reportingTo;

	private Boolean adminUser;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of displayLabel
	 * @return A String representing the displayLabel
	 */
	public String getDisplayLabel()
	{
		return  this.displayLabel;

	}

	/**
	 * The method to set the value to displayLabel
	 * @param displayLabel A String representing the displayLabel
	 */
	public void setDisplayLabel(String displayLabel)
	{
		 this.displayLabel=displayLabel;

		 this.keyModified.put("display_label", 1);

	}

	/**
	 * The method to get the value of forecastManager
	 * @return An instance of User
	 */
	public User getForecastManager()
	{
		return  this.forecastManager;

	}

	/**
	 * The method to set the value to forecastManager
	 * @param forecastManager An instance of User
	 */
	public void setForecastManager(User forecastManager)
	{
		 this.forecastManager=forecastManager;

		 this.keyModified.put("forecast_manager", 1);

	}

	/**
	 * The method to get the value of shareWithPeers
	 * @return A Boolean representing the shareWithPeers
	 */
	public Boolean getShareWithPeers()
	{
		return  this.shareWithPeers;

	}

	/**
	 * The method to set the value to shareWithPeers
	 * @param shareWithPeers A Boolean representing the shareWithPeers
	 */
	public void setShareWithPeers(Boolean shareWithPeers)
	{
		 this.shareWithPeers=shareWithPeers;

		 this.keyModified.put("share_with_peers", 1);

	}

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return  this.name;

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.name=name;

		 this.keyModified.put("name", 1);

	}

	/**
	 * The method to get the value of description
	 * @return A String representing the description
	 */
	public String getDescription()
	{
		return  this.description;

	}

	/**
	 * The method to set the value to description
	 * @param description A String representing the description
	 */
	public void setDescription(String description)
	{
		 this.description=description;

		 this.keyModified.put("description", 1);

	}

	/**
	 * The method to get the value of id
	 * @return A Long representing the id
	 */
	public Long getId()
	{
		return  this.id;

	}

	/**
	 * The method to set the value to id
	 * @param id A Long representing the id
	 */
	public void setId(Long id)
	{
		 this.id=id;

		 this.keyModified.put("id", 1);

	}

	/**
	 * The method to get the value of reportingTo
	 * @return An instance of User
	 */
	public User getReportingTo()
	{
		return  this.reportingTo;

	}

	/**
	 * The method to set the value to reportingTo
	 * @param reportingTo An instance of User
	 */
	public void setReportingTo(User reportingTo)
	{
		 this.reportingTo=reportingTo;

		 this.keyModified.put("reporting_to", 1);

	}

	/**
	 * The method to get the value of adminUser
	 * @return A Boolean representing the adminUser
	 */
	public Boolean getAdminUser()
	{
		return  this.adminUser;

	}

	/**
	 * The method to set the value to adminUser
	 * @param adminUser A Boolean representing the adminUser
	 */
	public void setAdminUser(Boolean adminUser)
	{
		 this.adminUser=adminUser;

		 this.keyModified.put("admin_user", 1);

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