package com.zoho.crm.api.record;

import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.util.Model;

public class LineItemProduct extends Record implements Model
{

	/**
	 * The method to get the value of productCode
	 * @return A String representing the productCode
	 */
	public String getProductCode()
	{
		return (String) this.getKeyValue("Product_Code");

	}

	/**
	 * The method to set the value to productCode
	 * @param productCode A String representing the productCode
	 */
	public void setProductCode(String productCode)
	{
		 this.addKeyValue("Product_Code", productCode);

	}

	/**
	 * The method to get the value of currency
	 * @return A String representing the currency
	 */
	public String getCurrency()
	{
		return (String) this.getKeyValue("Currency");

	}

	/**
	 * The method to set the value to currency
	 * @param currency A String representing the currency
	 */
	public void setCurrency(String currency)
	{
		 this.addKeyValue("Currency", currency);

	}

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return (String) this.getKeyValue("name");

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.addKeyValue("name", name);

	}
}