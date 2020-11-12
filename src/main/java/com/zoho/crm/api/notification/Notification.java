package com.zoho.crm.api.notification;

import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notification implements Model
{
	private OffsetDateTime channelExpiry;

	private String resourceUri;

	private String resourceId;

	private String notifyUrl;

	private String resourceName;

	private Long channelId;

	private List<String> events;

	private String token;

	private Boolean notifyOnRelatedAction;

	private Map<String, Object> fields;

	private Boolean deleteevents;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of channelExpiry
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getChannelExpiry()
	{
		return  this.channelExpiry;

	}

	/**
	 * The method to set the value to channelExpiry
	 * @param channelExpiry An instance of OffsetDateTime
	 */
	public void setChannelExpiry(OffsetDateTime channelExpiry)
	{
		 this.channelExpiry=channelExpiry;

		 this.keyModified.put("channel_expiry", 1);

	}

	/**
	 * The method to get the value of resourceUri
	 * @return A String representing the resourceUri
	 */
	public String getResourceUri()
	{
		return  this.resourceUri;

	}

	/**
	 * The method to set the value to resourceUri
	 * @param resourceUri A String representing the resourceUri
	 */
	public void setResourceUri(String resourceUri)
	{
		 this.resourceUri=resourceUri;

		 this.keyModified.put("resource_uri", 1);

	}

	/**
	 * The method to get the value of resourceId
	 * @return A String representing the resourceId
	 */
	public String getResourceId()
	{
		return  this.resourceId;

	}

	/**
	 * The method to set the value to resourceId
	 * @param resourceId A String representing the resourceId
	 */
	public void setResourceId(String resourceId)
	{
		 this.resourceId=resourceId;

		 this.keyModified.put("resource_id", 1);

	}

	/**
	 * The method to get the value of notifyUrl
	 * @return A String representing the notifyUrl
	 */
	public String getNotifyUrl()
	{
		return  this.notifyUrl;

	}

	/**
	 * The method to set the value to notifyUrl
	 * @param notifyUrl A String representing the notifyUrl
	 */
	public void setNotifyUrl(String notifyUrl)
	{
		 this.notifyUrl=notifyUrl;

		 this.keyModified.put("notify_url", 1);

	}

	/**
	 * The method to get the value of resourceName
	 * @return A String representing the resourceName
	 */
	public String getResourceName()
	{
		return  this.resourceName;

	}

	/**
	 * The method to set the value to resourceName
	 * @param resourceName A String representing the resourceName
	 */
	public void setResourceName(String resourceName)
	{
		 this.resourceName=resourceName;

		 this.keyModified.put("resource_name", 1);

	}

	/**
	 * The method to get the value of channelId
	 * @return A Long representing the channelId
	 */
	public Long getChannelId()
	{
		return  this.channelId;

	}

	/**
	 * The method to set the value to channelId
	 * @param channelId A Long representing the channelId
	 */
	public void setChannelId(Long channelId)
	{
		 this.channelId=channelId;

		 this.keyModified.put("channel_id", 1);

	}

	/**
	 * The method to get the value of events
	 * @return An instance of List<String>
	 */
	public List<String> getEvents()
	{
		return  this.events;

	}

	/**
	 * The method to set the value to events
	 * @param events An instance of List<String>
	 */
	public void setEvents(List<String> events)
	{
		 this.events=events;

		 this.keyModified.put("events", 1);

	}

	/**
	 * The method to get the value of token
	 * @return A String representing the token
	 */
	public String getToken()
	{
		return  this.token;

	}

	/**
	 * The method to set the value to token
	 * @param token A String representing the token
	 */
	public void setToken(String token)
	{
		 this.token=token;

		 this.keyModified.put("token", 1);

	}

	/**
	 * The method to get the value of notifyOnRelatedAction
	 * @return A Boolean representing the notifyOnRelatedAction
	 */
	public Boolean getNotifyOnRelatedAction()
	{
		return  this.notifyOnRelatedAction;

	}

	/**
	 * The method to set the value to notifyOnRelatedAction
	 * @param notifyOnRelatedAction A Boolean representing the notifyOnRelatedAction
	 */
	public void setNotifyOnRelatedAction(Boolean notifyOnRelatedAction)
	{
		 this.notifyOnRelatedAction=notifyOnRelatedAction;

		 this.keyModified.put("notify_on_related_action", 1);

	}

	/**
	 * The method to get the value of fields
	 * @return An instance of Map<String,Object>
	 */
	public Map<String, Object> getFields()
	{
		return  this.fields;

	}

	/**
	 * The method to set the value to fields
	 * @param fields An instance of Map<String,Object>
	 */
	public void setFields(Map<String, Object> fields)
	{
		 this.fields=fields;

		 this.keyModified.put("fields", 1);

	}

	/**
	 * The method to get the value of deleteevents
	 * @return A Boolean representing the deleteevents
	 */
	public Boolean getDeleteevents()
	{
		return  this.deleteevents;

	}

	/**
	 * The method to set the value to deleteevents
	 * @param deleteevents A Boolean representing the deleteevents
	 */
	public void setDeleteevents(Boolean deleteevents)
	{
		 this.deleteevents=deleteevents;

		 this.keyModified.put("_delete_events", 1);

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