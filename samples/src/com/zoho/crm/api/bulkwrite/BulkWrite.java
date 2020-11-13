package samples.src.com.zoho.crm.api.bulkwrite;

import java.io.File;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.io.OutputStream;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.HeaderMap;

import com.zoho.crm.api.bulkwrite.SuccessResponse;

import com.zoho.crm.api.bulkwrite.APIException;

import com.zoho.crm.api.bulkwrite.ActionResponse;

import com.zoho.crm.api.bulkwrite.BulkWriteOperations;

import com.zoho.crm.api.bulkwrite.BulkWriteOperations.UploadFileHeader;

import com.zoho.crm.api.util.Choice;

import com.zoho.crm.api.bulkwrite.BulkWriteResponse;

import com.zoho.crm.api.bulkwrite.CallBack;

import com.zoho.crm.api.bulkwrite.FieldMapping;

import com.zoho.crm.api.bulkwrite.FileBodyWrapper;

import com.zoho.crm.api.bulkwrite.RequestWrapper;

import com.zoho.crm.api.bulkwrite.Resource;

import com.zoho.crm.api.bulkwrite.ResponseHandler;

import com.zoho.crm.api.bulkwrite.ResponseWrapper;

import com.zoho.crm.api.bulkwrite.Result;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.util.StreamWrapper;

public class BulkWrite
{
	
