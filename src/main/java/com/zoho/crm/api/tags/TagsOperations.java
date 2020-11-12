package com.zoho.crm.api.tags;

import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class TagsOperations
{
	/**
	 * The method to get tags
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getTags(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/tags");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to create tags
	 * @param request An instance of BodyWrapper
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> createTags(BodyWrapper request, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/tags");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to update tags
	 * @param request An instance of BodyWrapper
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateTags(BodyWrapper request, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/tags");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to update tag
	 * @param id A Long representing the id
	 * @param request An instance of BodyWrapper
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateTag(Long id, BodyWrapper request, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/tags/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delete tag
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteTag(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/tags/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to merge tags
	 * @param id A Long representing the id
	 * @param request An instance of MergeWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> mergeTags(Long id, MergeWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/tags/");

		apiPath=apiPath.concat(id.toString());

		apiPath=apiPath.concat("/actions/merge");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to add tags to record
	 * @param recordId A Long representing the recordId
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<RecordActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<RecordActionHandler> addTagsToRecord(Long recordId, String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(recordId.toString());

		apiPath=apiPath.concat("/actions/add_tags");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(RecordActionHandler.class, "application/json");

	}

	/**
	 * The method to remove tags from record
	 * @param recordId A Long representing the recordId
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<RecordActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<RecordActionHandler> removeTagsFromRecord(Long recordId, String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(recordId.toString());

		apiPath=apiPath.concat("/actions/remove_tags");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(RecordActionHandler.class, "application/json");

	}

	/**
	 * The method to add tags to multiple records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<RecordActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<RecordActionHandler> addTagsToMultipleRecords(String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/actions/add_tags");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(RecordActionHandler.class, "application/json");

	}

	/**
	 * The method to remove tags from multiple records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<RecordActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<RecordActionHandler> removeTagsFromMultipleRecords(String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/actions/remove_tags");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setMandatoryChecker(true);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(RecordActionHandler.class, "application/json");

	}

	/**
	 * The method to get record count for tag
	 * @param id A Long representing the id
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<CountHandler>
	 * @throws SDKException
	 */
	public APIResponse<CountHandler> getRecordCountForTag(Long id, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/tags/");

		apiPath=apiPath.concat(id.toString());

		apiPath=apiPath.concat("/actions/records_count");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(CountHandler.class, "application/json");

	}
	public static class GetTagsParam
	{
		public static final Param<String> MODULE=new Param<String>("module", "com.zoho.crm.api.Tags.GetTagsParam");

		public static final Param<String> MY_TAGS=new Param<String>("my_tags", "com.zoho.crm.api.Tags.GetTagsParam");

	}

	public static class CreateTagsParam
	{
		public static final Param<String> MODULE=new Param<String>("module", "com.zoho.crm.api.Tags.CreateTagsParam");

	}

	public static class UpdateTagsParam
	{
		public static final Param<String> MODULE=new Param<String>("module", "com.zoho.crm.api.Tags.UpdateTagsParam");

	}

	public static class UpdateTagParam
	{
		public static final Param<String> MODULE=new Param<String>("module", "com.zoho.crm.api.Tags.UpdateTagParam");

	}

	public static class AddTagsToRecordParam
	{
		public static final Param<String> TAG_NAMES=new Param<String>("tag_names", "com.zoho.crm.api.Tags.AddTagsToRecordParam");

		public static final Param<String> OVER_WRITE=new Param<String>("over_write", "com.zoho.crm.api.Tags.AddTagsToRecordParam");

	}

	public static class RemoveTagsFromRecordParam
	{
		public static final Param<String> TAG_NAMES=new Param<String>("tag_names", "com.zoho.crm.api.Tags.RemoveTagsFromRecordParam");

	}

	public static class AddTagsToMultipleRecordsParam
	{
		public static final Param<String> TAG_NAMES=new Param<String>("tag_names", "com.zoho.crm.api.Tags.AddTagsToMultipleRecordsParam");

		public static final Param<Long> IDS=new Param<Long>("ids", "com.zoho.crm.api.Tags.AddTagsToMultipleRecordsParam");

		public static final Param<String> OVER_WRITE=new Param<String>("over_write", "com.zoho.crm.api.Tags.AddTagsToMultipleRecordsParam");

	}

	public static class RemoveTagsFromMultipleRecordsParam
	{
		public static final Param<String> TAG_NAMES=new Param<String>("tag_names", "com.zoho.crm.api.Tags.RemoveTagsFromMultipleRecordsParam");

		public static final Param<Long> IDS=new Param<Long>("ids", "com.zoho.crm.api.Tags.RemoveTagsFromMultipleRecordsParam");

	}

	public static class GetRecordCountForTagParam
	{
		public static final Param<String> MODULE=new Param<String>("module", "com.zoho.crm.api.Tags.GetRecordCountForTagParam");

	}
}