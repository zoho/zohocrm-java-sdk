package com.zoho.crm.api;

/**
 * This class represents the HTTP header.
 * @param <T> A Java DataType
 */
public class Header<T>
{
	
	private String name;
	
	private String className;
	
	/**
	 * Creates an Header class instance with the specified header name.
	 * @param name A String containing the header name.
	 * @param className A String containing the header class name.
	 */
	public Header(String name, String className)
	{
		this.name = name;
		
		this.className = className;
	}
	
	/**
	 * This is a getter method to get header name.
	 * @return A String representing the header name.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * This is a getter method to get header class name.
	 * @return A String representing the header class name.
	 */
	public String getClassName()
	{
		return this.className;
	}	
}