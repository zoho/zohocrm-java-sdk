package com.zoho.crm.api.customviews;

import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class CustomViewsOperations
{
	private String module;

	/**
	 * Creates an instance of CustomViewsOperations with the given parameters
	 * @param module A String representing the module
	 */
	public CustomViewsOperations(String module)
	{
		 this.module=module;


	}

	/**
	 * The method to get custom views
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getCustomViews(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/custom_views");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addParam(new Param<String>("module", "com.zoho.crm.api.CustomViews.GetCustomViewsParam"),  this.module);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to get custom view
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getCustomView(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/custom_views/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addParam(new Param<String>("module", "com.zoho.crm.api.CustomViews.GetCustomViewParam"),  this.module);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}
	public static class GetCustomViewsParam
	{
		public static final Param<Integer> PAGE=new Param<Integer>("page", "com.zoho.crm.api.CustomViews.GetCustomViewsParam");

		public static final Param<Integer> PER_PAGE=new Param<Integer>("per_page", "com.zoho.crm.api.CustomViews.GetCustomViewsParam");

	}

	public static class GetCustomViewParam
	{
	}
}