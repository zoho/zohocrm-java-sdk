package com.zoho.crm.api;

/**
 * This class represents the HTTP parameter.
 * @param <T> A Java DataType
 */
public class Param<T>
{
	
	private String name;
	
	private String className;
	
	/**
	 * Creates an Param class instance with the specified parameter name.
	 * @param name A String containing the parameter name.
	 * @param className A String containing the parameter class name.
	 */
	public Param(String name, String className)
	{
		this.name = name;
	}
	
	/**
	 * This is a getter method to get parameter name.
	 * @return A String representing the parameter name.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * This is a getter method to get parameter class name.
	 * @return A String representing the parameter class name.
	 */
	public String getClassName()
	{
		return this.className;
	}
}