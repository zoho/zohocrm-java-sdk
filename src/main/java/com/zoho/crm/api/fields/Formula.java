package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Formula implements Model
{
	private String returnType;

	private String expression;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of returnType
	 * @return A String representing the returnType
	 */
	public String getReturnType()
	{
		return  this.returnType;

	}

	/**
	 * The method to set the value to returnType
	 * @param returnType A String representing the returnType
	 */
	public void setReturnType(String returnType)
	{
		 this.returnType=returnType;

		 this.keyModified.put("return_type", 1);

	}

	/**
	 * The method to get the value of expression
	 * @return A String representing the expression
	 */
	public String getExpression()
	{
		return  this.expression;

	}

	/**
	 * The method to set the value to expression
	 * @param expression A String representing the expression
	 */
	public void setExpression(String expression)
	{
		 this.expression=expression;

		 this.keyModified.put("expression", 1);

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