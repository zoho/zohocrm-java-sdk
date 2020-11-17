# Fields

## Package com.zoho.crm.api.fields

The Zoho CRM [Fields Meta Data API](https://www.zoho.com/crm/developer/docs/api/field-meta.html) reference provides information about the possible operations on **Fields**.

## Classes

| Class                                     | Implementing Interfaces |
|:----------------------------------------- | :---------------------- |
| [APIException](#apiexception)             | Model, ResponseHandler  |
| [AssociationDetails](#associationdetails) | Model                   |
| [AutoNumber](#autonumber)                 | Model                   |
| [Crypt](#crypt)                           | Model                   |
| [Currency](#currency)                     | Model                   |
| [Field](#field)                           | Model                   |
| [FieldsOperations](#fieldsoperations)     |                         |
| [Formula](#formula)                       | Model                   |
| [LookupField](#lookupfield)               | Model                   |
| [Module](#module)                         | Model                   |
| [MultiSelectLookup](#multiselectlookup)   | Model                   |
| [PickListValue](#picklistvalue)           | Model                   |
| [RelatedDetails](#relateddetails)         | Model                   |
| [ResponseWrapper](#responsewrapper)       | Model, ResponseHandler  |
| [ToolTip](#tooltip)                       | Model                   |
| [Unique](#unique)                         | Model                   |
| [ViewType](#viewtype)                     | Model                   |
| [Private](#private) | Model |  |

----

## APIException

Whenever the **API** returns an error response, an instance of [APIException](../../src/main/java/com/zoho/crm/api/fields/APIException.java) is returned for all operations.

### Methods

| Return Type                | Method                                        | Description                                                    |
| :------------------------------- | :-------------------------------------------  | :------------------------------------------------------------- |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***    | getStatus()                                   | The method to get the value of ***status*** key in  the **API** response |
| ***void***                      | setStatus(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** status)        | The method to set the value of ***status*** key in  the **API** response |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***      | getCode()                                     | The method to get the value of ***code*** key in  the **API** response   |
| ***void***                      | setCode(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** code)            | The method to set the value of ***code*** key in  the **API** response   |
| ***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;***                      | getMessage()                                  | The method to get the value of ***message*** key in  the **API** response|
| ***void***                      | setMessage(***[Choice](../util/Choice.md#choice&lt;t>)&lt;String&gt;*** message)      | The method to get the value of ***message*** key in  the **API** response|
| ***Map&lt;String, Object&gt;*** | getDetails()                                  | The method to get the value of ***details*** key in  the **API** response|
| ***void***                      | setDetails(***Map&lt;String, Object&gt;*** details) | The method to set the value of ***details*** key in  the **API** response|

----
[source](../../src/main/java/com/zoho/crm/api/fields/APIException.java)

## AssociationDetails

Structure representing the Field's association details.

### Methods

| Return Type                        | Method                                                         |  Description                                           |
| :--------------------------------- | :--------------------------------------------------------------| :----------------------------------------------------- |
| ***[LookupField](#lookupfield)*** | getLookupField()                                               | The method to get the value of ***AssociationDetails LookupField***  |
| ***void***                         | setLookupField(***[LookupField](#lookupfield)*** lookupField) | The method to set the value of ***AssociationDetails LookupField***  |
| ***[LookupField](#lookupfield)*** | getRelatedField()                                              | The method to get the value of ***AssociationDetails RelatedField*** |
| ***void***                         | setRelatedField(***[LookupField](#lookupfield)*** lookupField)| The method to set the value of ***AssociationDetails RelatedField*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/AssociationDetails.java)

## AutoNumber

Structure representing the properties of an [auto-number](../../src/main/java/com/zoho/crm/api/fields/AutoNumber.java) field

### Methods

| Return Type   | Method                                    |  Description                                             |
| :------------ | :---------------------------------------- | :------------------------------------------------------- |
| ***String***  | getPrefix()                               | The method to get the value of ***AutoNumber Prefix***   |
| ***void***    | setPrefix(***String*** prefix)            | The method to set the value of ***AutoNumber Prefix***   |
| ***String***  | getSuffix()                               | The method to get the value of ***AutoNumber Suffix***   |
| ***void***    | setSuffix(***String*** suffix)            | The method to set the value of ***AutoNumber Suffix***   |
| ***Integer*** | getStartNumber()                          | The method to get the value of ***StartNumber***         |
| ***void***    | setStartNumber(***Integer*** startNumber) | The method to set the value of ***StartNumber***         |
----

[source](../../src/main/java/com/zoho/crm/api/fields/AutoNumber.java)

## Crypt

Structure representing the properties of an encrypted field.

### Methods

| Return Type               | Method                                           |  Description                                        |
| :------------------------ | :----------------------------------------------- | :-------------------------------------------------- |
| ***String***              | getMode()                                        | The method to get the value of ***Crypt Mode***     |
| ***void***                | setMode(***String*** mode)                       | The method to set the value of ***Crypt Mode***     |
| ***String***              | getColumn()                                      | The method to get the value of ***Crypt Column***   |
| ***void***                | setColumn(***String*** column)                   | The method to set the value of ***Crypt Column*** |
| ***List&lt;String&gt;***  | getEncfldids()                                   | The method to get the value of ***Crypt Encfldids***|
| ***void***                | setEncfldids(***List&lt;String&gt;*** encfldids) | The method to set the value of ***Crypt Encfldids***|
| ***String***              | getTable()                                       | The method to get the value of ***Crypt Table***    |
| ***void***                | setTable(***String*** table)                     | The method to set the value of ***Crypt Table***  |
| ***String***              | getNotify()                                      | The method to get the value of ***Crypt Notify***   |
| ***void***                | setNotify(***String*** notify)                   | The method to set the value of ***Crypt Notify***   |
| ***Integer***             | getStatus()                                      | The method to get the value of ***Crypt Status***   |
| ***void***                | setStatus(***Integer*** status)                  | The method to set the value of ***Crypt Status***   |
----

[source](../../src/main/java/com/zoho/crm/api/fields/Crypt.java)

## Currency

Structure representing the properties of a [currency](../../src/main/java/com/zoho/crm/api/fields/Currency.java) field.

### Methods

| Return Type               | Method                                         |  Description                                                |
| :------------------------ | :--------------------------------------------- | :---------------------------------------------------------- |
| ***String***              | getRoundingOption()                            | The method to get the value of ***Currency RoundingOption***|
| ***void***                | setRoundingOption(***String*** roundingOption) | The method to set the value of ***Currency RoundingOption***|
| ***Integer***             | getPrecision()                                 | The method to get the value of ***Currency Precision***           |
| ***void***                | setPrecision(***Integer*** precision)          | The method to set the value of ***Currency Precision***           |
----

[source](../../src/main/java/com/zoho/crm/api/fields/Currency.java)

## Field

Structure of Zoho CRM [Field](../../src/main/java/com/zoho/crm/api/fields/Field.java).

### Methods

| Return Type        | Method                                       |  Description                                           |
| :----------------- | :-------------------------------------------- | :----------------------------------------------------- |
| ***Boolean***      | getSystemMandatory()                          | The method to get the value of ***Field SystemMandatory*** |
| ***void***         | setSystemMandatory(***Boolean*** systemMandatory)| The method to set the value of ***Field SystemMandatory*** |
| ***Boolean***      | getWebhook()                          | The method to get the value of ***Field Webhook*** |
| ***void***         | setWebhook(***Boolean*** webhook)| The method to set the value of ***Field Webhook*** |
| ***[Private](fields.md#private)***      | getPrivate()                          | The method to get the value of ***Field Private*** |
| ***void***         | setPrivate(***[Private](fields.md#private)*** private1)| The method to set the value of ***Field Private*** |
| ***[Layout](Layouts.md#layout)***         | getLayouts()| The method to set the value of ***Field Layout*** |
| ***void***         | setLayouts(***[Layout](Layouts.md#layout)*** layouts)| The method to set the value of ***Field Layout*** |
| ***String***       | getContent()                          | The method to get the value of ***Field Content*** |
| ***void***         | setContent(***String*** content)| The method to set the value of ***Field Content*** |
| ***String***       | getColumnName()                          | The method to get the value of ***Field ColumnName*** |
| ***void***         | setColumnName(***String*** columnName)| The method to set the value of ***Field ColumnName*** |
| ***String***       | getType()                          | The method to get the value of ***Field Type*** |
| ***void***         | setType(***String*** type)| The method to set the value of ***Field Type*** |
| ***Integer***      | getTransitionSequence()                        | The method to get the value of ***Field TransitionSequence*** |
| ***void***         | setTransitionSequence(***Integer*** transitionSequence)| The method to set the value of ***Field TransitionSequence*** |
| ***String***       | getPersonalityName()                          | The method to get the value of ***Field PersonalityName*** |
| ***void***         | setPersonalityName(***String*** personalityName)| The method to set the value of ***Field PersonalityName*** |
| ***String***       | getMessage()                          | The method to get the value of ***Field Message*** |
| ***void***         | setMessage(***String*** message)| The method to set the value of ***Field Message*** |
| ***Boolean***      | getMandatory()                          | The method to get the value of ***Field Mandatory*** |
| ***void***         | setMandatory(***Boolean*** mandatory) | The method to set the value of ***Field Mandatory*** |
| ***[Criteria](CustomViews.md#criteria)***         | getCriteria()| The method to set the value of ***Field Criteria*** |
| ***void***   | setCriteria(***[Criteria](CustomViews.md#criteria)*** criteria)| The method to set the value of ***Field Criteria*** |
| ***[RelatedDetails](#relateddetails)***   | getRelatedDetails() | The method to set the value of ***Field RelatedDetails*** |
| ***void***   | setRelatedDetails(***[RelatedDetails](#relateddetails)***  relatedDetails)| The method to set the value of ***Field RelatedDetails*** |
| ***String***       | getJsonType()                          | The method to get the value of ***Field JsonType*** |
| ***void***         | setJsonType(***String*** jsonType)| The method to set the value of ***Field JsonType*** |
| ***[Crypt](#crypt)***   | getCrypt() | The method to set the value of ***Field Crypt*** |
| ***void***   | setCrypt(***[Crypt](#crypt)***  crypt)| The method to set the value of ***Field Crypt*** |
| ***String***       | getFieldLabel()                          | The method to get the value of ***Field FieldLabel*** |
| ***void***         | setFieldLabel(***String*** fieldLabel)| The method to set the value of ***Field FieldLabel*** |
| ***[ToolTip](#tooltip)***   | getTooltip() | The method to set the value of ***Field ToolTip*** |
| ***void***   | setTooltip(***[ToolTip](#tooltip)***  tooltip)| The method to set the value of ***Field ToolTip*** |
| ***String***       | getCreatedSource()                          | The method to get the value of ***Field CreatedSource*** |
| ***void***         | setCreatedSource(***String*** createdSource)| The method to set the value of ***Field CreatedSource*** |
| ***Boolean***      | getFieldReadOnly()                          | The method to get the value of ***Field FieldReadOnly*** |
| ***void***         | setFieldReadOnly(***Boolean*** fieldReadOnly) | The method to set the value of ***Field FieldReadOnly*** |
| ***String***       | getDisplayLabel()                         | The method to get the value of ***Field DisplayLabel*** |
| ***void***         | setDisplayLabel(***String*** displayLabel)| The method to set the value of ***Field DisplayLabel*** |
| ***Boolean***      | getReadOnly()                          | The method to get the value of ***Field ReadOnly*** |
| ***void***         | setReadOnly(***Boolean*** readOnly) | The method to set the value of ***Field ReadOnly*** |
| ***[AssociationDetails](#associationdetails)***   | getAssociationDetails() | The method to set the value of ***Field AssociationDetails*** |
| ***void*** | setAssociationDetails(***[AssociationDetails](#associationdetails)***  associationDetails)| The method to set the value of ***Field AssociationDetails*** |
| ***Integer***      | getQuickSequenceNumber()                        | The method to get the value of ***Field QuickSequenceNumber*** |
| ***void***         | setQuickSequenceNumber(***Integer*** quickSequenceNumber)| The method to set the value of ***Field QuickSequenceNumber*** |
| ***Boolean***      | getBusinesscardSupported()                          | The method to get the value of ***Field BusinesscardSupported*** |
| ***void***         | setBusinesscardSupported(***Boolean*** businesscardSupported) | The method to set the value of ***Field BusinesscardSupported*** |
| ***Map&lt;String, Object&gt;***      | getMultiModuleLookup()                          | The method to get the value of ***Field MultiModuleLookup*** |
| ***void***         | setMultiModuleLookup(***Map&lt;String, Object&gt;*** multiModuleLookup) | The method to set the value of ***Field MultiModuleLookup*** |
| ***[Currency](#currency)***   | getCurrency() | The method to set the value of ***Field Currency*** |
| ***void***   | setCurrency(***[Currency](#currency)***  currency)| The method to set the value of ***Field Currency*** |
| ***Long***       | getId()                         | The method to get the value of ***Field Id*** |
| ***void***         | setId(***Long*** id)| The method to set the value of ***Field Id*** |
| ***Boolean***      | getCustomField()                          | The method to get the value of ***Field CustomField*** |
| ***void***         | setCustomField(***Boolean*** customField) | The method to set the value of ***Field CustomField*** |
| ***[Module](#module)***   | getLookup() | The method to set the value of ***Field Lookup*** |
| ***void***   | setLookup(***[Module](#module)***  lookup)| The method to set the value of ***Field Lookup*** |
| ***Boolean***      | getVisible()                      | The method to get the value of ***Field Visible*** |
| ***void***         | setVisible(***Boolean*** visible) | The method to set the value of ***Field Visible*** |
| ***Integer***      | getLength()                        | The method to get the value of ***Field Length*** |
| ***void***         | setLength(***Integer*** length)| The method to set the value of ***Field Length*** |
| ***[ViewType](#viewtype)***   | getViewType() | The method to set the value of ***Field ViewType*** |
| ***void***   | setViewType(***[ViewType](#viewtype)***  viewType)| The method to set the value of ***Field ViewType*** |
| ***[Module](#module)***   | getSubform() | The method to set the value of ***Field Subform*** |
| ***void***   | setSubform(***[Module](#module)***  subform)| The method to set the value of ***Field Subform*** |
| ***String***       | getAPIName()                         | The method to get the value of ***Field APIName*** |
| ***void***         | setAPIName(***String*** apiName)| The method to set the value of ***Field APIName*** |
| ***[Unique](#unique)***   | getUnique() | The method to set the value of ***Field Unique*** |
| ***void***   | setUnique(***[Unique](#unique)***  unique)| The method to set the value of ***Field Unique*** |
| ***Boolean***      | getHistoryTracking()                      | The method to get the value of ***Field HistoryTracking*** |
| ***void***         | setHistoryTracking(***Boolean*** historyTracking) | The method to set the value of ***Field HistoryTracking*** |
| ***String***       | getDataType()                         | The method to get the value of ***Field DataType*** |
| ***void***         | setDataType(***String*** dataType)| The method to set the value of ***Field DataType*** |
| ***[Formula](#formula)***   | getFormula() | The method to set the value of ***Field Formula*** |
| ***void***   | setFormula(***[Formula](#formula)***  formula)| The method to set the value of ***Field Formula*** |
| ***Integer***      | getDecimalPlace()                        | The method to get the value of ***Field DecimalPlace*** |
| ***void***         | setDecimalPlace(***Integer*** decimalPlace)| The method to set the value of ***Field DecimalPlace*** |
| ***Boolean***      | getMassUpdate()                      | The method to get the value of ***Field MassUpdate*** |
| ***void***         | setMassUpdate(***Boolean*** massUpdate) | The method to set the value of ***Field MassUpdate*** |
| ***Boolean***      | getBlueprintSupported()                      | The method to get the value of ***Field BlueprintSupported*** |
| ***void***         | setBlueprintSupported(***Boolean*** blueprintSupported) | The method to set the value of ***Field BlueprintSupported*** |
| ***[MultiSelectLookup](#multiselectlookup)***   | getMultiselectlookup() | The method to set the value of ***Field MultiSelectLookup*** |
| ***void***   | setMultiselectlookup(***[MultiSelectLookup](#multiselectlookup)***  multiselectlookup)| The method to set the value of ***Field MultiSelectLookup*** |
| ***List&lt;[PickListValue](#picklistvalue)&gt;***   | getPickListValues() | The method to set the value of ***Field PickListValues*** |
| ***void*** | setPickListValues(***List&lt;[PickListValue](#picklistvalue)&gt;***  pickListValues)| The method to set the value of ***Field PickListValues*** |
| ***[AutoNumber](#autonumber)***   | getAutoNumber() | The method to set the value of ***Field AutoNumber*** |
| ***void***   | setAutoNumber(***[AutoNumber](#autonumber)***  autoNumber)| The method to set the value of ***Field AutoNumber*** |
| ***String***       | getDefaultValue()                         | The method to get the value of ***Field DefaultValue*** |
| ***void***         | setDefaultValue(***String*** defaultValue)| The method to set the value of ***Field DefaultValue*** |
| ***Integer***      | getSectionId()                        | The method to get the value of ***Field SectionId*** |
| ***void***         | setSectionId(***Integer*** sectionId)| The method to set the value of ***Field SectionId*** |
| ***Map&lt;String, Object&gt;***      | getValidationRule()                          | The method to get the value of ***Field ValidationRule*** |
| ***void***         | setValidationRule(***Map&lt;String, Object&gt;*** validationRule) | The method to set the value of ***Field ValidationRule*** |
| ***Map&lt;String, Object&gt;***      | getConvertMapping()                          | The method to get the value of ***Field ConvertMapping*** |
| ***void***         | setConvertMapping(***Map&lt;String, Object&gt;*** convertMapping) | The method to set the value of ***Field ConvertMapping*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/Field.java)

## FieldsOperations

Contains methods for all possible [Fields operations](../../src/main/java/com/zoho/crm/api/fields/FieldsOperations.java).

### Constructors

| Constructor                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [FieldsOperations](../../src/main/java/com/zoho/crm/api/fields/FieldsOperations.java)(***String*** module)  |  Creates a ***FieldsOperations*** class instance with the ***module***.|
----

### Methods

| Return Type                               | Method                                          | Description                                               |
| :---------------------------------------- | :---------------------------------------------- | :-------------------------------------------------------- |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/fields/ResponseHandler.java)&gt;*** | getFields(***[ParameterMap](../ParameterMap.md#parametermap)*** paramInstance) | To get the meta details of all fields in a module. |
| ***[APIResponse](../util/APIResponse.md#apiresponse&lt;t>)&lt;[ResponseHandler](../../src/main/java/com/zoho/crm/api/fields/ResponseHandler.java)&gt;*** | getField(***Long*** id) | To get the meta details of specific field in a module. |
----

### Inner Static Classes

| Class                                |
| :----------------------------------- |
| [GetFieldsParam](#getfieldsparam)   |
----

[source](../../src/main/java/com/zoho/crm/api/fields/FieldsOperations.java)

## Formula

Structure representing the properties of a [formula](../../src/main/java/com/zoho/crm/api/fields/Formula.java) field.

### Methods

| Return Type   | Method                                |  Description                                            |
| :------------ | :------------------------------------ | :------------------------------------------------------ |
| ***String***  | getReturnType()                       | The method to get the value of ***Formula ReturnType*** |
| ***void***    | setReturnType(***String*** returnType)| The method to set the value of ***Formula ReturnType*** |
| ***String***  | getExpression()                       | The method to get the value of ***Formula Expression*** |
| ***void***    | setExpression(***String*** expression)| The method to set the value of ***Formula Expression*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/Formula.java)

## LookupField

Structure containing property of a referred field.

### Methods

| Return Type   | Method                    |  Description                                          |
| :------------ | :------------------------ | :---------------------------------------------------- |
| ***Long***    | getId()                   | The method to get the value of ***LookupField Id***   |
| ***void***    | setId(***Long*** id)      | The method to set the value of ***LookupField Id***   |
| ***String***  | getName()                 | The method to get the value of ***LookupField Name*** |
| ***void***    | setName(***String*** name)| The method to set the value of ***LookupField Name*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/LookupField.java)

## Module

Structure representing the properties of the referred [Module](../../src/main/java/com/zoho/crm/api/fields/Module.java).

### Methods

| Return Type   | Method                                    |  Description                                             |
| :------------ | :---------------------------------------- | :------------------------------------------------------- |
| ***[Layout](Layouts.md#layout)***  | getLayout()                        | The method to get the value of ***Module Layout***   |
| ***void***    | setLayout(***[Layout](Layouts.md#layout)*** layout)     | The method to set the value of ***Module Layout***   |
| ***String***  | getDisplayLabel()                         | The method to get the value of ***Module DisplayLabel*** |
| ***void***    | setDisplayLabel(***String*** displayLabel)| The method to set the value of ***Module DisplayLabel*** |
| ***String***  | getAPIName()                              | The method to get the value of ***Module APIName***      |
| ***void***    | setAPIName(***String*** apiName)          | The method to set the value of ***Module APIName***      |
| ***String***  | getModule()                               | The method to get the value of ***Module***              |
| ***void***    | setModule(***String*** module)            | The method to set the value of ***Module***              |
| ***Long***    | getId()                                   | The method to get the value of ***Module Id***           |
| ***void***    | setId(***Long*** id)                      | The method to set the value of ***Module Id***           |
| ***String***  | getModuleName()                           | The method to get the value of ***ModuleName***          |
| ***void***    | setModuleName(***String*** moduleName)    | The method to set the value of ***ModuleName***          |
----

[source](../../src/main/java/com/zoho/crm/api/fields/Module.java)

## MultiSelectLookup

Structure representing the properties of a [MultiSelectLookup](../../src/main/java/com/zoho/crm/api/fields/MultiSelectLookup.java) field.

### Methods

| Return Type   | Method                    |  Description                                                        |
| :------------ | :------------------------ | :------------------------------------------------------------------ |
| ***String***  | getDisplayLabel()         | The method to get the value of ***MultiSelectLookup DisplayLabel*** |
| ***void***    | setDisplayLabel(***String*** displayLabel) | The method to set the value of ***MultiSelectLookup DisplayLabel***   |
| ***String***  | getLinkingModule()        | The method to get the value of ***MultiSelectLookup LinkingModule*** |
| ***void***    | setLinkingModule(***String*** linkingModule)| The method to set the value of ***MultiSelectLookup LinkingModule*** |
| ***String***  | getLookupApiname()        | The method to get the value of ***MultiSelectLookup LookupApiname*** |
| ***void***    | setLookupApiname(***String*** lookupApiname)| The method to set the value of ***MultiSelectLookup LookupApiname*** |
| ***String***  | getAPIName()              | The method to get the value of ***MultiSelectLookup APIName*** |
| ***void***    | setAPIName(***String*** apiName)| The method to set the value of ***MultiSelectLookup APIName*** |
| ***String***  | getConnectedlookupApiname() | The method to get the value of ***MultiSelectLookup ConnectedlookupApiname*** |
| ***void***    | setConnectedlookupApiname(***String*** connectedlookupApiname)| The method to set the value of ***MultiSelectLookup ConnectedlookupApiname*** |
| ***Long***    | getId()                   | The method to get the value of ***MultiSelectLookup Id*** |
| ***void***    | setId(***Long*** id)      | The method to set the value of ***MultiSelectLookup Id*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/MultiSelectLookup.java)

## PickListValue

Structure representing the properties of each option in a PickList field

### Methods

| Return Type   | Method                    |  Description                                          |
| :------------ | :------------------------ | :---------------------------------------------------- |
| ***String***  | getDisplayValue()         | The method to get the value of ***PickListValue DisplayValue***                             |
| ***void***    | setDisplayValue(***String*** displayValue)     | The method to set the value of ***PickListValue DisplayValue***        |
| ***Integer*** | getSequenceNumber()       | The method to get the value of ***PickListValue SequenceNumber*** |
| ***void***    | setSequenceNumber(***Integer*** sequenceNumber)| The method to set the value of ***PickListValue SequenceNumber***      |
| ***String***  | getExpectedDataType()     | The method to get the value of ***PickListValue ExpectedDataType*** |
| ***void***    | setExpectedDataType(***String*** expectedDataType)| The method to set the value of ***PickListValue ExpectedDataType*** |
| ***List&lt;Object&gt;***  | getMaps()     | The method to get the value of ***PickListValue Maps***        |
| ***void***    | setMaps(***List&lt;Object&gt;*** maps) | The method to set the value of ***PickListValue Maps*** |
| ***String***  | getActualValue()          | The method to get the value of ***PickListValue ActualValue*** |
| ***void***    | setActualValue(***String*** actualValue)| The method to set the value of ***PickListValue ActualValue*** |
| ***String***  | getSysRefName()           | The method to get the value of ***PickListValue SysRefName***  |
| ***void***    | setSysRefName(***String*** sysRefName)    | The method to set the value of ***PickListValue SysRefName***|
| ***String***  | getType()                 | The method to get the value of ***PickListValue Type***        |
| ***void***    | setType(***String*** type)| The method to set the value of ***PickListValue Type***        |
----

[source](../../src/main/java/com/zoho/crm/api/fields/PickListValue.java)

## RelatedDetails

Structure representing the properties of field's module.

### Methods

| Return Type   | Method                    |  Description                                                  |
| :------------ | :------------------------ | :------------------------------------------------------------ |
| ***String***  | getDisplayLabel()         | The method to get the value of ***RelatedDetails DisplayLabel***  |
| ***void***    | setDisplayLabel(***String*** displayLabel)     | The method to set the value of ***RelatedDetails DisplayLabel***  |
| ***Integer*** | getAPIName()              | The method to get the value of ***RelatedDetails APIName***    |
| ***void***    | setAPIName(***Integer*** apiName)| The method to set the value of ***RelatedDetails APIName*** |
| ***[Module](#module)***  | getModule()   | The method to get the value of ***RelatedDetails Module***   |
| ***void***    | setModule(***[Module](#module)*** module)| The method to set the value of ***RelatedDetails Module*** |
| ***Long***    | getId()                   | The method to get the value of ***RelatedDetails Id***                       |
| ***void***    | setId(***Long*** id)      | The method to set the value of ***RelatedDetails Id***            |
| ***String***  | getType()                 | The method to get the value of ***PickListValue Type***        |
| ***void***    | setType(***String*** type)| The method to set the value of ***PickListValue Type***        |
----

[source](../../src/main/java/com/zoho/crm/api/fields/RelatedDetails.java)

## ResponseWrapper

After a successful **API** request, and instance of [ResponseWrapper](../../src/main/java/com/zoho/crm/api/fields/ResponseWrapper.java) is returned for GET operations

### Methods

| Return Type             | Method                       | Description                                                  |
| :--------------------------- | :---------------------- | :----------------------------------------------------------- |
| ***List&lt;[Field](#field)&gt;*** | getFields()       | The method to get the list of obtained ***Field*** instances |
| ***void***                   | setFields(***List&lt;[Field](#field)&gt;*** fields)| The method to set the list of obtained ***Field*** instances. |
----

[source](../../src/main/java/com/zoho/crm/api/fields/ResponseWrapper.java)

## ToolTip

Structure representing the properties of the field's tool tip.

### Methods

| Return Type   | Method                      |  Description                                      |
| :------------ | :------------------------   | :------------------------------------------------ |
| ***String***  | getName()                   | The method to get the value of ***ToolTip Name*** |
| ***void***    | setName(***String*** name)  | The method to set the value of ***ToolTip Name*** |
| ***String***  | getValue()                  | The method to get the value of ***ToolTip Value***|
| ***void***    | setValue(***String*** value)| The method to set the value of ***ToolTip Value***|
----

[source](../../src/main/java/com/zoho/crm/api/fields/ToolTip.java)

## Unique

Structure representing the field's properties, if the field is unique.

### Methods

| Return Type   | Method                                        |  Description                                              |
| :------------ | :-------------------------------------------- | :-------------------------------------------------------- |
| ***String***  | getCasesensitive()                            | The method to get the value of ***Unique Casesensitive*** |
| ***void***    | setCasesensitive(***String*** casesensitive)  | The method to set the value of ***Unique Casesensitive*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/Unique.java)

## ViewType

Structure representing the properties of the field's [ViewType](../../src/main/java/com/zoho/crm/api/fields/ViewType.java).

### Methods

| Return Type   | Method                                    |  Description                                              |
| :------------ | :---------------------------------------- | :-------------------------------------------------------- |
| ***Boolean*** | getView()                                 | The method to get the value of ***ViewType View***        |
| ***void***    | setView(***Boolean*** view)               | The method to set the value of ***ViewType View***        |
| ***Boolean*** | getEdit()                                 | The method to get the value of ***ViewType Edit***        |
| ***void***    | setEdit(***Boolean*** edit)               | The method to set the value of ***ViewType Edit***        |
| ***Boolean*** | getCreate()                               | The method to get the value of ***ViewType Create***      |
| ***void***    | setCreate(***Boolean*** create)           | The method to set the value of ***ViewType Create***      |
| ***Boolean*** | getQuickCreate()                          | The method to get the value of ***ViewType QuickCreate*** |
| ***void***    | setQuickCreate(***Boolean*** quickCreate) | The method to set the value of ***ViewType QuickCreate*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/ViewType.java)

## Private
Structure containing the properties of sensitive fields, when privacy settings is enabled for the Org.

### Methods

|  Return Type          | Method                     | Description                                        |
| :-------------------- | :------------------------- | :------------------------------------------------- |
| ***Boolean*** | getRestricted() | The method to get the value of ***Private Restricted*** |
| ***void*** | setRestricted(***Boolean*** restricted) | The method to set the value of ***Private Restricted*** |
| ***Boolean*** | getExport() | The method to get the value of ***Private Export*** |
| ***void*** | setExport(***Boolean*** export) | The method to set the value of ***Private Export*** |
| ***String*** | getType() | The method to get the value of ***Private Type*** |
| ***void*** | setType(***String*** type) | The method to set the value of ***Private Type*** |
----

[source](../../src/main/java/com/zoho/crm/api/fields/Private.java)

## GetFieldsParam

Contains all possible parameters for the [Get Fields operation](../../src/main/java/com/zoho/crm/api/fields/FieldsOperations.java).

### Field

| Modifier and Type                                                 | Field  | Description                 |
| :---------------------------------------------------------------- | :-----:| :-------------------------- |
| ***static final [Param](../Param.md#param&lt;t>)&lt;String&gt;*** | TYPE   | Represents `type` parameter |
----
