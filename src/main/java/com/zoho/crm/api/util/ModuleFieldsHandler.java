package com.zoho.crm.api.util;

import java.io.File;

import java.io.FileWriter;

import java.util.logging.Level;

import java.util.logging.Logger;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import org.json.JSONObject;

import com.zoho.api.logger.SDKLogger;

import com.zoho.crm.api.Initializer;

import com.zoho.crm.api.exception.SDKException;

/**
 * The class contains methods to manipulate the fields of all the modules.
 */
public class ModuleFieldsHandler
{
	private static final Logger LOGGER = Logger.getLogger(SDKLogger.class.getName());
	
	/**
	 * The method to obtain resources directory path.
	 * @return A String representing the directory's absolute path.
	 */
	private static String getDirectory()
	{
		return Initializer.getInitializer().getResourcePath() + File.separator + Constants.FIELD_DETAILS_DIRECTORY;
	}
	
	/**
	 * The method to delete fields JSON File of the current user.
	 * @throws SDKException 
	 */
	public static synchronized void deleteFieldsFile() throws SDKException
	{
		try
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
				public Object formRequest(Object requestInstance, String pack, Integer instanceNumber, JSONObject memberDetail) throws Exception
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
			
			String recordFieldDetailsPath = getDirectory() + File.separator + converterInstance.getEncodedFileName();
			
			File recordFieldDetails = new File(recordFieldDetailsPath);
			
			if(recordFieldDetails.exists())
			{
				recordFieldDetails.delete();
			}
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);

			LOGGER.log(Level.SEVERE, Constants.DELETE_FIELD_FILE_ERROR, exception);

			throw exception;
		}
	}
	
	/**
	 * The method to delete all the field JSON files under resources directory.
	 * @throws SDKException 
	 */
	public static synchronized void deleteAllFieldFiles() throws SDKException
	{
		try
		{
			File recordFieldDetailsDirectory = new File(getDirectory());
			
			if(recordFieldDetailsDirectory.exists())
			{
				File[] files = recordFieldDetailsDirectory.listFiles();
				
				if(files != null)
				{
					for(File file : files)
					{
						if(file.getName().endsWith(Constants.JSON_FILE_EXTENSION))
						{
							file.delete();
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);

			LOGGER.log(Level.SEVERE, Constants.DELETE_FIELD_FILES_ERROR, exception);

			throw exception;
		}
	}
	
	/**
	 * The method to delete fields of the given module from the current user's fields JSON file.
	 * @param module A string representing the module.
	 * @throws SDKException 
	 */
	private static void deleteFields(String module) throws SDKException
	{
		try
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
				public Object formRequest(Object requestInstance, String pack, Integer instanceNumber, JSONObject memberDetail) throws Exception
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
			
			String recordFieldDetailsPath = getDirectory() + File.separator + converterInstance.getEncodedFileName();
			
			File recordFieldDetails = new File(recordFieldDetailsPath);
			
			if(recordFieldDetails.exists())
			{
				JSONObject recordFieldDetailsJson = Initializer.getJSON(recordFieldDetailsPath);
				
				if(recordFieldDetailsJson.has(module.toLowerCase()))
				{
					Utility.deleteFields(recordFieldDetailsJson, module);
					
					FileWriter file = new FileWriter(recordFieldDetailsPath);
					
					file.flush();
					
					file.write(recordFieldDetailsJson.toString());
					
					file.flush();
					
					file.close();
				}
			}
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);

			throw exception;
		}
	}
	
	/**
	 * The method to force-refresh fields of a module.
	 * @param module A string representing the module.
	 * @throws SDKException
	 */
	public static synchronized void refreshFields(String module) throws SDKException
	{
		try
		{
			deleteFields(module);
			
			Utility.getFields(module);
		}
		catch (SDKException e)
		{
			LOGGER.log(Level.SEVERE, Constants.REFRESH_SINGLE_MODULE_FIELDS_ERROR.concat(module), e);

			throw e;
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);

			LOGGER.log(Level.SEVERE, Constants.REFRESH_SINGLE_MODULE_FIELDS_ERROR + module, exception);

			throw exception;
		}
	}
	
	/**
	 * The method to force-refresh fields of all the available modules.
	 * @throws SDKException
	 */
	public static synchronized void refreshAllModules() throws SDKException
	{
		try
		{
			Utility.refreshModules();
		}
		catch (SDKException e)
		{
			LOGGER.log(Level.SEVERE, Constants.REFRESH_ALL_MODULE_FIELDS_ERROR, e);

			throw e;
		}
		catch (Exception e)
		{
			SDKException exception = new SDKException(e);

			LOGGER.log(Level.SEVERE, Constants.REFRESH_ALL_MODULE_FIELDS_ERROR, exception);

			throw exception;
		}
	}
}