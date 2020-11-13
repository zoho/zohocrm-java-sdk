package com.zoho.api.authenticator.store;

import java.util.List;

import com.zoho.api.authenticator.Token;
import com.zoho.crm.api.UserSignature;
import com.zoho.crm.api.exception.SDKException;

/**
 * This interface stores the user token details.
 */
public interface TokenStore
{
	/**
	 * This method is used to get user token details.
	 * @param user A UserSignature class instance.
	 * @param token A Token class instance.
	 * @return A Token class instance representing the user token details.
	 * @throws SDKException if any problem occurs.
	 */
	public Token getToken(UserSignature user, Token token) throws SDKException;

	/**
	 * This method is used to store user token details.
	 * @param user A UserSignature class instance.
	 * @param token A Token class instance.
	 * @throws SDKException if any problem occurs.
	 */
	public void saveToken(UserSignature user, Token token) throws SDKException;

	/**
	 * This method is used to delete user token details.
	 * @param user A UserSignature class instance.
	 * @param token A Token class instance.
	 * @throws SDKException if any problem occurs.
	 */
	public void deleteToken(Token token) throws SDKException;
	
	/**
	 * The method to retrieve all the stored tokens.
	 * @throws SDKException if any problem occurs.
	 */
	public List<Token> getTokens() throws SDKException;
	
	/**
	 * The method to delete all the stored tokens.
	 * @throws SDKException if any problem occurs.
	 */
	public void deleteTokens() throws SDKException;
}
