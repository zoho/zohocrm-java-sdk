package com.zoho.crm.api.sharerecords;

import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class ShareRecordsOperations
{
	private String moduleAPIName;

	private Long recordId;

	/**
	 * Creates an instance of ShareRecordsOperations with the given parameters
	 * @param recordId A Long representing the recordId
	 * @param moduleAPIName A String representing the moduleAPIName
	 */
	public ShareRecordsOperations(Long recordId, String moduleAPIName)
	{
		 this.recordId=recordId;

		 this.moduleAPIName=moduleAPIName;


	}

	/**
	 * The method to get shared record details
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getSharedRecordDetails(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/actions/share");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to share record
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> shareRecord(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/actions/share");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to update share permissions
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateSharePermissions(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/actions/share");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to revoke shared record
	 * @return An instance of APIResponse<DeleteActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<DeleteActionHandler> revokeSharedRecord() throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/actions/share");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		return handlerInstance.apiCall(DeleteActionHandler.class, "application/json");

	}
	public static class GetSharedRecordDetailsParam
	{
		public static final Param<Long> SHAREDTO=new Param<Long>("sharedTo", "com.zoho.crm.api.ShareRecords.GetSharedRecordDetailsParam");

		public static final Param<String> VIEW=new Param<String>("view", "com.zoho.crm.api.ShareRecords.GetSharedRecordDetailsParam");

	}
}