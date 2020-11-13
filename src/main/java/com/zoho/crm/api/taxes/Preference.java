package com.zoho.crm.api.taxes;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Preference implements Model
{
	private Boolean autoPopulateTax;

	private Boolean modifyTaxRates;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of autoPopulateTax
	 * @return A Boolean representing the autoPopulateTax
	 */
	public Boolean getAutoPopulateTax()
	{
		return  this.autoPopulateTax;

	}

	/**
	 * The method to set the value to autoPopulateTax
	 * @param autoPopulateTax A Boolean representing the autoPopulateTax
	 */
	public void setAutoPopulateTax(Boolean autoPopulateTax)
	{
		 this.autoPopulateTax=autoPopulateTax;

		 this.keyModified.put("auto_populate_tax", 1);

	}

	/**
	 * The method to get the value of modifyTaxRates
	 * @return A Boolean representing the modifyTaxRates
	 */
	public Boolean getModifyTaxRates()
	{
		return  this.modifyTaxRates;

	}

	/**
	 * The method to set the value to modifyTaxRates
	 * @param modifyTaxRates A Boolean representing the modifyTaxRates
	 */
	public void setModifyTaxRates(Boolean modifyTaxRates)
	{
		 this.modifyTaxRates=modifyTaxRates;

		 this.keyModified.put("modify_tax_rates", 1);

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