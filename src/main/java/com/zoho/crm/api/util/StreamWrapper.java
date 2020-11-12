package com.zoho.crm.api.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.zoho.crm.api.exception.SDKException;

/**
 * This class handles the file stream and name. 
 */
public class StreamWrapper implements Model
{

	private String name;
	
	private InputStream stream;
	
	/**
	 * Creates a StreamWrapper class instance with the specified parameters.
	 * @param name A String containing the file name.
	 * @param stream A InputStream containing the file stream.
	 */
	public StreamWrapper(String name, InputStream stream)
	{
		this.name = name;
		
		this.stream = stream;
	}

	/**
	 * Creates a StreamWrapper class instance with the specified file path.
	 * @param filePath A String containing the absolute file path.
	 * @throws Exception if a problem occurs.
	 */
	public StreamWrapper(String filePath) throws Exception
	{
		try
		{
			File file = new File(filePath);

			this.name = file.getName();
			
			this.stream = new FileInputStream(file);
		}
		catch (Exception ex)
        {
            throw new SDKException(Constants.FILE_ERROR, Constants.FILE_DOES_NOT_EXISTS + " " + filePath);
        }
	}

	/**
	 * This is a getter method to get the file name.
	 * @return A String representing the file name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * This is a getter method to get the file input stream.
	 * @return A InputStream representing the file input stream.
	 */
	public InputStream getStream()
	{
		return stream;
	}
}