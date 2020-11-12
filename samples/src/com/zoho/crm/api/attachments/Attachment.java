package samples.src.com.zoho.crm.api.attachments;

import java.io.File;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.io.OutputStream;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.attachments.APIException;

import com.zoho.crm.api.attachments.ActionHandler;

import com.zoho.crm.api.attachments.ActionResponse;

import com.zoho.crm.api.attachments.ActionWrapper;

import com.zoho.crm.api.attachments.AttachmentsOperations;

import com.zoho.crm.api.attachments.AttachmentsOperations.DeleteAttachmentsParam;

import com.zoho.crm.api.attachments.AttachmentsOperations.GetAttachmentsParam;

import com.zoho.crm.api.attachments.AttachmentsOperations.UploadLinkAttachmentParam;

import com.zoho.crm.api.attachments.FileBodyWrapper;

import com.zoho.crm.api.attachments.ResponseHandler;

import com.zoho.crm.api.attachments.ResponseWrapper;

import com.zoho.crm.api.attachments.SuccessResponse;

import com.zoho.crm.api.record.Info;

import com.zoho.crm.api.record.Record;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.util.StreamWrapper;

@SuppressWarnings("unused")
public class Attachment
{
	/**
	 * <h3> Get Attachments</h3>
	 * This method is used to get a single record's attachments' details with ID and print the response.
	 * @throws Exception
	 * @param moduleAPIName The API Name of the record's module
     * @param recordId The ID of the record to get attachments
	 */
	public static void getAttachments(String moduleAPIName, Long recordId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002l;
		
		//Get instance of AttachmentsOperations Class that takes moduleAPIName and recordId as parameter
		AttachmentsOperations attachmentsOperations = new AttachmentsOperations(moduleAPIName,recordId);
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		//Possible parameters of Get Attachments operation
		paramInstance.add(GetAttachmentsParam.PAGE, 1);
		
		paramInstance.add(GetAttachmentsParam.PER_PAGE, 100);
		
//		paramInstance.add(GetAttachmentsParam.FIELDS, "id");
		
		//Call getAttachments method
		APIResponse<ResponseHandler> response = attachmentsOperations.getAttachments(paramInstance);
		
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
					
					//Get the list of obtained Attachment instances
					List<com.zoho.crm.api.attachments.Attachment> attachments = responseWrapper.getData();
				
					for(com.zoho.crm.api.attachments.Attachment attachment : attachments)
					{
						//Get the owner User instance of each attachment
						com.zoho.crm.api.users.User owner = attachment.getOwner();
						
						//Check if owner is not null
						if(owner != null)
						{
							//Get the Name of the Owner
							System.out.println("Attachment Owner User-Name: " + owner.getName());
							
							//Get the ID of the Owner
							System.out.println("Attachment Owner User-ID: " + owner.getId());
							
							//Get the Email of the Owner
							System.out.println("Attachment Owner User-Email: " + owner.getEmail());
						}
						
						//Get the modified time of each attachment
						System.out.println("Attachment Modified Time: " + attachment.getModifiedTime().toString());
						
						//Get the name of the File
						System.out.println("Attachment File Name: " + attachment.getFileName());
						
						//Get the created time of each attachment
						System.out.println("Attachment Created Time: " + attachment.getCreatedTime().toString());
						
						//Get the Attachment file size
						System.out.println("Attachment File Size: " + attachment.getSize().toString());
						
						//Get the parentId Record instance of each attachment
						Record parentId = attachment.getParentId();
						
						//Check if parentId is not null
						if(parentId != null)
						{	
							//Get the parent record Name of each attachment
							System.out.println("Attachment parent record Name: " + parentId.getKeyValue("name"));
							
							//Get the parent record ID of each attachment
							System.out.println("Attachment parent record ID: " + parentId.getId());
						}
						
						//Get the attachment is Editable
						System.out.println("Attachment is Editable: " + attachment.getEditable().toString());
						
						//Get the file ID of each attachment
						System.out.println("Attachment File ID: " + attachment.getFileId());
						
						//Get the type of each attachment
						System.out.println("Attachment File Type: " + attachment.getType());
						
						//Get the seModule of each attachment
						System.out.println("Attachment seModule: " + attachment.getSeModule());
						
						//Get the modifiedBy User instance of each attachment
						com.zoho.crm.api.users.User modifiedBy = attachment.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Attachment Modified By User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Attachment Modified By User-ID: " + modifiedBy.getId());
							
							//Get the Email of the modifiedBy User
							System.out.println("Attachment Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the state of each attachment
						System.out.println("Attachment State: " + attachment.getState());
						
						//Get the ID of each attachment
						System.out.println("Attachment ID: " + attachment.getId());
						
						//Get the createdBy User instance of each attachment
						com.zoho.crm.api.users.User createdBy = attachment.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the name of the createdBy User
							System.out.println("Attachment Created By User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Attachment Created By User-ID: " + createdBy.getId());
							
							//Get the Email of the createdBy User
							System.out.println("Attachment Created By User-Email: " + createdBy.getEmail());
						}
						
						//Get the linkUrl of each attachment
						System.out.println("Attachment LinkUrl: " + attachment.getLinkUrl());
					}
					
					//Get the Object obtained Info instance
					Info info = responseWrapper.getInfo();
					
					//Check if info is not null
					if(info != null)
					{
						if(info.getPerPage() != null)
						{
							//Get the PerPage of the Info
							System.out.println("Record Info PerPage: " + info.getPerPage().toString());
						}
						
						if(info.getCount() != null)
						{
							//Get the Count of the Info
							System.out.println("Record Info Count: " + info.getCount().toString());
						}
	
						if(info.getPage() != null)
						{
							//Get the Page of the Info
							System.out.println("Record Info Page: " + info.getPage().toString());
						}
						
						if(info.getMoreRecords() != null)
						{
							//Get the MoreRecords of the Info
							System.out.println("Record Info MoreRecords: " + info.getMoreRecords().toString());
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
	 * <h3> Upload Attachments</h3>
	 * This method is used to upload an attachment to a single record of a module with ID and print the response.
	 * @throws Exception
	 * @param moduleAPIName The API Name of the record's module
     * @param recordId The ID of the record to upload attachment
     * @param absoluteFilePath The absolute file path of the file to be attached
	 */
	public static void uploadAttachments(String moduleAPIName, Long recordId, String absoluteFilePath) throws Exception
	{
		//example
//		String moduleAPIName = "Leads";
//		Long recordId = 3477061000005177002l;
//		String absoluteFilePath = "/Users/use_name/Desktop/image.png";
		
		//Get instance of AttachmentsOperations Class that takes moduleAPIName and recordId as parameter
		AttachmentsOperations attachmentsOperations = new AttachmentsOperations(moduleAPIName, recordId);
		
		//Get instance of FileBodyWrapper class that will contain the request file
		com.zoho.crm.api.attachments.FileBodyWrapper fileBodyWrapper = new com.zoho.crm.api.attachments.FileBodyWrapper();
		
		//Get instance of StreamWrapper class that takes absolute path of the file to be attached as parameter
		StreamWrapper streamWrapper = new StreamWrapper(absoluteFilePath);
		
		//Set file to the FileBodyWrapper instance
		fileBodyWrapper.setFile(streamWrapper);
		
		//Call uploadAttachment method that takes FileBodyWrapper instance as parameter
		APIResponse<ActionHandler> response = attachmentsOperations.uploadAttachment(fileBodyWrapper);
		
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
					
					//Get the list of obtained action responses
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
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
							
							if(exception.getDetails() != null)
							{
								//Get the details map
								for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
								{
									//Get each value in the map
									System.out.println(entry.getKey() + ": " + entry.getValue());
								}
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
					
					if(exception.getDetails() != null)
					{
						//Get the details map
						for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
						{
							//Get each value in the map
							System.out.println(entry.getKey() + ": " + entry.getValue());
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
	
	/**
	 * <h3> Delete Attachments</h3>
	 * This method is used to Delete attachments to a single record of a module with ID and print the response.
	 * @param moduleAPIName The API Name of the record's module
	 * @param recordId The ID of the record to delete attachment
	 * @param attachmentIds The List of attachment IDs to be deleted
	 */
	public static void deleteAttachments(String moduleAPIName, Long recordId, List<Long> attachmentIds) throws Exception
	{
		//example
//		String moduleAPIName = "Leads";
//		Long recordId = 3477061000005177002l;
//		List<Long> attachmentIds = new ArrayList<Long>(Arrays.asList(3477061000005979001l, 3477061000005968003, 3477061000005961010l));
		
		//Get instance of AttachmentsOperations Class that takes moduleAPIName and recordId as parameter
		AttachmentsOperations attachmentOperations = new AttachmentsOperations(moduleAPIName, recordId);
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		for(Long attachmentId : attachmentIds)
		{
			paramInstance.add(DeleteAttachmentsParam.IDS, attachmentId);
		}
		
		//Call deleteAttachments method that takes paramInstance as parameter
		APIResponse<ActionHandler>response = attachmentOperations.deleteAttachments(paramInstance);
		
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
					
					//Get the list of obtained Attachment Record instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
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
	 * <h3> Download Attachment</h3>
	 * This method is used to download an attachment of a single record of a module with ID and attachment ID and write the file in the specified destination.
	 * @throws Exception
	 * @param moduleAPIName The API Name of the record's module
     * @param recordId The ID of the record to download attachment
     * @param attachmentId The ID of the attachment to be downloaded
     * @param destinationFolder The absolute path of the destination folder to store the attachment
	 */
	public static void downloadAttachment(String moduleAPIName, Long recordId, Long attachmentId, String destinationFolder) throws Exception
	{
		//example
//		String moduleAPIName = "Leads";
//		Long recordId = "3477061000005177002";
//		Long attachmentId = "3477061000005177023";
//		String destinationFolder = "/Users/user_name/Desktop";
		
		//Get instance of AttachmentsOperations Class that takes moduleAPIName and recordId as parameter
		AttachmentsOperations attachmentOperations = new AttachmentsOperations(moduleAPIName, recordId);
		
		//Call downloadAttachment method that takes attachmentId as parameters
		APIResponse<ResponseHandler> response = attachmentOperations.downloadAttachment(attachmentId);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code : " + response.getStatusCode());
			
			if(response.getStatusCode() == 204)
			{
				System.out.println("No Content");
				return;
			}
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ResponseHandler responseHandler = response.getObject();
				
				if(responseHandler instanceof FileBodyWrapper)
				{
					//Get the received FileBodyWrapper instance
					FileBodyWrapper fileBodyWrapper = (FileBodyWrapper)responseHandler;
					
					//Get StreamWrapper instance from the returned FileBodyWrapper instance
					StreamWrapper streamWrapper = fileBodyWrapper.getFile();
					
					//Create a file instance with the absolute_file_path
					File file = new File(destinationFolder + File.separatorChar + streamWrapper.getName());
					
					//Get InputStream from the response
					InputStream is = streamWrapper.getStream();
					
					//Create an OutputStream for the destination file
					OutputStream os = new FileOutputStream(file);
					
					byte[] buffer = new byte[1024];
					
			        int bytesRead;
			        
			        //read the InputStream till the end
			        while((bytesRead = is.read(buffer)) != -1)
			        {
			        	//write data to OutputStream
			        	os.write(buffer, 0, bytesRead);
			        }
			        
			        //Close the InputStream
			        is.close();
			        
			        //Flush and close the OutputStream
			        os.flush();
			        
			        os.close();
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
	 * <h3> Delete Attachment</h3>
	 * This method is used to delete an attachment to a single record of a module with ID and print the response.
	 * @param moduleAPIName The API Name of the record's module
	 * @param recordId The ID of the record to delete attachment
	 * @param attachmentId The ID of the attachment to be deleted
	 */
	public static void deleteAttachment(String moduleAPIName, Long recordId, Long attachmentId) throws Exception
	{
		//example
//		String moduleAPIName = "Leads";
//		Long recordId = 3477061000005177002;
//		Long attachmentId = "3477061000005177002";
		
		//Get instance of AttachmentsOperations Class that takes moduleAPIName and recordId as parameter
		AttachmentsOperations attachmentsOperations = new AttachmentsOperations(moduleAPIName, recordId);
		
		//Call deleteAttachment method that takes attachmentId as parameter
		APIResponse<ActionHandler> response = attachmentsOperations.deleteAttachment(attachmentId);
		
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
					
					//Get the list of obtained Action Response instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
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
	 * <h3> Upload Link Attachments</h3>
	 * This method is used to upload link attachment to a single record of a module with ID and print the response.
	 * @param moduleAPIName The API Name of the record's module
	 * @param recordId The ID of the record to upload Link attachment
	 * @param attachmentURL The attachmentURL of the doc or image link to be attached
	 */
	public static void uploadLinkAttachments(String moduleAPIName, Long recordId, String attachmentURL) throws Exception
	{
		//example
//		String moduleAPIName = "Leads";
//		Long recordId = "3477061000005177002";
//		String attachmentURL = "https://5.imimg.com/data5/KJ/UP/MY-8655440/zoho-crm-500x500.png";
		
		//Get instance of AttachmentsOperations Class that takes moduleAPIName and recordId as parameter
		AttachmentsOperations attachmentsOperations = new AttachmentsOperations(moduleAPIName, recordId);
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(UploadLinkAttachmentParam.ATTACHMENTURL, attachmentURL);
		
		//Call uploadLinkAttachment method that takes paramInstance as parameter
		APIResponse<ActionHandler> response = attachmentsOperations.uploadLinkAttachment(paramInstance);
		
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
					
					//Get the list of obtained Action Response instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
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
