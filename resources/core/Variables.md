# Variables

## Package com.zoho.crm.api.variables

The Zoho CRM [Variables API](https://www.zoho.com/crm/developer/docs/api/get-variables.html) reference provides information about the possible operations on **Variables**.

## Classes

| Class                                       | Implementing Interfaces                               |
|:------------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)             | Model, ActionHandler                                  |
| [APIException](#apiexception)               | Model, ResponseHandler, ActionResponse, ActionHandler |
| [BodyWrapper](#bodywrapper)                 | Model                                                 |
| [ResponseWrapper](#responsewrapper)         | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse)         | Model, ActionResponse                                 |
| [Variable](#variable)                       | Model                                                 |
| [VariablesOperations](#variablesoperations) |                                                       |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/variables/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations.

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------- | :-------------------------------------- | :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/variables/ActionResponse.java)&gt;*** | getVariables() | The method to get the list of obtained ***ActionResponse*** instances. |
| ***void***  | setVariables(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/variables/ActionResponse.java)&gt;*** variables)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/variables/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/variables/APIException.java) is returned for all operations.

### Methods

| Return Type | Method                                        | Description                                                    |
| :---------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response|
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method tosget the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response|
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/variables/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

| Return Type | Method                                                          | Description                                                      |
| :---------- | :-------------------------------------------------------------- | :--------------------------------------------------------------- |
| ***List&lt;[Variable](#variable)&gt;*** | getVariables()                      | The method to get the list of obtained ***Variable*** instances. |
| ***void***  | setVariables(***List&lt;[Variable](#variable)&gt;*** variables) | The method to set the list of obtained ***Variable*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/variables/BodyWrapper.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/variables/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type | Method                                                          | Description                                                      |
| :---------- | :-------------------------------------------------------------- | :--------------------------------------------------------------- |
| ***List&lt;[Variable](#variable)&gt;*** | getVariables()                      | The method to get the list of obtained ***Variable*** instances. |
| ***void***  | setVariables(***List&lt;[Variable](#variable)&gt;*** variables) | The method to set the list of obtained ***Variable*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/variables/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/variables/SuccessResponse.java) is returned.

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

[source](../../src/main/java/com/zoho/crm/api/variables/SuccessResponse.java)

## Variable

Structure of Zoho CRM [Variable](../../src/main/java/com/zoho/crm/api/variables/Variable.java).

### Methods

| Return Type  | Method                                   | Description                                               |
| :----------- | :--------------------------------------- | :-------------------------------------------------------- |
| ***String*** | getAPIName()                             | The method to get the ***Variable APIName***              |
| ***void***   | setAPIName(***String*** apiName)         | The method to set the ***Variable APIName***              |
| ***String*** | getName()                                | The method to get the value of ***Variable Name***        |
| ***void***   | setName(***String*** name)               | The method to set the value of ***Variable Name***        |
| ***String*** | getDescription()                         | The method to get the value of ***Variable Description*** |
| ***void***   | setDescription(***String*** description) | The method to set the value of ***Variable Description*** |
| ***Long***   | getId()                                  | The method to get the value of ***Variable Id***          |
| ***void***   | setId(***Long*** id)                     | The method to set the value of ***Variable Id***          |
| ***String*** | getType()                                | The method to get the value of ***Variable Type***        |
| ***void***   | setType(***String*** type)               | The method to set the value of ***Variable Type***        |
| ***[VariableGroup](VariableGroups.md#variablegroup)*** | getVariableGroup() | The method to get the value of ***VariableGroup*** |
| ***void***   | setVariableGroup(***[VariableGroup](VariableGroups.md#variablegroup)*** variableGroup)| The method to set the value of ***VariableGroup*** |
| ***Object*** | getValue()                               | The method to get the value of ***Variable Value***       |
| ***void***   | setValue(***Object*** value)             | The method to set the value of ***Variable Value***       |
----

[source](../../src/main/java/com/zoho/crm/api/variables/Variable.java)

## VariablesOperations

Contains methods for all possible [Variables operations](../../src/main/java/com/zoho/crm/api/variables/VariablesOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/variables/ResponseHandler.java)&gt;*** | getVariables(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the list of variables available for your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/variables/ActionHandler.java)&gt;*** | createVariables(***[BodyWrapper](#bodywrapper)*** request) | To add new variables to your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/variables/ActionHandler.java)&gt;*** | updateVariables(***[BodyWrapper](#bodywrapper)*** request) | To update the details of variables. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/variables/ActionHandler.java)&gt;*** | deleteVariables(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To delete multiple variables. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/variables/ResponseHandler.java)&gt;*** | getVariableById(***Long*** id, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the details of a specific variable by its unique ID. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/variables/ActionHandler.java)&gt;*** | updateVariableById(***Long*** id, ***[BodyWrapper](#bodywrapper)*** request) | To update the details of a specific variable by its unique ID. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/variables/ActionHandler.java)&gt;*** | deleteVariable(***Long*** id) | To delete a specific variable. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/variables/ResponseHandler.java)&gt;*** | getVariableForAPIName(***String*** apiName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance)| To get the details of a variable by its API name. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/variables/ResponseHandler.java)&gt;*** | updateVariableByAPIName(***String*** apiName, ***[BodyWrapper](#bodywrapper)*** request)| To update the details of a variable by its API name. |
----

### Inner Static Classes

| Class                                                     |
| :-------------------------------------------------------- |
| [GetVariablesParam](#getvariablesparam)                   |
| [DeleteVariablesParam](#deletevariablesparam)             |
| [GetVariableByIDParam](#getvariablebyidparam)             |
| [GetVariableForAPINameParam](#getvariableforapinameparam) |
----

[source](../../src/main/java/com/zoho/crm/api/variables/VariablesOperations.java)

## GetVariablesParam

Contains all possible parameters for the [Get Variables operation](../../src/main/java/com/zoho/crm/api/variables/VariablesOperations.java).

### Fields

| Modifier and Type                                                 | Field | Description                  |
| :---------------------------------------------------------------- | :---- | :--------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | GROUP | Represents `group` parameter |
----

## DeleteVariablesParam

Contains all possible parameters for the [Delete Variables operation](../../src/main/java/com/zoho/crm/api/variables/VariablesOperations.java).

### Fields

| Modifier and Type                                               | Field | Description                |
| :-------------------------------------------------------------- | :---- | :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;*** | IDS   | Represents `ids` parameter |
----

## GetVariableByIDParam

Contains all possible parameters for the [Get Variable By ID operation](../../src/main/java/com/zoho/crm/api/variables/VariablesOperations.java).

### Fields

| Modifier and Type                                                 | Field | Description                  |
| :---------------------------------------------------------------- | :---- | :--------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | GROUP | Represents `group` parameter |
----

## GetVariableForAPINameParam

Contains all possible parameters for the [Get Variable For APIName operation](../../src/main/java/com/zoho/crm/api/variables/VariablesOperations.java).

### Fields

| Modifier and Type                                                 | Field | Description                  |
| :---------------------------------------------------------------- | :---- | :--------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | GROUP | Represents `group` parameter |
----
