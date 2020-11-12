package com.zoho.crm.api.bulkread;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class BulkReadOperations
{
	/**
	 * The method to get bulk read job details
	 * @param jobId A Long representing the jobId
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getBulkReadJobDetails(Long jobId) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/bulk/v2/read/");

		apiPath=apiPath.concat(jobId.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to download result
	 * @param jobId A Long representing the jobId
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> downloadResult(Long jobId) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/bulk/v2/read/");

		apiPath=apiPath.concat(jobId.toString());

		apiPath=apiPath.concat("/result");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/x-download");

	}

	/**
	 * The method to create bulk read job
	 * @param request An instance of RequestWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> createBulkReadJob(RequestWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/bulk/v2/read");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}
}