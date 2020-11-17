# BulkWrite

## Package com.zoho.crm.api.bulkwrite

The Zoho CRM [BulkWrite API](https://www.zoho.com/crm/developer/docs/api/bulk-write/overview.html) reference provides information about the possible operations on **BulkWrite**.

## Classes

| Class                                       | Implementing Interfaces                                 |
|:------------------------------------------- | :------------------------------------------------------ |
| [APIException](#apiexception)               | Model, ActionResponse, ResponseWrapper, ResponseHandler |
| [BulkWriteOperations](#bulkwriteoperations) |                                                         |
| [BulkWriteResponse](#bulkwriteresponse)     | Model, ResponseWrapper                                  |
| [CallBack](#callback)                       | Model                                                   |
| [FieldMapping](#fieldmapping)               | Model                                                   |
| [File](#file)                               | Model                                                   |
| [FileBodyWrapper](#filebodywrapper)         | Model, ResponseHandler                                  |
| [RequestWrapper](#requestwrapper)           | Model                                                   |
| [Resource](#resource)                       | Model                                                   |
| [Result](#result)                           | Model                                                   |
| [SuccessResponse](#successresponse)         | Model, ActionResponse                                   |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/bulkwrite/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getErrorMessage() | The method to get the value of ***ERROR_MESSAGE*** key in  the **API** response|
| ***void***                      | setErrorMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** errorMessage)      | The method to set the value of ***ERROR_MESSAGE*** key in  the **API** response|
| ***Integer***                   | getErrorCode() | The method to get the value of ***ERROR_CODE*** key in  the **API** response |
| ***void***                      | setErrorCode(***Integer*** errorCode)      | The method to set the value of ***ERROR_CODE*** key in  the **API** response|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getXError()                                  | The method to get the value of ***x-error*** key in  the **API** response|
| ***void***                      | setXError(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** xError)      | The method to set the value of ***x-error*** key in  the **API** response|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getInfo()                                  | The method to get the value of ***info*** key in  the **API** response|
| ***void***                      | setInfo(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** info)      | The method to get the value of ***info*** key in  the **API** response|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getXInfo()                                  | The method to get the value of ***x-info*** key in  the **API** response|
| ***void***                      | setXInfo(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** xInfo)      | The method to set the value of ***x-info*** key in  the **API** response|
| ***String***                      | getHttpStatus()                                  | The method to get the value of ***http_status*** key in  the **API** response|
| ***void***                      | setHttpStatus(***String*** httpStatus)      | The method to set the value of ***http_status*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/APIException.java)

## BulkWriteOperations

Contains methods for all possible [BulkWrite operations](../../src/main/java/com/zoho/crm/api/bulkwrite/BulkWriteOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/bulkwrite/ActionResponse.java)&gt;*** | uploadFile(***[FileBodyWrapper](#filebodywrapper)*** request, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To upload a CSV file in ZIP format. The response contains the "file_id". Use this ID while making the bulk write request. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/bulkwrite/ActionResponse.java)&gt;***   | createBulkWriteJob(***[RequestWrapper](#requestwrapper)*** request) | To create a bulk write job to insert, update, or upsert records. The response contains the "job_id". Use this ID while getting the status of the scheduled bulk write job. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseWrapper](#responsewrapper)&gt;*** | getBulkWriteJobDetails(***Long*** jobId) | To know the status of the bulk write job scheduled previously. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/bulkwrite/ResponseHandler.java)&gt;*** | downloadBulkWriteResult(***String*** downloadUrl)| To download the result of the bulk read job. The response contains a zip file. Extract it to get the CSV or ICS file depending on the "file_type" you specified while creating the bulk read job. |
----

### Inner Static Classes

| Class                                    |
| :--------------------------------------- |
| [UploadFileHeader](#uploadfileheader)   |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/BulkWriteOperations.java)

## BulkWriteResponse

Structure of Zoho CRM [BulkWriteResponse](../../src/main/java/com/zoho/crm/api/bulkwrite/BulkWriteResponse.java).

### Methods

| Return Type          | Method                                              |  Description                                                      |
| :--------------------| :-------------------------------------------------- | :---------------------------------------------------------------- |
| ***String***         | getStatus()                                         | The method to get the value of ***BulkWrite Status***             |
| ***void***           | setStatus(***String*** status)                      | The method to set the value of ***BulkWrite Status***             |
| ***String***         | getCharacterEncoding()                              | The method to get the value of ***BulkWrite CharacterEncoding***  |
| ***void***           | setCharacterEncoding(***String*** characterEncoding) | The method to set the value of ***BulkWrite CharacterEncoding*** |
| ***List&lt;[Resource](#resource)&gt;*** | getResource()                    | The method to get the list of obtained ***Resource*** instances   |
| ***void***           | setResource(***List&lt;[Resource](#resource)&gt;*** resource) | The method to set the list of obtained ***Resource*** instances |
| ***Long***           | getId()                                             | The method to get the value of ***BulkWrite Id***                 |
| ***void***           | setId(***Long*** id)                                | The method to set the value of ***BulkWrite Id***                 |
| ***[CallBack](#callback)*** | getCallback()                                | The method to get the value of ***BulkWrite CallBack***           |
| ***void***           | setCallback(***[CallBack](#callback)*** callback)   | The method to set the value of ***BulkWrite CallBack***           |
| ***[Result](#result)*** | getResult()                                      | The method to get the value of ***BulkWrite Result***             |
| ***void***           | setResult(***[Result](#result)*** result)           | The method to set the value of ***BulkWrite Result***             |
| ***[User](Users.md#user)*** | getCreatedBy()                               | The method to get the value of ***BulkWrite CreatedBy***          |
| ***void***           | setCreatedBy(***[User](Users.md#user)*** createdBy) | The method to set the value of ***BulkWrite CreatedBy***          |
| ***String***         | getOperation()                                      | The method to get the value of ***BulkWrite Operation***          |
| ***void***           | setOperation(***String*** operation)                | The method to set the value of ***BulkWrite Operation***          |
| ***OffsetDateTime*** | getCreatedTime()                                    | The method to get the value of ***BulkWrite CreatedTime***        |
| ***void***           | setCreatedTime(***OffsetDateTime*** createdTime)    | The method to set the value of ***BulkWrite CreatedTime***        |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/BulkWriteResponse.java)

## CallBack

Structure containing the URL where the BulkWrite Job details are posted upon completion.

### Methods

| Return Type  | Method                   |  Description                                           |
| :----------- | :----------------------- | :----------------------------------------------------- |
| ***String*** | getUrl()                 | The method to get the value of ***CallBack URL***      |
| ***void***   | setUrl(***String*** url) | The method to set the value of ***CallBack URL***      |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMethod() | The method to get the value of ***CallBack HTTP Method*** |
| ***void***   | setMethod(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** method) | The method to set the value of ***CallBack HTTP Method*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/CallBack.java)

## FieldMapping

Structure representing the properties of field data in the file.

### Methods

| Return Type   | Method                           |  Description                                                      |
| :------------ | :------------------------------- | :---------------------------------------------------------------- |
| ***String***  | getAPIName()                     | The method to get the value of ***FieldMapping APIName***         |
| ***void***    | setAPIName(***String*** apiName) | The method to set the value of ***FieldMapping APIName***         |
| ***Integer*** | getIndex()                       | The method to get the value of ***FieldMapping Index***           |
| ***void***    | setIndex(***Integer*** index)    | The method to set the value of ***FieldMapping Index***           |
| ***Integer*** | getFormat()                      | The method to get the value of ***FieldMapping Format***          |
| ***void***    | setFormat(***Integer*** format)  | The method to set the value of ***FieldMapping Format***          |
| ***String***  | getFindBy()                      | The method to get the value of ***FieldMapping FindBy***          |
| ***void***    | setFindBy(***String*** findBy)   | The method to set the value of ***FieldMapping FindBy***          |
| ***Map&lt;String, Object&gt;*** | getDefaultValue() | The method to get the value of ***FieldMapping DefaultValue*** |
| ***void***    | setDefaultValue(***Map&lt;String, Object&gt;*** defaultValue) | The method to set the value of ***FieldMapping DefaultValue*** |
| ***String***  | getModule()                      | The method to get the value of ***FieldMapping Module***          |
| ***void***    | setModule(***String*** module)   | The method to set the value of ***FieldMapping Module***          |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/FieldMapping.java)

## File

Structure representing the status of the data provided in the file.

### Methods

| Return Type      | Method                                      |  Description                                           |
| :--------------- | :------------------------------------------ | :----------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***File Status*** |
| ***void***       | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***File Status*** |
| ***String***     | getName()                                   | The method to get the ***File Name*** |
| ***void***       | setName(***String*** name)                  | The method to set the ***File Name*** |
| ***Integer***    | getAddedCount()                             | The method to get the value of ***File AddedCount*** |
| ***void***       | setAddedCount(***Integer*** addedCount)     | The method to set the value of ***File AddedCount*** |
| ***Integer***    | getSkippedCount()                           | The method to get the value of ***File SkippedCount*** |
| ***void***       | setSkippedCount(***Integer*** skippedCount) | The method to set the value of ***File SkippedCount*** |
| ***Integer***    | getUpdatedCount()                           | The method to get the value of ***File UpdatedCount*** |
| ***void***       | setUpdatedCount(***Integer*** updatedCount) | The method to set the value of ***File UpdatedCount*** |
| ***Integer***    | getTotalCount()                             | The method to get the value of ***File TotalCount*** |
| ***void***       | setTotalCount(***Integer*** totalCount)     | The method to set the value of ***File TotalCount*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/File.java)

## FileBodyWrapper

Serves as the request for uploading the file and response for downloading the result of a BulkWrite operation.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)***  | getFile() | The method to get the ***StreamWrapper*** class instance |
| ***void***           | setFile(***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)*** file) | The method to set the ***StreamWrapper*** class instance |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/FileBodyWrapper.java)

## RequestWrapper

After a successful **API** request, an instance of [RequestWrapper](../../src/main/java/com/zoho/crm/api/bulkwrite/RequestWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type  | Method                                  | Description                                                      |
| :----------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***String*** | getCharacterEncoding()                  | The method to get the value of ***BulkWrite Request CharacterEncoding***  |
| ***void***   | setCharacterEncoding(***String*** characterEncoding)| The method to set the value of ***BulkWrite Request CharacterEncoding*** |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getOperation() | The method to get the value of ***BulkWrite Request Operation*** |
| ***void***   | setOperation(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** operation)| The method to set the value of ***BulkWrite Request Operation*** |
| ***[Resource](#callback)*** | getCallback()           | The method to get the value of ***BulkWrite Request Callback***  |
| ***void***   | setCallback(***[Callback](#callback)*** callback) | The method to set the value of ***BulkWrite Request Callback***  |
| ***List&lt;[Resource](#resource)&gt;*** | getResource() | The method to get the value of ***BulkWrite Request Resource***  |
| ***void***   | setResource(***List&lt;[Resource](#resource)&gt;*** resource) | The method to set the value of ***BulkWrite Request Resource***  |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/RequestWrapper.java)

## Resource

Structure representing the properties of the data present in the file that serves as the request for creating a BulkWrite job and response for getting BulkWrite Job Details operation.

### Methods

| Return Type   | Method                                       |  Description                                           |
| :------------ | :------------------------------------------- | :----------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***Resource Status***|
| ***void***    | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** module)| The method to set the value of ***Resource Status***|
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getType() | The method to get the value of ***Resource Type***|
| ***void***    | setType(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** type)| The method to set the value of ***Resource Type***|
| ***String***  | getModule()                    | The method to get the value of ***Resource Module*** |
| ***void***    | setModule(***String*** module) | The method to set the value of ***Resource Module*** |
| ***String***  | getFileId()                    | The method to get the value of ***Resource FileId*** |
| ***void***    | setFileId(***String*** fileId) | The method to set the value of ***Resource FileId*** |
| ***Boolean*** | getIgnoreEmpty()               | The method to get the value of ***Resource IgnoreEmpty*** |
| ***void***    | setIgnoreEmpty(***Boolean*** ignoreEmpty) | The method to set the value of ***Resource IgnoreEmpty*** |
| ***String***  | getFindBy()                    | The method to get the value of ***Resource FindBy*** |
| ***void***    | setFindBy(***String*** findBy) | The method to set the value of ***Resource FindBy*** |
| ***List&lt;[FieldMapping](#fieldmapping)&gt;*** | getFieldMappings() | The method to get the value of ***Resource FieldMappings*** |
| ***void***    | setFieldMappings(***List&lt;[FieldMapping](#fieldmapping)&gt;*** fieldMappings) | The method to set the value of ***Resource FieldMappings*** |
| ***[File](#file)*** | getFile()                | The method to get the value of ***Resource File*** |
| ***void***    | setFile(***[File](#file)*** file) | The method to set the value of ***Resource File*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/Resource.java)

## Result

Structure containing the download URL that contains the result of the BulkWrite operation.

### Methods

| Return Type  | Method                                   | Description                                                       |
| :----------- | :--------------------------------------- | :---------------------------------------------------------------- |
| ***String*** | getDownloadUrl()                         | The method to get the value of ***BulkWrite Result DownloadUrl*** |
| ***void***   | setDownloadUrl(***String*** downloadUrl) | The method to set the value of ***BulkWrite Result DownloadUrl*** |
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/Result.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/bulkwrite/SuccessResponse.java) is returned.

### Methods

| Return Type                     | Method                                        | Description                                                    |
| :------------------------------ | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***     | getMessage()  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/bulkwrite/SuccessResponse.java)

## UploadFileHeader

Contains all possible headers for [Upload file operation](../../src/main/java/com/zoho/crm/api/bulkwrite/BulkWriteOperations.java).

### Fields

| Modifier and Type                                                    | Field     | Description                   |
| :------------------------------------------------------------------- | :-------- | :---------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;String&gt;*** | FEATURE   | Represents `feature` header   |
| ***static final [Header](../Header.md#header&lt;t>)&lt;String&gt;*** | X_CRM_ORG | Represents `X-CRM-ORG` header |
----
