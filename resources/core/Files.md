# Files

## Package com.zoho.crm.api.file

The Zoho CRM [Files API](https://www.zoho.com/crm/developer/docs/api/upload-files-to-zfs.html) reference provides information about the possible operations on **Files**.

## Classes

| Class                                     | Implementing Interfaces                               |
|:----------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)           | Model, ActionHandler                                  |
| [APIException](#apiexception)             | Model, ActionResponse, ActionHandler, ResponseHandler |
| [Bodywrapper](#bodywrapper)               | Model                                                 |
| [FileBodyWrapper](#filebodywrapper)       | Model, ResponseHandler                                |
| [FileOperations](#fileoperations)         |                                                       |
| [SuccessResponse](#successresponse)       | Model, ActionResponse                                 |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/file/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type                 | Method                                  | Description                                                      |
| :-------------------------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/file/ActionResponse.java)&gt;*** | getData() | The method to get the list of obtained ***ActionResponse*** instances  |
| ***void*** | setData(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/file/ActionResponse.java)&gt;*** data)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/file/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/file/APIException.java) is returned for all operations.

### Methods

| Return Type                     | Method                                        | Description                                                    |
| :------------------------------ | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/file/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type         | Method                                     | Description                                                            |
| :------------------- | :----------------------------------------- | :--------------------------------------------------------------------- |
| ***List&lt;[StreamWrapper](../util/StreamWrapper.md#streamwrapper)&gt;*** | getFile() | The method to get the list of obtained ***StreamWrapper*** instances |
| ***void***           | setFile(***List&lt;[StreamWrapper](../util/StreamWrapper.md#streamwrapper)&gt;*** file)| The method to set the list of obtained ***StreamWrapper*** instances |
----

[source](../../src/main/java/com/zoho/crm/api/file/BodyWrapper.java)

## FileBodyWrapper

Serves as response for downloading file operation.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)***  | getFile() | The method to get the ***StreamWrapper*** class instance |
| ***void***           | setFile(***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)*** file) | The method to set the ***StreamWrapper*** class instance |
----

[source](../../src/main/java/com/zoho/crm/api/file/FileBodyWrapper.java)

## FileOperations

Contains methods for all possible [File operations](../../src/main/java/com/zoho/crm/api/file/FileOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/file/ActionHandler.java)&gt;*** | uploadFiles(***[BodyWrapper](#bodywrapper)*** request, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To upload a file and get the encrypted ID. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/file/ResponseHandler.java)&gt;*** | getFile(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the uploaded file through its encrypted ID.|
----

### Inner Static Classes

| Class                               |
| :---------------------------------- |
| [UploadFilesParam](#uploadfilesparam) |
| [GetFileParam](#getfileparam)       |
----

[source](../../src/main/java/com/zoho/crm/api/file/FileOperations.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/file/SuccessResponse.java) is returned.

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

[source](../../src/main/java/com/zoho/crm/api/file/SuccessResponse.java)

## UploadFilesParam

Contains all possible parameters for the [Upload Files operation](../../src/main/java/com/zoho/crm/api/file/FileOperations.java).

### Fields

| Modifier and Type                                                 | Field  | Description                 |
| :---------------------------------------------------------------- | :----- | :-------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | TYPE   | Represents `type` parameter |
----

## GetFileParam

Contains all possible parameters for the [Get File operation](../../src/main/java/com/zoho/crm/api/file/FileOperations.java).

### Fields

| Modifier and Type                                                 | Field  | Description                |
| :---------------------------------------------------------------- | :-----:| :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | ID     | Represents `id` parameter  |
----
