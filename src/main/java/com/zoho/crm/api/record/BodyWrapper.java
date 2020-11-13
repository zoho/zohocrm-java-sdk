package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class BodyWrapper implements Model
{
	private List<Record> data;

	private List<String> trigger;

	private List<String> process;

	private List<String> duplicateCheckFields;

	private String wfTrigger;

	private String larId;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of data
	 * @return An instance of List<Record>
	 */
	public List<Record> getData()
	{
		return  this.data;

	}

	/**
	 * The method to set the value to data
	 * @param data An instance of List<Record>
	 */
	public void setData(List<Record> data)
	{
		 this.data=data;

		 this.keyModified.put("data", 1);

	}

	/**
	 * The method to get the value of trigger
	 * @return An instance of List<String>
	 */
	public List<String> getTrigger()
	{
		return  this.trigger;

	}

	/**
	 * The method to set the value to trigger
	 * @param trigger An instance of List<String>
	 */
	public void setTrigger(List<String> trigger)
	{
		 this.trigger=trigger;

		 this.keyModified.put("trigger", 1);

	}

	/**
	 * The method to get the value of process
	 * @return An instance of List<String>
	 */
	public List<String> getProcess()
	{
		return  this.process;

	}

	/**
	 * The method to set the value to process
	 * @param process An instance of List<String>
	 */
	public void setProcess(List<String> process)
	{
		 this.process=process;

		 this.keyModified.put("process", 1);

	}

	/**
	 * The method to get the value of duplicateCheckFields
	 * @return An instance of List<String>
	 */
	public List<String> getDuplicateCheckFields()
	{
		return  this.duplicateCheckFields;

	}

	/**
	 * The method to set the value to duplicateCheckFields
	 * @param duplicateCheckFields An instance of List<String>
	 */
	public void setDuplicateCheckFields(List<String> duplicateCheckFields)
	{
		 this.duplicateCheckFields=duplicateCheckFields;

		 this.keyModified.put("duplicate_check_fields", 1);

	}

	/**
	 * The method to get the value of wfTrigger
	 * @return A String representing the wfTrigger
	 */
	public String getWfTrigger()
	{
		return  this.wfTrigger;

	}

	/**
	 * The method to set the value to wfTrigger
	 * @param wfTrigger A String representing the wfTrigger
	 */
	public void setWfTrigger(String wfTrigger)
	{
		 this.wfTrigger=wfTrigger;

		 this.keyModified.put("wf_trigger", 1);

	}

	/**
	 * The method to get the value of larId
	 * @return A String representing the larId
	 */
	public String getLarId()
	{
		return  this.larId;

	}

	/**
	 * The method to set the value to larId
	 * @param larId A String representing the larId
	 */
	public void setLarId(String larId)
	{
		 this.larId=larId;

		 this.keyModified.put("lar_id", 1);

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