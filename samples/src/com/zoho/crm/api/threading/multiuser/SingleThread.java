package samples.src.com.zoho.crm.api.threading.multiuser;

import com.zoho.api.authenticator.OAuthToken;

import com.zoho.api.authenticator.Token;

import com.zoho.api.authenticator.OAuthToken.TokenType;

import com.zoho.api.authenticator.store.DBStore;

import com.zoho.api.authenticator.store.TokenStore;

import com.zoho.api.logger.Logger;

import com.zoho.crm.api.Initializer;

import com.zoho.crm.api.SDKConfig;

import com.zoho.crm.api.UserSignature;

import com.zoho.crm.api.dc.USDataCenter;

import com.zoho.crm.api.dc.DataCenter.Environment;

import com.zoho.crm.api.record.RecordOperations;

import com.zoho.crm.api.util.APIResponse;

public class SingleThread
{
	Environment environment;
	
	UserSignature user;
	
	Token token;
	
	String moduleAPIName;
	
	SDKConfig sdkConfig;
	
	public SingleThread( String moduleAPIName)
	{
		this.moduleAPIName = moduleAPIName;
	}
	
	public SingleThread(UserSignature user, Environment environment, Token token,  String moduleAPIName, SDKConfig config)
	{
		this.environment= environment;
		
		this.user = user;
		
		this.token = token;
		
		this.moduleAPIName = moduleAPIName;
		
		this.sdkConfig = config;
	}
	
	public void run() 
    { 
        try
        { 
        	Initializer.switchUser(user, environment, token, sdkConfig);
        	
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
	
	public static void main(String[] args) throws Exception
	{
		Logger loggerInstance = Logger.getInstance(Logger.Levels.ALL, "/Users/user_name/Documents/java_sdk_log.log");
		
		Environment env = USDataCenter.PRODUCTION;
		
		UserSignature user1 = new UserSignature("abc@zoho.com");
		
		TokenStore tokenstore = new DBStore();
		
		Token token1 = new OAuthToken("clientId1", "clientSecret1", "REFRESH/GRANT token", TokenType.REFRESH/GRANT, "https://crm.zoho.com");
		
		String resourcePath = "/Users/user_name/Documents/javasdk-application";
		
		SDKConfig sdkConfig = new SDKConfig.Builder().setAutoRefreshFields(false).setPickListValidation(true).build();
		
		Initializer.initialize(user1, env, token1, tokenstore, sdkConfig, resourcePath, loggerInstance);
		
		SingleThread singleThread = new SingleThread(user1, env, token1, "Students", sdkConfig);
		
		singleThread.run();
		
		Environment environment = EUDataCenter.PRODUCTION;
		
		UserSignature user2 = new UserSignature("xyz@zoho.com");
		
		Token token2 = new OAuthToken("clientId2", "clientSecret2", "REFRESH/GRANT token", TokenType.REFRESH/GRANT);
		
		singleThread = new SingleThread(user2, environment, token2, "Leads", sdkConfig);
		
		singleThread.run();
	}
}
