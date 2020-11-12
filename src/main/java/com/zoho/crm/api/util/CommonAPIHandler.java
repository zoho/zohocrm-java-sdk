package com.zoho.crm.api.util;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.HashMap;

import java.util.logging.Level;

import java.util.logging.Logger;

import org.apache.http.HttpResponse;

import org.apache.http.entity.ContentType;

import com.zoho.api.logger.SDKLogger;

import com.zoho.crm.api.Header;

import com.zoho.crm.api.HeaderMap;

import com.zoho.crm.api.Initializer;

import com.zoho.crm.api.Param;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.exception.SDKException;

/**
 * This class is to process the API request and its response.
 * Construct the objects that are to be sent as parameters or in the request body with the API.
 * The Request parameter, header and body objects are constructed here.
 * Process the response JSON and converts it to relevant objects in the library.
 */
public class CommonAPIHandler
{
	private String apiPath;

	private ParameterMap param = new ParameterMap();

	private HeaderMap header = new HeaderMap();

	private Object request;

	private String httpMethod;

	private String moduleAPIName;

	private String contentType;
	
	private String categoryMethod;

	private Boolean mandatoryChecker;

	protected static final Logger LOGGER = Logger.getLogger(SDKLogger.class.getName());

	/**
	 * This is a setter method to set an API request content type.
	 * 
	 * @param contentType A String containing the API request content type.
	 */
	public void setContentType(String contentType)
	{
		this.contentType = contentType;
	}

	/**
	 * This is a setter method to set the API request URL.
	 * 
	 * @param apiPath A String containing the API request URL.
	 */
	public void setAPIPath(String apiPath)
	{
		this.apiPath = apiPath;
	}

	/**
	 * This method is to add an API request parameter.
	 * 
	 * @param <T>        A T containing the specified method type.
	 * @param paramInstance  A Param instance containing the API request parameter.
	 * @param paramValue A T containing the API request parameter value.
	 * @throws SDKException 
	 */
	public <T> void addParam(Param<T> paramInstance, T paramValue) throws SDKException
	{
		if(paramValue == null)
		{
			return;
		}
		
		if (this.param == null)
		{
			this.param = new ParameterMap();
		}

		this.param.add(paramInstance, paramValue);
	}

	/**
	 * This method to add an API request header.
	 * 
	 * @param <T>         A T containing the specified method type.
	 * @param headerInstance  A Header instance the API request header.
	 * @param headerValue A T containing the API request header value.
	 * @throws SDKException 
	 */
	public <T> void addHeader(Header<T> headerInstance, T headerValue) throws SDKException
	{
		if(headerValue == null)
		{
			return;
		}
		
		if (this.header == null)
		{
			this.header = new HeaderMap();
		}

		this.header.add(headerInstance, headerValue);
	}

	/**
	 * This is a setter method to set the API request parameter map.
	 * 
	 * @param param A ParameterMap class instance containing the API request parameter.
	 */
	public void setParam(ParameterMap param)
	{
		if(param == null)
		{
			return;
		}
		
		if(this.param.getParameterMap() != null && !this.param.getParameterMap().isEmpty())
		{
			this.param.getParameterMap().putAll(param.getParameterMap());
		}
		else
		{
			this.param = param;
		}
	}

	/**
	 * This is a getter method to get the Zoho CRM module API name.
	 * 
	 * @return A String representing the Zoho CRM module API name.
	 */
	public String getModuleAPIName()
	{
		return moduleAPIName;
	}

	/**
	 * This is a setter method to set the Zoho CRM module API name.
	 * 
	 * @param moduleAPIName A String containing the Zoho CRM module API name.
	 */
	public void setModuleAPIName(String moduleAPIName)
	{
		this.moduleAPIName = moduleAPIName;
	}

	/**
	 * This is a setter method to set the API request header map.
	 * 
	 * @param header A HeaderMap class instance containing the API request header.
	 */
	public void setHeader(HeaderMap header)
	{
		if(header == null)
		{
			return;
		}
		
		if(this.header.getHeaderMap() != null && !this.header.getHeaderMap().isEmpty())
		{
			this.header.getHeaderMap().putAll(header.getHeaderMap());
		}
		else
		{
			this.header = header;
		}
	}

