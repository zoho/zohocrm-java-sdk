package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class Crypt implements Model
{
	private String mode;

	private String column;

	private List<String> encfldids;

	private String notify;

	private String table;

	private Integer status;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of mode
	 * @return A String representing the mode
	 */
	public String getMode()
	{
		return  this.mode;

	}

	/**
	 * The method to set the value to mode
	 * @param mode A String representing the mode
	 */
	public void setMode(String mode)
	{
		 this.mode=mode;

		 this.keyModified.put("mode", 1);

	}

	/**
	 * The method to get the value of column
	 * @return A String representing the column
	 */
	public String getColumn()
	{
		return  this.column;

	}

	/**
	 * The method to set the value to column
	 * @param column A String representing the column
	 */
	public void setColumn(String column)
	{
		 this.column=column;

		 this.keyModified.put("column", 1);

	}

	/**
	 * The method to get the value of encfldids
	 * @return An instance of List<String>
	 */
	public List<String> getEncfldids()
	{
		return  this.encfldids;

	}

	/**
	 * The method to set the value to encfldids
	 * @param encfldids An instance of List<String>
	 */
	public void setEncfldids(List<String> encfldids)
	{
		 this.encfldids=encfldids;

		 this.keyModified.put("encFldIds", 1);

	}

	/**
	 * The method to get the value of notify
	 * @return A String representing the notify
	 */
	public String getNotify()
	{
		return  this.notify;

	}

	/**
	 * The method to set the value to notify
	 * @param notify A String representing the notify
	 */
	public void setNotify(String notify)
	{
		 this.notify=notify;

		 this.keyModified.put("notify", 1);

	}

	/**
	 * The method to get the value of table
	 * @return A String representing the table
	 */
	public String getTable()
	{
		return  this.table;

	}

	/**
	 * The method to set the value to table
	 * @param table A String representing the table
	 */
	public void setTable(String table)
	{
		 this.table=table;

		 this.keyModified.put("table", 1);

	}

	/**
	 * The method to get the value of status
	 * @return An Integer representing the status
	 */
	public Integer getStatus()
	{
		return  this.status;

	}

	/**
	 * The method to set the value to status
	 * @param status An Integer representing the status
	 */
	public void setStatus(Integer status)
	{
		 this.status=status;

		 this.keyModified.put("status", 1);

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