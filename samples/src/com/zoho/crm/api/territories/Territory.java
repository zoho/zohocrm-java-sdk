package samples.src.com.zoho.crm.api.territories;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.customviews.Criteria;

import com.zoho.crm.api.territories.APIException;

import com.zoho.crm.api.territories.ResponseHandler;

import com.zoho.crm.api.territories.ResponseWrapper;

import com.zoho.crm.api.territories.TerritoriesOperations;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class Territory
{
	/**
	 * <h3> Get Territories </h3>
	 * This method is used to get the list of territories enabled for your organization and print the response.
	 * @throws Exception
	 */
	public static void getTerritories() throws Exception
	{
		//Get instance of TerritoriesOperations Class
		TerritoriesOperations territoriesOperations = new TerritoriesOperations();
		
		//Call getTerritories method
		APIResponse<ResponseHandler> response = territoriesOperations.getTerritories();
		
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
					
					//Get the list of obtained Territory instances
					List<com.zoho.crm.api.territories.Territory> territoryList = responseWrapper.getTerritories();
				
					for(com.zoho.crm.api.territories.Territory territory : territoryList)
					{
						//Get the CreatedTime of each Territory
						System.out.println("Territory CreatedTime: " + territory.getCreatedTime());
						
						//Get the ModifiedTime of each Territory
						System.out.println("Territory ModifiedTime: " + territory.getModifiedTime());
						
						//Get the manager User instance of each Territory
						com.zoho.crm.api.users.User manager = territory.getManager();
						
						//Check if manager is not null
						if(manager != null)
						{
							//Get the Name of the Manager
							System.out.println("Territory Manager User-Name: " + manager.getName());
							
							//Get the ID of the Manager
							System.out.println("Territory Manager User-ID: " + manager.getId());
						}
						
						//Get the ParentId of each Territory
						System.out.println("Territory ParentId: " + territory.getParentId());
						
						// Get the Criteria instance of each Territory
						Criteria criteria = territory.getCriteria();
						
						//Check if criteria is not null
						if(criteria != null)
						{
							printCriteria(criteria);
						}
						
						//Get the Name of each Territory
						System.out.println("Territory Name: " + territory.getName());
						
						//Get the modifiedBy User instance of each Territory
						com.zoho.crm.api.users.User modifiedBy = territory.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Territory Modified By User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Territory Modified By User-ID: " + modifiedBy.getId());
						}
						
						//Get the Description of each Territory
						System.out.println("Territory Description: " + territory.getDescription());
						
						//Get the ID of each Territory
						System.out.println("Territory ID: " + territory.getId());
						
						//Get the createdBy User instance of each Territory
						com.zoho.crm.api.users.User createdBy = territory.getCreatedBy();
						
						//Check if createdBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Territory Created By User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Territory Created By User-ID: " + createdBy.getId());
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
	 * <h3> Get Territory </h3>
	 * This method is used to get the single territory and print the response.
	 * @param territoryId - The ID of the Territory to be obtained
	 * @throws Exception
	 */
	public static void getTerritory(Long territoryId) throws Exception
	{
		//example
		//Long territoryId = 3477061000003051397l;
		
		//Get instance of TerritoriesOperations Class
		TerritoriesOperations territoriesOperations = new TerritoriesOperations();
		
		//Call getTerritory method that takes territoryId as parameter
		APIResponse<ResponseHandler> response = territoriesOperations.getTerritory(territoryId);
		
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
					
					//Get the list of obtained Territory instances
					List<com.zoho.crm.api.territories.Territory> territoryList = responseWrapper.getTerritories();
				
					for(com.zoho.crm.api.territories.Territory territory : territoryList)
					{
						//Get the CreatedTime of each Territory
						System.out.println("Territory CreatedTime: " + territory.getCreatedTime());
						
						//Get the ModifiedTime of each Territory
						System.out.println("Territory ModifiedTime: " + territory.getModifiedTime());
						
						//Get the manager User instance of each Territory
						com.zoho.crm.api.users.User manager = territory.getManager();
						
						//Check if manager is not null
						if(manager != null)
						{
							//Get the Name of the Manager
							System.out.println("Territory Manager User-Name: " + manager.getName());
							
							//Get the ID of the Manager
							System.out.println("Territory Manager User-ID: " + manager.getId());
						}
						
						//Get the ParentId of each Territory
						System.out.println("Territory ParentId: " + territory.getParentId());
						
						// Get the Criteria instance of each Territory
						Criteria criteria = territory.getCriteria();
						
						//Check if criteria is not null
						if(criteria != null)
						{
							printCriteria(criteria);
						}
						
						//Get the Name of each Territory
						System.out.println("Territory Name: " + territory.getName());
						
						//Get the modifiedBy User instance of each Territory
						com.zoho.crm.api.users.User modifiedBy = territory.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Territory Modified By User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Territory Modified By User-ID: " + modifiedBy.getId());
						}
						
						//Get the Description of each Territory
						System.out.println("Territory Description: " + territory.getDescription());
						
						//Get the ID of each Territory
						System.out.println("Territory ID: " + territory.getId());
						
						//Get the createdBy User instance of each Territory
						com.zoho.crm.api.users.User createdBy = territory.getCreatedBy();
						
						//Check if createdBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Territory Created By User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Territory Created By User-ID: " + createdBy.getId());
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
	
	private static void printCriteria(Criteria criteria)
    {
		if(criteria.getField() != null)
		{
			//Get the Field of the Criteria
			System.out.println("Territory Criteria Field: " + criteria.getField());
		}
		
		if(criteria.getComparator() != null)
		{
			//Get the Comparator of the Criteria
			System.out.println("Territory Criteria Comparator: " + criteria.getComparator().getValue().toString());
		}
		
		if(criteria.getValue() != null)
		{
			//Get the Value of the Criteria
			System.out.println("Territory Criteria Value: " + criteria.getValue().toString());
		}
		
		// Get the List of Criteria instance of each Criteria
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
			System.out.println("Territory Criteria Group Operator: " + criteria.getGroupOperator().getValue().toString());
		}
		
    }
}
