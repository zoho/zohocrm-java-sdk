package com.zoho.crm.api;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.Constants;

/**
 * This class represents the properties of proxy for the user.
 */
public class RequestProxy
{
	private String host;
	
	private Integer port;
	
	private String userDomain;
	
	private String user;
	
	private String password;
	
	/**
	 * Creates a RequestProxy class instance with the specified parameters.
	 * @param host A String containing the hostname or address of the proxy server
	 * @param port A Integer containing The port number of the proxy server
	 * @throws SDKException
	 */
	public RequestProxy(String host, Integer port) throws SDKException
	{
		this(host, port, null, null, null);
	}
	
	/**
	 * Creates a RequestProxy class instance with the specified parameters.
	 * @param host A String containing the hostname or address of the proxy server
	 * @param port A Integer containing The port number of the proxy server
	 * @param user A String containing the user name of the proxy server
	 * @param password A String containing the password of the proxy server
	 * @throws SDKException
	 */
	public RequestProxy(String host, Integer port, String user, String password) throws SDKException
	{
		this(host, port, user, password, null);
	}

	/**
	 * Creates a RequestProxy class instance with the specified parameters.
	 * @param host A String containing the hostname or address of the proxy server
	 * @param port A Integer containing The port number of the proxy server
	 * @param user A String containing the user name of the proxy server
	 * @param password A String containing the password of the proxy server
	 * @param userDomain A String containing the domain of the proxy server
	 * @throws SDKException
	 */
	public RequestProxy(String host, Integer port, String user, String password, String userDomain) throws SDKException
	{
		if(host == null)
		{
			throw new SDKException(Constants.REQUEST_PROXY_ERROR, Constants.HOST_ERROR_MESSAGE);
		}
		
		if(port == null)
		{
			throw new SDKException(Constants.REQUEST_PROXY_ERROR, Constants.PORT_ERROR_MESSAGE);
		}
		
		this.host = host;
		
		this.port = port;
		
		this.userDomain = userDomain;
		
		this.user = user;
		
		this.password = password != null ? password : "";
	}

	/**
	 * This is a getter method to get Proxy host.
	 * @return the host
	 */
	public String getHost()
	{
		return host;
	}

	/**
	 * This is a getter method to get Proxy port.
	 * @return the port
	 */
	public Integer getPort()
	{
		return port;
	}

	/**
	 * This is a getter method to get Proxy userDomain.
	 * @return the userDomain
	 */
	public String getUserDomain()
	{
		return userDomain;
	}

	/**
	 * This is a getter method to get Proxy user name.
	 * @return the user
	 */
	public String getUser()
	{
		return user;
	}

	/**
	 * This is a getter method to get Proxy password.
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
}
