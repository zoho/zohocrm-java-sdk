# OAuthToken

implements [Token](../../src/main/java/com/zoho/api/authenticator/Token.java)

This class maintains the tokens and authenticates every request.

## Package com.zoho.api.authenticator

The Zoho CRM [OAuth 2.0](https://www.zoho.com/crm/developer/docs/api/oauth-overview.html) reference provides information about the possible operations on **OAuth 2.0**.

## Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [OAuthToken](../../src/main/java/com/zoho/api/authenticator/OAuthToken.java)(***String*** clientID, ***String*** clientSecret, ***String*** token, ***[TokenType](#tokentype)*** type)  | Creates an OAuthToken class instance with the specified parameters. |
| [OAuthToken](../../src/main/java/com/zoho/api/authenticator/OAuthToken.java)(***String*** clientID, ***String*** clientSecret, ***String*** token, ***[TokenType](#tokentype)*** type, ***String*** redirectURL)  | Creates an OAuthToken class instance with the specified parameters. |
----

### clientID

A String containing the OAuth client id.

### clientSecret

A String containing the OAuth client secret.

### token

A String containing the REFRESH/GRANT token.

## TokenType

An enum containing the given token type.

GRANT   -> When Grant Token is given in the [token](###token).

REFRESH -> When Refresh Token is given in the [token](###token).

### redirectURL

A String containing the OAuth redirect URL.

## Methods

| Return Type   | Method            | Description                                              |
| :------------ | :---------------- | :------------------------------------------------------- |
| ***String***  | getClientID()     | The getter method to get ***OAuth ClientID***.     |
| ***String***  | getClientSecret() | The getter method to get ***OAuth ClientSecret***. |
| ***String***  | getRedirectURL()  | The getter method to get ***OAuth RedirectURL***.  |
| ***String***  | getGrantToken()   | The getter method to get ***OAuth GrantToken***.   |
| ***String***  | getRefreshToken() | The getter method to get ***OAuth RefreshToken***. |
| ***void***    | setRefreshToken(***String*** refreshToken) | The setter method to set ***OAuth RefreshToken***.|
| ***String***  | getAccessToken()  | The getter method to get ***OAuth AccessToken***.  |
| ***void***    | setAccessToken(***String*** accessToken) | The setter method to set ***OAuth AccessToken***. |
| ***String***  | getExpiresIn()    | The getter method to get ***OAuth ExpiresIn***.    |
| ***void***    | setExpiresIn(***String*** expiresIn) | The setter method to set ***OAuth ExpiresIn***. |
| ***Boolean*** | remove()          | The method to remove the current token from the Store.   |
----

[source](../../src/main/java/com/zoho/api/authenticator/OAuthToken.java)
