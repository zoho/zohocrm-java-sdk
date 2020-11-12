package com.zoho.crm.api.dc;

/**
 * The abstract class represents the properties of Zoho CRM DataCenter.
 */
public abstract class DataCenter
{

	/**
	 * This method to get accounts URL.
	 * URL to be used when calling an OAuth accounts.
	 * @return A String representing the accounts URL.
	 */
	public abstract String getIAMUrl();
	
	/**
	 * This method to get File Upload URL.
	 * @return A String representing the File Upload URL.
	 */
	public abstract String getFileUploadUrl();

	/**
	 * The abstract class represents the properties of Zoho CRM Environment.
	 */
	public static abstract class Environment
	{
		/**
		 * This method to get Zoho CRM API URL.
		 * @return A String representing the Zoho CRM API URL.
		 */
		public abstract String getUrl();

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public abstract String getAccountsUrl();
		
		/**
		 * This method to get File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public abstract String getFileUploadUrl();
	}
}