# Notes

## Package com.zoho.crm.api.notes

The Zoho CRM [Notes API](https://www.zoho.com/crm/developer/docs/api/get-notes.html) reference provides information about the possible operations on **Notes**.

## Classes

| Class                               | Implementing Interfaces                               |
|:----------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)     | Model, ActionHandler                                  |
| [APIException](#apiexception)       | Model, ResponseHandler, ActionResponse, ActionHandler |
| [BodyWrapper](#bodywrapper)         | Model                                                 |
| [Info](#info)                       | Model                                                 |
| [Note](#note)                       | Model                                                 |
| [NotesOperations](#notesoperations) |                                                       |
| [ResponseWrapper](#responsewrapper) | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse) | Model, ActionResponse                                 |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/notes/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type                | Method                                  | Description                                                      |
| :------------------------- | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/notes/ActionResponse.java)&gt;*** | getData() | The method to get the list of obtained ***ActionResponse*** instances |
| ***void*** | setData(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/notes/ActionResponse.java)&gt;*** data)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/notes/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/notes/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***   | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response|
| ***void***   | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***   | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/notes/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type          | Method                     | Description                                               |
| :-------------------- | :------------------------- | :-------------------------------------------------------- |
| ***List&lt;[Note](#note)&gt;*** | getData() | The method to get the list of obtained ***BluePrint*** instances |
| ***void***            | setData(***List&lt;[Note](#note)&gt;*** data) | The method to set the list of obtained ***BluePrint*** instances |
----

[source](../../src/main/java/com/zoho/crm/api/notes/BodyWrapper.java)

## Info

The structure containing the additional properties of Notes.

### Methods

| Return Type   | Method                                    |  Description                                           |
| :------------ | :---------------------------------------- | :----------------------------------------------------- |
| ***Integer*** | getPerPage()                              | The method to get the value of ***Info PerPage***      |
| ***void***    | setPerPage(***Integer*** perPage)         | The method to set the value of ***Info PerPage***      |
| ***Integer*** | getCount()                                | The method to get the value of ***Info Count***        |
| ***void***    | setCount(***Integer*** count)             | The method to set the value of ***Info Count***        |
| ***Integer*** | getPage()                                 | The method to get the value of ***Info Page***         |
| ***void***    | setPage(***Integer*** page)               | The method to set the value of ***Info Page***         |
| ***Boolean*** | getMoreRecords()                          | The method to get the value of ***Info MoreRecords***  |
| ***void***    | setMoreRecords(***Boolean*** moreRecords) | The method to set the value of ***Info MoreRecords***  |
----

[source](../../src/main/java/com/zoho/crm/api/notes/Info.java)

## Note

Structure of Zoho CRM [Note](../../src/main/java/com/zoho/crm/api/notes/Note.java).

### Methods

| Return Type          | Method                                       |  Description                                           |
| :------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***[User](Users.md#user)*** | getOwner()                            | The method to get the value of ***Note Owner***        |
| ***void***           | setOwner(***[User](Users.md#user)*** owner)  | The method to set the value of ***Note Owner***        |
| ***OffsetDateTime*** | getModifiedTime()                            | The method to get the value of ***Note ModifiedTime*** |
| ***void***           | setModifiedTime(***OffsetDateTime*** modifiedTime) | The method to set the value of ***Note ModifiedTime*** |
| ***List&lt;[Attachment](Attachments.md#attachment)&gt;*** | getAttachments() | The method to get the value of ***Note Attachments*** |
| ***void***  | setAttachments(***List&lt;[Attachment](Attachments.md#attachment)&gt;*** attachments) | The method to set the value of ***Note Attachments*** |
| ***OffsetDateTime*** | getCreatedTime()                             | The method to get the value of ***Note CreatedTime***  |
| ***void***           | setCreatedTime(***OffsetDateTime*** createdTime) | The method to set the value of ***Note CreatedTime*** |
| ***[Record](Record.md#record-1)*** | getParentId()                   | The method to get the value of ***Note ParentId***     |
| ***void***           | setParentId(***[Record](Record.md#record-1)*** parentId) | The method to set the value of ***Note ParentId*** |
| ***Boolean***        | getEditable()                                | The method to get the value of ***Note Editable***     |
| ***void***           | setEditable(***Boolean*** editable)          | The method to set the value of ***Note Editable***     |
| ***String***         | getSeModule()                                | The method to get the value of ***Note SeModule***     |
| ***void***           | setSeModule(***String*** seModule)           | The method to set the value of ***Note SeModule***     |
| ***Boolean***        | getIsSharedToClient()                        | The method to get the value of ***Note IsSharedToClient*** |
| ***void***           | setIsSharedToClient(***Boolean*** isSharedToClient) | The method to set the value of ***Note IsSharedToClient*** |
| ***[User](Users.md#user)*** | getModifiedBy()                       | The method to get the value of ***Note ModifiedBy***   |
| ***void***           | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Note ModifiedBy*** |
| ***String***         | getSize()                                    | The method to get the value of ***Note Size***         |
| ***void***           | setSize(***String*** size)                   | The method to set the value of ***Note Size***         |
| ***String***         | getState()                                   | The method to get the value of ***Note State***        |
| ***void***           | setState(***String*** state)                 | The method to set the value of ***Note State***        |
| ***Boolean***        | getVoiceNote()                               | The method to get the value of ***Note VoiceNote***    |
| ***void***           | setVoiceNote(***Boolean*** voiceNote)        | The method to set the value of ***Note VoiceNote***    |
| ***Long***           | getId()                                      | The method to get the value of ***Note Id***           |
| ***void***           | setId(***Long*** id)                         | The method to set the value of ***Note Id***           |
| ***[User](Users.md#user)*** | getCreatedBy()                        | The method to get the value of ***Note CreatedBy***    |
| ***void***           | setCreatedBy(***[User](Users.md#user)*** createdBy) | The method to set the value of ***Note CreatedBy*** |
| ***String***         | getNoteTitle()                               | The method to get the value of ***Note NoteTitle***    |
| ***void***           | setNoteTitle(***String*** noteTitle)         | The method to set the value of ***Note NoteTitle***    |
| ***String***         | getNoteContent()                             | The method to get the value of ***Note NoteContent***  |
| ***void***           | setNoteContent(***String*** noteContent)     | The method to set the value of ***Note NoteContent***  |
----

[source](../../src/main/java/com/zoho/crm/api/notes/Note.java)

## NotesOperations

Contains methods for all possible [Notes operations](../../src/main/java/com/zoho/crm/api/notes/NotesOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/notes/ResponseHandler.java)&gt;*** | getNotes(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get the list of notes of a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notes/ActionHandler.java)&gt;*** | createNotes(***[BodyWrapper](#bodywrapper)*** request) | To add new notes to a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notes/ActionHandler.java)&gt;*** | updateNotes(***[BodyWrapper](#bodywrapper)*** request) | To update the details of the notes of a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notes/ActionHandler.java)&gt;*** | deleteNotes(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To delete the notes of a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/notes/ResponseHandler.java)&gt;*** | getNote(***Long*** id, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance)| To get the details of a specific note. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notes/ActionHandler.java)&gt;*** | updateNote(***Long*** id, ***[BodyWrapper](#bodywrapper)*** request) | To update the details of an existing note. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notes/ActionHandler.java)&gt;*** | deleteNote(***Long*** id) | To delete a specific note. |
----

### Inner Static Classes

| Class                                 |
| :------------------------------------ |
| [GetNotesParam](#getnotesparam)       |
| [GetNotesHeader](#getnotesheader)     |
| [DeleteNotesParam](#deletenotesparam) |
| [GetNoteParam](#getnoteparam) |
| [GetNoteHeader](#getnoteheader) |
----

[source](../../src/main/java/com/zoho/crm/api/notes/NotesOperations.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/notes/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type                     | Method                              | Description                                                  |
| :------------------------------ | :---------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[Note](#note)&gt;*** | getData()                           | The method to get the list of obtained ***Note*** instances  |
| ***void***                      | setData(***List&lt;[Note](#note)&gt;*** data) | The method to set the list of obtained ***Note*** instances. |
| ***[Info](#info)***             | getInfo()                           | The method to get the ***Note*** response information.       |
| ***void***                      | setInfo(***[Info](#info)*** info)   | The method to set the ***Note*** response information.       |
----

[source](../../src/main/java/com/zoho/crm/api/notes/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/notes/SuccessResponse.java) is returned.

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

[source](../../src/main/java/com/zoho/crm/api/notes/SuccessResponse.java)

## GetNotesParam

Contains all possible parameters for the [Get Notes operation](../../src/main/java/com/zoho/crm/api/notes/NotesOperations.java).

### Fields

| Modifier and Type                                                 | Field    | Description                     |
| :---------------------------------------------------------------- | :------- | :------------------------------ |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | PAGE     | Represents `page` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | PER_PAGE | Represents `per_page` parameter |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | FIELDS   | Represents `fields` parameter   |
----

## GetNotesHeader

Contains all possible headers for [Get Notes operation](../../src/main/java/com/zoho/crm/api/notes/NotesOperations.java).

### Fields

| Modifier and Type                                                            | Field              | Description                           |
| :--------------------------------------------------------------------------- | :----------------- | :------------------------------------ |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** |  IF_MODIFIED_SINCE | Represents `If-Modified-Since` header |
----

## DeleteNotesParam

Contains all possible parameters for the [Delete Notes operation](../../src/main/java/com/zoho/crm/api/notes/NotesOperations.java).

### Fields

| Modifier and Type                                               | Field  | Description                |
| :-------------------------------------------------------------- | :-----:| :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;*** | IDS    | Represents `ids` parameter |
----

## GetNoteParam

Contains all possible parameters for the [Get Note operation](../../src/main/java/com/zoho/crm/api/notes/NotesOperations.java).

### Fields

| Modifier and Type                                                 | Field  | Description                   |
| :---------------------------------------------------------------- | :----- | :---------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | FIELDS | Represents `fields` parameter |
----

## GetNoteHeader

Contains all possible headers for [Get Note operation](../../src/main/java/com/zoho/crm/api/notes/NotesOperations.java).

### Fields

| Modifier and Type                                                            | Field              | Description                           |
| :--------------------------------------------------------------------------- | :----------------- | :------------------------------------ |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** |  IF_MODIFIED_SINCE | Represents `If-Modified-Since` header |
----
