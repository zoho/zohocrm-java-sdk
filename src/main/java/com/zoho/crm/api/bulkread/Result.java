package com.zoho.crm.api.bulkread;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Result implements Model
{
	private Integer page;

	private Integer count;

	private String downloadUrl;

	private Integer perPage;

	private Boolean moreRecords;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


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
	 * The method to get the value of downloadUrl
	 * @return A String representing the downloadUrl
	 */
	public String getDownloadUrl()
	{
		return  this.downloadUrl;

	}

	/**
	 * The method to set the value to downloadUrl
	 * @param downloadUrl A String representing the downloadUrl
	 */
	public void setDownloadUrl(String downloadUrl)
	{
		 this.downloadUrl=downloadUrl;

		 this.keyModified.put("download_url", 1);

	}

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