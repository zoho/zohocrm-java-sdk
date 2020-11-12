package com.zoho.crm.api.org;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Org implements Model
{
	private String country;

	private String photoId;

	private String city;

	private String description;

	private Boolean mcStatus;

	private Boolean gappsEnabled;

	private String domainName;

	private Boolean translationEnabled;

	private String street;

	private String alias;

	private String currency;

	private Long id;

	private String state;

	private String fax;

	private String employeeCount;

	private String zip;

	private String website;

	private String currencySymbol;

	private String mobile;

	private String currencyLocale;

	private String primaryZuid;

	private String ziaPortalId;

	private String timeZone;

	private String zgid;

	private String countryCode;

	private LicenseDetails licenseDetails;

	private String phone;

	private String companyName;

	private Boolean privacySettings;

	private String primaryEmail;

	private String isoCode;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of country
	 * @return A String representing the country
	 */
	public String getCountry()
	{
		return  this.country;

	}

	/**
	 * The method to set the value to country
	 * @param country A String representing the country
	 */
	public void setCountry(String country)
	{
		 this.country=country;

		 this.keyModified.put("country", 1);

	}

	/**
	 * The method to get the value of photoId
	 * @return A String representing the photoId
	 */
	public String getPhotoId()
	{
		return  this.photoId;

	}

	/**
	 * The method to set the value to photoId
	 * @param photoId A String representing the photoId
	 */
	public void setPhotoId(String photoId)
	{
		 this.photoId=photoId;

		 this.keyModified.put("photo_id", 1);

	}

	/**
	 * The method to get the value of city
	 * @return A String representing the city
	 */
	public String getCity()
	{
		return  this.city;

	}

	/**
	 * The method to set the value to city
	 * @param city A String representing the city
	 */
	public void setCity(String city)
	{
		 this.city=city;

		 this.keyModified.put("city", 1);

	}

	/**
	 * The method to get the value of description
	 * @return A String representing the description
	 */
	public String getDescription()
	{
		return  this.description;

	}

	/**
	 * The method to set the value to description
	 * @param description A String representing the description
	 */
	public void setDescription(String description)
	{
		 this.description=description;

		 this.keyModified.put("description", 1);

	}

	/**
	 * The method to get the value of mcStatus
	 * @return A Boolean representing the mcStatus
	 */
	public Boolean getMcStatus()
	{
		return  this.mcStatus;

	}

	/**
	 * The method to set the value to mcStatus
	 * @param mcStatus A Boolean representing the mcStatus
	 */
	public void setMcStatus(Boolean mcStatus)
	{
		 this.mcStatus=mcStatus;

		 this.keyModified.put("mc_status", 1);

	}

	/**
	 * The method to get the value of gappsEnabled
	 * @return A Boolean representing the gappsEnabled
	 */
	public Boolean getGappsEnabled()
	{
		return  this.gappsEnabled;

	}

	/**
	 * The method to set the value to gappsEnabled
	 * @param gappsEnabled A Boolean representing the gappsEnabled
	 */
	public void setGappsEnabled(Boolean gappsEnabled)
	{
		 this.gappsEnabled=gappsEnabled;

		 this.keyModified.put("gapps_enabled", 1);

	}

	/**
	 * The method to get the value of domainName
	 * @return A String representing the domainName
	 */
	public String getDomainName()
	{
		return  this.domainName;

	}

	/**
	 * The method to set the value to domainName
	 * @param domainName A String representing the domainName
	 */
	public void setDomainName(String domainName)
	{
		 this.domainName=domainName;

		 this.keyModified.put("domain_name", 1);

	}

	/**
	 * The method to get the value of translationEnabled
	 * @return A Boolean representing the translationEnabled
	 */
	public Boolean getTranslationEnabled()
	{
		return  this.translationEnabled;

	}

	/**
	 * The method to set the value to translationEnabled
	 * @param translationEnabled A Boolean representing the translationEnabled
	 */
	public void setTranslationEnabled(Boolean translationEnabled)
	{
		 this.translationEnabled=translationEnabled;

		 this.keyModified.put("translation_enabled", 1);

	}

	/**
	 * The method to get the value of street
	 * @return A String representing the street
	 */
	public String getStreet()
	{
		return  this.street;

	}

	/**
	 * The method to set the value to street
	 * @param street A String representing the street
	 */
	public void setStreet(String street)
	{
		 this.street=street;

		 this.keyModified.put("street", 1);

	}

	/**
	 * The method to get the value of alias
	 * @return A String representing the alias
	 */
	public String getAlias()
	{
		return  this.alias;

	}

	/**
	 * The method to set the value to alias
	 * @param alias A String representing the alias
	 */
	public void setAlias(String alias)
	{
		 this.alias=alias;

		 this.keyModified.put("alias", 1);

	}

	/**
	 * The method to get the value of currency
	 * @return A String representing the currency
	 */
	public String getCurrency()
	{
		return  this.currency;

	}

	/**
	 * The method to set the value to currency
	 * @param currency A String representing the currency
	 */
	public void setCurrency(String currency)
	{
		 this.currency=currency;

		 this.keyModified.put("currency", 1);

	}

	/**
	 * The method to get the value of id
	 * @return A Long representing the id
	 */
	public Long getId()
	{
		return  this.id;

	}

	/**
	 * The method to set the value to id
	 * @param id A Long representing the id
	 */
	public void setId(Long id)
	{
		 this.id=id;

		 this.keyModified.put("id", 1);

	}

	/**
	 * The method to get the value of state
	 * @return A String representing the state
	 */
	public String getState()
	{
		return  this.state;

	}

	/**
	 * The method to set the value to state
	 * @param state A String representing the state
	 */
	public void setState(String state)
	{
		 this.state=state;

		 this.keyModified.put("state", 1);

	}

	/**
	 * The method to get the value of fax
	 * @return A String representing the fax
	 */
	public String getFax()
	{
		return  this.fax;

	}

	/**
	 * The method to set the value to fax
	 * @param fax A String representing the fax
	 */
	public void setFax(String fax)
	{
		 this.fax=fax;

		 this.keyModified.put("fax", 1);

	}

	/**
	 * The method to get the value of employeeCount
	 * @return A String representing the employeeCount
	 */
	public String getEmployeeCount()
	{
		return  this.employeeCount;

	}

	/**
	 * The method to set the value to employeeCount
	 * @param employeeCount A String representing the employeeCount
	 */
	public void setEmployeeCount(String employeeCount)
	{
		 this.employeeCount=employeeCount;

		 this.keyModified.put("employee_count", 1);

	}

	/**
	 * The method to get the value of zip
	 * @return A String representing the zip
	 */
	public String getZip()
	{
		return  this.zip;

	}

	/**
	 * The method to set the value to zip
	 * @param zip A String representing the zip
	 */
	public void setZip(String zip)
	{
		 this.zip=zip;

		 this.keyModified.put("zip", 1);

	}

	/**
	 * The method to get the value of website
	 * @return A String representing the website
	 */
	public String getWebsite()
	{
		return  this.website;

	}

	/**
	 * The method to set the value to website
	 * @param website A String representing the website
	 */
	public void setWebsite(String website)
	{
		 this.website=website;

		 this.keyModified.put("website", 1);

	}

	/**
	 * The method to get the value of currencySymbol
	 * @return A String representing the currencySymbol
	 */
	public String getCurrencySymbol()
	{
		return  this.currencySymbol;

	}

	/**
	 * The method to set the value to currencySymbol
	 * @param currencySymbol A String representing the currencySymbol
	 */
	public void setCurrencySymbol(String currencySymbol)
	{
		 this.currencySymbol=currencySymbol;

		 this.keyModified.put("currency_symbol", 1);

	}

	/**
	 * The method to get the value of mobile
	 * @return A String representing the mobile
	 */
	public String getMobile()
	{
		return  this.mobile;

	}

	/**
	 * The method to set the value to mobile
	 * @param mobile A String representing the mobile
	 */
	public void setMobile(String mobile)
	{
		 this.mobile=mobile;

		 this.keyModified.put("mobile", 1);

	}

	/**
	 * The method to get the value of currencyLocale
	 * @return A String representing the currencyLocale
	 */
	public String getCurrencyLocale()
	{
		return  this.currencyLocale;

	}

	/**
	 * The method to set the value to currencyLocale
	 * @param currencyLocale A String representing the currencyLocale
	 */
	public void setCurrencyLocale(String currencyLocale)
	{
		 this.currencyLocale=currencyLocale;

		 this.keyModified.put("currency_locale", 1);

	}

	/**
	 * The method to get the value of primaryZuid
	 * @return A String representing the primaryZuid
	 */
	public String getPrimaryZuid()
	{
		return  this.primaryZuid;

	}

	/**
	 * The method to set the value to primaryZuid
	 * @param primaryZuid A String representing the primaryZuid
	 */
	public void setPrimaryZuid(String primaryZuid)
	{
		 this.primaryZuid=primaryZuid;

		 this.keyModified.put("primary_zuid", 1);

	}

	/**
	 * The method to get the value of ziaPortalId
	 * @return A String representing the ziaPortalId
	 */
	public String getZiaPortalId()
	{
		return  this.ziaPortalId;

	}

	/**
	 * The method to set the value to ziaPortalId
	 * @param ziaPortalId A String representing the ziaPortalId
	 */
	public void setZiaPortalId(String ziaPortalId)
	{
		 this.ziaPortalId=ziaPortalId;

		 this.keyModified.put("zia_portal_id", 1);

	}

	/**
	 * The method to get the value of timeZone
	 * @return A String representing the timeZone
	 */
	public String getTimeZone()
	{
		return  this.timeZone;

	}

	/**
	 * The method to set the value to timeZone
	 * @param timeZone A String representing the timeZone
	 */
	public void setTimeZone(String timeZone)
	{
		 this.timeZone=timeZone;

		 this.keyModified.put("time_zone", 1);

	}

	/**
	 * The method to get the value of zgid
	 * @return A String representing the zgid
	 */
	public String getZgid()
	{
		return  this.zgid;

	}

	/**
	 * The method to set the value to zgid
	 * @param zgid A String representing the zgid
	 */
	public void setZgid(String zgid)
	{
		 this.zgid=zgid;

		 this.keyModified.put("zgid", 1);

	}

	/**
	 * The method to get the value of countryCode
	 * @return A String representing the countryCode
	 */
	public String getCountryCode()
	{
		return  this.countryCode;

	}

	/**
	 * The method to set the value to countryCode
	 * @param countryCode A String representing the countryCode
	 */
	public void setCountryCode(String countryCode)
	{
		 this.countryCode=countryCode;

		 this.keyModified.put("country_code", 1);

	}

	/**
	 * The method to get the value of licenseDetails
	 * @return An instance of LicenseDetails
	 */
	public LicenseDetails getLicenseDetails()
	{
		return  this.licenseDetails;

	}

	/**
	 * The method to set the value to licenseDetails
	 * @param licenseDetails An instance of LicenseDetails
	 */
	public void setLicenseDetails(LicenseDetails licenseDetails)
	{
		 this.licenseDetails=licenseDetails;

		 this.keyModified.put("license_details", 1);

	}

	/**
	 * The method to get the value of phone
	 * @return A String representing the phone
	 */
	public String getPhone()
	{
		return  this.phone;

	}

	/**
	 * The method to set the value to phone
	 * @param phone A String representing the phone
	 */
	public void setPhone(String phone)
	{
		 this.phone=phone;

		 this.keyModified.put("phone", 1);

	}

	/**
	 * The method to get the value of companyName
	 * @return A String representing the companyName
	 */
	public String getCompanyName()
	{
		return  this.companyName;

	}

	/**
	 * The method to set the value to companyName
	 * @param companyName A String representing the companyName
	 */
	public void setCompanyName(String companyName)
	{
		 this.companyName=companyName;

		 this.keyModified.put("company_name", 1);

	}

	/**
	 * The method to get the value of privacySettings
	 * @return A Boolean representing the privacySettings
	 */
	public Boolean getPrivacySettings()
	{
		return  this.privacySettings;

	}

	/**
	 * The method to set the value to privacySettings
	 * @param privacySettings A Boolean representing the privacySettings
	 */
	public void setPrivacySettings(Boolean privacySettings)
	{
		 this.privacySettings=privacySettings;

		 this.keyModified.put("privacy_settings", 1);

	}

	/**
	 * The method to get the value of primaryEmail
	 * @return A String representing the primaryEmail
	 */
	public String getPrimaryEmail()
	{
		return  this.primaryEmail;

	}

	/**
	 * The method to set the value to primaryEmail
	 * @param primaryEmail A String representing the primaryEmail
	 */
	public void setPrimaryEmail(String primaryEmail)
	{
		 this.primaryEmail=primaryEmail;

		 this.keyModified.put("primary_email", 1);

	}

	/**
	 * The method to get the value of isoCode
	 * @return A String representing the isoCode
	 */
	public String getIsoCode()
	{
		return  this.isoCode;

	}

	/**
	 * The method to set the value to isoCode
	 * @param isoCode A String representing the isoCode
	 */
	public void setIsoCode(String isoCode)
	{
		 this.isoCode=isoCode;

		 this.keyModified.put("iso_code", 1);

	}

	/**
	 * The method to check if the user has modified the given key
	 * @param key A String representing the key
	 * @return An Integer representing the modification
	 */
	public Integer isKeyModified(String key)
	{
		if((( this.keyModified.containsKey(key))))
		{
			return  this.keyModified.get(key);

		}
		return null;

	}

	/**
	 * The method to mark the given key as modified
	 * @param key A String representing the key
	 * @param modification An Integer representing the modification
	 */
	public void setKeyModified(String key, Integer modification)
	{
		 this.keyModified.put(key, modification);

	}
}