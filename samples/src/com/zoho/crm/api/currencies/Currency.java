package samples.src.com.zoho.crm.api.currencies;

import java.lang.reflect.Field;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.currencies.APIException;

import com.zoho.crm.api.currencies.ActionHandler;

import com.zoho.crm.api.currencies.ActionResponse;

import com.zoho.crm.api.currencies.ActionWrapper;

import com.zoho.crm.api.currencies.BaseCurrencyActionHandler;

import com.zoho.crm.api.currencies.BaseCurrencyActionWrapper;

import com.zoho.crm.api.currencies.BaseCurrencyWrapper;

import com.zoho.crm.api.currencies.BodyWrapper;

import com.zoho.crm.api.currencies.CurrenciesOperations;

import com.zoho.crm.api.currencies.Format;

import com.zoho.crm.api.currencies.ResponseHandler;

import com.zoho.crm.api.currencies.ResponseWrapper;

import com.zoho.crm.api.currencies.SuccessResponse;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Choice;

import com.zoho.crm.api.util.Model;

public class Currency
{
	/**
	 * <h3> Get Currencies </h3>
	 * This method is used to get all the available currencies in your organization.
	 * @throws Exception
	 */
	public static void getCurrencies() throws Exception
	{
		//Get instance of CurrenciesOperations Class
		CurrenciesOperations currenciesOperations = new CurrenciesOperations();
		
		//Call getCurrencies method 
		APIResponse<ResponseHandler> response = currenciesOperations.getCurrencies();
		
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
					
					//Get the list of obtained Currency instances
					List<com.zoho.crm.api.currencies.Currency> currenciesList = responseWrapper.getCurrencies();
					
					for(com.zoho.crm.api.currencies.Currency currency : currenciesList)
					{	
						//Get the Symbol of each currency
						System.out.println("Currency Symbol: " + currency.getSymbol());
						
						//Get the CreatedTime of each currency
						System.out.println("Currency CreatedTime: " + currency.getCreatedTime());
						
						//Get the currency is IsActive
						System.out.println("Currency IsActive: " + currency.getIsActive().toString());
						
						//Get the ExchangeRate of each currency
						System.out.println("Currency ExchangeRate: " + currency.getExchangeRate());
						
						//Get the format instance of each currency
						Format format = currency.getFormat();
						
						//Check if format is not null
						if(format != null)
						{
							//Get the DecimalSeparator of the Format
							System.out.println("Currency Format DecimalSeparator: " + format.getDecimalSeparator().getValue());
							
							//Get the ThousandSeparator of the Format
							System.out.println("Currency Format ThousandSeparator: " + format.getThousandSeparator().getValue());
							
							//Get the DecimalPlaces of the Format
							System.out.println("Currency Format DecimalPlaces: " + format.getDecimalPlaces().getValue());
						}
						
						//Get the createdBy User instance of each currency
						com.zoho.crm.api.users.User createdBy = currency.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Currency CreatedBy User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Currency CreatedBy User-ID: " + createdBy.getId());
						}
						
						//Get the PrefixSymbol of each currency
						System.out.println("Currency PrefixSymbol: " + currency.getPrefixSymbol().toString());
						
						//Get the IsBase of each currency
						System.out.println("Currency IsBase: " + currency.getIsBase().toString());
						
						//Get the ModifiedTime of each currency
						System.out.println("Currency ModifiedTime: " + currency.getModifiedTime());
						
						//Get the Name of each currency
						System.out.println("Currency Name: " + currency.getName());
						
						//Get the modifiedBy User instance of each currency
						com.zoho.crm.api.users.User modifiedBy = currency.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Currency ModifiedBy User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Currency ModifiedBy User-ID: " + modifiedBy.getId());
						}
						
						//Get the Id of each currency
						System.out.println("Currency Id: " + currency.getId());
						
