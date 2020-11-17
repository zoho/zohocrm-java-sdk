# Profiles

## Package com.zoho.crm.api.profiles

The Zoho CRM [Profiles API](https://www.zoho.com/crm/developer/docs/api/get-profiles.html) reference provides information about the possible operations on **Profiles**.

## Classes

| Class                                     | Implementing Interfaces |
|:----------------------------------------- | :---------------------- |
| [APIException](#apiexception)             | Model, ResponseHandler  |
| [Category](#category)                     | Model                   |
| [PermissionDetail](#permissiondetail)     | Model                   |
| [Profile](#profile)                       | Model                   |
| [ProfilesOperations](#profilesoperations) |                         |
| [ResponseWrapper](#responsewrapper)       | Model, ResponseHandler  |
| [Section](#section)                       | Model                   |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/profiles/APIException.java) is returned for all operations.

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

[source](../../src/main/java/com/zoho/crm/api/profiles/APIException.java)

## Category

Structure representing the category properties of each Section.

### Methods

|  Return Type             | Method                                     | Description                                                |
| :----------------------- | :----------------------------------------- | :--------------------------------------------------------- |
| ***String***             | getDisplayLabel()                          | The method to get the value of ***Category DisplayLabel*** |
| ***void***               | setDisplayLabel(***String*** displayLabel) | The method to set the value of ***Category DisplayLabel*** |
| ***List&lt;String&gt;*** | getPermissionsDetails()                    | The method to get the value of ***Category PermissionsDetails*** |
| ***void***  | setPermissionsDetails(***List&lt;String&gt;*** permissionsDetails) | The method to set the value of ***Category PermissionsDetails*** |
| ***String***             | getName()                                  | The method to get the value of ***Category Name***         |
| ***void***               | setName(***String*** name)                 | The method to set the value of ***Category Name***         |
----

[source](../../src/main/java/com/zoho/crm/api/profiles/Category.java)

## PermissionDetail

Structure representing the Permission properties of the Profile

### Methods

|  Return Type             | Method                                     | Description                                                  |
| :----------------------- | :----------------------------------------- | :----------------------------------------------------------- |
| ***String***             | getDisplayLabel()                          | The method to get the value of ***PermissionDetail DisplayLabel*** |
| ***void***               | setDisplayLabel(***String*** displayLabel) | The method to set the value of ***PermissionDetail DisplayLabel*** |
| ***List&lt;String&gt;*** | getModule()                                | The method to get the value of ***PermissionDetail Module***  |
| ***void***               | setModule(***List&lt;String&gt;*** module) | The method to set the value of ***PermissionDetail Module***  |
| ***String***             | getName()                                  | The method to get the value of ***PermissionDetail Name***    |
| ***void***               | setName(***String*** name)                 | The method to set the value of ***PermissionDetail Name***    |
| ***Long***               | getId()                                    | The method to get the value of ***PermissionDetail Id***      |
| ***void***               | setId(***Long*** id)                       | The method to set the value of ***PermissionDetail Id***      |
| ***Boolean***            | getEnabled()                               | The method to get the value of ***PermissionDetail Enabled*** |
| ***void***               | setEnabled(***Boolean*** enabled)          | The method to set the value of ***PermissionDetail Enabled*** |
----

[source](../../src/main/java/com/zoho/crm/api/profiles/PermissionDetail.java)

## Profile

Structure of Zoho CRM [Profile](../../src/main/java/com/zoho/crm/api/profiles/Profile.java).

### Methods

| Return Type          | Method                                           |  Description                                                      |
| :------------------- | :----------------------------------------------- | :---------------------------------------------------------------- |
| ***String***         | getDisplayLabel()                                | The method to get the value of ***Profile DisplayLabel***         |
| ***void***           | setDisplayLabel(***String*** displayLabel)       | The method to set the value of ***Profile DisplayLabel***         |
| ***OffsetDateTime*** | getCreatedTime()                                 | The method to get the value of ***Profile CreatedTime***          |
| ***void***           | setCreatedTime(***OffsetDateTime*** createdTime) | The method to set the value of ***Profile CreatedTime***          |
| ***OffsetDateTime*** | getModifiedTime()                                | The method to get the value of ***Profile ModifiedTime***         |
| ***void***           | setModifiedTime(***OffsetDateTime*** modifiedTime) | The method to set the value of ***Profile ModifiedTime***       |
| ***List&lt;[PermissionDetail](#permissiondetail)&gt;*** | getPermissionsDetails() | The method to get the value of ***Profile PermissionDetail*** |
| ***void***           | setPermissionsDetails(***List&lt;[PermissionDetail](#permissiondetail)&gt;*** permissionsDetails) | The method to set the value of ***Profile PermissionDetail*** |
| ***String***         | getName()                                        | The method to get the value of ***Profile Name***                 |
| ***void***           | setName(***String*** name)                       | The method to set the value of ***Profile Name***                 |
| ***[User](Users.md#user)*** | getModifiedBy()                           | The method to get the value of ***Profile ModifiedBy***           |
| ***void***           | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Profile ModifiedBy***      |
| ***Boolean***        | getDefault()                                     | The method to get the value of ***Profile Default***              |
| ***void***           | setDefault(***Boolean*** default1)               | The method to set the value of ***Profile Default***              |
| ***String***         | getDescription()                                 | The method to get the value of ***Profile Description***          |
| ***void***           | setDescription(***String*** description)         | The method to set the value of ***Profile Description***          |
| ***Long***           | getId()                                          | The method to get the value of ***Profile Id***                   |
| ***void***           | setId(***Long*** id)                             | The method to set the value of ***Profile Id***                   |
| ***Boolean***        | getCategory()                                    | The method to get the value of ***Profile Category***             |
| ***void***           | setCategory(***Boolean*** category)              | The method to set the value of ***Profile Category***             |
| ***[User](Users.md#user)*** | getCreatedBy()                            | The method to get the value of ***Profile CreatedBy***            |
| ***void***           | setCreatedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Profile CreatedBy***        |
| ***List&lt;[Section](#section)&gt;*** | getSections()                   | The method to get the value of ***Profile Sections***             |
| ***void***           | setSections(***List&lt;[Section](#section)&gt;*** sections) | The method to set the value of ***Profile Sections***  |
| ***Boolean***        | getDelete()                                      | The method to get the value of ***Profile Delete***               |
| ***void***           | setDelete(***Boolean*** delete)                  | The method to set the value of ***Profile Delete***               |
----

[source](../../src/main/java/com/zoho/crm/api/profiles/Profile.java)

## ProfilesOperations

Contains methods for all possible [Profiles operations](../../src/main/java/com/zoho/crm/api/profiles/ProfilesOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [ProfilesOperations](../../src/main/java/com/zoho/crm/api/profiles/ProfilesOperations.java)(***OffsetDateTime*** ifModifiedSince)  |  Creates a ***ProfilesOperations*** class instance with the ***ifModifiedSince***.|
----

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/profiles/ResponseHandler.java)&gt;*** | getProfiles() | To get the list of profiles available for your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/profiles/ResponseHandler.java)&gt;*** | getProfile(***Long*** id) | To get the details of a specific profile. |
----

[source](../../src/main/java/com/zoho/crm/api/profiles/ProfilesOperations.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/profiles/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type                  | Method                                                      | Description                                                    |
| :--------------------------- | :---------------------------------------------------------- | :------------------------------------------------------------- |
| ***List&lt;[Profile](#profile)&gt;*** | getProfiles()                                      | The method to get the list of obtained ***Profile*** instances |
| ***void***                   | setProfiles(***List&lt;[Profile](#profile)&gt;*** profiles) | The method to set the list of obtained ***Profile*** instances.|
----

[source](../../src/main/java/com/zoho/crm/api/profiles/ResponseWrapper.java)

## Section

Structure that represents the Profile's section.

### Methods

|  Return Type          | Method                                                 | Description                                           |
| :-------------------- | :----------------------------------------------------- | :---------------------------------------------------- |
| ***String***          | getName()                                              | The method to get the value of ***Section Name***     |
| ***void***            | setName(***String*** name)                             | The method to set the value of ***Section Name***     |
| ***List&lt;[Category](#category)&gt;***| getCategories()                       | The method to get the value of ***Section Category*** |
| ***void*** | setCategories(***List&lt;[Category](#category)&gt;*** categories) | The method to set the value of ***Section Category*** |
----

[source](../../src/main/java/com/zoho/crm/api/profiles/Section.java)
