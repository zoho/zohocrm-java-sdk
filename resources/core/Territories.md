# Territories

## Package com.zoho.crm.api.territories

The Zoho CRM [Territories API](https://www.zoho.com/crm/developer/docs/api/territories.html) reference provides information about the possible operations on **Territories**.

## Classes

| Class                                           | Implementing Interfaces |
| :---------------------------------------------- | :---------------------- |
| [APIException](#apiexception)                   | Model, ResponseHandler  |
| [ResponseWrapper](#responsewrapper)             | Model, ResponseHandler  |
| [TerritoriesOperations](#territoriesoperations) |                         |
| [Territory](#Territory)                         | Model                   |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/territories/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response   |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/territories/APIException.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/territories/ResponseWrapper.java) is returned for ***GET*** operations.

### Methods

| Return Type                  | Method                                              | Description                                                       |
| :--------------------------- | :-------------------------------------------------- | :---------------------------------------------------------------- |
| ***List&lt;[Territory](#territory)&gt;*** | getTerritories()                       | The method to get the list of obtained ***Territory*** instances. |
| ***void*** | setTerritories(***List&lt;[Territory](#territory)&gt;*** territories) | The method to set the list of obtained ***Territory*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/territories/ResponseWrapper.java)

## TerritoriesOperations

Contains methods for all possible [Territories operations](../../src/main/java/com/zoho/crm/api/territories/TerritoriesOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                         |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/territories/ResponseHandler.java)&gt;*** | getTerritories() | To get the list of all territories. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/territories/ResponseHandler.java)&gt;*** | getTerritory(***Long*** id) | To get the details of a specific territory. |
----

[source](../../src/main/java/com/zoho/crm/api/territories/TerritoriesOperations.java)

## Territory

Structure of Zoho CRM [Territory](../../src/main/java/com/zoho/crm/api/territories/Territory.java).

### Methods

| Return Type  | Method                                                          |  Description                                                |
| :----------- | :-------------------------------------------------------------- | :---------------------------------------------------------- |
| ***OffsetDateTime*** | getCreatedTime()                                        | The method to get the value of ***Territory CreatedTime***  |
| ***void***   | setCreatedTime(***OffsetDateTime*** createdTime)                | The method to set the value of ***Territory CreatedTime***  |
| ***OffsetDateTime*** | getModifiedTime()                                       | The method to get the value of ***Territory ModifiedTime*** |
| ***void***   | setModifiedTime(***OffsetDateTime*** modifiedTime)              | The method to set the value of ***Territory ModifiedTime*** |
| ***[User](Users.md#user)*** | getManager()                                     | The method to get the value of ***Territory Manager***      |
| ***void***   | setManager(***[User](Users.md#user)*** manager)                 | The method to set the value of ***Territory Manager***      |
| ***String*** | getParentId()                                                   | The method to get the value of ***Territory ParentId***     |
| ***void***   | setParentId(***String*** parentId)                              | The method to set the value of ***Territory ParentId***     |
| ***[Criteria](CustomViews.md#criteria)*** | getCriteria()                      | The method to get the value of ***Territory Criteria***     |
| ***void***   | setCriteria(***[Criteria](CustomViews.md#criteria)*** criteria) | The method to set the value of ***Territory Criteria***     |
| ***String*** | getName()                                                       | The method to get the value of ***Territory Name***         |
| ***void***   | setName(***String*** name)                                      | The method to set the value of ***Territory Name***         |
| ***[User](Users.md#user)*** | getModifiedBy()                                  | The method to get the value of ***Territory ModifiedBy***   |
| ***void***   | setModifiedBy(***[User](Users.md#user)*** modifiedBy)           | The method to set the value of ***Territory ModifiedBy***   |
| ***String*** | getDescription()                                                | The method to get the value of ***Territory Description***  |
| ***void***   | setDescription(***String*** description)                        | The method to set the value of ***Territory Description***  |
| ***Long*** | getId()                                                         | The method to get the value of ***Territory Id***           |
| ***void***   | setId(***Long*** id)                                          | The method to set the value of ***Territory Id***           |
| ***[User](Users.md#user)*** | getCreatedBy()                                   | The method to get the value of ***Territory CreatedBy***    |
| ***void***   | setCreatedBy(***[User](Users.md#user)*** createdBy)             | The method to set the value of ***Territory CreatedBy***    |
----

[source](../../src/main/java/com/zoho/crm/api/territories/Territory.java)
