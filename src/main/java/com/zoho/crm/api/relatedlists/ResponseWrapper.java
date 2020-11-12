package com.zoho.crm.api.relatedlists;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ResponseWrapper implements Model, ResponseHandler
{
	private List<RelatedList> relatedLists;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of relatedLists
	 * @return An instance of List<RelatedList>
	 */
	public List<RelatedList> getRelatedLists()
	{
		return  this.relatedLists;

	}

	/**
	 * The method to set the value to relatedLists
	 * @param relatedLists An instance of List<RelatedList>
	 */
	public void setRelatedLists(List<RelatedList> relatedLists)
	{
		 this.relatedLists=relatedLists;

		 this.keyModified.put("related_lists", 1);

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