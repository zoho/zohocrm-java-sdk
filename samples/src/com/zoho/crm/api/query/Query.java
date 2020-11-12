package samples.src.com.zoho.crm.api.query;

import java.lang.reflect.Field;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.query.ResponseHandler;

import com.zoho.crm.api.query.ResponseWrapper;

import com.zoho.crm.api.record.Info;

import com.zoho.crm.api.query.APIException;

import com.zoho.crm.api.query.BodyWrapper;

import com.zoho.crm.api.query.QueryOperations;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class Query
{
	/**
	 * <h3> Get Records </h3>
	 * This method is used to get records from the module through a COQL query.
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void getRecords() throws Exception
	{
		//Get instance of QueryOperations Class
		QueryOperations queryOperations = new QueryOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		String selectQuery = "select Last_Name from Leads where Last_Name is not null limit 200";
		
		bodyWrapper.setSelectQuery(selectQuery);
		
		//Call getRecords method that takes BodyWrapper instance as parameter 
		APIResponse<ResponseHandler> response = queryOperations.getRecords(bodyWrapper);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get the object from response
				ResponseHandler responseHandler = response.getObject();
				
				if(responseHandler instanceof ResponseWrapper)
				{
					//Get the received ResponseWrapper instance
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the obtained Record instances
					List<com.zoho.crm.api.record.Record> records = responseWrapper.getData();
					
					for(com.zoho.crm.api.record.Record record : records)
					{					
						//Get the ID of each Record
						System.out.println("Record ID: " + record.getId());
						
						//Get the createdBy User instance of each Record
						com.zoho.crm.api.users.User createdBy = record.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the ID of the createdBy User
							System.out.println("Record Created By User-ID: " + createdBy.getId());
							
							//Get the name of the createdBy User
							System.out.println("Record Created By User-Name: " + createdBy.getName());
							
							//Get the Email of the createdBy User
							System.out.println("Record Created By User-Email: " + createdBy.getEmail());
						}
						
						//Get the CreatedTime of each Record
						System.out.println("Record CreatedTime: " + record.getCreatedTime());
						
						//Get the modifiedBy User instance of each Record
						com.zoho.crm.api.users.User modifiedBy = record.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the ID of the modifiedBy User
							System.out.println("Record Modified By User-ID: " + modifiedBy.getId());
							
							//Get the name of the modifiedBy User
							System.out.println("Record Modified By User-Name: " + modifiedBy.getName());
							
							//Get the Email of the modifiedBy User
							System.out.println("Record Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the ModifiedTime of each Record
						System.out.println("Record ModifiedTime: " + record.getModifiedTime());
						
						//To get particular field value 
						System.out.println("Record Field Value: " + record.getKeyValue("Last_Name"));// FieldApiName
						
						System.out.println("Record KeyValues: " );
						
						//Get the KeyValue map
						for(Map.Entry<String, Object> entry : record.getKeyValues().entrySet())
						{
							String keyName = entry.getKey();
							
							Object value = entry.getValue();
							
							if(value instanceof List)
							{
								System.out.println("Record KeyName : " + keyName);
								
								List<?> dataList = (List<?>) value;
								
								for(Object data : dataList)
								{
									if(data instanceof Map)
									{
										System.out.println("Record KeyName : " + keyName  + " - Value : ");
										
										for(Map.Entry<String, Object> mapValue : ((HashMap<String,Object>) data).entrySet())
										{
											System.out.println(mapValue.getKey()  + " : " + mapValue.getValue());
										}
									}
									else
									{
										System.out.println(data);
									}
								}
							}
							else if (value instanceof Map)
							{
								System.out.println("Record KeyName : " + keyName  + " - Value : ");
								
								for(Map.Entry<String, Object> mapValue : ((HashMap<String,Object>) value).entrySet())
								{
									System.out.println(mapValue.getKey()  + " : " + mapValue.getValue());
								}
							}
							else
							{
								System.out.println("Record KeyName : " + keyName  + " - Value : " + value);
							}
						}
					}
					
					//Get the Object obtained Info instance
					Info info = responseWrapper.getInfo();
					
					//Check if info is not null
					if(info != null)
					{
						if(info.getCount() != null)
						{
							//Get the Count of the Info
							System.out.println("Record Info Count: " + info.getCount().toString());
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
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
}