	/**
	 * <h3> Upload File</h3>
	 * This method is used to upload a CSV file in ZIP format for bulk write API. The response contains the file_id.
	 * Use this ID while making the bulk write request.
	 * @param orgID The unique ID (zgid) of your organization obtained through the Organization API.
	 * @param absoluteFilePath The absoluteFilePath of the zip file you want to upload.
	 * @throws Exception
	 */
	public static void uploadFile(String orgID, String absoluteFilePath) throws Exception
	{
		//example
		//String absoluteFilePath = "/Users/user_name/Documents/Leads.zip";
		//String orgID = "673573045";
		
		//Get instance of BulkWriteOperations Class
		BulkWriteOperations bulkWriteOperations = new BulkWriteOperations();
		
		//Get instance of FileBodyWrapper class that will contain the request file
		com.zoho.crm.api.bulkwrite.FileBodyWrapper fileBodyWrapper = new com.zoho.crm.api.bulkwrite.FileBodyWrapper();
		
		//Get instance of StreamWrapper class that takes absolute path of the file to be attached as parameter
		StreamWrapper streamWrapper = new StreamWrapper(absoluteFilePath);
		
		//FileInputStream stream = new FileInputStream(absoluteFilePath);
		
		//Get instance of StreamWrapper class that takes file name and stream of the file to be attached as parameter
		//StreamWrapper streamWrapper = new StreamWrapper("Leads.zip", stream);
		
		//Set file to the FileBodyWrapper instance
		fileBodyWrapper.setFile(streamWrapper);
		
		//Get instance of HeaderMap Class
		HeaderMap headerInstance = new HeaderMap();
		
		//To indicate that this a bulk write operation
		headerInstance.add(UploadFileHeader.FEATURE, "bulk-write");
		
		headerInstance.add(UploadFileHeader.X_CRM_ORG, orgID);
		
		//Call uploadFile method that takes FileBodyWrapper instance and headerInstance as parameter
		APIResponse<ActionResponse> response = bulkWriteOperations.uploadFile(fileBodyWrapper, headerInstance);
		
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
					
					if(exception.getStatus() != null)
					{
						//Get the Status
						System.out.println("Status: " + exception.getStatus().getValue());
					}
					
					if(exception.getCode() != null)
					{
						//Get the Code
						System.out.println("Code: " + exception.getCode().getValue());	
					}
					
					if(exception.getMessage() != null)
					{
						//Get the Message
						System.out.println("Message: " + exception.getMessage().getValue());
					}
					
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
					
					if(exception.getErrorMessage() != null)
					{
						//Get the ErrorMessage
						System.out.println("ErrorMessage: " + exception.getErrorMessage().getValue());
					}
					
					//Get the ErrorCode
					System.out.println("ErrorCode: " + exception.getErrorCode());
					
					if(exception.getXError() != null)
					{
						//Get the XError
						System.out.println("XError: " + exception.getXError().getValue());
					}
					
					if(exception.getInfo() != null)
					{
						//Get the Info
						System.out.println("Info: " + exception.getInfo().getValue());
					}
					
					if(exception.getXInfo() != null)
					{
						//Get the XInfo
						System.out.println("XInfo: " + exception.getXInfo().getValue());
					}
					
					//Get the HttpStatus
					System.out.println("HttpStatus: " + exception.getHttpStatus());
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
	 * <h3> Create BulkWrite Job</h3>
	 * This method is used to create a bulk write job.
	 * @param moduleAPIName The API Name of the record's module.
	 * @param fileId The ID of the uploaded file to create BulkWrite Job.
	 */
	public static void createBulkWriteJob(String moduleAPIName, String fileId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//String fileId  = "3477061000006121001";
		
		//Get instance of BulkWriteOperations Class
		BulkWriteOperations bulkWriteOperations = new BulkWriteOperations();
		
		//Get instance of RequestWrapper Class that will contain the request body
		RequestWrapper requestWrapper = new RequestWrapper();
		
		//Get instance of CallBack Class
		CallBack callback = new CallBack();
		
		// To set valid callback URL.
		callback.setUrl("https://www.example.com/callback");
		
		//To set the HTTP method of the callback URL. The allowed value is post.
		callback.setMethod(new Choice<String>("post"));
		
		//The Bulk Write Job's details are posted to this URL on successful completion of job or on failure of job.
		requestWrapper.setCallback(callback);
		
		//To set the charset of the uploaded file
		requestWrapper.setCharacterEncoding("UTF-8");
		
		//To set the type of operation you want to perform on the bulk write job.
		requestWrapper.setOperation(new Choice<String>("upsert"));
		
		List<Resource> resource = new ArrayList<Resource>();
		
		//Get instance of Resource Class
		Resource resourceIns = new Resource();
		
		// To set the type of module that you want to import. The value is data.
		resourceIns.setType(new Choice<String>("data"));
		
		//To set API name of the module that you select for bulk write job.
		resourceIns.setModule(moduleAPIName);
		
		//To set the file_id obtained from file upload API.
		resourceIns.setFileId(fileId);
		
		//True - Ignores the empty values.The default value is false. 
		resourceIns.setIgnoreEmpty(true);
		
		// To set a field as a unique field or ID of a record. 
		resourceIns.setFindBy("Email");
		
		List<FieldMapping> fieldMappings = new ArrayList<FieldMapping>();
		
		FieldMapping fieldMapping;
		
		//Get instance of FieldMapping Class
		fieldMapping = new FieldMapping();
		
		//To set API name of the field present in Zoho module object that you want to import. 
		fieldMapping.setAPIName("Last_Name");
		
		//To set the column index of the field you want to map to the CRM field.
		fieldMapping.setIndex(0);
		
		fieldMappings.add(fieldMapping);

        fieldMapping = new FieldMapping();
        
        fieldMapping.setAPIName("Email");
		
		fieldMapping.setIndex(1);
		
		fieldMappings.add(fieldMapping);
		
		fieldMapping = new FieldMapping();
        
        fieldMapping.setAPIName("Company");
		
		fieldMapping.setIndex(2);
		
		fieldMappings.add(fieldMapping);
		
		fieldMapping = new FieldMapping();
        
        fieldMapping.setAPIName("Phone");
		
		fieldMapping.setIndex(3);
		
		fieldMappings.add(fieldMapping);
		
		fieldMapping = new FieldMapping();
        
        fieldMapping.setAPIName("Website");
		
        //fieldMapping.setFormat("");
        
        //fieldMapping.setFindBy("");
        
        Map<String, Object> defaultValue = new HashMap<String, Object>();
        
        defaultValue.put("value", "https://www.zohoapis.com");
        
        //To set the default value for an empty column in the uploaded file.
        fieldMapping.setDefaultValue(defaultValue);
        
		fieldMappings.add(fieldMapping);
		
		resourceIns.setFieldMappings(fieldMappings);
		
		resource.add(resourceIns);
		
		requestWrapper.setResource(resource);
       
		//Call createBulkWriteJob method that takes RequestWrapper instance as parameter 
		APIResponse<ActionResponse> response = bulkWriteOperations.createBulkWriteJob(requestWrapper);
		
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
	 * <h3> Get BulkWriteJob Details</h3>
	 * This method is used to get the details of a bulk write job performed previously.
	 * @param jobId The unique ID of the bulk write job.
	 * @throws Exception
	 */
	public static void getBulkWriteJobDetails(Long jobId) throws Exception
	{
		//example
		//Long jobId = 3477061000005615003l;
		
		//Get instance of BulkWriteOperations Class
		BulkWriteOperations bulkWriteOperations = new BulkWriteOperations();
		
		//Call getBulkWriteJobDetails method that takes jobId as parameter
		APIResponse<ResponseWrapper> response = bulkWriteOperations.getBulkWriteJobDetails(jobId);
		
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
				ResponseWrapper responseWrapper = response.getObject();
				
				if(responseWrapper instanceof BulkWriteResponse)
				{
					//Get the received BulkWriteResponse instance
					BulkWriteResponse bulkWriteResponse = (BulkWriteResponse) responseWrapper;
					
					//Get the Job Status of each bulkWriteResponse
					System.out.println("Bulk write Job Status: " + bulkWriteResponse.getStatus());
					
					//Get the CharacterEncoding of each bulkWriteResponse
					System.out.println("Bulk write CharacterEncoding: " + bulkWriteResponse.getCharacterEncoding());
					
					List<Resource> resources = bulkWriteResponse.getResource();
					
					if(resources != null)
					{
						for(Resource resource : resources)
						{
							//Get the Status of each Resource
							System.out.println("Bulk write Resource Status: " + resource.getStatus().getValue());
							
							//Get the Type of each Resource
							System.out.println("Bulk write Resource Type: " + resource.getType().getValue());
							
							//Get the Module of each Resource
							System.out.println("Bulk write Resource Module: " + resource.getModule());
							
							List<FieldMapping> fieldMappings = resource.getFieldMappings();
							
							if(fieldMappings != null)
							{
								for(FieldMapping fieldMapping : fieldMappings)
								{
									//Get the APIName of each FieldMapping
									System.out.println("Bulk write Resource FieldMapping Module: " + fieldMapping.getAPIName());
									
									if(fieldMapping.getIndex() != null)
									{
										//Get the Index of each FieldMapping
										System.out.println("Bulk write Resource FieldMapping Index: " + fieldMapping.getIndex().toString());
									}
									
									if(fieldMapping.getFormat() != null)
									{
										//Get the Format of each FieldMapping
										System.out.println("Bulk write Resource FieldMapping Format: " + fieldMapping.getFormat());
									}
									
									if(fieldMapping.getFindBy() != null)
									{
										//Get the FindBy of each FieldMapping
										System.out.println("Bulk write Resource FieldMapping FindBy: " + fieldMapping.getFindBy());
									}
									
									if(fieldMapping.getDefaultValue() != null)
									{
										//Get all entries from the keyValues map
										for(Map.Entry<String, Object>entry : fieldMapping.getDefaultValue().entrySet())
										{
											//Get each value from the map
											System.out.println(entry.getKey() + ": " + entry.getValue());
										}
									}
								}
							}
							
							com.zoho.crm.api.bulkwrite.File file = resource.getFile();
							
							if(file != null)
							{
								//Get the Status of each File
								System.out.println("Bulk write Resource File Status: " + file.getStatus().getValue());
								
								//Get the Name of each File
								System.out.println("Bulk write Resource File Name: " + file.getName());
								
								//Get the AddedCount of each File
								System.out.println("Bulk write Resource File AddedCount: " + file.getAddedCount().toString());
								
								//Get the SkippedCount of each File
								System.out.println("Bulk write Resource File SkippedCount: " + file.getSkippedCount().toString());
								
								//Get the UpdatedCount of each File
								System.out.println("Bulk write Resource File UpdatedCount: " + file.getUpdatedCount().toString());
								
								//Get the TotalCount of each File
								System.out.println("Bulk write Resource File TotalCount: " + file.getTotalCount().toString());
							}
							
							System.out.println("Bulk write Resource FindBy: " + resource.getFindBy());
						}
					}
					
					
					CallBack callback = bulkWriteResponse.getCallback();
					
					if(callback != null)
					{
						//Get the CallBack Url
						System.out.println("Bulk write CallBack Url: " + callback.getUrl());
						
						//Get the CallBack Method
						System.out.println("Bulk write CallBack Method: " + callback.getMethod().getValue());
					}
					
					//Get the ID of each BulkWriteResponse
					System.out.println("Bulk write ID: " + bulkWriteResponse.getId().toString());
					
					Result result = bulkWriteResponse.getResult();
					
					if(result != null)
					{
						//Get the DownloadUrl of the Result
						System.out.println("Bulk write DownloadUrl: " + result.getDownloadUrl());
					}
					//Get the CreatedBy User instance of each BulkWriteResponse
					com.zoho.crm.api.users.User createdBy = bulkWriteResponse.getCreatedBy();
					
					//Check if createdBy is not null
					if(createdBy != null)
					{
						//Get the ID of the CreatedBy User
						System.out.println("Bulkread Created By User-ID: " + createdBy.getId());
						
						//Get the Name of the CreatedBy User
						System.out.println("Bulkread Created By user-Name: " + createdBy.getName());
					}
					
					//Get the Operation of each BulkWriteResponse
					System.out.println("Bulk write Operation: " + bulkWriteResponse.getOperation());
					
					//Get the CreatedTime of each BulkWriteResponse
					System.out.println("Bulk write File CreatedTime: " + bulkWriteResponse.getCreatedTime().toString());
				}
				//Check if the request returned an exception
				else if(responseWrapper instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) responseWrapper;
					
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
	 * <h3> Download BulkWrite Result</h3>
	 * This method is used to download the result of the bulk write job as a CSV file.
	 * @param downloadUrl The URL present in the download_url parameter in the response of Get Bulk Write Job Details.
	 * @param destinationFolder The absolute path where downloaded file has to be stored.
	 * @throws Exception
	 */
	public static void downloadBulkWriteResult(String downloadUrl, String destinationFolder) throws Exception
	{
		//example
		//String downloadUrl = "https://download-accl.zoho.com/v2/crm/6735/bulk-write/347706122009/347706122009.zip";
		//String destinationFolder = "/Users/user_name/Documents";
		
		//Get instance of BulkWriteOperations Class
		BulkWriteOperations bulkWriteOperations = new BulkWriteOperations();
		
		//Call downloadBulkWriteResult method that takes downloadUrl as parameter
		APIResponse<ResponseHandler> response = bulkWriteOperations.downloadBulkWriteResult(downloadUrl);
		
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
				
				if(responseHandler instanceof FileBodyWrapper)
				{
					//Get object from response
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
					
					if(exception.getStatus() != null)
					{
						//Get the Status
						System.out.println("Status: " + exception.getStatus().getValue());
					}
					
					if(exception.getCode() != null)
					{
						//Get the Code
						System.out.println("Code: " + exception.getCode().getValue());
					}
					
					if(exception.getDetails() != null)
					{
						System.out.println("Details: " );
						
						//Get the details map
						for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
						{
							//Get each value in the map
							System.out.println(entry.getKey() + ": " + entry.getValue());
						}
					}
					
					if(exception.getMessage() != null)
					{
						//Get the Message
						System.out.println("Message: " + exception.getMessage().getValue());
					}
					
					if(exception.getXError() != null)
					{
						//Get the Message
						System.out.println("XError: " + exception.getXError().getValue());
					}
					
					if(exception.getXInfo() != null)
					{
						//Get the Message
						System.out.println("XInfo: " + exception.getXInfo().getValue());
					}
					
					if(exception.getHttpStatus() != null)
					{
						//Get the Message
						System.out.println("Message: " + exception.getHttpStatus());
					}
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
