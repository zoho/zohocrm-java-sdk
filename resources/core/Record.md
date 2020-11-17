# Record

## Package com.zoho.crm.api.record

The Zoho CRM [Records API](https://www.zoho.com/crm/developer/docs/api/get-records.html) reference provides information about the possible operations on **Records**.

## Classes

| Class                                                   | Implementing Interfaces                 | Extends Classes   |
|:------------------------------------------------------- | :-------------------------------------- | :---------------- |
| [ActionWrapper](#actionwrapper)                         | Model, ActionHandler                    | |
| [APIException](#apiexception) | Model, ResponseHandler, ActionResponse, ActionHandler, DeletedRecordsHandler, ConvertActionResponse, ConvertActionHandler, DownloadHandler, FileHandler, MassUpdateActionResponse, MassUpdateActionHandler, MassUpdateResponse, MassUpdateResponseHandler | |
| [BodyWrapper](#bodywrapper)                             | Model                                   | |
| [Comment](#comment)                                     | Model                                   | |
| [ConvertActionWrapper](#convertactionwrapper)           | Model, ConvertActionHandler             | |
| [ConvertBodyWrapper](#convertbodywrapper)               | Model                                   | |
| [Criteria](#criteria)                                   | Model                                   | |
| [DeletedRecord](#deletedrecord)                         | Model                                   | |
| [DeletedRecordsWrapper](#deletedrecordswrapper)         | Model, DeletedRecordsHandler            | |
| [Field&lt;T&gt;](#field&lt;T>)                          |                                         | |
| [FileBodyWrapper](#filebodywrapper)                     | Model, ResponseHandler, DownloadHandler | |
| [FileDetails](#filedetails)                             | Model                                   | |
| [Info](#info)                                           | Model                                   | |
| [InventoryLineItems](#inventorylineitems)               | Model                                   | [Record](Record.md#record-1) |
| [LeadConverter](#leadconverter)                         | Model                                   | |
| [LineItemProduct](#lineitemproduct)                     | Model                                   | [Record](Record.md#record-1) |
| [LineTax](#linetax)                                     | Model                                   | |
| [MassUpdate](#massupdate)                               | Model, MassUpdateResponse               | |
| [MassUpdateActionWrapper](#massupdateactionwrapper)     | Model, MassUpdateActionHandler          | |
| [MassUpdateBodyWrapper](#massupdatebodywrapper)         | Model                                   | |
| [MassUpdateResponseWrapper](#massupdateresponsewrapper) | Model, MassUpdateResponseHandler        | |
| [MassUpdateSuccessResponse](#massupdatesuccessresponse) | Model, MassUpdateActionResponse         | |
| [Participants](#participants)                           | Model                                   | [Record](Record.md#record-1) |
| [PricingDetails](#pricingdetails)                       | Model                                   | [Record](Record.md#record-1) |
| [Record](#record-1)                                     | Model                                   | |
| [RecordOperations](#recordoperations)                   |                                         | |
| [RecurringActivity](#recurringactivity)                 | Model                                   | |
| [RemindAt](#remindat)                                   | Model                                   | |
| [Reminder](#reminder)                                   | Model                                   | |
| [ResponseWrapper](#responsewrapper)                     | Model, ResponseHandler                  | |
| [SuccessfulConvert](#successfulconvert)                 | Model, ConvertActionResponse            | |
| [SuccessResponse](#successresponse)                     | Model, ActionResponse, FileHandler      | |
| [Territory](#territory)                                 | Model                                   | |
| [Consent](#consent) | Model | [Record](record.md#record) |

----

## ActionWrapper

After a successful **API** request, an instance of [ActionWrapper](../../src/main/java/com/zoho/crm/api/record/ActionWrapper.java) is returned for **POST**, **PUT** and **DELETE** operations

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/record/ActionResponse.java)&gt;*** | getData() | The method to get the list of obtained ***ActionResponse*** instances |
| ***void***  | setData(***List&lt;[ActionResponse](../../src/main/java/com/zoho/crm/api/record/ActionResponse.java)&gt;*** data) | The method to set the list of obtained ***ActionResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/record/ActionWrapper.java)

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/record/APIException.java) is returned for all operations.

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
[source](../../src/main/java/com/zoho/crm/api/record/APIException.java)

## BodyWrapper

A structure that contains all possible keys of a single request.

### Methods

|  Return Type                          | Method                       | Description                                                   |
| :------------------------------------ | :--------------------------- | :------------------------------------------------------------ |
| ***List&lt;[Record](#record-1)&gt;*** | getData()                    | The method to get the list of obtained ***Record*** instances |
| ***void*** | setData(***List&lt;[Record](#record-1)&gt;*** data)     | The method to set the list of obtained ***Record*** instances |
| ***List&lt;String&gt;***              | getTrigger()                 | The method to get the value of ***Request Body Trigger***     |
| ***void***                            | setTrigger(***List&lt;String&gt;*** trigger) | The method to set the value of ***Request Body Trigger*** |
| ***List&lt;String&gt;***              | getProcess()                 | The method to get the value of ***Request Body Process*** |
| ***void*** | setProcess(***List&lt;String&gt;*** process)            | The method to set the value of ***Request Body Process*** |
| ***List&lt;String&gt;***              | getDuplicateCheckFields()    | The method to get the value of ***Request Body DuplicateCheckFields*** |
| ***void*** | setDuplicateCheckFields(***List&lt;String&gt;*** duplicateCheckFields) | The method to set the value of ***Request Body DuplicateCheckFields*** |
| ***String;***                         | getWfTrigger()               | The method to get the value of ***Request Body WfTrigger*** |
| ***void***                            | setWfTrigger(***String*** wfTrigger) | The method to set the value of ***Request Body WfTrigger*** |
| ***String***                          | getLarId()                   | The method to get the value of ***Request Body LarId*** |
| ***void***                            | setLarId(***String*** larId) | The method to set the value of ***Request Body LarId*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/BodyWrapper.java)

## Comment

Structure representing the properties of Comment.

### Methods

| Return Type   | Method                                               |  Description                                                |
| :------------ | :--------------------------------------------------- | :---------------------------------------------------------- |
| ***String***  | getCommentedBy()                                     | The method to get the value of ***Comment CommentedBy***    |
| ***void***    | setCommentedBy(***String*** commentedBy)             | The method to set the value of ***Comment CommentedBy***    |
| ***OffsetDateTime*** | getCommentedTime()                            | The method to get the value of ***Comment CommentedTime***  |
| ***void***    | setCommentedTime(***OffsetDateTime*** commentedTime) | The method to set the value of ***Comment CommentedTime***  |
| ***String***  | getCommentContent()                                  | The method to get the value of ***Comment CommentContent*** |
| ***void***    | setCommentContent(***String*** commentContent)       | The method to set the value of ***Comment CommentContent*** |
| ***Long***  | getId()                                              | The method to get the value of ***Comment Id***             |
| ***void***    | setId(***Long*** id)                               | The method to set the value of ***Comment Id***             |
----

[source](../../src/main/java/com/zoho/crm/api/record/Comment.java)

## ConvertActionWrapper

After a successful Convert Lead request, an instance of [ConvertActionWrapper](../../src/main/java/com/zoho/crm/api/record/ConvertActionWrapper.java) is returned.

### Methods

| Return Type | Method                                  | Description                                                      |
| :---------  | :---------------------------------------| :--------------------------------------------------------------- |
| ***List&lt;[ConvertActionResponse](../../src/main/java/com/zoho/crm/api/record/ConvertActionResponse.java)&gt;*** | getData() | The method to get the list of obtained **ConvertActionResponse** instances. |
| ***void***  | setData(***List&lt;[ConvertActionResponse](../../src/main/java/com/zoho/crm/api/record/ConvertActionResponse.java)&gt;*** data) | The method to set the list of obtained **ConvertActionResponse** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/record/ConvertActionWrapper.java)

## ConvertBodyWrapper

Structure that serves as the request for Lead Convert operation

### Methods

|  Return Type                          | Method                               | Description                                                          |
| :------------------------------------ | :----------------------------------- | :------------------------------------------------------------------- |
| ***List&lt;[LeadConverter](#leadconverter)&gt;*** | getData()                | The method to get the list of obtained ***LeadConverter*** instances |
| ***void*** | setData(***List&lt;[LeadConverter](#leadconverter)&gt;*** data) | The method to set the list of obtained ***LeadConverter*** instances |
----

[source](../../src/main/java/com/zoho/crm/api/record/ConvertBodyWrapper.java)

## Criteria

The structure that represents the condition to MassUpdate Records.

### Methods

| Return Type   | Method                                                  |  Description                                                |
| :------------ | :------------------------------------------------------ | :---------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getComparator() | The method to get the value of ***Criteria Comparator*** |
| ***void***    | setComparator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** comparator) | The method to set the value of ***Criteria Comparator***  |
| ***String***  | getField()                                              | The method to get the value of ***Criteria Field*** |
| ***void***    | setField(***String*** field)                            | The method to set the value of ***Criteria Field*** |
| ***Object***  | getValue()                                              | The method to get the value of ***Criteria Value*** |
| ***void***    | setValue(***Object*** value)                            | The method to set the value of ***Criteria Value*** |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***  | getGroupOperator() | The method to get the value of ***Criteria GroupOperator*** |
| ***void***    | setGroupOperator(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** groupOperator) | The method to set the value of ***Comment GroupOperator*** |
| ***List&lt;[Criteria](#criteria)&gt;*** | getGroup()                    | The method to get the value of ***Criteria Group*** |
| ***void***    | setGroup(***List&lt;[Criteria](#criteria)&gt;*** group) | The method to set the value of ***Criteria Group*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/Criteria.java)

## DeletedRecord

Structure representing the properties of [DeletedRecord](../../src/main/java/com/zoho/crm/api/record/DeletedRecord.java).

### Methods

| Return Type   | Method                                           |  Description                                                   |
| :------------ | :----------------------------------------------- | :------------------------------------------------------------- |
| ***[User](#user)*** | getDeletedBy()                             | The method to get the value of ***DeletedRecord DeletedBy***   |
| ***void***    | setDeletedBy(***[User](#user)*** deletedBy)      | The method to set the value of ***DeletedRecord DeletedBy***   |
| ***Long***   | getId()                                          | The method to get the value of ***DeletedRecord Id***          |
| ***void***    | setId(***Long*** id)                           | The method to set the value of ***DeletedRecord Id***          |
| ***String***  | getDisplayName()                                 | The method to get the value of ***DeletedRecord DisplayName*** |
| ***void***    | setDisplayName(***String*** displayName)         | The method to set the value of ***DeletedRecord DisplayName*** |
| ***String***  | getType()                                        | The method to get the value of ***DeletedRecord Type***        |
| ***void***    | setType(***String*** type)                       | The method to set the value of ***DeletedRecord Type***        |
| ***[User](#user)*** | getCreatedBy()                             | The method to get the value of ***DeletedRecord CreatedBy***   |
| ***void***    | setCreatedBy(***[User](#user)*** createdBy)      | The method to set the value of ***DeletedRecord CreatedBy***   |
| ***OffsetDateTime*** | getDeletedTime()                          | The method to get the value of ***DeletedRecord DeletedTime*** |
| ***void***    | setDeletedTime(***OffsetDateTime*** deletedTime) | The method to set the value of ***DeletedRecord DeletedTime*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/DeletedRecord.java)

## DeletedRecordsWrapper

After a successful **API** request, an instance of [DeletedRecordsWrapper](../../src/main/java/com/zoho/crm/api/record/DeletedRecordsWrapper.java) is returned for the GET Deleted Records operation.

### Methods

|  Return Type            | Method                       | Description                                                   |
| :---------------------- | :--------------------------- | :------------------------------------------------------------ |
| ***List&lt;[DeletedRecord](#deletedrecord)&gt;*** | getData() | The method to get the list of obtained ***DeletedRecord*** instances |
| ***void***              | setData(***List&lt;[DeletedRecord](#deletedrecord)&gt;*** data) | The method to set the list of obtained ***DeletedRecord*** instances |
| ***Info***              | getInfo()                | The method to get the ***Info*** instance |
| ***void***              | setInfo(***Info*** info) | The method to set the ***Info*** instance |
----

[source](../../src/main/java/com/zoho/crm/api/record/DeletedRecordsWrapper.java)

## Field&lt;T>

Structure containing the default fields of all the default modules.

### Methods

| Return Type   | Method       |  Description                                       |
| :------------ | :----------- | :------------------------------------------------- |
| ***String***  | getAPIName() | The method to get the value of ***Field APIName*** |
----

### Inner Static Classes

| Class                               |
| :---------------------------------- |
| [Products](#products)               |
| [Tasks](#tasks)                     |
| [Vendors](#vendors)                 |
| [Calls](#calls)                     |
| [Leads](#leads)                     |
| [Deals](#deals)                     |
| [Campaigns](#campaigns)             |
| [Quotes](#quotes)                   |
| [Invoices](#invoices)               |
| [Attachments](#attachments)         |
| [Price_Books](#price_books)         |
| [Sales_Orders](#sales_orders)       |
| [Contacts](#contacts)               |
| [Solutions](#solutions)             |
| [Events](#events)                   |
| [Purchase_Orders](#purchase_orders) |
| [Accounts](#accounts)               |
| [Cases](#cases)                     |
| [Notes](#notes)                     |
----

[source](../../src/main/java/com/zoho/crm/api/record/Field.java)

## FileBodyWrapper

Serves as the request for uploading photo and response for downloading photo operations.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)***  | getFile() | The method to get the ***StreamWrapper*** class instance |
| ***void***            | setFile(***[StreamWrapper](../util/StreamWrapper.md#streamwrapper)*** file)| The method to set the ***StreamWrapper*** class instance |
----

[source](../../src/main/java/com/zoho/crm/api/record/FileBodyWrapper.java)

## FileDetails

Structure representing the properties of the FileUpload field.

### Methods

| Return Type   | Method                                             |  Description                                          |
| :------------ | :------------------------------------------------- | :---------------------------------------------------- |
| ***String***  | getExtn()                                          | The method to get the value of ***FileDetails Extn*** |
| ***void***    | setExtn(***String*** extn)                         | The method to set the value of ***FileDetails Extn*** |
| ***Boolean*** | getIsPreviewAvailable()                            | The method to get the value of ***FileDetails IsPreviewAvailable*** |
| ***void***    | setIsPreviewAvailable(***Boolean*** isPreviewAvailable) | The method to set the value of ***FileDetails IsPreviewAvailable*** |
| ***String***  | getDownloadUrl()                                   | The method to get the value of ***FileDetails DownloadUrl*** |
| ***void***    | setDownloadUrl(***String*** downloadUrl)           | The method to set the value of ***FileDetails DownloadUrl*** |
| ***String***  | getDeleteUrl()                                     | The method to get the value of ***FileDetails DeleteUrl*** |
| ***void***    | setDeleteUrl(***String*** deleteUrl)               | The method to set the value of ***FileDetails DeleteUrl*** |
| ***String***  | getEntityId()                                      | The method to get the value of ***FileDetails EntityId*** |
| ***void***    | setEntityId(***String*** entityId)                 | The method to set the value of ***FileDetails EntityId*** |
| ***String***  | getMode()                                          | The method to get the value of ***FileDetails Mode*** |
| ***void***    | setMode(***String*** mode)                         | The method to set the value of ***FileDetails Mode*** |
| ***String***  | getOriginalSizeByte()                              | The method to get the value of ***FileDetails OriginalSizeByte*** |
| ***void***    | setOriginalSizeByte(***String*** originalSizeByte) | The method to set the value of ***FileDetails OriginalSizeByte*** |
| ***String***  | getPreviewUrl()                                    | The method to get the value of ***FileDetails PreviewUrl*** |
| ***void***    | setPreviewUrl(***String*** previewUrl)             | The method to set the value of ***FileDetails PreviewUrl*** |
| ***String***  | getFileName()                                      | The method to get the value of ***FileDetails FileName*** |
| ***void***    | setFileName(***String*** fileName)                 | The method to set the value of ***FileDetails FileName*** |
| ***String***  | getFileId()                                        | The method to get the value of ***FileDetails FileId*** |
| ***void***    | setFileId(***String*** fileId)                     | The method to set the value of ***FileDetails FileId*** |
| ***String***  | getAttachmentId()                                  | The method to get the value of ***FileDetails AttachmentId*** |
| ***void***    | setAttachmentId(***String*** attachmentId)         | The method to set the value of ***FileDetails AttachmentId*** |
| ***String***  | getFileSize()                                      | The method to get the value of ***FileDetails FileSize*** |
| ***void***    | setFileSize(***String*** fileSize)                 | The method to set the value of ***FileDetails FileSize*** |
| ***String***  | getCreatorId()                                     | The method to get the value of ***FileDetails CreatorId*** |
| ***void***    | setCreatorId(***String*** creatorId)               | The method to set the value of ***FileDetails CreatorId*** |
| ***Integer*** | getLinkDocs()                                      | The method to get the value of ***FileDetails LinkDocs*** |
| ***void***    | setLinkDocs(***Integer*** linkDocs)                | The method to set the value of ***FileDetails LinkDocs*** |
| ***String***  | getDelete()                                        | The method to get the value of ***FileDetails Delete*** |
| ***void***    | setDelete(***String*** delete)                     | The method to set the value of ***FileDetails Delete*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/FileDetails.java)

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

[source](../../src/main/java/com/zoho/crm/api/record/Info.java)

## InventoryLineItems

Structure representing the properties of LineItems used in Inventory modules.

### Methods

| Return Type   | Method                                                    |  Description                                                        |
| :------------ | :-------------------------------------------------------- | :------------------------------------------------------------------ |
| ***[LineItemProduct](#lineitemproduct)*** | getProduct()                  | The method to get the value of ***InventoryLineItems Product*** |
| ***void***    | setProduct(***[LineItemProduct](#lineitemproduct)*** product) | The method to set the value of ***InventoryLineItems Product*** |
| ***Double***  | getQuantity()                                             | The method to get the value of ***InventoryLineItems Quantity*** |
| ***void***    | setQuantity(***Double*** quantity)                        | The method to set the value of ***InventoryLineItems Quantity*** |
| ***String***  | getDiscount()                                             | The method to get the value of ***InventoryLineItems Discount*** |
| ***void***    | setDiscount(***String***  discount)                       | The method to set the value of ***InventoryLineItems Discount*** |
| ***Double***  | getTotalAfterDiscount()                                   | The method to get the value of ***InventoryLineItems TotalAfterDiscount*** |
| ***void***    | setTotalAfterDiscount(***Double*** totalAfterDiscount)    | The method to set the value of ***InventoryLineItems TotalAfterDiscount*** |
| ***Double***  | getNetTotal()                                             | The method to get the value of ***InventoryLineItems NetTotal*** |
| ***void***    | setNetTotal(***Double*** netTotal)                        | The method to set the value of ***InventoryLineItems NetTotal*** |
| ***Double***  | getBook()                                                 | The method to get the value of ***InventoryLineItems Book*** |
| ***void***    | setBook(***Double*** book)                                | The method to set the value of ***InventoryLineItems Book*** |
| ***Double***  | getTax()                                                  | The method to get the value of ***InventoryLineItems Tax*** |
| ***void***    | setTax(***Double*** tax)                                  | The method to set the value of ***InventoryLineItems Tax*** |
| ***Double***  | getListPrice()                                            | The method to get the value of ***InventoryLineItems ListPrice*** |
| ***void***    | setListPrice(***Double*** listPrice)                      | The method to set the value of ***InventoryLineItems ListPrice*** |
| ***Double***  | getUnitPrice()                                            | The method to get the value of ***InventoryLineItems UnitPrice*** |
| ***void***    | setUnitPrice(***Double*** unitPrice)                      | The method to set the value of ***InventoryLineItems UnitPrice*** |
| ***Double***  | getQuantityInStock()                                      | The method to get the value of ***InventoryLineItems QuantityInStock*** |
| ***void***    | setQuantityInStock(***Double*** quantityInStock)          | The method to set the value of ***InventoryLineItems QuantityInStock*** |
| ***Double***  | getTotal()                                                | The method to get the value of ***InventoryLineItems Total*** |
| ***void***    | setTotal(***Double*** total)                              | The method to set the value of ***InventoryLineItems Total*** |
| ***Double***  | getProductDescription()                                   | The method to get the value of ***InventoryLineItems ProductDescription*** |
| ***void***    | setProductDescription(***Double*** productDescription)    | The method to set the value of ***InventoryLineItems ProductDescription*** |
| ***List&lt;[LineTax](#linetax)&gt;***  | getLineTax()                     | The method to get the value of ***InventoryLineItems LineTax*** |
| ***void***    | setLineTax(***List&lt;[LineTax](#linetax)&gt;*** lineTax) | The method to set the value of ***InventoryLineItems LineTax*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/InventoryLineItems.java)

## LeadConverter

Structure that contains all possible keys for the Convert Lead Operation.

### Methods

| Return Type   | Method                                    |  Description                                                 |
| :------------ | :---------------------------------------- | :----------------------------------------------------------- |
| ***Boolean*** | getOverwrite()                            | The method to get the value of ***LeadConverter Overwrite*** |
| ***void***    | setOverwrite(***Boolean*** overwrite)     | The method to set the value of ***LeadConverter Overwrite*** |
| ***Boolean*** | getNotifyLeadOwner()                      | The method to get the value of ***LeadConverter NotifyLeadOwner*** |
| ***void***    | setNotifyLeadOwner(***Boolean*** notifyLeadOwner) | The method to set the value of ***LeadConverter NotifyLeadOwner*** |
| ***Boolean*** | getNotifyNewEntityOwner()                 | The method to get the value of ***LeadConverter NotifyNewEntityOwner*** |
| ***void***    | setNotifyNewEntityOwner(***Boolean*** notifyNewEntityOwner) | The method to set the value of ***LeadConverter NotifyNewEntityOwner*** |
| ***String***  | getAccounts()                             | The method to get the value of ***LeadConverter Accounts*** |
| ***void***    | setAccounts(***String*** accounts)        | The method to set the value of ***LeadConverter Accounts*** |
| ***String***  | getContacts()                             | The method to get the value of ***LeadConverter Contacts*** |
| ***void***    | setContacts(***String*** contacts)        | The method to set the value of ***LeadConverter Contacts*** |
| ***String***  | getAssignTo()                             | The method to get the value of ***LeadConverter AssignTo*** |
| ***void***    | setAssignTo(***String*** assignTo)        | The method to set the value of ***LeadConverter AssignTo*** |
| ***[Record](#record-1)*** | getDeals()                    | The method to get the value of ***LeadConverter Deals*** |
| ***void***    | setDeals(***[Record](#record-1)*** deals) | The method to set the value of ***LeadConverter Deals*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/LeadConverter.java)

## LineItemProduct

Structure representing the properties of Product in Line Items of Inventory modules.

### Methods

| Return Type   | Method                                   |  Description                                                     |
| :------------ | :--------------------------------------- | :--------------------------------------------------------------- |
| ***String***  | getProductCode()                         | The method to get the value of ***LineItemProduct ProductCode*** |
| ***void***    | setProductCode(***String*** productCode) | The method to set the value of ***LineItemProduct ProductCode*** |
| ***String***  | getCurrency()                            | The method to get the value of ***LineItemProduct Currency***    |
| ***void***    | setCurrency(***String*** currency)       | The method to set the value of ***LineItemProduct Currency***    |
| ***String***  | getName()                                | The method to get the value of ***LineItemProduct Name***        |
| ***void***    | setName(***String*** name)               | The method to set the value of ***LineItemProduct Name***        |
----

[source](../../src/main/java/com/zoho/crm/api/record/LineItemProduct.java)

## LineTax

Structure representing the properties of Tax.

### Methods

| Return Type   | Method                                 |  Description                                            |
| :------------ | :------------------------------------- | :------------------------------------------------------ |
| ***Double***  | getPercentage()                        | The method to get the value of ***LineTax Percentage*** |
| ***void***    | setPercentage(***Double*** percentage) | The method to set the value of ***LineTax Percentage*** |
| ***String***  | getName()                              | The method to get the value of ***LineTax Name***       |
| ***void***    | setName(***String*** name)             | The method to set the value of ***LineTax Name***       |
| ***Long***  | getId()                                | The method to get the value of ***LineTax Id***         |
| ***void***    | setId(***Long*** id)                 | The method to set the value of ***LineTax Id***         |
| ***Double***  | getValue()                             | The method to get the value of ***LineTax Value***      |
| ***void***    | setValue(***Double*** value)           | The method to set the value of ***LineTax Value***      |
----

[source](../../src/main/java/com/zoho/crm/api/record/LineTax.java)

## MassUpdate

Structure representing the result of a Mass Update operation.

### Methods

| Return Type   | Method                                            |  Description                                            |
| :------------ | :------------------------------------------------ | :------------------------------------------------------ |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***MassUpdate Status*** |
| ***void***    | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***MassUpdate Status*** |
| ***Integer*** | getFailedCount()                                  | The method to get the value of ***MassUpdate FailedCount*** |
| ***void***    | setFailedCount(***Integer*** failedCount)         | The method to set the value of ***MassUpdate FailedCount*** |
| ***Integer*** | getUpdatedCount()                                 | The method to get the value of ***MassUpdate UpdatedCount*** |
| ***void***    | setUpdatedCount(***Integer*** updatedCount)       | The method to set the value of ***MassUpdate UpdatedCount*** |
| ***Integer*** | getNotUpdatedCount()                              | The method to get the value of ***MassUpdate NotUpdatedCount*** |
| ***void***    | setNotUpdatedCount(***Integer*** notUpdatedCount) | The method to set the value of ***MassUpdate NotUpdatedCount*** |
| ***Integer*** | getTotalCount()                                   | The method to get the value of ***MassUpdate TotalCount*** |
| ***void***    | setTotalCount(***Integer*** totalCount)           | The method to set the value of ***MassUpdate TotalCount*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/MassUpdate.java)

## MassUpdateActionWrapper

After a successful **API** request, an instance of [MassUpdateActionWrapper](../../src/main/java/com/zoho/crm/api/record/MassUpdateActionWrapper.java) is returned for the GET MassUpdate records operation.

### Methods

|  Return Type                          | Method                               | Description                                                          |
| :------------------------------------ | :----------------------------------- | :------------------------------------------------------------------- |
| ***List&lt;[MassUpdateActionResponse](#massupdateactionresponse)&gt;*** | getData() | The method to get the list of obtained ***MassUpdateActionResponse*** instances |
| ***void*** | setData(***List&lt;[MassUpdateActionResponse](#massupdateactionresponse)&gt;*** data) | The method to set the list of obtained ***MassUpdateActionResponse*** instances |
----

[source](../../src/main/java/com/zoho/crm/api/record/MassUpdateActionWrapper.java)

## MassUpdateBodyWrapper

A structure that contains all possible keys of a single MassUpdate request.

### Methods

|  Return Type                            | Method                                | Description                                                   |
| :-------------------------------------- | :------------------------------------ | :------------------------------------------------------------ |
| ***List&lt;[Record](#record-1)&gt;***   | getData()                             | The method to get the list of obtained ***Record*** instances |
| ***void*** | setData(***List&lt;[Record](#record-1)&gt;*** data)                | The method to set the list of obtained ***Record*** instances |
| ***String***                            | getCvid()                             | The method to get the value of ***Request Body Trigger***     |
| ***void***                              | setCvid(***String*** cvid)            | The method to set the value of ***Request Body Trigger*** |
| ***List&lt;Long&gt;***                | getIds()                              | The method to get the value of ***Request Body Process*** |
| ***void*** | setIds(***List&lt;Long&gt;*** ids)                               | The method to set the value of ***Request Body Process*** |
| ***[Territory](#territory)***           | getTerritory()                        | The method to get the value of ***Request Body DuplicateCheckFields*** |
| ***void*** | setTerritory(***[Territory](#territory)*** territory)              | The method to set the value of ***Request Body DuplicateCheckFields*** |
| ***Boolean***                           | getOverWrite()                        | The method to get the value of ***Request Body WfTrigger*** |
| ***void***                              | setOverWrite(***Boolean*** overWrite) | The method to set the value of ***Request Body WfTrigger*** |
| ***List&lt;[Criteria](#criteria)&gt;*** | getCriteria()                         | The method to get the value of ***Request Body LarId*** |
| ***void***                              | setCriteria(***List&lt;[Criteria](#criteria)&gt;*** criteria) | The method to set the value of ***Request Body LarId*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/BodyWrapper.java)

## MassUpdateResponseWrapper

After a successful **API** request, an instance of [MassUpdateResponseWrapper](../../src/main/java/com/zoho/crm/api/record/MassUpdateResponseWrapper.java) is returned for GET MassUpdate Status operation.

### Methods

| Return Type                      | Method                                          | Description                                                  |
| :------------------------------- | :---------------------------------------------- | :----------------------------------------------------------- |
| ***List&lt;[MassUpdateResponse](../../src/main/java/com/zoho/crm/api/record/MassUpdateResponse.java)&gt;***  | getData() | The method to get the list of obtained ***MassUpdateResponse*** instances  |
| ***void*** | setData(***List&lt;[MassUpdateResponse](../../src/main/java/com/zoho/crm/api/record/MassUpdateResponse.java)&gt;*** data) | The method to set the list of obtained ***MassUpdateResponse*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/record/MassUpdateResponse.java)

## MassUpdateSuccessResponse

After a successful MassUpdate request, an instance of [MassUpdateSuccessResponse](../../src/main/java/com/zoho/crm/api/record/MassUpdateSuccessResponse.java) is returned.

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

[source](../../src/main/java/com/zoho/crm/api/record/MassUpdateSuccessResponse.java)

## Participants

Structure representing the properties of a [Participant](../../src/main/java/com/zoho/crm/api/record/Participants.java).

### Methods

| Return Type   | Method                            |  Description                                              |
| :------------ | :-------------------------------- | :-------------------------------------------------------- |
| ***String***  | getName()                         | The method to get the value of ***Participants Name***    |
| ***void***    | setName(***String*** name)        | The method to set the value of ***Participants Name***    |
| ***String***  | getEmail()                        | The method to get the value of ***Participants Email***   |
| ***void***    | setEmail(***String*** email)      | The method to set the value of ***Participants Email***   |
| ***Boolean*** | getInvited()                      | The method to get the value of ***Participants Invited*** |
| ***void***    | setInvited(***Boolean*** invited) | The method to set the value of ***Participants Invited*** |
| ***String***  | getType()                         | The method to get the value of ***Participants Type***    |
| ***void***    | setType(***String*** type)        | The method to set the value of ***Participants Type***    |
| ***String***  | getParticipant()                  | The method to get the value of ***Participants Participant*** |
| ***void***    | setParticipant(***String*** participant) | The method to set the value of ***Participants Participant*** |
| ***String***  | getStatus()                       | The method to get the value of ***Participants Status***  |
| ***void***    | setStatus(***String*** status)    | The method to set the value of ***Participants Status***  |
----

[source](../../src/main/java/com/zoho/crm/api/record/Participants.java)

## PricingDetails

Structure representing the properties of [PricingDetail](../../src/main/java/com/zoho/crm/api/record/PricingDetails.java).

### Methods

| Return Type   | Method                                |  Description                                                  |
| :------------ | :------------------------------------ | :------------------------------------------------------------ |
| ***String***  | getToRange()                          | The method to get the value of ***PricingDetails ToRange***   |
| ***void***    | setToRange(***String*** toRange)      | The method to set the value of ***PricingDetails ToRange***   |
| ***String***  | getDiscount()                         | The method to get the value of ***PricingDetails Discount***  |
| ***void***    | setDiscount(***String*** discount)    | The method to set the value of ***PricingDetails Discount***  |
| ***Boolean*** | getFromRange()                        | The method to get the value of ***PricingDetails FromRange*** |
| ***void***    | setFromRange(***Boolean*** fromRange) | The method to set the value of ***PricingDetails FromRange*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/PricingDetails.java)

## Record

Structure of Zoho CRM [Record](../../src/main/java/com/zoho/crm/api/record/Record.java).

### Methods

| Return Type   | Method                                             |  Description                                             |
| :------------ | :------------------------------------------------- | :------------------------------------------------------- |
| ***Long***    | getId()                                            | The method to get the value of ***Record Id*** |
| ***void***    | setId(***Long*** id)                               | The method to set the value of ***Record Id*** |
| ***[User](Users.md#user)*** | getCreatedBy()                        | The method to get the value of ***Record CreatedBy*** |
| ***void***    | setCreatedBy(***[User](Users.md#user)*** createdBy) | The method to set the value of ***Record CreatedBy*** |
| ***OffsetDateTime*** | getCreatedTime()                            | The method to get the value of ***Record CreatedTime*** |
| ***void***    | setCreatedTime(***OffsetDateTime*** createdTime)   | The method to set the value of ***Record CreatedTime*** |
| ***[User](Users.md#user)*** | getModifiedBy()                       | The method to get the value of ***Record ModifiedBy*** |
| ***void***    | setModifiedBy(***[User](Users.md#user)*** modifiedBy) | The method to set the value of ***Record ModifiedBy*** |
| ***OffsetDateTime*** | getModifiedTime()                           | The method to get the value of ***Record ModifiedTime*** |
| ***void***    | setModifiedTime(***OffsetDateTime*** modifiedTime) | The method to set the value of ***Record ModifiedTime*** |
| ***List&lt;[Tag](Tag.md#tag)&gt;*** | getTag()                     | The method to get the value of ***Record Tag*** |
| ***void***    | setTag(***List&lt;[Tag](Tag.md#tag)&gt;*** tag)    | The method to set the value of ***Record Tag*** |
| ***void***    | addFieldValue(***[Field](#field&lt;T>)&lt;T&gt;*** field, ***T*** value) | The method to add data with default fields and values |
| ***void***    | addKeyValue(***String*** apiName, ***Object*** value) | The method to add data with field APIName and value |
| ***Object***  | getKeyValue(***String*** apiName)                  | The method to obtain the value using Field's APIName |
| ***HashMap&lt;String, Object&gt;*** | getKeyValues()               | The method to obtain the field values. |
----

[source](../../src/main/java/com/zoho/crm/api/record/Record.java)

## RecordOperations

Contains methods for all possible [Record operations](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/record/ResponseHandler.java)&gt;*** | getRecord(***Long*** id, ***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get a specific record from a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/record/ActionHandler.java)&gt;*** | updateRecord(***Long*** id, ***String*** moduleAPIName, ***[BodyWrapper](#bodywrapper)*** request) | To update a specific record in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/record/ActionHandler.java)&gt;*** | deleteRecord(***Long*** id, ***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To delete a specific record from a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/record/ResponseHandler.java)&gt;*** | getRecords(***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance) | To get all records from a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/record/ActionHandler.java)&gt;*** | createRecords(***String*** moduleAPIName, ***[BodyWrapper](#bodywrapper)*** request) | To insert records in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/record/ActionHandler.java)&gt;*** | updateRecords(***String*** moduleAPIName, ***[BodyWrapper](#bodywrapper)*** request)| To update records in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/record/ActionHandler.java)&gt;*** | deleteRecords(***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance)| To delete records from a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/record/ActionHandler.java)&gt;*** | upsertRecords(***String*** moduleAPIName, ***[BodyWrapper](#bodywrapper)*** request)| To insert/update records in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[DeletedRecordsHandler](../../src/main/java/com/zoho/crm/api/record/DeletedRecordsHandler.java)&gt;*** | getDeletedRecords( ***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance, ***[HeaderMap](../HeaderMap.md#headermap)*** headerInstance)| To get the deleted records from a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ActionHandler](../../src/main/java/com/zoho/crm/api/record/ActionHandler.java)&gt;*** | searchRecords(***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance)| To search for records in a module that match certain criteria, email, phone number, or a word. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ConvertActionHandler](../../src/main/java/com/zoho/crm/api/record/ConvertActionHandler.java)&gt;*** | convertLead(***Long*** id, ***[ConvertBodyWrapper](#convertbodywrapper)*** request)| To convert records(Leads to Contacts/Deals). |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[DownloadHandler](../../src/main/java/com/zoho/crm/api/record/DownloadHandler.java)&gt;*** | getPhoto(***Long*** id, ***String*** moduleAPIName) | To get the photo of a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[FileHandler](../../src/main/java/com/zoho/crm/api/record/FileHandler.java)&gt;*** | uploadPhoto(***Long*** id, ***String*** moduleAPIName, ***[FileBodyWrapper](#filebodywrapper)*** request)| To upload a photo to a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[FileHandler](../../src/main/java/com/zoho/crm/api/record/FileHandler.java)&gt;*** | deletePhoto(***Long*** id, ***String*** moduleAPIName)| To delete the photo of a record. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[MassUpdateActionHandler](../../src/main/java/com/zoho/crm/api/record/MassUpdateActionHandler.java)&gt;*** | massUpdateRecords(***String*** moduleAPIName, ***[MassUpdateBodyWrapper](#massupdatebodywrapper)*** request)| To update the same field for multiple records in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[MassUpdateActionHandler](../../src/main/java/com/zoho/crm/api/record/MassUpdateActionHandler.java)&gt;*** | getMassUpdateStatus(***String*** moduleAPIName, ***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance)| To get the status of the mass update job scheduled previously. |
----

### Inner Static Classes

| Class                                                 |
| :---------------------------------------------------- |
| [GetRecordParam](#getrecordparam)                     |
| [GetRecordHeader](#getrecordheader)                   |
| [DeleteRecordParam](#deleterecordparam)               |
| [GetRecordsParam](#getrecordsparam)                   |
| [GetRecordsHeader](#getrecordsheader)                 |
| [DeleteRecordsParam](#deleterecordsparam)             |
| [GetDeletedRecordsParam](#getdeletedrecordsparam)     |
| [GetDeletedRecordsHeader](#getdeletedrecordsheader)   |
| [SearchRecordsParam](#searchrecordsparam)             |
| [GetMassUpdateStatusParam](#getmassupdatestatusparam) |
----

[source](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java)

## RecurringActivity

Structure representing the properties of a [RecurringActivity](../../src/main/java/com/zoho/crm/api/record/RecurringActivity.java).

### Methods

| Return Type   | Method                        |  Description                                                 |
| :------------ | :---------------------------- | :----------------------------------------------------------- |
| ***String***  | getRrule()                    | The method to get the value of ***RecurringActivity Rrule*** |
| ***void***    | setRrule(***String*** rrule)  | The method to set the value of ***RecurringActivity Rrule*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/RecurringActivity.java)

## RemindAt

Structure representing the properties of the reminder set by the user.

### Methods

| Return Type   | Method                        |  Description                                        |
| :------------ | :---------------------------- | :-------------------------------------------------- |
| ***String***  | getAlarm()                    | The method to get the value of ***RemindAt Alarm*** |
| ***void***    | setAlarm(***String*** alarm)  | The method to set the value of ***RemindAt Alarm*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/RemindAt.java)

## Reminder

Structure representing the properties of the reminder set by the user for the Participants

### Methods

| Return Type   | Method                         |  Description                                         |
| :------------ | :----------------------------- | :--------------------------------------------------- |
| ***String***  | getPeriod()                    | The method to get the value of ***Reminder Period*** |
| ***void***    | setPeriod(***String*** period) | The method to set the value of ***Reminder Period*** |
| ***String***  | getUnit()                      | The method to get the value of ***Reminder Unit***   |
| ***void***    | setUnit(***String*** unit)     | The method to set the value of ***Reminder Unit***   |
----

[source](../../src/main/java/com/zoho/crm/api/record/Reminder.java)

## ResponseWrapper

After a successful **API** request, an instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/record/ResponseWrapper.java) is returned for GET operations.

### Methods

| Return Type                      | Method                                              | Description                                                    |
| :------------------------------- | :-------------------------------------------------- | :------------------------------------------------------------- |
| ***List&lt;[Record](#record-1)&gt;***  | getData()                                     | The method to get the list of obtained ***Record*** instances. |
| ***void***                       | setData(***List&lt;[Record](#record-1)&gt;*** data) | The method to set the list of obtained ***Record*** instances. |
| ***[Info](#info)***              | getInfo()                                           | The method to get the value of ***Info*** instance.            |
| ***void***                       | setInfo(***[Info](#info)*** info)                   | The method to set the value of ***Info*** instance.            |
----

[source](../../src/main/java/com/zoho/crm/api/record/ResponseWrapper.java)

## SuccessfulConvert

After a successful Convert Lead operation, an instance of [SuccessfulConvert](../../src/main/java/com/zoho/crm/api/record/SuccessfulConvert.java) is returned.

### Methods

| Return Type   | Method                             | Description                                                     |
| :------------ | :--------------------------------- | :-------------------------------------------------------------- |
| ***String***  | getContacts()                      | The method to get the value of ***SuccessfulConvert Contacts*** |
| ***void***    | setContacts(***String*** contacts) | The method to set the value of ***SuccessfulConvert Contacts*** |
| ***String***  | getDeals()                         | The method to get the value of ***SuccessfulConvert Deals***    |
| ***void***    | setDeals(***String*** deals)       | The method to set the value of ***SuccessfulConvert Deals***    |
| ***String***  | getAccounts()                      | The method to get the value of ***SuccessfulConvert Accounts*** |
| ***void***    | setAccounts(***String*** accounts) | The method to set the value of ***SuccessfulConvert Accounts*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/SuccessfulConvert.java)

## SuccessResponse

After a successful **POST**, **PUT** or **DELETE** operation, an instance of [SuccessResponse](../../src/main/java/com/zoho/crm/api/record/SuccessResponse.java) is returned.

### Methods

| Return Type                      | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getStatus() | The method to get the value of ***status*** key in  the **API** response |
| ***void*** | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status) | The method to set the value of ***status*** key in the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getCode() | The method to get the value of ***code*** key in  the **API** response |
| ***void*** | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code) | The method to set the value of ***code*** key in  the **API** response |
| ***String*** | getDuplicateField() | The method to get the value of ***duplicate_field*** key in  the **API** response |
| ***void*** | setDuplicateField(***String*** duplicateField) | The method to set the value of ***duplicate_field*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getAction() | The method to get the value of ***action*** key in  the **API** response |
| ***void*** | setAction(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** action) | The method to set the value of ***action*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** | getMessage() | The method to get the value of ***message*** key in  the **API** response |
| ***void*** | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message) | The method to set the value of ***message*** key in  the **API** response |
| ***Map&lt;String, Object&gt;*** | getDetails() | The method to get the value of ***details*** key in  the **API** response |
| ***void*** | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response |
----

[source](../../src/main/java/com/zoho/crm/api/record/SuccessResponse.java)

## Territory

Structure representing the properties of the territory the user is associated with.

### Methods

| Return Type   | Method                                      | Description                                                 |
| :------------ | :------------------------------------------ | :---------------------------------------------------------- |
| ***Long***    | getId()                                     | The method to get the value of ***Territory Id***           |
| ***void***    | setId(***Long*** id)                      | The method to set the value of ***Territory Id***           |
| ***Boolean*** | getIncludeChild()                           | The method to get the value of ***Territory IncludeChild*** |
| ***void***    | setIncludeChild(***Boolean*** includeChild) | The method to set the value of ***Territory IncludeChild*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/Territory.java)

## Consent

Structure representing the consent properties of the record, when  privacy settings is enabled for the Org.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***Boolean*** | getContactThroughEmail() | The method to get the value of ***Consent ContactThroughEmail*** |
| ***void*** | setContactThroughEmail(***Boolean*** contactThroughEmail) | The method to set the value of ***Consent ContactThroughEmail*** |
| ***Boolean*** | getContactThroughSocial() | The method to get the value of ***Consent ContactThroughSocial*** |
| ***void*** | setContactThroughSocial(***Boolean*** contactThroughSocial) | The method to set the value of ***Consent ContactThroughSocial*** |
| ***Boolean*** | getContactThroughSurvey() | The method to get the value of ***Consent ContactThroughSurvey*** |
| ***void*** | setContactThroughSurvey(***Boolean*** contactThroughSurvey) | The method to set the value of ***Consent ContactThroughSurvey*** |
| ***Boolean*** | getContactThroughPhone() | The method to get the value of ***Consent ContactThroughPhone*** |
| ***void*** | setContactThroughPhone(***Boolean*** contactThroughPhone) | The method to set the value of ***Consent ContactThroughPhone*** |
| ***OffsetDateTime*** | getMailSentTime() | The method to get the value of ***Consent MailSentTime*** |
| ***void*** | setMailSentTime(***OffsetDateTime*** mailSentTime) | The method to set the value of ***Consent MailSentTime*** |
| ***[LocalDate](time.md#localdate)*** | getConsentDate() | The method to get the value of ***Consent ConsentDate*** |
| ***void*** | setConsentDate(***[LocalDate](time.md#localdate)*** consentDate) | The method to set the value of ***Consent ConsentDate*** |
| ***String*** | getConsentRemarks() | The method to get the value of ***Consent ConsentRemarks*** |
| ***void*** | setConsentRemarks(***String*** consentRemarks) | The method to set the value of ***Consent ConsentRemarks*** |
| ***String*** | getConsentThrough() | The method to get the value of ***Consent ConsentThrough*** |
| ***void*** | setConsentThrough(***String*** consentThrough) | The method to set the value of ***Consent ConsentThrough*** |
| ***String*** | getDataProcessingBasis() | The method to get the value of ***Consent DataProcessingBasis*** |
| ***void*** | setDataProcessingBasis(***String*** dataProcessingBasis) | The method to set the value of ***Consent DataProcessingBasis*** |
----

[source](../../src/main/java/com/zoho/crm/api/record/Consent.java)

## GetRecordParam

Contains all possible parameters for the [Get Record operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                         | Field          | Description                          |
| :------------------------------------------------------------------------ | :------------- | :----------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  APPROVED      | Represents `approved` parameter      |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  CONVERTED     | Represents `converted` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  CVID          | Represents `cvid` parameter          |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  UID           | Represents `uid` parameter           |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  FIELDS        | Represents `fields` parameter        |
| ***static final [Param](../Param.md#param&lt;t>)&lt;OffsetDateTime&gt;*** |  STARTDATETIME | Represents `startDateTime` parameter |
| ***static final [Param](../Param.md#param&lt;t>)&lt;OffsetDateTime&gt;*** |  ENDDATETIME   | Represents `endDateTime` parameter   |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  TERRITORY_ID  | Represents `territory_id` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  INCLUDE_CHILD | Represents `include_child` parameter |
----

## GetRecordHeader

Contains all possible headers for the [Get Record operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                            | Field                | Description                              |
| :--------------------------------------------------------------------------- | :------------------- | :--------------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** | IF_MODIFIED_SINCE    | Represents `If-Modified-Since` parameter |
----

## DeleteRecordParam

Contains all possible parameters for the [Delete Record operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                  | Field          | Description                       |
| :----------------------------------------------------------------- | :------------- | :-------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** |  WF_TRIGGER    | Represents `wf_trigger` parameter |
----

## GetRecordsParam

Contains all possible parameters for the [Get Records operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                         | Field          | Description                          |
| :------------------------------------------------------------------------ | :------------- | :----------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  APPROVED      | Represents `approved` parameter      |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  CONVERTED     | Represents `converted` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  CVID          | Represents `cvid` parameter          |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;***           |  IDS           | Represents `ids` parameter           |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  UID           | Represents `uid` parameter           |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  FIELDS        | Represents `fields` parameter        |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  SORT_BY       | Represents `sort_by` parameter       |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  SORT_ORDER    | Represents `sort_order` parameter    |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;***        |  PAGE          | Represents `page` parameter          |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;***        |  PER_PAGE      | Represents `per_page` parameter      |
| ***static final [Param](../Param.md#param&lt;t>)&lt;OffsetDateTime&gt;*** |  STARTDATETIME | Represents `startDateTime` parameter |
| ***static final [Param](../Param.md#param&lt;t>)&lt;OffsetDateTime&gt;*** |  ENDDATETIME   | Represents `endDateTime` parameter   |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  TERRITORY_ID  | Represents `territory_id` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***         |  INCLUDE_CHILD | Represents `include_child` parameter |
----

## GetRecordsHeader

Contains all possible headers for the [Get Records operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                            | Field             | Description                              |
| :--------------------------------------------------------------------------- | :---------------- | :--------------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** | IF_MODIFIED_SINCE | Represents `If-Modified-Since` parameter |
----

## DeleteRecordsParam

Contains all possible parameters for the [Delete Records operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                  | Field         | Description                       |
| :----------------------------------------------------------------- | :------------ | :-------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Long&gt;***    | IDS           | Represents `ids` parameter        |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | WF_TRIGGER    | Represents `wf_trigger` parameter |
----

## GetDeletedRecordsParam

Contains all possible parameters for the [Get Deleted Records operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                  | Field     | Description                     |
| :----------------------------------------------------------------- | :-------- | :------------------------------ |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  |  TYPE     | Represents `type` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** |  PAGE     | Represents `page` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** |  PER_PAGE | Represents `per_page` parameter |
----

## GetDeletedRecordsHeader

Contains all possible headers for the [Get Deleted Records operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                            | Field             | Description                              |
| :--------------------------------------------------------------------------- | :---------------- | :--------------------------------------- |
| ***static final [Header](../Header.md#header&lt;t>)&lt;OffsetDateTime&gt;*** | IF_MODIFIED_SINCE | Represents `If-Modified-Since` parameter |
----

## SearchRecordsParam

Contains all possible parameters for the [Search Records operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                  | Field     | Description                      |
| :----------------------------------------------------------------- | :-------- | :------------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | CRITERIA  | Represents `criteria` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | EMAIL     | Represents `email` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | PHONE     | Represents `phone` parameter     |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | WORD      | Represents `word` parameter      |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | CONVERTED | Represents `converted` parameter |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | APPROVED  | Represents `approved` parameter  |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PAGE      | Represents `page` parameter      |
| ***static final [Param](../Param.md#param&lt;t>)&lt;Integer&gt;*** | PER_PAGE  | Represents `per_page` parameter  |
----

## GetMassUpdateStatusParam

Contains all possible parameters for the [Get Mass UpdateStatus operation](../../src/main/java/com/zoho/crm/api/record/RecordOperations.java).

### Fields

| Modifier and Type                                                  | Field   | Description                   |
| :----------------------------------------------------------------- | :------ | :---------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;***  | JOB_ID  | Represents `job_id` parameter |
----
