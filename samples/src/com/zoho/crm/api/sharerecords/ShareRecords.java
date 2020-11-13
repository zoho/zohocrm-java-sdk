package samples.src.com.zoho.crm.api.sharerecords;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.modules.Module;

import com.zoho.crm.api.sharerecords.APIException;

import com.zoho.crm.api.sharerecords.ActionHandler;

import com.zoho.crm.api.sharerecords.ActionResponse;

import com.zoho.crm.api.sharerecords.ActionWrapper;

import com.zoho.crm.api.sharerecords.BodyWrapper;

import com.zoho.crm.api.sharerecords.DeleteActionHandler;

import com.zoho.crm.api.sharerecords.DeleteActionResponse;

import com.zoho.crm.api.sharerecords.DeleteActionWrapper;

import com.zoho.crm.api.sharerecords.ResponseHandler;

import com.zoho.crm.api.sharerecords.ResponseWrapper;

import com.zoho.crm.api.sharerecords.ShareRecord;

import com.zoho.crm.api.sharerecords.ShareRecordsOperations;

import com.zoho.crm.api.sharerecords.ShareRecordsOperations.GetSharedRecordDetailsParam;

import com.zoho.crm.api.sharerecords.SharedThrough;

import com.zoho.crm.api.sharerecords.SuccessResponse;

