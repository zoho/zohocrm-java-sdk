package com.zoho.crm.api;


/**
 * The class to configure the SDK.
 */
public class SDKConfig
{
	/**
	 * The Builder class to build SDKConfig
	 */
	public static class Builder 
	{
		private boolean autoRefreshFields = false;
		
		private boolean pickListValidation = true;
		
		public Builder()
		{
		}
		
		/**
		 * This is a setter method to set autoRefreshFields.
		 * @param autoRefreshFields A boolean
		 * @return An instance of Builder
		 */
		public Builder setAutoRefreshFields(boolean autoRefreshFields)
		{
			this.autoRefreshFields = autoRefreshFields;
			
			return this;
		}
		
		/**
		 * This is a setter method to set pickListValidation.
		 * @param pickListValidation A boolean
		 * @return An instance of Builder
		 */
		public Builder setPickListValidation(boolean pickListValidation)
		{
			this.pickListValidation = pickListValidation;
			
			return this;
		}
		
		/**
		 * The method to build the SDKConfig instance
		 * @return An instance of SDKConfig
		 */
		public SDKConfig build()
		{
			return new SDKConfig(autoRefreshFields, pickListValidation);
		}
	}

	private boolean autoRefreshFields;
	
	private boolean pickListValidation;
	
	/**
	 * Creates an instance of SDKConfig with the given parameters
	 * @param autoRefreshFields A boolean representing autoRefreshFields
	 * @param pickListValidation A boolean representing pickListValidation
	 */
	private SDKConfig(boolean autoRefreshFields, boolean pickListValidation)
	{
		this.autoRefreshFields = autoRefreshFields;
		
		this.pickListValidation = pickListValidation;
	}

	/**
	 * This is a getter method to get autoRefreshFields.
	 * @return A boolean representing autoRefreshFields
	 */
	public boolean getAutoRefreshFields()
	{
		return autoRefreshFields;
	}

	/**
	 * This is a getter method to get pickListValidation.
	 * @return A boolean representing pickListValidation
	 */
	public boolean getPickListValidation()
	{
		return pickListValidation;
	}
}
