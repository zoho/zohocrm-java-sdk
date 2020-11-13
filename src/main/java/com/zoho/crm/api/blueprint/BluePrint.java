package com.zoho.crm.api.blueprint;

import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class BluePrint implements Model
{
	private Long transitionId;

	private Record data;

	private ProcessInfo processInfo;

	private List<Transition> transitions;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of transitionId
	 * @return A Long representing the transitionId
	 */
	public Long getTransitionId()
	{
		return  this.transitionId;

	}

	/**
	 * The method to set the value to transitionId
	 * @param transitionId A Long representing the transitionId
	 */
	public void setTransitionId(Long transitionId)
	{
		 this.transitionId=transitionId;

		 this.keyModified.put("transition_id", 1);

	}

	/**
	 * The method to get the value of data
	 * @return An instance of Record
	 */
	public Record getData()
	{
		return  this.data;

	}

	/**
	 * The method to set the value to data
	 * @param data An instance of Record
	 */
	public void setData(Record data)
	{
		 this.data=data;

		 this.keyModified.put("data", 1);

	}

	/**
	 * The method to get the value of processInfo
	 * @return An instance of ProcessInfo
	 */
	public ProcessInfo getProcessInfo()
	{
		return  this.processInfo;

	}

	/**
	 * The method to set the value to processInfo
	 * @param processInfo An instance of ProcessInfo
	 */
	public void setProcessInfo(ProcessInfo processInfo)
	{
		 this.processInfo=processInfo;

		 this.keyModified.put("process_info", 1);

	}

	/**
	 * The method to get the value of transitions
	 * @return An instance of List<Transition>
	 */
	public List<Transition> getTransitions()
	{
		return  this.transitions;

	}

	/**
	 * The method to set the value to transitions
	 * @param transitions An instance of List<Transition>
	 */
	public void setTransitions(List<Transition> transitions)
	{
		 this.transitions=transitions;

		 this.keyModified.put("transitions", 1);

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