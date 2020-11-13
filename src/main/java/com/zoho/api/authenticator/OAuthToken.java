package com.zoho.api.authenticator;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.zoho.api.authenticator.store.TokenStore;
import com.zoho.api.logger.SDKLogger;
import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.UserSignature;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIHTTPConnector;
import com.zoho.crm.api.util.Constants;

/**
 * This class maintains the tokens and authenticates every request.
 */
public class OAuthToken implements Token
{

	private static final Logger LOGGER = Logger.getLogger(SDKLogger.class.getName());

	/**
	 * This enum contains different types of token.
	 */
	public static enum TokenType
	{
		GRANT, REFRESH
	};

	private String clientID;
	
	private String clientSecret;
	
	private String redirectURL;
	
	private String grantToken;
	
	private String refreshToken;
	
	private String accessToken;
	
	private String expiresIn;
	
	private String userMail;
	
	private String id;
	
	/**
	 * Creates an OAuthToken class instance with the specified parameters.
	 * @param clientID A String containing the OAuth client id.
	 * @param clientSecret A String containing the OAuth client secret.
	 * @param token A String containing the REFRESH/GRANT token.
	 * @param type An enum containing the given token type.
	 */
	public OAuthToken(String clientID, String clientSecret, String token, TokenType type)
	{
		this(clientID, clientSecret, token, type, null);
	}

	/**
	 * Creates an OAuthToken class instance with the specified parameters.
	 * @param clientID A String containing the OAuth client id.
	 * @param clientSecret A String containing the OAuth client secret.
	 * @param token A String containing the REFRESH/GRANT token.
	 * @param type An enum containing the given token type.
	 * @param redirectURL A String containing the OAuth redirect URL.
	 */
	public OAuthToken(String clientID, String clientSecret, String token, TokenType type, String redirectURL)
	{
		this.clientID = clientID;
		
		this.clientSecret = clientSecret;
		
		this.grantToken = type.equals(TokenType.GRANT) ? token : null;
		
		this.refreshToken = type.equals(TokenType.REFRESH) ? token : null;
		
		this.redirectURL = redirectURL;
	}

	/**
	 * This is a getter method to get OAuth client id.
	 * @return A String representing the OAuth client id.
	 */
	public String getClientID()
	{
		return clientID;
	}

	/**
	 * This is a getter method to get OAuth client secret.
	 * @return A String representing the OAuth client secret.
	 */
	public String getClientSecret()
	{
		return clientSecret;
	}

	/**
	 * This is a getter method to get OAuth redirect URL.
	 * @return A String representing the OAuth redirect URL.
	 */
	public String getRedirectURL()
	{
		return redirectURL;
	}

	/**
	 * This is a getter method to get grant token.
	 * @return A String representing the grant token.
	 */
	public String getGrantToken()
	{
		return grantToken;
	}

	/**
	 * This is a getter method to get refresh token.
	 * @return A String representing the refresh token.
	 */
	public String getRefreshToken()
	{
		return refreshToken;
	}

	/**
	 * This is a setter method to set refresh token.
	 * @param refreshToken A String containing the refresh token.
	 */
	public void setRefreshToken(String refreshToken)
	{
		this.refreshToken = refreshToken;
	}

	/**
	 * This is a getter method to get access token.
	 * @return A String representing the access token.
	 */
	public String getAccessToken()
	{
		return accessToken;
	}

	/**
	 * This is a setter method to set access token.
	 * @param accessToken A String containing the access token.
	 */
	public void setAccessToken(String accessToken)
	{
		this.accessToken = accessToken;
	}

	/**
	 * This is a getter method to get token expire time.
	 * @return A String representing the token expire time.
	 */
	public String getExpiresIn()
	{
		return expiresIn;
	}

	/**
	 * This is a setter method to set token expire time.
	 * @param expiresIn A String containing the token expire time.
	 */
	public void setExpiresIn(String expiresIn)
	{
		this.expiresIn = expiresIn;
	}

	/**
	 * This is a getter method to get token user mail.
	 * 
	 * @return the userMail
	 */
	public String getUserMail()
	{
		return userMail;
	}

	/**
	 * This is a setter method to set token user email.
	 * 
	 * @param userMail the userMail to set
	 */
	public void setUserMail(String userMail)
	{
		this.userMail = userMail;
	}

	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	@Override
	public synchronized void authenticate(APIHTTPConnector urlConnection) throws SDKException
	{
		Initializer initializer = Initializer.getInitializer();

		TokenStore store = initializer.getStore();
		
		UserSignature user = initializer.getUser();

		OAuthToken oauthToken = (OAuthToken) store.getToken(initializer.getUser(), this);

		String token = "";

		if (oauthToken == null)
		{
			token = this.refreshToken != null ? refreshAccessToken(user, store).getAccessToken() : generateAccessToken(user, store).getAccessToken();
		}
		else if ((Long.valueOf(oauthToken.getExpiresIn()) - System.currentTimeMillis()) < 5000)
		{
			LOGGER.log(Level.INFO, Constants.REFRESH_TOKEN_MESSAGE);
			
			token = oauthToken.refreshAccessToken(user, store).getAccessToken();
		}
		else
		{
			token = oauthToken.getAccessToken();
		}

		urlConnection.addHeader(Constants.AUTHORIZATION, Constants.OAUTH_HEADER_PREFIX + token);
	}

