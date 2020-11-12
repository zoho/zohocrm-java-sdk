package com.zoho.crm.api.exception;

import org.json.JSONObject;

/**
 * This class is the common SDKException object. This stands as a POJO for the SDKException thrown.
 */
@SuppressWarnings("serial")
public class SDKException extends Exception
{
	private String code;
	
	private String message;
	
	private Exception cause;
	
	private JSONObject details;
	
	/**
	 * Creates an SDKException class instance with the specified parameters.
	 * @param code A String containing the Exception error code.
	 * @param message A String containing the Exception error message.
	 * @param cause An Exception class instance.
	 */
	public SDKException(String code, String message, Exception cause)
	{
		super(message,cause);
		
		this.code = code;
		
		this.message = message;
		
		this.cause = cause;
	}
	
	/**
	 * Creates an SDKException class instance with the specified parameters.
	 * @param code A String containing the Exception error code.
	 * @param details A JSONObject containing the error response.
	 */
	public SDKException(String code, JSONObject details) 
	{
		this.code = code;
		
		this.details = details;
	}

	/**
	 * Creates an SDKException class instance with the specified parameters.
	 * @param code A String containing the Exception error code.
	 * @param message A String containing the Exception error message.
	 */
	public SDKException(String code, String message)
	{
		this(code, message, null);
	}
	
	/**
	 *  Creates an SDKException class instance with the specified parameters.
	 * @param message A String containing the Exception error message.
	 * @param cause An Exception class instance.
	 */
	public SDKException(String message, Exception cause)
	{
		this(null, message, cause);
	}

	/**
	 * Creates an SDKException class instance with the specified parameters.
	 * @param cause An Exception class instance.
	 */
	public SDKException(Exception cause)
	{
		this(null, cause.getMessage(), cause);
	}
	
	/**
	 * Creates an SDKException class instance with the specified parameters.
	 * @param code A String containing the Exception error code.
	 * @param message A String containing the Exception error message.
	 * @param details A JSONObject containing the error response.
	 * @param cause A Exception class instance.
	 */
	public SDKException(String code, String message, JSONObject details, Exception cause)
	{
		super(message,cause);
		
		this.code = code;
		
		this.message = message;
		
		this.details = details;
		
		this.cause = cause;
	}

	/**
	 * This is a getter method to get Exception error code.
	 * @return A String representing the Exception error code.
	 */
	public String getCode()
	{
		return this.code;
	}

	/**
	 * This is a getter method to get Exception error message.
	 * @return A String representing the Exception error message.
	 */
	public String getMessage()
	{
		return this.message;
	}

	/**
	 * This is a getter method to get Exception class instance.
	 * @return A Exception class instance.
	 */
	public Throwable getCause()
	{
		return this.cause;
	}
	
	/**
	 * This is a getter method to get error response JSONObject.
	 * @return A JSONObject representing the error response.
	 */
	public JSONObject getDetails()
	{
		return details;
	}

	@Override
	public String toString()
	{
		String returnMsg = SDKException.class.getName() + ". Caused by : ";
		
		if(this.details != null)
		{
			this.message = this.message != null ? this.message + this.details.toString() : this.details.toString();
		}
		
		if (this.code != null)
		{
			returnMsg += this.code + " - " + getMessage();
		}
		else 
		{
			returnMsg += getMessage();
		}
		
		return returnMsg;
	}
}