	/**
	 * This is a setter method to set the API request body object.
	 * 
	 * @param request A Object containing the API request body object.
	 */
	public void setRequest(Object request)
	{
		this.request = request;
	}

	/**
	 * This is a setter method to set the HTTP API request method.
	 * 
	 * @param httpMethod A String containing the HTTP API request method.
	 */
	public void setHttpMethod(String httpMethod)
	{
		this.httpMethod = httpMethod;
	}

	/**
	 * This method is used in constructing API request and response details. To make the Zoho CRM API calls.
	 * 
	 * @param <T>        A T containing the specified type method.
	 * @param className  A Class&lt;T&gt; containing the method return type.
	 * @param encodeType A String containing the expected API response content type.
	 * @see com.zoho.crm.api.util.APIHTTPConnector
	 * @return A APIResponse&lt;T&gt; representing the Zoho CRM API response instance or null.
	 * @throws SDKException 
	 */
	public <T> APIResponse<T> apiCall(Class<T> className, String encodeType) throws SDKException
	{
		if(Initializer.getInitializer() == null)
		{
			throw new SDKException(Constants.SDK_UNINITIALIZATION_ERROR, Constants.SDK_UNINITIALIZATION_MESSAGE);
		}
		
		APIHTTPConnector connector = new APIHTTPConnector();

		try
		{
			this.setAPIUrl(connector);
		}
		catch (SDKException e)
		{
			LOGGER.log(Level.SEVERE, Constants.SET_API_URL_EXCEPTION, e);

			throw e;
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);
			
			LOGGER.log(Level.SEVERE, Constants.SET_API_URL_EXCEPTION, exception);
			
			throw exception;
		}

		connector.setRequestMethod(this.httpMethod);

		connector.setContentType(this.contentType);

		if (this.header != null && this.header.getHeaderMap().size() > 0)
		{
			connector.setHeaders(header.getHeaderMap());
		}

		if (this.param != null && this.param.getParameterMap().size() > 0)
		{
			connector.setParams(param.getParameterMap());
		}

		try
		{
			Initializer.getInitializer().getToken().authenticate(connector);
		}
		catch (SDKException e)
		{
			LOGGER.log(Level.SEVERE, Constants.AUTHENTICATION_EXCEPTION, e);

			throw e;
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);
			
			LOGGER.log(Level.SEVERE, Constants.AUTHENTICATION_EXCEPTION, exception);
			
