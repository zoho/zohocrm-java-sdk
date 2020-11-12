package com.zoho.crm.api.attachments;

import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class AttachmentsOperations
{
	private Long recordId;

	private String moduleAPIName;

	/**
	 * Creates an instance of AttachmentsOperations with the given parameters
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param recordId A Long representing the recordId
	 */
	public AttachmentsOperations(String moduleAPIName, Long recordId)
	{
		 this.moduleAPIName=moduleAPIName;

		 this.recordId=recordId;


	}

	/**
	 * The method to download attachment
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> downloadAttachment(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/Attachments/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/x-download");

	}

	/**
	 * The method to delete attachment
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteAttachment(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/Attachments/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to get attachments
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getAttachments(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/Attachments");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to upload attachment
	 * @param request An instance of FileBodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> uploadAttachment(FileBodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/Attachments");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("multipart/form-data");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to upload link attachment
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> uploadLinkAttachment(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/Attachments");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delete attachments
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteAttachments(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/Attachments");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}
	public static class GetAttachmentsParam
	{
		public static final Param<String> FIELDS=new Param<String>("fields", "com.zoho.crm.api.Attachments.GetAttachmentsParam");

		public static final Param<Integer> PAGE=new Param<Integer>("page", "com.zoho.crm.api.Attachments.GetAttachmentsParam");

		public static final Param<Integer> PER_PAGE=new Param<Integer>("per_page", "com.zoho.crm.api.Attachments.GetAttachmentsParam");

	}

	public static class UploadLinkAttachmentParam
	{
		public static final Param<String> ATTACHMENTURL=new Param<String>("attachmentUrl", "com.zoho.crm.api.Attachments.UploadLinkAttachmentParam");

	}

	public static class DeleteAttachmentsParam
	{
		public static final Param<Long> IDS=new Param<Long>("ids", "com.zoho.crm.api.Attachments.DeleteAttachmentsParam");

	}
}