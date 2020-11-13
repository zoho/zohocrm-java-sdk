package samples.src.com.zoho.crm.api.relatedlist;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.relatedlists.APIException;

import com.zoho.crm.api.relatedlists.RelatedListsOperations;

import com.zoho.crm.api.relatedlists.ResponseHandler;

import com.zoho.crm.api.relatedlists.ResponseWrapper;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class RelatedList
{
	/**
	 * <h3> Get RelatedLists </h3>
	 * This method is used to get the related list data of a particular module and print the response.
	 * @param moduleAPIName - The API Name of the module to get related lists
	 * @throws Exception
	 */
	public static void getRelatedLists(String moduleAPIName) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		
		//Get instance of RelatedListsOperations Class that takes moduleAPIName as parameter
		RelatedListsOperations relatedListsOperations = new RelatedListsOperations(moduleAPIName);
		
		//Call getRelatedLists method
		APIResponse<ResponseHandler> response = relatedListsOperations.getRelatedLists();
		
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
					
					//Get the list of obtained RelatedList instances
					List<com.zoho.crm.api.relatedlists.RelatedList> relatedLists = responseWrapper.getRelatedLists();
				
					for(com.zoho.crm.api.relatedlists.RelatedList relatedList : relatedLists)
					{
						//Get the SequenceNumber of each RelatedList
						System.out.println("RelatedList SequenceNumber: " + relatedList.getSequenceNumber());
						
						//Get the DisplayLabel of each RelatedList
						System.out.println("RelatedList DisplayLabel: " + relatedList.getDisplayLabel());
						
						//Get the APIName of each RelatedList
						System.out.println("RelatedList APIName: " + relatedList.getAPIName());
						
						//Get the Module of each RelatedList
						System.out.println("RelatedList Module: " + relatedList.getModule());
						
						//Get the Name of each RelatedList
						System.out.println("RelatedList Name: " + relatedList.getName());
						
						//Get the Action of each RelatedList
						System.out.println("RelatedList Action: " + relatedList.getAction());
	
						//Get the ID of each RelatedList
						System.out.println("RelatedList ID: " + relatedList.getId());
						
						//Get the Href of each RelatedList
						System.out.println("RelatedList Href: " + relatedList.getHref());
						
						//Get the Type of each RelatedList
						System.out.println("RelatedList Type: " + relatedList.getType());
						
						//Get the Connected Module of each RelatedList
						System.out.println("RelatedList Connectedmodule: " + relatedList.getConnectedmodule());
						
						//Get the Linking Module of each RelatedList
						System.out.println("RelatedList Linkingmodule: " + relatedList.getLinkingmodule());
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
	 * <h3> Get RelatedList </h3>
	 * This method is used to get the single related list data of a particular module with relatedListId and print the response.
	 * @param moduleAPIName - The API Name of the module to get related list
	 * @param relatedListId - The ID of the relatedList to be obtained
	 * @throws Exception
	 */
	public static void getRelatedList(String moduleAPIName, Long relatedListId) throws Exception
	{
		//example,
		//String moduleAPIName = "Leads";
		//Long relatedListId = 525508000005067912l;
	
		//Get instance of RelatedListsOperations Class that takes moduleAPIName as parameter
		RelatedListsOperations relatedListsOperations = new RelatedListsOperations(moduleAPIName);
		
		//Call getRelatedList method which takes relatedListId as parameter
		APIResponse<ResponseHandler> response = relatedListsOperations.getRelatedList(relatedListId);
		
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
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the list of obtained CustomView instances
					List<com.zoho.crm.api.relatedlists.RelatedList> relatedLists = responseWrapper.getRelatedLists();
				
					for(com.zoho.crm.api.relatedlists.RelatedList relatedList : relatedLists)
					{
						//Get the SequenceNumber of each RelatedList
						System.out.println("RelatedList SequenceNumber: " + relatedList.getSequenceNumber());
						
						//Get the DisplayLabel of each RelatedList
						System.out.println("RelatedList DisplayLabel: " + relatedList.getDisplayLabel());
						
						//Get the APIName of each RelatedList
						System.out.println("RelatedList APIName: " + relatedList.getAPIName());
						
						//Get the Module of each RelatedList
						System.out.println("RelatedList Module: " + relatedList.getModule());
						
						//Get the Name of each RelatedList
						System.out.println("RelatedList Name: " + relatedList.getName());
						
						//Get the Action of each RelatedList
						System.out.println("RelatedList Action: " + relatedList.getAction());
	
						//Get the ID of each RelatedList
						System.out.println("RelatedList ID: " + relatedList.getId());
						
						//Get the Href of each RelatedList
						System.out.println("RelatedList Href: " + relatedList.getHref());
						
						//Get the Type of each RelatedList
						System.out.println("RelatedList Type: " + relatedList.getType());

						//Get the Connected Module of each RelatedList
						System.out.println("RelatedList Connectedmodule: " + relatedList.getConnectedmodule());
						
						//Get the Linking Module of each RelatedList
						System.out.println("RelatedList Linkingmodule: " + relatedList.getLinkingmodule());
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