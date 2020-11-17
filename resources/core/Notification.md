# Notification

## Package com.zoho.crm.api.notification

The Zoho CRM [Notification API](https://www.zoho.com/crm/developer/docs/api/notifications/overview.html) reference provides information about the possible operations on **Notification**.

## Classes

| Class                                             | Implementing Interfaces                               |
|:------------------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)                   | Model, ActionHandler                                  |
| [APIException](#apiexception)                     | Model, ResponseHandler, ActionResponse, ActionHandler |
| [BodyWrapper](#bodywrapper)                       | Model                                                 |
| [Notification](#notification)                     | Model                                                 |
| [NotificationOperations](#notificationoperations) |                                                       |
| [ResponseWrapper](#responsewrapper)               | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse)               | Model, ActionResponse                                 |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/notification/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations.

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------- | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/notification/ActionResponse.java)&gt;*** | getWatch() | The method to get the list of obtained ***ActionResponse*** instances. |
| ***void***  | setWatch(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/notification/ActionResponse.java)&gt;*** watch)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/notification/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/notification/APIException.java) is returned for all operations.

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

[source](../../src/main/java/com/zoho/crm/api/notification/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a request.

### Methods

| Return Type | Method                                               | Description                                                        |
| :---------- | :----------------------------------------------------| :----------------------------------------------------------------- |
| ***List&lt;[Notification](#notification)&gt;*** | getWatch() | The method to get the list of obtained ***Notification*** instances |
| ***void***  | setWatch(***List&lt;[Notification](#notification)&gt;*** watch) | The method to set the list of obtained ***Notification*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/notification/BodyWrapper.java)

## Info

Structure representing additional information about the retrieved data.

### Methods

| Return Type   | Method                                    |  Description                                          |
| :------------ | :---------------------------------------- | :---------------------------------------------------- |
| ***Integer*** | getPerPage()                              | The method to get the value of ***Info PerPage***     |
| ***void***    | setPerPage(***Integer*** perPage)         | The method to set the value of ***Info PerPage***     |
| ***Integer*** | getCount()                                | The method to get the value of ***Info Count***       |
| ***void***    | setCount(***Integer*** count)             | The method to set the value of ***Info Count***       |
| ***Integer*** | getPage()                                 | The method to get the value of ***Info Page***        |
| ***void***    | setPage(***Integer*** page)               | The method to set the value of ***Info Page***        |
| ***Boolean*** | getMoreRecords()                          | The method to get the value of ***Info MoreRecords*** |
| ***void***    | setMoreRecords(***Boolean*** moreRecords) | The method to set the value of ***Info MoreRecords*** |
----

[source](../../src/main/java/com/zoho/crm/api/notification/Info.java)

## Notification

Structure of Zoho CRM [Notification](../../src/main/java/com/zoho/crm/api/notification/Notification.java).

### Methods

| Return Type      | Method                                               | Description                                                     |
| :--------------- | :--------------------------------------------------- | :-------------------------------------------------------------- |
| ***OffsetDateTime*** | getChannelExpiry()                               | The method to get the ***Notification ChannelExpiry***          |
| ***void***       | setChannelExpiry(***OffsetDateTime*** channelExpiry) | The method to set the ***Notification ChannelExpiry***          |
| ***String***     | getResourceUri()                                     | The method to get the value of ***Notification ResourceUri***   |
| ***void***       | setResourceUri(***String*** resourceUri)             | The method to set the value of ***Notification ResourceUri***   |
| ***String***     | getResourceId()                                      | The method to get the value of ***Notification ResourceId***    |
| ***void***       | setResourceId(***String*** resourceId)               | The method to set the value of ***Notification ResourceId***    |
| ***String***     | getNotifyUrl()                                       | The method to get the value of ***Notification NotifyUrl***     |
| ***void***       | setNotifyUrl(***String*** notifyUrl)                 | The method to set the value of ***Notification NotifyUrl***     |
| ***String***     | getResourceName()                                    | The method to get the value of ***Notification ResourceName***  |
| ***void***       | setResourceName(***String*** resourceName)           | The method to set the value of ***Notification ResourceName***  |
| ***Long***       | getChannelId()                                       | The method to get the value of ***Notification ChannelId***     |
| ***void***       | setChannelId(***Long*** channelId)                   | The method to set the value of ***Notification ChannelId***     |
| ***List&lt;String&gt;*** | getEvents()                                  | The method to get the value of ***Notification Events***        |
| ***void***       | setEvents(***List&lt;String&gt;*** events)           | The method to set the value of ***Notification Events***        |
| ***String***     | getToken()                                           | The method to get the value of ***Notification Token***         |
| ***void***       | setToken(***String*** token)                         | The method to set the value of ***Notification Token***         |
| ***Boolean***    | getNotifyOnRelatedAction()                           | The method to get the value of ***Notification NotifyOnRelatedAction*** |
| ***void***       | setNotifyOnRelatedAction(***Boolean*** notifyOnRelatedAction) | The method to set the value of ***Notification NotifyOnRelatedAction*** |
| ***Map&lt;String, Object&gt;*** | getFields()                           | The method to get the value of ***Notification Fields***        |
| ***void***       | setFields(***Map&lt;String, Object&gt;*** fields)    | The method to set the value of ***Notification Fields***        |
| ***Boolean***    | getDeleteevents()                                    | The method to get the value of ***Notification Deleteevents***  |
| ***void***       | setDeleteevents(***Boolean*** deleteevents)          | The method to set the value of ***Notification Deleteevents***  |
----

[source](../../src/main/java/com/zoho/crm/api/notification/Notification.java)

## NotificationOperations

Contains methods for all possible [Notification operations](../../src/main/java/com/zoho/crm/api/notification/NotificationOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notification/ActionHandler.java)&gt;*** | enableNotifications(***[BodyWrapper](#bodywrapper)*** request) | To enable instant notifications of actions performed on a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/notification/ResponseHandler.java)&gt;*** | getNotificationDetails(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the details of the notifications enabled by the user.
|
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notification/ActionHandler.java)&gt;*** | updateNotifications(***[BodyWrapper](#bodywrapper)*** request) | To update the details of the notifications enabled by a user. All the provided details would be persisted and rest of the details would be removed.|
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notification/ActionHandler.java)&gt;*** | updateNotification(***[BodyWrapper](#bodywrapper)*** request) | To update only specific details of a specific notification enabled by the user. All the provided details would be persisted and rest of the details will not be removed.|
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notification/ActionHandler.java)&gt;*** | disableNotifications(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To stop all the instant notifications enabled by the user for a channel.|
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/notification/ActionHandler.java)&gt;*** | disableNotification(***[BodyWrapper](#bodywrapper)*** request) | To disable notifications for the specified events in a channel.
|
----

### Inner Static Classes

| Class                                                       |
| :---------------------------------------------------------- |
| [GetNotificationDetailsParam](#getnotificationdetailsparam) |
| [DisableNotificationsParam](#disablenotificationsparam)     |
----

[source](../../src/main/java/com/zoho/crm/api/notification/NotificationOperations.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/notification/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type | Method                                         | Description                                                        |
| :---------- | :----------------------------------------------| :----------------------------------------------------------------- |
| ***List&lt;[Notification](#notification)&gt;*** | getWatch() | The method to get the list of obtained ***Notification*** instances. |
| ***void***  | setWatch(***List&lt;[Notification](#notification)&gt;*** watch) | The method to set the list of obtained ***Notification*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/notification/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/notification/SuccessResponse.java) is returned.

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

[source](../../src/main/java/com/zoho/crm/api/notification/SuccessResponse.java)

## GetNotificationDetailsParam

Contains all possible parameters for the [Get Notification Details operation](../../src/main/java/com/zoho/crm/api/notification/NotificationOperations.java).

### Fields

| Modifier and Type                                                  | Field      | Description                       |
| :----------------------------------------------------------------- | :--------- | :-------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PAGE       | Represents `page` parameter       |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PER_PAGE   | Represents `per_page` parameter   |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;***    | CHANNEL_ID | Represents `channel_id` parameter |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | MODULE     | Represents `module` parameter     |
----

## DisableNotificationsParam

Contains all possible parameters for the [Disable Notifications operation](../../src/main/java/com/zoho/crm/api/notification/NotificationOperations.java).

### Fields

| Modifier and Type                                                  | Field       | Description                        |
| :----------------------------------------------------------------- | :---------- | :--------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;***    | CHANNEL_IDS | Represents `channel_ids` parameter |
----
