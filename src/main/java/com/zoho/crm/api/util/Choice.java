package com.zoho.crm.api.util;

/**
 * Common Class to provide or obtain a value, when there are multiple supported values.
 * @param <T>
 */
public  class Choice<T>
{
	T value;

	@SuppressWarnings("unused")
	private Choice() 
	{
		
	}
	
	public Choice(T value)
	{
		this.value = value;
	}

	public T getValue()
	{
		return this.value;
	}
}