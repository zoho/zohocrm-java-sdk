package samples.src.com.zoho.crm.api.threading.singleuser;

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

import com.zoho.crm.api.dc.DataCenter.Environment;

import com.zoho.crm.api.exception.SDKException;

import com.zoho.crm.api.record.RecordOperations;

import com.zoho.crm.api.util.APIResponse;

public class SingleThread extends Thread
{
	String moduleAPIName;
	
	public SingleThread(String moduleAPIName)
	{
		this.moduleAPIName = moduleAPIName;
	}
	
	public void run() 
    { 
        try
        { 
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
		
		UserSignature user = new UserSignature("abc@zoho.com");
		
		TokenStore tokenstore = new DBStore();
		
		Token token1 = new OAuthToken("clientId", "clientSecret", "REFRESH/GRANT token", TokenType.REFRESH/GRANT, "https://crm.zoho.com");
		
		String resourcePath = "/Users/user_name/Documents/javasdk-application";
		
		RequestProxy userProxy = new RequestProxy("proxyHost", 80, "proxyUser", "password", "userDomain");
		
		SDKConfig sdkConfig = new SDKConfig.Builder().setAutoRefreshFields(false).setPickListValidation(true).build();
		
		Initializer.initialize(user, env, token1, tokenstore, sdkConfig, resourcePath, loggerInstance, userProxy);
		
		SingleThread stsu = new SingleThread("Leads");
		
		stsu.start();
	}
}
