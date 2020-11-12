package samples.src.com.zoho.crm.api.layouts;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.fields.AssociationDetails;

import com.zoho.crm.api.fields.AutoNumber;

import com.zoho.crm.api.fields.Crypt;

import com.zoho.crm.api.fields.Currency;

import com.zoho.crm.api.fields.Field;

import com.zoho.crm.api.fields.Formula;

import com.zoho.crm.api.fields.LookupField;

import com.zoho.crm.api.fields.Module;

import com.zoho.crm.api.fields.MultiSelectLookup;

import com.zoho.crm.api.fields.PickListValue;

import com.zoho.crm.api.fields.ToolTip;

import com.zoho.crm.api.fields.Unique;

import com.zoho.crm.api.fields.ViewType;

import com.zoho.crm.api.layouts.APIException;

import com.zoho.crm.api.layouts.LayoutsOperations;

import com.zoho.crm.api.layouts.Properties;

import com.zoho.crm.api.layouts.ResponseHandler;

import com.zoho.crm.api.layouts.ResponseWrapper;

import com.zoho.crm.api.layouts.Section;

import com.zoho.crm.api.profiles.Profile;

import com.zoho.crm.api.users.User;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class Layout
{
	/**
	 * <h3> Get Layouts </h3>
	 * This method is used to get metadata about all the layouts of a module and print the response.
	 * @param moduleAPIName The API Name of the module to get layouts.
	 * @throws Exception
	 */
	public static void getLayouts(String moduleAPIName) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		
		//Get instance of LayoutsOperations Class that takes moduleAPIName as parameter
		LayoutsOperations layoutsOperations = new LayoutsOperations(moduleAPIName);
		
		//Call getLayouts method
		APIResponse<ResponseHandler> response = layoutsOperations.getLayouts();
		
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
					
					//Get the list of obtained Layout instances
					List<com.zoho.crm.api.layouts.Layout> layouts = responseWrapper.getLayouts();
				
					for(com.zoho.crm.api.layouts.Layout layout : layouts)
					{
						if(layout.getCreatedTime() != null)
						{
							//Get the CreatedTime of each Layout
							System.out.println("Layout CreatedTime: " + layout.getCreatedTime().toString());
						}
						
						//Check if ConvertMapping is not null
						if(layout.getConvertMapping() != null)
						{
							//Get the MultiModuleLookup map
							for(Map.Entry<String, Object> entry : layout.getConvertMapping().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
						}
			
						if(layout.getModifiedTime() != null)
						{
							//Get the ModifiedTime of each Layout
							System.out.println("Layout ModifiedTime: " + layout.getModifiedTime().toString());
						}
						
						//Get the Visible of each Layout
						System.out.println("Layout Visible: " + layout.getVisible().toString());
						
						//Get the createdFor User instance of each Layout
						User createdFor = layout.getCreatedFor();
						
						//Check if createdFor is not null
						if(createdFor != null)
						{
							//Get the Name of the createdFor User
							System.out.println("Layout CreatedFor User-Name: " + createdFor.getName());
							
							//Get the ID of the createdFor User
							System.out.println("Layout CreatedFor User-ID: " + createdFor.getId());
							
							//Get the Email of the createdFor User
							System.out.println("Layout CreatedFor User-Email: " + createdFor.getEmail());
						}
						
						//Get the Name of each Layout
						System.out.println("Layout Name: " + layout.getName());
						
						//Get the modifiedBy User instance of each Layout
						User modifiedBy = layout.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Layout ModifiedBy User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Layout ModifiedBy User-ID: " + modifiedBy.getId());
							
							//Get the Email of the modifiedBy User
							System.out.println("Layout ModifiedBy User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the profiles of each Layout
						List<Profile> profiles = layout.getProfiles();
						
						//Check if profiles is not null
						if(profiles != null)
						{
							for(Profile profile : profiles)
							{
								//Get the Default of each Profile
								System.out.println("Layout Profile Default: " + profile.getDefault().toString());
									
								//Get the Name of each Profile
								System.out.println("Layout Profile Name: " + profile.getName().toString());
									
								//Get the ID of each Profile
								System.out.println("Layout Profile ID: " + profile.getId().toString());
							}
						}
						
						//Get the ID of each Layout
						System.out.println("Layout ID: " + layout.getId());
						
						//Get the createdBy User instance of each Layout
						User createdBy = layout.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Layout CreatedBy User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Layout CreatedBy User-ID: " + createdBy.getId());
							
							//Get the Email of the createdBy User
							System.out.println("Layout CreatedBy User-Email: " + createdBy.getEmail());
						}
						
						//Get the sections of each Layout
						List<Section> sections = layout.getSections();
						
						//Check if sections is not null
						if(sections != null)
						{
							for(Section section : sections)
							{
								//Get the DisplayLabel of each Section
								System.out.println("Layout Section DisplayLabel: " + section.getDisplayLabel());
								
								//Get the SequenceNumber of each Section
								System.out.println("Layout Section SequenceNumber: " + section.getSequenceNumber().toString());
								
								//Get the Issubformsection of each Section
								System.out.println("Layout Section Issubformsection: " + section.getIssubformsection().toString());
								
								//Get the TabTraversal of each Section
								System.out.println("Layout Section TabTraversal: " + section.getTabTraversal().toString());
								
								//Get the APIName of each Section
								System.out.println("Layout Section APIName: " + section.getAPIName());
								
								//Get the ColumnCount of each Section
								System.out.println("Layout Section ColumnCount: " + section.getColumnCount().toString());
								
								//Get the Name of each Section
								System.out.println("Layout Section Name: " + section.getName());
								
								//Get the GeneratedType of each Section
								System.out.println("Layout Section GeneratedType: " + section.getGeneratedType());
								
								//Get the fields of each Section
								List<Field> fields = section.getFields();
								
								//Check if sections is not null
								if(fields != null)
								{
									for(Field field : fields)
									{
										printField(field);
									}
								}
								
								//Get the properties User instance of each Section
								Properties properties = section.getProperties();
								
								//Check if properties is not null
								if(properties != null)
								{
									//Get the ReorderRows of each Properties
									System.out.println("Layout Section Properties ReorderRows: " + properties.getReorderRows().toString());
									
									//Get the tooltip User instance of the Properties
									ToolTip tooltip = properties.getTooltip();
									
									//Check if tooltip is not null
									if(tooltip != null)
									{
										//Get the Name of the ToolTip
										System.out.println("Layout Section Properties ToolTip Name: " + tooltip.getName().toString());
										
										//Get the Value of the ToolTip
										System.out.println("Layout Section Properties ToolTip Value: " + tooltip.getValue().toString());
									}
									
									//Get the MaximumRows of each Properties
									System.out.println("Layout Section Properties MaximumRows: " + properties.getMaximumRows().toString());
								}
							}
						}
						
						//Get the Status of each Layout
						System.out.println("Layout Status: " + layout.getStatus());
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
	 * <h3> Get Layout </h3>
	 * This method is used to get metadata about a single layout of a module with layoutID and print the response.
	 * @param moduleAPIName The API Name of the layout's module
	 * @param layoutId The ID of the field to be obtained
	 * @throws Exception
	 */
	public static void getLayout(String moduleAPIName, Long layoutId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long layoutId = 3477061000000091055l;
		
		//Get instance of LayoutsOperations Class that takes moduleAPIName as parameter
		LayoutsOperations layoutsOperations = new LayoutsOperations(moduleAPIName);
		
		//Call getLayout method that takes layoutId as parameter
		APIResponse<ResponseHandler> response = layoutsOperations.getLayout(layoutId);
		
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
					
					//Get the list of obtained Layout instances
					List<com.zoho.crm.api.layouts.Layout> layouts = responseWrapper.getLayouts();
				
					for(com.zoho.crm.api.layouts.Layout layout : layouts)
					{
						if(layout.getCreatedTime() != null)
						{
							//Get the CreatedTime of each Layout
							System.out.println("Layout CreatedTime: " + layout.getCreatedTime().toString());
						}
						
						//Check if ConvertMapping is not null
						if(layout.getConvertMapping() != null)
						{
							//Get the MultiModuleLookup map
							for(Map.Entry<String, Object> entry : layout.getConvertMapping().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
						}
						
						if(layout.getModifiedTime() != null)
						{
							//Get the ModifiedTime of each Layout
							System.out.println("Layout ModifiedTime: " + layout.getModifiedTime().toString());
						}
						
						//Get the Visible of each Layout
						System.out.println("Layout Visible: " + layout.getVisible().toString());
						
						//Get the createdFor User instance of each Layout
						User createdFor = layout.getCreatedFor();
						
						//Check if createdFor is not null
						if(createdFor != null)
						{
							//Get the Name of the createdFor User
							System.out.println("Layout CreatedFor User-Name: " + createdFor.getName());
							
							//Get the ID of the createdFor User
							System.out.println("Layout CreatedFor User-ID: " + createdFor.getId());
							
							//Get the Email of the createdFor User
							System.out.println("Layout CreatedFor User-Email: " + createdFor.getEmail());
						}
						
						//Get the Name of each Layout
						System.out.println("Layout Name: " + layout.getName());
						
						//Get the modifiedBy User instance of each Layout
						User modifiedBy = layout.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Layout ModifiedBy User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Layout ModifiedBy User-ID: " + modifiedBy.getId());
							
							//Get the Email of the modifiedBy User
							System.out.println("Layout ModifiedBy User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the profiles of each Layout
						List<Profile> profiles = layout.getProfiles();
						
						//Check if profiles is not null
						if(profiles != null)
						{
							for(Profile profile : profiles)
							{
								//Get the Default of each Profile
								System.out.println("Layout Profile Default: " + profile.getDefault().toString());
									
								//Get the Name of each Profile
								System.out.println("Layout Profile Name: " + profile.getName().toString());
									
								//Get the ID of each Profile
								System.out.println("Layout Profile ID: " + profile.getId().toString());
							}
						}
						
						//Get the ID of each Layout
						System.out.println("Layout ID: " + layout.getId());
						
						//Get the createdBy User instance of each Layout
						User createdBy = layout.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Layout CreatedBy User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Layout CreatedBy User-ID: " + createdBy.getId());
							
							//Get the Email of the createdBy User
							System.out.println("Layout CreatedBy User-Email: " + createdBy.getEmail());
						}
						
						//Get the sections of each Layout
						List<Section> sections = layout.getSections();
						
						//Check if sections is not null
						if(sections != null)
						{
							for(Section section : sections)
							{
								//Get the DisplayLabel of each Section
								System.out.println("Layout Section DisplayLabel: " + section.getDisplayLabel());
								
								//Get the SequenceNumber of each Section
								System.out.println("Layout Section SequenceNumber: " + section.getSequenceNumber().toString());
								
								//Get the Issubformsection of each Section
								System.out.println("Layout Section Issubformsection: " + section.getIssubformsection().toString());
								
								//Get the TabTraversal of each Section
								System.out.println("Layout Section TabTraversal: " + section.getTabTraversal().toString());
								
								//Get the APIName of each Section
								System.out.println("Layout Section APIName: " + section.getAPIName());
								
								//Get the ColumnCount of each Section
								System.out.println("Layout Section ColumnCount: " + section.getColumnCount().toString());
								
								//Get the Name of each Section
								System.out.println("Layout Section Name: " + section.getName());
								
								//Get the GeneratedType of each Section
								System.out.println("Layout Section GeneratedType: " + section.getGeneratedType());
								
								//Get the fields of each Section
								List<Field> fields = section.getFields();
								
								//Check if sections is not null
								if(fields != null)
								{
									for(Field field : fields)
									{
										printField(field);
									}
								}
								
								//Get the properties User instance of each Section
								Properties properties = section.getProperties();
								
								//Check if properties is not null
								if(properties != null)
								{
									//Get the ReorderRows of each Properties
									System.out.println("Layout Section Properties ReorderRows: " + properties.getReorderRows().toString());
									
									//Get the tooltip User instance of the Properties
									ToolTip tooltip = properties.getTooltip();
									
									//Check if tooltip is not null
									if(tooltip != null)
									{
										//Get the Name of the ToolTip
										System.out.println("Layout Section Properties ToolTip Name: " + tooltip.getName().toString());
										
										//Get the Value of the ToolTip
										System.out.println("Layout Section Properties ToolTip Value: " + tooltip.getValue().toString());
									}
									
									//Get the MaximumRows of each Properties
									System.out.println("Layout Section Properties MaximumRows: " + properties.getMaximumRows().toString());
								}
							}
						}
						
						//Get the Status of each Layout
						System.out.println("Layout Status: " + layout.getStatus());
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

	private static void printField(Field field)
	{
		//Get the SystemMandatory of each Field
		System.out.println("Field SystemMandatory: " + field.getSystemMandatory().toString());
		
		//Get the Webhook of each Field
		System.out.println("Field Webhook: " + field.getWebhook().toString());
		
		//Get the JsonType of each Field
		System.out.println("Field JsonType: " + field.getJsonType());
		
		//Get the Object obtained Crypt instance
		Crypt crypt = field.getCrypt();
		
		//Check if crypt is not null
		if(crypt != null)
		{
			//Get the Mode of the Crypt
			System.out.println("Field Crypt Mode: " + crypt.getMode());
			
			//Get the Column of the Crypt
			System.out.println("Field Crypt Column: " + crypt.getColumn());
			
			//Get the Table of the Crypt
			System.out.println("Field Crypt Table: " + crypt.getTable());
			
			//Get the Status of the Crypt
			System.out.println("Field Crypt Status: " + crypt.getStatus().toString());
		}
		
		//Get the FieldLabel of each Field
		System.out.println("Field FieldLabel: " + field.getFieldLabel());
		
		//Get the Object obtained ToolTip instance
		ToolTip tooltip = field.getTooltip();
		
		//Check if tooltip is not null
		if(tooltip != null)
		{
			//Get the Name of the ToolTip
			System.out.println("Field ToolTip Name: " + tooltip.getName());
			
			//Get the Value of the ToolTip
			System.out.println("Field ToolTip Value: " + tooltip.getValue());
		}
		
		//Get the CreatedSource of each Field
		System.out.println("Field CreatedSource: " + field.getCreatedSource());
		
		//Get the FieldReadOnly of each Field
		System.out.println("Field FieldReadOnly: " + field.getFieldReadOnly().toString());
		
		//Get the DisplayLabel of each Field
		System.out.println("Field DisplayLabel: " + field.getDisplayLabel());
		
		//Get the ReadOnly of each Field
		System.out.println("Field ReadOnly: " + field.getReadOnly().toString());
		
		//Get the Object obtained AssociationDetails instance
		AssociationDetails associationDetails = field.getAssociationDetails();
		
		//Check if associationDetails is not null
		if(associationDetails != null)
		{
			//Get the Object obtained LookupField instance
			LookupField lookupField = associationDetails.getLookupField();
			
			//Check if lookupField is not null
			if(lookupField != null)
			{
				//Get the ID of the LookupField
				System.out.println("Field AssociationDetails LookupField ID: " + lookupField.getId());
				
				//Get the Name of the LookupField
				System.out.println("Field AssociationDetails LookupField Name: " + lookupField.getName());
			}
			
			//Get the Object obtained LookupField instance
			LookupField relatedField = associationDetails.getRelatedField();
			
			//Check if relatedField is not null
			if(relatedField != null)
			{
				//Get the ID of the relatedField
				System.out.println("Field AssociationDetails RelatedField ID: " + relatedField.getId());
				
				//Get the Name of the relatedField
				System.out.println("Field AssociationDetails RelatedField Name: " + relatedField.getName());
			}
		}
		
		if(field.getQuickSequenceNumber() != null)
		{
			//Get the QuickSequenceNumber of each Field
			System.out.println("Field QuickSequenceNumber: " + field.getQuickSequenceNumber().toString());
		}
		
		if(field.getBusinesscardSupported() != null)
		{
			//Get the BusinesscardSupported of each Field
			System.out.println("Field BusinesscardSupported: " + field.getBusinesscardSupported().toString());
		}
		
		//Check if MultiModuleLookup is not null
		if(field.getMultiModuleLookup() != null)
		{
			//Get the MultiModuleLookup map
			for(Map.Entry<String, Object> entry : field.getMultiModuleLookup().entrySet())
			{
				//Get each value in the map
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
		
		//Get the Object obtained Currency instance
		Currency currency = field.getCurrency();
		
		//Check if currency is not null
		if(currency != null)
		{
			//Get the RoundingOption of the Currency
			System.out.println("Field Currency RoundingOption: " + currency.getRoundingOption());
			
			if(currency.getPrecision() != null)
			{
				//Get the Precision of the Currency
				System.out.println("Field Currency Precision: " + currency.getPrecision().toString());
			}
		}
		
		//Get the ID of each Field
		System.out.println("Field ID: " + field.getId().toString());
		
		if(field.getCustomField() != null)
		{
			//Get the CustomField of each Field
			System.out.println("Field CustomField: " + field.getCustomField().toString());
		}
		
		//Get the Object obtained Module instance
		Module lookup = field.getLookup();
		
		//Check if lookup is not null
		if(lookup != null)
		{
			//Get the Object obtained Layout instance
			com.zoho.crm.api.layouts.Layout layout = lookup.getLayout();
			
			//Check if layout is not null
			if(layout != null)
			{
				//Get the ID of the Layout
				System.out.println("Field ModuleLookup Layout ID: " + layout.getId().toString());
				
				//Get the Name of the Layout
				System.out.println("Field ModuleLookup Layout Name: " + layout.getName());
			}
			
			//Get the DisplayLabel of the Module
			System.out.println("Field ModuleLookup DisplayLabel: " + lookup.getDisplayLabel());
			
			//Get the APIName of the Module
			System.out.println("Field ModuleLookup APIName: " + lookup.getAPIName());
			
			//Get the Module of the Module
			System.out.println("Field ModuleLookup Module: " + lookup.getModule());
			
			if(lookup.getId() != null)
			{
				//Get the ID of the Module
				System.out.println("Field ModuleLookup ID: " + lookup.getId().toString());
			}
		}
		
		if(field.getVisible() != null)
		{
			//Get the Visible of each Field
			System.out.println("Field Visible: " + field.getVisible().toString());
		}
		
		if(field.getLength() != null)
		{
			//Get the Length of each Field
			System.out.println("Field Length: " + field.getLength().toString());
		}
		
		//Get the Object obtained ViewType instance
		ViewType viewType = field.getViewType();
		
		//Check if viewType is not null
		if(viewType != null)
		{
			//Get the View of the ViewType
			System.out.println("Field ViewType View: " + viewType.getView().toString());
			
			//Get the Edit of the ViewType
			System.out.println("Field ViewType Edit: " + viewType.getEdit().toString());
			
			//Get the Create of the ViewType
			System.out.println("Field ViewType Create: " + viewType.getCreate().toString());
			
			//Get the View of the ViewType
			System.out.println("Field ViewType QuickCreate: " + viewType.getQuickCreate().toString());
		}
		
		//Get the Object obtained Module instance
		Module subform = field.getSubform();
		
		//Check if subform is not null
		if(subform != null)
		{
			//Get the Object obtained Layout instance
			com.zoho.crm.api.layouts.Layout layout = subform.getLayout();
			
			//Check if layout is not null
			if(layout != null)
			{
				//Get the ID of the Layout
				System.out.println("Field Subform Layout ID: " + layout.getId().toString());
				
				//Get the Name of the Layout
				System.out.println("Field Subform Layout Name: " + layout.getName());
			}
			
			//Get the DisplayLabel of the Module
			System.out.println("Field Subform DisplayLabel: " + subform.getDisplayLabel());
			
			//Get the APIName of the Module
			System.out.println("Field Subform APIName: " + subform.getAPIName());
			
			//Get the Module of the Module
			System.out.println("Field Subform Module: " + subform.getModule());
			
			if(subform.getId() != null)
			{
				//Get the ID of the Module
				System.out.println("Field Subform ID: " + subform.getId().toString());	
			}
		}
		
		//Get the APIName of each Field
		System.out.println("Field APIName: " + field.getAPIName().toString());
		
		//Get the Object obtained Unique instance
		Unique unique = field.getUnique();
		
		//Check if unique is not null
		if(unique != null)
		{
			//Get the Casesensitive of the Unique
			System.out.println("Field Unique Casesensitive : " + unique.getCasesensitive());
		}
		
		if(field.getHistoryTracking() != null)
		{
			//Get the HistoryTracking of each Field
			System.out.println("Field HistoryTracking: " + field.getHistoryTracking().toString());
		}
		
		//Get the DataType of each Field
		System.out.println("Field DataType: " + field.getDataType().toString());
		
		//Get the Object obtained Formula instance
		Formula formula = field.getFormula();
		
		//Check if formula is not null
		if(formula != null)
		{
			//Get the ReturnType of the Formula
			System.out.println("Field Formula ReturnType : " + formula.getReturnType());
			
			//Get the Expression of the Formula
			System.out.println("Field Formula Expression : " + formula.getExpression());
		}
		
		if(field.getDecimalPlace() != null)
		{
			//Get the DecimalPlace of each Field
			System.out.println("Field DecimalPlace: " + field.getDecimalPlace().toString());
		}
		
		if(field.getMassUpdate() != null)
		{
			//Get the MassUpdate of each Field
			System.out.println("Field MassUpdate: " + field.getMassUpdate().toString());
		}
		
		if(field.getBlueprintSupported() != null)
		{
			//Get the BlueprintSupported of each Field
			System.out.println("Field BlueprintSupported: " + field.getBlueprintSupported().toString());
		}
		
		//Get all entries from the MultiSelectLookup instance
		MultiSelectLookup multiSelectLookup = field.getMultiselectlookup();
		
		//Check if formula is not null
		if(multiSelectLookup != null)
		{
			//Get the DisplayValue of the MultiSelectLookup
			System.out.println("Field MultiSelectLookup DisplayLabel: " + multiSelectLookup.getDisplayLabel());
			
			//Get the LinkingModule of the MultiSelectLookup
			System.out.println("Field MultiSelectLookup LinkingModule: " + multiSelectLookup.getLinkingModule());
			
			//Get the LookupApiname of the MultiSelectLookup
			System.out.println("Field MultiSelectLookup LookupApiname: " + multiSelectLookup.getLookupApiname());
			
			//Get the APIName of the MultiSelectLookup
			System.out.println("Field MultiSelectLookup APIName: " + multiSelectLookup.getAPIName());
			
			//Get the ConnectedlookupApiname of the MultiSelectLookup
			System.out.println("Field MultiSelectLookup ConnectedlookupApiname: " + multiSelectLookup.getConnectedlookupApiname());
			
			//Get the ID of the MultiSelectLookup
			System.out.println("Field MultiSelectLookup ID: " + multiSelectLookup.getId());
		}
		
		//Get the PickListValue of each Field
		List<PickListValue> pickListValues = field.getPickListValues();
		
		//Check if formula is not null
		if(pickListValues != null)
		{
			for(PickListValue pickListValue : pickListValues)
			{
				//Get the DisplayValue of each PickListValues
				System.out.println("Field PickListValue DisplayValue: " + pickListValue.getDisplayValue());
				
				if(pickListValue.getSequenceNumber() != null)
				{
					//Get the SequenceNumber of each PickListValues
					System.out.println(" Field PickListValue SequenceNumber: " + pickListValue.getSequenceNumber().toString());
				}
				
				//Get the ExpectedDataType of each PickListValues
				System.out.println("Field PickListValue ExpectedDataType: " + pickListValue.getExpectedDataType());
				
				//Get the ActualValue of each PickListValues
				System.out.println("Field PickListValue ActualValue: " + pickListValue.getActualValue());
				
				if(pickListValue.getMaps() != null)
				{
					for(Object map : pickListValue.getMaps())
					{
						//Get each value from the map
						System.out.println(map);
					}
				}
				
				//Get the SysRefName of each PickListValues
				System.out.println("Field PickListValue SysRefName: " + pickListValue.getSysRefName());
				
				//Get the Type of each PickListValues
				System.out.println("Field PickListValue Type: " + pickListValue.getType());
				
			}
		}
		
		//Get the AutoNumber of each Field
		AutoNumber autoNumber = field.getAutoNumber();
		
		//Check if autoNumber is not null
		if(autoNumber != null)
		{
			//Get the Prefix of the AutoNumber
			System.out.println("Field AutoNumber Prefix: " + autoNumber.getPrefix());
			
			//Get the Suffix of the AutoNumber
			System.out.println("Field AutoNumber Suffix: " + autoNumber.getSuffix());
			
			if(autoNumber.getStartNumber() != null)
			{
				//Get the StartNumber of the AutoNumber
				System.out.println("Field AutoNumber StartNumber: " + autoNumber.getStartNumber().toString());
			}
		}
		
		if(field.getDefaultValue() != null)
		{
			//Get the DefaultValue of each Field
			System.out.println("Field DefaultValue: " + field.getDefaultValue().toString());
		}
		
		if(field.getSectionId() != null)
		{
			//Get the SectionId of each Field
			System.out.println("Field SectionId: " + field.getSectionId().toString());
		}
		
		//Check if ValidationRule is not null
		if(field.getValidationRule() != null)
		{
			//Get the details map
			for(Map.Entry<String, Object> entry : field.getValidationRule().entrySet())
			{
				//Get each value in the map
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
		
		//Check if ConvertMapping is not null
		if(field.getConvertMapping() != null)
		{
			//Get the details map
			for(Map.Entry<String, Object> entry : field.getConvertMapping().entrySet())
			{
				//Get each value in the map
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}
