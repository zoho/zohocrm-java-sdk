package com.zoho.crm.api.dc;

/**
 * This class represents the properties of Zoho CRM in AU Domain.
 */
public class AUDataCenter extends DataCenter
{
	private static final AUDataCenter AU = new AUDataCenter();

	private AUDataCenter()
	{
	}

	/**
	 * This Environment class instance represents the Zoho CRM Production Environment in AU Domain.
	 */
	public static final Environment PRODUCTION = new Environment()
	{
		/**
		 * This method to get Zoho CRM production API URL.
		 * @return A String representing the Zoho CRM production API URL.
		 */
		public String getUrl()
		{
			return "https://www.zohoapis.com.au";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return AU.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return AU.getFileUploadUrl();
		}
	};

	/**
	 * This Environment class instance represents the Zoho CRM Sandbox Environment in AU Domain.
	 */
	public static final Environment SANDBOX = new Environment()
	{
		/**
		 * This method to get Zoho CRM sandbox API URL.
		 * @return A String representing the Zoho CRM sandbox API URL.
		 */
		public String getUrl()
		{
			return "https://sandbox.zohoapis.com.au";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return AU.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return AU.getFileUploadUrl();
		}
	};

	/**
	 * This Environment class instance represents the Zoho CRM Developer Environment in AU Domain.
	 */
	public static final Environment DEVELOPER = new Environment()
	{
		/**
		 * This method to get Zoho CRM developer API URL.
		 * @return A String representing the Zoho CRM developer API URL.
		 */
		public String getUrl()
		{
			return "https://developer.zohoapis.com.au";
		}

		/**
		 * This method to get Zoho CRM Accounts URL.
		 * @return A String representing the accounts URL.
		 */
		public String getAccountsUrl()
		{
			return AU.getIAMUrl();
		}
		
		/**
		 * This method to get Zoho CRM File Upload URL.
		 * @return A String representing the File Upload URL.
		 */
		public String getFileUploadUrl()
		{
			return AU.getFileUploadUrl();
		}
	};

	@Override
	public String getIAMUrl()
	{
		return "https://accounts.zoho.com.au/oauth/v2/token";
	}

	@Override
	public String getFileUploadUrl()
	{
		return "https://content.zohoapis.com.au";
	}
}