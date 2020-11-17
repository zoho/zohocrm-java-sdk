# Users

## Package com.zoho.crm.api.users

The Zoho CRM [Users API](https://www.zoho.com/crm/developer/docs/api/get-users.html) reference provides information about the possible operations on **Users**.

## Classes

| Class                               | Implementing Interfaces                               | Extends Classes   |
|:----------------------------------- | :---------------------------------------------------- | :---------------- |
| [ActionWrapper](#actionwrapper)     | Model, ActionHandler                                  | |
| [APIException](#apiexception)       | Model, ResponseHandler, ActionResponse, ActionHandler | |
| [BodyWrapper](#bodywrapper)         | Model                                                 | |
| [CustomizeInfo](#customizeinfo)     | Model                                                 | |
| [Info](#info)                       | Model                                                 | |
| [RequestWrapper](#requestwrapper)   | Model                                                 | |
| [ResponseWrapper](#responsewrapper) | Model, ResponseHandler                                | |
| [Shift](#shift)                     | Model                                                 | |
| [SuccessResponse](#successresponse) | Model, ActionResponse                                 | |
| [TabTheme](#tabtheme)               | Model                                                 | |
| [Territory](#territory)             | Model                                                 | |
| [Theme](#theme)                     | Model                                                 | |
| [User](#user)                       | Model                                                 | [Record](Record.md#record-1) |
| [UsersOperations](#usersoperations) |                                                       | |
----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/users/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/users/ActionResponse.java)&gt;*** | getUsers() | The method to get the list of obtained **ActionResponse** instances |
| ***void***  | setUsers(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/users/ActionResponse.java)&gt;*** users) | The method to set the list of obtained **ActionResponse** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/users/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/users/APIException.java) is returned for all operations.

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
[source](../../src/main/java/com/zoho/crm/api/users/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type                     | Method                    | Description                                                 |
| :------------------------------- | :------------------------ | :---------------------------------------------------------- |
| ***List&lt;[User](#user)&gt;***  | getUsers()                | The method to get the list of obtained ***User*** instances |
| ***void*** | setUsers(***List&lt;[User](#user)&gt;*** users) | The method to set the list of obtained ***User*** instances |
----

[source](../../src/main/java/com/zoho/crm/api/users/BodyWrapper.java)

## CustomizeInfo

Structure representing the properties of the User's customization information

### Methods

| Return Type   | Method                                           |  Description                                                      |
| :------------ | :----------------------------------------------- | :---------------------------------------------------------------- |
| ***Boolean*** | getNotesDesc()                                   | The method to get the value of ***CustomizeInfo NotesDesc***      |
| ***void***    | setNotesDesc(***Boolean*** notesDesc)            | The method to set the value of ***CustomizeInfo NotesDesc***      |
| ***String***  | getShowRightPanel()                              | The method to get the value of ***CustomizeInfo ShowRightPanel*** |
| ***void***    | setShowRightPanel(***String*** showRightPanel)   | The method to set the value of ***CustomizeInfo ShowRightPanel*** |
| ***String***  | getBcView()                                      | The method to get the value of ***CustomizeInfo BcView***         |
| ***void***    | setBcView(***String*** bcView)                   | The method to set the value of ***CustomizeInfo BcView***         |
| ***String***  | getShowHome()                                    | The method to get the value of ***CustomizeInfo ShowHome***       |
| ***void***    | setShowHome(***String*** showHome)               | The method to set the value of ***CustomizeInfo ShowHome***       |
| ***String***  | getShowDetailView()                              | The method to get the value of ***CustomizeInfo ShowDetailView*** |
| ***void***    | setShowDetailView(***String*** showDetailView)   | The method to set the value of ***CustomizeInfo ShowDetailView*** |
| ***String***  | getUnpinRecentItem()                             | The method to get the value of ***CustomizeInfo UnpinRecentItem***|
| ***void***    | setUnpinRecentItem(***String*** unpinRecentItem) | The method to set the value of ***CustomizeInfo UnpinRecentItem***|
----

[source](../../src/main/java/com/zoho/crm/api/users/CustomizeInfo.java)

## Info

Structure representing additional information about the retrieved data.

### Methods

| Return Type   | Method                                    |  Description                                          |
| :------------ | :---------------------------------------- | :---------------------------------------------------- |
| ***Integer*** | getPerPage()                              | The method to get the value of ***Info PerPage***     |
| ***void***    | setPerPage(***Integer*** perPage)         | The method to set the value of ***Info PerPage***     |
| ***Integer*** | getCount()                                | The method to get the value of ***Info Count***       |
| ***void***    | setCount(***Integer*** count)             | The method to set the value of ***Info Count***       |
| ***Integer*** | getPage()                                 | The method to get the value of ***Info Page***        |
| ***void***    | setPage(***Integer*** page)               | The method to set the value of ***Info Page***        |
| ***Boolean*** | getMoreRecords()                          | The method to get the value of ***Info MoreRecords*** |
| ***void***    | setMoreRecords(***Boolean*** moreRecords) | The method to set the value of ***Info MoreRecords*** |
----

[source](../../src/main/java/com/zoho/crm/api/users/Info.java)

## RequestWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type                     | Method                       | Description                                                  |
| :------------------------------- | :--------------------------- | :----------------------------------------------------------- |
| ***List&lt;[User](#user)&gt;***  | getUsers()                   | The method to get the list of obtained ***User*** instances  |
| ***void*** | setUsers(***List&lt;[User](#user)&gt;*** users)    | The method to set the list of obtained ***User*** instances  |
----

[source](../../src/main/java/com/zoho/crm/api/users/RequestWrapper.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/users/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type                     | Method                                          | Description                                                  |
| :------------------------------ | :---------------------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[User](#user)&gt;*** | getUsers()                                      | The method to get the list of obtained ***User*** instances  |
| ***void***                      | setUsers(***List&lt;[User](#user)&gt;*** users) | The method to set the list of obtained ***User*** instances. |
| ***[Info](#info)***             | getInfo()                                       | The method to get the value of ***Info*** instance           |
| ***void***                      | setInfo(***[Info](#info)*** info)               | The method to set the value of ***Info*** instance.          |
----

[source](../../src/main/java/com/zoho/crm/api/users/ResponseWrapper.java)

## Shift

Structure representing the User's shift information.

### Methods

| Return Type   | Method                     |  Description                                    |
| :------------ | :------------------------- | :---------------------------------------------- |
| ***Long***    | getId()                    | The method to get the value of ***Shift Id***   |
| ***void***    | setId(***Long*** id)       | The method to set the value of ***Shift Id***   |
| ***String***  | getName()                  | The method to get the value of ***Shift Name*** |
| ***void***    | setName(***String*** name) | The method to set the value of ***Shift Name*** |
----

[source](../../src/main/java/com/zoho/crm/api/users/Shift.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/users/SuccessResponse.java) is returned.

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

[source](../../src/main/java/com/zoho/crm/api/users/SuccessResponse.java)

## TabTheme

Structure representing the user's customized tab information.

### Methods

| Return Type   | Method                                 |  Description                                             |
| :------------ | :------------------------------------- | :------------------------------------------------------- |
| ***String***  | getFontColor()                         | The method to get the value of ***TabTheme FontColor***  |
| ***void***    | setFontColor(***String*** fontColor)   | The method to set the value of ***TabTheme FontColor***  |
| ***String***  | getBackground()                        | The method to get the value of ***TabTheme Background*** |
| ***void***    | setBackground(***String*** background) | The method to set the value of ***TabTheme Background*** |
----

[source](../../src/main/java/com/zoho/crm/api/users/Shift.java)

## Territory

Structure representing the properties of the territory, to which the user is associated.

### Methods

|  Return Type       | Method                           | Description                                            |
| :----------------- | :------------------------------- | :----------------------------------------------------- |
| ***Boolean***      | getManager()                     | The method to get the value of ***Territory Manager*** |
| ***void***         | setManager(***Boolean*** manager)| The method to set the value of ***Territory Manager*** |
| ***String***       | getName()                        | The method to get the value of ***Territory Name***    |
| ***void***         | setName(***String*** name)       | The method to set the value of ***Territory Name***    |
| ***Long***         | getId()                          | The method to get the value of ***Territory Id***      |
| ***void***         | setId(***Long*** id)             | The method to set the value of ***Territory Id***      |
----

[source](../../src/main/java/com/zoho/crm/api/users/Territory.java)

## Theme

Structure representing the user's [Theme](../../src/main/java/com/zoho/crm/api/users/Theme.java).

### Methods

|  Return Type       | Method                                   | Description                                                          |
| :----------------- | :--------------------------------------- | :------------------------------------------------------------------- |
| ***[TabTheme](#tabtheme)***      | getNormalTab()             | The method to get the value of ***Theme NormalTab***                 |
| ***void***         | setNormalTab(***[TabTheme](#tabtheme)*** normalTab)| The method to set the value of ***Theme NormalTab***       |
| ***[TabTheme](#tabtheme)***       | getSelectedTab()          | The method to get the value of ***Theme SelectedTab***               |
| ***void***         | setSelectedTab(***[TabTheme](#tabtheme)*** selectedTab)| The method to set the value of ***Theme SelectedTab*** |
| ***String***       | getNewBackground()                       | The method to get the value of ***Theme NewBackground***             |
| ***void***         | setNewBackground(***String*** newBackground)| The method to set the value of ***Theme NewBackground***          |
| ***String***       | getBackground()                          | The method to get the value of ***Theme Background***                |
| ***void***         | setBackground(***String*** background)   | The method to set the value of ***Theme Background***                |
| ***String***       | getScreen()                              | The method to get the value of ***Theme Screen***                    |
| ***void***         | setScreen(***String*** screen)           | The method to set the value of ***Theme Screen***                    |
| ***String***       | getType()                                | The method to get the value of ***Theme Type***                      |
| ***void***         | setType(***String*** type)               | The method to set the value of ***Theme Type***                      |
----

[source](../../src/main/java/com/zoho/crm/api/users/Theme.java)

## User

Structure of Zoho CRM [User](../../src/main/java/com/zoho/crm/api/users/User.java).

### Methods

| Return Type          | Method                                       |  Description                                           |
| :------------------- | :------------------------------------------- | :----------------------------------------------------- |
| ***String***         | getCountry()                                 | The method to get the value of ***User Country*** |
| ***void***           | setCountry(***String*** country)             | The method to set the value of ***User Country*** |
| ***[CustomizeInfo](#customizeinfo)*** | getCustomizeInfo()         | The method to get the value of ***User CustomizeInfo***     |
| ***void***           | setCustomizeInfo(***[CustomizeInfo](#customizeinfo)*** customizeInfo) | The method to set the value of ***User CustomizeInfo***     |
| ***[Role](Role.md#role)***               | getRole() | The method to get the value of ***User Role***     |
| ***void***           | setRole(***[Role](Roles.md#role)*** role) | The method to set the value of ***User Role***     |
| ***String***         | getSignature()                               | The method to get the value of ***User Signature***     |
| ***void***           | setSignature(***String*** signature)         | The method to set the value of ***User Signature***     |
| ***String***         | getCity()                                    | The method to get the value of ***User City***       |
| ***void***           | setCity(***String*** city)                   | The method to set the value of ***User City***       |
| ***String***         | getNameFormat()                              | The method to get the value of ***User NameFormat***         |
| ***void***           | setNameFormat(***String*** nameFormat)       | The method to set the value of ***User NameFormat***         |
| ***Boolean***        | getPersonalAccount()                         | The method to get the value of ***User PersonalAccount***     |
| ***void***           | setPersonalAccount(***Boolean*** personalAccount)   | The method to set the value of ***User PersonalAccount***     |
| ***String***         | getDefaultTabGroup()                         | The method to get the value of ***User DefaultTabGroup***        |
| ***void***           | setDefaultTabGroup(***String*** defaultTabGroup) | The method to set the value of ***User DefaultTabGroup***        |
| ***String***         | getLanguage() | The method to get the value of ***User Language***           |
| ***void***           | setLanguage(***String*** language)           | The method to set the value of ***User Language***           |
| ***String***         | getLocale()                                  | The method to get the value of ***User Locale***      |
| ***void***           | setLocale(***String*** locale)               | The method to set the value of ***User Locale***      |
| ***Boolean***        | getMicrosoft()                               | The method to get the value of ***User Microsoft***  |
| ***void***           | setMicrosoft(***Boolean*** microsoft)        | The method to set the value of ***User Microsoft***  |
| ***Boolean***        | getIsonline()                                | The method to get the value of ***User Isonline***     |
| ***void***           | setIsonline(***Boolean*** isonline)          | The method to set the value of ***User Isonline***     |
| ***String***         | getStreet()                                  | The method to get the value of ***User Street***     |
| ***void***           | setStreet(***String*** street)               | The method to set the value of ***User Street***     |
| ***String***         | getCurrency()                                | The method to get the value of ***User Currency***     |
| ***void***           | setCurrency(***String*** currency)           | The method to set the value of ***User Currency***     |
| ***String***         | getAlias()                                   | The method to get the value of ***User Alias***     |
| ***void***           | setAlias(***String*** alias)                 | The method to set the value of ***User Alias***     |
| ***[Theme](#theme)*** | getTheme()                                 | The method to get the value of ***User Theme***     |
| ***void***           | setTheme(***[Theme](#theme)*** theme)       | The method to set the value of ***User Theme***     |
| ***String***         | getState()                                   | The method to get the value of ***User State***     |
| ***void***           | setState(***String*** state)                 | The method to set the value of ***User State***     |
| ***String***         | getFax()                                     | The method to get the value of ***User Fax***     |
| ***void***           | setFax(***String*** fax)                     | The method to set the value of ***User Fax***     |
| ***String***         | getCountryLocale()                           | The method to get the value of ***User CountryLocale***     |
| ***void***           | setCountryLocale(***String*** countryLocale) | The method to set the value of ***User CountryLocale***     |
| ***String***         | getFirstName()                               | The method to get the value of ***User FirstName***     |
| ***void***           | setFirstName(***String*** firstName)         | The method to set the value of ***User FirstName***     |
| ***String***         | getEmail()                                   | The method to get the value of ***User Email***     |
| ***void***           | setEmail(***String*** email)                 | The method to set the value of ***User Email***     |
| ***[User](#user)*** | getReportingTo()                             | The method to get the value of ***User ReportingTo***     |
| ***void***           | setReportingTo(***[User](#user)*** reportingTo) | The method to set the value of ***User ReportingTo***     |
| ***String***         | getDecimalSeparator()                        | The method to get the value of ***User DecimalSeparator***     |
| ***void***           | setDecimalSeparator(***String*** decimalSeparator) | The method to set the value of ***User DecimalSeparator*** |
| ***String***         | getZip()                                     | The method to get the value of ***User Zip***     |
| ***void***           | setZip(***String*** zip)                     | The method to set the value of ***User Zip*** |
| ***String***         | getWebsite()                                 | The method to get the value of ***User Website***     |
| ***void***           | setWebsite(***String*** website)             | The method to set the value of ***User Website*** |
| ***String***         | getTimeFormat()                              | The method to get the value of ***User TimeFormat***     |
| ***void***           | setTimeFormat(***String*** timeFormat)       | The method to set the value of ***User TimeFormat*** |
| ***Long***           | getOffset()                                  | The method to get the value of ***User Offset***     |
| ***void***           | setOffset(***Long*** offset)                 | The method to set the value of ***User Offset*** |
| ***[Profile](Profile.md#profile)*** | getProfile() | The method to get the value of ***User Profile***     |
| ***void***           | setProfile(***[Profile](Profile.md#profile)*** profile) | The method to set the value of ***User Profile*** |
| ***String***         | getMobile()                                  | The method to get the value of ***User Mobile***     |
| ***void***           | setMobile(***String*** mobile)               | The method to set the value of ***User Mobile*** |
| ***String***         | getLastName()                                | The method to get the value of ***User LastName***     |
| ***void***           | setLastName(***String*** lastName)           | The method to set the value of ***User LastName*** |
| ***String***         | getTimeZone()                                | The method to get the value of ***User TimeZone***     |
| ***void***           | setTimeZone(***String*** timeZone)           | The method to set the value of ***User TimeZone*** |
| ***String***         | getZuid()                                    | The method to get the value of ***User Zuid***     |
| ***void***           | setZuid(***String*** zuid)                   | The method to set the value of ***User Zuid*** |
| ***Boolean***        | getConfirm()                                 | The method to get the value of ***User Confirm***     |
| ***void***           | setConfirm(***Boolean*** confirm)            | The method to set the value of ***User Confirm*** |
| ***String***         | getFullName()                                | The method to get the value of ***User FullName***     |
| ***void***           | setFullName(***String*** fullName)           | The method to set the value of ***User FullName*** |
| ***List&lt;[Territory](#territory)&gt;***    |  getTerritories() | The method to get the value of ***User Territories***     |
| ***void***           | setTerritories(***List&lt;[Territory](#territory)&gt;*** territories) | The method to set the value of ***User Territories*** |
| ***String***         | getPhone()                                   | The method to get the value of ***User Phone*** |
| ***void***           | setPhone(***String*** phone)                 | The method to set the value of ***User Phone*** |
| ***String***         | getDob()                                     | The method to get the value of ***User Dob*** |
| ***void***           | setDob(***String*** dob)                     | The method to set the value of ***User Dob*** |
| ***String***         | getDateFormat()                              | The method to get the value of ***User DateFormat*** |
| ***void***           | setDateFormat(***String*** dateFormat)       | The method to set the value of ***User DateFormat*** |
| ***String***         | getStatus()                                  | The method to get the value of ***User Status*** |
| ***void***           | setStatus(***String*** status)               | The method to set the value of ***User Status*** |
| ***String***         | getName()                                    | The method to get the value of ***User Name*** |
| ***void***           | setName(***String*** name)                   | The method to set the value of ***User Name*** |
----

[source](../../src/main/java/com/zoho/crm/api/users/User.java)

## UsersOperations

Contains methods for all possible [Users operations](../../src/main/java/com/zoho/crm/api/users/UsersOperations.java).

### Methods

| Return Type                         | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/users/ResponseHandler.java)&gt;*** | getUsers(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get the list of users in your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/users/ActionHandler.java)&gt;*** | createUser(***[RequestWrapper](#requestwrapper)*** request) | To add a user to your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/users/ActionHandler.java)&gt;*** | updateUsers(***[BodyWrapper](#bodywrapper)*** request) | To update the existing users of your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/users/ResponseHandler.java)&gt;*** | getUser(***Long*** id, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get the details of a specific user. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/users/ActionHandler.java)&gt;*** | updateUser(***Long*** id, ***[BodyWrapper](#bodywrapper)*** request) | To update the details of a specific user. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/users/ActionHandler.java)&gt;*** | deleteUser(***Long*** id) | To delete a specific user from your organization. |
----

### Inner Static Classes

| Class                             |
| :---------------------------------|
| [GetUsersParam](#getusersparam)   |
| [GetUsersHeader](#getusersheader) |
| [GetUserHeader](#getuserheader)   |
----

[source](../../src/main/java/com/zoho/crm/api/users/UsersOperations.java)

## GetUsersParam

Contains all possible parameters for the [Get Users operation](../../src/main/java/com/zoho/crm/api/users/UsersOperations.java).

### Fields

| Modifier and Type                                                  | Field    | Description                     |
| :----------------------------------------------------------------- | :------- | :------------------------------ |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | TYPE     | Represents `type` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PAGE     | Represents `page` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PER_PAGE | Represents `per_page` parameter |
----

## GetUsersHeader

Contains all possible headers for the [Get Users operation](../../src/main/java/com/zoho/crm/api/users/UsersOperations.java).

### Fields

| Modifier and Type                                                            | Field                | Description                              |
| :--------------------------------------------------------------------------- | :------------------- | :--------------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** | IF_MODIFIED_SINCE    | Represents `If-Modified-Since` parameter |
----

## GetUserHeader

Contains all possible headers for the [Get User operation](../../src/main/java/com/zoho/crm/api/users/UsersOperations.java).

### Fields

| Modifier and Type                                                            | Field                | Description                              |
| :--------------------------------------------------------------------------- | :------------------- | :--------------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** | IF_MODIFIED_SINCE    | Represents `If-Modified-Since` parameter |
----
