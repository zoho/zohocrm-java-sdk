package com.zoho.crm.api.users;

import com.zoho.crm.api.Header;
import com.zoho.crm.api.HeaderMap;
import com.zoho.crm.api.Param;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import java.time.OffsetDateTime;
import com.zoho.crm.api.util.Constants;

public class UsersOperations
{
	/**
	 * The method to get users
	 * @param paramInstance An instance of ParameterMap
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getUsers(ParameterMap paramInstance, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/users");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setParam(paramInstance);

		handlerInstance.setHeader(headerInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to create user
	 * @param request An instance of RequestWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> createUser(RequestWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/users");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_POST);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_CREATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to update users
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateUsers(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/users");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to get user
	 * @param id A Long representing the id
	 * @param headerInstance An instance of HeaderMap
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getUser(Long id, HeaderMap headerInstance) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/users/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.setHeader(headerInstance);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to update user
	 * @param id A Long representing the id
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> updateUser(Long id, BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/users/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to delete user
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> deleteUser(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/users/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_DELETE);

		handlerInstance.setCategoryMethod(Constants.REQUEST_METHOD_DELETE);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}
	public static class GetUsersParam
	{
		public static final Param<String> TYPE=new Param<String>("type", "com.zoho.crm.api.Users.GetUsersParam");

		public static final Param<Integer> PAGE=new Param<Integer>("page", "com.zoho.crm.api.Users.GetUsersParam");

		public static final Param<Integer> PER_PAGE=new Param<Integer>("per_page", "com.zoho.crm.api.Users.GetUsersParam");

	}

	public static class GetUsersHeader
	{
		public static final Header<OffsetDateTime> IF_MODIFIED_SINCE=new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.Users.GetUsersHeader");

	}

	public static class GetUserHeader
	{
		public static final Header<OffsetDateTime> IF_MODIFIED_SINCE=new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.Users.GetUserHeader");

	}
}