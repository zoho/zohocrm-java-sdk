package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class MassUpdateBodyWrapper implements Model
{
	private List<Record> data;

	private String cvid;

	private List<Long> ids;

	private Territory territory;

	private Boolean overWrite;

	private List<Criteria> criteria;

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
	 * The method to get the value of cvid
	 * @return A String representing the cvid
	 */
	public String getCvid()
	{
		return  this.cvid;

	}

	/**
	 * The method to set the value to cvid
	 * @param cvid A String representing the cvid
	 */
	public void setCvid(String cvid)
	{
		 this.cvid=cvid;

		 this.keyModified.put("cvid", 1);

	}

	/**
	 * The method to get the value of ids
	 * @return An instance of List<Long>
	 */
	public List<Long> getIds()
	{
		return  this.ids;

	}

	/**
	 * The method to set the value to ids
	 * @param ids An instance of List<Long>
	 */
	public void setIds(List<Long> ids)
	{
		 this.ids=ids;

		 this.keyModified.put("ids", 1);

	}

	/**
	 * The method to get the value of territory
	 * @return An instance of Territory
	 */
	public Territory getTerritory()
	{
		return  this.territory;

	}

	/**
	 * The method to set the value to territory
	 * @param territory An instance of Territory
	 */
	public void setTerritory(Territory territory)
	{
		 this.territory=territory;

		 this.keyModified.put("territory", 1);

	}

	/**
	 * The method to get the value of overWrite
	 * @return A Boolean representing the overWrite
	 */
	public Boolean getOverWrite()
	{
		return  this.overWrite;

	}

	/**
	 * The method to set the value to overWrite
	 * @param overWrite A Boolean representing the overWrite
	 */
	public void setOverWrite(Boolean overWrite)
	{
		 this.overWrite=overWrite;

		 this.keyModified.put("over_write", 1);

	}

	/**
	 * The method to get the value of criteria
	 * @return An instance of List<Criteria>
	 */
	public List<Criteria> getCriteria()
	{
		return  this.criteria;

	}

	/**
	 * The method to set the value to criteria
	 * @param criteria An instance of List<Criteria>
	 */
	public void setCriteria(List<Criteria> criteria)
	{
		 this.criteria=criteria;

		 this.keyModified.put("criteria", 1);

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