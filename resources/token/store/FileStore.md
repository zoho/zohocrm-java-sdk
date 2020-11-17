# FileStore

implements ***[TokenStore](../../../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)***

This class stores the user's token details in the file.

## Package com.zoho.api.authenticator.store

## Constructors

| Constructor                                                          | Description                                                                     |
| :------------------------------------------------------------------- | :------------------------------------------------------------------------------ |
| [FileStore](../../../src/main/java/com/zoho/api/authenticator/store/FileStore.java)(***String*** filePath) | Creates a FileStore class instance with the specified parameter. |
----

### filePath

A String containing the absolute file path to store tokens.

## Methods

| Return Type   | Method            | Description                                              |
| :------------ | :---------------- | :------------------------------------------------------- |
| ***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)***  | getToken(***[UserSignature](../../UserSignature.md#usersignature)*** user, ***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)*** token) | The method to get the user's token details. |
| ***void***  | saveToken(***[UserSignature](../../UserSignature.md#usersignature)*** user, ***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)*** token) | The method to store the user's token details. |
| ***void***  | deleteToken(***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)*** token) | The method to delete the user's token details. |
| ***List&lt;[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)&gt;***  | getTokens() | The method to retrieve all the stored tokens. |
| ***void***  | deleteTokens() | The method to delete all the stored tokens. |
----

[source](../../../src/main/java/com/zoho/api/authenticator/store/FileStore.java)
