package samples.src.com.zoho.crm.api.variables;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.variablegroups.VariableGroup;

import com.zoho.crm.api.variables.APIException;

import com.zoho.crm.api.variables.ActionHandler;

import com.zoho.crm.api.variables.ActionResponse;

import com.zoho.crm.api.variables.ActionWrapper;

import com.zoho.crm.api.variables.BodyWrapper;

import com.zoho.crm.api.variables.ResponseHandler;

import com.zoho.crm.api.variables.ResponseWrapper;

import com.zoho.crm.api.variables.SuccessResponse;

import com.zoho.crm.api.variables.VariablesOperations;

import com.zoho.crm.api.variables.VariablesOperations.DeleteVariablesParam;

import com.zoho.crm.api.variables.VariablesOperations.GetVariableByIDParam;

import com.zoho.crm.api.variables.VariablesOperations.GetVariableForAPINameParam;

import com.zoho.crm.api.variables.VariablesOperations.GetVariablesParam;

public class Variable
{
	
	/**
	 * <h3> Get Variables </h3>
	 * This method is used to retrieve all the available variables through an API request and print the response.
	 * @throws Exception
	 */
	public static void getVariables() throws Exception
	{
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetVariablesParam.GROUP, "General");
		
		//Call getVariables method that takes paramInstance as parameter 
		APIResponse<ResponseHandler> response = variablesOperations.getVariables(paramInstance);
		
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
					
					//Get the obtained Variable instance
					List<com.zoho.crm.api.variables.Variable> variables = responseWrapper.getVariables();
					