import com.zoho.crm.api.users.User;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class ShareRecords
{
	/**
	 * <h3> Get Shared Record Details </h3>
	 * This method is used to get the details of a shared record and print the response.
	 * @param moduleAPIName - The API Name of the module to get shared record details.
	 * @param recordId - The ID of the record to be obtained.
	 * @throws Exception
	 */
	public static void getSharedRecordDetails(String moduleAPIName, Long recordId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002L;
		
		//Get instance of ShareRecordsOperations Class that takes recordId and moduleAPIName as parameter
		ShareRecordsOperations shareRecordsOperations = new ShareRecordsOperations(recordId, moduleAPIName);
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetSharedRecordDetailsParam.VIEW, "summary");
		
//		paramInstance.add(GetSharedRecordDetailsParam.SHAREDTO, 3477061000000173021l);
		
		//Call getSharedRecordDetails method that takes paramInstance as parameter
		APIResponse<ResponseHandler> response = shareRecordsOperations.getSharedRecordDetails(paramInstance);
		
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
					
					//Get the obtained ShareRecord instance
					List<ShareRecord> shareRecords = responseWrapper.getShare();
					
					for(ShareRecord shareRecord : shareRecords)
					{					
						//Get the ShareRelatedRecords of each ShareRecord
						System.out.println("ShareRecord ShareRelatedRecords: " + shareRecord.getShareRelatedRecords().toString());
						
						//Get the SharedThrough instance of each ShareRecord
						SharedThrough sharedThrough = shareRecord.getSharedThrough();
						
						//Check if sharedThrough is not null
						if(sharedThrough != null)
						{
							//Get the EntityName of the SharedThrough
							System.out.println("ShareRecord SharedThrough EntityName: " + sharedThrough.getEntityName());
							
							//Get the Module instance of each ShareRecord
							Module module = sharedThrough.getModule();
							
							if(module != null)
							{
								//Get the ID of the Module
								System.out.println("ShareRecord SharedThrough Module ID: " + module.getId().toString());
								
								//Get the name of the Module
								System.out.println("ShareRecord SharedThrough Module Name: " + module.getName());
							}
							
							//Get the ID of the SharedThrough
							System.out.println("ShareRecord SharedThrough ID: " + sharedThrough.getId());
						}
						
						//Get the SharedTime of each ShareRecord
						System.out.println("ShareRecord SharedTime: " + shareRecord.getSharedTime());
						
						//Get the Permission of each ShareRecord
						System.out.println("ShareRecord Permission: " + shareRecord.getPermission().toString());
						
						//Get the sharedBy of each ShareRecord
						com.zoho.crm.api.users.User sharedBy = shareRecord.getSharedBy();
						
						//Check if sharedBy is not null
						if(sharedBy != null)
						{
							//Get the ID of the  User
							System.out.println("ShareRecord SharedBy-ID: " + sharedBy.getId());
							
							//Get the FullName of the  User
							System.out.println("ShareRecord SharedBy-FullName: " + sharedBy.getFullName());
							
							//Get the Zuid of the  User
							System.out.println("ShareRecord SharedBy-Zuid: " + sharedBy.getZuid());
						}
						
						//Get the shared User instance of each ShareRecord
						com.zoho.crm.api.users.User user = shareRecord.getUser();
						
						//Check if user is not null
						if(user != null)
						{
							//Get the ID of the shared User
							System.out.println("ShareRecord User-ID: " + user.getId());
							
							//Get the FullName of the shared User
							System.out.println("ShareRecord User-FullName: " + user.getFullName());
							
							//Get the Zuid of the shared User
							System.out.println("ShareRecord User-Zuid: " + user.getZuid());
						}
					}
					
					if(responseWrapper.getShareableUser() != null)
					{
						List<com.zoho.crm.api.users.User> shareableUsers = responseWrapper.getShareableUser();
						
						for(com.zoho.crm.api.users.User shareableUser : shareableUsers)
						{
							//Get the ID of the shareable User
							System.out.println("ShareRecord User-ID: " + shareableUser.getId());
							
							//Get the FullName of the shareable User
							System.out.println("ShareRecord User-FullName: " + shareableUser.getFullName());
							
							//Get the Zuid of the shareable User
							System.out.println("ShareRecord User-Zuid: " + shareableUser.getZuid());
						}
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
	 * <h3> Share Record </h3>
	 * This method is used to share the record and print the response.
	 * @param moduleAPIName - The API Name of the module to shared record.
	 * @param recordId - The ID of the record to be obtained.
	 * @throws Exception
	 */
	public static void shareRecord(String moduleAPIName, Long recordId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002L;
		
		//Get instance of ShareRecordsOperations Class that takes recordId and moduleAPIName as parameter
		ShareRecordsOperations shareRecordsOperations = new ShareRecordsOperations(recordId, moduleAPIName);
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of ShareRecord instances
		List<ShareRecord> shareList = new ArrayList<ShareRecord>();
		
		//Get instance of ShareRecord Class
		ShareRecord share1 = new ShareRecord();
		
		for(int i = 0; i < 9; i++)
		{
			//Get instance of ShareRecord Class
			share1 = new ShareRecord();
			
			//Set the record is shared with or without related records.
			share1.setShareRelatedRecords(true);
			
			//Set the access permission given to the user for that record.
			share1.setPermission("read_write");
			
			User user = new User();
			
			user.setId(3477061000005791024l);
			
			//Set the users details with whom the record is shared.
			share1.setUser(user);
			
			shareList.add(share1);
		}
		
		share1 = new ShareRecord();
		
		share1.setShareRelatedRecords(true);
		
		share1.setPermission("read_write");
		
		User user = new User();
		
		user.setId(3477061000005791024l);
		
		share1.setUser(user);
		
		shareList.add(share1);
		
		request.setShare(shareList);
		
		//Call shareRecord method that takes BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = shareRecordsOperations.shareRecord(request);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getShare();
					
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
	 * <h3> Update Share Permissions </h3>
	 * This method is used to update the sharing permissions of a record granted to users as Read-Write, Read-only, or grant full access.
	 * @param moduleAPIName - The API Name of the module to update share permissions.
	 * @param recordId - The ID of the record to be obtained.
	 * @throws Exception
	 */
	public static void updateSharePermissions(String moduleAPIName, Long recordId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002L;
		
		//Get instance of ShareRecordsOperations Class that takes recordId and moduleAPIName as parameter
		ShareRecordsOperations shareRecordsOperations = new ShareRecordsOperations(recordId, moduleAPIName);
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of ShareRecord instances
		List<ShareRecord> shareList = new ArrayList<ShareRecord>();
		
		//Get instance of ShareRecord Class
		ShareRecord share1 = new ShareRecord();
		
		share1.setShareRelatedRecords(true);
		
		share1.setPermission("full_access");
		
		User user = new User();
		
		user.setId(3477061000005791024l);
		
		share1.setUser(user);
		
		shareList.add(share1);
		
		request.setShare(shareList);
		
		//Call updateSharePermissions method that takes BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = shareRecordsOperations.updateSharePermissions(request);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getShare();
					
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
	 * <h3> Revoke Shared Record </h3>
	 * This method is used to revoke access to a shared record that was shared to users and print the response.
	 * @param moduleAPIName - The API Name of the module to revoke shared record.
	 * @param recordId - The ID of the record to be obtained.
	 * @throws Exception
	 */
	public static void revokeSharedRecord(String moduleAPIName, Long recordId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002L;
		
		//Get instance of ShareRecordsOperations Class that takes recordId and moduleAPIName as parameter
		ShareRecordsOperations shareRecordsOperations = new ShareRecordsOperations(recordId, moduleAPIName);
		
		//Call revokeSharedRecord method
		APIResponse<DeleteActionHandler> response = shareRecordsOperations.revokeSharedRecord();
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				DeleteActionHandler deleteActionHandler = response.getObject();
				
				if(deleteActionHandler instanceof DeleteActionWrapper)
				{
					//Get the received DeleteActionWrapper instance
					DeleteActionWrapper deleteActionWrapper = (DeleteActionWrapper) deleteActionHandler;
					
					//Get the received DeleteActionResponse instance
					DeleteActionResponse deleteActionResponse = deleteActionWrapper.getShare();
					
					//Check if the request is successful
					if(deleteActionResponse instanceof SuccessResponse)
					{
						//Get the received SuccessResponse instance
						SuccessResponse successResponse = (SuccessResponse)deleteActionResponse;
						
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
					else if(deleteActionResponse instanceof APIException)
					{
						//Get the received APIException instance
						APIException exception = (APIException) deleteActionResponse;
						
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
				//Check if the request returned an exception
				else if(deleteActionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) deleteActionHandler;
					
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