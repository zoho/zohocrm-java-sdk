package samples.src.com.zoho.crm.api.bulkread;

import java.io.File;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.io.OutputStream;

import java.lang.reflect.Field;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.bulkread.APIException;

import com.zoho.crm.api.bulkread.ActionHandler;

import com.zoho.crm.api.bulkread.ActionResponse;

import com.zoho.crm.api.bulkread.ActionWrapper;

import com.zoho.crm.api.bulkread.BulkReadOperations;

import com.zoho.crm.api.bulkread.CallBack;

import com.zoho.crm.api.bulkread.Criteria;

import com.zoho.crm.api.bulkread.FileBodyWrapper;

import com.zoho.crm.api.bulkread.JobDetail;

import com.zoho.crm.api.bulkread.Query;

import com.zoho.crm.api.bulkread.RequestWrapper;

import com.zoho.crm.api.bulkread.ResponseHandler;

import com.zoho.crm.api.bulkread.ResponseWrapper;

import com.zoho.crm.api.bulkread.Result;

import com.zoho.crm.api.bulkread.SuccessResponse;

import com.zoho.crm.api.util.Choice;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.util.StreamWrapper;

public class BulkRead
{
	/**
	 * <h3> Create BulkRead Job </h3>
	 * This method is used to create a bulk read job to export records.
	 * @param moduleAPIName The API Name of the record's module
	 * @throws Exception
	 */
	public static void createBulkReadJob(String moduleAPIName) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		
		//Get instance of BulkReadOperations Class
		BulkReadOperations bulkReadOperations = new BulkReadOperations();
		
		//Get instance of RequestWrapper Class that will contain the request body
		RequestWrapper requestWrapper = new RequestWrapper();
		
		//Get instance of CallBack Class
		CallBack callback = new CallBack();
		
		// To set valid callback URL.
		callback.setUrl("https://www.example.com/callback");
		
		//To set the HTTP method of the callback URL. The allowed value is post.
		callback.setMethod(new Choice<String>("post"));
		
		//The Bulk Read Job's details is posted to this URL on successful completion / failure of job.
		requestWrapper.setCallback(callback);
		
		//Get instance of Query Class
		Query query = new Query();
		
		//Specifies the API Name of the module to be read.
		query.setModule(moduleAPIName);
		
		//Specifies the unique ID of the custom view whose records you want to export.
//		query.setCvid("3477061000000087501");
		
		// List of Field API Names
		List<String> fieldAPINames = new ArrayList<String>();
		
		fieldAPINames.add("Last_Name");
		
		//Specifies the API Name of the fields to be fetched.
		query.setFields(fieldAPINames);
		
		//To set page value, By default value is 1.
		query.setPage(1);
		
		//Get instance of Criteria Class
		Criteria criteria = new Criteria();
		
		criteria.setGroupOperator(new Choice<String>("or"));
		
		List<Criteria> criteriaList = new ArrayList<Criteria>();
		
		Criteria group11 = new Criteria();
		
		group11.setGroupOperator(new Choice<String>("and"));
		
		List<Criteria> groupList11 = new ArrayList<Criteria>();
		
		Criteria group111 = new Criteria();
		
		group111.setAPIName("All_day");
		
		group111.setComparator(new Choice<String>("equal"));
		
		group111.setValue(false);
		
		groupList11.add(group111);
		
		Criteria group112 = new Criteria();
		
		group112.setAPIName("Owner");
		
		group112.setComparator(new Choice<String>("in"));
		
		List<String> owner = new ArrayList<String>(Arrays.asList("3477061000000173021"));
		
		group112.setValue(owner);
		
		groupList11.add(group112);
		
		group11.setGroup(groupList11);
		
		criteriaList.add(group11);
		
		Criteria group12 = new Criteria();
		
		group12.setGroupOperator(new Choice<String>("or"));
		
		List<Criteria> groupList12 = new ArrayList<Criteria>();
		
		Criteria group121 = new Criteria();
		
		group121.setAPIName("Event_Title");
		
		group121.setComparator(new Choice<String>("equal"));
		
		group121.setValue("New Automated Event");
		
		groupList12.add(group121);
		
		Criteria group122 = new Criteria();
		
		// To set API name of a field.
		group122.setAPIName("Created_Time");
		
		// To set comparator(eg: equal, greater_than.).
		group122.setComparator(new Choice<String>("between"));
		
		List<String> createdTime = new ArrayList<String>(Arrays.asList("2020-06-03T17:31:48+05:30", "2020-06-03T17:31:48+05:30"));
		
		// To set the value to be compare.
		group122.setValue(createdTime);
		
		groupList12.add(group122);
		
		group12.setGroup(groupList12);
		
		criteriaList.add(group12);
		
		criteria.setGroup(criteriaList);
		
		//To filter the records to be exported.
		query.setCriteria(criteria);
		
		//To set query JSON object.
		requestWrapper.setQuery(query);
		
		//Specify the value for this key as "ics" to export all records in the Events module as an ICS file.
		//requestWrapper.setFileType(new Choice<String>("ics"));
		
