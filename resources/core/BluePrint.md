# BluePrint

## Package com.zoho.crm.api.blueprint

The Zoho CRM [BluePrint API](https://www.zoho.com/crm/developer/docs/api/blueprint-details.html) reference provides information about the possible operations on **BluePrint**.

## Classes

| Class                                       | Implementing Interfaces                |
|:------------------------------------------- | :------------------------------------- |
| [APIException](#apiexception)               | Model, ResponseHandler, ActionResponse |
| [BluePrint](#blueprint-1)                   | Model                                  |
| [BluePrintOperations](#blueprintoperations) |                                        |
| [BodyWrapper](#bodywrapper)                 | Model                                  |
| [NextTransition](#nexttransition)           | Model                                  |
| [ProcessInfo](#processinfo)                 | Model                                  |
| [ResponseWrapper](#responsewrapper)         | Model, ResponseHandler                 |
| [SuccessResponse](#successresponse)         | Model, ActionResponse                  |
| [Transition](#transition)                   | Model                                  |
| [ValidationError](#validationerror)         | Model                                  |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/blueprint/APIException.java) is returned for all operations.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to get the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/APIException.java)

## BluePrint

Structure of Zoho CRM [BluePrint](../../src/main/java/com/zoho/crm/api/blueprint/BluePrint.java).

### Methods

| Return Type     | Method                                       |  Description                                           |
| :-------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***Long***          | getTransitionId()                           | The method to get the value of ***BluePrint TransitionId***        |
| ***void***           | setTransitionId(***Long*** transitionId)   | The method to set the value of ***BluePrint TransitionId***        |
| ***[Record](Record.md#record-1)***    | getData()                            | The method to get the value of ***BluePrint Data*** |
| ***void***           | setData(***[Record](Record.md#record-1)*** data)                 | The method to set the value of ***BluePrint Data***     |
| ***[ProcessInfo](#processinfo)***           | getProcessInfo() | The method to get the value of ***BluePrint ProcessInfo*** |
| ***void***         | setProcessInfo(***[ProcessInfo](#processinfo)*** processInfo)                               | The method to set the value of ***BluePrint ProcessInfo***     |
| ***List&lt;[Transition](#transition)&gt;*** | getTransitions()                             | The method to get the list of obtained ***Transition*** instances  |
| ***void***           | setTransitions(***List&lt;[Transition](#transition)&gt;*** transitions)   | The method to set the list of obtained ***Transition*** instances  |
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/BluePrint.java)

## BluePrintOperations

Contains methods for all possible [BluePrint operations](../../src/main/java/com/zoho/crm/api/blueprint/BluePrintOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [BluePrintOperations](../../src/main/java/com/zoho/crm/api/blueprint/BluePrintOperations.java)(***Long*** recordId, ***String*** moduleAPIName) | Creates a ***BluePrintOperations*** class instance with the ***recordId*** and ***moduleAPIName***.|

----

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/blueprint/ResponseHandler.java)&gt;*** | getBlueprint() | To get the next available transitions for that record, fields available for each transition, current value of each field, and validation(if any). |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/blueprint/ActionResponse.java)&gt;*** | updateBlueprint(***[BodyWrapper](#bodywrapper)*** request) | To update a single transition at a time. |
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/BluePrintOperations.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***List&lt;[BluePrint](#blueprint-1)&gt;***  | getBlueprint()        | The method to get the list of obtained ***BluePrint*** instances|
| ***void***           | setBlueprint(***List&lt;[BluePrint](#blueprint-1)&gt;*** blueprint)| The method to set the list of obtained ***BluePrint*** instances|

----

[source](../../src/main/java/com/zoho/crm/api/blueprint/BodyWrapper.java)

## NextTransition

List of all possible transitions for the record's current state.

### Methods

| Return Type  | Method                    | Description                                             |
| :----------  | :------------------------ | :------------------------------------------------------ |
| ***Long***   | getId()                   | The method to get the value of ***NextTransition Id***  |
| ***void***   | setId(***Long*** id)      | The method to set the value of ***NextTransition Id***  |
| ***String*** | getName()                 | The method to get the value of ***NextTransition Name***|
| ***void***   | setName(***String*** name)| The method to set the value of ***NextTransition Name***|
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/NextTransition.java)

## ProcessInfo

Depicts Blueprint's process information.

### Methods

| Return Type  | Method                                     | Description                                                  |
| :----------  | :----------------------------------------- | :----------------------------------------------------------- |
| ***String*** | getFieldId()                               | The method to get the value of ***ProcessInfo FieldId***     |
| ***void***   | setFieldId(***String*** fieldId)           | The method to set the value of ***ProcessInfo FieldId***     |
| ***Boolean***| getIsContinuous()                          | The method to get the value of ***ProcessInfo IsContinuous***|
| ***void***   | setIsContinuous(***Boolean*** isContinuous)| The method to set the value of ***ProcessInfo IsContinuous***|
| ***String*** | getAPIName()                               | The method to get the value of ***ProcessInfo APIName***     |
| ***void***   | setAPIName(***String*** apiName)           | The method to set the value of ***ProcessInfo APIName***     |
| ***Boolean***| getContinuous()                            | The method to get the value of ***ProcessInfo Continuous***  |
| ***void***   | setContinuous(***Boolean*** continuous)    | The method to set the value of ***ProcessInfo Continuous***  |
| ***String*** | getFieldLabel()                            | The method to get the value of ***ProcessInfo FieldLabel***  |
| ***void***   | setFieldLabel(***String*** fieldLabel)     | The method to set the value of ***ProcessInfo FieldLabel***  |
| ***String*** | getName()                                  | The method to get the value of ***ProcessInfo Name***        |
| ***void***   | setName(***String*** name)                 | The method to set the value of ***ProcessInfo Name***        |
| ***String*** | getColumnName()                            | The method to get the value of ***ProcessInfo ColumnName***  |
| ***void***   | setColumnName(***String*** columnName)     | The method to set the value of ***ProcessInfo ColumnName***  |
| ***String*** | getFieldValue()                            | The method to set the value of ***ProcessInfo FieldValue***  |
| ***void***   | setFieldValue(***String*** fieldValue)     | The method to set the value of ***ProcessInfo FieldValue***  |
| ***Long***   | getId()                                    | The method to get the value of ***ProcessInfo Id***          |
| ***void***   | setId(***Long*** id)                       | The method to set the value of ***ProcessInfo Id***          |
| ***String*** | getFieldName()                             | The method to get the value of ***ProcessInfo FieldName***   |
| ***void***   | setFieldName(***String*** fieldName)       | The method to set the value of ***ProcessInfo FieldName***   |
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/ProcessInfo.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/blueprint/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type             | Method                              | Description                                                  |
| :---------------------------  | :---------------------------------- | :----------------------------------------------------------- |
| ***[BluePrint](#blueprint-1)*** | getBlueprint()                           | The method to get the ***BluePrint*** instance  |
| ***void***                   | setBlueprint(***[BluePrint](#blueprint-1)*** blueprint)| The method to set the ***BluePrint*** instance |
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/blueprint/SuccessResponse.java) is returned.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/SuccessResponse.java)

## Transition

Depicts Blueprint's [Transition](../../src/main/java/com/zoho/crm/api/blueprint/Transition.java).

### Methods

| Return Type             | Method                              | Description                                                  |
| :---------------------------  | :---------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[NextTransition](#nexttransition)&gt;*** | getNextTransitions()  | The method to get the list of obtained ***NextTransition*** instances   |
| ***void***                   | setNextTransitions(***List&lt;[NextTransition](#nexttransition)&gt;*** nextTransitions)| The method to set the list of obtained ***NextTransition*** instances |
| ***Double*** | getPercentPartialSave()| The method to get the value of ***Transition PercentPartialSave***|
| ***void*** | setPercentPartialSave(***Double*** percentPartialSave)| The method to set the value of ***Transition PercentPartialSave***|
| ***[Record](Record.md#record-1)*** | getData()| The method to get the value of ***Transition Data***|
| ***void*** | setData(***[Record](Record.md#record-1)*** data)| The method to set the value of ***Transition Data***|
| ***String*** | getNextFieldValue()| The method to get the value of ***Transition NextFieldValue***|
| ***void*** | setNextFieldValue(***String*** nextFieldValue)| The method to set the value of ***Transition NextFieldValue***|
| ***String*** | getName()| The method to get the value of ***Transition Name***|
| ***void*** | setName(***String*** name)| The method to set the value of ***Transition Name***|
| ***Boolean*** | getCriteriaMatched()| The method to get the value of ***Transition CriteriaMatched***|
| ***void*** | setCriteriaMatched(***Boolean*** criteriaMatched)| The method to set the value of ***Transition CriteriaMatched***|
| ***Long*** | getId()| The method to get the value of ***Transition Id***|
| ***void*** | setId(***Long*** id)| The method to set the value of ***Transition Id***|
| ***List&lt;[Field](Fields.md#field)&gt;*** | getFields() | The method to get the list of obtained ***Field*** instances |
| ***void***         | setFields(***List&lt;[Field](Fields.md#field)&gt;*** fields)| The method to set the list of obtained ***Field*** instances |
| ***String*** | getCriteriaMessage()| The method to get the value of ***Transition CriteriaMessage***|
| ***void*** | setCriteriaMessage(***String*** criteriaMessage)| The method to set the value of ***Transition CriteriaMessage***|

----

[source](../../src/main/java/com/zoho/crm/api/blueprint/Transition.java)

## ValidationError

### Methods

| Return Type  | Method                           | Description                                             |
| :----------  | :------------------------------- | :------------------------------------------------------ |
| ***String*** | getAPIName()                     | The method to get the value of ***Validation APIName***  |
| ***void***   | setAPIName(***String*** apiName) | The method to set the value of ***Validation APIName***  |
| ***String*** | getMessage()                     | The method to get the value of ***Validation Message***|
| ***void***   | setMessage(***String*** message) | The method to set the value of ***Validation Message***|
----

[source](../../src/main/java/com/zoho/crm/api/blueprint/ValidationError.java)
