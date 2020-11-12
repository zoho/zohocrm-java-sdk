package com.zoho.crm.api.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.zoho.api.logger.SDKLogger;
import com.zoho.crm.api.HeaderMap;
import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.fields.Field;
import com.zoho.crm.api.fields.FieldsOperations;
import com.zoho.crm.api.fields.ResponseHandler;
import com.zoho.crm.api.fields.ResponseWrapper;
import com.zoho.crm.api.modules.Module;
import com.zoho.crm.api.modules.ModulesOperations;
import com.zoho.crm.api.modules.ModulesOperations.GetModulesHeader;
import com.zoho.crm.api.relatedlists.RelatedList;
import com.zoho.crm.api.relatedlists.RelatedListsOperations;

/**
 * This class handles module field details.
 */
public class Utility
{
	private static HashMap<String, String> apiTypeVsdataType = new HashMap<String, String>();

	private static HashMap<String, String> apiTypeVsStructureName = new HashMap<String, String>();

	private static final Logger LOGGER = Logger.getLogger(SDKLogger.class.getName());

	private static final JSONObject JSONDETAILS = Initializer.jsonDetails;

	private static Boolean newFile = false;

	private static Boolean getModifiedModules = false;
	
	private static Boolean forceRefresh = false;

	/**
	 * This method to fetch field details of the current module for the current user and store the result in a JSON file.
	 * 
	 * @param moduleAPIName A String containing the CRM module API name.
	 * @throws SDKException 
	 */
	public static synchronized void getFields(String moduleAPIName) throws SDKException
	{
		String recordFieldDetailsPath = null;

		String lastModifiedTime = null;

		try
		{
			if (moduleAPIName != null && searchJSONDetails(moduleAPIName) != null)
			{
				return;
			}

			File resourcesPath = new File(Initializer.getInitializer().getResourcePath() + File.separator + Constants.FIELD_DETAILS_DIRECTORY);

			if (!resourcesPath.exists())
			{
				resourcesPath.mkdirs();
			}

			recordFieldDetailsPath = getFileName();

			File recordFieldDetails = new File(recordFieldDetailsPath);

			if (recordFieldDetails.exists())
			{
				JSONObject recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);

				if (Initializer.getInitializer().getSDKConfig().getAutoRefreshFields() && !newFile && !getModifiedModules && (recordFieldDetailsJson.optString(Constants.FIELDS_LAST_MODIFIED_TIME).isEmpty() || forceRefresh || (System.currentTimeMillis() - Long.valueOf(recordFieldDetailsJson.getString(Constants.FIELDS_LAST_MODIFIED_TIME))) > 3600000))
				{
					getModifiedModules = true;

					lastModifiedTime = recordFieldDetailsJson.has(Constants.FIELDS_LAST_MODIFIED_TIME) ? recordFieldDetailsJson.getString(Constants.FIELDS_LAST_MODIFIED_TIME) : null;

					modifyFields(recordFieldDetailsPath, lastModifiedTime);

					getModifiedModules = false;
					
				}
				else if(!Initializer.getInitializer().getSDKConfig().getAutoRefreshFields() && forceRefresh && !getModifiedModules)
				{
					getModifiedModules = true;
					
					modifyFields(recordFieldDetailsPath, lastModifiedTime);
					
					getModifiedModules = false;
				}
				
				recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);
				
				if (moduleAPIName == null || recordFieldDetailsJson.has(moduleAPIName.toLowerCase()))
				{
					return;
				}
				else
				{
					fillDataType();

					recordFieldDetailsJson.put(moduleAPIName.toLowerCase(), new JSONObject());

					FileWriter file = new FileWriter(recordFieldDetailsPath);

					file.flush();

					file.write(recordFieldDetailsJson.toString());// write existing data + dummy

					file.flush();

					file.close();

					JSONObject fieldDetails = (JSONObject) getFieldsDetails(moduleAPIName);

					recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);

					recordFieldDetailsJson.put(moduleAPIName.toLowerCase(), fieldDetails);

					file = new FileWriter(recordFieldDetailsPath);

					file.flush();

					file.write(recordFieldDetailsJson.toString());// overwrting the dummy +existing data

					file.flush();

					file.close();
				}
			}
			else if (Initializer.getInitializer().getSDKConfig().getAutoRefreshFields())
			{
				newFile = true;

				fillDataType();

				List<String> moduleAPINames = getModules(null);

				JSONObject recordFieldDetailsJson = new JSONObject();

				recordFieldDetailsJson.put(Constants.FIELDS_LAST_MODIFIED_TIME, String.valueOf(System.currentTimeMillis()));

				for (String module : moduleAPINames)
				{
					if (!recordFieldDetailsJson.has(module.toLowerCase()))
					{
						recordFieldDetailsJson.put(module.toLowerCase(), new JSONObject());

						FileWriter file = new FileWriter(recordFieldDetailsPath);

						file.write(recordFieldDetailsJson.toString());

						file.flush();

						file.close();// file created with only dummy

						JSONObject fieldDetails = (JSONObject) getFieldsDetails(module);

						recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);

						recordFieldDetailsJson.put(module.toLowerCase(), fieldDetails);

						file = new FileWriter(recordFieldDetailsPath);

						file.flush();

						file.write(recordFieldDetailsJson.toString());// overwrting the dummy +existing data

						file.flush();

						file.close();
					}
				}

				newFile = false;
			}
			else if(forceRefresh && !getModifiedModules)
			{
				//New file - and force refresh by User
				getModifiedModules = true;
				
				JSONObject recordFieldDetailsJson = new JSONObject();

				FileWriter file = new FileWriter(recordFieldDetailsPath);

				file.write(recordFieldDetailsJson.toString());

				file.flush();

				file.close();// file created with only dummy
				
				modifyFields(recordFieldDetailsPath, lastModifiedTime);
				
				getModifiedModules = false;
			}
			else
			{
				fillDataType();

				JSONObject recordFieldDetailsJson = new JSONObject();

				recordFieldDetailsJson.put(moduleAPIName.toLowerCase(), new JSONObject());

				FileWriter file = new FileWriter(recordFieldDetailsPath);

				file.write(recordFieldDetailsJson.toString());

				file.flush();

				file.close();// file created with only dummy

				JSONObject fieldDetails = (JSONObject) getFieldsDetails(moduleAPIName);

				recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);

				recordFieldDetailsJson.put(moduleAPIName.toLowerCase(), fieldDetails);

				file = new FileWriter(recordFieldDetailsPath);

				file.flush();

				file.write(recordFieldDetailsJson.toString());// overwrting the dummy +existing data

				file.flush();

				file.close();
			}
		}
		catch (IOException | JSONException | SDKException e)
		{
			if (recordFieldDetailsPath != null && new File(recordFieldDetailsPath).exists())
			{
				JSONObject recordFieldDetailsJson;

				try
				{
					recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);

					if (recordFieldDetailsJson.has(moduleAPIName.toLowerCase()))
					{
						recordFieldDetailsJson.remove(moduleAPIName.toLowerCase());
					}

					if (newFile)
					{
						if (recordFieldDetailsJson.get(Constants.FIELDS_LAST_MODIFIED_TIME) != null)
						{
							recordFieldDetailsJson.remove(Constants.FIELDS_LAST_MODIFIED_TIME);
						}

						newFile = false;
					}

					if (getModifiedModules || forceRefresh)
					{
						getModifiedModules = false;
						
						forceRefresh = false;

						if (lastModifiedTime != null)
						{
							recordFieldDetailsJson.put(Constants.FIELDS_LAST_MODIFIED_TIME, lastModifiedTime);
						}
					}

					FileWriter file = new FileWriter(recordFieldDetailsPath);

					file.flush();

					file.write(recordFieldDetailsJson.toString());

					file.flush();

					file.close();
				}
				catch (IOException ex)
				{
					SDKException exception = new SDKException(Constants.EXCEPTION, ex);

					LOGGER.log(Level.SEVERE, Constants.EXCEPTION, exception);

					throw exception;
				}
			}
			
			SDKException exception = (e instanceof SDKException) ? (SDKException) e : new SDKException(Constants.EXCEPTION, e);
			
			LOGGER.log(Level.SEVERE, Constants.EXCEPTION, exception);
			
			throw exception;
		}
	}

	private static void modifyFields(String recordFieldDetailsPath, String modifiedTime) throws IOException, SDKException
	{
		FileWriter file = null;

		List<String> modifiedModules = getModules(modifiedTime);

		JSONObject recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);

		recordFieldDetailsJson.put(Constants.FIELDS_LAST_MODIFIED_TIME, String.valueOf(System.currentTimeMillis()));

		file = new FileWriter(recordFieldDetailsPath);

		file.flush();

		file.write(recordFieldDetailsJson.toString());

		file.flush();

		file.close();

		if (!modifiedModules.isEmpty())
		{
			for (String module : modifiedModules)
			{
				if (recordFieldDetailsJson.has(module.toLowerCase()))
				{
					deleteFields(recordFieldDetailsJson, module);
				}
			}

			file = new FileWriter(recordFieldDetailsPath);

			file.flush();

			file.write(recordFieldDetailsJson.toString());

			file.flush();

			file.close();

			for (String module : modifiedModules)
			{
				Utility.getFields(module);
			}
		}
	}
	
	public static void deleteFields(JSONObject recordFieldDetailsJson, String module)
	{
		ArrayList<String> subformModules = new ArrayList<>();
		
		JSONObject fieldsJSON = recordFieldDetailsJson.getJSONObject(module.toLowerCase());
		
		fieldsJSON.keySet().forEach(key ->
		{
			if(fieldsJSON.getJSONObject(key).has(Constants.SUBFORM) && fieldsJSON.getJSONObject(key).getBoolean(Constants.SUBFORM) && recordFieldDetailsJson.has(fieldsJSON.getJSONObject(key).getString(Constants.MODULE)))
			{
				subformModules.add(fieldsJSON.getJSONObject(key).getString(Constants.MODULE));
			}
		});
		
		recordFieldDetailsJson.remove(module.toLowerCase());
		
		if(!subformModules.isEmpty())
		{
			for(String subformModule : subformModules)
			{
				deleteFields(recordFieldDetailsJson, subformModule);
			}
		}
	}

	private static String getFileName() throws UnsupportedEncodingException
	{
		Converter converterInstance = new Converter()
		{

			@Override
			public Object getWrappedResponse(Object response, String pack) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getResponse(Object response, String pack) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object formRequest(Object requestObject, String pack, Integer instanceNumber, JSONObject memberDetail) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void appendToRequest(HttpEntityEnclosingRequestBase requestBase, Object requestObject) throws Exception
			{
				// TODO Auto-generated method stub

			}
		};

		return Initializer.getInitializer().getResourcePath() + File.separator + Constants.FIELD_DETAILS_DIRECTORY + File.separator + converterInstance.getEncodedFileName();
	}

	public static synchronized void getRelatedLists(String relatedModuleName, String moduleAPIName, CommonAPIHandler commonAPIHandler) throws SDKException
	{
		try
		{
			boolean isNewData = false;

			String key = (moduleAPIName + Constants.UNDERSCORE + Constants.RELATED_LISTS).toLowerCase();

			File resourcesPath = new File(Initializer.getInitializer().getResourcePath() + File.separator + Constants.FIELD_DETAILS_DIRECTORY);

			if (!resourcesPath.exists())
			{
				resourcesPath.mkdirs();
			}

			String recordFieldDetailsPath = getFileName();

			File recordFieldDetails = new File(recordFieldDetailsPath);

			if (!recordFieldDetails.exists() || (recordFieldDetails.exists() && Initializer.getJSON(recordFieldDetailsPath).optJSONArray(key) == null))
			{
				isNewData = true;

				JSONArray relatedListValues = getRelatedListDetails(moduleAPIName);

				JSONObject recordFieldDetailsJSON = recordFieldDetails.exists() ? Initializer.getJSON(recordFieldDetailsPath) : new JSONObject();

				recordFieldDetailsJSON.put(key, relatedListValues);

				FileWriter file = new FileWriter(recordFieldDetailsPath);

				file.write(recordFieldDetailsJSON.toString());

				file.flush();

				file.close();
			}

			JSONObject recordFieldDetailsJSON = Initializer.getJSON(recordFieldDetailsPath);

			JSONArray modulerelatedList = recordFieldDetailsJSON.getJSONArray(key);

			if (!checkRelatedListExists(relatedModuleName, modulerelatedList, commonAPIHandler) && !isNewData)
			{
				recordFieldDetailsJSON.remove(key);

				FileWriter file = new FileWriter(recordFieldDetailsPath);

				file.write(recordFieldDetailsJSON.toString());

				file.flush();

				file.close();

				Utility.getRelatedLists(relatedModuleName, moduleAPIName, commonAPIHandler);
			}
		}
		catch (SDKException e)
		{
			LOGGER.log(Level.SEVERE, Constants.EXCEPTION, e);
			
			throw e;
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(Constants.EXCEPTION, e);

			LOGGER.log(Level.SEVERE, Constants.EXCEPTION, exception);

			throw exception;
		}
	}

	private static boolean checkRelatedListExists(String relatedModuleName, JSONArray modulerelatedListJA, CommonAPIHandler commonAPIHandler) throws JSONException, SDKException
	{
		for (int index = 0; index < modulerelatedListJA.length(); index++)
		{
			JSONObject relatedListJO = modulerelatedListJA.getJSONObject(index);

			if (relatedListJO.getString(Constants.API_NAME) != null && relatedListJO.getString(Constants.API_NAME).equalsIgnoreCase(relatedModuleName))
			{
				if(relatedListJO.getString(Constants.HREF).equals(Constants.NULL_VALUE))
				{
					throw new SDKException(Constants.UNSUPPORTED_IN_API, commonAPIHandler.getHttpMethod() + " " + commonAPIHandler.getApiPath() + Constants.UNSUPPORTED_IN_API_MESSAGE);
				}

				if(!relatedListJO.getString(Constants.MODULE).equalsIgnoreCase(Constants.NULL_VALUE))
				{
					commonAPIHandler.setModuleAPIName(relatedListJO.getString(Constants.MODULE));
					
					Utility.getFields(relatedListJO.getString(Constants.MODULE));
				}

				return true;
			}
		}

		return false;
	}

	private static JSONArray getRelatedListDetails(String moduleAPIName) throws SDKException
	{
		RelatedListsOperations relatedListsOperations = new RelatedListsOperations(moduleAPIName);

		APIResponse<com.zoho.crm.api.relatedlists.ResponseHandler> response = relatedListsOperations.getRelatedLists();

		JSONArray relatedListJA = new JSONArray();

		if (response != null)
		{
			if (response.getStatusCode() == Constants.NO_CONTENT_STATUS_CODE)
			{
				return relatedListJA;
			}
			
			if (response.isExpected())
			{
				com.zoho.crm.api.relatedlists.ResponseHandler responseHandler = response.getObject();

				if (responseHandler instanceof com.zoho.crm.api.relatedlists.ResponseWrapper)
				{
					com.zoho.crm.api.relatedlists.ResponseWrapper responseWrapper = (com.zoho.crm.api.relatedlists.ResponseWrapper) responseHandler;

					ArrayList<RelatedList> relatedLists = (ArrayList<RelatedList>) responseWrapper.getRelatedLists();

					for (RelatedList relatedList : relatedLists)
					{
						JSONObject relatedListDetail = new JSONObject();

						relatedListDetail.put(Constants.API_NAME, relatedList.getAPIName());

						relatedListDetail.put(Constants.MODULE, relatedList.getModule()!= null ? relatedList.getModule() : Constants.NULL_VALUE);

						relatedListDetail.put(Constants.NAME, relatedList.getName());

						relatedListDetail.put(Constants.HREF, relatedList.getHref() != null ? relatedList.getHref() : Constants.NULL_VALUE);

						relatedListJA.put(relatedListDetail);
					}
				}
				else if (responseHandler instanceof com.zoho.crm.api.relatedlists.APIException)
				{
					com.zoho.crm.api.relatedlists.APIException exception = (com.zoho.crm.api.relatedlists.APIException) responseHandler;

					JSONObject errorResponse = new JSONObject();

					errorResponse.put(Constants.CODE, exception.getCode().getValue());

					errorResponse.put(Constants.STATUS, exception.getStatus().getValue());

					errorResponse.put(Constants.MESSAGE, exception.getMessage().getValue());

					throw new SDKException(Constants.API_EXCEPTION, errorResponse);
				}
			}
			else
			{
				JSONObject errorResponse = new JSONObject();

				errorResponse.put(Constants.CODE, response.getStatusCode());

				throw new SDKException(Constants.API_EXCEPTION, errorResponse);
			}
		}

		return relatedListJA;
	}

	/**
	 * This method to get module field data from Zoho CRM.
	 * 
	 * @param moduleAPIName A String containing the CRM module API name.
	 * @return A Object representing the Zoho CRM module field details.
	 * @throws SDKException
	 */
	public static Object getFieldsDetails(String moduleAPIName) throws SDKException
	{
		JSONObject fieldsDetails = new JSONObject();

		FieldsOperations fieldOperation = new FieldsOperations(moduleAPIName);

		APIResponse<ResponseHandler> response = fieldOperation.getFields(null);

		if (response != null)
		{
			if (response.getStatusCode() == Constants.NO_CONTENT_STATUS_CODE)
			{
				return fieldsDetails;
			}

			// Check if expected response is received
			if (response.isExpected())
			{
				ResponseHandler responseHandler = response.getObject();

				if (responseHandler instanceof ResponseWrapper)
				{
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;

					ArrayList<Field> fields = (ArrayList<Field>) responseWrapper.getFields();

					for (Field field : fields)
					{
						String keyName = field.getAPIName();

						if (Constants.KEYS_TO_SKIP.contains(keyName))
						{
							continue;
						}
						
						JSONObject fieldDetail = new JSONObject();

						setDataType(fieldDetail, field, moduleAPIName);

						fieldsDetails.put(field.getAPIName(), fieldDetail);
					}

					if (Constants.INVENTORY_MODULES.contains(moduleAPIName.toLowerCase()))
					{
						JSONObject fieldDetail = new JSONObject();

						fieldDetail.put(Constants.NAME, Constants.LINE_TAX);

						fieldDetail.put(Constants.TYPE, Constants.LIST_NAMESPACE);

						fieldDetail.put(Constants.STRUCTURE_NAME, Constants.LINE_TAX_NAMESPACE);

						fieldDetail.put(Constants.LOOKUP, true);
						
						fieldsDetails.put(Constants.LINE_TAX, fieldDetail);
					}
					
					if (Constants.NOTES.equalsIgnoreCase(moduleAPIName))
					{
						JSONObject fieldDetail = new JSONObject();

						fieldDetail.put(Constants.NAME, Constants.ATTACHMENTS);

						fieldDetail.put(Constants.TYPE, Constants.LIST_NAMESPACE);

						fieldDetail.put(Constants.STRUCTURE_NAME, Constants.ATTACHMENTS_NAMESPACE);

						fieldsDetails.put(Constants.ATTACHMENTS, fieldDetail);
					}
				}
				else if (responseHandler instanceof com.zoho.crm.api.fields.APIException)
				{
					com.zoho.crm.api.fields.APIException exception = (com.zoho.crm.api.fields.APIException) responseHandler;

					JSONObject errorResponse = new JSONObject();

					errorResponse.put(Constants.CODE, exception.getCode().getValue());

					errorResponse.put(Constants.STATUS, exception.getStatus().getValue());

					errorResponse.put(Constants.MESSAGE, exception.getMessage().getValue());

					throw new SDKException(Constants.API_EXCEPTION, errorResponse);
				}
			}
			else
			{
				JSONObject errorResponse = new JSONObject();

				errorResponse.put(Constants.CODE, response.getStatusCode());

				throw new SDKException(Constants.API_EXCEPTION, errorResponse);
			}
		}

		return fieldsDetails;
	}

	public static JSONObject searchJSONDetails(String key)
	{
		key = Constants.PACKAGE_NAMESPACE + ".record." + key;

		Iterator<String> iter = JSONDETAILS.keySet().iterator();

		while (iter.hasNext())
		{
			String keyInJSON = iter.next();

			if (keyInJSON.equalsIgnoreCase(key))
			{
				JSONObject returnJSON = new JSONObject();

				returnJSON.put(Constants.MODULEPACKAGENAME, keyInJSON);

				returnJSON.put(Constants.MODULEDETAILS, JSONDETAILS.getJSONObject(keyInJSON));

				return returnJSON;
			}
		}

		return null;
	}

	private static ArrayList<String> getModules(String header) throws SDKException
	{
		ArrayList<String> apiNames = new ArrayList<>();

		HeaderMap headerMap = new HeaderMap();

		if (header != null)
		{
			OffsetDateTime headerValue = OffsetDateTime.ofInstant(Instant.ofEpochMilli(Long.valueOf(header)), ZoneId.systemDefault()).withNano(0);

			headerMap.add(GetModulesHeader.IF_MODIFIED_SINCE, headerValue);
		}

		APIResponse<com.zoho.crm.api.modules.ResponseHandler> response = new ModulesOperations().getModules(headerMap);

		if (response != null)
		{
			if(Arrays.asList(Constants.NO_CONTENT_STATUS_CODE, Constants.NOT_MODIFIED_STATUS_CODE).contains(response.getStatusCode()))
			{
				return apiNames;
			}
			
			// Check if expected response is received
			if (response.isExpected())
			{
				com.zoho.crm.api.modules.ResponseHandler responseObject = response.getObject();
	
				if (responseObject instanceof com.zoho.crm.api.modules.ResponseWrapper)
				{
					List<Module> modules = ((com.zoho.crm.api.modules.ResponseWrapper) responseObject).getModules();
	
					for (Module module : modules)
					{
						if (module.getAPISupported())
						{
							apiNames.add(module.getAPIName());
						}
					}
				}
				else if (responseObject instanceof com.zoho.crm.api.modules.APIException)
				{
					com.zoho.crm.api.modules.APIException exception = (com.zoho.crm.api.modules.APIException) responseObject;

					JSONObject errorResponse = new JSONObject();

					errorResponse.put(Constants.CODE, exception.getCode().getValue());

					errorResponse.put(Constants.STATUS, exception.getStatus().getValue());

					errorResponse.put(Constants.MESSAGE, exception.getMessage().getValue());

					throw new SDKException(Constants.API_EXCEPTION, errorResponse);
				}
			}
		}

		return apiNames;
	}
	
	public static void refreshModules() throws SDKException
	{
		forceRefresh = true;
		
		getFields(null);
		
		forceRefresh = false;
	}

	public static JSONObject getJSONObject(JSONObject json, String key)
	{
		Iterator<String> iter = json.keySet().iterator();

		while (iter.hasNext())
		{
			String keyInJSON = iter.next();

			if (keyInJSON.equalsIgnoreCase(key))
			{
				return json.getJSONObject(keyInJSON);
			}
		}

		return null;
	}

	private static void setDataType(JSONObject fieldDetail, Field field, String moduleAPIName) throws SDKException
	{
		String apiType = field.getDataType();

		String keyName = field.getAPIName();

		String module = "";
		
		if(field.getSystemMandatory() != null && field.getSystemMandatory() == true && !(moduleAPIName.equalsIgnoreCase(Constants.CALLS) && keyName.equalsIgnoreCase(Constants.CALL_DURATION)))
		{
			fieldDetail.put(Constants.REQUIRED, true);
		}

		if (keyName.equalsIgnoreCase(Constants.PRODUCT_DETAILS) && Constants.INVENTORY_MODULES.contains(moduleAPIName.toLowerCase()))
		{
			fieldDetail.put(Constants.NAME, keyName);

			fieldDetail.put(Constants.TYPE, Constants.LIST_NAMESPACE);

			fieldDetail.put(Constants.STRUCTURE_NAME, Constants.INVENTORY_LINE_ITEMS);
			
			fieldDetail.put(Constants.SKIP_MANDATORY, true);

			return;
		}
		else if (keyName.equalsIgnoreCase(Constants.PRICING_DETAILS) && moduleAPIName.equalsIgnoreCase(Constants.PRICE_BOOKS))
		{
			fieldDetail.put(Constants.NAME, keyName);

			fieldDetail.put(Constants.TYPE, Constants.LIST_NAMESPACE);

			fieldDetail.put(Constants.STRUCTURE_NAME, Constants.PRICINGDETAILS);
			
			fieldDetail.put(Constants.SKIP_MANDATORY, true);

			return;
		}
		else if (keyName.equalsIgnoreCase(Constants.PARTICIPANT_API_NAME) && (moduleAPIName.equalsIgnoreCase(Constants.EVENTS) || moduleAPIName.equalsIgnoreCase(Constants.ACTIVITIES)))
		{
			fieldDetail.put(Constants.NAME, keyName);

			fieldDetail.put(Constants.TYPE, Constants.LIST_NAMESPACE);

			fieldDetail.put(Constants.STRUCTURE_NAME, Constants.PARTICIPANTS);
			
			fieldDetail.put(Constants.SKIP_MANDATORY, true);

			return;
		}
		else if (keyName.equalsIgnoreCase(Constants.COMMENTS) && (moduleAPIName.equalsIgnoreCase(Constants.SOLUTIONS) || moduleAPIName.equalsIgnoreCase(Constants.CASES)))
		{
			fieldDetail.put(Constants.NAME, keyName);
			
			fieldDetail.put(Constants.TYPE, Constants.LIST_NAMESPACE);
			
			fieldDetail.put(Constants.STRUCTURE_NAME, Constants.COMMENT_NAMESPACE);
			
			fieldDetail.put(Constants.LOOKUP, true);

			return;
		}
		else if (keyName.equalsIgnoreCase(Constants.LAYOUT))
		{
			fieldDetail.put(Constants.NAME, keyName);

			fieldDetail.put(Constants.TYPE, Constants.LAYOUT_NAMESPACE);

			fieldDetail.put(Constants.STRUCTURE_NAME, Constants.LAYOUT_NAMESPACE);
			
			fieldDetail.put(Constants.LOOKUP, true);

			return;
		}
		else if (apiTypeVsdataType.containsKey(apiType))
		{
			fieldDetail.put(Constants.TYPE, apiTypeVsdataType.get(apiType));
		}
		else if(apiType.equalsIgnoreCase(Constants.FORMULA))
		{
			if(field.getFormula() != null)
			{
				String returnType = field.getFormula().getReturnType();
				
				if(apiTypeVsdataType.get(returnType) != null)
				{
					fieldDetail.put(Constants.TYPE, apiTypeVsdataType.get(returnType));
				}
			}
			
			fieldDetail.put(Constants.READ_ONLY, true);
		}
		else
		{
			return;
		}

		if(apiType.toLowerCase().contains(Constants.LOOKUP))
		{
			fieldDetail.put(Constants.LOOKUP, true);
		}
		
		if(apiType.toLowerCase().equalsIgnoreCase(Constants.CONSENT_LOOKUP))
		{
			fieldDetail.put(Constants.SKIP_MANDATORY, true);
		}
		
		if (apiTypeVsStructureName.containsKey(apiType))
		{
			fieldDetail.put(Constants.STRUCTURE_NAME, apiTypeVsStructureName.get(apiType));
		}

		if (field.getDataType().equalsIgnoreCase(Constants.PICKLIST) && (field.getPickListValues() != null && field.getPickListValues().size() > 0))
		{
			fieldDetail.put(Constants.PICKLIST, true);
			
			JSONArray values = new JSONArray();

			field.getPickListValues().forEach(plv ->
			{
				values.put(plv.getDisplayValue());
			});

			fieldDetail.put(Constants.VALUES, values);
		}

		if (apiType.equalsIgnoreCase(Constants.SUBFORM))
		{
			module = field.getSubform().getModule();

			fieldDetail.put(Constants.MODULE, module);
			
			fieldDetail.put(Constants.SKIP_MANDATORY, true);
			
			fieldDetail.put(Constants.SUBFORM, true);
		}

		if (apiType.equalsIgnoreCase(Constants.LOOKUP))
		{
			module = field.getLookup().getModule();

			if (module != null && !module.equalsIgnoreCase(Constants.SE_MODULE))
			{
				fieldDetail.put(Constants.MODULE, module);
				
				if(module.equalsIgnoreCase(Constants.ACCOUNTS) && !field.getCustomField())
				{
					fieldDetail.put(Constants.SKIP_MANDATORY, true);
				}
			}
			else
			{
				module = "";
			}
			
			fieldDetail.put(Constants.LOOKUP, true);
		}

		if (module.length() > 0)
		{
			Utility.getFields(module);
		}

		fieldDetail.put(Constants.NAME, keyName);

	}

	private static void fillDataType()
	{
		if(!apiTypeVsdataType.isEmpty())
		{
			return;
		}
		
		String[] fieldAPINamesString = new String[] { "textarea", "text", "website", "email", "phone", "mediumtext", "multiselectlookup", "profileimage" };

		String[] fieldAPINamesInteger = new String[] { "integer" };

		String[] fieldAPINamesBoolean = new String[] { "boolean" };

		String[] fieldAPINamesLong = new String[] { "long", "bigint", "autonumber" };

		String[] fieldAPINamesDouble = new String[] { "double", "percent", "lookup", "currency" };

		String[] fieldAPINamesFile = new String[] { "imageupload" };

		String[] fieldAPINamesFieldFile = new String[] { "fileupload" };

		String[] fieldAPINamesDateTime = new String[] { "datetime", "event_reminder" };

		String[] fieldAPINamesDate = new String[] { "date" };

		String[] fieldAPINamesLookup = new String[] { "lookup" };

		String[] fieldAPINamesPickList = new String[] { "picklist" };

		String[] fieldAPINamesMultiSelectPickList = new String[] { "multiselectpicklist" };

		String[] fieldAPINamesSubForm = new String[] { "subform" };

		String[] fieldAPINamesOwnerLookUp = new String[] { "ownerlookup", "userlookup" };

		String[] fieldAPINamesMultiUserLookUp = new String[] { "multiuserlookup" };

		String[] fieldAPINamesMultiModuleLookUp = new String[] { "multimodulelookup" };

		String[] fieldAPINameTaskRemindAt = new String[] { "ALARM" };

		String[] fieldAPINameRecurringActivity = new String[] { "RRULE" };

		String[] fieldAPINameReminder = new String[] { "multireminder" };
		
		String[] fieldAPINameConsentLookUp = new String[] { "consent_lookup" };

		for (String fieldAPIName : fieldAPINamesString)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.STRING_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesInteger)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.INTEGER_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesBoolean)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.BOOLEAN_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesLong)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.LONG_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesDouble)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.DOUBLE_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesFile)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.FILE_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesDateTime)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.DATETIME_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesDate)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.DATE_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesLookup)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.RECORD_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.RECORD_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesPickList)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.CHOICE_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesMultiSelectPickList)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.LIST_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.CHOICE_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesSubForm)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.LIST_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.RECORD_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesOwnerLookUp)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.USER_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.USER_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesMultiUserLookUp)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.LIST_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.USER_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesMultiModuleLookUp)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.LIST_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.MODULE_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINamesFieldFile)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.LIST_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.FIELD_FILE_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINameTaskRemindAt)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.REMINDAT_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.REMINDAT_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINameRecurringActivity)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.RECURRING_ACTIVITY_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.RECURRING_ACTIVITY_NAMESPACE);
		}

		for (String fieldAPIName : fieldAPINameReminder)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.LIST_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.REMINDER_NAMESPACE);
		}
		
		for(String fieldAPIName : fieldAPINameConsentLookUp)
		{
			apiTypeVsdataType.put(fieldAPIName, Constants.CONSENT_NAMESPACE);

			apiTypeVsStructureName.put(fieldAPIName, Constants.CONSENT_NAMESPACE);
		}
	}
}
