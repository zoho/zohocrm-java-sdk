package com.zoho.crm.api.fields;

import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class FieldsOperations
{
	private String module;

	/**
	 * Creates an instance of FieldsOperations with the given parameters
	 * @param module A String representing the module
	 */
	public FieldsOperations(String module)
	{
		 this.module=module;


	}

	/**
	 * The method to get fields
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getFields(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/fields");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addParam(new Param<String>("module", "com.zoho.crm.api.Fields.GetFieldsParam"),  this.module);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to get field
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getField(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/fields/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addParam(new Param<String>("module", "com.zoho.crm.api.Fields.GetFieldParam"),  this.module);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}
	public static class GetFieldsParam
	{
		public static final Param<String> TYPE=new Param<String>("type", "com.zoho.crm.api.Fields.GetFieldsParam");

	}

	public static class GetFieldParam
	{
	}
}