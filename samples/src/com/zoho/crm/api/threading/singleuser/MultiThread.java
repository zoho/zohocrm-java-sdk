package samples.src.com.zoho.crm.api.threading.singleuser;

import com.zoho.api.authenticator.OAuthToken;

import com.zoho.api.authenticator.Token;

import com.zoho.api.authenticator.OAuthToken.TokenType;

import com.zoho.api.authenticator.store.DBStore;

import com.zoho.api.authenticator.store.FileStore;

import com.zoho.api.authenticator.store.TokenStore;

import com.zoho.api.logger.Logger;

import com.zoho.crm.api.Initializer;

import com.zoho.crm.api.SDKConfig;

import com.zoho.crm.api.UserSignature;

import com.zoho.crm.api.dc.USDataCenter;

import com.zoho.crm.api.dc.DataCenter.Environment;

import com.zoho.crm.api.exception.SDKException;

import com.zoho.crm.api.record.RecordOperations;

import com.zoho.crm.api.util.APIResponse;

public class MultiThread extends Thread
{
	String moduleAPIName;
	
	public MultiThread(String moduleAPIName)
	{
		this.moduleAPIName = moduleAPIName;
	}
	
	public void run() 
    { 
        try
        { 
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
		
		TokenStore tokenstore = new FileStore("/Users/user_name/Documents/java_sdk_tokens.txt");
		
		Token token1 = new OAuthToken("clientId", "clientSecret", "REFRESH/GRANT token", TokenType.REFRESH/GRANT);
		
		String resourcePath = "/Users/user_name/Documents/javasdk-application";
		
		SDKConfig sdkConfig = new SDKConfig.Builder().setAutoRefreshFields(false).setPickListValidation(true).build();
		
		Initializer.initialize(user1, env, token1, tokenstore, sdkConfig, resourcePath, loggerInstance);
		
		MultiThread mtsu = new MultiThread("Deals");
		
		mtsu.start();
		 
		mtsu = new MultiThread("Leads");
		
		mtsu.start();
	}
}