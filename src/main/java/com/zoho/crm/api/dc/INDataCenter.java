package com.zoho.crm.api.dc;

/**
 * This class represents the properties of Zoho CRM in IN Domain.
 */
public class INDataCenter extends DataCenter
{
	private static final INDataCenter IN = new INDataCenter();

	private INDataCenter()
	{
	}

	/**
	 * This Environment class instance represents the Zoho CRM Production Environment in IN Domain.
	 */
	public static final Environment PRODUCTION = new Environment()
	{
		/**
		 * This method to get Zoho CRM production API URL.
		 * @return A String representing the Zoho CRM production API URL.
		 */
		public String getUrl()
		{
			return "https://www.zohoapis.in";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return IN.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return IN.getFileUploadUrl();
		}
	};

	/**
	 * This Environment class instance represents the Zoho CRM Sandbox Environment in IN Domain.
	 */
	public static final Environment SANDBOX = new Environment()
	{
		/**
		 * This method to get Zoho CRM sandbox API URL.
		 * @return A String representing the Zoho CRM sandbox API URL.
		 */
		public String getUrl()
		{
			return "https://sandbox.zohoapis.in";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return IN.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return IN.getFileUploadUrl();
		}
	};

	/**
	 * This Environment class instance represents the Zoho CRM Developer Environment in IN Domain.
	 */
	public static final Environment DEVELOPER = new Environment()
	{
		/**
		 * This method to get Zoho CRM developer API URL.
		 * @return A String representing the Zoho CRM developer API URL.
		 */
		public String getUrl()
		{
			return "https://developer.zohoapis.in";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return IN.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return IN.getFileUploadUrl();
		}
	};

	@Override
	public String getIAMUrl()
	{
		return "https://accounts.zoho.in/oauth/v2/token";
	}

	@Override
	public String getFileUploadUrl()
	{
		return "https://content.zohoapis.in";
	}
}