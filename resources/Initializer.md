# Initializer

The class to initialize the Zoho CRM SDK.

## Package com.zoho.crm.api

## Static Methods

| Return Type | Method         | Description                                             |
| :---------- | :------------- | :------------------------------------------------------ |
| ***void***  | initialize(***[UserSignature](UserSignature.md#usersignature)*** user, ***[Environment](dc/DataCenter.md#environment)*** environment, ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** token, ***[TokenStore](../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)*** store, ***[SDKConfig](SDKConfig.md#sdkconfig)*** sdkConfig, ***String*** resourcePath) | The method to initialize the SDK. |
| ***void***  | initialize(***[UserSignature](UserSignature.md#usersignature)*** user, ***[Environment](dc/DataCenter.md#environment)*** environment, ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** token, ***[TokenStore](../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)*** store, ***[SDKConfig](SDKConfig.md#sdkconfig)*** sdkConfig, ***String*** resourcePath, ***[Logger](logger/Logger.md#logger)*** logger) | The method to initialize the SDK. |
| ***void***  | initialize(***[UserSignature](UserSignature.md#usersignature)*** user, ***[Environment](dc/DataCenter.md#environment)*** environment, ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** token, ***[TokenStore](../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)*** store, ***[SDKConfig](SDKConfig.md#sdkconfig)*** sdkConfig, ***String*** resourcePath, ***[RequestProxy](RequestProxy.md#requestproxy)*** proxy) | The method to initialize the SDK. |
| ***void***  | initialize(***[UserSignature](UserSignature.md#usersignature)*** user, ***[Environment](dc/DataCenter.md#environment)*** environment, ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** token, ***[TokenStore](../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)*** store, ***[SDKConfig](SDKConfig.md#sdkconfig)*** sdkConfig, ***String*** resourcePath,  ***[Logger](logger/Logger.md#logger)*** logger, ***[RequestProxy](RequestProxy.md#requestproxy)*** proxy) | The method to initialize the SDK. |
| ***void***  | switchUser(***[UserSignature](UserSignature.md#usersignature)*** user, ***[Environment](dc/DataCenter.md#environment)*** environment, ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** token, ***[SDKConfig](SDKConfig.md#sdkconfig)*** sdkConfig) | The method to switch the different users in the SDK environment. |
| ***void***  | switchUser(***[UserSignature](UserSignature.md#usersignature)*** user, ***[Environment](dc/DataCenter.md#environment)*** environment, ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** token, ***[SDKConfig](SDKConfig.md#sdkconfig)*** sdkConfig, ***[RequestProxy](RequestProxy.md#requestproxy)*** proxy) | The method to switch the different users in the SDK environment. |
----

### user

A ***[UserSignature](UserSignature.md#usersignature)*** class instance represents a CRM user.

### environment

A ***[Environment](dc/DataCenter.md#environment)*** class instance containing the CRM API base URL and Accounts URL.

### token

A ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** class instance containing the OAuth client application information.

### store

A ***[TokenStore](../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)*** class instance containing the token store information.

### sdkConfig

A ***[SDKConfig](SDKConfig.md#sdkconfig)*** class instance containing the configuration.

### resourcePath

A String containing the absolute directory path to store user specific JSON files containing module fields information.

### logger

A ***[Logger](logger/Logger.md#logger)*** class instance containing the log file path and Logger type.

### proxy

A ***[RequestProxy](RequestProxy.md#requestproxy)*** class instance containing the proxy properties of the user.

## Methods

| Return Type                         | Method           | Description                                             |
| :---------------------------------- | :--------------- | :------------------------------------------------------ |
| ***[Environment](dc/DataCenter.md#environment)*** | getEnvironment() | The getter method to get API environment.         |
| ***[TokenStore](../src/main/java/com/zoho/api/authenticator/store/TokenStore.java)*** | getStore() | This is a getter method to get API Token Store. |
| ***[UserSignature](UserSignature.md#usersignature)*** | getUser() | The getter method to get CRM User.     |
| ***[Token](../src/main/java/com/zoho/api/authenticator/Token.java)*** | getToken() | The  getter method to get OAuth client application information. |
| ***[SDKConfig](SDKConfig.md#sdkconfig)*** | getSDKConfig() | This is a getter method to get the SDK Configuration. |
| ***String***  | getResourcePath()      | The path containing the absolute directory path to store user specific files containing module fields information. |
| ***[RequestProxy](RequestProxy.md#requestproxy)*** | getRequestProxy() | The getter method to get Proxy information. |
----

[source](../src/main/java/com/zoho/crm/api/Initializer.java)
