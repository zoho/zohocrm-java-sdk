# RequestProxy

This class represents the properties of proxy for the user.

## Package com.zoho.crm.api

## Constructors

| Constructor                                                                     | Description                                                            |
| :------------------------------------------------------------------------------ | :--------------------------------------------------------------------- |
| [RequestProxy](../src/main/java/com/zoho/crm/api/RequestProxy.java)(***String*** host, ***Integer*** port) | Creates a RequestProxy class instance with the specified parameters. |
| [RequestProxy](../src/main/java/com/zoho/crm/api/RequestProxy.java)(***String*** host, ***Integer*** port, ***String*** user, ***String*** password) | Creates a RequestProxy class instance with the specified parameters. |
| [RequestProxy](../src/main/java/com/zoho/crm/api/RequestProxy.java)(***String*** host, ***Integer*** port, ***String*** user, ***String*** password, ***String*** userDomain) | Creates a RequestProxy class instance with the specified parameters. |
----

### host

A String containing the hostname or address of the proxy server

### port

A Integer containing The port number of the proxy server

### user

A String containing the user name of the proxy server

### password

A String containing the password of the proxy server

### userDomain

A String containing the domain of the proxy server

## Methods

| Return Type      | Method          | Description                                    |
| :--------------- | :-------------- | :--------------------------------------------- |
| ***String***     | getHost()       | The getter method to get the ***Proxy Host***. |
| ***Integer***    | getPort()       | The getter method to get the ***Proxy Port***. |
| ***String***     | getUserDomain() | The getter method to get the ***Proxy UserDomain***. |
| ***String***     | getUser()       | The getter method to get the ***Proxy User***. |
| ***String***     | getPassword()   | The getter method to get the ***Proxy Password***. |
----

[source](../src/main/java/com/zoho/crm/api/RequestProxy.java)
