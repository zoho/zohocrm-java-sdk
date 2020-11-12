package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.Map;

public class APIException implements Model, ActionResponse, ResponseWrapper, ResponseHandler
{
	private Choice<String> code;

	private Choice<String> message;

	private Choice<String> status;

	private Map<String, Object> details;

	private Choice<String> errorMessage;

	private Integer errorCode;

	private Choice<String> xError;

	private Choice<String> info;

	private Choice<String> xInfo;

	private String httpStatus;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of code
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getCode()
	{
		return  this.code;

	}

	/**
	 * The method to set the value to code
	 * @param code An instance of Choice<String>
	 */
	public void setCode(Choice<String> code)
	{
		 this.code=code;

		 this.keyModified.put("code", 1);

	}

	/**
	 * The method to get the value of message
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getMessage()
	{
		return  this.message;

	}

	/**
	 * The method to set the value to message
	 * @param message An instance of Choice<String>
	 */
	public void setMessage(Choice<String> message)
	{
		 this.message=message;

		 this.keyModified.put("message", 1);

	}

	/**
	 * The method to get the value of status
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getStatus()
	{
		return  this.status;

	}

	/**
	 * The method to set the value to status
	 * @param status An instance of Choice<String>
	 */
	public void setStatus(Choice<String> status)
	{
		 this.status=status;

		 this.keyModified.put("status", 1);

	}

	/**
	 * The method to get the value of details
	 * @return An instance of Map<String,Object>
	 */
	public Map<String, Object> getDetails()
	{
		return  this.details;

	}

	/**
	 * The method to set the value to details
	 * @param details An instance of Map<String,Object>
	 */
	public void setDetails(Map<String, Object> details)
	{
		 this.details=details;

		 this.keyModified.put("details", 1);

	}

	/**
	 * The method to get the value of errorMessage
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getErrorMessage()
	{
		return  this.errorMessage;

	}

	/**
	 * The method to set the value to errorMessage
	 * @param errorMessage An instance of Choice<String>
	 */
	public void setErrorMessage(Choice<String> errorMessage)
	{
		 this.errorMessage=errorMessage;

		 this.keyModified.put("ERROR_MESSAGE", 1);

	}

	/**
	 * The method to get the value of errorCode
	 * @return An Integer representing the errorCode
	 */
	public Integer getErrorCode()
	{
		return  this.errorCode;

	}

	/**
	 * The method to set the value to errorCode
	 * @param errorCode An Integer representing the errorCode
	 */
	public void setErrorCode(Integer errorCode)
	{
		 this.errorCode=errorCode;

		 this.keyModified.put("ERROR_CODE", 1);

	}

	/**
	 * The method to get the value of xError
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getXError()
	{
		return  this.xError;

	}

	/**
	 * The method to set the value to xError
	 * @param xError An instance of Choice<String>
	 */
	public void setXError(Choice<String> xError)
	{
		 this.xError=xError;

		 this.keyModified.put("x-error", 1);

	}

	/**
	 * The method to get the value of info
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getInfo()
	{
		return  this.info;

	}

	/**
	 * The method to set the value to info
	 * @param info An instance of Choice<String>
	 */
	public void setInfo(Choice<String> info)
	{
		 this.info=info;

		 this.keyModified.put("info", 1);

	}

	/**
	 * The method to get the value of xInfo
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getXInfo()
	{
		return  this.xInfo;

	}

	/**
	 * The method to set the value to xInfo
	 * @param xInfo An instance of Choice<String>
	 */
	public void setXInfo(Choice<String> xInfo)
	{
		 this.xInfo=xInfo;

		 this.keyModified.put("x-info", 1);

	}

	/**
	 * The method to get the value of httpStatus
	 * @return A String representing the httpStatus
	 */
	public String getHttpStatus()
	{
		return  this.httpStatus;

	}

	/**
	 * The method to set the value to httpStatus
	 * @param httpStatus A String representing the httpStatus
	 */
	public void setHttpStatus(String httpStatus)
	{
		 this.httpStatus=httpStatus;

		 this.keyModified.put("http_status", 1);

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