			throw exception;
		}

		String pack = className.getCanonicalName();

		Converter convertInstance = null;

		if (this.contentType != null && (httpMethod.equalsIgnoreCase(Constants.REQUEST_METHOD_PATCH) || httpMethod.equalsIgnoreCase(Constants.REQUEST_METHOD_POST) || httpMethod.equalsIgnoreCase(Constants.REQUEST_METHOD_PUT)))
		{
			Object request = null;

			try
			{
				convertInstance = getConverterClassInstance(this.contentType.toLowerCase());

				request = convertInstance.formRequest(this.request, this.request.getClass().getCanonicalName(), null, null);
			}
			catch(SDKException e)
			{
				LOGGER.log(Level.SEVERE, Constants.FORM_REQUEST_EXCEPTION, e);
				
				throw e;
			}
			catch (Exception e)
			{
				SDKException exception = new SDKException(e);
				
				LOGGER.log(Level.SEVERE, Constants.FORM_REQUEST_EXCEPTION, exception);

				throw exception;
			}

			connector.setRequestBody(request);
		}

		try
		{
			connector.addHeader(Constants.ZOHO_SDK, System.getProperty("os.name") + "/" + System.getProperty("os.version") + " Java/" + System.getProperty("java.version") + ":" + Constants.SDK_VERSION);

			HttpResponse response = connector.fireRequest(convertInstance);

			int statusCode = response.getStatusLine().getStatusCode();

			HashMap<String, String> headerMap = this.getHeaders(response.getAllHeaders());

			boolean isModel = false;

			ContentType contentType = ContentType.getOrDefault(response.getEntity());

			String mimeType = contentType.getMimeType();

			convertInstance = getConverterClassInstance(mimeType.toLowerCase());

			Model returnObject = (Model) convertInstance.getWrappedResponse(response, pack);

			if (returnObject != null)
			{
				if (pack.equals(returnObject.getClass().getCanonicalName()) || isExpectedType(returnObject, pack))
				{
					isModel = true;
				}
			}

			return new APIResponse<T>(headerMap, statusCode, returnObject, isModel);
		}
		catch(SDKException e)
		{
			LOGGER.log(Level.SEVERE, Constants.API_CALL_EXCEPTION, e);
			
			throw e;
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);
			
			LOGGER.log(Level.SEVERE, Constants.API_CALL_EXCEPTION, exception);
			
			throw exception;
		}
	}

	/**
	 * This method is used to get a Converter class instance.
	 * 
	 * @param encodeType A String containing the API response content type.
	 * @return A Converter class instance.
	 */
	public Converter getConverterClassInstance(String encodeType)
	{
		switch (encodeType)
		{
			case "application/json":
			case "text/plain":
				return new JSONConverter(this);
			case "application/xml":
			case "text/xml":
				return new XMLConverter(this);
			case "multipart/form-data":
				return new FormDataConverter(this);
			case "application/x-download":
			case "image/png":
			case "image/jpeg":
			case "application/zip":
			case "image/gif":
			case "text/csv":
			case "image/tiff":
			case "application/octet-stream":
			case "text/html":
				return new Downloader(this);
		}

		return null;
	}

	/**
	 * This method to get API response headers.
	 * 
	 * @param headers A org.apache.http.Header Array containing the API response headers.
	 * @return A HashMap&lt;String,String&gt; representing the API response headers.
	 */
	private HashMap<String, String> getHeaders(org.apache.http.Header[] headers)
	{
		HashMap<String, String> headerMap = new HashMap<String, String>();

		for (org.apache.http.Header header : headers)
		{
			headerMap.put(header.getName(), header.getValue());
		}

		return headerMap;
	}

	private boolean isExpectedType(Model model, String className)
	{
		Class<?>[] interfaces = model.getClass().getInterfaces();

		for (@SuppressWarnings("rawtypes")
		Class interfaceDetails : interfaces)
		{
			if (interfaceDetails.getCanonicalName().equals(className))
			{
				return true;
			}
		}

		return false;
	}

	private void setAPIUrl(APIHTTPConnector connector) throws SDKException
	{
		String APIPath = new String();

		if (apiPath.contains(Constants.HTTP))
		{
			if (apiPath.contains(Constants.CONTENT_API_URL))
			{
				APIPath = APIPath.concat(Initializer.getInitializer().getEnvironment().getFileUploadUrl());

				URL uri;

				try
				{
					uri = new URL(apiPath);

					APIPath = APIPath.concat(uri.getPath());
				}
				catch (MalformedURLException ex)
				{
					SDKException excp = new SDKException(ex);

					LOGGER.log(Level.SEVERE, Constants.INVALID_URL_ERROR, excp);

					throw excp;
				}
			}
			else
			{
				if (apiPath.substring(0, 1).equalsIgnoreCase("/"))
				{
					apiPath = apiPath.substring(1);
				}

				APIPath = APIPath.concat(apiPath);
			}
		}
		else
		{
			APIPath = APIPath.concat(Initializer.getInitializer().getEnvironment().getUrl());

			APIPath = APIPath.concat(apiPath);
		}

		connector.setURL(APIPath);
	}

	public Boolean isMandatoryChecker()
	{
		return mandatoryChecker;
	}

	public void setMandatoryChecker(Boolean mandatoryChecker)
	{
		this.mandatoryChecker = mandatoryChecker;
	}

	public String getHttpMethod()
	{
		return this.httpMethod;
	}

	public String getCategoryMethod()
	{
		return categoryMethod;
	}

	public void setCategoryMethod(String category)
	{
		this.categoryMethod = category;
	}

	public String getApiPath()
	{
		return apiPath;
	}
}
