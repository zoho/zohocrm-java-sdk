package com.zoho.crm.api.util;

import java.io.UnsupportedEncodingException;

import java.net.URI;

import java.security.NoSuchAlgorithmException;

import java.util.HashMap;

import java.util.Iterator;

import java.util.logging.Level;

import java.util.logging.Logger;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpHeaders;

import org.apache.http.HttpHost;

import org.apache.http.HttpResponse;

import org.apache.http.auth.AuthScope;

import org.apache.http.auth.NTCredentials;

import org.apache.http.client.CredentialsProvider;

import org.apache.http.client.methods.HttpDelete;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import org.apache.http.client.methods.HttpGet;

import org.apache.http.client.methods.HttpPatch;

import org.apache.http.client.methods.HttpPost;

import org.apache.http.client.methods.HttpPut;

import org.apache.http.client.methods.HttpUriRequest;

import org.apache.http.client.utils.URIBuilder;

import org.apache.http.conn.ssl.NoopHostnameVerifier;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

import org.apache.http.impl.client.BasicCredentialsProvider;

import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.impl.client.HttpClientBuilder;

import com.zoho.api.logger.SDKLogger;

import com.zoho.crm.api.Initializer;

import com.zoho.crm.api.RequestProxy;

/**
 * This module is to make HTTP connections, trigger the requests and receive the response.
 */
public class APIHTTPConnector
{
	private String url;
	
	private String requestMethod;
	
	private HashMap<String, String> headers = new HashMap<>();
	
	private HashMap<String, String> parameters = new HashMap<>();
	
	private Object requestBody;
	
	private String contentType;
	
	private static final Logger LOGGER = Logger.getLogger(SDKLogger.class.getName());
	
	/**
	 * This is a getter method to get the ContentType.
	 * @return A String representing the ContentType.
	 */
	public String getContentType()
	{
		return contentType;
	}

	/**
	 * This is a setter method to set the ContentType.
	 * @param contentType A String containing the ContentType.
	 */
	public void setContentType(String contentType)
	{
		this.contentType = contentType;
	}

	
	/**
	 * This is a setter method to set the API URL.
	 * @param url A String containing the API Request URL.
	 */
	public void setURL(String url)
	{
		this.url = url;
	}

	/**
	 * This is a setter method to set the API request method.
	 * @param httpMethod A String containing the API request method.
	 */
	public void setRequestMethod(String httpMethod)
	{
		this.requestMethod = httpMethod;
	}

	/**
	 * This is a getter method to get API request headers.
	 * @return A HashMap&lt;String, String&gt; representing the API request headers.
	 */
	public HashMap<String, String> getHeaders()
	{
		return headers;
	}
	
	/**
	 * This is a setter method to set API request headers.
	 * @param headers A HashMap&lt;String, String&gt; containing the API request headers.
	 */
	public void setHeaders(HashMap<String, String> headers)
	{
		this.headers = headers;
	}

	/**
	 * This method to add API request header name and value.
	 * @param headerName A String containing the API request header name.
	 * @param headerValue A String containing the API request header value.
	 */
	public void addHeader(String headerName, String headerValue)
	{
		this.headers.put(headerName, headerValue) ;
	}

	/**
	 * This is a getter method to get API request parameters.
	 * @return A HashMap&lt;String, String&gt; representing the API request parameters.
	 */
	public HashMap<String, String> getParams()
	{
		return parameters;
	}
	
	/**
	 * This is a setter method to set API request parameters.
	 * @param params A HashMap&lt;String, String&gt; containing the API request parameters.
	 */
	public void setParams(HashMap<String, String> params)
	{
		this.parameters = params;
	}
	
	/**
	 * This method to add API request param name and value.
	 * @param paramName A String containing the API request param name.
	 * @param paramValue A String containing the API request param value.
	 */
	public void addParam(String paramName, String paramValue)
	{
		this.parameters.put(paramName, paramValue) ;
	}

	/**
	 * This is a setter method to set the API request body.
	 * @param requestBody A Object containing the API request body.
	 */
	public void setRequestBody(Object requestBody)
	{
		this.requestBody = requestBody;
	}

