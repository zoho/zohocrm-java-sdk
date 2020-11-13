package samples.src.com.zoho.crm.api.variablegroups;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.variablegroups.APIException;

import com.zoho.crm.api.variablegroups.ResponseHandler;

import com.zoho.crm.api.variablegroups.ResponseWrapper;

import com.zoho.crm.api.variablegroups.VariableGroupsOperations;

public class VariableGroup
{
	/**
	 * <h3> Get Variable Groups </h3>
	 * This method is used to get the details of all the variable groups and print the response.
	 * @throws Exception
	 */
	public static void getVariableGroups() throws Exception
	{
		//Get instance of VariableGroupsOperations Class
		VariableGroupsOperations variableGroupsOperations = new VariableGroupsOperations();
		
		//Call getVariableGroups method 
		APIResponse<ResponseHandler> response = variableGroupsOperations.getVariableGroups();
		
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
					
					//Get the obtained VariableGroup instance
					List<com.zoho.crm.api.variablegroups.VariableGroup> variableGroups = responseWrapper.getVariableGroups();
					
					for(com.zoho.crm.api.variablegroups.VariableGroup variableGroup : variableGroups)
					{	
						//Get the DisplayLabel of each VariableGroup
						System.out.println("VariableGroup DisplayLabel: " + variableGroup.getDisplayLabel());
						
						//Get the APIName of each VariableGroup
						System.out.println("VariableGroup APIName: " + variableGroup.getAPIName());
	
						//Get the Name of each VariableGroup
						System.out.println("VariableGroup Name: " + variableGroup.getName());
						
						//Get the Description of each VariableGroup
						System.out.println("VariableGroup Description: " + variableGroup.getDescription());
						
						//Get the ID of each VariableGroup
						System.out.println("VariableGroup ID: " + variableGroup.getId());
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
	 * <h3> Get Variable Group By Id </h3>
	 * This method is used to get the details of any variable group with group id and print the response.
	 * @param variableGroupId - The ID of the VariableGroup to be obtained
	 * @throws Exception
	 */
	public static void getVariableGroupById(Long variableGroupId) throws Exception
	{
		//example
		//Long variableGroupId = 3477061000003089001l;
		
		//Get instance of VariableGroupsOperations Class
		VariableGroupsOperations variableGroupsOperations = new VariableGroupsOperations();
		
		//Call getVariableGroupById method that takes variableGroupId as parameter 
		APIResponse<ResponseHandler> response = variableGroupsOperations.getVariableGroupById(variableGroupId);
		
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
					
					//Get the obtained VariableGroup instance
					List<com.zoho.crm.api.variablegroups.VariableGroup> variableGroups = responseWrapper.getVariableGroups();
					
					for(com.zoho.crm.api.variablegroups.VariableGroup variableGroup : variableGroups)
					{	
						//Get the DisplayLabel of each VariableGroup
						System.out.println("VariableGroup DisplayLabel: " + variableGroup.getDisplayLabel());
						
						//Get the APIName of each VariableGroup
						System.out.println("VariableGroup APIName: " + variableGroup.getAPIName());
	
						//Get the Name of each VariableGroup
						System.out.println("VariableGroup Name: " + variableGroup.getName());
						
						//Get the Description of each VariableGroup
						System.out.println("VariableGroup Description: " + variableGroup.getDescription());
						
						//Get the ID of each VariableGroup
						System.out.println("VariableGroup ID: " + variableGroup.getId());
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
	 * <h3> Get Variable Group By APIName </h3>
	 * This method is used to get the details of any variable group with group name and print the response.
	 * @param variableGroupName - The API Name of the VariableGroup to be obtained
	 * @throws Exception
	 */
	public static void getVariableGroupByAPIName(String variableGroupName) throws Exception
	{
		//example
		//String variableGroupName = "General";
		
		//Get instance of VariableGroupsOperations Class
		VariableGroupsOperations variableGroupsOperations = new VariableGroupsOperations();
		
		//Call getVariableGroupByAPIName method that takes variableGroupName as parameter
		APIResponse<ResponseHandler> response = variableGroupsOperations.getVariableGroupByAPIName(variableGroupName);
		
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
					
					//Get the obtained VariableGroup instance
					List<com.zoho.crm.api.variablegroups.VariableGroup> variableGroups = responseWrapper.getVariableGroups();
					
					for(com.zoho.crm.api.variablegroups.VariableGroup variableGroup : variableGroups)
					{	
						//Get the DisplayLabel of each VariableGroup
						System.out.println("VariableGroup DisplayLabel: " + variableGroup.getDisplayLabel());
						
						//Get the APIName of each VariableGroup
						System.out.println("VariableGroup APIName: " + variableGroup.getAPIName());
	
						//Get the Name of each VariableGroup
						System.out.println("VariableGroup Name: " + variableGroup.getName());
						
						//Get the Description of each VariableGroup
						System.out.println("VariableGroup Description: " + variableGroup.getDescription());
						
						//Get the ID of each VariableGroup
						System.out.println("VariableGroup ID: " + variableGroup.getId());
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
}