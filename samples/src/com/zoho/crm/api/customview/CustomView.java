package samples.src.com.zoho.crm.api.customview;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.Param;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.customviews.APIException;

import com.zoho.crm.api.customviews.Criteria;

import com.zoho.crm.api.customviews.CustomViewsOperations;

import com.zoho.crm.api.customviews.CustomViewsOperations.GetCustomViewsParam;

import com.zoho.crm.api.customviews.Info;

import com.zoho.crm.api.customviews.ResponseHandler;

import com.zoho.crm.api.customviews.ResponseWrapper;

import com.zoho.crm.api.customviews.SharedDetails;

import com.zoho.crm.api.customviews.Translation;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class CustomView
{
	/**
	 * <h3> Get CustomViews </h3>
	 * This method is used to get the custom views data of a particular module.
	 * Specify the module name in your API request whose custom view data you want to retrieve.
	 * @param moduleAPIName - Specify the API name of the required module.
	 * @throws Exception
	 */
	public static void getCustomViews(String moduleAPIName) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		
		//Get instance of CustomViewOperations Class that takes moduleAPIName as parameter
		CustomViewsOperations customViewsOperations = new CustomViewsOperations(moduleAPIName);
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetCustomViewsParam.PER_PAGE, 2);
		
		paramInstance.add(GetCustomViewsParam.PAGE, 1);
		
		paramInstance.add(new Param<String>("module", null), "Contacts");

		//Call getCustomViews method
		APIResponse<ResponseHandler> response = customViewsOperations.getCustomViews(paramInstance);
		
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
					
					//Get the list of obtained CustomView instances
					List<com.zoho.crm.api.customviews.CustomView> customViews = responseWrapper.getCustomViews();
				
					for(com.zoho.crm.api.customviews.CustomView customView : customViews)
					{
						//Get the DisplayValue of each CustomView
						System.out.println("CustomView DisplayValue: " + customView.getDisplayValue());
						
						//Get the Offline of the each CustomView
						System.out.println("CustomView Offline: " + customView.getOffline().toString());
						
						//Get the Default of each CustomView
						System.out.println("CustomView Default: " + customView.getDefault().toString());
						
						//Get the SystemName of each CustomView
						System.out.println("CustomView SystemName: " + customView.getSystemName());
						
						//Get the SystemDefined of each CustomView
						System.out.println("CustomView SystemDefined: " + customView.getSystemDefined().toString());
						
						//Get the Name of each CustomView
						System.out.println("CustomView Name: " + customView.getName());
						
						//Get the ID of each CustomView
						System.out.println("CustomView ID: " + customView.getId());
						
						//Get the Category of each CustomView
						System.out.println("CustomView Category: " + customView.getCategory());
						
						if(customView.getFavorite() != null)
						{
							//Get the Favorite of each CustomView
							System.out.println("CustomView Favorite: " + customView.getFavorite().toString());
						}
					}
					
					//Get the Object obtained Info instance
					Info info = responseWrapper.getInfo();
					
					//Check if info is not null
					if(info != null)
					{
						if(info.getPerPage() != null)
						{
							//Get the PerPage of the Info
							System.out.println("CustomView Info PerPage: " + info.getPerPage().toString());
						}
						
						if(info.getDefault() != null)
						{
							//Get the Default of the Info
							System.out.println("CustomView Info Default: " + info.getDefault());
						}
						
						if(info.getCount() != null)
						{
							//Get the Count of the Info
							System.out.println("CustomView Info Count: " + info.getCount().toString());
						}
						
						//Get the Translation instance of CustomView
						Translation translation = info.getTranslation();
						
						if(translation != null)
						{
							//Get the PublicViews of the Translation
							System.out.println("CustomView Info Translation PublicViews: " + translation.getPublicViews());
							
							//Get the OtherUsersViews of the Translation
							System.out.println("CustomView Info Translation OtherUsersViews: " + translation.getOtherUsersViews());
							
							//Get the SharedWithMe of the Translation
							System.out.println("CustomView Info Translation SharedWithMe: " + translation.getSharedWithMe());
							
							//Get the CreatedByMe of the Translation
							System.out.println("CustomView Info Translation CreatedByMe: " + translation.getCreatedByMe());
						}
						
						if(info.getPage() != null)
						{
							//Get the Page of the Info
							System.out.println("CustomView Info Page: " + info.getPage().toString());
						}
						
						if(info.getMoreRecords() != null)
						{
							//Get the MoreRecords of the Info
							System.out.println("CustomView Info MoreRecords: " + info.getMoreRecords().toString());
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
	 * This method is used to get the data of any specific custom view of the module.
	 * Specify the custom view ID of the module in your API request whose custom view data you want to retrieve.
	 * @param moduleAPIName - Specify the API name of the required module.
	 * @param customViewId - ID of the CustomView to be obtained.
	 * @throws Exception
	 */
	public static void getCustomView(String moduleAPIName, Long customViewId) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long customViewId = 3477061000005629003;
		
		//Get instance of CustomViewOperations Class that takes moduleAPIName as parameter
		CustomViewsOperations customViewsOperations = new CustomViewsOperations(moduleAPIName);
		
		//Call getCustomView method that takes customViewId as parameter
		APIResponse<ResponseHandler> response = customViewsOperations.getCustomView(customViewId);
		
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
					
					//Get the list of obtained CustomView instances
					List<com.zoho.crm.api.customviews.CustomView> customViews = responseWrapper.getCustomViews();
				
					for(com.zoho.crm.api.customviews.CustomView customView : customViews)
					{
						//Get the DisplayValue of each CustomView
						System.out.println("CustomView DisplayValue: " + customView.getDisplayValue());
						
						//Get the SharedType of each CustomView
						System.out.println("CustomView SharedType: " + customView.getSharedType());
						
						//Get the SystemName of each CustomView
						System.out.println("CustomView SystemName: " + customView.getSystemName());
						
						// Get the Criteria instance of each CustomView
						Criteria criteria = customView.getCriteria();
						
						//Check if criteria is not null
						if(criteria != null)
						{
							printCriteria(criteria);
						}
						
						List<SharedDetails> sharedDetails = customView.getSharedDetails();
						
						if(sharedDetails != null)
						{
							for(SharedDetails sharedDetail : sharedDetails)
							{
								//Get the Name of the each SharedDetails
								System.out.println("SharedDetails Name: " + sharedDetail.getName());
								
								//Get the ID of the each SharedDetails
								System.out.println("SharedDetails ID: " + sharedDetail.getId());
								
								//Get the Type of the each SharedDetails
								System.out.println("SharedDetails Type: " + sharedDetail.getType());
								
								//Get the Subordinates of the each SharedDetails
								System.out.println("SharedDetails Subordinates: " + sharedDetail.getSubordinates().toString());
							}
						}
						
						//Get the SortBy of the each CustomView
						System.out.println("CustomView SortBy: " + customView.getSortBy());
						
						//Get the Offline of the each CustomView
						System.out.println("CustomView Offline: " + customView.getOffline().toString());
						
						//Get the Default of each CustomView
						System.out.println("CustomView Default: " + customView.getDefault().toString());
						
						//Get the SystemDefined of each CustomView
						System.out.println("CustomView SystemDefined: " + customView.getSystemDefined().toString());
						
						//Get the Name of each CustomView
						System.out.println("CustomView Name: " + customView.getName());
						
						//Get the ID of each CustomView
						System.out.println("CustomView ID: " + customView.getId());
						
						//Get the Category of each CustomView
						System.out.println("CustomView Category: " + customView.getCategory());
						
						//Get the list of fields in each CustomView
						List<String> fields = customView.getFields();
						
						if(fields != null)
						{
							for(String field : fields)
							{
								System.out.println(field);
							}
						}
						
						if(customView.getFavorite() != null)
						{
							//Get the Favorite of each CustomView
							System.out.println("CustomView Favorite: " + customView.getFavorite().toString());
						}
						
						if(customView.getSortOrder() != null)
						{
							//Get the SortOrder of each CustomView
							System.out.println("CustomView SortOrder: " + customView.getSortOrder().toString());
						}
					}
					
					//Get the Object obtained Info instance
					Info info = responseWrapper.getInfo();
					
					//Check if info is not null
					if(info != null)
					{
						//Get the Translation instance of CustomView
						Translation translation = info.getTranslation();
						
						if(translation != null)
						{
							//Get the PublicViews of the Translation
							System.out.println("CustomView Info Translation PublicViews: " + translation.getPublicViews());
							
							//Get the OtherUsersViews of the Translation
							System.out.println("CustomView Info Translation OtherUsersViews: " + translation.getOtherUsersViews());
							
							//Get the SharedWithMe of the Translation
							System.out.println("CustomView Info Translation SharedWithMe: " + translation.getSharedWithMe());
							
							//Get the CreatedByMe of the Translation
							System.out.println("CustomView Info Translation CreatedByMe: " + translation.getCreatedByMe());
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
		if(criteria.getComparator() != null)
		{
			//Get the Comparator of the Criteria
			System.out.println("CustomView Criteria Comparator: " + criteria.getComparator().getValue());
		}
		
		//Get the Field of the Criteria
		System.out.println("CustomView Criteria Field: " + criteria.getField());
		
		if(criteria.getValue() != null)
		{
			//Get the Value of the Criteria
			System.out.println("CustomView Criteria Value: " + criteria.getValue().toString());
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
			System.out.println("CustomView Criteria Group Operator: " + criteria.getGroupOperator().getValue());
		}
    }
}
