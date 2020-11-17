# BulkRead

## Package com.zoho.crm.api.bulkread

The Zoho CRM [BulkRead API](https://www.zoho.com/crm/developer/docs/api/bulk-read/overview.html) reference provides information about the possible operations on **BulkRead**.

## Classes

| Class                                     | Implementing Interfaces                               |
|:----------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)           | Model, ActionHandler                                  |
| [APIException](#apiexception)             | Model, ResponseHandler, ActionResponse, ActionHandler |
| [BulkReadOperations](#bulkreadoperations) |                                                       |
| [CallBack](#callback)                     | Model                                                 |
| [Criteria](#criteria)                     | Model                                                 |
| [FileBodyWrapper](#filebodywrapper)       | Model, ResponseHandler                                |
| [JobDetail](#jobdetail)                   | Model                                                 |
| [Query](#query)                           | Model                                                 |
| [RequestWrapper](#requestwrapper)         | Model                                                 |
| [ResponseWrapper](#responsewrapper)       | Model, ResponseHandler                                |
| [Result](#result)                         | Model                                                 |
| [SuccessResponse](#successresponse)       | Model, ActionResponse                                 |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/bulkread/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type                 | Method                                  | Description                                                      |
| :-------------------------------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/bulkread/ActionResponse.java)&gt;*** | getData() | The method to get the list of obtained ***ActionResponse*** instances  |
| ***void***                       | setData(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/bulkread/ActionResponse.java)&gt;*** data)| The method to set the list of obtained ***ActionResponse*** instances. |
| ***Map&lt;String, Object&gt;*** | getInfo() | The method to get the value of ***ActionWrapper Info***  |
| ***void*** | setInfo(***Map&lt;String, Object&gt;*** info)| The method to set the value of ***ActionWrapper Info*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/bulkread/APIException.java) is returned for all operations.

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

[source](../../src/main/java/com/zoho/crm/api/bulkread/APIException.java)

## BulkReadOperations

Contains methods for all possible [BulkRead operations](../../src/main/java/com/zoho/crm/api/bulkread/BulkReadOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/bulkread/ResponseHandler.java)&gt;*** | getBulkReadJobDetails(***Long*** jobId) | To know the status of the bulk read job scheduled previously.  |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/bulkread/ResponseHandler.java)&gt;***   | downloadResult(***Long*** jobId) | To download the result of the bulk read job. The response contains a zip file. Extract it to get the CSV or ICS file depending on the "file_type" you specified while creating the bulk read job. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/bulkread/ActionHandler.java)&gt;***   | createBulkReadJob(***[RequestWrapper](#requestwrapper)*** request) | To schedule a bulk read job to export records that match the criteria. |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/BulkReadOperations.java)

## CallBack

Structure containing the URL where the BulkRead Job details are posted upon completion.

### Methods

| Return Type     | Method                                       |  Description                                           |
| :-------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***String*** | getUrl() | The method to get the value of ***CallBack URL***|
| ***void*** | setUrl(***String*** url)| The method to set the value of ***CallBack URL***|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMethod() | The method to get the value of ***CallBack HTTP Method*** |
| ***void*** | setMethod(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** method) | The method to set the value of ***CallBack HTTP Method*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/CallBack.java)

## Criteria

The structure represents the condition to filter records.

### Methods

| Return Type     | Method                                       |  Description                                           |
| :-------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***String*** | getAPIName() | The method to get the ***Field's API Name***|
| ***void*** | setAPIName(***String*** apiName)| The method to set the ***Field's API Name***|
| ***Object*** | getValue() | The method to get the value of ***Criteria Value*** |
| ***void***  | setValue(***Object*** value) | The method to set the value of ***Criteria Value*** |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getGroupOperator() | The method to get the value of ***Criteria GroupOperator*** |
| ***void*** | setGroupOperator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** groupOperator) | The method to set the value of ***Criteria GroupOperator*** |
| ***List&lt;[Criteria](#criteria)&gt;*** | getGroup() | The method to get the list of obtained ***Criteria*** instances |
| ***void*** | setGroup(***List&lt;[Criteria](#criteria)&gt;*** group) | The method to set the list of obtained ***Criteria*** instances |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getComparator() | The method to get the value of ***Criteria Comparator*** |
| ***void*** | setComparator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** comparator) | The method to set the value of ***Criteria Comparator*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/Criteria.java)

## FileBodyWrapper

Serves as the response for downloading the result of bulk read job.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)***  | getFile() | The method to get the ***StreamWrapper*** class instance |
| ***void***           | setFile(***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)*** file)| The method to set the ***StreamWrapper*** class instance|
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/FileBodyWrapper.java)

## JobDetail

Structure of Zoho CRM [JobDetail](../../src/main/java/com/zoho/crm/api/bulkread/JobDetail.java).

### Methods

| Return Type          | Method                                       |  Description                                           |
| :------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***Long***           | getId()                                      | The method to get the value of ***JobDetail Id***           |
| ***void***           | setId(***Long*** id)                         | The method to set the value of ***JobDetail Id***           |
| ***String***         | getOperation()                               | The method to get the value of ***JobDetail Operation*** |
| ***void***           | setOperation(***String*** operation)         | The method to set the value of ***JobDetail Operation*** |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***        | getState() | The method to get the value of ***JobDetail State*** |
| ***void***           | setState(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** state) | The method to set the value of ***JobDetail State*** |
| ***[Query](#query)*** | getQuery()       | The method to get the value of ***JobDetail Query*** |
| ***void***           | setQuery(***[Query](#query)*** query)        | The method to set the value of ***JobDetail Query*** |
| ***[User](Users.md#user)*** | getCreatedBy()                        | The method to get the value of ***JobDetail CreatedBy*** |
| ***void***           | setCreatedBy(***[User](Users.md#user)*** createdBy) | The method to set the value of ***JobDetail CreatedBy*** |
| ***OffsetDateTime*** | getCreatedTime()                             | The method to get the value of ***JobDetail CreatedTime*** |
| ***void***           | setCreatedTime(***OffsetDateTime*** createdTime) | The method to set the value of ***JobDetail CreatedTime*** |
| ***[Result](#result)*** | getResult()                               | The method to get the value of ***JobDetail Result*** |
| ***void***           | setResult(***[Result](#result)*** result)    | The method to set the value of ***JobDetail Result*** |
| ***String***         | getFileType()                                | The method to get the value of ***JobDetail FileType***  |
| ***void***           | setFileType(***String*** fileType)           | The method to set the value of ***JobDetail FileType***  |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/JobDetail.java)

## Query

The structure containing the query to retrieve the required records.

### Methods

| Return Type     | Method                                       |  Description                                           |
| :-------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***String*** | getModule() | The method to get the value of ***Query Module API Name***|
| ***void*** | setModule(***String*** module)| The method to set the value of ***Query Module API Name***|
| ***String*** | getCvid() | The method to get the value of ***Query Module Cvid***|
| ***void*** | setCvid(***String*** cvid)| The method to set the value of ***Query Module Cvid***|
| ***List&lt;String&gt;*** | getFields() | The method to get the value of ***Query Module Fields*** |
| ***void*** | setFields(***List&lt;String&gt;*** fields) | The method to set the value of ***Query Module Fields*** |
| ***Integer*** | getPage() | The method to get the value of ***Query Page*** |
| ***void*** | setPage(***Integer*** page) | The method to set the value of ***Query Page*** |
| ***[Criteria](#criteria)*** | getCriteria() | The method to get the value of ***Query Criteria*** |
| ***void*** | setCriteria(***[Criteria](#criteria)*** criteria) | The method to set the value of ***Query Criteria*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/Query.java)

## RequestWrapper

A structure that contains all possible keys of a single request.

### Methods

| Return Type     | Method                                       |  Description                                           |
| :-------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***[CallBack](#callback)*** | getCallback() | The method to get the value of ***RequestWrapper CallBack***|
| ***void***| setCallback(***[CallBack](#callback)*** callback)| The method to set the value of ***RequestWrapper CallBack***|
| ***[Query](#query)*** | getQuery() | The method to get the value of ***RequestWrapper Query***|
| ***void***| setQuery(***[Query](#query)*** query)| The method to set the value of ***RequestWrapper Query***|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getFileType() | The method to get the value of ***RequestWrapper FileType*** |
| ***void*** | setFileType(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** fileType) | The method to set the value of ***RequestWrapper FileType*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/RequestWrapper.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/bulkread/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type             | Method                              | Description                                                  |
| :---------------------------  | :---------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[JobDetail](#jobdetail)&gt;*** | getData() | The method to get the list of obtained ***JobDetail*** instances  |
| ***void*** | setData(***List&lt;[JobDetail](#jobdetail)&gt;*** data)| The method to set the list of obtained ***JobDetail*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/ResponseWrapper.java)

## Result

Structure represents the result of a BulkRead job.

### Methods

| Return Type   | Method                     | Description                                                  |
| :------------ | :------------------------- | :----------------------------------------------------------- |
| ***Integer*** | getPage()                  | The method to get the value of ***Result Page*** |
| ***void***    | setPage(***Integer*** page)| The method to set the value of ***Result Page*** |
| ***Integer*** | getCount()                 | The method to get the value of ***Result Count*** |
| ***void***    | setCount(***Integer*** count)| The method to set the value of ***Result Count*** |
| ***String***  | getDownloadUrl()           | The method to get the value of ***Result DownloadUrl*** |
| ***void***    | setDownloadUrl(***String*** downloadUrl) | The method to set the value of ***Result DownloadUrl*** |
| ***Integer*** | getPerPage()               | The method to get the value of ***Result PerPage*** |
| ***void***    | setPerPage(***Integer*** perPage) | The method to set the value of ***Result PerPage*** |
| ***Boolean*** | getMoreRecords()           | The method to get the value of ***Result MoreRecords***  |
| ***void***    | setMoreRecords(***Boolean*** moreRecords) | The method to set the value of ***Result MoreRecords*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/Result.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/bulkread/SuccessResponse.java) is returned.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***     | getMessage()  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/bulkread/SuccessResponse.java)
