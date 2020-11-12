package com.zoho.crm.api.dc;

/**
 * This class represents the properties of Zoho CRM in EU Domain.
 */
public class EUDataCenter extends DataCenter
{
	private static final EUDataCenter EU = new EUDataCenter();

	private EUDataCenter()
	{
	}

	/**
	 * This Environment class instance represents the Zoho CRM Production Environment in EU Domain.
	 */
	public static final Environment PRODUCTION = new Environment()
	{
		/**
		 * This method to get Zoho CRM production API URL.
		 * @return A String representing the Zoho CRM production API URL.
		 */
		public String getUrl()
		{
			return "https://www.zohoapis.eu";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return EU.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return EU.getFileUploadUrl();
		}
	};

	/**
	 * This Environment class instance represents the Zoho CRM Sandbox Environment in EU Domain.
	 */
	public static final Environment SANDBOX = new Environment()
	{
		/**
		 * This method to get Zoho CRM sandbox API URL.
		 * @return A String representing the Zoho CRM sandbox API URL.
		 */
		public String getUrl()
		{
			return "https://sandbox.zohoapis.eu";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return EU.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return EU.getFileUploadUrl();
		}
	};

	/**
	 * This Environment class instance represents the Zoho CRM Developer Environment in EU Domain.
	 */
	public static final Environment DEVELOPER = new Environment()
	{
		/**
		 * This method to get Zoho CRM developer API URL.
		 * @return A String representing the Zoho CRM developer API URL.
		 */
		public String getUrl()
		{
			return "https://developer.zohoapis.eu";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return EU.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return EU.getFileUploadUrl();
		}
	};

	@Override
	public String getIAMUrl()
	{
		return "https://accounts.zoho.eu/oauth/v2/token";
	}

	@Override
	public String getFileUploadUrl()
	{
		return "https://content.zohoapis.eu";
	}
}