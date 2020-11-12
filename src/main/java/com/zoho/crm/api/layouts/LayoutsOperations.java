package com.zoho.crm.api.layouts;

import com.zoho.crm.api.Param;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class LayoutsOperations
{
	private String module;

	/**
	 * Creates an instance of LayoutsOperations with the given parameters
	 * @param module A String representing the module
	 */
	public LayoutsOperations(String module)
	{
		 this.module=module;


	}

	/**
	 * The method to get layouts
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getLayouts() throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/layouts");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addParam(new Param<String>("module", "com.zoho.crm.api.Layouts.GetLayoutsParam"),  this.module);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to get layout
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getLayout(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/layouts/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addParam(new Param<String>("module", "com.zoho.crm.api.Layouts.GetLayoutParam"),  this.module);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}
	public static class GetLayoutsParam
	{
	}

	public static class GetLayoutParam
	{
	}
}