package com.zoho.crm.api.record;

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

public class RecordOperations
{
	/**
	 * The method to get record
	 * @param id A Long representing the id
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getRecord(Long id, String moduleAPIName, ParameterMap paramInstance, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		handlerInstance.setHeader(headerInstance);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to update record
	 * @param id A Long representing the id
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateRecord(Long id, String moduleAPIName, BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delete record
	 * @param id A Long representing the id
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteRecord(Long id, String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to get records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getRecords(String moduleAPIName, ParameterMap paramInstance, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		handlerInstance.setHeader(headerInstance);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to create records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> createRecords(String moduleAPIName, BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to update records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateRecords(String moduleAPIName, BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delete records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteRecords(String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to upsert records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> upsertRecords(String moduleAPIName, BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/upsert");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_ACTION);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to get deleted records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<DeletedRecordsHandler>
	 * @throws SDKException
	 */
	public APIResponse<DeletedRecordsHandler> getDeletedRecords(String moduleAPIName, ParameterMap paramInstance, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/deleted");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		handlerInstance.setHeader(headerInstance);

		return handlerInstance.apiCall(DeletedRecordsHandler.class, "application/json");

	}

	/**
	 * The method to search records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> searchRecords(String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/search");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to convert lead
	 * @param id A Long representing the id
	 * @param request An instance of ConvertBodyWrapper
	 * @return An instance of APIResponse<ConvertActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ConvertActionHandler> convertLead(Long id, ConvertBodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/Leads/");

		apiPath=apiPath.concat(id.toString());

		apiPath=apiPath.concat("/actions/convert");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		Utility.getFields("Deals");

		return handlerInstance.apiCall(ConvertActionHandler.class, "application/json");

	}

	/**
	 * The method to get photo
	 * @param id A Long representing the id
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @return An instance of APIResponse<DownloadHandler>
	 * @throws SDKException
	 */
	public APIResponse<DownloadHandler> getPhoto(Long id, String moduleAPIName) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(id.toString());

