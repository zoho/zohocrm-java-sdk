package com.zoho.crm.api.currencies;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class CurrenciesOperations
{
	/**
	 * The method to get currencies
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getCurrencies() throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/currencies");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to add currencies
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> addCurrencies(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/currencies");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to update currencies
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateCurrencies(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/currencies");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to enable multiple currencies
	 * @param request An instance of BaseCurrencyWrapper
	 * @return An instance of APIResponse<BaseCurrencyActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<BaseCurrencyActionHandler> enableMultipleCurrencies(BaseCurrencyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/currencies/actions/enable");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(BaseCurrencyActionHandler.class, "application/json");

	}

	/**
	 * The method to update base currency
	 * @param request An instance of BaseCurrencyWrapper
	 * @return An instance of APIResponse<BaseCurrencyActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<BaseCurrencyActionHandler> updateBaseCurrency(BaseCurrencyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/currencies/actions/enable");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(BaseCurrencyActionHandler.class, "application/json");

	}

	/**
	 * The method to get currency
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getCurrency(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/currencies/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to update currency
	 * @param id A Long representing the id
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateCurrency(Long id, BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/org/currencies/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}
}