		//Sample request body
		
//		{"query":{"criteria":{"group_operator":"or","group":[{"group_operator":"and","group":[{"comparator":"equal","api_name":"All_day","value":false},
//       {"comparator":"in","api_name":"Owner","value":["3477061001"]}]},{"group_operator":"or","group":[{"comparator":"equal","api_name":"Event_Title","value":"New Event"},
//       {"comparator":"between","api_name":"Created_Time","value":["2020-06-03T17:31:48+05:30","2020-06-03T17:31:48+05:30"]}]}]},"module":"Events","page":1},
//		"callback":{"method":"post","url":"https://www.example.com/callback"}}
//		
		//Call createBulkReadJob method that takes RequestWrapper instance as parameter 
		APIResponse<ActionHandler> response = bulkReadOperations.createBulkReadJob(requestWrapper);
		
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
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Get BulkRead Job Details</h3>
	 * This method is used to get the details of a bulk read job performed previously.
	 * @param jobId The unique ID of the bulk read job.
	 * @throws Exception
	 */
	public static void getBulkReadJobDetails(Long jobId) throws Exception
	{
		//example
		//Long jobId = 3477061000005177002l;
		
		//Get instance of BulkReadOperations Class
		BulkReadOperations bulkReadOperations = new BulkReadOperations();
		
		//Call getBulkReadJobDetails method that takes jobId as parameter
		APIResponse<ResponseHandler> response = bulkReadOperations.getBulkReadJobDetails(jobId);
		
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
					
					//Get the list of obtained jobDetail instances
					List<JobDetail> jobDetails = responseWrapper.getData();
				
					for(JobDetail jobDetail : jobDetails)
					{
						//Get the Job ID of each jobDetail
						System.out.println("Bulk read Job ID: " + jobDetail.getId());
						
						//Get the Operation of each jobDetail
						System.out.println("Bulk read Operation: " + jobDetail.getOperation());
						
						//Get the Operation of each jobDetail
						System.out.println("Bulk read State: " + jobDetail.getState().getValue());
						
						//Get the Result instance of each jobDetail
						Result result = jobDetail.getResult();
						
						//Check if Result is not null
						if(result != null)
						{
							//Get the Page of the Result
							System.out.println("Bulkread Result Page: " + result.getPage().toString());
							
							//Get the Count of the Result
							System.out.println("Bulkread Result Count: "+ result.getCount().toString());
							
							//Get the Download URL of the Result
							System.out.println("Bulkread Result Download URL: "+ result.getDownloadUrl());
							
							//Get the Per_Page of the Result
							System.out.println("Bulkread Result Per_Page: "+ result.getPerPage().toString());
							
							//Get the MoreRecords of the Result
							System.out.println("Bulkread Result MoreRecords: "+ result.getMoreRecords().toString());
							
						}
						
						// Get the Query instance of each jobDetail
						Query query = jobDetail.getQuery();
						
						if(query != null)
						{
							//Get the Module Name of the Query
							System.out.println("Bulk read Query Module: " + query.getModule());
							
							//Get the Page of the Query
							System.out.println("Bulk read Query Page: " + query.getPage().toString());
							
							//Get the cvid of the Query
							System.out.println("Bulk read Query cvid: " + query.getCvid());
							
							//Get the fields List of each Query
							List<String> fields = query.getFields();
							
							//Check if fields is not null
							if(fields != null)
							{
								for(Object fieldName : fields)
								{
									//Get the Field Name of the Query
									System.out.println("Bulk read Query Fields: " + fieldName);
								}
							}
							
							// Get the Criteria instance of each Query
							Criteria criteria = query.getCriteria();
							
							//Check if criteria is not null
							if(criteria != null)
							{
								printCriteria(criteria);
							}
						}
						
						//Get the CreatedBy User instance of each jobDetail
						com.zoho.crm.api.users.User createdBy = jobDetail.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the ID of the CreatedBy User
							System.out.println("Bulkread Created By User-ID: " + createdBy.getId());
							
							//Get the Name of the CreatedBy User
							System.out.println("Bulkread Created By user-Name: " + createdBy.getName());
						}
						
						//Get the CreatedTime of each jobDetail
						System.out.println("Bulkread CreatedTime: " + jobDetail.getCreatedTime());
						
						//Get the ID of each jobDetail
						System.out.println("Bulkread File Type: " + jobDetail.getFileType());
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
	
	private static void printCriteria(Criteria criteria)
    {
		//Get the APIName of the Criteria
		System.out.println("Bulk read Query Criteria APIName: " + criteria.getAPIName());
		
		if(criteria.getComparator() != null)
		{
			//Get the Comparator of the Criteria
			System.out.println("Bulk read Query Criteria Comparator: " + criteria.getComparator().getValue());
		}
		
		if(criteria.getValue() != null)
		{
			//Get the Value of the Criteria
			System.out.println("Bulk read Query Criteria Value: " + criteria.getValue().toString());
		}
		
		//Get the List of Criteria instance of each Criteria
		List<Criteria> criteriaGroup = criteria.getGroup();
		
		if(criteriaGroup != null)
		{
			for(Criteria criteria1 : criteriaGroup)
			{
				printCriteria(criteria1);
			}
		}
		
		if(criteria.getGroupOperator() != null)
		{
			//Get the Group Operator of the Criteria
			System.out.println("Bulk read Query Criteria Group Operator: " + criteria.getGroupOperator().getValue());	
		}
    }
	
	/**
	 * <h3> Download Result</h3>
	 * This method is used to download the bulk read job as a CSV or an ICS file (only for the Events module). 
	 * @param jobId The unique ID of the bulk read job.
	 * @param destinationFolder The absolute path where downloaded file has to be stored.
	 * @throws Exception
	 */
	public static void downloadResult(Long jobId, String destinationFolder) throws Exception
	{
		//example
		//Long jobId = 3477061000005177002l;
		//String destinationFolder = "/Users/user_name/Documents";
		
		//Get instance of BulkReadOperations Class
		BulkReadOperations bulkReadOperations = new BulkReadOperations();
		
		//Call downloadResult method that takes jobId as parameters
		APIResponse<ResponseHandler> response = bulkReadOperations.downloadResult(jobId);
		
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
}
