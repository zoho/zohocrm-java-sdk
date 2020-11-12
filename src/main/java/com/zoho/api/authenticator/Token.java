package com.zoho.api.authenticator;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIHTTPConnector;

/**
 * This interface verifies and sets token to APIHTTPConnector instance.
 */
public interface Token
{
	/**
	 * This method to set authentication token to APIHTTPConnector instance.
	 * @param urlConnection A APIHTTPConnector class instance.
	 * @throws SDKException if a problem occurs.
	 */
	public void authenticate(APIHTTPConnector urlConnection) throws SDKException;
	
	public Boolean remove() throws SDKException;
}
