# Organization

## Package com.zoho.crm.api.org

The Zoho CRM [Organization API](https://www.zoho.com/crm/developer/docs/api/get-org-data.html) reference provides information about the possible operations on **Organization**.

## Classes

| Class                               | Implementing Interfaces                |
|:----------------------------------- | :------------------------------------- |
| [APIException](#apiexception)       | Model, ResponseHandler, ActionResponse |
| [FileBodyWrapper](#filebodywrapper) | Model                                  |
| [LicenseDetails](#licensedetails)   | Model                                  |
| [Org](#org)                         | Model                                  |
| [OrgOperations](#orgoperations)     |                                        |
| [ResponseWrapper](#responsewrapper) | Model, ResponseHandler                 |
| [SuccessResponse](#successresponse) |                                        |
----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/org/APIException.java) is returned for all operations.

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

[source](../../src/main/java/com/zoho/crm/api/org/APIException.java)

## FileBodyWrapper

Serves as the request for Photo upload operation.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)***  | getFile() | The method to get the ***StreamWrapper*** class instance|
| ***void***           | setFile(***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)*** file)| The method to set the ***StreamWrapper*** class instance|
----

[source](../../src/main/java/com/zoho/crm/api/org/FileBodyWrapper.java)

## LicenseDetails

Strucuture representing the details of the CRM license.

### Methods

| Return Type          | Method                                         |  Description                                                   |
| :------------------- | :--------------------------------------------- | :------------------------------------------------------------- |
| ***OffsetDateTime*** | getPaidExpiry()                                | The method to get the value of ***LicenseDetails PaidExpiry*** |
| ***void***           | setPaidExpiry(***OffsetDateTime*** paidExpiry) | The method to set the value of ***LicenseDetails PaidExpiry*** |
| ***Long***           | getUsersLicensePurchased()                     | The method to get the value of ***LicenseDetails UsersLicensePurchased*** |
| ***void***           | setUsersLicensePurchased(***Long*** usersLicensePurchased) | The method to set the value of ***LicenseDetails UsersLicensePurchased*** |
| ***String***         | getTrialType()                                 | The method to get the value of ***LicenseDetails TrialType*** |
| ***void***           | setTrialType(***String*** page)                | The method to set the value of ***LicenseDetails TrialType*** |
| ***String***         | getTrialExpiry()                               | The method to get the value of ***LicenseDetails TrialExpiry*** |
| ***void***           | setTrialExpiry(***String*** trialExpiry)       | The method to set the value of ***LicenseDetails TrialExpiry*** |
| ***Boolean***        | getPaid()                                      | The method to get the value of ***LicenseDetails Paid*** |
| ***void***           | setPaid(***Boolean*** trialExpiry)             | The method to set the value of ***LicenseDetails Paid*** |
| ***String***         | getPaidType()                                  | The method to get the value of ***LicenseDetails PaidType*** |
| ***void***           | setPaidType(***String*** paidType)             | The method to set the value of ***LicenseDetails PaidType*** |
----

[source](../../src/main/java/com/zoho/crm/api/org/LicenseDetails.java)

## Org

Structure of Zoho CRM [Org](../../src/main/java/com/zoho/crm/api/org/Org.java).

### Methods

| Return Type          | Method                                             | Description                                                       |
| :------------------- | :------------------------------------------------- | :---------------------------------------------------------------- |
| ***String***         | getCountry()                                       | The method to get the value of ***Org Country***                  |
| ***void***           | setCountry(***String*** country)                   | The method to set the value of ***Org Country***                  |
| ***String***         | getPhotoId()                                       | The method to get the value of ***Org PhotoId***                  |
| ***void***           | setPhotoId(***String*** photoId)                   | The method to set the value of ***Org PhotoId***                  |
| ***String***         | getCity()                                          | The method to get the value of ***Org City***                     |
| ***void***           | setCity(***String*** city)                         | The method to set the value of ***Org City***                     |
| ***String***         | getDescription()                                   | The method to get the value of ***Org Description***              |
| ***void***           | setDescription(***String*** description)           | The method to set the value of ***Org Description***              |
| ***Boolean***        | getMcStatus()                                      | The method to get the value of ***Org McStatus***                 |
| ***void***           | setMcStatus(***Boolean*** mcStatus)                | The method to set the value of ***Org McStatus***                 |
| ***Boolean***        | getGappsEnabled()                                  | The method to get the value of ***Org GappsEnabled***             |
| ***void***           | setGappsEnabled(***Boolean*** gappsEnabled)        | The method to set the value of ***Org GappsEnabled***             |
| ***String***         | getDomainName()                                    | The method to get the value of ***Org DomainName***               |
| ***void***           | getDomainName(***String*** domainName)             | The method to set the value of ***Org DomainName***               |
| ***Boolean***        | getTranslationEnabled()                            | The method to get the value of ***Org TranslationEnabled***       |
| ***void***           | setTranslationEnabled(***Boolean*** translationEnabled) | The method to set the value of ***Org TranslationEnabled***  |
| ***String***         | getStreet()                                        | The method to get the value of ***Org Street***                   |
| ***void***           | setStreet(***String*** street)                     | The method to set the value of ***Org Street***                   |
| ***String***         | getAlias()                                         | The method to get the value of ***Org Alias***                    |
| ***void***           | setAlias(***String*** alias)                       | The method to set the value of ***Org Alias***                    |
| ***String***         | getCurrency()                                      | The method to get the value of ***Org Currency***                 |
| ***void***           | setCurrency(***String*** currency)                 | The method to set the value of ***Org Currency***                 |
| ***Long***           | getId()                                            | The method to get the value of ***Org Id***                       |
| ***void***           | setId(***Long*** id)                               | The method to set the value of ***Org Id***                       |
| ***String***         | getState()                                         | The method to get the value of ***Org State***                    |
| ***void***           | setState(***String*** state)                       | The method to set the value of ***Org State***                    |
| ***String***         | getFax()                                           | The method to get the value of ***Org Fax***                      |
| ***void***           | setFax(***String*** fax)                           | The method to set the value of ***Org Fax***                      |
| ***String***         | getEmployeeCount()                                 | The method to get the value of ***Org EmployeeCount***            |
| ***void***           | setEmployeeCount(***String*** employeeCount)       | The method to set the value of ***Org EmployeeCount***            |
| ***String***         | getZip()                                           | The method to get the value of ***Org Zip***                      |
| ***void***           | setZip(***String*** zip)                           | The method to set the value of ***Org Zip***                      |
| ***String***         | getWebsite()                                       | The method to get the value of ***Org Website***                  |
| ***void***           | setWebsite(***String*** website)                   | The method to set the value of ***Org Website***                  |
| ***String***         | getCurrencySymbol()                                | The method to get the value of ***Org CurrencySymbol***           |
| ***void***           | setCurrencySymbol(***String*** currencySymbol)     | The method to set the value of ***Org CurrencySymbol***           |
| ***String***         | getMobile()                                        | The method to get the value of ***Org Mobile***                   |
| ***void***           | setMobile(***String*** mobile)                     | The method to set the value of ***Org Mobile***                   |
| ***String***         | getCurrencyLocale()                                | The method to get the value of ***Org CurrencyLocale***           |
| ***void***           | setCurrencyLocale(***String*** currencyLocale)     | The method to set the value of ***Org CurrencyLocale***           |
| ***String***         | getPrimaryZuid()                                   | The method to get the value of ***Org PrimaryZuid***              |
| ***void***           | setPrimaryZuid(***String*** primaryZuid)           | The method to set the value of ***Org PrimaryZuid***              |
| ***String***         | getZiaPortalId()                                   | The method to get the value of ***Org ZiaPortalId***              |
| ***void***           | setZiaPortalId(***String*** ziaPortalId)           | The method to set the value of ***Org ZiaPortalId***              |
| ***String***         | getTimeZone()                                      | The method to get the value of ***Org TimeZone***                 |
| ***void***           | setTimeZone(***String*** timeZone)                 | The method to set the value of ***Org TimeZone***                 |
| ***String***         | getZgid()                                          | The method to get the value of ***Org Zgid***                     |
| ***void***           | setZgid(***String*** zgid)                         | The method to set the value of ***Org Zgid***                     |
| ***String***         | getCountryCode()                                   | The method to get the value of ***Org CountryCode***              |
| ***void***           | setCountryCode(***String*** countryCode)           | The method to set the value of ***Org CountryCode***              |
| ***[LicenseDetails](#licensedetails)*** | getLicenseDetails()             | The method to get the value of ***Org LicenseDetails***           |
| ***void***           | setLicenseDetails(***[LicenseDetails](#licensedetails)*** licenseDetails) | The method to set the value of ***Org LicenseDetails*** |
| ***String***         | getPhone()                                         | The method to get the value of ***Org Phone***                    |
| ***void***           | setPhone(***String*** phone)                       | The method to set the value of ***Org Phone***                    |
| ***String***         | getCompanyName()                                   | The method to get the value of ***Org CompanyName***              |
| ***void***           | setCompanyName(***String*** companyName)           | The method to set the value of ***Org CompanyName***              |
| ***Boolean***        | getPrivacySettings()                               | The method to get the value of ***Org PrivacySettings***          |
| ***void***           | setPrivacySettings(***Boolean*** privacySettings)  | The method to set the value of ***Org PrivacySettings***          |
| ***String***         | getPrimaryEmail()                                  | The method to get the value of ***Org PrimaryEmail***             |
| ***void***           | setPrimaryEmail(***String*** primaryEmail)         | The method to set the value of ***Org PrimaryEmail***             |
| ***String***         | getIsoCode()                                       | The method to get the value of ***Org IsoCode***                  |
| ***void***           | setIsoCode(***String*** isoCode)                   | The method to set the value of ***Org IsoCode***                  |
----

[source](../../src/main/java/com/zoho/crm/api/org/Org.java)

## OrgOperations

Contains methods for all possible [Org operations](../../src/main/java/com/zoho/crm/api/org/OrgOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/org/ResponseHandler.java)&gt;*** | getOrganization() | To get the details of your organization. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/org/ActionResponse.java)&gt;*** | uploadOrganizationPhoto(***[FileBodyWrapper](#filebodywrapper)*** request) | To upload a photo of your organization. |
----

[source](../../src/main/java/com/zoho/crm/api/org/OrgOperations.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/org/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type                   | Method                                      | Description                                                  |
| :---------------------------- | :------------------------------------------ | :----------------------------------------------------------- |
| ***List&lt;[Org](#org)&gt;*** | getOrg()                                   | The method to get the list of obtained ***Org*** instances  |
| ***void***                    | setOrg(***List&lt;[Org](#org)&gt;*** org) | The method to set the list of obtained ***Org*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/org/ResponseWrapper.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/org/SuccessResponse.java) is returned.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***     | getMessage()  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to set the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|
----

[source](../../src/main/java/com/zoho/crm/api/org/SuccessResponse.java)
