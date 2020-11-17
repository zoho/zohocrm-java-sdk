# ModuleFieldsHandler

The class contains the methods to manipulate the fields of all the modules.

## Package com.zoho.crm.api.util

## Static Methods

| Return Type | Method                | Description                                                      |
| :---------- | :-------------------- | :--------------------------------------------------------------- |
| ***void***  | deleteFieldsFile()    | The method to delete fields JSON File of the current user.       |
| ***void***  | deleteAllFieldFiles() | The method to delete all the field JSON files under the resources directory. |
| ***void***  | refreshFields(***String*** module) | The method to force-refresh fields of a module.     |
| ***void***  | refreshAllModules()   | The method to force-refresh fields of all the available modules. |
----

[source](../../src/main/java/com/zoho/crm/api/util/ModuleFieldsHandler.java)
