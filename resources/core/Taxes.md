# Taxes

## Package com.zoho.crm.api.taxes

The Zoho CRM [Org Tax API](#Taxes) reference provides information about the possible operations on **Org Taxes**.

## Classes

| Class                               | Implementing Interfaces                               |
|:----------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)     | Model, ActionHandler                                  |
| [APIException](#apiexception)       | Model, ResponseHandler, ActionResponse, ActionHandler |
| [BodyWrapper](#bodywrapper)         | Model                                                 |
| [Preference](#preference)           | Model                                                 |
| [ResponseWrapper](#responsewrapper) | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse) | Model, ActionResponse                                 |
| [Tax](#tax)                         | Model                                                 |
| [TaxesOperations](#taxesoperations) |                                                       |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/taxes/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations.

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------- | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/taxes/ActionResponse.java)&gt;*** | getTaxes() | The method to get the list of obtained ***ActionResponse*** instances  |
| ***void***  | setTaxes(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/taxes/ActionResponse.java)&gt;*** taxes)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/taxes/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/taxes/APIException.java) is returned for all operations.

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

[source](../../src/main/java/com/zoho/crm/api/taxes/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

| Return Type | Method                                        | Description                                                 |
| :---------- | :-------------------------------------------- | :---------------------------------------------------------- |
| ***List&lt;[Tax](#tax)&gt;*** | getTaxes()                  | The method to get the list of obtained ***Tax*** instances. |
| ***void***  | setTaxes(***List&lt;[Tax](#tax)&gt;*** taxes) | The method to set the list of obtained ***Tax*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/taxes/BodyWrapper.java)

## Preference

Structure representing the properties of the Taxes set by the User.

### Methods

| Return Type   | Method                                            | Description                                                    |
| :------------ | :------------------------------------------------ | :------------------------------------------------------------- |
| ***Boolean*** | getAutoPopulateTax()                              | The method to get the ***Preference AutoPopulateTax***         |
| ***void***    | setAutoPopulateTax(***Boolean*** autoPopulateTax) | The method to set the ***Preference AutoPopulateTax***         |
| ***Boolean*** | getModifyTaxRates()                               | The method to get the value of ***Preference ModifyTaxRates*** |
| ***void***    | setModifyTaxRates(***Boolean*** modifyTaxRates)   | The method to set the value of ***Preference ModifyTaxRates*** |
----

[source](../../src/main/java/com/zoho/crm/api/taxes/Preference.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/taxes/ResponseWrapper.java) is returned for ***GET*** operations

### Methods

| Return Type | Method                                        | Description                                                 |
| :---------- | :-------------------------------------------- | :---------------------------------------------------------- |
| ***List&lt;[Tax](#tax)&gt;*** | getTaxes()                  | The method to get the list of obtained ***Tax*** instances. |
| ***void***  | setTaxes(***List&lt;[Tax](#tax)&gt;*** taxes) | The method to set the list of obtained ***Tax*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/taxes/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/taxes/SuccessResponse.java) is returned.

### Methods

| Return Type | Method                                        | Description                                                    |
| :---------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response   |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/taxes/SuccessResponse.java)

## Tax

Structure of Zoho CRM [Tax](../../src/main/java/com/zoho/crm/api/taxes/Tax.java).

### Methods

| Return Type   | Method                                          | Description                                                     |
| :------------ | :---------------------------------------------- | :-------------------------------------------------------------- |
| ***String***  | getDisplayLabel()                               | The method to get the ***ContactRole Id***                      |
| ***void***    | setDisplayLabel(***String*** displayLabel)      | The method to set the ***ContactRole Id***                      |
| ***String***  | getName()                                       | The method to get the value of ***ContactRole Name***           |
| ***void***    | setName(***String*** name)                      | The method to set the value of ***ContactRole Name***           |
| ***Long***    | getId()                                         | The method to get the value of ***ContactRole SequenceNumber*** |
| ***void***    | setId(***Long*** id)                            | The method to set the value of ***ContactRole SequenceNumber*** |
| ***Double***  | getValue()                                      | The method to get the value of ***ContactRole SequenceNumber*** |
| ***void***    | setValue(***Double*** value)                    | The method to set the value of ***ContactRole SequenceNumber*** |
| ***Integer*** | getSequenceNumber()                             | The method to get the value of ***ContactRole SequenceNumber*** |
| ***void***    | setSequenceNumber(***Integer*** sequenceNumber) | The method to set the value of ***ContactRole SequenceNumber*** |
----

[source](../../src/main/java/com/zoho/crm/api/taxes/Tax.java)

## TaxesOperations

Contains methods for all possible [TaxesOperations operations](../../src/main/java/com/zoho/crm/api/taxes/TaxesOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/taxes/ResponseHandler.java)&gt;*** | getTaxes() | To get the taxes of your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/taxes/ActionHandler.java)&gt;*** | createTaxes(***[BodyWrapper](#bodywrapper)*** request) | To add taxes to your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/taxes/ActionHandler.java)&gt;*** | updateTaxes(***[BodyWrapper](#bodywrapper)*** request) | To update the existing taxes of your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/taxes/ActionHandler.java)&gt;*** | deleteTaxes(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To delete multiple taxes from your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/taxes/ResponseHandler.java)&gt;*** | getTax(***Long*** id) | To get the details of a specific tax. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/taxes/ActionHandler.java)&gt;*** | deleteTax(***Long*** id) | To delete a specific tax from your organization. |
----

### Inner Static Classes

| Class                                 |
| :------------------------------------ |
| [DeleteTaxesParam](#deletetaxesparam) |
----

[source](../../src/main/java/com/zoho/crm/api/taxes/TaxesOperations.java)

## DeleteTaxesParam

Contains all possible parameters for the [Delete Taxes operation](../../src/main/java/com/zoho/crm/api/taxes/TaxesOperations.java).

### Fields

| Modifier and Type                                               | Field | Description                |
| :-------------------------------------------------------------- | :---- | :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;*** | IDS   | Represents `ids` parameter |
----