					for(com.zoho.crm.api.variables.Variable variable : variables)
					{	
						//Get the APIName of each Variable
						System.out.println("Variable APIName: " + variable.getAPIName());
						
						//Get the Name of each Variable
						System.out.println("Variable Name: " + variable.getName());
						
						//Get the Description of each Variable
						System.out.println("Variable Description: " + variable.getDescription());
						
						//Get the ID of each Variable
						System.out.println("Variable ID: " + variable.getId());
						
						//Get the Type of each Variable
						System.out.println("Variable Type: " + variable.getType());
						
						// Get the VariableGroup instance of each Variable
						VariableGroup variableGroup = variable.getVariableGroup();
						
						//Check if variableGroup is not null
						if(variableGroup != null)
						{
							//Get the Name of each VariableGroup
							System.out.println("Variable VariableGroup APIName: " + variableGroup.getAPIName());
							
							//Get the ID of each VariableGroup
							System.out.println("Variable VariableGroup ID: " + variableGroup.getId());
						}
						
						
						//Get the Value of each Variable
						System.out.println("Variable Value: " + variable.getValue());
						
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
	 * <h3> Create Variables </h3>
	 * This method is used to create a new variable in CRM and print the response.
	 * @throws Exception
	 */
	public static void createVariables() throws Exception
	{
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Variable instances
		List<com.zoho.crm.api.variables.Variable> variableList = new ArrayList<com.zoho.crm.api.variables.Variable>();
		
		//Get instance of Variable Class
		com.zoho.crm.api.variables.Variable variable1 = new com.zoho.crm.api.variables.Variable();
		
		variable1.setName("Variable6665512");
		
		variable1.setAPIName("Variable5512");
		
		VariableGroup variableGroup = new VariableGroup();
		
		variableGroup.setId(3477061000003089001L);
		
		variable1.setVariableGroup(variableGroup);
		
		variable1.setType("integer");
		
		variable1.setValue("55");
		
		variable1.setDescription("This denotes variable 5 description");
		
		variableList.add(variable1);
		
		variable1 = new com.zoho.crm.api.variables.Variable();
		
		variable1.setName("Variable661");
		
		variable1.setAPIName("Variable661");
		
		variableGroup = new VariableGroup();
		
		variableGroup.setName("General");
		
		variable1.setVariableGroup(variableGroup);
		
		variable1.setType("text");
		
		variable1.setValue("Hello");
		
		variable1.setDescription("This denotes variable 6 description");
		
		variableList.add(variable1);
		
		request.setVariables(variableList);
		
		//Call createVariables method that takes BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = variablesOperations.createVariables(request);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getVariables();
					
					for(ActionResponse actionResponse : actionResponses)
					{
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
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
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
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
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
	 *  <h3> Update Variables </h3>
	 * This method is used to update details of variables in CRM and print the response.
	 * @throws Exception
	 */
	public static void updateVariables() throws Exception
	{
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Variable instances
		List<com.zoho.crm.api.variables.Variable> variableList = new ArrayList<com.zoho.crm.api.variables.Variable>();
		
		//Get instance of Variable Class
		com.zoho.crm.api.variables.Variable variable1 = new com.zoho.crm.api.variables.Variable();
		
		variable1.setId(3477061000003320163L);
		
		variable1.setValue("4763");
		
		variableList.add(variable1);
		
		variable1 = new com.zoho.crm.api.variables.Variable();
		
		variable1.setId(3477061000005817019L);
		
		variable1.setDescription("This is a new description");
		
		variableList.add(variable1);
		
		variable1 = new com.zoho.crm.api.variables.Variable();
		
		variable1.setId(3477061000005826003L);
		
		variable1.setAPIName("NewAPI");
		
		variableList.add(variable1);
		
		request.setVariables(variableList);
		
		//Call updateVariables method that takes BodyWrapper class instance as parameter
		APIResponse<ActionHandler> response = variablesOperations.updateVariables(request);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getVariables();
					
					for(ActionResponse actionResponse : actionResponses)
					{
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
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
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
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
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
	 *  <h3> Delete Variables </h3>
	 * This method is used to delete details of multiple variables in CRM simultaneously and print the response.
	 * @param variableIds - The List of the Variable IDs to be deleted
	 * @throws Exception
	 */
	public static void deleteVariables(ArrayList<Long> variableIds) throws Exception
	{
		//example
		//ArrayList<Long> variableIds = new ArrayList<Long>(Arrays.asList(3477061000006211003l, 3477061000006211001l));
		
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		for(Long variableId : variableIds)
		{
			paramInstance.add(DeleteVariablesParam.IDS, variableId);
		}
		
		//Call deleteVariables method that takes paramInstance as parameter
		APIResponse<ActionHandler> response = variablesOperations.deleteVariables(paramInstance);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getVariables();
					
					for(ActionResponse actionResponse : actionResponses)
					{
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
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
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
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
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
	 * <h3> Get Variable By Id </h3>
	 * This method is used to get the details of any specific variable.
	 * Specify the unique ID of the variable in your API request to get the data for that particular variable group.
	 * @param variableId - The ID of the Variable to be obtained
	 * @throws Exception
	 */
	public static void getVariableById(Long variableId) throws Exception
	{
		//example
		//Long variableId = 3477061000003320163l;
		
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetVariableByIDParam.GROUP, "3477061000003089001");//"General"
		
		//Call getVariableById method that takes variableId and paramInstance as parameter
		APIResponse<ResponseHandler> response = variablesOperations.getVariableById(variableId, paramInstance);
		
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
					//Get the received ActionWrapper instance
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the obtained Variable instance
					List<com.zoho.crm.api.variables.Variable> variables = responseWrapper.getVariables();
					
					for(com.zoho.crm.api.variables.Variable variable : variables)
					{	
						//Get the APIName of each Variable
						System.out.println("Variable APIName: " + variable.getAPIName());
						
						//Get the Name of each Variable
						System.out.println("Variable Name: " + variable.getName());
						
						//Get the Description of each Variable
						System.out.println("Variable Description: " + variable.getDescription());
						
						//Get the ID of each Variable
						System.out.println("Variable ID: " + variable.getId());
						
						//Get the Type of each Variable
						System.out.println("Variable Type: " + variable.getType());
						
						// Get the VariableGroup instance of each Variable
						VariableGroup variableGroup = variable.getVariableGroup();
						
						//Check if variableGroup is not null
						if(variableGroup != null)
						{
							//Get the Name of each VariableGroup
							System.out.println("Variable VariableGroup APIName: " + variableGroup.getAPIName());
							
							//Get the ID of each VariableGroup
							System.out.println("Variable VariableGroup ID: " + variableGroup.getId());
						}
						
						
						//Get the Value of each Variable
						System.out.println("Variable Value: " + variable.getValue());
						
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
	 * <h3> Update Variable By Id </h3>
	 * This method is used to update details of a specific variable in CRM and print the response.
	 * @param variableId - The ID of the Variable to be updated
	 * @throws Exception
	 */
	public static void updateVariableById(Long variableId) throws Exception
	{
		//example
		//Long variableId = 3477061000003320163l;
		
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Variable instances
		List<com.zoho.crm.api.variables.Variable> variableList = new ArrayList<com.zoho.crm.api.variables.Variable>();
		
		//Get instance of Variable Class
		com.zoho.crm.api.variables.Variable variable1 = new com.zoho.crm.api.variables.Variable();
		
		variable1.setAPIName("TestAPIName");
		
		variableList.add(variable1);
		
		request.setVariables(variableList);
		
		//Call updateVariableById method that takes variableId and BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = variablesOperations.updateVariableById(variableId, request);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getVariables();
					
					for(ActionResponse actionResponse : actionResponses)
					{
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
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
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
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
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
	 *  <h3> Delete Variable </h3>
	 * This method is used to delete details of a specific variable in CRM and print the response.
	 * @param variableId - The ID of the Variable to be deleted
	 * @throws Exception
	 */
	public static void deleteVariable(Long variableId) throws Exception
	{
		//example
		//Long variableId = 3477061000003320163l;
		
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Call deleteVariable method that takes variableId as parameter
		APIResponse<ActionHandler> response = variablesOperations.deleteVariable(variableId);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getVariables();
					
					for(ActionResponse actionResponse : actionResponses)
					{
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
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
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
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
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
	 * <h3> Get Variable for API Name </h3>
	 * This method is used to get the details of any specific variable.
	 * Specify the unique name of the variable in your API request to get the data for that particular variable group.
	 * @param variableName - The name of the Variable to be obtained
	 * @throws Exception
	 */
	public static void getVariableForAPIName(String variableName) throws Exception
	{
		//example
		//String variableName = "Variable55";
		
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetVariableForAPINameParam.GROUP, "General");//"3477061000003089001"
		
		//Call getVariableForAPIName method that takes variableName and paramInstance as parameter
		APIResponse<ResponseHandler> response = variablesOperations.getVariableForAPIName(variableName, paramInstance);
		
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
					//Get the received ActionWrapper instance
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the obtained Variable instance
					List<com.zoho.crm.api.variables.Variable> variables = responseWrapper.getVariables();
					
					for(com.zoho.crm.api.variables.Variable variable : variables)
					{	
						//Get the APIName of each Variable
						System.out.println("Variable APIName: " + variable.getAPIName());
						
						//Get the Name of each Variable
						System.out.println("Variable Name: " + variable.getName());
						
						//Get the Description of each Variable
						System.out.println("Variable Description: " + variable.getDescription());
						
						//Get the ID of each Variable
						System.out.println("Variable ID: " + variable.getId());
						
						//Get the Type of each Variable
						System.out.println("Variable Type: " + variable.getType());
						
						// Get the VariableGroup instance of each Variable
						VariableGroup variableGroup = variable.getVariableGroup();
						
						//Check if variableGroup is not null
						if(variableGroup != null)
						{
							//Get the Name of each VariableGroup
							System.out.println("Variable VariableGroup APIName: " + variableGroup.getAPIName());
							
							//Get the ID of each VariableGroup
							System.out.println("Variable VariableGroup ID: " + variableGroup.getId());
						}
						
						
						//Get the Value of each Variable
						System.out.println("Variable Value: " + variable.getValue());
						
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
	 * This method is used to update details of a specific variable in CRM and print the response.
	 * @param variableName - The name of the Variable to be updated
	 * @throws Exception
	 */
	public static void updateVariableByAPIName(String variableName) throws Exception
	{
		//example
		//String variableName = "Variable55";
		
		//Get instance of VariablesOperations Class
		VariablesOperations variablesOperations = new VariablesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Variable instances
		List<com.zoho.crm.api.variables.Variable> variableList = new ArrayList<com.zoho.crm.api.variables.Variable>();
		
		//Get instance of Variable Class
		com.zoho.crm.api.variables.Variable variable1 = new com.zoho.crm.api.variables.Variable();
		
		variable1.setDescription("Test update Variable By APIName");
		
		variableList.add(variable1);
		
		request.setVariables(variableList);
		
		//Call updateVariableByAPIName method that takes variableName and BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = variablesOperations.updateVariableByAPIName(variableName, request);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getVariables();
					
					for(ActionResponse actionResponse : actionResponses)
					{
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
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
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
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
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
}
