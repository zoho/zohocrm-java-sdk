# Tags

## Package com.zoho.crm.api.tags

The Zoho CRM [Tags API](https://www.zoho.com/crm/developer/docs/api/get-tag-list.html) reference provides information about the possible operations on **Tags**.

## Classes

| Class                               | Implementing Interfaces                     |
|:----------------------------------- | :------------------------------------------ |
| [ActionWrapper](#actionwrapper)     | Model, ActionHandler                        |
| [APIException](#apiexception)       | Model, ResponseHandler, ActionResponse, ActionHandler, RecordActionResponse, RecordActionHandler, CountHandler |
| [BodyWrapper](#bodywrapper)         | Model                                       |
| [ConflictWrapper](#conflictwrapper) | Model                                       |
| [CountWrapper](#countwrapper)       | Model                                       |
| [Info](#info)                       | Model                                       |
| [MergeWrapper](#mergewrapper)       | Model                                       |
| [RecordActionWrapper](#recordactionwrapper) | Model, RecordActionHandler          |
| [ResponseWrapper](#responsewrapper) | Model                                       |
| [SuccessResponse](#successresponse) | Model, ActionResponse, RecordActionResponse |
| [Tag](#tag)                         | Model                                       |
| [TagsOperations](#tagsoperations)   |                                             |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/tags/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/tags/ActionResponse.java)&gt;*** | getTags() | The method to get the list of obtained ***ActionResponse*** instances |
| ***void***  | setTags(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/tags/ActionResponse.java)&gt;*** tags) | The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/tags/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/tags/APIException.java) is returned for all operations.

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
[source](../../src/main/java/com/zoho/crm/api/tags/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type                  | Method                   | Description                                                 |
| :---------------------------- | :----------------------- | :---------------------------------------------------------- |
| ***List&lt;[Tag](#tag)&gt;*** | getTags()                | The method to get the list of obtained ***Tag*** instances. |
| ***void*** | setTags(***List&lt;[Tag](#tag)&gt;*** tags) | The method to set the list of obtained ***Tag*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/tags/BodyWrapper.java)

## ConflictWrapper

A structure that contains all possible keys of a single Merge Tag request.

### Methods

|  Return Type | Method                                 | Description                                                     |
| :----------- | :------------------------------------- | :-------------------------------------------------------------- |
| ***String*** | getConflictId()                        | The method to get the value of ***ConflictWrapper ConflictId*** |
| ***void***   | setConflictId(***String*** conflictId) | The method to set the value of ***ConflictWrapper ConflictId*** |
----

[source](../../src/main/java/com/zoho/crm/api/tags/ConflictWrapper.java)

## CountWrapper

After a successful **API** request, an instance of [CountWrapper](../../src/main/java/com/zoho/crm/api/tags/CountWrapper.java) is returned for ***Get Record Count For Tag***  operation

### Methods

|  Return Type | Method                       | Description                                             |
| :----------- | :--------------------------- | :------------------------------------------------------ |
| ***String*** | getCount()                   | The method to get the value of ***CountWrapper Count*** |
| ***void***   | setCount(***String*** count) | The method to set the value of ***CountWrapper Count*** |
----

[source](../../src/main/java/com/zoho/crm/api/tags/CountWrapper.java)

## Info

Structure representing additional information about the retrieved data.

### Methods

| Return Type   | Method                                      |  Description                                           |
| :------------ | :------------------------------------------ | :----------------------------------------------------- |
| ***Integer*** | getCount()                                  | The method to get the value of ***Info Count***        |
| ***void***    | setCount(***Integer*** count)               | The method to set the value of ***Info Count***        |
| ***Integer*** | getAllowedCount()                           | The method to get the value of ***Info AllowedCount*** |
| ***void***    | setAllowedCount(***Integer*** allowedCount) | The method to set the value of ***Info AllowedCount*** |
----

[source](../../src/main/java/com/zoho/crm/api/tags/Info.java)

## MergeWrapper

Structure that serves as the request for Merge Tags operation.

### Methods

| Return Type                     | Method                                          | Description                                                             |
| :------------------------------ | :---------------------------------------------- | :---------------------------------------------------------------------- |
| ***List&lt;[ConflictWrapper](#conflictwrapper)&gt;*** | getTags()                 | The method to get the list of obtained ***ConflictWrapper*** instances. |
| ***void*** | setTags(***List&lt;[ConflictWrapper](#conflictwrapper)&gt;*** tags)  | The method to set the list of obtained ***ConflictWrapper*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/tags/MergeWrapper.java)

## RecordActionWrapper

After a successful **API** request involving record, an instance of [RecordActionWrapper](../../src/main/java/com/zoho/crm/api/tags/RecordActionWrapper.java) is returned for **POST** operations

### Methods

| Return Type                     | Method                                          | Description                                                             |
| :------------------------------ | :---------------------------------------------- | :---------------------------------------------------------------------- |
| ***List&lt;[RecordActionResponse](../../src/main/java/com/zoho/crm/api/tags/RecordActionResponse.java)&gt;*** | getData() | The method to get the list of obtained ***RecordActionResponse*** instances. |
| ***void***    | setData(***List&lt;[RecordActionResponse](../../src/main/java/com/zoho/crm/api/tags/RecordActionResponse.java)&gt;*** data) | The method to set the list of obtained ***RecordActionResponse*** instances. |
| ***Boolean*** | getWfScheduler()                           | The method to get the value of ***RecordActionWrapper WfScheduler***.  |
| ***void***    | setWfScheduler(***Boolean*** wfScheduler)  | The method to set the value of ***RecordActionWrapper WfScheduler***.  |
| ***String***  | getSuccessCount()                          | The method to get the value of ***RecordActionWrapper SuccessCount***. |
| ***void***    | setSuccessCount(***String*** successCount) | The method to set the value of ***RecordActionWrapper SuccessCount***. |
| ***Integer*** | getLockedCount()                           | The method to get the value of ***RecordActionWrapper LockedCount***.  |
| ***void***    | setLockedCount(***Integer*** lockedCount)  | The method to set the value of ***RecordActionWrapper LockedCount***.  |
----

[source](../../src/main/java/com/zoho/crm/api/tags/RecordActionWrapper.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/tags/ResponseWrapper.java) is returned for GET operations.

### Methods

| Return Type                   | Method                                      | Description                                                  |
| :---------------------------- | :------------------------------------------ | :----------------------------------------------------------- |
| ***List&lt;[Tag](#tag)&gt;*** | getTags()                                   | The method to get the list of obtained ***User*** instances  |
| ***void***                    | setTags(***List&lt;[Tag](#tag)&gt;*** tags) | The method to set the list of obtained ***User*** instances. |
| ***[Info](#info)***           | getInfo()                                   | The method to get the value of ***Info*** instance           |
| ***void***                    | setInfo(***[Info](#info)*** info)           | The method to set the value of ***Info*** instance.          |
----

[source](../../src/main/java/com/zoho/crm/api/tags/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/tags/SuccessResponse.java) is returned.

### Methods

| Return Type                      | Method                                          | Description                                                            |
| :------------------------------- | :---------------------------------------------- | :--------------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void***     | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***     | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response|
| ***void***     | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***     | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/tags/SuccessResponse.java)

## Tag

Structure of Zoho CRM [Tag](../../src/main/java/com/zoho/crm/api/tags/Tag.java).

### Methods

| Return Type   | Method                                                |  Description                                          |
| :------------ | :---------------------------------------------------- | :---------------------------------------------------- |
| ***OffsetDateTime***  | getCreatedTime()                              | The method to get the value of ***Tag CreatedTime***  |
| ***void***    | setCreatedTime(***OffsetDateTime*** createdTime)      | The method to set the value of ***Tag CreatedTime***  |
| ***OffsetDateTime***  | getModifiedTime()                             | The method to get the value of ***Tag ModifiedTime*** |
| ***void***    | setModifiedTime(***OffsetDateTime*** modifiedTime)    | The method to set the value of ***Tag ModifiedTime*** |
| ***String***  | getName()                                             | The method to get the value of ***Tag Name***         |
| ***void***    | setName(***String*** name)                            | The method to set the value of ***Tag Name***         |
| ***[User](Users.md#user)*** | getModifiedBy()                         | The method to get the value of ***Tag ModifiedBy***   |
| ***void***    | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Tag ModifiedBy***   |
| ***Long***    | getId()                                               | The method to get the value of ***Tag Id***           |
| ***void***    | setId(***Long*** id)                                  | The method to set the value of ***Tag Id***           |
| ***[User](Users.md#user)*** | getCreatedBy()                          | The method to get the value of ***Tag CreatedBy***    |
| ***void***    | setCreatedBy(***[User](Users.md#user)*** createdBy)   | The method to set the value of ***Tag CreatedBy***    |
----

[source](../../src/main/java/com/zoho/crm/api/tags/Tag.java)

## TagsOperations

Contains methods for all possible [Tags operations](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/tags/ResponseHandler.java)&gt;*** | getTags(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the list of all tags in your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/tags/ActionHandler.java)&gt;*** | createTags(***[BodyWrapper](#bodywrapper)*** request, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To create tags. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/tags/ActionHandler.java)&gt;*** | updateTags(***[BodyWrapper](#bodywrapper)*** request, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To update multiple tags. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/tags/ActionHandler.java)&gt;*** | updateTag(***Long*** id, ***[BodyWrapper](#bodywrapper)*** request, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To update a specific tag. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/tags/ActionHandler.java)&gt;*** | deleteTag( ***Long*** id) | To delete a specific tag from the module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/tags/ActionHandler.java)&gt;*** | mergeTags(***Long*** id, ***[MergeWrapper](#mergewrapper)*** request) | To merge two tags. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[RecordActionHandler](../../src/main/java/com/zoho/crm/api/tags/RecordActionHandler.java)&gt;*** | addTagsToRecord(***Long*** recordId, ***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To add tags to a specific record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[RecordActionHandler](../../src/main/java/com/zoho/crm/api/tags/RecordActionHandler.java)&gt;*** | removeTagsFromRecord(***Long*** recordId, ***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To remove tags from a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[RecordActionHandler](../../src/main/java/com/zoho/crm/api/tags/RecordActionHandler.java)&gt;*** | addTagsToMultipleRecords(***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To add tags to multiple records. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[RecordActionHandler](../../src/main/java/com/zoho/crm/api/tags/RecordActionHandler.java)&gt;*** | removeTagsFromMultipleRecords(***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To remove tags from multiple records. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[RecordActionHandler](../../src/main/java/com/zoho/crm/api/tags/RecordActionHandler.java)&gt;*** | getRecordCountForTag(***Long*** id, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the record count for a tag. |
----

### Inner Static Classes

| Class                                                                     |
| :------------------------------------------------------------------------ |
| [GetTagsParam](#gettagsparam)                                             |
| [CreateTagsParam](#createtagsparam)                                       |
| [UpdateTagsParam](#updatetagsparam)                                       |
| [UpdateTagParam](#updatetagparam)                                         |
| [AddTagsToRecordParam](#addtagstorecordparam)                             |
| [RemoveTagsFromRecordParam](#removetagsfromrecordparam)                   |
| [AddTagsToMultipleRecordsParam](#addtagstomultiplerecordsparam)           |
| [RemoveTagsFromMultipleRecordsParam](#removetagsfrommultiplerecordsparam) |
| [GetRecordCountForTagParam](#getrecordcountfortagparam)                   |
----

[source](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java)

## GetTagsParam

Contains all possible parameters for the [Get Tags operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field     | Description                    |
| :----------------------------------------------------------------- | :-------- | :----------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  MODULE   | Represents `module` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  MY_TAGS  | Represents `my_tags` parameter |
----

## CreateTagsParam

Contains all possible parameters for the [Create Tags operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field     | Description                    |
| :----------------------------------------------------------------- | :-------- | :----------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  MODULE   | Represents `module` parameter  |
----

## UpdateTagsParam

Contains all possible parameters for the [Update Tags operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field     | Description                    |
| :----------------------------------------------------------------- | :-------- | :----------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  MODULE   | Represents `module` parameter  |
----

## UpdateTagParam

Contains all possible parameters for the [Update Tag operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field     | Description                    |
| :----------------------------------------------------------------- | :-------- | :----------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  MODULE   | Represents `module` parameter  |
----

## AddTagsToRecordParam

Contains all possible parameters for the [Add Tags To Record operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field       | Description                       |
| :----------------------------------------------------------------- | :---------- | :-------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  TAG_NAMES  | Represents `tag_names` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  OVER_WRITE | Represents `over_write` parameter |
----

## RemoveTagsFromRecordParam

Contains all possible parameters for the [Remove Tags From Record operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field       | Description                       |
| :----------------------------------------------------------------- | :---------- | :-------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  TAG_NAMES  | Represents `tag_names` parameter  |
----

## AddTagsToMultipleRecordsParam

Contains all possible parameters for the [Add Tags To Multiple Records operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field      | Description                       |
| :----------------------------------------------------------------- | :--------- | :-------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | TAG_NAMES  | Represents `tag_names` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;***    | IDS        | Represents `ids` parameter        |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | OVER_WRITE | Represents `over_write` parameter |
----

## RemoveTagsFromMultipleRecordsParam

Contains all possible parameters for the [Remove Tags From Multiple Records operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field       | Description                       |
| :----------------------------------------------------------------- | :---------- | :-------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  TAG_NAMES  | Represents `tag_names` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;***    |  IDS        | Represents `ids` parameter        |
----

## GetRecordCountForTagParam

Contains all possible parameters for the [Get Record Count For Tag operation](../../src/main/java/com/zoho/crm/api/tags/TagsOperations.java).

### Fields

| Modifier and Type                                                  | Field  | Description                   |
| :----------------------------------------------------------------- | :----- | :---------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | MODULE | Represents `module` parameter |
----
