# USDataCenter

extends ***[DataCenter](DataCenter.md#datacenter)***

This class represents the properties of Zoho CRM in US Domain.

## Package com.zoho.crm.api.dc

## Static Final Fields

| Return Type                             | Field      | Description                                                                                        |
| :-------------------------------------- | :--------- | :------------------------------------------------------------------------------------------------- |
| [Environment](DataCenter.md#environment)| PRODUCTION | This ***Environment class*** instance represents the Zoho CRM Production Environment in US Domain. |
| [Environment](DataCenter.md#environment)| SANDBOX    | This ***Environment class*** instance represents the Zoho CRM Sandbox Environment in US Domain.    |
| [Environment](DataCenter.md#environment)| DEVELOPER  | This ***Environment class*** instance represents the Zoho CRM Developer Environment in US Domain.  |
----

## Methods

| Return Type      | Method             | Description                               |
| :--------------- | :----------------- | :---------------------------------------- |
| ***String***     | getIAMUrl()        | The method to get the accounts ***URL***. Use this ***URL*** when calling ***OAuth*** accounts. |
| ***String***     | getFileUploadUrl() | The method to get the ***File Upload URL***. |
----

[source](../../src/main/java/com/zoho/crm/api/dc/USDataCenter.java)
