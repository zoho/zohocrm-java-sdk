# Layouts

## Package com.zoho.crm.api.layouts

The Zoho CRM [Layouts Meta Data API](https://www.zoho.com/crm/developer/docs/api/layouts-meta.html) reference provides information about the possible operations on **Layouts**.

## Classes

| Class                                   | Implementing Interfaces |
|:--------------------------------------- | :---------------------- |
| [APIException](#apiexception)           | Model, ResponseHandler  |
| [Layout](#layout)                       | Model                   |
| [LayoutsOperations](#layoutsoperations) |                         |
| [Properties](#properties)               | Model                   |
| [ResponseWrapper](#responsewrapper)     | Model, ResponseHandler  |
| [Section](#section)                     | Model                   |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/layouts/APIException.java) is returned for all operations.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()      | The method to get the value of ***status*** key in  the **API** response |
| ***void***  | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode() | The method to get the value of ***code*** key in  the **API** response   |
| ***void***         | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)  | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage() | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/layouts/APIException.java)

## Layout

Structure of Zoho CRM [Layout](../../src/main/java/com/zoho/crm/api/layouts/Layout.java).

### Methods

| Return Type          | Method                                           |  Description                                                     |
| :------------------- | :----------------------------------------------- | :--------------------------------------------------------------- |
| ***OffsetDateTime*** | getCreatedTime()                                 | The method to get the value of ***Layout CreatedTime***          |
| ***void***           | setCreatedTime(***OffsetDateTime*** createdTime) | The method to set the value of ***Layout CreatedTime***          |
| ***Map&lt;String, Object&gt;*** | getConvertMapping()                   | The method to get the value of ***Layout ConvertMapping***       |
| ***void*** | setConvertMapping(***Map&lt;String, Object&gt;*** convertMapping)| The method to set the value of ***Layout ConvertMapping*** |
| ***OffsetDateTime*** | getModifiedTime()                                | The method to get the value of ***Layout ModifiedTime***         |
| ***void***         | setModifiedTime(***OffsetDateTime*** modifiedTime) | The method to set the value of ***Layout ModifiedTime***         |
| ***Boolean***        | getVisible()                                     | The method to get the value of ***Layout Visible***              |
| ***void***           | setVisible(***Boolean*** visible)                | The method to set the value of ***Layout Visible***              |
| ***[User](Users.md#user)*** | getCreatedFor() | The method to get the value of ***Layout CreatedFor***           |
| ***void***  | setCreatedFor(***[User](Users.md#user)*** createdFor) | The method to set the value of ***Layout CreatedFor*** |
| ***String***         | getName()                                        | The method to get the value of ***Layout Name***                 |
| ***void***           | setName(***String*** name)                       | The method to set the value of ***Layout Name***                 |
| ***[User](Users.md#user)*** | getModifiedBy() | The method to get the value of ***Layout ModifiedBy***           |
| ***void***  | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Layout ModifiedBy***  |
| ***List&lt;[Profile](Profiles.md#profile)&gt;*** | getProfiles() | The method to get the value of ***Layout Profiles***       |
| ***void***  | setProfiles(***List&lt;[Profile](Profiles.md#profile)&gt;*** profiles) | The method to set the value of ***Layout Profiles*** |
| ***Long***           | getId()                                           | The method to get the value of ***Layout Id***                  |
| ***void***           | setId(***Long*** id)                            | The method to set the value of ***Layout Id***                  |
| ***[User](Users.md#user)***  | getCreatedBy()  | The method to get the value of ***Layout CreatedBy***           |
| ***void***  | setCreatedBy(***[User](Users.md#user)*** createdBy) | The method to set the value of ***Layout CreatedBy***     |
| ***List&lt;[Section](#section)&gt;*** | getSections()                   | The method to get the value of ***Layout Sections***            |
| ***void***           | setSections(***List&lt;[Section](#section)&gt;*** sections) | The method to set the value of ***Layout Sections***  |
| ***Integer***        | getStatus()                                       | The method to get the value of ***Layout Status***              |
| ***void***           | setStatus(***Integer*** status)                   | The method to set the value of ***Layout Status***              |
----

[source](../../src/main/java/com/zoho/crm/api/layouts/Layout.java)

## LayoutsOperations

Contains methods for all possible [Layouts operations](../../src/main/java/com/zoho/crm/api/layouts/LayoutsOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [LayoutsOperations](../../src/main/java/com/zoho/crm/api/layouts/LayoutsOperations.java)(***String*** module) | Creates a ***LayoutsOperations*** class instance with the ***moduleAPIName***. |
----

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/layouts/ResponseHandler.java)&gt;*** | getLayouts() | To get the details of all the layouts in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/layouts/ResponseHandler.java)&gt;*** | getLayout(***Long*** id) | To get the details (metadata) of a specific layout in a module. |
----

[source](../../src/main/java/com/zoho/crm/api/layouts/LayoutsOperations.java)

## Properties

Structure representing the Section's [properties](../../src/main/java/com/zoho/crm/api/layouts/Properties.java).

### Methods

|  Return Type          | Method                                   | Description                                                 |
| :-------------------- | :--------------------------------------- | :---------------------------------------------------------- |
| ***Boolean***         | getReorderRows()                         | The method to get the value of ***Properties ReorderRows*** |
| ***void***            | setReorderRows(***Boolean*** reorderRows)| The method to set the value of ***Properties ReorderRows*** |
| ***[ToolTip](Fields.md#tooltip)***| getTooltip() | The method to get the value of ***Properties ToolTip*** |
| ***void*** | setTooltip(***[ToolTip](Fields.md#tooltip)*** tooltip)| The method to set the value of ***Properties ToolTip*** |
| ***Integer***         | getMaximumRows()                         | The method to get the value of ***Properties MaximumRows*** |
| ***void***            | setMaximumRows(***Integer*** maximumRows)| The method to set the value of ***Properties MaximumRows*** |
----

[source](../../src/main/java/com/zoho/crm/api/layouts/Properties.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/layouts/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type                  | Method                                                  | Description                                                   |
| :--------------------------- | :------------------------------------------------------ | :------------------------------------------------------------ |
| ***List&lt;[Layout](#layout)&gt;*** | getLayouts()                                    | The method to get the list of obtained ***Layout*** instances |
| ***void***                   | setLayouts(***List&lt;[Layout](#layout)&gt;*** layouts)| The method to set the list of obtained ***Layout*** instances.|
----

[source](../../src/main/java/com/zoho/crm/api/layouts/ResponseWrapper.java)

## Section

Structure that represents the Layout's section.

### Methods

|  Return Type          | Method                                             | Description                                                 |
| :-------------------- | :------------------------------------------------- | :---------------------------------------------------------- |
| ***String***          | getDisplayLabel()                                  | The method to get the value of ***Section DisplayLabel*** |
| ***void***            | setDisplayLabel(***String*** displayLabel)         | The method to set the value of ***Section DisplayLabel*** |
| ***Integer***         | getSequenceNumber()                                | The method to get the value of ***Section SequenceNumber*** |
| ***void***            | setSequenceNumber(***Integer*** sequenceNumber)    | The method to set the value of ***Section SequenceNumber*** |
| ***Boolean***         | getIssubformsection()                              | The method to get the value of ***Section Issubformsection*** |
| ***void***            | setIssubformsection(***Boolean*** issubformsection)| The method to set the value of ***Section Issubformsection*** |
| ***Integer***         | getTabTraversal()                                  | The method to get the value of ***Section TabTraversal*** |
| ***void***            | setTabTraversal(***Integer*** tabTraversal)        | The method to set the value of ***Section TabTraversal*** |
| ***String***          | getAPIName()                                       | The method to get the value of ***Section APIName*** |
| ***void***            | setAPIName(***String*** apiName)                   | The method to set the value of ***Section APIName*** |
| ***Integer***         | getColumnCount()                                   | The method to get the value of ***Section ColumnCount*** |
| ***void***            | setColumnCount(***Integer*** columnCount)          | The method to set the value of ***Section ColumnCount*** |
| ***String***          | getName()                                          | The method to get the value of ***Section Name*** |
| ***void***            | setName(***String*** name)                         | The method to set the value of ***Section Name*** |
| ***String***          | getGeneratedType()                                 | The method to get the value of ***Section GeneratedType*** |
| ***void***            | setGeneratedType(***String*** generatedType)       | The method to set the value of ***Section GeneratedType*** |
| ***List&lt;[Field](Fields.md#field)&gt;***| getFields()                    | The method to get the value of ***Section Fields*** |
| ***void*** | setFields(***List&lt;[Field](Fields.md#field)&gt;*** fields)  | The method to set the value of ***Section Fields*** |
| ***[Properties](#properties)*** | getProperties()                          | The method to set the value of ***Section Properties*** |
| ***void*** | setProperties(***[Properties](#properties)*** properties)     | The method to set the value of ***Section Properties*** |
----

[source](../../src/main/java/com/zoho/crm/api/layouts/Section.java)
