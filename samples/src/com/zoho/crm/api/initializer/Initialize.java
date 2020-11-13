package samples.src.com.zoho.crm.api.initializer;

import com.zoho.api.authenticator.OAuthToken;
import com.zoho.api.authenticator.Token;
import com.zoho.api.authenticator.OAuthToken.TokenType;
import com.zoho.api.authenticator.store.DBStore;
import com.zoho.api.authenticator.store.FileStore;

import com.zoho.api.authenticator.store.TokenStore;
import com.zoho.api.logger.Logger;
import com.zoho.api.logger.Logger.Levels;
import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.RequestProxy;
import com.zoho.crm.api.SDKConfig;
import com.zoho.crm.api.UserSignature;
import com.zoho.crm.api.dc.DataCenter.Environment;
import com.zoho.crm.api.dc.USDataCenter;

public class Initialize
{
	public static void main(String[] args) throws Exception
	{
		initialize();
	}
	
	public static void initialize() throws Exception
	{
		/*
		 * Create an instance of Logger Class that takes two parameters
		 * 1 -> Level of the log messages to be logged. Can be configured by typing Levels "." and choose any level from the list displayed.
		 * 2 -> Absolute file path, where messages need to be logged.
		 */
		Logger logger = Logger.getInstance(Levels.INFO, "/Users/user_name/Documents/java_sdk_log.log");
		
		//Create an UserSignature instance that takes user Email as parameter
		UserSignature user = new UserSignature("abc@zoho.com");
		
		/*
		 * Configure the environment
		 * which is of the pattern Domain.Environment
		 * Available Domains: USDataCenter, EUDataCenter, INDataCenter, CNDataCenter, AUDataCenter
		 * Available Environments: PRODUCTION, DEVELOPER, SANDBOX
		 */
		Environment environment = USDataCenter.PRODUCTION;
		
		/*
		 * Create a Token instance
		 * 1 -> OAuth client id.
		 * 2 -> OAuth client secret.
		 * 3 -> REFRESH/GRANT token.
		 * 4 -> token type.
		 * 5 -> OAuth redirect URL.
		 */
		Token token = new OAuthToken("clientId", "clientSecret", "REFRESH/GRANT token", TokenType.REFRESH/GRANT, "redirectURL");
		
		/*
		 * Create an instance of TokenStore.
		 * 1 -> DataBase host name. Default "jdbc:mysql://localhost"
		 * 2 -> DataBase name. Default "zohooauth"
		 * 3 -> DataBase user name. Default "root"
		 * 4 -> DataBase password. Default ""
		 * 5 -> DataBase port number. Default "3306"
		 */
		//TokenStore tokenstore = new DBStore();
		
		TokenStore tokenstore = new DBStore("hostName", "dataBaseName", "userName", "password", "portNumber");
		
//		TokenStore tokenstore = new FileStore("absolute_file_path");
		
		SDKConfig config = new SDKConfig.Builder().setAutoRefreshFields(true).setPickListValidation(false).build();
		
		String resourcePath = "/Users/user_name/Documents/javasdk-application";
		
		/*
		 * Create an instance of RequestProxy
		 * 1 -> proxyHost
		 * 2 -> proxyPort
		 * 3 -> proxyUser
		 * 4 -> password
		 * 5 -> userDomain
		 */
		RequestProxy requestProxy = new RequestProxy("proxyHost", 80, "proxyUser", "password", "userDomain");
		
		/*
		 * Call static initialize method of Initializer class that takes the arguments
		 * 1 -> UserSignature instance
		 * 2 -> Environment instance
		 * 3 -> Token instance
		 * 4 -> TokenStore instance
		 * 5 -> SDKConfig instance
		 * 5 -> The path containing the absolute directory path to store user specific JSON files containing module fields information.
		 * 7 -> Logger instance (Optional)
		 * 8 -> RequestProxy instance (Optional)
		 */
		Initializer.initialize(user, environment, token, tokenstore, config, resourcePath);
		
//		token.remove();
	}
}

