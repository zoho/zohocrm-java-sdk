# DBStore

implements ***[TokenStore](../../../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)***

This class stores the user token details to the MySQL DataBase.

## Package com.zoho.api.authenticator.store

## Constructors

| Constructor                                                          | Description                                                                     |
| :------------------------------------------------------------------- | :------------------------------------------------------------------------------ |
| [DBStore](../../../src/main/java/com/zoho/api/authenticator/store/DBStore.java)() | Create a DBStore class instance with the following default values.           |
| [DBStore](../../../src/main/java/com/zoho/api/authenticator/store/DBStore.java)(***String*** host, ***String*** databaseName, ***String*** userName, ***String*** password, ***String*** portNumber) | Creates a DBStore class instance with the specified parameters. |
----

### host

A String containing the DataBase host name. The default value is `localhost`.

### databaseName

A String containing the DataBase name. The default value is `zohooauth`.

### userName

A String containing the DataBase user name. The default value is `root`.

### password

A String containing the DataBase password. The default value is an empty string.

### portNumber

A String containing the DataBase port number. The default value is `3306`.

## Methods

| Return Type   | Method            | Description                                              |
| :------------ | :---------------- | :------------------------------------------------------- |
| ***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)***  | getToken(***[UserSignature](../../UserSignature.md#usersignature)*** user, ***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)*** token) | The method to get the user's token details. |
| ***void***  | saveToken(***[UserSignature](../../UserSignature.md#usersignature)*** user, ***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)*** token) | The method to store the user's token details. |
| ***void***  | deleteToken(***[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)*** token) | The method to delete the user's token details. |
| ***List&lt;[Token](../../../src/main/java/com/zoho/api/authenticator/Token.java)&gt;***  | getTokens() | The method to retrieve all the stored tokens. |
| ***void***  | deleteTokens() | The method to delete all the stored tokens. |
----

[source](../../../src/main/java/com/zoho/api/authenticator/store/DBStore.java)
