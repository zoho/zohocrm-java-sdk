# CustomViews

## Package com.zoho.crm.api.customviews

The Zoho CRM [CustomView Meta Data API](https://www.zoho.com/crm/developer/docs/api/custom-view-meta.html) reference provides information about the possible operations on **CustomViews**.

## Classes

| Class                                           | Implementing Interfaces |
|:----------------------------------------------- | :---------------------- |
| [APIException](#apiexception)                   | Model, ResponseHandler  |
| [Criteria](#criteria)                           | Model                   |
| [CustomView](#customview)                       | Model                   |
| [CustomViewsOperations](#customviewsoperations) |                         |
| [Info](#info)                                   | Model                   |
| [Range](#range)                                 | Model                   |
| [ResponseWrapper](#responsewrapper)             | Model, ResponseHandler  |
| [SharedDetails](#shareddetails)                 | Model                   |
| [Translation](#translation)                     | Model                   |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/customviews/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in the **API** response |
| ***void*** | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void*** | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in the **API** response|
| ***void*** | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in the **API** response |
| ***void*** | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/APIException.java)

## Criteria

The structure represents the condition set to the Custom View.

### Methods

| Return Type  | Method                                       |  Description                                           |
| :----------- | :------------------------------------------- | :----------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getComparator() | The method to get the value of ***Criteria Comparator*** |
| ***void***   | setComparator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** comparator) | The method to set the value of ***Criteria Comparator*** |
| ***String*** | getField() | The method to get the value of ***Criteria Field*** |
| ***void***   | setField(***String*** field)| The method to set the value of ***Criteria Field*** |
| ***Object*** | getValue() | The method to get the value of ***Criteria Value*** |
| ***void***   | setValue(***Object*** value) | The method to set the value of ***Criteria Value*** |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getGroupOperator() | The method to get the value of ***Criteria GroupOperator*** |
| ***void***   | setGroupOperator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** groupOperator) | The method to set the value of ***Criteria GroupOperator*** |
| ***List&lt;[Criteria](#criteria)&gt;*** | getGroup() | The method to get the list of obtained ***Criteria*** instances |
| ***void***   | setGroup(***List&lt;[Criteria](#criteria)&gt;*** group) | The method to set the list of obtained ***Criteria*** instances |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/Criteria.java)

## CustomView

Structure of Zoho CRM [CustomView](../../src/main/java/com/zoho/crm/api/customviews/CustomView.java).

### Methods

| Return Type  | Method                                            |  Description                                           |
| :----------- | :------------------------------------------------ | :----------------------------------------------------- |
| ***Long*** | getId()                                           | The method to get the value of ***CustomView Id*** |
| ***void***   | setId(***Long*** id)                            | The method to set the value of ***CustomView Id*** |
| ***String*** | getName()                                         | The method to get the value of ***CustomView Name*** |
| ***void***   | setName(***String*** name)                        | The method to set the value of ***CustomView Name*** |
| ***String*** | getSystemName()                                   | The method to get the value of ***CustomView SystemName*** |
| ***void***   | setSystemName(***String*** systemName)            | The method to set the value of ***CustomView SystemName*** |
| ***String*** | getDisplayValue()                                 | The method to get the value of ***CustomView DisplayValue*** |
| ***void***   | setDisplayValue(***String*** displayValue)        | The method to set the value of ***CustomView DisplayValue*** |
| ***String*** | getSharedType()                                   | The method to get the value of ***CustomView SharedType*** |
| ***void***   | setSharedType(***String*** sharedType)            | The method to set the value of ***CustomView SharedType*** |
| ***String*** | getCategory()                                     | The method to get the value of ***CustomView Category*** |
| ***void***   | setCategory(***String*** category)                | The method to set the value of ***CustomView Category*** |
| ***String*** | getSortBy()                                       | The method to get the value of ***CustomView SortBy*** |
| ***void***   | setSortBy(***String*** sortBy)                    | The method to set the value of ***CustomView SortBy***  |
| ***String*** | getSortOrder()                                    | The method to get the value of ***CustomView SortOrder*** |
| ***void***   | setSortOrder(***String*** sortOrder)              | The method to set the value of ***CustomView SortOrder*** |
| ***Integer*** | getFavorite()                                    | The method to get the value of ***CustomView Favorite*** |
| ***void***   | setFavorite(***Integer*** favorite)               | The method to set the value of ***CustomView Favorite*** |
| ***Boolean*** | getOffline()                                     | The method to get the value of ***CustomView Offline*** |
| ***void***   | setOffline(***Boolean*** offline)                 | The method to set the value of ***CustomView Offline*** |
| ***Boolean*** | getDefault()                                     | The method to get the value of ***CustomView Default*** |
| ***void***   | setDefault(***Boolean*** default1)                | The method to set the value of ***CustomView Default*** |
| ***Boolean*** | getSystemDefined()                               | The method to get the value of ***CustomView SystemDefined*** |
| ***void***   | setSystemDefined(***Boolean*** systemDefined)     | The method to set the value of ***CustomView SystemDefined*** |
| ***[Criteria](#criteria)*** | getCriteria()                      | The method to get the value of ***CustomView Criteria*** |
| ***void***   | setCriteria(***[Criteria](#criteria)*** criteria) | The method to set the value of ***CustomView Criteria*** |
| ***List&lt;[SharedDetails](#shareddetails)&gt;*** | getSharedDetails() | The method to get the value of ***CustomView SharedDetails*** |
| ***void***   | setSharedDetails(***List&lt;[SharedDetails](#shareddetails)&gt;*** sharedDetails) | The method to set the value of ***CustomView SharedDetails*** |
| ***List&lt;String&gt;*** | getFields()                           | The method to get the value of ***CustomView Fields*** |
| ***void***   | setFields(***List&lt;String&gt;*** fields)        | The method to set the value of ***CustomView Fields*** |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/CustomView.java)

## CustomViewsOperations

Contains methods for all possible [CustomViews operations](../../src/main/java/com/zoho/crm/api/customviews/CustomViewsOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [CustomViewsOperations](../../src/main/java/com/zoho/crm/api/customviews/CustomViewsOperations.java)(***String*** module) | Creates a ***CustomViewsOperations*** class instance with the ***moduleAPIName***.|
----

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/customviews/ResponseHandler.java)&gt;*** | getCustomViews(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the list of all custom views in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/customviews/ResponseHandler.java)&gt;*** | getCustomView(***Long*** id) | To get the details of specific custom view in a module. |
----

### Inner Static Classes

| Class                                                      |
| :----------------------------------------------------------|
| [GetCustomViewsParam](#getcustomviewsparam)   |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/CustomViewsOperations.java)

## Info

The structure containing the additional properties of Custom Views.

### Methods

|  Return Type          | Method                                    | Description                                                 |
| :-------------------- | :---------------------------------------- | :---------------------------------------------------------- |
| ***Integer***         | getPerPage()                              | The method to get the value of ***Info PerPage*** |
| ***void***            | setPerPage(***Integer*** perPage)         | The method to set the value of ***Info PerPage*** |
| ***String***          | getDefault()                              | The method to get the value of ***Info Default*** |
| ***void***            | setDefault(***String*** default1)         | The method to set the value of ***Info Default*** |
| ***Integer***         | getCount()                                | The method to get the value of ***Info Count*** |
| ***void***            | setCount(***Integer*** count)             | The method to set the value of ***Info Count*** |
| ***Integer***         | getPage()                                 | The method to get the value of ***Info Page*** |
| ***void***            | setPage(***Integer*** page)               | The method to set the value of ***Info Page*** |
| ***Boolean***         | getMoreRecords()                          | The method to get the value of ***Info MoreRecords*** |
| ***void***            | setMoreRecords(***Boolean*** moreRecords) | The method to set the value of ***Info MoreRecords*** |
| ***[Translation](#translation)*** | getTranslation()              | The method to get the value of ***Info Translation*** |
| ***void***            | setTranslation(***[Translation](#translation)*** translation) | The method to set the value of ***Info Translation*** |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/Translation.java)

## Range

The structure reprensenting the properties of [Range](../../src/main/java/com/zoho/crm/api/customviews/Range.java).

### Methods

|  Return Type  | Method                      | Description                                     |
| :------------ | :-------------------------- | :---------------------------------------------- |
| ***Integer*** | getFrom()                   | The method to get the value of ***Range From*** |
| ***void***    | setFrom(***Integer*** from) | The method to set the value of ***Range From*** |
| ***Integer*** | getTo()                     | The method to get the value of ***Range To***   |
| ***void***    | setTo(***Integer*** to)     | The method to set the value of ***Range To***   |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/Range.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/customviews/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type                  | Method                                                | Description                                                       |
| :--------------------------- | :---------------------------------------------------- | :---------------------------------------------------------------- |
| ***List&lt;[CustomView](#customView)&gt;*** | getCustomViews()                       | The method to get the list of obtained ***CustomView*** instances. |
| ***void*** | setCustomViews(***List&lt;[CustomView](#customView)&gt;*** customViews) | The method to set the list of obtained ***CustomView*** instances.|
| ***[Info](#info)*** | getInfo()                                                      | The method to get the value of ***Response Info*** |
| ***void*** | setInfo(***[Info](#info)*** info)                                       | The method to set the value of ***Response Info***|
----

[source](../../src/main/java/com/zoho/crm/api/customviews/ResponseWrapper.java)

## SharedDetails

The structure representing the sharing properties of the Custom View.

### Methods

|  Return Type  | Method                                      | Description                                                 |
| :------------ | :------------------------------------------ | :---------------------------------------------------------- |
| ***Long***  | getId()                                     | The method to get the value of ***SharedDetails Id*** |
| ***void***    | setId(***Long*** id)                      | The method to set the value of ***SharedDetails Id*** |
| ***String***  | getName()                                   | The method to get the value of ***SharedDetails Name*** |
| ***void***    | setName(***String*** name)                  | The method to set the value of ***SharedDetails Name*** |
| ***String***  | getType()                                   | The method to get the value of ***SharedDetails Type*** |
| ***void***    | setType(***String*** type)                  | The method to set the value of ***SharedDetails Type*** |
| ***Boolean*** | getSubordinates()                           | The method to get the value of ***SharedDetails Subordinates*** |
| ***void***    | setSubordinates(***Boolean*** subordinates) | The method to set the value of ***SharedDetails Subordinates*** |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/SharedDetails.java)

## Translation

The structure representing the additional Translation properties of the Custom Views.

### Methods

|  Return Type | Method                                           | Description                                                 |
| :----------- | :----------------------------------------------- | :---------------------------------------------------------- |
| ***String*** | getPublicViews()                                 | The method to get the value of ***Translation PublicViews*** |
| ***void***   | setPublicViews(***String*** publicViews)         | The method to set the value of ***Translation PublicViews*** |
| ***String*** | getOtherUsersViews()                             | The method to get the value of ***Translation OtherUsersViews*** |
| ***void***   | setOtherUsersViews(***String*** otherUsersViews) | The method to set the value of ***Translation OtherUsersViews*** |
| ***String*** | getSharedWithMe()                                | The method to get the value of ***Translation SharedWithMe*** |
| ***void***   | setSharedWithMe(***String*** sharedWithMe)       | The method to set the value of ***Translation SharedWithMe*** |
| ***String*** | getCreatedByMe()                                 | The method to get the value of ***Translation CreatedByMe*** |
| ***void***   | setCreatedByMe(***String*** createdByMe)         | The method to set the value of ***Translation CreatedByMe*** |
----

[source](../../src/main/java/com/zoho/crm/api/customviews/Translation.java)

## GetCustomViewsParam

Contains all possible parameters for the [Get CustomViews operation](../../src/main/java/com/zoho/crm/api/customviews/CustomViewsOperations.java).

### Fields

| Modifier and Type                                               | Field  | Description                |
| :-------------------------------------------------------------- | :-----:| :------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;***        |  PAGE          | Represents `page` parameter          |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;***        |  PER_PAGE      | Represents `per_page` parameter      |
----