	private String getResponseFromServer(HashMap<String, String> requestParams) throws SDKException
	{
		try
		{
			final String USER_AGENT = Constants.USER_AGENT;

			String url = Initializer.getInitializer().getEnvironment().getAccountsUrl();

			HttpClient client = getHttpClient();
			
			HttpPost post = new HttpPost(url);

			post.setHeader(Constants.USER_AGENT_KEY, USER_AGENT);

			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

			/*
			 * Set request Parameters
			 */
			if (requestParams != null && !requestParams.isEmpty())
			{
				for (String key : requestParams.keySet())
				{
					String value = requestParams.get(key);

					if (value != null)
					{
						urlParameters.add(new BasicNameValuePair(key, value));
					}
				}
			}

			post.setEntity(new UrlEncodedFormEntity(urlParameters));

			return EntityUtils.toString(client.execute(post).getEntity());
		}
		catch (NoSuchAlgorithmException | IOException ex)
		{
			throw new SDKException(ex);
		}
	}

	private CloseableHttpClient getHttpClient() throws NoSuchAlgorithmException
	{
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		
		SSLContext sslContext = SSLContext.getDefault();
		
		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
		
		return httpClientBuilder.setSSLSocketFactory(sslConnectionSocketFactory).build();
	}

	private OAuthToken refreshAccessToken(UserSignature user, TokenStore store) throws SDKException
	{
		HashMap<String, String> requestParams = new HashMap<String, String>();

		requestParams.put(Constants.CLIENT_ID, this.clientID);
		
		requestParams.put(Constants.CLIENT_SECRET, this.clientSecret);
		
		requestParams.put(Constants.REDIRECT_URL, this.redirectURL);
		
		requestParams.put(Constants.GRANT_TYPE, Constants.REFRESH_TOKEN);
		
		requestParams.put(Constants.REFRESH_TOKEN, this.refreshToken);

		String response = getResponseFromServer(requestParams);

		try
		{
			store.saveToken(user, parseResponse(response));
		}
		catch (SDKException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.SAVE_TOKEN_ERROR, ex);
		}

		return this;
	}

	private OAuthToken generateAccessToken(UserSignature user, TokenStore store) throws SDKException
	{
		HashMap<String, String> requestParams = new HashMap<String, String>();

		requestParams.put(Constants.CLIENT_ID, this.clientID);
		
		requestParams.put(Constants.CLIENT_SECRET, this.clientSecret);
		
		requestParams.put(Constants.REDIRECT_URL, this.redirectURL);
		
		requestParams.put(Constants.GRANT_TYPE, Constants.GRANT_TYPE_AUTH_CODE);
		
		requestParams.put(Constants.CODE, this.grantToken);

		String response = getResponseFromServer(requestParams);

		try
		{
			store.saveToken(user, parseResponse(response));
		}
		catch (SDKException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.SAVE_TOKEN_ERROR, ex);
		}

		return this;
	}

	private OAuthToken parseResponse(String response) throws SDKException
	{
		JSONObject responseJSON = new JSONObject(response);
		
		if (!responseJSON.has(Constants.ACCESS_TOKEN))
		{
			throw new SDKException(Constants.INVALID_CLIENT_ERROR, responseJSON.getString(Constants.ERROR_KEY));
		}
		
		this.setAccessToken(responseJSON.getString(Constants.ACCESS_TOKEN));
		
		this.setExpiresIn(String.valueOf(this.getTokenExpiresIn(responseJSON)));
		
		if (responseJSON.has(Constants.REFRESH_TOKEN))
		{
			this.refreshToken = responseJSON.getString(Constants.REFRESH_TOKEN);
		}
		
		return this;
	}

	private Long getTokenExpiresIn(JSONObject response)
	{
		return System.currentTimeMillis() + (response.has(Constants.EXPIRES_IN_SEC) ? response.getLong(Constants.EXPIRES_IN) : response.getInt(Constants.EXPIRES_IN) * 1000);
	}
	
	/**
	 * The method to remove the current token from the Store.
	 * @throws SDKException 
	 */
	public Boolean remove() throws SDKException
	{
		try
		{
			Initializer.getInitializer().getStore().deleteToken(this);
			
			return true;
		}
		catch(SDKException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{
			throw new SDKException(ex);
		}
	}
}
