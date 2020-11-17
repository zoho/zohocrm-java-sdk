# VariableGroups

## Package com.zoho.crm.api.variablegroups

The Zoho CRM [VariableGroups API](https://www.zoho.com/crm/developer/docs/api/get-variable-group.html) reference provides information about the possible operations on **VariableGroups**.

## Classes

| Class                                                 | Implementing Interfaces |
| :---------------------------------------------------- | :---------------------- |
| [APIException](#apiexception)                         | Model, ResponseHandler  |
| [ResponseWrapper](#responsewrapper)                   | Model, ResponseHandler  |
| [VariableGroup](#variablegroup)                       | Model                   |
| [VariableGroupsOperations](#variablegroupsoperations) |                         |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/variablegroups/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response   |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/variablegroups/APIException.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/variablegroups/ResponseWrapper.java) is returned for ***GET*** operations.

### Methods

| Return Type                                       | Method                         | Description                                                           |
| :------------------------------------------------ | :----------------------------- | :-------------------------------------------------------------------- |
| ***List&lt;[VariableGroup](#variablegroup)&gt;*** | getVariableGroups()            | The method to get the list of obtained ***VariableGroup*** instances. |
| ***void*** | setVariableGroups(***List&lt;[VariableGroup](#variablegroup)&gt;*** variableGroups) | The method to set the list of obtained ***VariableGroup*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/variablegroups/ResponseWrapper.java)

## VariableGroup

Structure of Zoho CRM [VariableGroup](../../src/main/java/com/zoho/crm/api/variablegroups/VariableGroup.java).

### Methods

| Return Type  | Method                                     |  Description                                                    |
| :----------- | :----------------------------------------- | :-------------------------------------------------------------- |
| ***String*** | getDisplayLabel()                          | The method to get the value of ***VariableGroup DisplayLabel*** |
| ***void***   | setDisplayLabel(***String*** displayLabel) | The method to set the value of ***VariableGroup DisplayLabel*** |
| ***String*** | getAPIName()                               | The method to get the value of ***VariableGroup APIName***      |
| ***void***   | setAPIName(***String*** apiName)           | The method to set the value of ***VariableGroup APIName***      |
| ***String*** | getName()                                  | The method to get the value of ***VariableGroup Name***         |
| ***void***   | setName(***String*** name)                 | The method to set the value of ***VariableGroup Name***         |
| ***String*** | getDescription()                           | The method to get the value of ***VariableGroup Description***  |
| ***void***   | setDescription(***String*** description)   | The method to set the value of ***VariableGroup Description***  |
| ***Long***   | getId()                                    | The method to get the value of ***VariableGroup Id***           |
| ***void***   | setId(***Long*** id)                       | The method to set the value of ***VariableGroup Id***           |
----

[source](../../src/main/java/com/zoho/crm/api/variablegroups/VariableGroup.java)

## VariableGroupsOperations

Contains methods for all possible [VariableGroups operations](../../src/main/java/com/zoho/crm/api/variablegroups/VariableGroupsOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                         |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/variablegroups/ResponseHandler.java)&gt;*** | getVariableGroups() | To get the list of all variable groups available for your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/variablegroups/ResponseHandler.java)&gt;*** | getVariableGroupById(***Long*** id) | To get the details of a variable group by its group ID. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/variablegroups/ResponseHandler.java)&gt;*** | getVariableGroupByAPIName(***String*** apiName) | To get the details of a specific variable group by its API name. |
----

[source](../../src/main/java/com/zoho/crm/api/variablegroups/VariableGroupsOperations.java)
