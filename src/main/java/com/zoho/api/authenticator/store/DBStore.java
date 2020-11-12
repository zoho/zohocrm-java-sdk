package com.zoho.api.authenticator.store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zoho.api.authenticator.OAuthToken;
import com.zoho.api.authenticator.Token;
import com.zoho.api.authenticator.OAuthToken.TokenType;
import com.zoho.crm.api.UserSignature;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.Constants;

/**
 * This class stores the user token details to the MySQL DataBase.
 */
public class DBStore implements TokenStore
{
	private String userName;
	
	private String portNumber;
	
	private String password;
	
	private String host;
	
	private String databaseName;
	
	private String connectionString;
	
	/**
	 * Create a DBStore class instance with the following default values
	 * host -> localhost
	 * databaseName -> zohooauth
	 * userName -> root
	 * password -> ""
	 * portNumber -> 3306
	 */
	public DBStore()
	{
		this(null, null, null, null, null);
	}

	/**
	 * Creates a DBStore class instance with the specified parameters.
	 * @param host A String containing the DataBase host name.
	 * @param databaseName A String containing the DataBase name.
	 * @param userName A String containing the DataBase user name.
	 * @param password A String containing the DataBase password.
	 * @param portNumber A String containing the DataBase port number.
	 */
	public DBStore(String host, String databaseName, String userName, String password, String portNumber)
	{
		this.host = host != null ? host : Constants.MYSQL_HOST;
		
		this.databaseName = databaseName != null ? databaseName : Constants.MYSQL_DATABASE_NAME;
		
		this.userName = userName != null ? userName : Constants.MYSQL_USER_NAME;
		
		this.password = password != null ? password : "";
		
		this.portNumber = portNumber != null ? portNumber : Constants.MYSQL_PORT_NUMBER;
		
		this.connectionString = Constants.MYSQL_DRIVER + this.host + ":" + this.portNumber + "/" + this.databaseName + "?allowPublicKeyRetrieval=true&useSSL=false";
	}

	@Override
	public Token getToken(UserSignature user, Token token) throws SDKException
	{
		try
		{
			Class.forName(Constants.JDBC_DRIVER_NAME);
			
			try(Connection connection = DriverManager.getConnection(connectionString, userName, password);)
			{
				if(token instanceof OAuthToken)
				{
					OAuthToken oauthToken = (OAuthToken) token;
					
					try(Statement statement = connection.createStatement();)
					{
						String query = constructDBQuery(user.getEmail(), oauthToken, false);
						
						try(ResultSet result = statement.executeQuery(query);)
						{
							while (result.next())
							{
								oauthToken.setAccessToken(result.getString(5));
								
								oauthToken.setExpiresIn(String.valueOf(result.getString(7)));
								
								oauthToken.setRefreshToken(result.getString(4));
								
								return oauthToken;
							}
						}
					}
				}
			}
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.GET_TOKEN_DB_ERROR, ex);
		}

		return null;
	}

	@Override
	public void saveToken(UserSignature user, Token token) throws SDKException
	{
		try
		{
			Class.forName(Constants.JDBC_DRIVER_NAME);
			
			try(Connection connection = DriverManager.getConnection(this.connectionString, this.userName, this.password);)
			{
				if(token instanceof OAuthToken)
				{
					OAuthToken oauthToken = (OAuthToken) token;
					
					oauthToken.setUserMail(user.getEmail());
					
					this.deleteToken(oauthToken);
					
					try(PreparedStatement statement = connection.prepareStatement("insert into oauthtoken(user_mail, client_id, refresh_token, access_token, grant_token, expiry_time) values(?,?,?,?,?,?)");)
					{
						statement.setString(1, user.getEmail());
				
						statement.setString(2, oauthToken.getClientID());
						
						statement.setString(3, oauthToken.getRefreshToken());
						
						statement.setString(4, oauthToken.getAccessToken());
						
						statement.setString(5, oauthToken.getGrantToken());
						
						statement.setString(6, oauthToken.getExpiresIn());
						
						statement.executeUpdate();
					}
				}
			}
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.SAVE_TOKEN_DB_ERROR, ex);
		}
	}

	@Override
	public void deleteToken(Token token) throws SDKException
	{
		try
		{
			Class.forName(Constants.JDBC_DRIVER_NAME);
			
			try(Connection connection = DriverManager.getConnection(this.connectionString, this.userName, this.password);)
			{
				if(token instanceof OAuthToken)
				{
					String query = constructDBQuery(((OAuthToken) token).getUserMail(), (OAuthToken) token, true);
					
					try(PreparedStatement statement = connection.prepareStatement(query);)
					{
						statement.executeUpdate();
					}
				}
			}
		}
		catch(SDKException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.DELETE_TOKEN_DB_ERROR, ex);
		}
	}
	
	@Override
	public List<Token> getTokens() throws SDKException
	{
		List<Token> tokens = new ArrayList<Token>();
		
		try
		{
			Class.forName(Constants.JDBC_DRIVER_NAME);
			
			try(Connection connection = DriverManager.getConnection(connectionString, userName, password);)
			{
				try(Statement statement = connection.createStatement();)
				{
					String query = "select * from oauthtoken;";
					
					try(ResultSet result = statement.executeQuery(query);)
					{
						while (result.next())
						{
							TokenType tokenType = (result.getString(6) != null && !result.getString(6).equalsIgnoreCase(Constants.NULL_VALUE) && !result.getString(6).isEmpty()) ? TokenType.GRANT : TokenType.REFRESH;
							
							String tokenValue = tokenType.equals(TokenType.REFRESH) ? result.getString(4) : result.getString(6);
							
							OAuthToken token = new OAuthToken(result.getString(3), null, tokenValue, tokenType);
							
							token.setId(result.getString(1));
							
							token.setUserMail(result.getString(2));
							
							token.setRefreshToken(result.getString(4));
							
							token.setAccessToken(result.getString(5));
							
							token.setExpiresIn(String.valueOf(result.getString(7)));
							
							tokens.add(token);
						}
					}
				}
			}
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.GET_TOKENS_DB_ERROR, ex);
		}

		return tokens;
	}
	
	@Override
	public void deleteTokens() throws SDKException
	{
		try
		{
			Class.forName(Constants.JDBC_DRIVER_NAME);
			
			try(Connection connection = DriverManager.getConnection(this.connectionString, this.userName, this.password);)
			{
				String query = "delete from oauthtoken";
				
				try(PreparedStatement statement = connection.prepareStatement(query);)
				{
					statement.executeUpdate();
				}
			}
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.DELETE_TOKENS_DB_ERROR, ex);
		}
	}

	private String constructDBQuery(String email, OAuthToken token, boolean isDelete) throws SDKException
	{
		if(email == null)
		{
			throw new SDKException(Constants.USER_MAIL_NULL_ERROR, Constants.USER_MAIL_NULL_ERROR_MESSAGE);
		}
		
		String query = isDelete ? "delete from " : "select * from ";
		
		query += "oauthtoken where user_mail='" + email + "' and client_id='" + token.getClientID() + "' and ";

		if (token.getGrantToken() != null)
		{
			query += "grant_token='" + token.getGrantToken() + "'";
		}
		else
		{
			query += "refresh_token='" + token.getRefreshToken() + "'";
		}

		return query;
	}
}