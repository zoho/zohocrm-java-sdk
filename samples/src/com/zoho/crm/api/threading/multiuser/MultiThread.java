package samples.src.com.zoho.crm.api.threading.multiuser;

import com.zoho.api.authenticator.OAuthToken;

import com.zoho.api.authenticator.Token;

import com.zoho.api.authenticator.OAuthToken.TokenType;

import com.zoho.api.authenticator.store.DBStore;

import com.zoho.api.authenticator.store.TokenStore;

import com.zoho.api.logger.Logger;

import com.zoho.crm.api.Initializer;

import com.zoho.crm.api.RequestProxy;

import com.zoho.crm.api.SDKConfig;

import com.zoho.crm.api.UserSignature;

import com.zoho.crm.api.dc.USDataCenter;

import com.zoho.crm.api.dc.EUDataCenter;

import com.zoho.crm.api.dc.DataCenter.Environment;

import com.zoho.crm.api.exception.SDKException;

import com.zoho.crm.api.record.RecordOperations;

import com.zoho.crm.api.util.APIResponse;

public class MultiThread extends Thread
{
	Environment environment;
	
	UserSignature user;
	
	Token token;
	
	String moduleAPIName;
	
	RequestProxy userProxy;
	
	SDKConfig sdkConfig;
	
	public MultiThread(UserSignature user, Environment environment, Token token, String moduleAPIName, SDKConfig config, RequestProxy proxy)
	{
		this.environment= environment;
		
		this.user = user;
		
		this.token = token;
		
		this.moduleAPIName = moduleAPIName;
		
		this.sdkConfig = config;
		
		this.userProxy = proxy;
	}
	
	public void run() 
    { 
        try
        { 
        	Initializer.switchUser(user, environment, token, sdkConfig, userProxy);
        	
        	System.out.println(Initializer.getInitializer().getUser().getEmail());
        	
        	RecordOperations cro = new RecordOperations();
        	
    		@SuppressWarnings("rawtypes")
			APIResponse getResponse = cro.getRecords(this.moduleAPIName, null, null);
  
    		System.out.println(getResponse.getObject());
    		
        } 
        catch (Exception e) 
        { 
            e.printStackTrace();
        } 
    } 
	
	
	public static void main(String[] args) throws SDKException
	{
		
		Logger loggerInstance = Logger.getInstance(Logger.Levels.ALL, "/Users/user_name/Documents/java_sdk_log.log");
		
		Environment env = USDataCenter.PRODUCTION;
		
		UserSignature user1 = new UserSignature("abc@zoho.com");
		
		TokenStore tokenstore = new DBStore();
		
		Token token1 = new OAuthToken("clientId1", "clientSecret1", "REFRESH/GRANT token", TokenType.REFRESH/GRANT);
		
		String resourcePath = "/Users/user_name/Documents/javasdk-application";
		
		SDKConfig user1Config = new SDKConfig.Builder().setAutoRefreshFields(false).setPickListValidation(true).build();
    	
		Initializer.initialize(user1, env, token1, tokenstore, user1Config, resourcePath, loggerInstance);
		
		MultiThread multiThread = new MultiThread(user1, env, token1, "Students", user1Config, null);
		
		multiThread.start();
		
		Environment environment = EUDataCenter.PRODUCTION;
		
		UserSignature user2 = new UserSignature("xyz@zoho.com");
		
		Token token2 = new OAuthToken("clientId2", "clientSecret2", "REFRESH/GRANT token", TokenType.REFRESH/GRANT);
		
		RequestProxy user2Proxy = new RequestProxy("proxyHost", 80, "proxyUser", "password", "userDomain");
		
		SDKConfig user2Config = new SDKConfig.Builder().setAutoRefreshFields(true).setPickListValidation(false).build();
		
		multiThread = new MultiThread(user2, environment, token2, "Leads", user2Config, user2Proxy);
		
		multiThread.start();
		
	}
}

