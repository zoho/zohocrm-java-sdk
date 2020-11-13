package com.zoho.crm.api.util;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.json.JSONObject;

/**
 * This class processes the API response object to the POJO object and POJO object to an XML object.
 */
public class XMLConverter extends Converter 
{

	public XMLConverter(CommonAPIHandler commonAPIHandler)
	{
		super(commonAPIHandler);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object formRequest(Object requestInstance, String pack, Integer instanceNumber, JSONObject memberDetail) throws Exception
	{
		return null;
	}

	@Override
	public void appendToRequest(HttpEntityEnclosingRequestBase requestBase, Object requestObject) throws Exception
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getWrappedResponse(Object response, String pack) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object getResponse(Object response, String pack)
	{
		return null;
	}
}