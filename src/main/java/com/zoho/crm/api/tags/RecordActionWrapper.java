package com.zoho.crm.api.tags;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class RecordActionWrapper implements Model, RecordActionHandler
{
	private List<RecordActionResponse> data;

	private Boolean wfScheduler;

	private String successCount;

	private Integer lockedCount;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of data
	 * @return An instance of List<RecordActionResponse>
	 */
	public List<RecordActionResponse> getData()
	{
		return  this.data;

	}

	/**
	 * The method to set the value to data
	 * @param data An instance of List<RecordActionResponse>
	 */
	public void setData(List<RecordActionResponse> data)
	{
		 this.data=data;

		 this.keyModified.put("data", 1);

	}

	/**
	 * The method to get the value of wfScheduler
	 * @return A Boolean representing the wfScheduler
	 */
	public Boolean getWfScheduler()
	{
		return  this.wfScheduler;

	}

	/**
	 * The method to set the value to wfScheduler
	 * @param wfScheduler A Boolean representing the wfScheduler
	 */
	public void setWfScheduler(Boolean wfScheduler)
	{
		 this.wfScheduler=wfScheduler;

		 this.keyModified.put("wf_scheduler", 1);

	}

	/**
	 * The method to get the value of successCount
	 * @return A String representing the successCount
	 */
	public String getSuccessCount()
	{
		return  this.successCount;

	}

	/**
	 * The method to set the value to successCount
	 * @param successCount A String representing the successCount
	 */
	public void setSuccessCount(String successCount)
	{
		 this.successCount=successCount;

		 this.keyModified.put("success_count", 1);

	}

	/**
	 * The method to get the value of lockedCount
	 * @return An Integer representing the lockedCount
	 */
	public Integer getLockedCount()
	{
		return  this.lockedCount;

	}

	/**
	 * The method to set the value to lockedCount
	 * @param lockedCount An Integer representing the lockedCount
	 */
	public void setLockedCount(Integer lockedCount)
	{
		 this.lockedCount=lockedCount;

		 this.keyModified.put("locked_count", 1);

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