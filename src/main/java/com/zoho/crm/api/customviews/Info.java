package com.zoho.crm.api.customviews;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Info implements Model
{
	private Integer perPage;

	private String default1;

	private Integer count;

	private Integer page;

	private Boolean moreRecords;

	private Translation translation;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of perPage
	 * @return An Integer representing the perPage
	 */
	public Integer getPerPage()
	{
		return  this.perPage;

	}

	/**
	 * The method to set the value to perPage
	 * @param perPage An Integer representing the perPage
	 */
	public void setPerPage(Integer perPage)
	{
		 this.perPage=perPage;

		 this.keyModified.put("per_page", 1);

	}

	/**
	 * The method to get the value of default
	 * @return A String representing the default1
	 */
	public String getDefault()
	{
		return  this.default1;

	}

	/**
	 * The method to set the value to default
	 * @param default1 A String representing the default1
	 */
	public void setDefault(String default1)
	{
		 this.default1=default1;

		 this.keyModified.put("default", 1);

	}

	/**
	 * The method to get the value of count
	 * @return An Integer representing the count
	 */
	public Integer getCount()
	{
		return  this.count;

	}

	/**
	 * The method to set the value to count
	 * @param count An Integer representing the count
	 */
	public void setCount(Integer count)
	{
		 this.count=count;

		 this.keyModified.put("count", 1);

	}

	/**
	 * The method to get the value of page
	 * @return An Integer representing the page
	 */
	public Integer getPage()
	{
		return  this.page;

	}

	/**
	 * The method to set the value to page
	 * @param page An Integer representing the page
	 */
	public void setPage(Integer page)
	{
		 this.page=page;

		 this.keyModified.put("page", 1);

	}

	/**
	 * The method to get the value of moreRecords
	 * @return A Boolean representing the moreRecords
	 */
	public Boolean getMoreRecords()
	{
		return  this.moreRecords;

	}

	/**
	 * The method to set the value to moreRecords
	 * @param moreRecords A Boolean representing the moreRecords
	 */
	public void setMoreRecords(Boolean moreRecords)
	{
		 this.moreRecords=moreRecords;

		 this.keyModified.put("more_records", 1);

	}

	/**
	 * The method to get the value of translation
	 * @return An instance of Translation
	 */
	public Translation getTranslation()
	{
		return  this.translation;

	}

	/**
	 * The method to set the value to translation
	 * @param translation An instance of Translation
	 */
	public void setTranslation(Translation translation)
	{
		 this.translation=translation;

		 this.keyModified.put("translation", 1);

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