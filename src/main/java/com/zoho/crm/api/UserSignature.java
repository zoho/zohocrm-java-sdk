package com.zoho.crm.api;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import org.json.JSONObject;

import com.zoho.crm.api.exception.SDKException;

import com.zoho.crm.api.util.Constants;

/**
 * This class represents the Zoho CRM User.
 */
public class UserSignature
{
	private String email;

	/**
	 * Creates an UserSignature class instance with the specified user email.
	 * @param email A String containing the CRM user email.
	 * @throws SDKException if a problem occurs.
	 */
	public UserSignature(String email) throws SDKException
	{
		String regex = Constants.EMAIL_REGEX;
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		
		if(!matcher.matches())
		{
			JSONObject error = new JSONObject();
			
			error.put(Constants.FIELD, Constants.EMAIL);
			
			error.put(Constants.EXPECTED_TYPE, Constants.EMAIL);
			
			SDKException ex = new SDKException(Constants.USER_SIGNATURE_ERROR, error);
			
			throw ex;
		}
		
		this.email = email;
	}

	/**
	 * This is a getter method to get user email.
	 * @return A String representing the CRM user email.
	 */
	public String getEmail()
	{
		return email;
	}
}