package com.zoho.api.authenticator.store;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import com.zoho.api.authenticator.OAuthToken;
import com.zoho.api.authenticator.Token;
import com.zoho.api.authenticator.OAuthToken.TokenType;
import com.zoho.crm.api.UserSignature;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.Constants;

/**
 * This class stores the user token details to the file.
 */
public class FileStore implements TokenStore
{
	private String filePath;
	
	private String[] headers = new String[] { Constants.USER_MAIL, Constants.CLIENT_ID, Constants.REFRESH_TOKEN, Constants.ACCESS_TOKEN, Constants.GRANT_TOKEN, Constants.EXPIRY_TIME };
	
	/**
	 * Creates an FileStore class instance with the specified parameters.
	 * @param filePath A String containing the absolute file path to store tokens.
	 * @throws Exception if a problem occurs.
	 */
	public FileStore(String filePath) throws Exception
	{
		this.filePath = filePath;
		
		CSVWriter csvWriter = new CSVWriter(new FileWriter(new File(this.filePath), true));
		
		FileReader fileReader = new FileReader(this.filePath);
		
		if (fileReader.read() == -1)
		{
			csvWriter.writeNext(this.headers);
		}
		
		fileReader.close();
		
		csvWriter.flush();
		
		csvWriter.close();
	}

	@Override
	public Token getToken(UserSignature user, Token token) throws SDKException
	{
		try (CSVReader csvReader = new CSVReader(new FileReader(this.filePath)))
		{
			if(token instanceof OAuthToken)
			{
				OAuthToken oauthToken = (OAuthToken) token;
				
				List<String[]> allContents = csvReader.readAll();
	
				for (int index = 1; index < allContents.size(); index++)
				{
					String[] nextRecord = allContents.get(index);
					
					if (checkTokenExists(user.getEmail(), oauthToken, nextRecord))
					{
						oauthToken.setAccessToken(nextRecord[3]);
						
						oauthToken.setExpiresIn(nextRecord[5]);
						
						oauthToken.setRefreshToken(nextRecord[2]);
						
						return oauthToken;
					}
				}
			}
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.GET_TOKEN_FILE_ERROR, ex);
		}

		return null;
	}

	@Override
	public void saveToken(UserSignature user, Token token) throws SDKException
	{
		try
		{
			String[] data = new String[6];
			
			if(token instanceof OAuthToken)
			{
				OAuthToken oauthToken = (OAuthToken) token;
				
				oauthToken.setUserMail(user.getEmail());
				
				this.deleteToken(oauthToken);
				
				data[0] = user.getEmail();
				
				data[1] = oauthToken.getClientID();
				
				data[2] = oauthToken.getRefreshToken();
				
				data[3] = oauthToken.getAccessToken();
				
				data[4] = oauthToken.getGrantToken();
				
				data[5] = oauthToken.getExpiresIn();
			}
			
			try(CSVWriter csvWriter = new CSVWriter(new FileWriter(new File(this.filePath), true));)
			{
				csvWriter.writeNext(data);
				
				csvWriter.flush();
			}
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.SAVE_TOKEN_FILE_ERROR, ex);
		}
	}

	@Override
	public void deleteToken(Token token) throws SDKException
	{
		try (CSVReader csvReader = new CSVReader(new FileReader(new File(this.filePath)));)
		{
			if(token instanceof OAuthToken)
			{
				OAuthToken oauthToken = (OAuthToken) token;
				
				List<String[]> allContents = csvReader.readAll();
	
				for (int index = 1; index < allContents.size(); index++)
				{
					String[] nextRecord = allContents.get(index);
				
					if (checkTokenExists(oauthToken.getUserMail(), oauthToken, nextRecord))
					{
						allContents.remove(index);
						
						break;
					}
				}
				
				CSVWriter csvWriter = new CSVWriter(new FileWriter(new File(this.filePath)));
	
				csvWriter.writeAll(allContents);
				
				csvWriter.close();
			}
		}
		catch(SDKException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.DELETE_TOKEN_FILE_ERROR, ex);
		}
	}
	
	@Override
	public List<Token> getTokens() throws SDKException
	{
		List<Token> tokens = new ArrayList<Token>();
		
		try (CSVReader csvReader = new CSVReader(new FileReader(this.filePath)))
		{
			List<String[]> allContents = csvReader.readAll();
	
			for (int index = 1; index < allContents.size(); index++)
			{
				String[] nextRecord = allContents.get(index);
				
				TokenType tokenType = (nextRecord[4] != null && !nextRecord[4].isEmpty()) ? TokenType.GRANT : TokenType.REFRESH;
				
				String tokenValue = tokenType.equals(TokenType.REFRESH) ? nextRecord[2] : nextRecord[4];
				
				OAuthToken token = new OAuthToken(nextRecord[1], null, tokenValue, tokenType);
				
				token.setUserMail(nextRecord[0]);
				
				token.setRefreshToken(nextRecord[2]);
				
				token.setAccessToken(nextRecord[3]);
				
				token.setExpiresIn(String.valueOf(nextRecord[5]));
				
				tokens.add(token);
			}
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.GET_TOKENS_FILE_ERROR, ex);
		}

		return tokens;
	}
	
	@Override
	public void deleteTokens() throws SDKException
	{
		try (CSVWriter csvWriter = new CSVWriter(new FileWriter(new File(this.filePath), false));)
		{
			csvWriter.writeNext(this.headers);
			
			csvWriter.flush();
		}
		catch (Exception ex)
		{
			throw new SDKException(Constants.TOKEN_STORE, Constants.DELETE_TOKENS_FILE_ERROR, ex);
		}
	}

	private Boolean checkTokenExists(String email, OAuthToken oauthToken, String[] row) throws SDKException
	{
		if(email == null)
		{
			throw new SDKException(Constants.USER_MAIL_NULL_ERROR, Constants.USER_MAIL_NULL_ERROR_MESSAGE);
		}
		
		String clientId = oauthToken.getClientID();
		
		String grantToken = oauthToken.getGrantToken();
		
		String refreshToken = oauthToken.getRefreshToken();

		boolean tokenCheck = grantToken != null ? grantToken.equals(row[4]) : refreshToken.equals(row[2]);
		
		if(row[0].equals(email) && row[1].equals(clientId) && tokenCheck)
		{
			return true;
		}

		return false;
	}
}