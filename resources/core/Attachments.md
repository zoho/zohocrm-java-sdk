# Attachments

## Package com.zoho.crm.api.attachments

The Zoho CRM [Attachment API](https://www.zoho.com/crm/developer/docs/api/get-attachments.html) reference provides information about the possible operations on **Attachments**.

## Classes

| Class                                           | Implementing Interfaces                               |
|:----------------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)                 | Model, ActionHandler                                  |
| [APIException](#apiexception)                   | Model, ResponseHandler, ActionResponse, ActionHandler |
| [Attachment](#attachment)                       | Model                                                 |
| [AttachmentsOperations](#attachmentsoperations) |                                                       |
| [FileBodyWrapper](#filebodywrapper)             | Model, ResponseHandler                                |
| [ResponseWrapper](#responsewrapper)             | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse)             | Model, ActionResponse                                 |
----

## ActionWrapper

After a successful **API** request, and instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/attachments/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type                      | Method                                  | Description                                                      |
| :------------------------------- | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/attachments/ActionResponse.java)&gt;*** | getData() | The method to get the list of obtained ***ActionResponse*** instances. |
| ***void*** | setData(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/attachments/ActionResponse.java)&gt;*** data)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/attachments/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/attachments/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in the **API** response |
| ***void*** | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in the **API** response |
| ***void*** | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void*** | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void*** | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/attachments/APIException.java)

## Attachment

Structure of Zoho CRM [Attachment](../../src/main/java/com/zoho/crm/api/attachments/Attachment.java).

### Methods

| Return Type          | Method                                       |  Description                                           |
| :------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***[User](Users.md#user)*** | getOwner()                            | The method to get the value of ***Attachment Owner*** |
| ***void***           | setOwner(***[User](Users.md#user)*** owner)  | The method to set the value of ***Attachment Owner*** |
| ***OffsetDateTime*** | getModifiedTime()                            | The method to get the value of ***Attachment ModifiedTime*** |
| ***void***           | setModifiedTime(***OffsetDateTime*** modifiedTime) | The method to set the value of ***Attachment ModifiedTime*** |
| ***String***         | getFileName()                                | The method to get the value of ***Attachment FileName***     |
| ***void***           | setFileName(***String*** fileName)           | The method to set the value of ***Attachment FileName***     |
| ***OffsetDateTime*** | getCreatedTime()                             | The method to get the value of ***Attachment CreatedTime***  |
| ***void***           | setCreatedTime(***OffsetDateTime*** createdTime) | The method to set the value of ***Attachment CreatedTime***  |
| ***Long***           | getSize()                                    | The method to get the value of ***Attachment Size***         |
| ***void***           | setSize(***Long*** size)                     | The method to set the value of ***Attachment Size***         |
| ***[Record](Record.md#record-1)***         | getParentId()          | The method to get the value of ***Attachment ParentId***     |
| ***void***           | setParentId(***[Record](Record.md#record-1)*** parentId) | The method to set the value of ***Attachment ParentId***     |
| ***Boolean***        | getEditable()                                | The method to get the value of ***Attachment Editable***     |
| ***void***           | setEditable(***Boolean*** editable)          | The method to set the value of ***Attachment Editable***     |
| ***String***         | getFileId()                                  | The method to get the value of ***Attachment FileId***       |
| ***void***           | setFileId(***String*** fileId)               | The method to set the value of ***Attachment FileId***       |
| ***String***         | getType()                                    | The method to get the value of ***Attachment Type***         |
| ***void***           | setType(***String*** type)                   | The method to set the value of ***Attachment Type***         |
| ***String***         | getSeModule()                                | The method to get the value of ***Attachment SeModule***     |
| ***void***           | setSeModule(***String*** seModule)           | The method to set the value of ***Attachment SeModule***     |
| ***[User](Users.md#user)***           | getModifiedBy()             | The method to get the value of ***Attachment ModifiedBy***   |
| ***void***           | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Attachment ModifiedBy***   |
| ***String***         | getState()                                   | The method to get the value of ***Attachment State***        |
| ***void***           | setState(***String*** state)                 | The method to set the value of ***Attachment State***        |
| ***Long***           | getId()                                      | The method to get the value of ***Attachment Id***           |
| ***void***           | setId(***Long*** id)                         | The method to set the value of ***Attachment Id***           |
| ***[User](Users.md#user)***           | getCreatedBy()              | The method to get the value of ***Attachment CreatedBy***    |
| ***void***           | setCreatedBy(***[User](Users.md#user)*** createdBy) | The method to set the value of ***Attachment CreatedBy***    |
| ***String***         | getLinkUrl()                                 | The method to get the value of ***Attachment LinkUrl***      |
| ***void***           | setLinkUrl(***String*** linkUrl)             | The method to set the value of ***Attachment LinkUrl***      |
| ***String***         | getDescription()                             | The method to get the value of ***Attachment Description***  |
| ***void***           | setDescription(***String*** description)     | The method to set the value of ***Attachment Description***  |
| ***String***         | getCategory()                                | The method to get the value of ***Attachment Category***     |
| ***void***           | setCategory(***String*** category)           | The method to set the value of ***Attachment Category***     |

----

[source](../../src/main/java/com/zoho/crm/api/attachments/Attachment.java)

## AttachmentsOperations

Contains methods for all possible [Attachment operations](../../src/main/java/com/zoho/crm/api/attachments/AttachmentsOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [AttachmentsOperations](../../src/main/java/com/zoho/crm/api/attachments/AttachmentsOperations.java)(***String*** moduleAPIName, ***Long*** recordId)  |  Creates a ***AttachmentsOperations*** class instance with the ***moduleAPIName*** and ***recordId***.|
----

### Methods

| Return Type                         | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/attachments/ResponseHandler.java)&gt;*** | downloadAttachment(***Long*** id) | To download an attachment that was uploaded to a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/attachments/ActionHandler.java)&gt;***   | deleteAttachment(***Long*** id) | To delete an attachment that was added to a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/attachments/ResponseHandler.java)&gt;*** | getAttachments(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To fetch the list of attachments of a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/attachments/ActionHandler.java)&gt;***   | uploadAttachment(***[FileBodyWrapper](#filebodywrapper)*** request) | To upload attachments to a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/attachments/ActionHandler.java)&gt;***   | uploadLinkAttachment(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To upload a link as an attachment to a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/attachments/ActionHandler.java)&gt;***   | deleteAttachments(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To delete the attachments that were added to a record. |
----

### Inner Static Classes

| Class                                                      |
| :----------------------------------------------------------|
| [GetAttachmentsParam](#getattachmentsparam)   |
| [UploadLinkAttachmentParam](#uploadlinkattachmentparam)   |
| [DeleteAttachmentsParam](#deleteattachmentsparam)         |
----

[source](../../src/main/java/com/zoho/crm/api/attachments/AttachmentsOperations.java)

## FileBodyWrapper

Serves as request for uploading attachment and response for downloading attachment operations.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)***  | getFile() | The method to get the ***StreamWrapper*** class instances |
| ***void***           | setFile(***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)*** file) | The method to set the ***StreamWrapper*** class instances |
----

[source](../../src/main/java/com/zoho/crm/api/attachments/FileBodyWrapper.java)

## ResponseWrapper

After a successful **API** request, and instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/attachments/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type             | Method                              | Description                                                  |
| :---------------------------  | :---------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[Attachment](#attachment)&gt;*** | getData()                           | The method to get the list of obtained ***Attachment*** instances  |
| ***void***                   | setData(***List&lt;[Attachment](#attachment)&gt;*** data)| The method to set the list of obtained ***Attachment*** instances. |
| ***[Info](Record.md#info)***| getInfo() | The method to get the ***Attachment*** response information. |
| ***void***| setInfo(***[Info](Record.md#info)*** info) | The method to set the ***Attachment*** response information. |
----

[source](../../src/main/java/com/zoho/crm/api/attachments/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/attachments/SuccessResponse.java) is returned.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void***   | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void*** | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***   | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/attachments/SuccessResponse.java)

## GetAttachmentsParam

Contains all possible parameters for the [Get Attachments operation](../../src/main/java/com/zoho/crm/api/attachments/AttachmentsOperations.java).

### Fields

| Modifier and Type                                                  | Field    | Description                     |
| :----------------------------------------------------------------- | :------- | :------------------------------ |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | FIELDS   | Represents `fields` parameter   |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PAGE     | Represents `page` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PER_PAGE | Represents `per_page` parameter |
----

## UploadLinkAttachmentParam

Contains all possible parameters for the [Upload Link as attachment operation](../../src/main/java/com/zoho/crm/api/attachments/AttachmentsOperations.java).

### Fields

| Modifier and Type                | Field          | Description                          |
| :------------------------------- | :------------- | :----------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** |  ATTACHMENTURL | Represents `attachmentUrl` parameter |
----

## DeleteAttachmentsParam

Contains all possible parameters for the [Delete Attachments operation](../../src/main/java/com/zoho/crm/api/attachments/AttachmentsOperations.java).

### Fields

| Modifier and Type                                               | Field  | Description                |
| :-------------------------------------------------------------- | :-----:| :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;*** | IDS    | Represents `ids` parameter |
----