		apiPath=apiPath.concat("/photo");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(DownloadHandler.class, "application/x-download");

	}

	/**
	 * The method to upload photo
	 * @param id A Long representing the id
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param request An instance of FileBodyWrapper
	 * @return An instance of APIResponse<FileHandler>
	 * @throws SDKException
	 */
	public APIResponse<FileHandler> uploadPhoto(Long id, String moduleAPIName, FileBodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(id.toString());

		apiPath=apiPath.concat("/photo");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("multipart/form-data");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(FileHandler.class, "application/json");

	}

	/**
	 * The method to delete photo
	 * @param id A Long representing the id
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @return An instance of APIResponse<FileHandler>
	 * @throws SDKException
	 */
	public APIResponse<FileHandler> deletePhoto(Long id, String moduleAPIName) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat(id.toString());

		apiPath=apiPath.concat("/photo");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		return handlerInstance.apiCall(FileHandler.class, "application/json");

	}

	/**
	 * The method to mass update records
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param request An instance of MassUpdateBodyWrapper
	 * @return An instance of APIResponse<MassUpdateActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<MassUpdateActionHandler> massUpdateRecords(String moduleAPIName, MassUpdateBodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/actions/mass_update");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		Utility.getFields(moduleAPIName);

		handlerInstance.setModuleAPIName(moduleAPIName);

		return handlerInstance.apiCall(MassUpdateActionHandler.class, "application/json");

	}

	/**
	 * The method to get mass update status
	 * @param moduleAPIName A String representing the moduleAPIName
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<MassUpdateResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<MassUpdateResponseHandler> getMassUpdateStatus(String moduleAPIName, ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat(moduleAPIName.toString());

		apiPath=apiPath.concat("/actions/mass_update");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(MassUpdateResponseHandler.class, "application/json");

	}
	public static class GetRecordParam
	{
		public static final Param<String> APPROVED=new Param<String>("approved", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<String> CONVERTED=new Param<String>("converted", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<String> CVID=new Param<String>("cvid", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<String> UID=new Param<String>("uid", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<String> FIELDS=new Param<String>("fields", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<OffsetDateTime> STARTDATETIME=new Param<OffsetDateTime>("startDateTime", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<OffsetDateTime> ENDDATETIME=new Param<OffsetDateTime>("endDateTime", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<String> TERRITORY_ID=new Param<String>("territory_id", "com.zoho.crm.api.Record.GetRecordParam");

		public static final Param<String> INCLUDE_CHILD=new Param<String>("include_child", "com.zoho.crm.api.Record.GetRecordParam");

	}

	public static class GetRecordHeader
	{
		public static final Header<OffsetDateTime> IF_MODIFIED_SINCE=new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.Record.GetRecordHeader");

	}

	public static class DeleteRecordParam
	{
		public static final Param<String> WF_TRIGGER=new Param<String>("wf_trigger", "com.zoho.crm.api.Record.DeleteRecordParam");

	}

	public static class GetRecordsParam
	{
		public static final Param<String> APPROVED=new Param<String>("approved", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> CONVERTED=new Param<String>("converted", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> CVID=new Param<String>("cvid", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<Long> IDS=new Param<Long>("ids", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> UID=new Param<String>("uid", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> FIELDS=new Param<String>("fields", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> SORT_BY=new Param<String>("sort_by", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> SORT_ORDER=new Param<String>("sort_order", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<Integer> PAGE=new Param<Integer>("page", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<Integer> PER_PAGE=new Param<Integer>("per_page", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<OffsetDateTime> STARTDATETIME=new Param<OffsetDateTime>("startDateTime", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<OffsetDateTime> ENDDATETIME=new Param<OffsetDateTime>("endDateTime", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> TERRITORY_ID=new Param<String>("territory_id", "com.zoho.crm.api.Record.GetRecordsParam");

		public static final Param<String> INCLUDE_CHILD=new Param<String>("include_child", "com.zoho.crm.api.Record.GetRecordsParam");

	}

	public static class GetRecordsHeader
	{
		public static final Header<OffsetDateTime> IF_MODIFIED_SINCE=new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.Record.GetRecordsHeader");

	}

	public static class DeleteRecordsParam
	{
		public static final Param<Long> IDS=new Param<Long>("ids", "com.zoho.crm.api.Record.DeleteRecordsParam");

		public static final Param<String> WF_TRIGGER=new Param<String>("wf_trigger", "com.zoho.crm.api.Record.DeleteRecordsParam");

	}

	public static class GetDeletedRecordsParam
	{
		public static final Param<String> TYPE=new Param<String>("type", "com.zoho.crm.api.Record.GetDeletedRecordsParam");

		public static final Param<Integer> PAGE=new Param<Integer>("page", "com.zoho.crm.api.Record.GetDeletedRecordsParam");

		public static final Param<Integer> PER_PAGE=new Param<Integer>("per_page", "com.zoho.crm.api.Record.GetDeletedRecordsParam");

	}

	public static class GetDeletedRecordsHeader
	{
		public static final Header<OffsetDateTime> IF_MODIFIED_SINCE=new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.Record.GetDeletedRecordsHeader");

	}

	public static class SearchRecordsParam
	{
		public static final Param<String> CRITERIA=new Param<String>("criteria", "com.zoho.crm.api.Record.SearchRecordsParam");

		public static final Param<String> EMAIL=new Param<String>("email", "com.zoho.crm.api.Record.SearchRecordsParam");

		public static final Param<String> PHONE=new Param<String>("phone", "com.zoho.crm.api.Record.SearchRecordsParam");

		public static final Param<String> WORD=new Param<String>("word", "com.zoho.crm.api.Record.SearchRecordsParam");

		public static final Param<String> CONVERTED=new Param<String>("converted", "com.zoho.crm.api.Record.SearchRecordsParam");

		public static final Param<String> APPROVED=new Param<String>("approved", "com.zoho.crm.api.Record.SearchRecordsParam");

		public static final Param<Integer> PAGE=new Param<Integer>("page", "com.zoho.crm.api.Record.SearchRecordsParam");

		public static final Param<Integer> PER_PAGE=new Param<Integer>("per_page", "com.zoho.crm.api.Record.SearchRecordsParam");

	}

	public static class GetMassUpdateStatusParam
	{
		public static final Param<String> JOB_ID=new Param<String>("job_id", "com.zoho.crm.api.Record.GetMassUpdateStatusParam");

	}
}