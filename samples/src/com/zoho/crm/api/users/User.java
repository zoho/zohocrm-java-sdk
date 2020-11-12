package samples.src.com.zoho.crm.api.users;

import java.time.OffsetDateTime;

import java.time.ZoneOffset;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.HeaderMap;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.profiles.Profile;

import com.zoho.crm.api.roles.Role;

import com.zoho.crm.api.users.APIException;

import com.zoho.crm.api.users.ActionHandler;

import com.zoho.crm.api.users.ActionResponse;

import com.zoho.crm.api.users.ActionWrapper;

import com.zoho.crm.api.users.BodyWrapper;

import com.zoho.crm.api.users.CustomizeInfo;

import com.zoho.crm.api.users.Info;

import com.zoho.crm.api.users.RequestWrapper;

import com.zoho.crm.api.users.ResponseHandler;

import com.zoho.crm.api.users.ResponseWrapper;

import com.zoho.crm.api.users.SuccessResponse;

import com.zoho.crm.api.users.TabTheme;

import com.zoho.crm.api.users.Territory;

import com.zoho.crm.api.users.Theme;

import com.zoho.crm.api.users.UsersOperations;

import com.zoho.crm.api.users.UsersOperations.GetUsersHeader;

import com.zoho.crm.api.users.UsersOperations.GetUsersParam;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class User
{
	/**
	 * <h3> Get Users </h3>
	 * This method is used to retrieve the users data specified in the API request.
	 * You can specify the type of users that needs to be retrieved using the Users API.
	 * @throws Exception
	 */
	public static void getUsers() throws Exception
	{
		//Get instance of UsersOperations Class
		UsersOperations usersOperations = new UsersOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetUsersParam.TYPE, "ActiveUsers");
		
		paramInstance.add(GetUsersParam.PAGE, 1);
		
		//paramInstance.add(GetUsersParam.PER_PAGE, 1);
		
		HeaderMap headerInstance = new HeaderMap();
		
		OffsetDateTime ifmodifiedsince = OffsetDateTime.of(2020, 01, 02, 10, 00, 01, 00, ZoneOffset.of("+05:30"));
		
		headerInstance.add(GetUsersHeader.IF_MODIFIED_SINCE, ifmodifiedsince);
		
		//Call getUsers method that takes ParameterMap instance and HeaderMap instance as parameters
		APIResponse<ResponseHandler> response = usersOperations.getUsers(paramInstance, headerInstance);
		
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
					
					//Get the list of obtained User instances
					List<com.zoho.crm.api.users.User> users = responseWrapper.getUsers();
					
					for(com.zoho.crm.api.users.User user : users)
					{	
						//Get the Country of each User
						System.out.println("User Country: " + user.getCountry());
						
						// Get the CustomizeInfo instance of each User
						CustomizeInfo customizeInfo = user.getCustomizeInfo();
						
						//Check if customizeInfo is not null
						if(customizeInfo != null)
						{
							if(customizeInfo.getNotesDesc() != null)
							{
								//Get the NotesDesc of each User
								System.out.println("User CustomizeInfo NotesDesc: " + customizeInfo.getNotesDesc().toString());
							}
							
							if(customizeInfo.getShowRightPanel() != null)
							{
								//Get the ShowRightPanel of each User
								System.out.println("User CustomizeInfo ShowRightPanel: " + customizeInfo.getShowRightPanel().toString());
							}
							
							if(customizeInfo.getBcView() != null)
							{
								//Get the BcView of each User
								System.out.println("User CustomizeInfo BcView: " + customizeInfo.getBcView().toString());
							}
							
							if(customizeInfo.getShowHome() != null)
							{
								//Get the ShowHome of each User
								System.out.println("User CustomizeInfo ShowHome: " + customizeInfo.getShowHome().toString());
							}
							
							if(customizeInfo.getShowDetailView() != null)
							{
								//Get the ShowDetailView of each User
								System.out.println("User CustomizeInfo ShowDetailView: " + customizeInfo.getShowDetailView().toString());
							}
							
							if(customizeInfo.getUnpinRecentItem() != null)
							{
								//Get the UnpinRecentItem of each User
								System.out.println("User CustomizeInfo UnpinRecentItem: " + customizeInfo.getUnpinRecentItem().toString());
							}
						}
						
						// Get the Role instance of each User
						Role role = user.getRole();
						
						//Check if role is not null
						if(role != null)
						{
							//Get the Name of each Role
							System.out.println("User Role Name: " + role.getName());
							
							//Get the ID of each Role
							System.out.println("User Role ID: " + role.getId());
						}
						
						//Get the Signature of each User
						System.out.println("User Signature: " + user.getSignature());
						
						//Get the City of each User
						System.out.println("User City: " + user.getCity());
						
						//Get the NameFormat of each User
						System.out.println("User NameFormat: " + user.getNameFormat());
						
						//Get the Language of each User
						System.out.println("User Language: " + user.getLanguage());
						
						//Get the Locale of each User
						System.out.println("User Locale: " + user.getLocale());
						
						//Get the Microsoft of each User
						System.out.println("User Microsoft: " + user.getMicrosoft().toString());
						
						if(user.getPersonalAccount() != null)
						{
							//Get the PersonalAccount of each User
							System.out.println("User PersonalAccount: " + user.getPersonalAccount().toString());
						}
						
						//Get the DefaultTabGroup of each User
						System.out.println("User DefaultTabGroup: " + user.getDefaultTabGroup());
						
						//Get the Isonline of each User
						System.out.println("User Isonline: " + user.getIsonline().toString());
						
						//Get the modifiedBy User instance of each User
						com.zoho.crm.api.users.User modifiedBy = user.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("User Modified By User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("User Modified By User-ID: " + modifiedBy.getId());
						}
						
						//Get the Street of each User
						System.out.println("User Street: " + user.getStreet());
						
						//Get the Currency of each User
						System.out.println("User Currency: " + user.getCurrency());
						
						//Get the Alias of each User
						System.out.println("User Alias: " + user.getAlias());
						
						// Get the Theme instance of each User
						Theme theme = user.getTheme();
						
						//Check if theme is not null
						if(theme != null)
						{
							// Get the TabTheme instance of Theme
							TabTheme normalTab = theme.getNormalTab();
							
							//Check if normalTab is not null
							if(normalTab != null)
							{
								//Get the FontColor of NormalTab
								System.out.println("User Theme NormalTab FontColor: " + normalTab.getFontColor());
								
								//Get the Name of NormalTab
								System.out.println("User Theme NormalTab Name: " + normalTab.getBackground());
							}
							
							// Get the TabTheme instance of Theme
							TabTheme selectedTab = theme.getSelectedTab();
							
							//Check if selectedTab is not null
							if(selectedTab != null)
							{
								//Get the FontColor of SelectedTab
								System.out.println("User Theme SelectedTab FontColor: " + selectedTab.getFontColor());
								
								//Get the Name of SelectedTab
								System.out.println("User Theme SelectedTab Name: " + selectedTab.getBackground());
							}
							
							//Get the NewBackground of each Theme
							System.out.println("User Theme NewBackground: " + theme.getNewBackground());
							
							//Get the Background of each Theme
							System.out.println("User Theme Background: " + theme.getBackground());
							
							//Get the Screen of each Theme
							System.out.println("User Theme Screen: " + theme.getScreen());
							
							//Get the Type of each Theme
							System.out.println("User Theme Type: " + theme.getType());
						}
						
						//Get the ID of each User
						System.out.println("User ID: " + user.getId());
						
						//Get the State of each User
						System.out.println("User State: " + user.getState());
						
						//Get the Fax of each User
						System.out.println("User Fax: " + user.getFax());
						
						//Get the CountryLocale of each User
						System.out.println("User CountryLocale: " + user.getCountryLocale());
						
						//Get the FirstName of each User
						System.out.println("User FirstName: " + user.getFirstName());
						
						//Get the Email of each User
						System.out.println("User Email: " + user.getEmail());
						
						//Get the reportingTo User instance of each User
						com.zoho.crm.api.users.User reportingTo = user.getReportingTo();
						
						//Check if reportingTo is not null
						if(reportingTo != null)
						{
							//Get the Name of the reportingTo User
							System.out.println("User ReportingTo Name: " + reportingTo.getName());
							
							//Get the ID of the reportingTo User
							System.out.println("User ReportingTo ID: " + reportingTo.getId());
						}
						
						//Get the DecimalSeparator of each User
						System.out.println("User DecimalSeparator: " + user.getDecimalSeparator());
						
						//Get the Zip of each User
						System.out.println("User Zip: " + user.getZip());
						
						//Get the CreatedTime of each User
						System.out.println("User CreatedTime: " + user.getCreatedTime());
						
						//Get the Website of each User
						System.out.println("User Website: " + user.getWebsite());
						
						//Get the ModifiedTime of each User
						System.out.println("User ModifiedTime: " + user.getModifiedTime());
						
						//Get the TimeFormat of each User
						System.out.println("User TimeFormat: " + user.getTimeFormat());
						
						//Get the Offset of each User
						System.out.println("User Offset: " + user.getOffset().toString());
						
						//Get the Profile instance of each User
						Profile profile = user.getProfile();
						
						//Check if profile is not null
						if(profile != null)
						{
							//Get the Name of each Profile
							System.out.println("User Profile Name: " + profile.getName());
							
							//Get the ID of each Profile
							System.out.println("User Profile ID: " + profile.getId());
						}
						
						//Get the Mobile of each User
						System.out.println("User Mobile: " + user.getMobile());
						
						//Get the LastName of each User
						System.out.println("User LastName: " + user.getLastName());
						
						//Get the TimeZone of each User
						System.out.println("User TimeZone: " + user.getTimeZone());
						
						//Get the createdBy User instance of each User
						com.zoho.crm.api.users.User createdBy = user.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("User Created By User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("User Created By User-ID: " + createdBy.getId());
						}
	
						//Get the Zuid of each User
						System.out.println("User Zuid: " + user.getZuid());
						
						//Get the Confirm of each User
						System.out.println("User Confirm: " + user.getConfirm().toString());
						
						//Get the FullName of each User
						System.out.println("User FullName: " + user.getFullName());
						
						//Get the list of obtained Territory instances
						List<Territory> territories = user.getTerritories();
						
						//Check if territories is not null
						if(territories != null)
						{
							for(Territory territory : territories)
							{
								//Get the Manager of the Territory
								System.out.println("User Territory Manager: " + territory.getManager().toString());
								
								//Get the Name of the Territory
								System.out.println("User Territory Name: " + territory.getName());
								
								//Get the ID of the Territory
								System.out.println("User Territory ID: " + territory.getId());
							}
						}
						
						//Get the Phone of each User
						System.out.println("User Phone: " + user.getPhone());
						
						//Get the DOB of each User
						System.out.println("User DOB: " + user.getDob());
						
						//Get the DateFormat of each User
						System.out.println("User DateFormat: " + user.getDateFormat());
						
						//Get the Status of each User
						System.out.println("User Status: " + user.getStatus());
					}
					
					//Get the Object obtained Info instance
					Info info = responseWrapper.getInfo();
					
					//Check if info is not null
					if(info != null)
					{
						if(info.getPerPage() != null)
						{
							//Get the PerPage of the Info
							System.out.println("User Info PerPage: " + info.getPerPage().toString());
						}
						
						if(info.getCount() != null)
						{
							//Get the Count of the Info
							System.out.println("User Info Count: " + info.getCount().toString());
						}
						
						if(info.getPage() != null)
						{
							//Get the Page of the Info
							System.out.println("User Info Page: " + info.getPage().toString());
						}
						
						if(info.getMoreRecords() != null)
						{
							//Get the MoreRecords of the Info
							System.out.println("User Info MoreRecords: " + info.getMoreRecords().toString());
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
	 * <h3> Create Users </h3>
	 * This method is used to add a user to your organization and print the response.
	 * @throws Exception
	 */
	public static void createUser() throws Exception
	{
		//Get instance of UsersOperations Class
		UsersOperations usersOperations = new UsersOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		RequestWrapper request = new RequestWrapper();
		
		//List of User instances
		List<com.zoho.crm.api.users.User> userList = new ArrayList<com.zoho.crm.api.users.User>();
		
		//Get instance of User Class
		com.zoho.crm.api.users.User user1 = new com.zoho.crm.api.users.User();
		
		Role role = new Role();
		
		role.setId(3477061000000026008l);
		
		user1.setRole(role);
		
		user1.setFirstName("TestUser");
		
		user1.setEmail("testuser112@zoho.com");
		
		Profile profile = new Profile();
		
		profile.setId(3477061000000026014l);
		
		user1.setProfile(profile);
		
		user1.setLastName("TestUser LastName");
		
		userList.add(user1);
		
		request.setUsers(userList);
		
		//Call createUser method that takes BodyWrapper class instance as parameter
		APIResponse<ActionHandler> response = usersOperations.createUser(request);
		
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
					ActionWrapper responseWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = responseWrapper.getUsers();
					
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
	 * <h3> Update Users </h3>
	 * This method is used to update the details of multiple users of your organization and print the response.
	 * @throws Exception
	 */
	public static void updateUsers() throws Exception
	{
		//Get instance of UsersOperations Class
		UsersOperations usersOperations = new UsersOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of User instances
		List<com.zoho.crm.api.users.User> userList = new ArrayList<com.zoho.crm.api.users.User>();
		
		//Get instance of User Class
		com.zoho.crm.api.users.User user1 = new com.zoho.crm.api.users.User();
		
		user1.setId(3477061000007304002l);
		
		Role role = new Role();
		
		role.setId(3477061000000026008l);
		
		user1.setRole(role);
		
		user1.setCountryLocale("en_US");
		
		userList.add(user1);
		
		user1 = new com.zoho.crm.api.users.User();
		
		user1.setId(3477061000005791024l);
		
		role = new Role();
		
		role.setId(3477061000000026008l);
		
		user1.setRole(role);
		
		user1.setCountryLocale("en_US");
		
//		user1.addKeyValue(apiName, value);
		
		userList.add(user1);
		
		request.setUsers(userList);
		
		//Call updateUsers method that takes BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = usersOperations.updateUsers(request);
		
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
					ActionWrapper responseWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = responseWrapper.getUsers();
					
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
	 * <h3> Get User </h3>
	 * This method is used to get the details of any specific user.
	 * Specify the unique id of the user in your API request to get the data for that particular user.
	 * @param userId - The ID of the User to be obtained
	 * @throws Exception
	 */
	public static void getUser(Long userId) throws Exception
	{
		//example
		//Long userId = 3477061000005817002L;
		
		//Get instance of UsersOperations Class
		UsersOperations usersOperations = new UsersOperations();
		
		HeaderMap headerInstance = new HeaderMap();
		
		OffsetDateTime ifmodifiedsince = OffsetDateTime.of(2019, 01, 02, 10, 00, 01, 00, ZoneOffset.of("+05:30"));
		
		headerInstance.add(GetUsersHeader.IF_MODIFIED_SINCE, ifmodifiedsince);
		
		//Call getUser method that takes userId and headerInstance as parameter 
		APIResponse<ResponseHandler> response = usersOperations.getUser(userId, headerInstance);
		
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
					
					//Get the obtained User instance
					List<com.zoho.crm.api.users.User> users = responseWrapper.getUsers();
					
					for(com.zoho.crm.api.users.User user : users)
					{	
						//Get the Country of each User
						System.out.println("User Country: " + user.getCountry());
						
						// Get the CustomizeInfo instance of each User
						CustomizeInfo customizeInfo = user.getCustomizeInfo();
						
						//Check if customizeInfo is not null
						if(customizeInfo != null)
						{
							if(customizeInfo.getNotesDesc() != null)
							{
								//Get the NotesDesc of each User
								System.out.println("User CustomizeInfo NotesDesc: " + customizeInfo.getNotesDesc().toString());
							}
							
							if(customizeInfo.getShowRightPanel() != null)
							{
								//Get the ShowRightPanel of each User
								System.out.println("User CustomizeInfo ShowRightPanel: " + customizeInfo.getShowRightPanel().toString());
							}
							
							if(customizeInfo.getBcView() != null)
							{
								//Get the BcView of each User
								System.out.println("User CustomizeInfo BcView: " + customizeInfo.getBcView().toString());
							}
							
							if(customizeInfo.getShowHome() != null)
							{
								//Get the ShowHome of each User
								System.out.println("User CustomizeInfo ShowHome: " + customizeInfo.getShowHome().toString());
							}
							
							if(customizeInfo.getShowDetailView() != null)
							{
								//Get the ShowDetailView of each User
								System.out.println("User CustomizeInfo ShowDetailView: " + customizeInfo.getShowDetailView().toString());
							}
							
							if(customizeInfo.getUnpinRecentItem() != null)
							{
								//Get the UnpinRecentItem of each User
								System.out.println("User CustomizeInfo UnpinRecentItem: " + customizeInfo.getUnpinRecentItem().toString());
							}
						}
						
						// Get the Role instance of each User
						Role role = user.getRole();
						
						//Check if role is not null
						if(role != null)
						{
							//Get the Name of each Role
							System.out.println("User Role Name: " + role.getName());
							
							//Get the ID of each Role
							System.out.println("User Role ID: " + role.getId());
						}
						
						//Get the Signature of each User
						System.out.println("User Signature: " + user.getSignature());
						
						//Get the City of each User
						System.out.println("User City: " + user.getCity());
						
						//Get the NameFormat of each User
						System.out.println("User NameFormat: " + user.getNameFormat());
						
						//Get the Language of each User
						System.out.println("User Language: " + user.getLanguage());
						
						//Get the Locale of each User
						System.out.println("User Locale: " + user.getLocale());
						
						//Get the Microsoft of each User
						System.out.println("User Microsoft: " + user.getMicrosoft().toString());
						
						if(user.getPersonalAccount() != null)
						{
							//Get the PersonalAccount of each User
							System.out.println("User PersonalAccount: " + user.getPersonalAccount().toString());
						}
						
						//Get the DefaultTabGroup of each User
						System.out.println("User DefaultTabGroup: " + user.getDefaultTabGroup());
						
						//Get the Isonline of each User
						System.out.println("User Isonline: " + user.getIsonline().toString());
						
						//Get the modifiedBy User instance of each User
						com.zoho.crm.api.users.User modifiedBy = user.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("User Modified By User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("User Modified By User-ID: " + modifiedBy.getId());
						}
						
						//Get the Street of each User
						System.out.println("User Street: " + user.getStreet());
						
						//Get the Currency of each User
						System.out.println("User Currency: " + user.getCurrency());
						
						//Get the Alias of each User
						System.out.println("User Alias: " + user.getAlias());
						
						// Get the Theme instance of each User
						Theme theme = user.getTheme();
						
						//Check if theme is not null
						if(theme != null)
						{
							// Get the TabTheme instance of Theme
							TabTheme normalTab = theme.getNormalTab();
							
							//Check if normalTab is not null
							if(normalTab != null)
							{
								//Get the FontColor of NormalTab
								System.out.println("User Theme NormalTab FontColor: " + normalTab.getFontColor());
								
								//Get the Name of NormalTab
								System.out.println("User Theme NormalTab Name: " + normalTab.getBackground());
							}
							
							// Get the TabTheme instance of Theme
							TabTheme selectedTab = theme.getSelectedTab();
							
							//Check if selectedTab is not null
							if(selectedTab != null)
							{
								//Get the FontColor of SelectedTab
								System.out.println("User Theme SelectedTab FontColor: " + selectedTab.getFontColor());
								
								//Get the Name of SelectedTab
								System.out.println("User Theme SelectedTab Name: " + selectedTab.getBackground());
							}
							
							//Get the NewBackground of each Theme
							System.out.println("User Theme NewBackground: " + theme.getNewBackground());
							
							//Get the Background of each Theme
							System.out.println("User Theme Background: " + theme.getBackground());
							
							//Get the Screen of each Theme
							System.out.println("User Theme Screen: " + theme.getScreen());
							
							//Get the Type of each Theme
							System.out.println("User Theme Type: " + theme.getType());
						}
						
						//Get the ID of each User
						System.out.println("User ID: " + user.getId());
						
						//Get the State of each User
						System.out.println("User State: " + user.getState());
						
						//Get the Fax of each User
						System.out.println("User Fax: " + user.getFax());
						
						//Get the CountryLocale of each User
						System.out.println("User CountryLocale: " + user.getCountryLocale());
						
						//Get the FirstName of each User
						System.out.println("User FirstName: " + user.getFirstName());
						
						//Get the Email of each User
						System.out.println("User Email: " + user.getEmail());
						
						//Get the reportingTo User instance of each User
						com.zoho.crm.api.users.User reportingTo = user.getReportingTo();
						
						//Check if reportingTo is not null
						if(reportingTo != null)
						{
							//Get the Name of the reportingTo User
							System.out.println("User ReportingTo Name: " + reportingTo.getName());
							
							//Get the ID of the reportingTo User
							System.out.println("User ReportingTo ID: " + reportingTo.getId());
						}
						
						//Get the DecimalSeparator of each User
						System.out.println("User DecimalSeparator: " + user.getDecimalSeparator());
						
						//Get the Zip of each User
						System.out.println("User Zip: " + user.getZip());
						
						//Get the CreatedTime of each User
						System.out.println("User CreatedTime: " + user.getCreatedTime());
						
						//Get the Website of each User
						System.out.println("User Website: " + user.getWebsite());
						
						//Get the ModifiedTime of each User
						System.out.println("User ModifiedTime: " + user.getModifiedTime());
						
						//Get the TimeFormat of each User
						System.out.println("User TimeFormat: " + user.getTimeFormat());
						
						//Get the Offset of each User
						System.out.println("User Offset: " + user.getOffset().toString());
						
						//Get the Profile instance of each User
						Profile profile = user.getProfile();
						
						//Check if profile is not null
						if(profile != null)
						{
							//Get the Name of each Profile
							System.out.println("User Profile Name: " + profile.getName());
							
							//Get the ID of each Profile
							System.out.println("User Profile ID: " + profile.getId());
						}
						
						//Get the Mobile of each User
						System.out.println("User Mobile: " + user.getMobile());
						
						//Get the LastName of each User
						System.out.println("User LastName: " + user.getLastName());
						
						//Get the TimeZone of each User
						System.out.println("User TimeZone: " + user.getTimeZone());
						
						//Get the createdBy User instance of each User
						com.zoho.crm.api.users.User createdBy = user.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("User Created By User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("User Created By User-ID: " + createdBy.getId());
						}
	
						//Get the Zuid of each User
						System.out.println("User Zuid: " + user.getZuid());
						
						//Get the Confirm of each User
						System.out.println("User Confirm: " + user.getConfirm().toString());
						
						//Get the FullName of each User
						System.out.println("User FullName: " + user.getFullName());
						
						//Get the list of obtained Territory instances
						List<Territory> territories = user.getTerritories();
						
						//Check if territories is not null
						if(territories != null)
						{
							for(Territory territory : territories)
							{
								//Get the Manager of the Territory
								System.out.println("User Territory Manager: " + territory.getManager().toString());
								
								//Get the Name of the Territory
								System.out.println("User Territory Name: " + territory.getName());
								
								//Get the ID of the Territory
								System.out.println("User Territory ID: " + territory.getId());
							}
						}
						
						//Get the Phone of each User
						System.out.println("User Phone: " + user.getPhone());
						
						//Get the DOB of each User
						System.out.println("User DOB: " + user.getDob());
						
						//Get the DateFormat of each User
						System.out.println("User DateFormat: " + user.getDateFormat());
						
						//Get the Status of each User
						System.out.println("User Status: " + user.getStatus());
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
	 * <h3> Update User </h3>
	 * This method is used to update the details of a user of your organization and print the response.
	 * @param userId - The ID of the User to be updated
	 * @throws Exception
	 */
	public static void updateUser(Long userId) throws Exception
	{
		//example
		//Long userId = 3477061000005817002L;
		
		//Get instance of UsersOperations Class
		UsersOperations usersOperations = new UsersOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of User instances
		List<com.zoho.crm.api.users.User> userList = new ArrayList<com.zoho.crm.api.users.User>();
		
		//Get instance of User Class
		com.zoho.crm.api.users.User user1 = new com.zoho.crm.api.users.User();
		
		Role role = new Role();
		
		role.setId(3477061000000026008l);
		
		user1.setRole(role);
		
		user1.setCountryLocale("en_US");
		
		userList.add(user1);
		
		request.setUsers(userList);
		
		//Call updateUser method that takes userId and BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = usersOperations.updateUser(userId, request);
		
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
					ActionWrapper responseWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = responseWrapper.getUsers();
					
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
	 * <h3> Delete User </h3>
	 * This method is used to delete a user from your organization and print the response.
	 * @param userId - The ID of the User to be deleted
	 * @throws Exception
	 */
	public static void deleteUser(Long userId) throws Exception
	{
		//example
		//Long userId = 3477061000005817002L;
		
		//Get instance of UsersOperations Class
		UsersOperations usersOperations = new UsersOperations();
		
		//Call deleteUser method that takes userId as parameter
		APIResponse<ActionHandler> response = usersOperations.deleteUser(userId);
		
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
					ActionWrapper responseWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = responseWrapper.getUsers();
					
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