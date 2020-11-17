# ContactRoles

## Package com.zoho.crm.api.contactroles

The Zoho CRM [ContactRoles API](#ContactRoles) reference provides information about the possible operations on **ContactRoles**.

## Classes

| Class                                             | Implementing Interfaces                               |
|:------------------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)                   | Model, ActionHandler                                  |
| [APIException](#apiexception)                     | Model, ResponseHandler, ActionResponse, ActionHandler |
| [BodyWrapper](#bodywrapper)                       | Model                                                 |
| [ContactRole](#contactrole)                       | Model                                                 |
| [ContactRolesOperations](#contactrolesoperations) |                                                       |
| [ResponseWrapper](#responsewrapper)               | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse)               | Model, ActionResponse                                 |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/contactroles/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------- | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/contactroles/ActionResponse.java)&gt;*** | getContactRoles() | The method to get the list of obtained ***ActionResponse*** instances  |
| ***void***  | setContactRoles(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/contactroles/ActionResponse.java)&gt;*** contactRoles)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/contactroles/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/contactroles/APIException.java) is returned for all operations.

### Methods

| Return Type | Method                                        | Description                                                    |
| :---------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response|
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response|
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/contactroles/APIException.java)

## BodyWrapper

The structure that contains all possible keys of a request.

### Methods

| Return Type | Method                                               | Description                                                        |
| :---------- | :----------------------------------------------------| :----------------------------------------------------------------- |
| ***List&lt;[ContactRole](#contactrole)&gt;*** | getContactRoles() | The method to get the list of obtained ***ContactRole*** instances |
| ***void***  | setContactRoles(***List&lt;[ContactRole](#contactrole)&gt;*** contactRoles) | The method to set the list of obtained ***ContactRole*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/contactroles/BodyWrapper.java)

## ContactRole

Structure of Zoho CRM [ContactRole](../../src/main/java/com/zoho/crm/api/contactroles/ContactRole.java).

### Methods

| Return Type      | Method                                          | Description                                                     |
| :--------------- | :---------------------------------------------- | :-------------------------------------------------------------- |
| ***Long***       | getId()                                         | The method to get the ***ContactRole Id***                      |
| ***void***       | setId(***Long*** Id)                            | The method to set the ***ContactRole Id***                      |
| ***String***     | getName()                                       | The method to get the value of ***ContactRole Name***           |
| ***void***       | setName(***String*** name)                      | The method to set the value of ***ContactRole Name***           |
| ***Integer***    | getSequenceNumber()                             | The method to get the value of ***ContactRole SequenceNumber*** |
| ***void***       | setSequenceNumber(***Integer*** sequenceNumber) | The method to set the value of ***ContactRole SequenceNumber*** |
----

[source](../../src/main/java/com/zoho/crm/api/contactroles/ContactRole.java)

## ContactRolesOperations

Contains methods for all possible [ContactRoles operations](../../src/main/java/com/zoho/crm/api/contactroles/ContactRolesOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/contactroles/ResponseHandler.java)&gt;*** | getContactRoles() | To get the list of all contact roles. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/contactroles/ActionHandler.java)&gt;*** | createContactRoles(***[BodyWrapper](#bodywrapper)*** request) | To create contact roles. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/contactroles/ActionHandler.java)&gt;*** | updateContactRoles(***[BodyWrapper](#bodywrapper)*** request) | To update contact roles. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/contactroles/ActionHandler.java)&gt;*** | deleteContactRoles(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To delete contact roles. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/contactroles/ResponseHandler.java)&gt;*** | getContactRole(***Long*** id) | To get specific contact role. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/contactroles/ActionHandler.java)&gt;*** | updateContactRole(***Long*** id, ***[BodyWrapper](#bodywrapper)*** request) | To update specific contact role. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/contactroles/ActionHandler.java)&gt;*** | deleteContactRole(***Long*** id) | To delete specific contact role. |
----

### Inner Static Classes

| Class                                                |
| :--------------------------------------------------- |
| [DeleteContactRolesParam](#deletecontactrolesparam) |
----

[source](../../src/main/java/com/zoho/crm/api/contactroles/ContactRolesOperations.java)

## ResponseWrapper

After a successful **API** request, and instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/contactroles/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type | Method                                               | Description                                                        |
| :---------- | :----------------------------------------------------| :----------------------------------------------------------------- |
| ***List&lt;[ContactRole](#contactrole)&gt;*** | getContactRoles() | The method to get the list of obtained ***ContactRole*** instances |
| ***void***  | setContactRoles(***List&lt;[ContactRole](#contactrole)&gt;*** contactRoles) | The method to set the list of obtained ***ContactRole*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/contactroles/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/contactroles/SuccessResponse.java) is returned.

### Methods

| Return Type | Method                                        | Description                                                    |
| :---------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/contactroles/SuccessResponse.java)

## DeleteContactRolesParam

Contains all possible parameters for the [Delete ContactRoles operation](../../src/main/java/com/zoho/crm/api/contactroles/ContactRolesOperations.java).

### Fields

| Modifier and Type                                               | Field | Description                |
| :-------------------------------------------------------------- | :---- | :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;*** |  IDS  | Represents `ids` parameter |
----
