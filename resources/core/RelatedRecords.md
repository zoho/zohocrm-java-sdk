# RelatedRecords

## Package com.zoho.crm.api.relatedrecords

The Zoho CRM [RelatedRecords API](https://www.zoho.com/crm/developer/docs/api/get-related-records.html) reference provides information about the possible operations on **RelatedRecords**.

## Classes

| Class                                           | Implementing Interfaces                               |
|:----------------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)                 | Model, ActionHandler                                  |
| [APIException](#apiexception)                   | Model, ResponseHandler, ActionResponse, ActionHandler |
| [BodyWrapper](#bodywrapper)                     | Model                                                 |
| [FileBodyWrapper](#filebodywrapper)             | Model, ResponseHandler                                |
| [RelatedRecordsOperations](#relatedrecordsoperations) |                                                 |
| [ResponseWrapper](#responsewrapper)             | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse)             | Model, ActionResponse                                 |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations.

### Methods

| Return Type                       | Method                                  | Description                                                      |
| :-------------------------------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionResponse.java)&gt;*** | getData() | The method to get the list of obtained ***ActionResponse*** instances  |
| ***void*** | setData(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionResponse.java)&gt;*** data)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/relatedrecords/APIException.java) is returned for all operations.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/relatedrecords/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type          | Method                     | Description                                               |
| :-------------------- | :------------------------- | :-------------------------------------------------------- |
| ***List&lt;[Record](Record.md#record-1)&gt;*** | getData()  | The method to get the list of obtained ***Record*** instances |
| ***void***            | setData(***List&lt;[Record](Record.md#record-1)&gt;*** data) | The method to set the list of obtained ***Record*** instances |
----

[source](../../src/main/java/com/zoho/crm/api/relatedrecords/BodyWrapper.java)

## FileBodyWrapper

Serves as the response for the downloading Attachment operation.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)***  | getFile() | The method to get the ***StreamWrapper*** class instances |
| ***void***           | setFile(***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)*** file)| The method to set the ***StreamWrapper*** class instances |
----

[source](../../src/main/java/com/zoho/crm/api/relatedrecords/FileBodyWrapper.java)

## RelatedRecordsOperations

Contains methods for all possible [RelatedRecords operations](../../src/main/java/com/zoho/crm/api/relatedrecords/RelatedRecordsOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [RelatedRecordsOperations](../../src/main/java/com/zoho/crm/api/relatedrecords/RelatedRecordsOperations.java)(***String*** relatedListAPIName,***Long*** recordId, ***String*** moduleAPIName)  |  Creates a ***RelatedRecordsOperations*** class instance with the ***relatedListAPIName***, ***recordId*** and ***moduleAPIName***.|
----

### Methods

| Return Type                               | Method                                          | Description                                                |
| :---------------------------------------- | :---------------------------------------------- | :--------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/relatedrecords/ResponseHandler.java)&gt;*** | getRelatedRecords(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get the list of records from the related list of a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionHandler.java)&gt;*** | updateRelatedRecords(***[BodyWrapper](#bodywrapper)*** request) | To update the association/relation between the records. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionHandler.java)&gt;*** | delinkRecords(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To delete the association between the records. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/relatedrecords/ResponseHandler.java)&gt;*** | getRelatedRecord(***Long*** relatedRecordId, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get the records from a specific related list of a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionHandler.java)&gt;*** | updateRelatedRecord(***Long*** relatedRecordId, ***[BodyWrapper](#bodywrapper)*** request)| To update the details of a specific record of a related list in a module.|
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/relatedrecords/ActionHandler.java)&gt;*** | delinkRecord(***Long*** relatedRecordId) | To delete a specific record from the related list of a module. |
----

### Inner Static Classes

| Class                                               |
| :-------------------------------------------------- |
| [GetRelatedRecordsParam](#getrelatedrecordsparam)   |
| [GetRelatedRecordsHeader](#getrelatedrecordsheader) |
| [DelinkRecordsParam](#delinkrecordsparam)           |
| [GetRelatedRecordHeader](#getrelatedrecordheader)   |
----

[source](../../src/main/java/com/zoho/crm/api/relatedrecords/RelatedRecordsOperations.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/relatedrecords/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type             | Method                              | Description                                                  |
| :---------------------------  | :---------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[Record](#record-1)&gt;*** | getData()                           | The method to get the list of obtained ***Record*** instances  |
| ***void***                   | setData(***List&lt;[Record](#record-1)&gt;*** data)| The method to set the list of obtained ***Record*** instances. |
| ***[Info](Record.md#info)***| getInfo() | The method to get the ***Record*** response information. |
| ***void***| setInfo(***[Info](Record.md#info)*** info) | The method to set the ***Record*** response information. |
----

[source](../../src/main/java/com/zoho/crm/api/relatedrecords/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/relatedrecords/SuccessResponse.java) is returned.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/relatedrecords/SuccessResponse.java)

## GetRelatedRecordsParam

Contains all possible parameters for the [GetRelatedRecords operation](../../src/main/java/com/zoho/crm/api/relatedrecords/RelatedRecordsOperations.java).

### Fields

| Modifier and Type                                                 | Field    | Description                     |
| :---------------------------------------------------------------- | :------- | :------------------------------ |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | PAGE     | Represents `page` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | PER_PAGE | Represents `per_page` parameter |
----

## GetRelatedRecordsHeader

Contains all possible headers for the [GetRelatedRecords operation](../../src/main/java/com/zoho/crm/api/record/RelatedRecordsOperations.java).

### Fields

| Modifier and Type                                                            | Field             | Description                              |
| :--------------------------------------------------------------------------- | :---------------- | :--------------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** | IF_MODIFIED_SINCE | Represents `If-Modified-Since` parameter |
----

## DelinkRecordsParam

Contains all possible parameters for the [DelinkRecords operation](../../src/main/java/com/zoho/crm/api/relatedrecords/RelatedRecordsOperations.java).

### Fields

| Modifier and Type                                               | Field  | Description                |
| :-------------------------------------------------------------- | :----- | :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;*** | IDS    | Represents `ids` parameter |
----

## GetRelatedRecordHeader

Contains all possible headers for the [GetRelatedRecord operation](../../src/main/java/com/zoho/crm/api/record/RelatedRecordsOperations.java).

### Fields

| Modifier and Type                                                            | Field             | Description                              |
| :--------------------------------------------------------------------------- | :---------------- | :--------------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** | IF_MODIFIED_SINCE | Represents `If-Modified-Since` parameter |
----
