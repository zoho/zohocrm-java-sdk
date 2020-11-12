package com.zoho.crm.api.record;

import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.util.Model;

public class Participants extends Record implements Model
{

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return (String) this.getKeyValue("name");

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.addKeyValue("name", name);

	}

	/**
	 * The method to get the value of email
	 * @return A String representing the email
	 */
	public String getEmail()
	{
		return (String) this.getKeyValue("Email");

	}

	/**
	 * The method to set the value to email
	 * @param email A String representing the email
	 */
	public void setEmail(String email)
	{
		 this.addKeyValue("Email", email);

	}

	/**
	 * The method to get the value of invited
	 * @return A Boolean representing the invited
	 */
	public Boolean getInvited()
	{
		return (Boolean) this.getKeyValue("invited");

	}

	/**
	 * The method to set the value to invited
	 * @param invited A Boolean representing the invited
	 */
	public void setInvited(Boolean invited)
	{
		 this.addKeyValue("invited", invited);

	}

	/**
	 * The method to get the value of type
	 * @return A String representing the type
	 */
	public String getType()
	{
		return (String) this.getKeyValue("type");

	}

	/**
	 * The method to set the value to type
	 * @param type A String representing the type
	 */
	public void setType(String type)
	{
		 this.addKeyValue("type", type);

	}

	/**
	 * The method to get the value of participant
	 * @return A String representing the participant
	 */
	public String getParticipant()
	{
		return (String) this.getKeyValue("participant");

	}

	/**
	 * The method to set the value to participant
	 * @param participant A String representing the participant
	 */
	public void setParticipant(String participant)
	{
		 this.addKeyValue("participant", participant);

	}

	/**
	 * The method to get the value of status
	 * @return A String representing the status
	 */
	public String getStatus()
	{
		return (String) this.getKeyValue("status");

	}

	/**
	 * The method to set the value to status
	 * @param status A String representing the status
	 */
	public void setStatus(String status)
	{
		 this.addKeyValue("status", status);

	}
}