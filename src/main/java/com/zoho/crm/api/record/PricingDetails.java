package com.zoho.crm.api.record;

import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.util.Model;

public class PricingDetails extends Record implements Model
{

	/**
	 * The method to get the value of toRange
	 * @return An instance of Double
	 */
	public Double getToRange()
	{
		return (Double) this.getKeyValue("to_range");

	}

	/**
	 * The method to set the value to toRange
	 * @param toRange An instance of Double
	 */
	public void setToRange(Double toRange)
	{
		 this.addKeyValue("to_range", toRange);

	}

	/**
	 * The method to get the value of discount
	 * @return An instance of Double
	 */
	public Double getDiscount()
	{
		return (Double) this.getKeyValue("discount");

	}

	/**
	 * The method to set the value to discount
	 * @param discount An instance of Double
	 */
	public void setDiscount(Double discount)
	{
		 this.addKeyValue("discount", discount);

	}

	/**
	 * The method to get the value of fromRange
	 * @return An instance of Double
	 */
	public Double getFromRange()
	{
		return (Double) this.getKeyValue("from_range");

	}

	/**
	 * The method to set the value to fromRange
	 * @param fromRange An instance of Double
	 */
	public void setFromRange(Double fromRange)
	{
		 this.addKeyValue("from_range", fromRange);

	}
}