package com.zoho.crm.api.profiles;

import com.zoho.crm.api.Header;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import java.time.OffsetDateTime;
import com.zoho.crm.api.util.Constants;

public class ProfilesOperations
{
	private OffsetDateTime ifModifiedSince;

	/**
	 * Creates an instance of ProfilesOperations with the given parameters
	 * @param ifModifiedSince An instance of OffsetDateTime
	 */
	public ProfilesOperations(OffsetDateTime ifModifiedSince)
	{
		 this.ifModifiedSince=ifModifiedSince;


	}

	/**
	 * The method to get profiles
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getProfiles() throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/profiles");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addHeader(new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.Profiles.GetProfilesHeader"),  this.ifModifiedSince);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to get profile
	 * @param id A Long representing the id
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getProfile(Long id) throws SDKException
	{
		CommonAPIHandler handlerInstance=new CommonAPIHandler();

		String apiPath=new String();

		apiPath=apiPath.concat("/crm/v2/settings/profiles/");

		apiPath=apiPath.concat(id.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		handlerInstance.addHeader(new Header<OffsetDateTime>("If-Modified-Since", "com.zoho.crm.api.Profiles.GetProfileHeader"),  this.ifModifiedSince);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}
	public static class GetProfilesHeader
	{
	}

	public static class GetProfileHeader
	{
	}
}