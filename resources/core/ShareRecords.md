# ShareRecords

## Package com.zoho.crm.api.sharerecords

The Zoho CRM [ShareRecords API](https://www.zoho.com/crm/developer/docs/api/get-shared-record-details.html) reference provides information about the possible operations on **ShareRecords**.

## Classes

| Class                               | Implementing Interfaces                     |
|:----------------------------------- | :------------------------------------------ |
| [ActionWrapper](#actionwrapper)     | Model, ActionHandler                        |
| [APIException](#apiexception)       | Model, ResponseHandler, ActionResponse, ActionHandler, DeleteActionResponse, DeleteActionHandler |
| [BodyWrapper](#bodywrapper)         | Model                                       |
| [DeleteActionWrapper](#deleteactionwrapper) | Model                               |
| [ResponseWrapper](#responsewrapper) | Model, ResponseHandler                      |
| [SharedThrough](#sharedthrough)     | Model                                       |
| [ShareRecord](#sharerecord)         | Model                                       |
| [ShareRecordsOperations](#sharerecordsoperations) |                               |
| [SuccessResponse](#SuccessResponse) | Model, ActionResponse, DeleteActionResponse |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/sharerecords/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/sharerecords/ActionResponse.java)&gt;*** | getShare() | The method to get the list of obtained ***ActionResponse*** instances. |
| ***void***  | setShare(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/sharerecords/ActionResponse.java)&gt;*** share) | The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/sharerecords/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                             | Description                                                    |
| :------------------------------- | :------------------------------------------------- | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus()  | The method to get the value of ***status*** key in  the **API** response |
| ***void*** | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode()    | The method to get the value of ***code*** key in  the **API** response |
| ***void*** | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void*** | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void*** | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |

----
[source](../../src/main/java/com/zoho/crm/api/sharerecords/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type | Method                         | Description                                                               |
| :----------- | :----------------------------- | :------------------------------------------------------------------------ |
| ***List&lt;[ShareRecord](#sharerecord)&gt;*** | getShare() | The method to get the list of obtained ***ShareRecord*** instances. |
| ***void***   | setShare(***List&lt;[ShareRecord](#sharerecord)&gt;*** share)| The method to set the list of obtained ***ShareRecord*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/BodyWrapper.java)

## DeleteActionWrapper

After a successful **API** request, an instance of [DeleteActionWrapper](../../src/main/java/com/zoho/crm/api/sharerecords/DeleteActionWrapper.java) is returned for **DELETE** operation.

### Methods

|  Return Type | Method                         | Description                                                               |
| :----------- | :----------------------------- | :------------------------------------------------------------------------ |
| ***[DeleteActionResponse](../../src/main/java/com/zoho/crm/api/sharerecords/DeleteActionResponse.java)*** | getShare() | The method to get the  value of ***DeleteActionResponse*** instance. |
| ***void***   | setShare(***[DeleteActionResponse](../../src/main/java/com/zoho/crm/api/sharerecords/DeleteActionResponse.java)*** share)| The method to set the value of ***DeleteActionResponse*** instance. |
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/DeleteActionWrapper.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/sharerecords/ResponseWrapper.java) is returned for **GET** operations.

### Methods

| Return Type                     | Method                                          | Description                                                  |
| :------------------------------ | :---------------------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[ShareRecord](#sharerecord)&gt;*** | getShare()                        | The method to get the list of obtained ***ShareRecord*** instances. |
| ***void***           | setShare(***List&lt;[ShareRecord](#sharerecord)&gt;*** share) | The method to set the list of obtained ***ShareRecord*** instances. |
| ***List&lt;[User](Users.md#user)&gt;*** | getShareableUser()                              | The method to get the list of obtained ***User*** instances.|
| ***void***                      | setInfo(***[User](Users.md#user)*** shareableUser)      | The method to set the list of obtained ***User*** instances.|
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/ResponseWrapper.java)

## SharedThrough

Structure representing the properties of the Shared Record.

### Methods

| Return Type   | Method                                 |  Description                                                      |
| :------------ | :------------------------------------- | :---------------------------------------------------------------- |
| ***[Module](Modules.md#module)*** | getModule()        | The method to get the value of ***SharedThrough Module***         |
| ***void***    | setModule(***[Module](Modules.md#module)*** module) | The method to set the value of ***SharedThrough Module*** |
| ***Long***    | getId()                                | The method to get the value of ***SharedThrough Id*** |
| ***void***    | setId(***Long*** id)                   | The method to set the value of ***SharedThrough Id*** |
| ***String***  | getEntityName()                        | The method to get the value of ***SharedThrough EntityName***     |
| ***void***    | setEntityName(***String*** entityName) | The method to set the value of ***SharedThrough EntityName***     |
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/SharedThrough.java)

## ShareRecord

Structure of Zoho CRM [ShareRecord](../../src/main/java/com/zoho/crm/api/sharerecords/ShareRecord.java).

### Methods

| Return Type   | Method                                           |  Description                                               |
| :------------ | :----------------------------------------------- | :--------------------------------------------------------- |
| ***Boolean*** | getShareRelatedRecords()                         | The method to get the value of ***ShareRecord ShareRelatedRecords*** |
| ***void***    | setShareRelatedRecords(***Boolean*** shareRelatedRecords) | The method to set the value of ***ShareRecord ShareRelatedRecords*** |
| ***[SharedThrough](#sharedthrough)*** | getSharedThrough()       | The method to get the value of ***ShareRecord SharedThrough*** |
| ***void***    | setSharedThrough(***[SharedThrough](#sharedthrough)*** sharedThrough) | The method to set the value of ***ShareRecord SharedThrough*** |
| ***OffsetDateTime*** | getSharedTime()                           | The method to get the value of ***ShareRecord SharedTime*** |
| ***void***    | setSharedTime(***OffsetDateTime*** sharedTime)   | The method to set the value of ***ShareRecord SharedTime*** |
| ***String***  | getPermission()                                  | The method to get the value of ***ShareRecord Permission*** |
| ***void***    | setPermission(***String*** permission)           | The method to set the value of ***ShareRecord Permission*** |
| ***[User](Users.md#user)***  | getSharedBy()                      | The method to get the value of ***ShareRecord SharedBy***   |
| ***void***    | setSharedBy(***[User](Users.md#user)*** sharedBy) | The method to set the value of ***ShareRecord SharedBy***   |
| ***[User](Users.md#user)***  | getUser()                          | The method to get the value of ***ShareRecord User***       |
| ***void***    | setUser(***[User](Users.md#user)*** user)         | The method to set the value of ***ShareRecord User***       |
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/ShareRecord.java)

## ShareRecordsOperations

Contains methods for all possible [ShareRecords operations](../../src/main/java/com/zoho/crm/api/sharerecords/ShareRecordsOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [ShareRecordsOperations](../../src/main/java/com/zoho/crm/api/sharerecords/ShareRecordsOperations.java)(***Long*** recordId, ***String*** moduleAPIName) | Creates a ***ShareRecordsOperations*** class instance with the ***recordId*** and ***moduleAPIName***. |
----

### Methods

| Return Type                         | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/sharerecords/ResponseHandler.java)&gt;*** | getSharedRecordDetails(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the details of a record shared with other users. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/sharerecords/ActionHandler.java)&gt;*** | shareRecord(***[BodyWrapper](#bodywrapper)*** request) | To share a record with other users in the organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/sharerecords/ActionHandler.java)&gt;*** | updateSharePermissions(***[BodyWrapper](#bodywrapper)*** request) | Update the sharing permissions of a record granted to users as Read-Write, Read-only, or grant full access. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[DeleteActionHandler](../../src/main/java/com/zoho/crm/api/sharerecords/DeleteActionHandler.java)&gt;*** | revokeSharedRecord() | To revoke access to a shared record. |
----

### Inner Static Classes

| Class                                                       |
| :---------------------------------------------------------- |
| [GetSharedRecordDetailsParam](#getsharedrecorddetailsparam) |
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/ShareRecordsOperations.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/sharerecords/SuccessResponse.java) is returned.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/sharerecords/SuccessResponse.java)

## GetSharedRecordDetailsParam

Contains all possible parameters for the [Get SharedRecord Details operation](../../src/main/java/com/zoho/crm/api/sharerecords/ShareRecordsOperations.java).

### Fields

| Modifier and Type                                                  | Field    | Description                     |
| :----------------------------------------------------------------- | :------- | :------------------------------ |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | SHAREDTO | Represents `sharedTo` parameter |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | VIEW     | Represents `view` parameter     |
----
