package samples.src.com.zoho.crm.api.profile;

import java.time.OffsetDateTime;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.profiles.APIException;

import com.zoho.crm.api.profiles.Category;

import com.zoho.crm.api.profiles.PermissionDetail;

import com.zoho.crm.api.profiles.ProfilesOperations;

import com.zoho.crm.api.profiles.ResponseHandler;

import com.zoho.crm.api.profiles.ResponseWrapper;

import com.zoho.crm.api.profiles.Section;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class Profile
{
	/**
	 * <h3> Get Profiles </h3>
	 * This method is used to retrieve the data of profiles through an API request and print the response.
	 * @throws Exception
	 */
	public static void getProfiles() throws Exception
	{
		
		//Get instance of ProfilesOperations Class
		ProfilesOperations profilesOperations = new ProfilesOperations(null);
		
		//Call getProfiles method
		APIResponse<ResponseHandler> response = profilesOperations.getProfiles();
		
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
					
					//Get the list of obtained Profile instances
					List<com.zoho.crm.api.profiles.Profile> profiles = responseWrapper.getProfiles();
				
					for(com.zoho.crm.api.profiles.Profile profile : profiles)
					{
						//Get the DisplayLabel of the each Profile
						System.out.println("Profile DisplayLabel: " + profile.getDisplayLabel());
						
						if(profile.getCreatedTime() != null)
						{
							//Get the CreatedTime of each Profile
							System.out.println("Profile CreatedTime: " + profile.getCreatedTime());
						}
						
						if(profile.getModifiedTime() != null)
						{
							//Get the ModifiedTime of each Profile
							System.out.println("Profile ModifiedTime: " + profile.getModifiedTime());
						}
						
						//Get the Name of the each Profile
						System.out.println("Profile Name: " + profile.getName());
						
						//Get the modifiedBy User instance of each Profile
						com.zoho.crm.api.users.User modifiedBy = profile.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the ID of the modifiedBy User
							System.out.println("Profile Modified By User-ID: " + modifiedBy.getId());
							
							//Get the name of the modifiedBy User
							System.out.println("Profile Modified By User-Name: " + modifiedBy.getName());
							
							//Get the Email of the modifiedBy User
							System.out.println("Profile Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the Description of the each Profile
						System.out.println("Profile Description: " + profile.getDescription());
						
						//Get the ID of the each Profile
						System.out.println("Profile ID: " + profile.getId());
						
						//Get the Category of the each Profile
						System.out.println("Profile Category: " + profile.getCategory().toString());
						
						//Get the createdBy User instance of each Profile
						com.zoho.crm.api.users.User createdBy = profile.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the ID of the createdBy User
							System.out.println("Profile Created By User-ID: " + createdBy.getId());
							
							//Get the name of the createdBy User
							System.out.println("Profile Created By User-Name: " + createdBy.getName());
							
							//Get the Email of the createdBy User
							System.out.println("Profile Created By User-Email: " + createdBy.getEmail());
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
	 * <h3> Get Profile </h3>
	 * This method is used to get the details of any specific profile.
	 * Specify the unique id of the profile in your API request to get the data for that particular profile.
	 * @param profileId - The ID of the Profile to be obtained
	 * @throws Exception
	 */
	public static void getProfile(Long profileId) throws Exception
	{
		//example
		//Long profileId = 3477061000000026011l;
		
		//Get instance of ProfilesOperations Class
		ProfilesOperations profilesOperations = new ProfilesOperations(OffsetDateTime.now());
		
		//Call getProfile method that takes profileId as parameter
		APIResponse<ResponseHandler> response = profilesOperations.getProfile(profileId);
		
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
					
					//Get the list of obtained Profile instances
					List<com.zoho.crm.api.profiles.Profile> profiles = responseWrapper.getProfiles();
				
					for(com.zoho.crm.api.profiles.Profile profile : profiles)
					{
						//Get the DisplayLabel of the each Profile
						System.out.println("Profile DisplayLabel: " + profile.getDisplayLabel());
						
						if(profile.getCreatedTime() != null)
						{
							//Get the CreatedTime of each Profile
							System.out.println("Profile CreatedTime: " + profile.getCreatedTime());
						}
						
						if(profile.getModifiedTime() != null)
						{
							//Get the ModifiedTime of each Profile
							System.out.println("Profile ModifiedTime: " + profile.getModifiedTime());
						}
						
						//Get the permissionsDetails of each Profile
						List<PermissionDetail> permissionsDetails = profile.getPermissionsDetails();
						
						//Check if permissionsDetails is not null
						if(permissionsDetails != null)
						{
							for(PermissionDetail permissionsDetail : permissionsDetails)
							{
								//Get the DisplayLabel of the each PermissionDetail
								System.out.println("Profile PermissionDetail DisplayLabel: " + permissionsDetail.getDisplayLabel());
								
								//Get the Module of the each PermissionDetail
								System.out.println("Profile PermissionDetail Module: " + permissionsDetail.getModule());
								
								//Get the Name of the each PermissionDetail
								System.out.println("Profile PermissionDetail Name: " + permissionsDetail.getName());
								
								//Get the ID of the each PermissionDetail
								System.out.println("Profile PermissionDetail ID: " + permissionsDetail.getId());
								
								//Get the Enabled of the each PermissionDetail
								System.out.println("Profile PermissionDetail Enabled: " + permissionsDetail.getEnabled());
							}
						}
						
						//Get the Name of the each Profile
						System.out.println("Profile Name: " + profile.getName());
						
						//Get the modifiedBy User instance of each Profile
						com.zoho.crm.api.users.User modifiedBy = profile.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the ID of the modifiedBy User
							System.out.println("Profile Modified By User-ID: " + modifiedBy.getId());
							
							//Get the name of the modifiedBy User
							System.out.println("Profile Modified By User-Name: " + modifiedBy.getName());
							
							//Get the Email of the modifiedBy User
							System.out.println("Profile Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the Description of the each Profile
						System.out.println("Profile Description: " + profile.getDescription());
						
						//Get the ID of the each Profile
						System.out.println("Profile ID: " + profile.getId());
						
						//Get the Category of the each Profile
						System.out.println("Profile Category: " + profile.getCategory().toString());
						
						//Get the createdBy User instance of each Profile
						com.zoho.crm.api.users.User createdBy = profile.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the ID of the createdBy User
							System.out.println("Profile Created By User-ID: " + createdBy.getId());
							
							//Get the name of the createdBy User
							System.out.println("Profile Created By User-Name: " + createdBy.getName());
							
							//Get the Email of the createdBy User
							System.out.println("Profile Created By User-Email: " + createdBy.getEmail());
						}
						
						//Get the sections of each Profile
						List<Section> sections = profile.getSections();
						
						//Check if sections is not null
						if(sections != null)
						{
							for(Section section : sections)
							{
								//Get the Name of the each Section
								System.out.println("Profile Section Name: " + section.getName());
								
								//Get the categories of each Section
								List<Category> categories = section.getCategories();
								
								for(Category category : categories)
								{
									//Get the DisplayLabel of the each Category
									System.out.println("Profile Section Category DisplayLabel: " + category.getDisplayLabel());
									
									//Get the permissionsDetails List of each Category
									List<String> categoryPermissionsDetails = category.getPermissionsDetails();
									
									//Check if categoryPermissionsDetails is not null
									if(categoryPermissionsDetails != null)
									{
										for(Object permissionsDetailID : categoryPermissionsDetails)
										{
											//Get the permissionsDetailID of the Category
											System.out.println("Profile Section Category permissionsDetailID: " + permissionsDetailID);
										}
									}
									
									//Get the Name of the each Category
									System.out.println("Profile Section Category Name: " + category.getName());
								}
							}
						}
						
						if(profile.getDelete() != null)
						{
							//Get the Delete of the each Profile
							System.out.println("Profile Delete: " + profile.getDelete().toString());
						}
	
						if(profile.getDefault() != null)
						{
							//Get the Default of the each Profile
							System.out.println("Profile Default: " + profile.getDefault().toString());
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
}

