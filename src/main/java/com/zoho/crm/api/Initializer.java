package com.zoho.crm.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONObject;

import com.zoho.api.authenticator.Token;
import com.zoho.api.authenticator.store.TokenStore;
import com.zoho.api.logger.SDKLogger;
import com.zoho.api.logger.Logger.Levels;
import com.zoho.crm.api.dc.DataCenter.Environment;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.Constants;

/**
 * The class to initialize Zoho CRM SDK.
 */
public class Initializer
{
	private static final Logger LOGGER = Logger.getLogger(SDKLogger.class.getName());
	
	private static final ThreadLocal<Initializer> LOCAL = new ThreadLocal<Initializer>();
	
	private static Initializer initializer;

	private Environment environment;
	
	private TokenStore store;
	
	private UserSignature user;
	
	private Token token;

	public static JSONObject jsonDetails;
	
	private String resourcePath;
	
	private RequestProxy requestProxy;
	
	private SDKConfig sdkConfig;
	
	/**
	 * The method to initialize the SDK.
	 * @param user A UserSignature class instance represents the CRM user.
	 * @param environment A Environment class instance containing the CRM API base URL and Accounts URL.
	 * @param token A Token class instance containing the OAuth client application information.
	 * @param store A TokenStore class instance containing the token store information.
	 * @param sdkConfig A SDKConfig class instance containing the configuration.
	 * @param resourcePath A String containing the absolute directory path to store user specific JSON files containing module fields information.
	 * @throws SDKException if a problem occurs.
	 */
	public static void initialize(UserSignature user, Environment environment, Token token, TokenStore store, SDKConfig sdkConfig, String resourcePath) throws SDKException
	{
		Initializer.initialize(user, environment, token, store, sdkConfig, resourcePath, null, null);
	}
	
	/**
	 * The method to initialize the SDK.
	 * @param user A UserSignature class instance represents the CRM user.
	 * @param environment A Environment class instance containing the CRM API base URL and Accounts URL.
	 * @param token A Token class instance containing the OAuth client application information.
	 * @param store A TokenStore class instance containing the token store information.
	 * @param sdkConfig A SDKConfig class instance containing the configuration.
	 * @param resourcePath A String containing the absolute directory path to store user specific JSON files containing module fields information.
	 * @param proxy An RequestProxy class instance containing the proxy properties of the user. 
	 * @throws SDKException if a problem occurs.
	 */
	public static void initialize(UserSignature user, Environment environment, Token token, TokenStore store, SDKConfig sdkConfig, String resourcePath, RequestProxy proxy) throws SDKException
	{
		Initializer.initialize(user, environment, token, store, sdkConfig, resourcePath, null, proxy);
	}
	
	/**
	 * This method to initialize the SDK.
	 * @param user A UserSignature class instance represents the CRM user.
	 * @param environment A Environment class instance containing the CRM API base URL and Accounts URL.
	 * @param token A Token class instance containing the OAuth client application information.
	 * @param store A TokenStore class instance containing the token store information.
	 * @param sdkConfig A SDKConfig class instance containing the configuration.
	 * @param resourcePath A String containing the absolute directory path to store user specific JSON files containing module fields information.
	 * @param logger A Logger class instance containing the log file path and Logger type.
	 * @throws SDKException if a problem occurs.
	 */
	public static void initialize(UserSignature user, Environment environment, Token token, TokenStore store, SDKConfig sdkConfig, String resourcePath, com.zoho.api.logger.Logger logger) throws SDKException
	{
		Initializer.initialize(user, environment, token, store, sdkConfig, resourcePath, logger, null);
	}