						//Get the IsoCode of each currency
						System.out.println("Currency IsoCode: " + currency.getIsoCode());
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
	 * <h3> Add Currencies </h3>
	 * This method is used to add new currencies to your organization.
	 * @throws Exception
	 */
	public static void addCurrencies() throws Exception
	{		
		//Get instance of CurrenciesOperations Class
		CurrenciesOperations currenciesOperations = new CurrenciesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Currency instances
		List<com.zoho.crm.api.currencies.Currency> currencies = new ArrayList<com.zoho.crm.api.currencies.Currency>();
		
		//Get instance of Currency Class
		com.zoho.crm.api.currencies.Currency currency = new com.zoho.crm.api.currencies.Currency();
		
		//To set the position of the ISO code in the currency.
		//true: Display ISO code before the currency value.
		//false: Display ISO code after the currency value.
		currency.setPrefixSymbol(true);
		
		//To set the name of the currency.
		currency.setName("Algerian Dinar - DZD");
		
		//To set the ISO code of the currency.
		currency.setIsoCode("DZD");
		
		//To set the symbol of the currency.
		currency.setSymbol("DA");
		
		//To set the rate at which the currency has to be exchanged for home currency.
		currency.setExchangeRate("20.000000000");
		
		//To set the status of the currency.
		//true: The currency is active.
		//false: The currency is inactive.
		currency.setIsActive(true);
		
		Format format = new Format();
		
		//It can be a Period or Comma, depending on the currency.
		format.setDecimalSeparator(new Choice<String>("Period"));
	      
		//It can be a Period, Comma, or Space, depending on the currency.
		format.setThousandSeparator(new Choice<String>("Comma"));
      
		//To set the number of decimal places allowed for the currency. It can be 0, 2, or 3.
		format.setDecimalPlaces(new Choice<String>("2"));
		
		//To set the format of the currency
		currency.setFormat(format);
		
		currencies.add(currency);
		
		//Set the list to Currency in BodyWrapper instance
		bodyWrapper.setCurrencies(currencies);
		
		//Call addCurrencies method that takes BodyWrapper instance as parameter 
		APIResponse<ActionHandler> response = currenciesOperations.addCurrencies(bodyWrapper);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getCurrencies();
					
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
	 * <h3> Update Currencies </h3>
	 * This method is used to update currency details.
	 * @throws Exception
	 */
	public static void updateCurrencies() throws Exception
	{
		//Get instance of CurrenciesOperations Class
		CurrenciesOperations currenciesOperations = new CurrenciesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Currency instances
		List<com.zoho.crm.api.currencies.Currency> currencies = new ArrayList<com.zoho.crm.api.currencies.Currency>();
		
		//Get instance of Currency Class
		com.zoho.crm.api.currencies.Currency currency = new com.zoho.crm.api.currencies.Currency();
		
		//To set the position of the ISO code in the currency.
		//true: Display ISO code before the currency value.
		//false: Display ISO code after the currency value.
//		currency.setPrefixSymbol(true);
		
		//To set currency Id
		currency.setId(3477061000007368016l);
		
		//To set the rate at which the currency has to be exchanged for home currency.
		currency.setExchangeRate("5.0000000");
		
		//To set the status of the currency.
		//true: The currency is active.
		//false: The currency is inactive.
		currency.setIsActive(true);
		
		Format format = new Format();
		
		//It can be a Period or Comma, depending on the currency.
		format.setDecimalSeparator(new Choice<String>("Period"));
	      
		//It can be a Period, Comma, or Space, depending on the currency.
		format.setThousandSeparator(new Choice<String>("Comma"));
      
		//To set the number of decimal places allowed for the currency. It can be 0, 2, or 3.
		format.setDecimalPlaces(new Choice<String>("2"));
		
		//To set the format of the currency
		currency.setFormat(format);
		
		//Add Currency instance to the list
		currencies.add(currency);
		
		//Set the list to Currency in BodyWrapper instance
		bodyWrapper.setCurrencies(currencies);
		
		//Call updateCurrencies method that takes BodyWrapper instance as parameter 
		APIResponse<ActionHandler> response = currenciesOperations.updateCurrencies(bodyWrapper);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getCurrencies();
					
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
	 * <h3> Enable Multiple Currencies </h3>
	 * This method is used to enable multiple currencies for your organization.
	 * @throws Exception
	 */
	public static void enableMultipleCurrencies() throws Exception
	{
		//Get instance of CurrenciesOperations Class
		CurrenciesOperations currenciesOperations = new CurrenciesOperations();
		
		//Get instance of BaseCurrencyWrapper Class that will contain the request body
		BaseCurrencyWrapper bodyWrapper = new BaseCurrencyWrapper();
		
		//Get instance of Currency Class
		com.zoho.crm.api.currencies.Currency currency = new com.zoho.crm.api.currencies.Currency();
		
		//To set the position of the ISO code in the base currency.
		//true: Display ISO code before the currency value.
		//false: Display ISO code after the currency value.
		currency.setPrefixSymbol(true);
		
		//To set the name of the base currency.
		currency.setName("Algerian Dinar - DZD");
		
		//To set the ISO code of the base currency.
		currency.setIsoCode("DZD");
		
		//To set the symbol of the base currency.
		currency.setSymbol("DA");
		
		//To set the rate at which the currency has to be exchanged for home base currency.
		currency.setExchangeRate("2.0000000");
		
		//To set the status of the base currency.
		//true: The currency is active.
		//false: The currency is inactive.
		currency.setIsActive(true);
		
		Format format = new Format();
		
		//It can be a Period or Comma, depending on the base currency.
		format.setDecimalSeparator(new Choice<String>("Period"));
		
		//It can be a Period, Comma, or Space, depending on the base currency.  
		format.setThousandSeparator(new Choice<String>("Comma"));
      
		//To set the number of decimal places allowed for the base currency. It can be 0, 2, or 3.
		format.setDecimalPlaces(new Choice<String>("3"));
		
		//To set the format of the base currency
		currency.setFormat(format);
		
		//Set the Currency in BodyWrapper instance
		bodyWrapper.setBaseCurrency(currency);
		
		//Call enableMultipleCurrencies method that takes BodyWrapper instance as parameter 
		APIResponse<BaseCurrencyActionHandler> response = currenciesOperations.enableMultipleCurrencies(bodyWrapper);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				BaseCurrencyActionHandler baseCurrencyActionHandler = response.getObject();
				
				if(baseCurrencyActionHandler instanceof BaseCurrencyActionWrapper)
				{
					//Get the received BaseCurrencyActionWrapper instance
					BaseCurrencyActionWrapper baseCurrencyActionWrapper = (BaseCurrencyActionWrapper) baseCurrencyActionHandler;
					
					//Get the received obtained ActionResponse instances
					ActionResponse actionResponse = baseCurrencyActionWrapper.getBaseCurrency();
					
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
				//Check if the request returned an exception
				else if(baseCurrencyActionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) baseCurrencyActionHandler;
					
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
	 * <h3> Update Currency </h3>
	 * This method is used to update base currency details.
	 * @throws Exception
	 */
	public static void updateBaseCurrency() throws Exception
	{
		//Get instance of CurrenciesOperations Class
		CurrenciesOperations currenciesOperations = new CurrenciesOperations();
		
		//Get instance of BaseCurrencyWrapper Class that will contain the request body
		BaseCurrencyWrapper bodyWrapper = new BaseCurrencyWrapper();
		
		//Get instance of Currency Class
		com.zoho.crm.api.currencies.Currency currency = new com.zoho.crm.api.currencies.Currency();
		
		//To set the position of the ISO code in the base currency.
		//true: Display ISO code before the currency value.
		//false: Display ISO code after the currency value.
		currency.setPrefixSymbol(true);
		
		//To set the symbol of the base currency.
		currency.setSymbol("DA");
		
		//To set the rate at which the currency has to be exchanged for home base currency.
		currency.setExchangeRate("5.0000000");
		
		//To set currency Id
		currency.setId(3477061000007368016l);
		
		currency.setIsActive(true);
		
		Format format = new Format();
		
		//It can be a Period or Comma, depending on the base currency.
		format.setDecimalSeparator(new Choice<String>("Period"));
	      
		//It can be a Period, Comma, or Space, depending on the base currency.
		format.setThousandSeparator(new Choice<String>("Comma"));
      
		//To set the number of decimal places allowed for the base currency. It can be 0, 2, or 3.
		format.setDecimalPlaces(new Choice<String>("2"));
		
		//To set the format of the base currency
		currency.setFormat(format);
		
		//Set the Currency in BodyWrapper instance
		bodyWrapper.setBaseCurrency(currency);
		
		//Call updateBaseCurrency method that takes BodyWrapper instance as parameter 
		APIResponse<BaseCurrencyActionHandler> response = currenciesOperations.updateBaseCurrency(bodyWrapper);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				BaseCurrencyActionHandler baseCurrencyActionHandler = response.getObject();
				
				if(baseCurrencyActionHandler instanceof BaseCurrencyActionWrapper)
				{
					//Get the received BaseCurrencyActionWrapper instance
					BaseCurrencyActionWrapper baseCurrencyActionWrapper = (BaseCurrencyActionWrapper) baseCurrencyActionHandler;
					
					//Get the ActionResponse instance
					ActionResponse actionResponse = baseCurrencyActionWrapper.getBaseCurrency();
					
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
				//Check if the request returned an exception
				else if(baseCurrencyActionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) baseCurrencyActionHandler;
					
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
	 * <h3> Get Currency </h3>
	 * This method is used to get the details of a specific currency.
	 * @param currencyId - Specify the unique ID of the currency.
	 * @throws Exception
	 */
	public static void getCurrency(Long currencyId) throws Exception
	{
		//example
		//Long currencyId = 3477061000006011001l;
		
		//Get instance of CurrenciesOperations Class
		CurrenciesOperations currenciesOperations = new CurrenciesOperations();
		
		//Call getCurrency method that takes currencyId as parameter 
		APIResponse<ResponseHandler> response = currenciesOperations.getCurrency(currencyId);
		
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
					
					//Get the obtained Currency instance
					List<com.zoho.crm.api.currencies.Currency> currenciesList = responseWrapper.getCurrencies();
					
					for(com.zoho.crm.api.currencies.Currency currency : currenciesList)
					{	
						//Get the Symbol of each currency
						System.out.println("Currency Symbol: " + currency.getSymbol());
						
						//Get the CreatedTime of each currency
						System.out.println("Currency CreatedTime: " + currency.getCreatedTime());
						
						//Get the currency is IsActive
						System.out.println("Currency IsActive: " + currency.getIsActive().toString());
						
						//Get the ExchangeRate of each currency
						System.out.println("Currency ExchangeRate: " + currency.getExchangeRate());
						
						//Get the format Format instance of each currency
						Format format = currency.getFormat();
						
						//Check if format is not null
						if(format != null)
						{
							//Get the DecimalSeparator of the Format
							System.out.println("Currency Format DecimalSeparator: " + format.getDecimalSeparator().getValue());
							
							//Get the ThousandSeparator of the Format
							System.out.println("Currency Format ThousandSeparator: " + format.getThousandSeparator().getValue());
							
							//Get the DecimalPlaces of the Format
							System.out.println("Currency Format DecimalPlaces: " + format.getDecimalPlaces().getValue());
						}
						
						//Get the createdBy User instance of each currency
						com.zoho.crm.api.users.User createdBy = currency.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Currency CreatedBy User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Currency CreatedBy User-ID: " + createdBy.getId());
						}
						
						//Get the PrefixSymbol of each currency
						System.out.println("Currency PrefixSymbol: " + currency.getPrefixSymbol().toString());
						
						//Get the IsBase of each currency
						System.out.println("Currency IsBase: " + currency.getIsBase().toString());
						
						//Get the ModifiedTime of each currency
						System.out.println("Currency ModifiedTime: " + currency.getModifiedTime());
						
						//Get the Name of each currency
						System.out.println("Currency Name: " + currency.getName());
						
						//Get the modifiedBy User instance of each currency
						com.zoho.crm.api.users.User modifiedBy = currency.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Currency ModifiedBy User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Currency ModifiedBy User-ID: " + modifiedBy.getId());
						}
						
						//Get the Id of each currency
						System.out.println("Currency Id: " + currency.getId());
						
						//Get the IsoCode of each currency
						System.out.println("Currency IsoCode: " + currency.getIsoCode());
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
	 * <h3> Update Currency </h3>
	 * This method is used to update currency details.
	 * @param currencyId - Specify the unique ID of the currency.
	 * @throws Exception
	 */
	public static void updateCurrency(Long currencyId) throws Exception
	{
		//example
		//Long currencyId = 3477061000006011001l;
		
		//Get instance of CurrenciesOperations Class
		CurrenciesOperations currenciesOperations = new CurrenciesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Currency instances
		List<com.zoho.crm.api.currencies.Currency> currencies = new ArrayList<com.zoho.crm.api.currencies.Currency>();
		
		//Get instance of Currency Class
		com.zoho.crm.api.currencies.Currency currency = new com.zoho.crm.api.currencies.Currency();
		
		//To set the position of the ISO code in the currency.
		//true: Display ISO code before the currency value.
		//false: Display ISO code after the currency value.
		currency.setPrefixSymbol(true);
		
		//To set the rate at which the currency has to be exchanged for home currency.
		currency.setExchangeRate("10.0000000");
		
		//To set the status of the currency.
		//true: The currency is active.
		//false: The currency is inactive.
		currency.setIsActive(false);
		
		Format format = new Format();
		
		//It can be a Period or Comma, depending on the currency.
		format.setDecimalSeparator(new Choice<String>("Period"));
	      
		//It can be a Period, Comma, or Space, depending on the currency.
		format.setThousandSeparator(new Choice<String>("Comma"));
      
		//To set the number of decimal places allowed for the currency. It can be 0, 2, or 3.
		format.setDecimalPlaces(new Choice<String>("3"));
		
		//To set the format of the currency
		currency.setFormat(format);
		
		currencies.add(currency);
		
		//Set the list to Currency in BodyWrapper instance
		bodyWrapper.setCurrencies(currencies);
		
		//Call updateCurrency method that takes currencyId and BodyWrapper instance as parameters 
		APIResponse<ActionHandler>response = currenciesOperations.updateCurrency(currencyId, bodyWrapper);
		
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
					List<ActionResponse> actionResponses = actionWrapper.getCurrencies();
					
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
