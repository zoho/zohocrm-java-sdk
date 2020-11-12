package com.zoho.api.logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.Constants;

/**
 * This class to initialize the SDK logger.
 */
public class SDKLogger
{
	private static final Logger LOGGER = Logger.getLogger(SDKLogger.class.getName());
	
	/**
	 * Creates an User SDKLogger instance with the specified Logger class instance. 
	 * @param logger A Logger class instance.
	 * @throws SDKException 
	 */
	public static void initialize(com.zoho.api.logger.Logger logger) throws SDKException
	{
		new SDKLogger(logger);
	}
	
	SDKLogger(com.zoho.api.logger.Logger logger) throws SDKException
	{
		try
		{
			FileHandler fileHandler;
			
			if (logger.getFilePath() != null && logger.getFilePath() != "")
			{
				fileHandler = new FileHandler(logger.getFilePath(), true);
				
				LOGGER.addHandler(fileHandler);
				
				LOGGER.setUseParentHandlers(false);

				fileHandler.setFormatter(new Formatter());
			}

			if (logger.getLevel() != null && Constants.LOGGER_LEVELS.containsKey(logger.getLevel()))
			{
				LOGGER.setLevel(Constants.LOGGER_LEVELS.get(logger.getLevel()));
			}
		}
		catch (Exception e)
		{
			throw new SDKException(Constants.SDK_LOGGER_INITIALIZE, e);
		}
	}

	private static class Formatter extends java.util.logging.Formatter
	{
		@Override
		public String format(LogRecord record)
		{
			StringBuilder sb = new StringBuilder();

			sb.append(new Date(record.getMillis())).append(" ").append(record.getLoggerName()).append(": ").append(record.getLevel().getLocalizedName()).append(" ").append(record.getSourceClassName()).append(" ").append(record.getSourceMethodName()).append(": ").append(formatMessage(record));

			if (record.getThrown() != null)
			{
				try
				{
					StringWriter sw = new StringWriter();
					
					PrintWriter pw = new PrintWriter(sw);
					
					record.getThrown().printStackTrace(pw);
					
					pw.close();
					
					sb.append(sw.toString());
				}
				catch (Exception ex)
				{
					java.util.logging.Logger.getGlobal().log(Level.INFO, ex.toString());
				}
			}
			
			sb.append("\n");

			return sb.toString();
		}
	}
}