	/**
	 * This method to initialize the SDK.
	 * @param user A UserSignature class instance represents the CRM user.
	 * @param environment A Environment class instance containing the CRM API base URL and Accounts URL.
	 * @param token A Token class instance containing the OAuth client application information.
	 * @param store A TokenStore class instance containing the token store information.
	 * @param sdkConfig A SDKConfig class instance containing the configuration.
	 * @param resourcePath A String containing the absolute directory path to store user specific JSON files containing module fields information.
	 * @param logger A Logger class instance containing the log file path and Logger type.
	 * @param proxy An RequestProxy class instance containing the proxy properties of the user. 
	 * @throws SDKException if a problem occurs.
	 */
	public static void initialize(UserSignature user, Environment environment, Token token, TokenStore store, SDKConfig sdkConfig, String resourcePath, com.zoho.api.logger.Logger logger, RequestProxy proxy) throws SDKException
	{
		try
		{
			if (user == null)
			{
				throw new SDKException(Constants.INITIALIZATION_ERROR, Constants.USERSIGNATURE_ERROR_MESSAGE);
			}
			
			if(environment == null)
			{
				throw new SDKException(Constants.INITIALIZATION_ERROR, Constants.ENVIRONMENT_ERROR_MESSAGE);
			}
			
			if(token == null)
			{
				throw new SDKException(Constants.INITIALIZATION_ERROR, Constants.TOKEN_ERROR_MESSAGE);
			}
			
			if(store == null)
			{
				throw new SDKException(Constants.INITIALIZATION_ERROR, Constants.STORE_ERROR_MESSAGE);
			}
			
			if(sdkConfig == null)
			{
				throw new SDKException(Constants.INITIALIZATION_ERROR, Constants.SDK_CONFIG_ERROR_MESSAGE);
			}
			
			if(resourcePath == null || resourcePath.isEmpty())
			{
				throw new SDKException(Constants.INITIALIZATION_ERROR, Constants.RESOURCE_PATH_ERROR_MESSAGE);
			}
			
			if (logger == null)
			{
				String filePath = System.getProperty("user.dir") + File.separator + Constants.LOGFILE_NAME;

				logger = com.zoho.api.logger.Logger.getInstance(Levels.INFO, filePath);
			}
			
			SDKLogger.initialize(logger);

			try
			{
				jsonDetails = getJSONDetails();
			}
			catch (IOException e)
			{
				throw new SDKException(Constants.JSON_DETAILS_ERROR, e);
			}

			initializer = new Initializer();

			initializer.user = user;
			
			initializer.environment = environment;
			
			initializer.token = token;
			
			initializer.store = store;
			
			initializer.sdkConfig = sdkConfig;
			
			initializer.resourcePath = resourcePath;
			
			initializer.requestProxy = proxy;
			
			LOGGER.log(Level.INFO, Constants.INITIALIZATION_SUCCESSFUL.concat(initializer.toString()));
			
		}
		catch(SDKException e)
		{
			throw e;
		}
		catch (Exception e)
		{
			throw new SDKException(Constants.INITIALIZATION_EXCEPTION, e);
		}
	}

	/**
	 * This method to get POJO class information details.
	 * @return A JSONObject representing the class information details.
	 * @throws IOException if a problem occurs.
	 * @throws SDKException 
	 */
	private static JSONObject getJSONDetails() throws IOException, SDKException
	{
		InputStream is = null;
		
		InputStreamReader isr = null;
		
	    BufferedReader br = null;
	    
	    String line, fileContent = "";
	    
		try
		{
			is = Initializer.class.getResourceAsStream(Constants.JSON_DETAILS_FILE_PATH);
			
			isr = new InputStreamReader(is);
			
			br = new BufferedReader(isr);
			
			while ((line = br.readLine()) != null) 
		    {
		    	fileContent += line;
		    }
			
		}
		catch(Exception e)
		{
			throw new SDKException(Constants.EXCEPTION_JSONDETAILS, e);
		}
		finally
		{
			if(br != null)
			{
				br.close();
			}
			
			if(isr != null)
			{
				isr.close();
			}
			
			if(is != null)
			{
				is.close();
			}
			
		}
		
		return new JSONObject(fileContent);
	}

	/**
	 * This method to get record field information details.
	 * @param filePath A String containing the class information details file path.
	 * @return A JSONObject representing the class information details.
	 * @throws IOException if a problem occurs.
	 */
	public static JSONObject getJSON(String filePath) throws IOException
	{
		return new JSONObject(new String(Files.readAllBytes(Paths.get(filePath))));
	}

