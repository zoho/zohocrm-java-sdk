package com.zoho.crm.api.relatedrecords;

import com.zoho.crm.api.Header;
import com.zoho.crm.api.HeaderMap;
import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Utility;
import java.time.OffsetDateTime;
import com.zoho.crm.api.util.Constants;

public class RelatedRecordsOperations
{
	private String moduleAPIName;

	private Long recordId;

	private String relatedListAPIName;

	/**
	 * Creates an instance of RelatedRecordsOperations with the given parameters
	 * @param relatedListAPIName A String representing the relatedListAPIName
	 * @param recordId A Long representing the recordId
	 * @param moduleAPIName A String representing the moduleAPIName
	 */
	public RelatedRecordsOperations(String relatedListAPIName, Long recordId, String moduleAPIName)
	{
		 this.relatedListAPIName=relatedListAPIName;

		 this.recordId=recordId;

		 this.moduleAPIName=moduleAPIName;


	}

	/**
	 * The method to get related records
	 * @param paramInstance An instance of ParameterMap
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getRelatedRecords(ParameterMap paramInstance, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.relatedListAPIName.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		handlerInstance.setHeader(headerInstance);

		Utility.getRelatedLists( this.relatedListAPIName,  this.moduleAPIName, handlerInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to update related records
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateRelatedRecords(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.relatedListAPIName.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		Utility.getRelatedLists( this.relatedListAPIName,  this.moduleAPIName, handlerInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delink records
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> delinkRecords(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.relatedListAPIName.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to get related record
	 * @param relatedRecordId A Long representing the relatedRecordId
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getRelatedRecord(Long relatedRecordId, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.relatedListAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(relatedRecordId.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setHeader(headerInstance);

		Utility.getRelatedLists( this.relatedListAPIName,  this.moduleAPIName, handlerInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to update related record
	 * @param relatedRecordId A Long representing the relatedRecordId
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateRelatedRecord(Long relatedRecordId, BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.relatedListAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(relatedRecordId.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		Utility.getRelatedLists( this.relatedListAPIName,  this.moduleAPIName, handlerInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delink record
	 * @param relatedRecordId A Long representing the relatedRecordId
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> delinkRecord(Long relatedRecordId) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.relatedListAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(relatedRecordId.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}
	public static class GetRelatedRecordsParam
	{
		public static final Param<Integer> PAGE=new Param<Integer>("page", "com.zoho.crm.api.RelatedRecords.GetRelatedRecordsParam");

		public static final Param<Integer> PER_PAGE=new Param<Integer>("per_page", "com.zoho.crm.api.RelatedRecords.GetRelatedRecordsParam");

	}

	public static class GetRelatedRecordsHeader
	{
		public static final Header<OffsetDateTime> IF_MODIFIED_SINCE=new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.RelatedRecords.GetRelatedRecordsHeader");

	}

	public static class DelinkRecordsParam
	{
		public static final Param<Long> IDS=new Param<Long>("ids", "com.zoho.crm.api.RelatedRecords.DelinkRecordsParam");

	}

	public static class GetRelatedRecordHeader
	{
		public static final Header<OffsetDateTime> IF_MODIFIED_SINCE=new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.RelatedRecords.GetRelatedRecordHeader");

	}
}