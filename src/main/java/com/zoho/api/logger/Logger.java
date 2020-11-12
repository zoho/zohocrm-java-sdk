package com.zoho.api.logger;

/**
 * This class represents the Logger level and log file path.
 */
public class Logger
{
	private String level;
	
	private String filePath;

	Logger(Levels level, String filePath)
	{
		this.level = level.name();
		
		this.filePath = filePath;
	}
	
	/**
	 * Creates an Logger class instance with the specified log level and file path.
	 * @param level A enum containing the log level.
	 * @param filePath A String containing the log file path.
	 * @return A Logger class instance.
	 */
	public static com.zoho.api.logger.Logger getInstance(Levels level, String filePath)
	{
		return new Logger(level, filePath);
	}

	/**
	 * This is a getter method to get logger level.
	 * @return A String representing the logger level.
	 */
	public String getLevel()
	{
		return level;
	}

	/**
	 * This is a getter method to get log file path.
	 * @return A String representing the Absolute file path, where messages need to be logged.
	 */
	public String getFilePath()
	{
		return filePath;
	}

	/**
	 * This enum used to give logger levels.
	 */
	public static enum Levels
	{
		OFF, FINE, FINEST, WARNING, ALL, FINER, CONFIG, INFO, SEVERE
	}
}