package samples.src.com.zoho.crm.api.file;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.io.OutputStream;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.file.APIException;

import com.zoho.crm.api.file.ActionHandler;

import com.zoho.crm.api.file.ActionResponse;

import com.zoho.crm.api.file.ActionWrapper;

import com.zoho.crm.api.file.BodyWrapper;

import com.zoho.crm.api.file.FileBodyWrapper;

import com.zoho.crm.api.file.FileOperations;

import com.zoho.crm.api.file.ResponseHandler;

import com.zoho.crm.api.file.SuccessResponse;

import com.zoho.crm.api.file.FileOperations.GetFileParam;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.util.StreamWrapper;

public class File
{
	/**
	 * <h3> Upload File</h3>
	 * This method is used to upload a file and print the response.
	 * @throws Exception
	 */
	public static void uploadFiles() throws Exception
	{
		//Get instance of RecordOperations Class
		FileOperations fileOperations = new FileOperations();
		
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//Get instance of StreamWrapper class that takes absolute path of the file to be attached as parameter
		StreamWrapper streamWrapper = new StreamWrapper("/Users/abc-XXX/Desktop/py.html");

		//Get instance of StreamWrapper class that takes absolute path of the file to be attached as parameter
		StreamWrapper streamWrapper1 = new StreamWrapper("/Users/abc-XXX/Desktop/one.txt");

		//Get instance of StreamWrapper class that takes absolute path of the file to be attached as parameter
		StreamWrapper streamWrapper2 = new StreamWrapper("/Users/abc-XXX/Desktop/pic.jpg");

		bodyWrapper.setFile(new ArrayList<>(Arrays.asList(streamWrapper, streamWrapper1, streamWrapper2)));
		
		ParameterMap paramInstance = new ParameterMap();
		
		//Call uploadFiles method that takes BodyWrapper instance as parameter.
		APIResponse<ActionHandler> response = fileOperations.uploadFiles(bodyWrapper, paramInstance);
		
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
	 * <h3> Get File</h3>
	 * @param id - The ID of the uploaded File.
	 * @param destinationFolder - The absolute path of the destination folder to store the File
	 * @throws Exception
	 */
	public static void getFile(String id, String destinationFolder) throws Exception
	{
		//example
		//String id = "ae9c7cefa418aec1d6a5cc2d9ab35c3231aae3bfeef7d5e00a54b7563c0dd42b";
		//String destinationFolder = "/Users/user_name/Desktop"
		
		//Get instance of FileOperations Class
		FileOperations fileOperations = new FileOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetFileParam.ID, id);
		
		//Call getFile method that takes paramInstance as parameters
		APIResponse<ResponseHandler> response = fileOperations.getFile(paramInstance);
		
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
					java.io.File file = new java.io.File(destinationFolder + java.io.File.separatorChar + streamWrapper.getName());
					
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
			else if(response.getStatusCode() != 204 )
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
