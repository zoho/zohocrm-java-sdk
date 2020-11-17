# Modules

## Package com.zoho.crm.api.modules

The Zoho CRM [Modules API](https://www.zoho.com/crm/developer/docs/api/modules-api.html) reference provides information about the possible operations on **Modules**.

## Classes

| Class                                           | Implementing Interfaces                               |
|:----------------------------------------------- | :---------------------------------------------------- |
| [ActionWrapper](#actionwrapper)                 | Model, ActionHandler                                  |
| [APIException](#apiexception)                   | Model, ResponseHandler, ActionResponse, ActionHandler |
| [Argument](#argument)                           | Model                                                 |
| [BodyWrapper](#bodywrapper)                     | Model                                                 |
| [Module](#module)                               | Model                                                 |
| [ModulesOperations](#modulesoperations)         |                                                       |
| [RelatedListProperties](#relatedlistproperties) | Model                                                 |
| [ResponseWrapper](#responsewrapper)             | Model, ResponseHandler                                |
| [SuccessResponse](#successresponse)             | Model, ActionResponse                                 |
| [Territory](#territory)                         | Model                                                 |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/modules/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type                 | Method                                  | Description                                                      |
| :-------------------------------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/modules/ActionResponse.java)&gt;*** | getModules()                               | The method to get the list of obtained ***ActionResponse*** instances  |
| ***void***                       | setModules(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/modules/ActionResponse.java)&gt;*** modules)| The method to set the list of obtained ***ActionResponse*** instances. |
----
[source](../../src/main/java/com/zoho/crm/api/modules/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/modules/APIException.java) is returned for all operations.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/modules/APIException.java)

## Argument

Structure representing the properties of the Module's arguments.

### Methods

| Return Type   | Method                       |  Description                                       |
| :------------ | :--------------------------- | :------------------------------------------------- |
| ***String***  | getName()                    | The method to get the value of ***Argument Name*** |
| ***void***    | setName(***String*** name)   | The method to set the value of ***Argument Name*** |
| ***String***  | getValue()                   | The method to get the value of ***Argument Value***|
| ***void***    | setValue(***String*** value) | The method to set the value of ***Argument Value***|
----

[source](../../src/main/java/com/zoho/crm/api/modules/Argument.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type          | Method                       | Description                                                    |
| :------------------------------------ | :--------------------------- | :------------------------------------------------------------- |
| ***List&lt;[Module](#module)&gt;***  | getModules()                 | The method to get the list of obtained ***Module*** instances  |
| ***void*** | setModules(***List&lt;[Module](#module)&gt;*** modules)| The method to set the list of obtained ***Module*** instances  |
----

[source](../../src/main/java/com/zoho/crm/api/modules/BodyWrapper.java)

## Module

Structure of Zoho CRM [Module](../../src/main/java/com/zoho/crm/api/modules/Module.java).

### Methods

| Return Type   | Method                                       |  Description                                      |
| :------------ | :------------------------------------------- | :------------------------------------------------ |
| ***String***  | getName()                                    | The method to get the value of ***Module Name*** |
| ***void***    | setName(***String*** name)                   | The method to set the value of ***Module Name*** |
| ***Boolean*** | getGlobalSearchSupported()                   | The method to get the value of ***Module GlobalSearchSupported*** |
| ***void***    | setGlobalSearchSupported(***Boolean*** globalSearchSupported) | The method to set the value of ***Module GlobalSearchSupported*** |
| ***Boolean*** | getKanbanView()                              | The method to get the value of ***Module KanbanView*** |
| ***void***    | setKanbanView(***Boolean*** kanbanView)      | The method to set the value of ***Module KanbanView*** |
| ***Boolean*** | getDeletable()                               | The method to get the value of ***Module Deletable*** |
| ***void***    | setDeletable(***Boolean*** deletable)        | The method to set the value of ***Module Deletable*** |
| ***String***  | getDescription()                             | The method to get the value of ***Module Description*** |
| ***void***    | setDescription(***String*** description)     | The method to set the value of ***Module Description*** |
| ***Boolean*** | getCreatable()                               | The method to get the value of ***Module Creatable*** |
| ***void***    | setCreatable(***Boolean*** creatable)        | The method to set the value of ***Module Creatable*** |
| ***Boolean*** | getFilterStatus()                            | The method to get the value of ***Module FilterStatus*** |
| ***void***    | setFilterStatus(***Boolean*** filterStatus)  | The method to set the value of ***Module FilterStatus*** |
| ***Boolean*** | getInventoryTemplateSupported()              | The method to get the value of ***Module InventoryTemplateSupported*** |
| ***void***    | setInventoryTemplateSupported(***Boolean*** inventoryTemplateSupported) | The method to set the value of ***Module InventoryTemplateSupported*** |
| ***OffsetDateTime*** | getModifiedTime()                      | The method to get the value of ***Module ModifiedTime*** |
| ***void***    | setModifiedTime(***OffsetDateTime*** modifiedTime) | The method to set the value of ***Module ModifiedTime*** |
| ***String***  | getPluralLabel()                              | The method to get the value of ***Module PluralLabel*** |
| ***void***    | setPluralLabel(***String*** pluralLabel)      | The method to set the value of ***Module PluralLabel*** |
| ***Boolean*** | getPresenceSubMenu()                          | The method to get the value of ***Module PresenceSubMenu*** |
| ***void***    | setPresenceSubMenu(***Boolean*** presenceSubMenu) | The method to set the value of ***Module PresenceSubMenu*** |
| ***Boolean*** | getTriggersSupported()                        | The method to get the value of ***Module TriggersSupported*** |
| ***void***    | setTriggersSupported(***Boolean*** triggersSupported) | The method to set the value of ***Module TriggersSupported*** |
| ***Long***    | getId()                                       | The method to get the value of ***Module Id*** |
| ***void***    | setId(***Long*** id)                          | The method to set the value of ***Module Id*** |
| ***[RelatedListProperties](#relatedlistproperties)*** | getRelatedListProperties() | The method to get the value of ***Module RelatedListProperties*** |
| ***void***    | setRelatedListProperties(***[RelatedListProperties](#relatedlistproperties)*** relatedListProperties) | The method to set the value of ***Module RelatedListProperties*** |
| ***List&lt;String&gt;*** | getProperties()                    | The method to get the value of ***Module Properties*** |
| ***void***    | setProperties(***List&lt;String&gt;*** properties) | The method to set the value of ***Module Properties*** |
| ***Integer*** | getPerPage()                                  | The method to get the value of ***Module PerPage*** |
| ***void***    | setPerPage(***Integer*** perPage)             | The method to set the value of ***Module PerPage*** |
| ***Integer*** | getVisibility()                               | The method to get the value of ***Module Visibility*** |
| ***void***    | setVisibility(***Integer*** visibility)       | The method to set the value of ***Module Visibility*** |
| ***Boolean*** | getConvertable()                              | The method to get the value of ***Module Convertable*** |
| ***void***    | setConvertable(***Boolean*** convertable)     | The method to set the value of ***Module Convertable*** |
| ***Boolean*** | getEditable()                                 | The method to get the value of ***Module Editable*** |
| ***void***    | setEditable(***Boolean*** editable)           | The method to set the value of ***Module Editable*** |
| ***Boolean*** | getEmailtemplateSupport()                     | The method to get the value of ***Module EmailtemplateSupport*** |
| ***void***    | setEmailtemplateSupport(***Boolean*** emailtemplateSupport) | The method to set the value of ***Module EmailtemplateSupport*** |
| ***List&lt;[Profile](Profiles.md#profile)&gt;*** | getProfiles() | The method to get the value of ***Module Profile*** |
| ***void***    | setProfiles(***List&lt;[Profile](Profiles.md#profile)&gt;*** profiles) | The method to set the value of ***Module Profile*** |
| ***Boolean*** | getFilterSupported()                            | The method to get the value of ***Module FilterSupported*** |
| ***void***    | setFilterSupported(***Boolean*** filterSupported) | The method to set the value of ***Module FilterSupported*** |
| ***String***  | getDisplayField()                             | The method to get the value of ***Module DisplayField*** |
| ***void***    | setDisplayField(***String*** displayField)    | The method to set the value of ***Module DisplayField*** |
| ***List&lt;String&gt;*** | getSearchLayoutFields()            | The method to get the value of ***Module SearchLayoutFields*** |
| ***void***    | setSearchLayoutFields(***List&lt;String&gt;*** searchLayoutFields) | The method to set the value of ***Module SearchLayoutFields*** |
| ***Boolean*** | getKanbanViewSupported()                      | The method to get the value of ***Module KanbanViewSupported*** |
| ***void***    | setKanbanViewSupported(***Boolean*** kanbanViewSupported) | The method to set the value of ***Module KanbanViewSupported*** |
| ***Boolean*** | getShowAsTab()                                | The method to get the value of ***Module ShowAsTab*** |
| ***void***    | setShowAsTab(***Boolean*** showAsTab)         | The method to set the value of ***Module ShowAsTab*** |
| ***String***  | getWebLink()                                  | The method to get the value of ***Module WebLink*** |
| ***void***    | setWebLink(***String*** webLink)              | The method to set the value of ***Module WebLink*** |
| ***Integer*** | getSequenceNumber()                           | The method to get the value of ***Module SequenceNumber*** |
| ***void***    | setSequenceNumber(***Integer*** sequenceNumber) | The method to set the value of ***Module SequenceNumber*** |
| ***String***  | getSingularLabel()                            | The method to get the value of ***Module SingularLabel*** |
| ***void***    | setSingularLabel(***String*** singularLabel)  | The method to set the value of ***Module SingularLabel*** |
| ***Boolean*** | getViewable()                                 | The method to get the value of ***Module Viewable*** |
| ***void***    | setViewable(***Boolean*** viewable)           | The method to set the value of ***Module Viewable*** |
| ***Boolean*** | getAPISupported()                             | The method to get the value of ***Module APISupported*** |
| ***void***    | setAPISupported(***Boolean*** apiSupported)   | The method to set the value of ***Module APISupported*** |
| ***String***  | getAPIName()                                  | The method to get the value of ***Module APIName*** |
| ***void***    | setAPIName(***String*** apiName)              | The method to set the value of ***Module APIName*** |
| ***Boolean*** | getQuickCreate()                              | The method to get the value of ***Module QuickCreate*** |
| ***void***    | setQuickCreate(***Boolean*** quickCreate)     | The method to set the value of ***Module QuickCreate*** |
| ***[User](Users.md#user)*** | getModifiedBy()                 | The method to get the value of ***Module ModifiedBy*** |
| ***void***    | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Module ModifiedBy*** |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getGeneratedType() | The method to get the value of ***Module GeneratedType*** |
| ***void***    | setGeneratedType(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** generatedType) | The method to set the value of ***Module GeneratedType*** |
| ***Boolean*** | getFeedsRequired()                            | The method to get the value of ***Module FeedsRequired*** |
| ***void***    | setFeedsRequired(***Boolean*** feedsRequired) | The method to set the value of ***Module FeedsRequired*** |
| ***Boolean*** | getScoringSupported()                         | The method to get the value of ***Module ScoringSupported*** |
| ***void***    | setScoringSupported(***Boolean*** scoringSupported) | The method to set the value of ***Module ScoringSupported*** |
| ***Boolean*** | getWebformSupported()                         | The method to get the value of ***Module WebformSupported*** |
| ***void***    | setWebformSupported(***Boolean*** webformSupported) | The method to set the value of ***Module WebformSupported*** |
| ***List&lt;[Argument](#argument)&gt;*** | getArguments()      | The method to get the value of ***Module Arguments***     |
| ***void***    | setArguments(***List&lt;[Argument](#argument)&gt;*** arguments) | The method to set the value of ***Module Arguments***     |
| ***String***  | getModuleName()                               | The method to get the value of ***Module ModuleName***         |
| ***void***    | setModuleName(***String*** moduleName)        | The method to set the value of ***Module ModuleName***         |
| ***Integer*** | getBusinessCardFieldLimit()                   | The method to get the value of ***Module BusinessCardFieldLimit*** |
| ***void***    | setBusinessCardFieldLimit(***Integer*** businessCardFieldLimit) | The method to set the value of ***Module BusinessCardFieldLimit***|
| ***[CustomView](CustomViews.md#customview)*** | getCustomView() | The method to get the value of ***Module CustomView*** |
| ***void***    | setCustomView(***[CustomView](CustomViews.md#customview)*** customView) | The method to set the value of ***Module CustomView*** |
| ***[Module](#module)*** | getParentModule()                   | The method to get the value of ***Module ParentModule*** |
| ***void***    | setParentModule(***[Module](#module)*** parentModule) | The method to set the value of ***Module ParentModule*** |
| ***[Territory](#territory)*** | getTerritory()                | The method to get the value of ***Module Territory*** |
| ***void***    | setTerritory(***[Territory](#territory)*** territory) | The method to set the value of ***Module Territory*** |
----

[source](../../src/main/java/com/zoho/crm/api/modules/Module.java)

## ModulesOperations

Contains methods for all possible [Modules operations](../../src/main/java/com/zoho/crm/api/modules/ModulesOperations.java).

### Methods

| Return Type                         | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/modules/ResponseHandler.java)&gt;*** | getModules(***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get the details of all the modules. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/modules/ResponseHandler.java)&gt;*** | getModule(***String*** apiName) | To get the details (metadata) of a specific module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/modules/ActionHandler.java)&gt;*** | updateModuleByAPIName(***String*** apiName, ***[BodyWrapper](#bodywrapper)*** request) | To update the details of a module by its module API name. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/modules/ActionHandler.java)&gt;*** | updateModuleById(***Long*** id, ***[BodyWrapper](#bodywrapper)*** request) | To update the details of a module by its ID. |
----

### Inner Static Classes

| Class                                    |
| :--------------------------------------- |
| [GetModulesHeader](#getmodulesheader)   |
----

[source](../../src/main/java/com/zoho/crm/api/modules/ModulesOperations.java)

## RelatedListProperties

Structure representing the properties, when the current module is a related list of another module.

### Methods

|  Return Type              | Method                         | Description                                                       |
| :------------------------ | :----------------------------- | :---------------------------------------------------------------- |
| ***String***              | getSortBy()                    | The method to get the value of ***RelatedListProperties SortBy*** |
| ***void***                | setSortBy(***String*** sortBy) | The method to set the value of ***RelatedListProperties SortBy*** |
| ***List&lt;String&gt;***  | getFields()                    | The method to get the value of ***RelatedListProperties Fields*** |
| ***void***                | setFields(***List&lt;String&gt;*** fields) | The method to set the value of ***RelatedListProperties Fields*** |
| ***String***              | getSortOrder()                 | The method to get the value of ***RelatedListProperties SortOrder*** |
| ***void***                | setSortOrder(***String*** sortOrder) | The method to set the value of ***RelatedListProperties SortOrder*** |
----

[source](../../src/main/java/com/zoho/crm/api/modules/RelatedListProperties.java)

## ResponseWrapper

After a successful **API** request, and instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/modules/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type  | Method                              | Description                                                     |
| :----------  | :---------------------------------- | :--------------------------------------------------------------- |
| ***List&lt;[Module](#module)&gt;*** | getModules() | The method to get the list of obtained ***Modules*** instances   |
| ***void***   | setModules(***List&lt;[Module](#module)&gt;*** modules) | The method to set the list of obtained ***Modules*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/modules/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/modules/SuccessResponse.java) is returned.

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

[source](../../src/main/java/com/zoho/crm/api/modules/SuccessResponse.java)

## Territory

Structure representing the properties of the territory, to which the module is associated.

### Methods

|  Return Type       | Method                                     | Description                                                |
| :----------------- | :----------------------------------------- | :--------------------------------------------------------- |
| ***Long***         | getId()                                    | The method to get the value of ***Territory Id***          |
| ***void***         | setId(***Long*** id)                       | The method to set the value of ***Territory Id***          |
| ***String***       | getName()                                  | The method to get the value of ***Territory Name***        |
| ***void***         | setName(***String*** name)                 | The method to set the value of ***Territory Name***        |
| ***Boolean***      | getSubordinates()                          | The method to get the value of ***Territory Subordinates***|
| ***void***         | setSubordinates(***Boolean*** subordinates)| The method to set the value of ***Territory Subordinates***|
----

[source](../../src/main/java/com/zoho/crm/api/modules/Territory.java)

## GetModulesHeader

Contains all possible headers for [Get Modules operation](../../src/main/java/com/zoho/crm/api/modules/ModulesOperations.java).

### Fields

| Modifier and Type                | Field          | Description                          |
| :------------------------------- | :------------- | :----------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** |  IF_MODIFIED_SINCE | Represents `If-Modified-Since` header |
----
