package com.zoho.crm.api.currencies;

import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class Currency implements Model
{
	private String symbol;

	private OffsetDateTime createdTime;

	private Boolean isActive;

	private String exchangeRate;

	private Format format;

	private User createdBy;

	private Boolean prefixSymbol;

	private Boolean isBase;

	private OffsetDateTime modifiedTime;

	private String name;

	private User modifiedBy;

	private Long id;

	private String isoCode;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of symbol
	 * @return A String representing the symbol
	 */
	public String getSymbol()
	{
		return  this.symbol;

	}

	/**
	 * The method to set the value to symbol
	 * @param symbol A String representing the symbol
	 */
	public void setSymbol(String symbol)
	{
		 this.symbol=symbol;

		 this.keyModified.put("symbol", 1);

	}

	/**
	 * The method to get the value of createdTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getCreatedTime()
	{
		return  this.createdTime;

	}

	/**
	 * The method to set the value to createdTime
	 * @param createdTime An instance of OffsetDateTime
	 */
	public void setCreatedTime(OffsetDateTime createdTime)
	{
		 this.createdTime=createdTime;

		 this.keyModified.put("created_time", 1);

	}

	/**
	 * The method to get the value of isActive
	 * @return A Boolean representing the isActive
	 */
	public Boolean getIsActive()
	{
		return  this.isActive;

	}

	/**
	 * The method to set the value to isActive
	 * @param isActive A Boolean representing the isActive
	 */
	public void setIsActive(Boolean isActive)
	{
		 this.isActive=isActive;

		 this.keyModified.put("is_active", 1);

	}

	/**
	 * The method to get the value of exchangeRate
	 * @return A String representing the exchangeRate
	 */
	public String getExchangeRate()
	{
		return  this.exchangeRate;

	}

	/**
	 * The method to set the value to exchangeRate
	 * @param exchangeRate A String representing the exchangeRate
	 */
	public void setExchangeRate(String exchangeRate)
	{
		 this.exchangeRate=exchangeRate;

		 this.keyModified.put("exchange_rate", 1);

	}

	/**
	 * The method to get the value of format
	 * @return An instance of Format
	 */
	public Format getFormat()
	{
		return  this.format;

	}

	/**
	 * The method to set the value to format
	 * @param format An instance of Format
	 */
	public void setFormat(Format format)
	{
		 this.format=format;

		 this.keyModified.put("format", 1);

	}

	/**
	 * The method to get the value of createdBy
	 * @return An instance of User
	 */
	public User getCreatedBy()
	{
		return  this.createdBy;

	}

	/**
	 * The method to set the value to createdBy
	 * @param createdBy An instance of User
	 */
	public void setCreatedBy(User createdBy)
	{
		 this.createdBy=createdBy;

		 this.keyModified.put("created_by", 1);

	}

	/**
	 * The method to get the value of prefixSymbol
	 * @return A Boolean representing the prefixSymbol
	 */
	public Boolean getPrefixSymbol()
	{
		return  this.prefixSymbol;

	}

	/**
	 * The method to set the value to prefixSymbol
	 * @param prefixSymbol A Boolean representing the prefixSymbol
	 */
	public void setPrefixSymbol(Boolean prefixSymbol)
	{
		 this.prefixSymbol=prefixSymbol;

		 this.keyModified.put("prefix_symbol", 1);

	}

	/**
	 * The method to get the value of isBase
	 * @return A Boolean representing the isBase
	 */
	public Boolean getIsBase()
	{
		return  this.isBase;

	}

	/**
	 * The method to set the value to isBase
	 * @param isBase A Boolean representing the isBase
	 */
	public void setIsBase(Boolean isBase)
	{
		 this.isBase=isBase;

		 this.keyModified.put("is_base", 1);

	}

	/**
	 * The method to get the value of modifiedTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getModifiedTime()
	{
		return  this.modifiedTime;

	}

	/**
	 * The method to set the value to modifiedTime
	 * @param modifiedTime An instance of OffsetDateTime
	 */
	public void setModifiedTime(OffsetDateTime modifiedTime)
	{
		 this.modifiedTime=modifiedTime;

		 this.keyModified.put("modified_time", 1);

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
	 * The method to get the value of modifiedBy
	 * @return An instance of User
	 */
	public User getModifiedBy()
	{
		return  this.modifiedBy;

	}

	/**
	 * The method to set the value to modifiedBy
	 * @param modifiedBy An instance of User
	 */
	public void setModifiedBy(User modifiedBy)
	{
		 this.modifiedBy=modifiedBy;

		 this.keyModified.put("modified_by", 1);

	}

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
	 * The method to get the value of isoCode
	 * @return A String representing the isoCode
	 */
	public String getIsoCode()
	{
		return  this.isoCode;

	}

	/**
	 * The method to set the value to isoCode
	 * @param isoCode A String representing the isoCode
	 */
	public void setIsoCode(String isoCode)
	{
		 this.isoCode=isoCode;

		 this.keyModified.put("iso_code", 1);

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