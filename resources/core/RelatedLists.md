# RelatedLists

## Package com.zoho.crm.api.relatedlists

The Zoho CRM [RelatedLists Meta Data API](https://www.zoho.com/crm/developer/docs/api/related-list-meta.html) reference provides information about the possible operations on **RelatedLists**.

## Classes

| Class                                             | Implementing Interfaces |
|:------------------------------------------------- | :---------------------- |
| [APIException](#apiexception)                     | Model, ResponseHandler  |
| [RelatedList](#RelatedList)                       | Model                   |
| [RelatedListsOperations](#relatedlistsoperations) |                         |
| [ResponseWrapper](#responsewrapper)               | Model, ResponseHandler  |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/relatedlists/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()      | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode() | The method to get the value of ***code*** key in  the **API** response   |
| ***void***         | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)  | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response |
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/relatedlists/APIException.java)

## RelatedList

Structure of Zoho CRM [RelatedList](../../src/main/java/com/zoho/crm/api/relatedlists/RelatedList.java).

### Methods

| Return Type  | Method                                       |  Description                                                         |
| :----------- | :------------------------------------------- | :------------------------------------------------------------------- |
| ***Long*** | getId()                                      | The method to get the value of ***RelatedList Id***                  |
| ***void***   | setId(***Long*** id)                       | The method to set the value of ***RelatedList Id***                  |
| ***String*** | getSequenceNumber()                          | The method to get the value of ***RelatedList SequenceNumber***      |
| ***void***   | setSequenceNumber(***String*** sequenceNumber) | The method to set the value of ***RelatedList SequenceNumber***    |
| ***String*** | getDisplayLabel()                            | The method to get the value of ***RelatedList DisplayLabel***        |
| ***void***   | setDisplayLabel(***String*** displayLabel)   | The method to set the value of ***RelatedList DisplayLabel***        |
| ***String*** | getAPIName()                                 | The method to get the value of ***RelatedList APIName***             |
| ***void***   | setAPIName(***String*** apiName)             | The method to set the value of ***RelatedList APIName***             |
| ***String*** | getModule()                                  | The method to get the value of ***RelatedList Module***              |
| ***void***   | setModule(***String*** module)               | The method to set the value of ***RelatedList Module***              |
| ***String*** | getName()                                    | The method to get the value of ***RelatedList Name***                |
| ***void***   | setName(***String*** name)                   | The method to set the value of ***RelatedList Name***                |
| ***String*** | getAction()                                  | The method to get the value of ***RelatedList Action***              |
| ***void***   | setAction(***String*** action)               | The method to set the value of ***RelatedList Action***              |
| ***String*** | getHref()                                    | The method to get the value of ***RelatedList Href***                |
| ***void***   | setHref(***String*** href)                   | The method to set the value of ***RelatedList Href***                |
| ***String*** | getType()                                    | The method to get the value of ***RelatedList Type***                |
| ***void***   | setType(***String*** type)                   | The method to set the value of ***RelatedList Type***                |
| ***String*** | getConnectedmodule()                         | The method to get the value of ***RelatedList Connectedmodule***     |
| ***void***   | setConnectedmodule(***String*** connectedmodule) | The method to set the value of ***RelatedList Connectedmodule*** |
| ***String*** | getLinkingmodule()                           | The method to get the value of ***RelatedList Linkingmodule***       |
| ***void***   | setLinkingmodule(***String*** linkingmodule) | The method to set the value of ***RelatedList Linkingmodule***       |
----

[source](../../src/main/java/com/zoho/crm/api/relatedlists/RelatedList.java)

## RelatedListsOperations

Contains methods for all possible [RelatedLists operations](../../src/main/java/com/zoho/crm/api/relatedlists/RelatedListsOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [RelatedListsOperations](../../src/main/java/com/zoho/crm/api/relatedlists/RelatedListsOperations.java)(***String*** module) | Creates a ***RelatedListsOperations*** class instance with the ***moduleAPIName***. |
----

### Methods

| Return Type                         | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/relatedlists/ResponseHandler.java)&gt;*** | getRelatedLists() | To get the details of all the related lists of a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/relatedlists/ResponseHandler.java)&gt;*** | getRelatedList(***Long*** id) | To get the details of a specific related list of a module.|
----

[source](../../src/main/java/com/zoho/crm/api/relatedlists/RelatedListsOperations.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/relatedlists/ResponseWrapper.java) is returned for GET operations.

### Methods

| Return Type                  | Method                                                  | Description                                                   |
| :--------------------------- | :------------------------------------------------------ | :------------------------------------------------------------ |
| ***List&lt;[RelatedList](#RelatedList)&gt;*** | getRelatedLists() | The method to get the list of obtained ***RelatedList*** instances |
| ***void*** | setRelatedLists(***List&lt;[RelatedList](#RelatedList)&gt;*** relatedLists)| The method to set the list of obtained ***RelatedList*** instances.|
----

[source](../../src/main/java/com/zoho/crm/api/relatedlists/ResponseWrapper.java)
