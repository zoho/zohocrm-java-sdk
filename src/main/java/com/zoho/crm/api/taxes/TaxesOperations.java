package com.zoho.crm.api.taxes;

import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class TaxesOperations
{
	/**
	 * The method to get taxes
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getTaxes() throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/taxes");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to create taxes
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> createTaxes(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/taxes");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to update taxes
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateTaxes(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/taxes");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delete taxes
	 * @param paramInstance An instance of ParameterMap
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteTaxes(ParameterMap paramInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/taxes");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setParam(paramInstance);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to get tax
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getTax(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/taxes/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to delete tax
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteTax(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/taxes/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}
	public static class DeleteTaxesParam
	{
		public static final Param<Long> IDS=new Param<Long>("ids", "com.zoho.crm.api.Taxes.DeleteTaxesParam");

	}
}