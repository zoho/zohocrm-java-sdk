# Roles

## Package com.zoho.crm.api.roles

The Zoho CRM [Roles API](https://www.zoho.com/crm/developer/docs/api/get-roles.html) reference provides information about the possible operations on **Roles**.

## Classes

| Class                                 | Implementing Interfaces |
|:------------------------------------- | :---------------------- |
| [APIException](#apiexception)         | Model, ResponseHandler  |
| [ResponseWrapper](#responsewrapper)   | Model, ResponseHandler  |
| [Role](#role)                         | Model                   |
| [RolesOperations](#rolesoperations)   |                         |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/roles/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()      | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode() | The method to get the value of ***code*** key in  the **API** response   |
| ***void***         | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)  | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage() | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/roles/APIException.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/roles/ResponseWrapper.java) is returned for **GET** operations.

### Methods

| Return Type                  | Method                                          | Description                                                  |
| :--------------------------- | :---------------------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[Role](#role)&gt;*** | getRoles()                                   | The method to get the list of obtained ***Role*** instances. |
| ***void***                   | setRoles(***List&lt;[Role](#role)&gt;*** roles) | The method to set the list of obtained ***Role*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/roles/ResponseWrapper.java)

## Role

Structure of Zoho CRM [Role](../../src/main/java/com/zoho/crm/api/roles/Role.java).

### Methods

| Return Type          | Method                                           |  Description                                                 |
| :------------------- | :----------------------------------------------- | :----------------------------------------------------------- |
| ***String***         | getDisplayLabel()                                | The method to get the value of ***Role DisplayLabel***       |
| ***void***           | setDisplayLabel(***String*** displayLabel)       | The method to set the value of ***Role DisplayLabel***       |
| ***[User](Users.md#user)*** | getForecastManager()                      | The method to get the value of ***Role ForecastManager***    |
| ***void***           | setForecastManager(***[User](Users.md#user)*** forecastManager) | The method to set the value of ***Role ForecastManager*** |
| ***Boolean***        | getShareWithPeers()                              | The method to get the value of ***Role ShareWithPeers***     |
| ***void***           | setShareWithPeers(***Boolean*** shareWithPeers)  | The method to set the value of ***Role ShareWithPeers***     |
| ***String***         | getName()                                        | The method to get the value of ***Role Name***               |
| ***void***           | setName(***String*** name)                       | The method to set the value of ***Role Name***               |
| ***String***         | getDescription()                                 | The method to get the value of ***Role Description***        |
| ***void***           | setDescription(***String*** description)         | The method to set the value of ***Role Description***        |
| ***Long***         | getId()                                          | The method to get the value of ***Role Id***                 |
| ***void***           | setId(***Long*** id)                           | The method to set the value of ***Role Id***                 |
| ***[User](Users.md#user)*** | getReportingTo()                          | The method to get the value of ***Role ReportingTo***        |
| ***void***           | setReportingTo(***[User](Users.md#user)*** reportingTo) | The method to set the value of ***Role ReportingTo*** |
| ***Boolean***        | getAdminUser()                                   | The method to get the value of ***Role AdminUser***          |
| ***void***           | setAdminUser(***Boolean*** adminUser)            | The method to set the value of ***Role AdminUser***          |
----

[source](../../src/main/java/com/zoho/crm/api/roles/Role.java)

## RolesOperations

Contains methods for all possible [Roles operations](../../src/main/java/com/zoho/crm/api/roles/RolesOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                         |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/roles/ResponseHandler.java)&gt;*** | getRoles() | To get the list of all roles available in your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/roles/ResponseHandler.java)&gt;*** | getRole(***Long*** id) | To get the details of a specific role. |
----

[source](../../src/main/java/com/zoho/crm/api/roles/ProfilesOperations.java)
