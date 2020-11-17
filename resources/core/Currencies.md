# Currencies

## Package com.zoho.crm.api.currencies

The Zoho CRM [Currencies API](https://www.zoho.com/crm/developer/docs/api/enable-multi-currency.html) reference provides information about the possible operations on **Currencies**.

## Classes

| Class                                             | Implementing Interfaces                |
|:------------------------------------------------- | :------------------------------------- |
| [ActionWrapper](#actionwrapper)                   | Model, ActionHandler                   |
| [APIException](#apiexception)                     | Model, ResponseHandler, ActionResponse, ActionHandler, BaseCurrencyActionHandler |
| [BaseCurrencyActionWrapper](#basecurrencyactionwrapper) | Model, BaseCurrencyActionHandler |
| [BaseCurrencyWrapper](#basecurrencywrapper)       | Model                                  |
| [BodyWrapper](#bodywrapper)                       | Model                                  |
| [CurrenciesOperations](#currenciesoperations)     |                                        |
| [Currency](#currency)                             | Model                                  |
| [Format](#format)                                 | Model                                  |
| [ResponseWrapper](#responsewrapper)               | Model, ResponseHandler                 |
| [SuccessResponse](#successresponse)               | Model, ActionResponse                  |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/currencies/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------- | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/currencies/ActionResponse.java)&gt;*** | getCurrencies() | The method to get the list of obtained ***ActionResponse*** instances. |
| ***void*** | setCurrencies(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/currencies/ActionResponse.java)&gt;*** currencies)| The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/currencies/APIException.java) is returned for all operations.

### Methods

| Return Type | Method                                        | Description                                                    |
| :---------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/APIException.java)

## BaseCurrencyActionWrapper

After a successful **API** request involving Home currency, an instance of [BaseCurrencyActionWrapper](../../src/main/java/com/zoho/crm/api/currencies/BaseCurrencyActionWrapper.java) is returned for **POST** and **PUT** operations

### Methods

| Return Type | Method                                               | Description                                                        |
| :---------- | :----------------------------------------------------| :----------------------------------------------------------------- |
| ***[ActionResponse](../../src/main/java/com/zoho/crm/api/currencies/ActionResponse.java)*** | getBaseCurrency() | The method to get the list of obtained ***ActionResponse*** instances. |
| ***void***  | setBaseCurrency(***[ActionResponse](../../src/main/java/com/zoho/crm/api/currencies/ActionResponse.java)*** baseCurrency) | The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/BaseCurrencyActionWrapper.java)

## BaseCurrencyWrapper

A structure that contains all possible keys of a single request that involves Home currency.

### Methods

| Return Type | Method                                               | Description                                                        |
| :---------- | :----------------------------------------------------| :----------------------------------------------------------------- |
| ***[Currency](#currency)*** | getBaseCurrency() | The method to get the list of obtained ***Currency*** instances. |
| ***void***  | setBaseCurrency(***[Currency](#currency)*** baseCurrency) | The method to set the list of obtained ***Currency*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/BaseCurrencyWrapper.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

| Return Type | Method                                               | Description                                                        |
| :---------- | :----------------------------------------------------| :----------------------------------------------------------------- |
| ***List&lt;[Currency](#currency)&gt;*** | getCurrencies()         | The method to get the list of obtained ***Currency*** instances. |
| ***void***  | setCurrencies(***List&lt;[Currency](#currency)&gt;*** currencies) | The method to set the list of obtained ***Currency*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/BodyWrapper.java)

## CurrenciesOperations

Contains methods for all possible [Currencies operations](../../src/main/java/com/zoho/crm/api/currencies/CurrenciesOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/currencies/ResponseHandler.java)&gt;*** | getCurrencies() | To get the list of all currencies available for your org. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/currencies/ActionHandler.java)&gt;*** | addCurrencies(***[BodyWrapper](#bodywrapper)*** request) | To add new currencies to your org. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/currencies/ActionHandler.java)&gt;*** | updateCurrencies(***[BodyWrapper](#bodywrapper)*** request) | To update the currencies' details of your org. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[BaseCurrencyActionHandler](../../src/main/java/com/zoho/crm/api/currencies/BaseCurrencyActionHandler.java)&gt;*** | enableMultipleCurrencies(***[BaseCurrencyWrapper](#basecurrencywrapper)*** request) | To enable multiple currencies for your org. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[BaseCurrencyActionHandler](../../src/main/java/com/zoho/crm/api/currencies/BaseCurrencyActionHandler.java)&gt;*** | updateBaseCurrency(***[BaseCurrencyWrapper](#basecurrencywrapper)*** request)| To update the base currency details of your org. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/currencies/ResponseHandler.java)&gt;*** | getCurrency(***Long*** id) | To get the details of specific currency. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/currencies/ActionHandler.java)&gt;*** | updateCurrency(***Long*** id, ***[BodyWrapper](#bodywrapper)*** request) | To update the details of specific currency. |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/CurrenciesOperations.java)

## Currency

Structure of Zoho CRM [Currency](../../src/main/java/com/zoho/crm/api/currencies/Currency.java).

### Methods

| Return Type      | Method                                               | Description                                                     |
| :--------------- | :--------------------------------------------------- | :-------------------------------------------------------------- |
| ***String***     | getSymbol()                                          | The method to get the ***Currency Symbol***                     |
| ***void***       | setSymbol(***String*** symbol)                       | The method to set the ***Currency Symbol***                     |
| ***OffsetDateTime*** | getCreatedTime()                                 | The method to get the value of ***Currency CreatedTime***       |
| ***void***       | setCreatedTime(***OffsetDateTime*** createdTime)     | The method to set the value of ***Currency CreatedTime***       |
| ***Boolean***    | getIsActive()                                        | The method to get the value of ***Currency IsActive***          |
| ***void***       | setIsActive(***Boolean*** isActive)                  | The method to set the value of ***Currency IsActive***          |
| ***String***     | getExchangeRate()                                    | The method to get the value of ***Currency ExchangeRate***      |
| ***void***       | setExchangeRate(***String*** exchangeRate)           | The method to set the value of ***Currency ExchangeRate***      |
| ***[Format](#format)*** | getFormat()                                  | The method to get the value of ***Currency Format***            |
| ***void***       | setFormat(***[Format](#format)*** format)           | The method to set the value of ***Currency Format***            |
| ***[User](Users.md#user)*** | getCreatedBy()                            | The method to get the value of ***Currency CreatedBy***         |
| ***void***       | setCreatedBy(***[User](Users.md#user)*** createdBy)  | The method to set the value of ***Currency CreatedBy***         |
| ***Boolean***    | getPrefixSymbol()                                    | The method to get the value of ***Currency PrefixSymbol***      |
| ***void***       | setPrefixSymbol(***Boolean*** prefixSymbol)          | The method to set the value of ***Currency PrefixSymbol***      |
| ***Boolean***    | getIsBase()                                          | The method to get the value of ***Currency IsBase***            |
| ***void***       | setIsBase(***Boolean*** isBase)                      | The method to set the value of ***Currency IsBase***            |
| ***OffsetDateTime*** | getModifiedTime()                                | The method to get the value of ***Currency ModifiedTime***      |
| ***void***       | setModifiedTime(***OffsetDateTime*** modifiedTime)   | The method to set the value of ***Currency ModifiedTime***      |
| ***String***     | getName()                                            | The method to get the value of ***Currency Name***              |
| ***void***       | setName(***String*** prefixSymbol)                   | The method to set the value of ***Currency Name***              |
| ***[User](Users.md#user)*** | getModifiedBy()                           | The method to get the value of ***Currency ModifiedBy***        |
| ***void***       | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Currency ModifiedBy***       |
| ***Long***     | getId()                                                | The method to get the value of ***Currency Id***                |
| ***void***       | setId(***Long*** id)                                 | The method to set the value of ***Currency Id***                |
| ***String***     | getIsoCode()                                         | The method to get the value of ***Currency IsoCode***           |
| ***void***       | setIsoCode(***String*** isoCode)                     | The method to set the value of ***Currency IsoCode***           |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/Currency.java)

## Format

Structure representing the display format of the Currency

### Methods

| Return Type      | Method                                               | Description                                                     |
| :--------------- | :--------------------------------------------------- | :-------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getDecimalSeparator() | The method to get the ***Format DecimalSeparator***                     |
| ***void***       | setDecimalSeparator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** decimalSeparator) | The method to set the ***Format DecimalSeparator***                     |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getThousandSeparator() | The method to get the value of ***Format ThousandSeparator*** |
| ***void***       | setThousandSeparator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** thousandSeparator) | The method to set the value of ***Format ThousandSeparator*** |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getDecimalPlaces() | The method to get the value of ***Format DecimalPlaces*** |
| ***void***       | setDecimalPlaces(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** decimalPlaces) | The method to set the value of ***Format DecimalPlaces*** |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/Format.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/currencies/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type | Method                                               | Description                                                                    |
| :---------- | :----------------------------------------------------| :----------------------------------------------------------------------------- |
| ***List&lt;[Currency](#currency)&gt;*** | getCurrencies()         | The method to get the list of obtained ***Currency*** instances                |
| ***void***  | setCurrencies(***List&lt;[Currency](#currency)&gt;*** currencies) | The method to set the list of obtained ***Currency*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/currencies/SuccessResponse.java) is returned.

### Methods

| Return Type | Method                                        | Description                                                    |
| :---------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void***  | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***  | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void***  | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/currencies/SuccessResponse.java)
