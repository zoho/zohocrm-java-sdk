# SDKException

extends ***Exception***

This class is the common SDKException object. This stands as a POJO for the SDKException thrown.

## Package com.zoho.crm.api.exception

## Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [SDKException](../../src/main/java/com/zoho/crm/api/exception/SDKException.java)(***String*** code, ***String*** message, ***Exception*** cause) | Creates an SDKException class instance with the specified parameters. |
| [SDKException](../../src/main/java/com/zoho/crm/api/exception/SDKException.java)(***String*** code, ***JSONObject*** details) | Creates an SDKException class instance with the specified parameters. |
| [SDKException](../../src/main/java/com/zoho/crm/api/exception/SDKException.java)(***String*** code, ***String*** message) | Creates an SDKException class instance with the specified parameters. |
| [SDKException](../../src/main/java/com/zoho/crm/api/exception/SDKException.java)(***String*** message, ***Exception*** cause) | Creates an SDKException class instance with the specified parameters. |
| [SDKException](../../src/main/java/com/zoho/crm/api/exception/SDKException.java)(***Exception*** cause) | Creates an SDKException class instance with the specified parameters. |
| [SDKException](../../src/main/java/com/zoho/crm/api/exception/SDKException.java)(***String*** code, ***String*** message, ***JSONObject*** details, ***Exception*** cause) | Creates an SDKException class instance with the specified parameters. |
----

### code

A String containing the Exception error code.

### message

A String containing the Exception error message.

### cause

An Exception class instance.

### details

A JSONObject containing the error response.

## Methods

| Return Type      | Method       | Description                                                |
| :--------------- | :----------- | :--------------------------------------------------------- |
| ***String***     | getCode()    | This is a getter method to get ***SDKException Code***.    |
| ***String***     | getMessage() | This is a getter method to get ***SDKException Message***. |
| ***Throwable***  | getCause()   | This is a getter method to get ***SDKException Cause***.   |
| ***JSONObject*** | getDetails() | This is a getter method to get ***SDKException Details***. |
----

[source](../../src/main/java/com/zoho/crm/api/exception/SDKException.java)
