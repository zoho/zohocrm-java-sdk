package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.Header;
import com.zoho.crm.api.HeaderMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class BulkWriteOperations
{
	/**
	 * The method to upload file
	 * @param request An instance of FileBodyWrapper
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<ActionResponse>
	 * @throws SDKException
	 */
	public APIResponse<ActionResponse> uploadFile(FileBodyWrapper request, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("https://content.zohoapis.com/crm/v2/upload");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("multipart/form-data");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setHeader(headerInstance);

		return handlerInstance.apiCall(ActionResponse.class, "application/json");

	}

	/**
	 * The method to create bulk write job
	 * @param request An instance of RequestWrapper
	 * @return An instance of APIResponse<ActionResponse>
	 * @throws SDKException
	 */
	public APIResponse<ActionResponse> createBulkWriteJob(RequestWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/bulk/v2/write");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionResponse.class, "application/json");

	}

	/**
	 * The method to get bulk write job details
	 * @param jobId A Long representing the jobId
	 * @return An instance of APIResponse<ResponseWrapper>
	 * @throws SDKException
	 */
	public APIResponse<ResponseWrapper> getBulkWriteJobDetails(Long jobId) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/bulk/v2/write/");

		apiPath=apiPath.concat(jobId.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseWrapper.class, "application/json");

	}

	/**
	 * The method to download bulk write result
	 * @param downloadUrl A String representing the downloadUrl
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> downloadBulkWriteResult(String downloadUrl) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(downloadUrl.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/octet-stream");

	}
	public static class UploadFileHeader
	{
		public static final Header<String> FEATURE=new Header<String>("feature", "com.zoho.crm.api.BulkWrite.UploadFileHeader");

		public static final Header<String> X_CRM_ORG=new Header<String>("X-CRM-ORG", "com.zoho.crm.api.BulkWrite.UploadFileHeader");

	}
}