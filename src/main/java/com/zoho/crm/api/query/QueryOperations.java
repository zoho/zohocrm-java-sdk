package com.zoho.crm.api.query;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class QueryOperations
{
	/**
	 * The method to get records
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getRecords(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/coql");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}
}