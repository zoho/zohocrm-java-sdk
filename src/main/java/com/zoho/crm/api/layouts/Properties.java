package com.zoho.crm.api.layouts;

import com.zoho.crm.api.fields.ToolTip;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Properties implements Model
{
	private Boolean reorderRows;

	private ToolTip tooltip;

	private Integer maximumRows;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of reorderRows
	 * @return A Boolean representing the reorderRows
	 */
	public Boolean getReorderRows()
	{
		return  this.reorderRows;

	}

	/**
	 * The method to set the value to reorderRows
	 * @param reorderRows A Boolean representing the reorderRows
	 */
	public void setReorderRows(Boolean reorderRows)
	{
		 this.reorderRows=reorderRows;

		 this.keyModified.put("reorder_rows", 1);

	}

	/**
	 * The method to get the value of tooltip
	 * @return An instance of ToolTip
	 */
	public ToolTip getTooltip()
	{
		return  this.tooltip;

	}

	/**
	 * The method to set the value to tooltip
	 * @param tooltip An instance of ToolTip
	 */
	public void setTooltip(ToolTip tooltip)
	{
		 this.tooltip=tooltip;

		 this.keyModified.put("tooltip", 1);

	}

	/**
	 * The method to get the value of maximumRows
	 * @return An Integer representing the maximumRows
	 */
	public Integer getMaximumRows()
	{
		return  this.maximumRows;

	}

	/**
	 * The method to set the value to maximumRows
	 * @param maximumRows An Integer representing the maximumRows
	 */
	public void setMaximumRows(Integer maximumRows)
	{
		 this.maximumRows=maximumRows;

		 this.keyModified.put("maximum_rows", 1);

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