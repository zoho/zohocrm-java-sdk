package samples.src.com.zoho.crm.api.notification;

import java.lang.reflect.Field;

import java.time.OffsetDateTime;

import java.time.ZoneOffset;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.notification.APIException;

import com.zoho.crm.api.notification.ActionHandler;

import com.zoho.crm.api.notification.ActionResponse;

import com.zoho.crm.api.notification.ActionWrapper;

import com.zoho.crm.api.notification.BodyWrapper;

import com.zoho.crm.api.notification.Info;

import com.zoho.crm.api.notification.NotificationOperations;

import com.zoho.crm.api.notification.NotificationOperations.DisableNotificationsParam;

import com.zoho.crm.api.notification.NotificationOperations.GetNotificationDetailsParam;

import com.zoho.crm.api.notification.ResponseHandler;

import com.zoho.crm.api.notification.ResponseWrapper;

import com.zoho.crm.api.notification.SuccessResponse;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class Notification
{
	/**
	 * <h3> Enable Notifications </h3>
	 * This method is used to Enable Notifications and print the response.
	 * @throws Exception
	 */
	public static void enableNotifications() throws Exception
	{
		//Get instance of NotificationOperations Class
		NotificationOperations notificationOperations = new NotificationOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Notification instances
		List<com.zoho.crm.api.notification.Notification> notifications = new ArrayList<com.zoho.crm.api.notification.Notification>();
		
		//Get instance of Notification Class
		com.zoho.crm.api.notification.Notification notification = new com.zoho.crm.api.notification.Notification();
		
		//Set channel Id of the Notification
		notification.setChannelId(100000006800211l);
		
		List<String> events = new ArrayList<String>();
		
		events.add("Deals.all");
		
		//To subscribe based on particular operations on given modules.
		notification.setEvents(events);
		
		//To set the expiry time for instant notifications. 
		notification.setChannelExpiry(OffsetDateTime.of(2020, 05, 20, 10, 00, 00, 01, ZoneOffset.of("+05:30")));
		
		//To ensure that the notification is sent from Zoho CRM, by sending back the given value in notification URL body.
		//By using this value, user can validate the notifications.
		notification.setToken("TOKEN_FOR_VERIFICATION_OF_1000000068002");
		
		//URL to be notified (POST request)
		notification.setNotifyUrl("https://www.zohoapis.com");
		
		//Add Notification instance to the list
		notifications.add(notification);
		
		//Get instance of Notification Class
		com.zoho.crm.api.notification.Notification notification2 = new com.zoho.crm.api.notification.Notification();
		
		//Set channel Id of the Notification
		notification2.setChannelId(100000006800211l);
		
		List<String> events2 = new ArrayList<String>();
		
		events2.add("Accounts.all");
		
		//To subscribe based on particular operations on given modules.
		notification2.setEvents(events2);
		
		//To set the expiry time for instant notifications. 
		notification2.setChannelExpiry(OffsetDateTime.of(2020, 05, 20, 10, 00, 00, 01, ZoneOffset.of("+05:30")));
		
		//To ensure that the notification is sent from Zoho CRM, by sending back the given value in notification URL body.
		//By using this value, user can validate the notifications.
		notification2.setToken("TOKEN_FOR_VERIFICATION_OF_1000000068002");
		
		//URL to be notified (POST request)
		notification2.setNotifyUrl("https://www.zohoapis.com");
		
		//Add Notification instance to the list
		notifications.add(notification2);
		
		//Set the list to notifications in BodyWrapper instance
		bodyWrapper.setWatch(notifications);
		
		//Call enableNotifications method that takes BodyWrapper instance as parameter 
		APIResponse<ActionHandler> response = notificationOperations.enableNotifications(bodyWrapper);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getWatch();
					
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
								if(entry.getValue() instanceof List)
								{
									List<?> dataList = (List<?>) entry.getValue();
									
									if(dataList.size() > 0 &&  dataList.get(0) instanceof com.zoho.crm.api.notification.Notification)
									{
										@SuppressWarnings("unchecked")
										List<com.zoho.crm.api.notification.Notification> eventList = (List<com.zoho.crm.api.notification.Notification>) dataList;
										
										for(com.zoho.crm.api.notification.Notification event : eventList)
										{
											//Get the ChannelExpiry of each Notification
											System.out.println("Notification ChannelExpiry: " + event.getChannelExpiry());
											
											//Get the ResourceUri each Notification
											System.out.println("Notification ResourceUri: " + event.getResourceUri());
											
											//Get the ResourceId each Notification
											System.out.println("Notification ResourceId: " + event.getResourceId());
											
											//Get the ResourceName each Notification
											System.out.println("Notification ResourceName: " + event.getResourceName());
											
											//Get the ChannelId each Notification
											System.out.println("Notification ChannelId: " + event.getChannelId());
										}
									}
								}
								else
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
	 * <h3> Get Notification Details </h3>
	 * This method is used to get all the Notification and print the response.
	 * @throws Exception
	 */
	public static void getNotificationDetails() throws Exception
	{
		//Get instance of NotificationOperations Class
		NotificationOperations notificationOperations = new NotificationOperations();
		
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetNotificationDetailsParam.CHANNEL_ID, 100000006800211l);
		
		paramInstance.add(GetNotificationDetailsParam.MODULE, "Accounts");
		
		paramInstance.add(GetNotificationDetailsParam.PAGE, 1);
		
		paramInstance.add(GetNotificationDetailsParam.PER_PAGE, 2);
		
		//Call getNotificationDetails method
		APIResponse<ResponseHandler> response = notificationOperations.getNotificationDetails(paramInstance);
		
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
					
					//Get the list of obtained Notification instances
					List<com.zoho.crm.api.notification.Notification> notifications = responseWrapper.getWatch();
					
					for(com.zoho.crm.api.notification.Notification notification : notifications)
					{
						//Get the NotifyOnRelatedAction of each Notification
						System.out.println("Notification NotifyOnRelatedAction: " + notification.getNotifyOnRelatedAction());
						
						//Get the ChannelExpiry of each Notification
						System.out.println("Notification ChannelExpiry: " + notification.getChannelExpiry());
						
						//Get the ResourceUri each Notification
						System.out.println("Notification ResourceUri: " + notification.getResourceUri());
						
						//Get the ResourceId each Notification
						System.out.println("Notification ResourceId: " + notification.getResourceId());
						
						//Get the NotifyUrl each Notification
						System.out.println("Notification NotifyUrl: " + notification.getNotifyUrl());
						
						//Get the ResourceName each Notification
						System.out.println("Notification ResourceName: " + notification.getResourceName());
						
						//Get the ChannelId each Notification
						System.out.println("Notification ChannelId: " + notification.getChannelId());
						
						//Get the events List of each Notification
						List<String> fields = notification.getEvents();
						
						//Check if fields is not null
						if(fields != null)
						{
							for(Object fieldName : fields)
							{
								//Get the Events
								System.out.println("Notification Events: " + fieldName);
							}
						}
						
						//Get the Token each Notification
						System.out.println("Notification Token: " + notification.getToken());
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
			else if(response.getStatusCode() != 204 )
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					field.setAccessible(true);
					
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	
	/**
	 * <h3> Update Notifications </h3>
	 * This method is used to update Notifications and print the response.
	 * @throws Exception
	 */
	public static void updateNotifications() throws Exception
	{
		//Get instance of NotificationOperations Class
		NotificationOperations notificationOperations = new NotificationOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Notification instances
		List<com.zoho.crm.api.notification.Notification> notificationList = new ArrayList<com.zoho.crm.api.notification.Notification>();

		//Get instance of Notification Class
		com.zoho.crm.api.notification.Notification notification = new com.zoho.crm.api.notification.Notification();
		
		//Set ChannelId to the Notification instance
//		notification.setChannelId(100000006800211l);
		
        List<String> events = new ArrayList<String>();
		
		events.add("Accounts.all");
		
		//To subscribe based on particular operations on given modules.
		notification.setEvents(events);
		
		//Set name to the Notification instance
		notification.setChannelExpiry(OffsetDateTime.now());
		
		//To ensure that the notification is sent from Zoho CRM, by sending back the given value in notification URL body.
		//By using this value, user can validate the notifications.
		notification.setToken("TOKEN_FOR_VERIFICATION_OF_1000000068002");
		
		//URL to be notified (POST request)
		notification.setNotifyUrl("https://www.zohoapis.com");
		
		//Add Notification instance to the list
		notificationList.add(notification);
		
		//Set the list to notification in BodyWrapper instance
		bodyWrapper.setWatch(notificationList);
		
		//Call updateNotifications method that takes BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = notificationOperations.updateNotifications(bodyWrapper);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getWatch();
					
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
								if(entry.getValue() instanceof List)
								{
									List<?> dataList = (List<?>) entry.getValue();
									
									if(dataList.size() > 0 &&  dataList.get(0) instanceof com.zoho.crm.api.notification.Notification)
									{
										@SuppressWarnings("unchecked")
										List<com.zoho.crm.api.notification.Notification> eventList = (List<com.zoho.crm.api.notification.Notification>) dataList;
										
										for(com.zoho.crm.api.notification.Notification event : eventList)
										{
											//Get the ChannelExpiry of each Notification
											System.out.println("Notification ChannelExpiry: " + event.getChannelExpiry());
											
											//Get the ResourceUri each Notification
											System.out.println("Notification ResourceUri: " + event.getResourceUri());
											
											//Get the ResourceId each Notification
											System.out.println("Notification ResourceId: " + event.getResourceId());
											
											//Get the ResourceName each Notification
											System.out.println("Notification ResourceName: " + event.getResourceName());
											
											//Get the ChannelId each Notification
											System.out.println("Notification ChannelId: " + event.getChannelId());
										}
									}
								}
								else
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
	 * <h3> Update Specific Information of a Notification </h3>
	 * This method is used to update single Notification and print the response.
	 * @throws Exception
	 */
	public static void updateNotification() throws Exception
	{
		//Get instance of NotificationOperations Class
		NotificationOperations notificationOperations = new NotificationOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Notification instances
		List<com.zoho.crm.api.notification.Notification> notificationList = new ArrayList<com.zoho.crm.api.notification.Notification>();

		//Get instance of Notification Class
		com.zoho.crm.api.notification.Notification notification = new com.zoho.crm.api.notification.Notification();
		
		//Set ChannelId to the Notification instance
		notification.setChannelId(100000006800212l);
		
        List<String> events = new ArrayList<String>();
		
		events.add("Deals.all");
		
		//To subscribe based on particular operations on given modules.
		notification.setEvents(events);
		
		//Set name to the Notification instance
		notification.setChannelExpiry(OffsetDateTime.now());
		
		//To ensure that the notification is sent from Zoho CRM, by sending back the given value in notification URL body.
		//By using this value, user can validate the notifications.
		notification.setToken("TOKEN_FOR_VERIFICATION_OF_1000000068002");
		
		//URL to be notified (POST request)
		notification.setNotifyUrl("https://www.zohoapis.com");
		
		//Add Notification instance to the list
		notificationList.add(notification);
		
		//Set the list to notification in BodyWrapper instance
		bodyWrapper.setWatch(notificationList);
		
		//Call updateNotification method that takes BodyWrapper instance as parameters
		APIResponse<ActionHandler> response = notificationOperations.updateNotification(bodyWrapper);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getWatch();
					
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
								if(entry.getValue() instanceof List)
								{
									List<?> dataList = (List<?>) entry.getValue();
									
									if(dataList.size() > 0 && dataList.get(0) instanceof com.zoho.crm.api.notification.Notification)
									{
										@SuppressWarnings("unchecked")
										List<com.zoho.crm.api.notification.Notification> eventList = (List<com.zoho.crm.api.notification.Notification>) dataList;
										
										for(com.zoho.crm.api.notification.Notification event : eventList)
										{
											//Get the ChannelExpiry of each Notification
											System.out.println("Notification ChannelExpiry: " + event.getChannelExpiry());
											
											//Get the ResourceUri each Notification
											System.out.println("Notification ResourceUri: " + event.getResourceUri());
											
											//Get the ResourceId each Notification
											System.out.println("Notification ResourceId: " + event.getResourceId());
											
											//Get the ResourceName each Notification
											System.out.println("Notification ResourceName: " + event.getResourceName());
											
											//Get the ChannelId each Notification
											System.out.println("Notification ChannelId: " + event.getChannelId());
										}
									}
								}
								else
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
	 * <h3> Disable Notifications </h3>
	 * To stop all the instant notifications enabled by the user for a channel.
	 * @param channelIds - Specify the unique IDs of the notification channels to be disabled.
	 * @throws Exception
	 */
	public static void disableNotifications(List<Long> channelIds) throws Exception
	{
		//example
		//ArrayList<Long> channelIds = new ArrayList<Long>(Arrays.asList(3477061000005208001l));
		
		//Get instance of NotificationOperations Class
		NotificationOperations notificationOperations = new NotificationOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		for( Long id : channelIds)
		{
			paramInstance.add(DisableNotificationsParam.CHANNEL_IDS, id);
		}
		
		//Call disableNotifications method that takes paramInstance as parameter 
		APIResponse<ActionHandler> response = notificationOperations.disableNotifications(paramInstance);
		
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
					
					//Get the list of obtained Notification instances
					List<ActionResponse> actionResponses = actionWrapper.getWatch();
					
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
	 * <h3> Disable Specific Notifications </h3>
	 * This method is used to disable notifications for the specified events in a channel.
	 * @throws Exception
	 */
	public static void disableNotification() throws Exception
	{
		//Get instance of NotificationOperations Class
		NotificationOperations notificationOperations = new NotificationOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Notification instances
		List<com.zoho.crm.api.notification.Notification> notificationList = new ArrayList<com.zoho.crm.api.notification.Notification>();

		//Get instance of Notification Class
		com.zoho.crm.api.notification.Notification notification = new com.zoho.crm.api.notification.Notification();
		
		//Set ChannelId to the Notification instance
		notification.setChannelId(100000006800211l);
		
        List<String> events = new ArrayList<String>();
		
		events.add("Deals.edit");
		
		//To subscribe based on particular operations on given modules.
		notification.setEvents(events);
		
		notification.setDeleteevents(true);
		
		//Add Notification instance to the list
		notificationList.add(notification);
		
		//Set the list to notification in BodyWrapper instance
		bodyWrapper.setWatch(notificationList);
		
		//Call disableNotification which takes BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = notificationOperations.disableNotification(bodyWrapper);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getWatch();
					
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
}
