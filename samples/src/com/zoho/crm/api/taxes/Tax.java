package samples.src.com.zoho.crm.api.taxes;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.taxes.APIException;

import com.zoho.crm.api.taxes.ActionHandler;

import com.zoho.crm.api.taxes.ActionResponse;

import com.zoho.crm.api.taxes.ActionWrapper;

import com.zoho.crm.api.taxes.BodyWrapper;

import com.zoho.crm.api.taxes.Preference;

import com.zoho.crm.api.taxes.ResponseHandler;

import com.zoho.crm.api.taxes.ResponseWrapper;

import com.zoho.crm.api.taxes.SuccessResponse;

import com.zoho.crm.api.taxes.TaxesOperations;

import com.zoho.crm.api.taxes.TaxesOperations.DeleteTaxesParam;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class Tax
{
	/**
	 * <h3> Get Taxes </h3>
	 * This method is used to get all the Organization Taxes and print the response.
	 * @throws Exception
	 */
	public static void getTaxes() throws Exception
	{
		//Get instance of TaxesOperations Class
		TaxesOperations taxesOperations = new TaxesOperations();
		
		//Call getTaxes method 
		APIResponse<ResponseHandler> response = taxesOperations.getTaxes();
		
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
					
					//Get the list of obtained Tax instances
					List<com.zoho.crm.api.taxes.Tax> taxes = responseWrapper.getTaxes();
					
					for(com.zoho.crm.api.taxes.Tax tax : taxes)
					{	
						//Get the DisplayLabel of each Tax
						System.out.println("Tax DisplayLabel: " + tax.getDisplayLabel());
						
						//Get the Name of each Tax
						System.out.println("Tax Name: " + tax.getName());
						
						//Get the ID of each Tax
						System.out.println("Tax ID: " + tax.getId());
						
						//Get the Value of each Tax
						System.out.println("Tax Value: " + tax.getValue().toString());
					}
					
					//Get the Preference instance of Tag
					Preference preference = responseWrapper.getPreference();
					
					//Check if preference is not null
					if(preference != null)
					{
						//Get the AutoPopulateTax of each Preference
						System.out.println("Preference AutoPopulateTax: " + preference.getAutoPopulateTax().toString());
						
						//Get the ModifyTaxRates of each Preference
						System.out.println("Preference ModifyTaxRates: " + preference.getModifyTaxRates().toString());
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
	 * <h3> Create Taxes </h3>
	 * This method is used to create Organization Taxes and print the response.
	 * @throws Exception
	 */
	public static void createTaxes() throws Exception
	{
		//Get instance of TaxesOperations Class
		TaxesOperations taxesOperations = new TaxesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Tax instances
		List<com.zoho.crm.api.taxes.Tax> taxList = new ArrayList<com.zoho.crm.api.taxes.Tax>();
		
		//Get instance of Tax Class
		com.zoho.crm.api.taxes.Tax tax1 = new com.zoho.crm.api.taxes.Tax();
		
		tax1.setName("MyTax1122");
		
		tax1.setSequenceNumber(2);
		
		tax1.setValue(10.0);
		
		taxList.add(tax1);
		
		tax1 = new com.zoho.crm.api.taxes.Tax();
		
		tax1.setName("MyTax2122");
		
		tax1.setValue(12.0);
		
		taxList.add(tax1);
		
		request.setTaxes(taxList);
		
		//Call createTaxes method that takes BodyWrapper class instance as parameter
		APIResponse<ActionHandler> response = taxesOperations.createTaxes(request);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getTaxes();
					
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
	 * <h3> Update Taxes </h3>
	 * This method is used to update Organization Taxes and print the response.
	 * @throws Exception
	 */
	public static void updateTaxes() throws Exception
	{
		//Get instance of TaxesOperations Class
		TaxesOperations taxesOperations = new TaxesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Tax instances
		List<com.zoho.crm.api.taxes.Tax> taxList = new ArrayList<com.zoho.crm.api.taxes.Tax>();
		
		//Get instance of Tax Class
		com.zoho.crm.api.taxes.Tax tax1 = new com.zoho.crm.api.taxes.Tax();
		
		tax1.setId(3477061000005799133l);
		
		tax1.setName("MyTax1134");
		
		tax1.setSequenceNumber(1);
		
		tax1.setValue(15.0);
		
		taxList.add(tax1);
		
		tax1 = new com.zoho.crm.api.taxes.Tax();
		
		tax1.setId(3477061000000339001l);
		
		tax1.setValue(25.0);
		
		taxList.add(tax1);
		
		tax1 = new com.zoho.crm.api.taxes.Tax();
		
		tax1.setId(3477061000000339001l);
		
		tax1.setSequenceNumber(2);
		
		taxList.add(tax1);
		
		request.setTaxes(taxList);
		
		//Call updateTaxes method that takes BodyWrapper instance as parameter
		APIResponse<ActionHandler> response = taxesOperations.updateTaxes(request);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getTaxes();
					
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
	 * <h3> Delete Taxes </h3>
	 * This method is used to delete Organization Taxes and print the response.
	 * @param taxIds - The List of the tax IDs to be deleted
	 * @throws Exception
	 */
	public static void deleteTaxes(List<Long> taxIds) throws Exception
	{
		//example
		//ArrayList<Long> taxIds = new ArrayList<Long>(Arrays.asList(3477061000006198032l,3477061000005682038l));
		
		//Get instance of TaxesOperations Class
		TaxesOperations taxesOperations = new TaxesOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		for(Long taxId : taxIds)
		{
			paramInstance.add(DeleteTaxesParam.IDS, taxId);
		}
		
		//Call deleteTaxes method that takes paramInstance as parameter
		APIResponse<ActionHandler> response = taxesOperations.deleteTaxes(paramInstance);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getTaxes();
					
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
	 * <h3> Get Tax </h3>
	 * This method is used to get the Organization Tax and print the response.
	 * @param taxId - The ID of the tax to be obtained
	 * @throws Exception
	 */
	public static void getTax(Long taxId) throws Exception
	{
		//example
		//Long taxId = 3477061000006054012l;
		
		//Get instance of TaxesOperations Class
		TaxesOperations taxesOperations = new TaxesOperations();
		
		//Call getTax method that takes taxId as parameter 
		APIResponse<ResponseHandler> response = taxesOperations.getTax(taxId);
		
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
					
					//Get the list of obtained Tax instances
					List<com.zoho.crm.api.taxes.Tax> taxes = responseWrapper.getTaxes();
					
					for(com.zoho.crm.api.taxes.Tax tax : taxes)
					{	
						//Get the DisplayLabel of each Tax
						System.out.println("Tax DisplayLabel: " + tax.getDisplayLabel());
						
						//Get the Name of each Tax
						System.out.println("Tax Name: " + tax.getName());
						
						//Get the ID of each Tax
						System.out.println("Tax ID: " + tax.getId());
						
						//Get the Value of each Tax
						System.out.println("Tax Value: " + tax.getValue().toString());
					}
					
					//Get the Preference instance of Tag
					Preference preference = responseWrapper.getPreference();
					
					//Check if preference is not null
					if(preference != null)
					{
						//Get the AutoPopulateTax of each Preference
						System.out.println("Preference AutoPopulateTax: " + preference.getAutoPopulateTax().toString());
						
						//Get the ModifyTaxRates of each Preference
						System.out.println("Preference ModifyTaxRates: " + preference.getModifyTaxRates().toString());
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
	 * <h3> Delete Tax </h3>
	 * This method is used to delete Organization Tax and print the response.
	 * @param taxId - The ID of the tax to be deleted
	 * @throws Exception
	 */
	public static void deleteTax(Long taxId) throws Exception
	{
		//example
		//Long taxId = 3477061000006054012l;
		
		//Get instance of TaxesOperations Class
		TaxesOperations taxesOperations = new TaxesOperations();
		
		//Call deleteTax method that takes taxId as parameter
		APIResponse<ActionHandler> response = taxesOperations.deleteTax(taxId);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getTaxes();
					
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