package com.zoho.crm.api.blueprint;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class BluePrintOperations
{
	private String moduleAPIName;

	private Long recordId;

	/**
	 * Creates an instance of BluePrintOperations with the given parameters
	 * @param recordId A Long representing the recordId
	 * @param moduleAPIName A String representing the moduleAPIName
	 */
	public BluePrintOperations(Long recordId, String moduleAPIName)
	{
		 this.recordId=recordId;

		 this.moduleAPIName=moduleAPIName;


	}

	/**
	 * The method to get blueprint
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getBlueprint() throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/actions/blueprint");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to update blueprint
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionResponse>
	 * @throws SDKException
	 */
	public APIResponse<ActionResponse> updateBlueprint(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/");

		apiPath=apiPath.concat( this.moduleAPIName.toString());

		apiPath=apiPath.concat("/");

		apiPath=apiPath.concat( this.recordId.toString());

		apiPath=apiPath.concat("/actions/blueprint");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionResponse.class, "application/json");

	}
}