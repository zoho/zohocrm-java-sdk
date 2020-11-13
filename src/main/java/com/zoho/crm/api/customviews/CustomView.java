package com.zoho.crm.api.customviews;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class CustomView implements Model
{
	private Long id;

	private String name;

	private String systemName;

	private String displayValue;

	private String sharedType;

	private String category;

	private String sortBy;

	private String sortOrder;

	private Integer favorite;

	private Boolean offline;

	private Boolean default1;

	private Boolean systemDefined;

	private Criteria criteria;

	private List<SharedDetails> sharedDetails;

	private List<String> fields;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of id
	 * @return A Long representing the id
	 */
	public Long getId()
	{
		return  this.id;

	}

	/**
	 * The method to set the value to id
	 * @param id A Long representing the id
	 */
	public void setId(Long id)
	{
		 this.id=id;

		 this.keyModified.put("id", 1);

	}

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return  this.name;

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.name=name;

		 this.keyModified.put("name", 1);

	}

	/**
	 * The method to get the value of systemName
	 * @return A String representing the systemName
	 */
	public String getSystemName()
	{
		return  this.systemName;

	}

	/**
	 * The method to set the value to systemName
	 * @param systemName A String representing the systemName
	 */
	public void setSystemName(String systemName)
	{
		 this.systemName=systemName;

		 this.keyModified.put("system_name", 1);

	}

	/**
	 * The method to get the value of displayValue
	 * @return A String representing the displayValue
	 */
	public String getDisplayValue()
	{
		return  this.displayValue;

	}

	/**
	 * The method to set the value to displayValue
	 * @param displayValue A String representing the displayValue
	 */
	public void setDisplayValue(String displayValue)
	{
		 this.displayValue=displayValue;

		 this.keyModified.put("display_value", 1);

	}

	/**
	 * The method to get the value of sharedType
	 * @return A String representing the sharedType
	 */
	public String getSharedType()
	{
		return  this.sharedType;

	}

	/**
	 * The method to set the value to sharedType
	 * @param sharedType A String representing the sharedType
	 */
	public void setSharedType(String sharedType)
	{
		 this.sharedType=sharedType;

		 this.keyModified.put("shared_type", 1);

	}

	/**
	 * The method to get the value of category
	 * @return A String representing the category
	 */
	public String getCategory()
	{
		return  this.category;

	}

	/**
	 * The method to set the value to category
	 * @param category A String representing the category
	 */
	public void setCategory(String category)
	{
		 this.category=category;

		 this.keyModified.put("category", 1);

	}

	/**
	 * The method to get the value of sortBy
	 * @return A String representing the sortBy
	 */
	public String getSortBy()
	{
		return  this.sortBy;

	}

	/**
	 * The method to set the value to sortBy
	 * @param sortBy A String representing the sortBy
	 */
	public void setSortBy(String sortBy)
	{
		 this.sortBy=sortBy;

		 this.keyModified.put("sort_by", 1);

	}

	/**
	 * The method to get the value of sortOrder
	 * @return A String representing the sortOrder
	 */
	public String getSortOrder()
	{
		return  this.sortOrder;

	}

	/**
	 * The method to set the value to sortOrder
	 * @param sortOrder A String representing the sortOrder
	 */
	public void setSortOrder(String sortOrder)
	{
		 this.sortOrder=sortOrder;

		 this.keyModified.put("sort_order", 1);

	}

	/**
	 * The method to get the value of favorite
	 * @return An Integer representing the favorite
	 */
	public Integer getFavorite()
	{
		return  this.favorite;

	}

	/**
	 * The method to set the value to favorite
	 * @param favorite An Integer representing the favorite
	 */
	public void setFavorite(Integer favorite)
	{
		 this.favorite=favorite;

		 this.keyModified.put("favorite", 1);

	}

	/**
	 * The method to get the value of offline
	 * @return A Boolean representing the offline
	 */
	public Boolean getOffline()
	{
		return  this.offline;

	}

	/**
	 * The method to set the value to offline
	 * @param offline A Boolean representing the offline
	 */
	public void setOffline(Boolean offline)
	{
		 this.offline=offline;

		 this.keyModified.put("offline", 1);

	}

	/**
	 * The method to get the value of default
	 * @return A Boolean representing the default1
	 */
	public Boolean getDefault()
	{
		return  this.default1;

	}

	/**
	 * The method to set the value to default
	 * @param default1 A Boolean representing the default1
	 */
	public void setDefault(Boolean default1)
	{
		 this.default1=default1;

		 this.keyModified.put("default", 1);

	}

	/**
	 * The method to get the value of systemDefined
	 * @return A Boolean representing the systemDefined
	 */
	public Boolean getSystemDefined()
	{
		return  this.systemDefined;

	}

	/**
	 * The method to set the value to systemDefined
	 * @param systemDefined A Boolean representing the systemDefined
	 */
	public void setSystemDefined(Boolean systemDefined)
	{
		 this.systemDefined=systemDefined;

		 this.keyModified.put("system_defined", 1);

	}

	/**
	 * The method to get the value of criteria
	 * @return An instance of Criteria
	 */
	public Criteria getCriteria()
	{
		return  this.criteria;

	}

	/**
	 * The method to set the value to criteria
	 * @param criteria An instance of Criteria
	 */
	public void setCriteria(Criteria criteria)
	{
		 this.criteria=criteria;

		 this.keyModified.put("criteria", 1);

	}

	/**
	 * The method to get the value of sharedDetails
	 * @return An instance of List<SharedDetails>
	 */
	public List<SharedDetails> getSharedDetails()
	{
		return  this.sharedDetails;

	}

	/**
	 * The method to set the value to sharedDetails
	 * @param sharedDetails An instance of List<SharedDetails>
	 */
	public void setSharedDetails(List<SharedDetails> sharedDetails)
	{
		 this.sharedDetails=sharedDetails;

		 this.keyModified.put("shared_details", 1);

	}

	/**
	 * The method to get the value of fields
	 * @return An instance of List<String>
	 */
	public List<String> getFields()
	{
		return  this.fields;

	}

	/**
	 * The method to set the value to fields
	 * @param fields An instance of List<String>
	 */
	public void setFields(List<String> fields)
	{
		 this.fields=fields;

		 this.keyModified.put("fields", 1);

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