	/**
	 * This method makes a Zoho CRM Rest API request.
	 * @param converterInstance A Converter class instance to call appendToRequest method. 
	 * @return HttpResponse class instance or null
	 * @throws Exception if a problem occurs.
	 */
	public HttpResponse fireRequest(Converter converterInstance) throws Exception
	{
		CloseableHttpClient httpclient = getHttpClient();
		
		URIBuilder uriBuilder = new URIBuilder(this.url);
		
		this.setQueryParams(uriBuilder);
		
		HttpUriRequest requestObj = getRequestObject(uriBuilder.build());
		
		if(this.contentType != null)
		{
			this.setContentTypeHeader();
		}
		
		if(this.requestBody != null)
		{
			HttpEntityEnclosingRequestBase requestBase = (HttpEntityEnclosingRequestBase) requestObj;
		
			converterInstance.appendToRequest(requestBase, this.requestBody);
		}
		
		this.setQueryHeaders(requestObj);
		
		LOGGER.log(Level.INFO, this.toString(uriBuilder));
		
		HttpResponse response = httpclient.execute(requestObj);
		
		return response;
	}

	private HttpUriRequest getRequestObject(URI urlPath) throws UnsupportedEncodingException
	{
		switch (this.requestMethod)
		{
			case "GET":
				return new HttpGet(urlPath);
			case "DELETE":
				return new HttpDelete(urlPath);
			case "POST":
				return new HttpPost(urlPath);
			case "PUT":
				return new HttpPut(urlPath);
			case "PATCH":
				return new HttpPatch(urlPath);
		}
		
		return null;
	}
	
	private CloseableHttpClient getHttpClient() throws NoSuchAlgorithmException
	{
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		
		RequestProxy requestProxy = Initializer.getInitializer().getRequestProxy();
				
		if(requestProxy != null)
		{
			String proxyHost = requestProxy.getHost();
			
			Integer proxyPort = requestProxy.getPort();
			
			HttpHost proxy = new HttpHost(proxyHost, proxyPort);
			
			if(requestProxy.getUser() != null)
			{
				CredentialsProvider credsProvider = new BasicCredentialsProvider();
				
				credsProvider.setCredentials(new AuthScope(proxyHost, proxyPort), new NTCredentials(requestProxy.getUser(), requestProxy.getPassword(), null, requestProxy.getUserDomain()));
				
				httpClientBuilder.setDefaultCredentialsProvider(credsProvider);
			}
			
			httpClientBuilder.setProxy(proxy);
			
			LOGGER.log(Level.INFO, this.proxyLog(requestProxy));
		}
		
		SSLContext sslContext = SSLContext.getDefault();
		
		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
		
		return httpClientBuilder.setSSLSocketFactory(sslConnectionSocketFactory).build();
	}

	private void setQueryHeaders(HttpUriRequest request)
	{
		HashMap<String, String> headersMap = this.headers;
		
		Iterator<String> headers = headersMap.keySet().iterator();
		
		while (headers.hasNext())
		{
			String header = (String) headers.next();
		
			request.addHeader(header, headersMap.get(header));
		}
	}

	private void setQueryParams(URIBuilder uriBuilder)
	{
		HashMap<String, String> paramsMap = this.parameters;
		
		Iterator<String> params = paramsMap.keySet().iterator();
		
		while (params.hasNext())
		{
			String param = (String) params.next();
		
			uriBuilder.addParameter(param, paramsMap.get(param));
		}
	}
	
	private void setContentTypeHeader()
	{
		for(String contentType : Constants.SET_TO_CONTENT_TYPE)
		{
			if(this.url.contains(contentType))
			{
				this.headers.put(HttpHeaders.CONTENT_TYPE, this.contentType);
				
				return;
			}
		}
	}
	
	public String toString(URIBuilder uriBuilder)
	{
		HashMap<String,String> reqHeaders = new HashMap<>();
		
		reqHeaders.putAll(this.headers);
		
		reqHeaders.put(Constants.AUTHORIZATION, Constants.CANT_DISCLOSE);
		
		return this.requestMethod.concat(" - ").concat(Constants.URL.concat(" = ").concat(uriBuilder.toString()).concat(" , ").concat(Constants.HEADERS).concat(" = ").concat(reqHeaders.toString()).concat(" , ").concat(Constants.PARAMS).concat(" = ").concat(this.parameters.toString()).concat("."));
	}
	
	private String proxyLog(RequestProxy requestProxy)
	{
		String proxyDetails = Constants.PROXY_SETTINGS + Constants.PROXY_HOST + requestProxy.getHost() + " , " + Constants.PROXY_PORT + requestProxy.getPort().toString();
		
		if(requestProxy.getUser() != null)
		{
			proxyDetails += " , " + Constants.PROXY_USER + requestProxy.getUser();
		}
		
		if(requestProxy.getUserDomain() != null)
		{
			proxyDetails += " , " + Constants.PROXY_DOMAIN + requestProxy.getUserDomain();
		}
		
		return proxyDetails;
	}
}