	/**
	 * This method to get Initializer class instance.
	 * @return A Initializer class instance representing the SDK configuration details.
	 */
	public static Initializer getInitializer()
	{
		if (LOCAL.get() != null)
		{
			return LOCAL.get();
		}

		return initializer;
	}
	
	/**
	 * The method to switch the different user in SDK environment.
	 * @param user A User class instance represents the CRM user.
	 * @param environment A Environment class instance containing the CRM API base URL and Accounts URL.
	 * @param token A Token class instance containing the OAuth client application information.
	 * @param sdkConfig A SDKConfig class instance containing the configuration.
	 * @throws SDKException 
	 */
	public static void switchUser(UserSignature user, Environment environment, Token token, SDKConfig sdkConfig) throws SDKException
	{
		Initializer.switchUser(user, environment, token, sdkConfig, null);
	}
	
	/**
	 * The method to switch the different user in SDK environment.
	 * @param user A User class instance represents the CRM user.
	 * @param environment A Environment class instance containing the CRM API base URL and Accounts URL.
	 * @param token A Token class instance containing the OAuth client application information.
	 * @param sdkConfig A SDKConfig class instance containing the configuration.
	 * @param proxy An RequestProxy class instance containing the proxy properties of the user.
	 * @throws SDKException 
	 */
	public static void switchUser(UserSignature user, Environment environment, Token token, SDKConfig sdkConfig, RequestProxy proxy) throws SDKException
	{
		if (user == null)
		{
			throw new SDKException(Constants.SWITCH_USER_ERROR, Constants.USERSIGNATURE_ERROR_MESSAGE);
		}
		
		if(environment == null)
		{
			throw new SDKException(Constants.SWITCH_USER_ERROR, Constants.ENVIRONMENT_ERROR_MESSAGE);
		}
		
		if(token == null)
		{
			throw new SDKException(Constants.SWITCH_USER_ERROR, Constants.TOKEN_ERROR_MESSAGE);
		}
		
		if(sdkConfig == null)
		{
			throw new SDKException(Constants.SWITCH_USER_ERROR, Constants.SDK_CONFIG_ERROR_MESSAGE);
		}
		
		Initializer initializer = new Initializer();
		
		initializer.user = user;
		
		initializer.environment = environment;
		
		initializer.token = token;
		
		initializer.store = Initializer.initializer.store;
		
		initializer.sdkConfig = sdkConfig;
		
		initializer.resourcePath = Initializer.initializer.resourcePath;
		
		initializer.requestProxy = proxy;
		
		LOCAL.set(initializer);
		
		LOGGER.log(Level.INFO, Constants.INITIALIZATION_SWITCHED.concat(initializer.toString()));
	}

	/**
	 * This is a getter method to get API environment.
	 * @return A Environment representing the API environment.
	 */
	public Environment getEnvironment()
	{
		return environment;
	}

	/**
	 * This is a getter method to get API Token Store.
	 * @return A TokenStore class instance containing the token store information.
	 */
	public TokenStore getStore()
	{
		return store;
	}

	/**
	 * This is a getter method to get CRM User.
	 * @return A UserSignature class instance representing the CRM user.
	 */
	public UserSignature getUser()
	{
		return user;
	}

	/**
	 * This is a getter method to get OAuth client application information.
	 * @return A Token class instance representing the OAuth client application information.
	 */
	public Token getToken()
	{
		return token;
	}
	
	public String getResourcePath()
	{
		return resourcePath;
	}
	
	/**
	 * This is a getter method to get Proxy information.
	 * @return A RequestProxy class instance representing the API Proxy information.
	 */
	public RequestProxy getRequestProxy()
	{
		return requestProxy;
	}
	
	/**
	 * This is a getter method to get the SDK Configuration
	 * @return A SDKConfig instance representing the configuration
	 */
	public SDKConfig getSDKConfig()
	{
		return sdkConfig;
	}

	@Override
	protected void finalize() throws Throwable
	{
		LOCAL.remove();
	}
	
	public String toString()
	{
		return Constants.FOR_EMAIL_ID.concat(getInitializer().getUser().getEmail()).concat(Constants.IN_ENVIRONMENT).concat(getInitializer().getEnvironment().getUrl()).concat(".");
	}
}