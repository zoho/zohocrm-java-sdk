package samples.src.com.zoho.crm.api.blueprint;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.blueprint.APIException;

import com.zoho.crm.api.blueprint.ActionResponse;

import com.zoho.crm.api.fields.AutoNumber;

import com.zoho.crm.api.blueprint.BluePrintOperations;

import com.zoho.crm.api.blueprint.BodyWrapper;

import com.zoho.crm.api.fields.Field;

import com.zoho.crm.api.fields.MultiSelectLookup;

import com.zoho.crm.api.fields.PickListValue;

import com.zoho.crm.api.fields.ToolTip;

import com.zoho.crm.api.fields.ViewType;

import com.zoho.crm.api.layouts.Layout;

import com.zoho.crm.api.blueprint.NextTransition;

import com.zoho.crm.api.blueprint.ProcessInfo;

import com.zoho.crm.api.blueprint.ResponseHandler;

import com.zoho.crm.api.blueprint.ResponseWrapper;

import com.zoho.crm.api.blueprint.SuccessResponse;

import com.zoho.crm.api.blueprint.Transition;

import com.zoho.crm.api.blueprint.ValidationError;

import com.zoho.crm.api.record.Record;

import com.zoho.crm.api.users.User;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class BluePrint
{
	/**
	 * <h3> Get Blueprint </h3>
	 * This method is used to get a single record's Blueprint details with ID and print the response.
	 * @param moduleAPIName The API Name of the record's module
	 * @param recordId The ID of the record to get Blueprint
	 * @throws Exception
	 */
	public static void getBlueprint(String moduleAPIName, Long recordId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000004381002l;
		
		//Get instance of BluePrintOperations Class that takes recordId and moduleAPIName as parameter
		BluePrintOperations bluePrintOperations = new BluePrintOperations(recordId, moduleAPIName);
		
		//Call getBlueprint method
		APIResponse<ResponseHandler> response = bluePrintOperations.getBlueprint();
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			if(Arrays.asList(204,304).contains(response.getStatusCode()))
			{
				System.out.println(response.getStatusCode() == 204? "No Content" : "Not Modified");
				
				return;
			}
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ResponseHandler responseHandler = response.getObject();
				
				if(responseHandler instanceof ResponseWrapper)
				{
					//Get the received ResponseWrapper instance
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the obtained BluePrint instance
					com.zoho.crm.api.blueprint.BluePrint bluePrint = responseWrapper.getBlueprint();
				
					//Get the ProcessInfo instance of the obtained BluePrint
					ProcessInfo processInfo = bluePrint.getProcessInfo();
					
					//Check if ProcessInfo is not null
					if(processInfo != null)
					{
						//Get the Field ID of the ProcessInfo
						System.out.println("ProcessInfo Field-ID: " + processInfo.getFieldId());
						
						//Get the isContinuous of the ProcessInfo
						System.out.println("ProcessInfo isContinuous: " + processInfo.getIsContinuous());
						
						//Get the API Name of the ProcessInfo
						System.out.println("ProcessInfo API Name: " + processInfo.getAPIName());
						
						//Get the Continuous of the ProcessInfo
						System.out.println("ProcessInfo Continuous: " + processInfo.getContinuous());
						
						//Get the FieldLabel of the ProcessInfo
						System.out.println("ProcessInfo FieldLabel: " + processInfo.getFieldLabel());
						
						//Get the Name of the ProcessInfo
						System.out.println("ProcessInfo Name: " + processInfo.getName());
						
						//Get the ColumnName of the ProcessInfo
						System.out.println("ProcessInfo ColumnName: " + processInfo.getColumnName());
						
						//Get the FieldValue of the ProcessInfo
						System.out.println("ProcessInfo FieldValue: " + processInfo.getFieldValue());
						
						//Get the ID of the ProcessInfo
						System.out.println("ProcessInfo ID: " + processInfo.getId());
						
						//Get the FieldName of the ProcessInfo
						System.out.println("ProcessInfo FieldName: " + processInfo.getFieldName());
					}
					
					//Get the list of transitions from BluePrint instance
					List<Transition> transitions = bluePrint.getTransitions();
					
					for(Transition transition : transitions)
					{
						
						List<NextTransition> nextTransitions = transition.getNextTransitions();
						
						for(NextTransition nextTransition : nextTransitions)
						{
							//Get the ID of the NextTransition
							System.out.println("NextTransition ID: " + nextTransition.getId());
							
							//Get the Name of the NextTransition
							System.out.println("NextTransition Name: " + nextTransition.getName());
						}
						
						//Get the PercentPartialSave of each Transition
						System.out.println("Transition PercentPartialSave: " + transition.getPercentPartialSave());
						
						Record data = transition.getData();
						
						//Get the ID of each record
						System.out.println("Record ID: " + data.getId());
						
						//Get the createdBy User instance of each record
						User createdBy = data.getCreatedBy();
						
						if(createdBy != null)
						{
							//Get the ID of the createdBy User
							System.out.println("Record Created By User-ID: " + createdBy.getId());
							
							//Get the name of the createdBy User
							System.out.println("Record Created By User-Name: " + createdBy.getName());
						}
						
						//Check if the created time is not null
						if(data.getCreatedTime() != null)
						{
							//Get the created time of each record
							System.out.println("Record Created Time: " + data.getCreatedTime().toString());
						}
						
						//Check if the modified time is not null
						if(data.getModifiedTime() != null)
						{
							//Get the modified time of each record
							System.out.println("Record Modified Time: " + data.getModifiedTime().toString());
						}
						
						//Get the modifiedBy User instance of each record
						User modifiedBy = data.getModifiedBy();
	
						//Check if modifiedByUser is not null
						if(modifiedBy != null)
						{
							//Get the ID of the modifiedBy User
							System.out.println("Record Modified By User-ID: " + modifiedBy.getId());
							
							//Get the name of the modifiedBy User
							System.out.println("Record Modified By user-Name: " + modifiedBy.getName());
						}
						
						//Get all entries from the keyValues map
						for(Map.Entry<String, Object>entry : data.getKeyValues().entrySet())
						{
							//Get each value from the map
							System.out.println(entry.getKey() + ": " + entry.getValue());
						}
						
						//Get the NextFieldValue of the Transition
						System.out.println("Transition NextFieldValue: " + transition.getNextFieldValue());
						
						//Get the Name of each Transition
						System.out.println("Transition Name: " + transition.getName());
						
						//Get the CriteriaMatched of the Transition
						System.out.println("Transition CriteriaMatched: " + transition.getCriteriaMatched().toString());
						
						//Get the ID of the Transition
						System.out.println("Transition ID: " + transition.getId());
						
						System.out.println("Transition Fields: ");
						
						List<Field> fields = transition.getFields();
						
						for(Field field : fields)
						{
							//Get the webhook of each Field
							System.out.println("Transition Fields Webhook: " + field.getWebhook());
							
							//Get the JsonType of each Field
							System.out.println("Transition Fields JsonType: " + field.getJsonType());
							
							//Get the DisplayLabel of each Field
							System.out.println("Transition Fields DisplayLabel: " + field.getDisplayLabel());
							
							//Get the ValidationRule of each Field
							System.out.println("Transition Fields ValidationRule: " + field.getValidationRule());
							
							//Get the DataType of each Field
							System.out.println("Transition Fields DataType: " + field.getDataType());
							
							//Get the Type of each Field
							System.out.println("Transition Fields Type: " + field.getType());
							
							//Get the ColumnName of each Field
							System.out.println("Transition Fields ColumnName: " + field.getColumnName());
							
							//Get the PersonalityName of each Field
							System.out.println("Transition Fields PersonalityName: " + field.getPersonalityName());
							
							//Get the ID of each Field
							System.out.println("Transition Fields ID: " + field.getId());
							
							//Get the TransitionSequence of each Field
							System.out.println("Transition Fields TransitionSequence: " + field.getTransitionSequence().toString());
							
							if(field.getMandatory() != null)
							{
								//Get the Mandatory of each Field
								System.out.println("Transition Fields Mandatory: " + field.getMandatory().toString());
							}
							
							Layout layout = field.getLayouts();
							
							if(layout != null)
							{
								//Get the ID of the Layout
								System.out.println("Transition Fields Layout ID: " + layout.getId());
								
								//Get the name of the Layout
								System.out.println("Transition Fields Layout Name: " + layout.getName());
							}
							
							//Get the APIName of each Field
							System.out.println("Transition Fields APIName: " + field.getAPIName());
							
							//Get the Content of each Field
							System.out.println("Transition Fields Content: " + field.getContent());
							
							if(field.getSystemMandatory() != null)
							{
								//Get the SystemMandatory of each Field
								System.out.println("Transition Fields SystemMandatory: " + field.getSystemMandatory().toString());
							}
							
							//Get the Crypt of each Field
							System.out.println("Transition Fields Crypt: " + field.getCrypt());
							
							//Get the FieldLabel of each Field
							System.out.println("Transition Fields FieldLabel: " + field.getFieldLabel());
							
							//Get the Tooltip of each Field
							ToolTip toolTip = field.getTooltip();
							
							if(toolTip != null)
							{
								//Get the Tooltip Name
								System.out.println("Transition Fields Tooltip Name: " + toolTip.getName());
								
								//Get the Tooltip Value
								System.out.println("Transition Fields Tooltip Value: " + toolTip.getValue());
							}
							
							//Get the CreatedSource of each Field
							System.out.println("Transition Fields CreatedSource: " + field.getCreatedSource());
							
							if(field.getFieldReadOnly() != null)
							{
								//Get the FieldReadOnly of each Field
								System.out.println("Transition Fields FieldReadOnly: " + field.getFieldReadOnly().toString());
							}
							
							if(field.getReadOnly() != null)
							{
								//Get the ReadOnly of each Field
								System.out.println("Transition Fields ReadOnly: " + field.getReadOnly().toString());
							}
							
							//Get the AssociationDetails of each Field
							System.out.println("Transition Fields AssociationDetails: " + field.getAssociationDetails());
							
							if(field.getQuickSequenceNumber() != null)
							{
								//Get the QuickSequenceNumber of each Field
								System.out.println("Transition Fields QuickSequenceNumber: " + field.getQuickSequenceNumber().toString());
							}
							
							if(field.getCustomField() != null)
							{
								//Get the CustomField of each Field
								System.out.println("Transition Fields CustomField: " + field.getCustomField().toString());
							}
							
							if(field.getVisible() != null)
							{
								//Get the Visible of each Field
								System.out.println("Transition Fields Visible: " + field.getVisible().toString());
							}
							
							if(field.getLength() != null)
							{
								//Get the Length of each Field
								System.out.println("Transition Fields Length: " + field.getLength().toString());
							}
							
							//Get the DecimalPlace of each Field
							System.out.println("Transition Fields DecimalPlace: " + field.getDecimalPlace());
							
							ViewType viewType = field.getViewType();
							
							if(viewType != null)
							{
								//Get the View of the ViewType
								System.out.println("Transition Fields ViewType View: " + viewType.getView().toString());
								
								//Get the Edit of the ViewType
								System.out.println("Transition Fields ViewType Edit: " + viewType.getEdit().toString());
								
								//Get the Create of the ViewType
								System.out.println("Transition Fields ViewType Create: " + viewType.getCreate().toString());
								
								//Get the View of the ViewType
								System.out.println("Transition Fields ViewType QuickCreate: " + viewType.getQuickCreate().toString());
							}
							
							List<PickListValue> pickListValues = field.getPickListValues();
							
							if(pickListValues != null)
							{
								for(PickListValue pickListValue : pickListValues)
								{
									//Get the DisplayValue of each PickListValues
									System.out.println("Transition Fields PickListValue DisplayValue: " + pickListValue.getDisplayValue());
									
									//Get the SequenceNumber of each PickListValues
									System.out.println("Transition Fields PickListValue SequenceNumber: " + pickListValue.getSequenceNumber().toString());
									
									//Get the ExpectedDataType of each PickListValues
									System.out.println("Transition Fields PickListValue ExpectedDataType: " + pickListValue.getExpectedDataType());
									
									//Get the ActualValue of each PickListValues
									System.out.println("Transition Fields PickListValue ActualValue: " + pickListValue.getActualValue());
									
									for(Object map : pickListValue.getMaps())
									{
										//Get each value from the map
										System.out.println(map);
									}
								}
							}
							
							//Get all entries from the MultiSelectLookup instance
							MultiSelectLookup multiSelectLookup = field.getMultiselectlookup();
							
							if(multiSelectLookup != null)
							{
								//Get the DisplayValue of the MultiSelectLookup
								System.out.println("Transition Fields MultiSelectLookup DisplayLabel: " + multiSelectLookup.getDisplayLabel());
								
								//Get the LinkingModule of the MultiSelectLookup
								System.out.println("Transition Fields MultiSelectLookup LinkingModule: " + multiSelectLookup.getLinkingModule());
								
								//Get the LookupApiname of the MultiSelectLookup
								System.out.println("Transition Fields MultiSelectLookup LookupApiname: " + multiSelectLookup.getLookupApiname());
								
								//Get the APIName of the MultiSelectLookup
								System.out.println("Transition Fields MultiSelectLookup APIName: " + multiSelectLookup.getAPIName());
								
								//Get the ConnectedlookupApiname of the MultiSelectLookup
								System.out.println("Transition Fields MultiSelectLookup ConnectedlookupApiname: " + multiSelectLookup.getConnectedlookupApiname());
								
								//Get the ID of the MultiSelectLookup
								System.out.println("Transition Fields MultiSelectLookup ID: " + multiSelectLookup.getId());
							}
							
							//Get the AutoNumber of each Field
							AutoNumber autoNumber = field.getAutoNumber();
							
							if(autoNumber != null)
							{
								//Get the Prefix of the AutoNumber
								System.out.println("Transition Fields AutoNumber Prefix: " + autoNumber.getPrefix());
								
								//Get the Suffix of the AutoNumber
								System.out.println("Transition Fields AutoNumber Suffix: " + autoNumber.getSuffix());
								
								if(autoNumber.getStartNumber() != null)
								{
									//Get the StartNumber of the AutoNumber
									System.out.println("Transition Fields Auto StartNumber: " + autoNumber.getStartNumber().toString());
								}
							}
							
							//Get the ConvertMapping of each Field
							System.out.println("Transition Fields ConvertMapping: ");
							
							if(field.getConvertMapping() != null) 
							{
								//Get all entries from the ConvertMapping
								for(Map.Entry<String, Object>entry : field.getConvertMapping().entrySet())
								{
									//Get each value from the map
									System.out.println(entry.getKey() + ": " + entry.getValue());
								}
							}
						}
						
						//Get the CriteriaMessage of each Transition
						System.out.println("Transition CriteriaMessage: " + transition.getCriteriaMessage());
					}
				}
				//Check if the request returned an exception
				else if(responseHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) responseHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Update Blueprint </h3>
	 * This method is used to update a single record's Blueprint details with ID and print the response.
	 * @param moduleAPIName The API Name of the record's module
	 * @param recordId The ID of the record to get Blueprint
	 * @param transitionId The ID of the Blueprint transition Id
	 * @throws Exception
	 */
	public static void updateBlueprint(String moduleAPIName, Long recordId, Long transitionId) throws Exception
	{
		//ID of the BluePrint to be updated
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000004381002l;
		//Long transitionId = 3477061000000173096l;
				
		//Get instance of BluePrintOperations Class that takes recordId and moduleAPIName as parameter
		BluePrintOperations bluePrintOperations = new BluePrintOperations(recordId, moduleAPIName);
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of BluePrint instances
		List<com.zoho.crm.api.blueprint.BluePrint> bluePrintList = new ArrayList<com.zoho.crm.api.blueprint.BluePrint>();

		//Get instance of BluePrint Class
		com.zoho.crm.api.blueprint.BluePrint bluePrint = new com.zoho.crm.api.blueprint.BluePrint();
		
		//Set transition_id to the BluePrint instance
		bluePrint.setTransitionId(transitionId);
		
		//Get instance of Record Class
		Record data = new Record();
		
		HashMap<String, Object> lookup = new HashMap<String, Object>();
		
		lookup.put("Phone", "8940372937");
		
		lookup.put("id", "8940372937");
		
//		data.addKeyValue("Lookup_2", lookup);
		
		data.addKeyValue("Phone", "8940372937");
		
		data.addKeyValue("Notes", "Updated via blueprint");
		
		HashMap<String, Object> attachments = new HashMap<String, Object>();
		
		ArrayList<String> fileIds = new ArrayList<String>();
		
		fileIds.add("blojtd2d13b5f044e4041a3315e0793fb21ef");
		
		attachments.put("$file_id", fileIds);
		
		data.addKeyValue("Attachments", attachments);
		
		ArrayList<HashMap<String, Object>> checkLists = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> checkListItem = new HashMap<String, Object>();
		
		checkListItem.put("list 1", true);
		
		checkLists.add(checkListItem);
		
		checkListItem = new HashMap<String, Object>();
		
		checkListItem.put("list 2", true);
		
		checkLists.add(checkListItem);
		
		checkListItem = new HashMap<String, Object>();
		
		checkListItem.put("list 3", true);
		
		checkLists.add(checkListItem);
		
		data.addKeyValue("CheckLists", checkLists);
		
		//Set data to the BluePrint instance
		bluePrint.setData(data);
		
		//Add BluePrint instance to the list
		bluePrintList.add(bluePrint);
		
		//Set the list to bluePrint in BodyWrapper instance
		bodyWrapper.setBlueprint(bluePrintList);
		
		//Call updateBluePrint method that takes BodyWrapper instance 
		APIResponse<ActionResponse> response = bluePrintOperations.updateBlueprint(bodyWrapper);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionResponse actionResponse = response.getObject();
				
				//Check if the request is successful
				if(actionResponse instanceof SuccessResponse)
				{
					//Get the received SuccessResponse instance
					SuccessResponse successResponse = (SuccessResponse)actionResponse;
					
					//Get the Status
					System.out.println("Status: " + successResponse.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + successResponse.getCode().getValue());
					
					System.out.println("Details: " );
					
					if(successResponse.getDetails() != null)
					{
						//Get the details map
						for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
						{
							//Get each value in the map
							System.out.println(entry.getKey() + ": " + entry.getValue());
						}
					}
					
					//Get the Message
					System.out.println("Message: " + successResponse.getMessage().getValue());
				}
				//Check if the request returned an exception
				else if(actionResponse instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionResponse;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": ");
						
						if(entry.getValue() instanceof List)
						{
							@SuppressWarnings("unchecked")
							List<ValidationError> validationError = (List<ValidationError>) entry.getValue();
							
							for(ValidationError error : validationError)
							{
								System.out.println("Field APIName " + error.getAPIName() + " : " + error.getMessage());
							}
						}
						else
						{
							System.out.println(entry.getValue().toString());
						}
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
}
