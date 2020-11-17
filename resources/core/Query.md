# Query

## Package com.zoho.crm.api.query

The Zoho CRM [CRM Object Query Language(COQL) API](https://www.zoho.com/crm/developer/docs/api/COQL-Overview.html) reference provides information about the possible operations on **Query**.

## Classes

| Class                                             | Implementing Interfaces |
|:------------------------------------------------- | :---------------------- |
| [APIException](#apiexception)                     | Model, ResponseHandler  |
| [BodyWrapper](#bodywrapper)                       | Model                   |
| [QueryOperations](#queryoperations)               |                         |
| [ResponseWrapper](#responsewrapper)               | Model, ResponseHandler  |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/query/APIException.java) is returned for all operations.

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

[source](../../src/main/java/com/zoho/crm/api/query/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

| Return Type  | Method                                   | Description                               |
| :----------- | :----------------------------------------| :---------------------------------------- |
| ***String*** | getSelectQuery()                         | The method to get the input select query. |
| ***void***   | setSelectQuery(***String*** selectQuery) | The method to set the input select query. |
----

[source](../../src/main/java/com/zoho/crm/api/query/BodyWrapper.java)

## QueryOperations

Contains methods for all possible [Query operations](../../src/main/java/com/zoho/crm/api/query/QueryOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/query/ResponseHandler.java)&gt;*** | getRecords(***[BodyWrapper](#bodywrapper)*** request) | To get records from the module through a COQL query. |
----

[source](../../src/main/java/com/zoho/crm/api/query/QueryOperations.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/query/ResponseWrapper.java) is returned for GET operations.

### Methods

| Return Type         | Method                                                     | Description                                                    |
| :------------------ | :--------------------------------------------------------- | :------------------------------------------------------------- |
| ***List&lt;[Record](Record.md#record)&gt;*** | getData()                         | The method to get the list of obtained ***Record*** instances. |
| ***void***          | setData(***List&lt;[Record](Record.md#record)&gt;*** data) | The method to set the list of obtained ***Record*** instances. |
| ***[Info](Record.md#info)*** | getInfo()                                         | The method to get the value of ***Info*** instance.            |
| ***void***          | setInfo(***[Info](Record.md#info)*** info)                 | The method to set the value of ***Info*** instance.            |
----

[source](../../src/main/java/com/zoho/crm/api/query/ResponseWrapper.java)
