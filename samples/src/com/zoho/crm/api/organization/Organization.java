package samples.src.com.zoho.crm.api.organization;

import java.lang.reflect.Field;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.org.APIException;

import com.zoho.crm.api.org.ActionResponse;

import com.zoho.crm.api.org.LicenseDetails;

import com.zoho.crm.api.org.OrgOperations;

import com.zoho.crm.api.org.ResponseHandler;

import com.zoho.crm.api.org.ResponseWrapper;

import com.zoho.crm.api.org.SuccessResponse;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.util.StreamWrapper;

public class Organization
{
	/**
	 * <h3> Get Organization </h3>
	 * This method is used to get the organization data and print the response.
	 * @throws Exception
	 */
	public static void getOrganization() throws Exception
	{
		//Get instance of OrgOperations Class
		OrgOperations orgOperations = new OrgOperations();
		
		//Call getOrganization method
		APIResponse<ResponseHandler> response = orgOperations.getOrganization();
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ResponseHandler responseHandler = response.getObject();
				
				if(responseHandler instanceof ResponseWrapper)
				{
					//Get the received ResponseWrapper instance
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the list of obtained Org instances
					List<com.zoho.crm.api.org.Org> orgs = responseWrapper.getOrg();
				
					for(com.zoho.crm.api.org.Org org : orgs)
					{
						//Get the Country of each Organization
						System.out.println("Organization Country: " + org.getCountry());
						
						//Get the PhotoId of each Organization
						System.out.println("Organization PhotoId: " + org.getPhotoId());
						
						//Get the City of each Organization
						System.out.println("Organization City: " + org.getCity());
						
						//Get the Description of each Organization
						System.out.println("Organization Description: " + org.getDescription());
						
						//Get the McStatus of each Organization
						System.out.println("Organization McStatus: " + org.getMcStatus().toString());
						
						//Get the GappsEnabled of each Organization
						System.out.println("Organization GappsEnabled: " + org.getGappsEnabled().toString());
						
						//Get the DomainName of each Organization
						System.out.println("Organization DomainName: " + org.getDomainName());
						
						//Get the TranslationEnabled of each Organization
						System.out.println("Organization TranslationEnabled: " + org.getTranslationEnabled().toString());
						
						//Get the Street of each Organization
						System.out.println("Organization Street: " + org.getStreet());
						
						//Get the Alias of each Organization
						System.out.println("Organization Alias: " + org.getAlias());
						
						//Get the Currency of each Organization
						System.out.println("Organization Currency: " + org.getCurrency());
						
						//Get the Id of each Organization
						System.out.println("Organization Id: " + org.getId());
						
						//Get the State of each Organization
						System.out.println("Organization State: " + org.getState());
						
						//Get the Fax of each Organization
						System.out.println("Organization Fax: " + org.getFax());
						
						//Get the EmployeeCount of each Organization
						System.out.println("Organization EmployeeCount: " + org.getEmployeeCount());
						
						//Get the Zip of each Organization
						System.out.println("Organization Zip: " + org.getZip());
						
						//Get the Website of each Organization
						System.out.println("Organization Website: " + org.getWebsite());
						
						//Get the CurrencySymbol of each Organization
						System.out.println("Organization CurrencySymbol: " + org.getCurrencySymbol());
						
						//Get the Mobile of each Organization
						System.out.println("Organization Mobile: " + org.getMobile());
						
						//Get the CurrencyLocale of each Organization
						System.out.println("Organization CurrencyLocale: " + org.getCurrencyLocale());
						
						//Get the PrimaryZuid of each Organization
						System.out.println("Organization PrimaryZuid: " + org.getPrimaryZuid());
						
						//Get the ZiaPortalId of each Organization
						System.out.println("Organization ZiaPortalId: " + org.getZiaPortalId());
						
						//Get the TimeZone of each Organization
						System.out.println("Organization TimeZone: " + org.getTimeZone());
						
						//Get the Zgid of each Organization
						System.out.println("Organization Zgid: " + org.getZgid());
						
						//Get the CountryCode of each Organization
						System.out.println("Organization CountryCode: " + org.getCountryCode());
						
						//Get the Object obtained LicenseDetails instance
						LicenseDetails licenseDetails = org.getLicenseDetails();
						
						//Check if licenseDetails is not null
						if(licenseDetails != null)
						{
							//Get the PaidExpiry of each LicenseDetails
							System.out.println("Organization LicenseDetails PaidExpiry: " + licenseDetails.getPaidExpiry());
							
							//Get the UsersLicensePurchased of each LicenseDetails
							System.out.println("Organization LicenseDetails UsersLicensePurchased: " + licenseDetails.getUsersLicensePurchased().toString());
							
							//Get the TrialType of each LicenseDetails
							System.out.println("Organization LicenseDetails TrialType: " + licenseDetails.getTrialType());
							
							//Get the TrialExpiry of each LicenseDetails
							System.out.println("Organization LicenseDetails TrialExpiry: " + licenseDetails.getTrialExpiry());
							
							//Get the Paid of each LicenseDetails
							System.out.println("Organization LicenseDetails Paid: " + licenseDetails.getPaid().toString());
							
							//Get the PaidType of each LicenseDetails
							System.out.println("Organization LicenseDetails PaidType: " + licenseDetails.getPaidType());
						}
						
						//Get the Phone of each Organization
						System.out.println("Organization Phone: " + org.getPhone());
						
						//Get the CompanyName of each Organization
						System.out.println("Organization CompanyName: " + org.getCompanyName());
						
						//Get the PrivacySettings of each Organization
						System.out.println("Organization PrivacySettings: " + org.getPrivacySettings().toString());
						
						//Get the PrimaryEmail of each Organization
						System.out.println("Organization PrimaryEmail: " + org.getPrimaryEmail());
						
						//Get the IsoCode of each Organization
						System.out.println("Organization IsoCode: " + org.getIsoCode());
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
	
	/**
	 * <h3> Upload Organization Photo</h3>
	 * This method is used to upload the brand logo or image of the organization and print the response.
	 * @param absoluteFilePath - The absolute file path of the file to be attached
	 * @throws Exception
	 */
	public static void uploadOrganizationPhoto(String absoluteFilePath) throws Exception
	{
		//example
		//String absoluteFilePath = "/Users/user_name/Desktop/download.png";
		
		//Get instance of OrgOperations Class
		OrgOperations orgOperations = new OrgOperations();
		
		//Get instance of FileBodyWrapper class that will contain the request file
		com.zoho.crm.api.org.FileBodyWrapper fileBodyWrapper = new com.zoho.crm.api.org.FileBodyWrapper();
		
		//Get instance of StreamWrapper class that takes absolute path of the file to be attached as parameter
		StreamWrapper streamWrapper = new StreamWrapper(absoluteFilePath);
		
		//Set file to the FileBodyWrapper instance
		fileBodyWrapper.setFile(streamWrapper);
		
		//Call uploadOrganizationPhoto method that takes FileBodyWrapper instance
		APIResponse<ActionResponse> response = orgOperations.uploadOrganizationPhoto(fileBodyWrapper);
		
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
					
					if(successResponse.getDetails() != null)
					{
						//Get the details map
						for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
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
					
					if(exception.getDetails() != null)
					{
						//Get the details map
						for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
						{
							//Get each value in the map
							System.out.println(entry.getKey() + ": " + entry.getValue());
						}
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
