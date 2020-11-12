package com.zoho.crm.api.users;

import com.zoho.crm.api.profiles.Profile;
import com.zoho.crm.api.roles.Role;
import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.util.Model;
import java.util.List;

public class User extends Record implements Model
{

	/**
	 * The method to get the value of country
	 * @return A String representing the country
	 */
	public String getCountry()
	{
		return (String) this.getKeyValue("country");

	}

	/**
	 * The method to set the value to country
	 * @param country A String representing the country
	 */
	public void setCountry(String country)
	{
		 this.addKeyValue("country", country);

	}

	/**
	 * The method to get the value of customizeInfo
	 * @return An instance of CustomizeInfo
	 */
	public CustomizeInfo getCustomizeInfo()
	{
		return (CustomizeInfo) this.getKeyValue("customize_info");

	}

	/**
	 * The method to set the value to customizeInfo
	 * @param customizeInfo An instance of CustomizeInfo
	 */
	public void setCustomizeInfo(CustomizeInfo customizeInfo)
	{
		 this.addKeyValue("customize_info", customizeInfo);

	}

	/**
	 * The method to get the value of role
	 * @return An instance of Role
	 */
	public Role getRole()
	{
		return (Role) this.getKeyValue("role");

	}

	/**
	 * The method to set the value to role
	 * @param role An instance of Role
	 */
	public void setRole(Role role)
	{
		 this.addKeyValue("role", role);

	}

	/**
	 * The method to get the value of signature
	 * @return A String representing the signature
	 */
	public String getSignature()
	{
		return (String) this.getKeyValue("signature");

	}

	/**
	 * The method to set the value to signature
	 * @param signature A String representing the signature
	 */
	public void setSignature(String signature)
	{
		 this.addKeyValue("signature", signature);

	}

	/**
	 * The method to get the value of city
	 * @return A String representing the city
	 */
	public String getCity()
	{
		return (String) this.getKeyValue("city");

	}

	/**
	 * The method to set the value to city
	 * @param city A String representing the city
	 */
	public void setCity(String city)
	{
		 this.addKeyValue("city", city);

	}

	/**
	 * The method to get the value of nameFormat
	 * @return A String representing the nameFormat
	 */
	public String getNameFormat()
	{
		return (String) this.getKeyValue("name_format");

	}

	/**
	 * The method to set the value to nameFormat
	 * @param nameFormat A String representing the nameFormat
	 */
	public void setNameFormat(String nameFormat)
	{
		 this.addKeyValue("name_format", nameFormat);

	}

	/**
	 * The method to get the value of personalAccount
	 * @return A Boolean representing the personalAccount
	 */
	public Boolean getPersonalAccount()
	{
		return (Boolean) this.getKeyValue("personal_account");

	}

	/**
	 * The method to set the value to personalAccount
	 * @param personalAccount A Boolean representing the personalAccount
	 */
	public void setPersonalAccount(Boolean personalAccount)
	{
		 this.addKeyValue("personal_account", personalAccount);

	}

	/**
	 * The method to get the value of defaultTabGroup
	 * @return A String representing the defaultTabGroup
	 */
	public String getDefaultTabGroup()
	{
		return (String) this.getKeyValue("default_tab_group");

	}

	/**
	 * The method to set the value to defaultTabGroup
	 * @param defaultTabGroup A String representing the defaultTabGroup
	 */
	public void setDefaultTabGroup(String defaultTabGroup)
	{
		 this.addKeyValue("default_tab_group", defaultTabGroup);

	}

	/**
	 * The method to get the value of language
	 * @return A String representing the language
	 */
	public String getLanguage()
	{
		return (String) this.getKeyValue("language");

	}

	/**
	 * The method to set the value to language
	 * @param language A String representing the language
	 */
	public void setLanguage(String language)
	{
		 this.addKeyValue("language", language);

	}

	/**
	 * The method to get the value of locale
	 * @return A String representing the locale
	 */
	public String getLocale()
	{
		return (String) this.getKeyValue("locale");

	}

	/**
	 * The method to set the value to locale
	 * @param locale A String representing the locale
	 */
	public void setLocale(String locale)
	{
		 this.addKeyValue("locale", locale);

	}

	/**
	 * The method to get the value of microsoft
	 * @return A Boolean representing the microsoft
	 */
	public Boolean getMicrosoft()
	{
		return (Boolean) this.getKeyValue("microsoft");

	}

	/**
	 * The method to set the value to microsoft
	 * @param microsoft A Boolean representing the microsoft
	 */
	public void setMicrosoft(Boolean microsoft)
	{
		 this.addKeyValue("microsoft", microsoft);

	}

	/**
	 * The method to get the value of isonline
	 * @return A Boolean representing the isonline
	 */
	public Boolean getIsonline()
	{
		return (Boolean) this.getKeyValue("Isonline");

	}

	/**
	 * The method to set the value to isonline
	 * @param isonline A Boolean representing the isonline
	 */
	public void setIsonline(Boolean isonline)
	{
		 this.addKeyValue("Isonline", isonline);

	}

	/**
	 * The method to get the value of street
	 * @return A String representing the street
	 */
	public String getStreet()
	{
		return (String) this.getKeyValue("street");

	}

	/**
	 * The method to set the value to street
	 * @param street A String representing the street
	 */
	public void setStreet(String street)
	{
		 this.addKeyValue("street", street);

	}

	/**
	 * The method to get the value of currency
	 * @return A String representing the currency
	 */
	public String getCurrency()
	{
		return (String) this.getKeyValue("Currency");

	}

	/**
	 * The method to set the value to currency
	 * @param currency A String representing the currency
	 */
	public void setCurrency(String currency)
	{
		 this.addKeyValue("Currency", currency);

	}

	/**
	 * The method to get the value of alias
	 * @return A String representing the alias
	 */
	public String getAlias()
	{
		return (String) this.getKeyValue("alias");

	}

	/**
	 * The method to set the value to alias
	 * @param alias A String representing the alias
	 */
	public void setAlias(String alias)
	{
		 this.addKeyValue("alias", alias);

	}

	/**
	 * The method to get the value of theme
	 * @return An instance of Theme
	 */
	public Theme getTheme()
	{
		return (Theme) this.getKeyValue("theme");

	}

	/**
	 * The method to set the value to theme
	 * @param theme An instance of Theme
	 */
	public void setTheme(Theme theme)
	{
		 this.addKeyValue("theme", theme);

	}

	/**
	 * The method to get the value of state
	 * @return A String representing the state
	 */
	public String getState()
	{
		return (String) this.getKeyValue("state");

	}

	/**
	 * The method to set the value to state
	 * @param state A String representing the state
	 */
	public void setState(String state)
	{
		 this.addKeyValue("state", state);

	}

	/**
	 * The method to get the value of fax
	 * @return A String representing the fax
	 */
	public String getFax()
	{
		return (String) this.getKeyValue("fax");

	}

	/**
	 * The method to set the value to fax
	 * @param fax A String representing the fax
	 */
	public void setFax(String fax)
	{
		 this.addKeyValue("fax", fax);

	}

	/**
	 * The method to get the value of countryLocale
	 * @return A String representing the countryLocale
	 */
	public String getCountryLocale()
	{
		return (String) this.getKeyValue("country_locale");

	}

	/**
	 * The method to set the value to countryLocale
	 * @param countryLocale A String representing the countryLocale
	 */
	public void setCountryLocale(String countryLocale)
	{
		 this.addKeyValue("country_locale", countryLocale);

	}

	/**
	 * The method to get the value of firstName
	 * @return A String representing the firstName
	 */
	public String getFirstName()
	{
		return (String) this.getKeyValue("first_name");

	}

	/**
	 * The method to set the value to firstName
	 * @param firstName A String representing the firstName
	 */
	public void setFirstName(String firstName)
	{
		 this.addKeyValue("first_name", firstName);

	}

	/**
	 * The method to get the value of email
	 * @return A String representing the email
	 */
	public String getEmail()
	{
		return (String) this.getKeyValue("email");

	}

	/**
	 * The method to set the value to email
	 * @param email A String representing the email
	 */
	public void setEmail(String email)
	{
		 this.addKeyValue("email", email);

	}

	/**
	 * The method to get the value of reportingTo
	 * @return An instance of User
	 */
	public User getReportingTo()
	{
		return (User) this.getKeyValue("Reporting_To");

	}

	/**
	 * The method to set the value to reportingTo
	 * @param reportingTo An instance of User
	 */
	public void setReportingTo(User reportingTo)
	{
		 this.addKeyValue("Reporting_To", reportingTo);

	}

	/**
	 * The method to get the value of decimalSeparator
	 * @return A String representing the decimalSeparator
	 */
	public String getDecimalSeparator()
	{
		return (String) this.getKeyValue("decimal_separator");

	}

	/**
	 * The method to set the value to decimalSeparator
	 * @param decimalSeparator A String representing the decimalSeparator
	 */
	public void setDecimalSeparator(String decimalSeparator)
	{
		 this.addKeyValue("decimal_separator", decimalSeparator);

	}

	/**
	 * The method to get the value of zip
	 * @return A String representing the zip
	 */
	public String getZip()
	{
		return (String) this.getKeyValue("zip");

	}

	/**
	 * The method to set the value to zip
	 * @param zip A String representing the zip
	 */
	public void setZip(String zip)
	{
		 this.addKeyValue("zip", zip);

	}

	/**
	 * The method to get the value of website
	 * @return A String representing the website
	 */
	public String getWebsite()
	{
		return (String) this.getKeyValue("website");

	}

	/**
	 * The method to set the value to website
	 * @param website A String representing the website
	 */
	public void setWebsite(String website)
	{
		 this.addKeyValue("website", website);

	}

	/**
	 * The method to get the value of timeFormat
	 * @return A String representing the timeFormat
	 */
	public String getTimeFormat()
	{
		return (String) this.getKeyValue("time_format");

	}

	/**
	 * The method to set the value to timeFormat
	 * @param timeFormat A String representing the timeFormat
	 */
	public void setTimeFormat(String timeFormat)
	{
		 this.addKeyValue("time_format", timeFormat);

	}

	/**
	 * The method to get the value of offset
	 * @return A Long representing the offset
	 */
	public Long getOffset()
	{
		return (Long) this.getKeyValue("offset");

	}

	/**
	 * The method to set the value to offset
	 * @param offset A Long representing the offset
	 */
	public void setOffset(Long offset)
	{
		 this.addKeyValue("offset", offset);

	}

	/**
	 * The method to get the value of profile
	 * @return An instance of Profile
	 */
	public Profile getProfile()
	{
		return (Profile) this.getKeyValue("profile");

	}

	/**
	 * The method to set the value to profile
	 * @param profile An instance of Profile
	 */
	public void setProfile(Profile profile)
	{
		 this.addKeyValue("profile", profile);

	}

	/**
	 * The method to get the value of mobile
	 * @return A String representing the mobile
	 */
	public String getMobile()
	{
		return (String) this.getKeyValue("mobile");

	}

	/**
	 * The method to set the value to mobile
	 * @param mobile A String representing the mobile
	 */
	public void setMobile(String mobile)
	{
		 this.addKeyValue("mobile", mobile);

	}

	/**
	 * The method to get the value of lastName
	 * @return A String representing the lastName
	 */
	public String getLastName()
	{
		return (String) this.getKeyValue("last_name");

	}

	/**
	 * The method to set the value to lastName
	 * @param lastName A String representing the lastName
	 */
	public void setLastName(String lastName)
	{
		 this.addKeyValue("last_name", lastName);

	}

	/**
	 * The method to get the value of timeZone
	 * @return A String representing the timeZone
	 */
	public String getTimeZone()
	{
		return (String) this.getKeyValue("time_zone");

	}

	/**
	 * The method to set the value to timeZone
	 * @param timeZone A String representing the timeZone
	 */
	public void setTimeZone(String timeZone)
	{
		 this.addKeyValue("time_zone", timeZone);

	}

	/**
	 * The method to get the value of zuid
	 * @return A String representing the zuid
	 */
	public String getZuid()
	{
		return (String) this.getKeyValue("zuid");

	}

	/**
	 * The method to set the value to zuid
	 * @param zuid A String representing the zuid
	 */
	public void setZuid(String zuid)
	{
		 this.addKeyValue("zuid", zuid);

	}

	/**
	 * The method to get the value of confirm
	 * @return A Boolean representing the confirm
	 */
	public Boolean getConfirm()
	{
		return (Boolean) this.getKeyValue("confirm");

	}

	/**
	 * The method to set the value to confirm
	 * @param confirm A Boolean representing the confirm
	 */
	public void setConfirm(Boolean confirm)
	{
		 this.addKeyValue("confirm", confirm);

	}

	/**
	 * The method to get the value of fullName
	 * @return A String representing the fullName
	 */
	public String getFullName()
	{
		return (String) this.getKeyValue("full_name");

	}

	/**
	 * The method to set the value to fullName
	 * @param fullName A String representing the fullName
	 */
	public void setFullName(String fullName)
	{
		 this.addKeyValue("full_name", fullName);

	}

	/**
	 * The method to get the value of territories
	 * @return An instance of List<Territory>
	 */
	public List<Territory> getTerritories()
	{
		return (List<Territory>) this.getKeyValue("territories");

	}

	/**
	 * The method to set the value to territories
	 * @param territories An instance of List<Territory>
	 */
	public void setTerritories(List<Territory> territories)
	{
		 this.addKeyValue("territories", territories);

	}

	/**
	 * The method to get the value of phone
	 * @return A String representing the phone
	 */
	public String getPhone()
	{
		return (String) this.getKeyValue("phone");

	}

	/**
	 * The method to set the value to phone
	 * @param phone A String representing the phone
	 */
	public void setPhone(String phone)
	{
		 this.addKeyValue("phone", phone);

	}

	/**
	 * The method to get the value of dob
	 * @return A String representing the dob
	 */
	public String getDob()
	{
		return (String) this.getKeyValue("dob");

	}

	/**
	 * The method to set the value to dob
	 * @param dob A String representing the dob
	 */
	public void setDob(String dob)
	{
		 this.addKeyValue("dob", dob);

	}

	/**
	 * The method to get the value of dateFormat
	 * @return A String representing the dateFormat
	 */
	public String getDateFormat()
	{
		return (String) this.getKeyValue("date_format");

	}

	/**
	 * The method to set the value to dateFormat
	 * @param dateFormat A String representing the dateFormat
	 */
	public void setDateFormat(String dateFormat)
	{
		 this.addKeyValue("date_format", dateFormat);

	}

	/**
	 * The method to get the value of status
	 * @return A String representing the status
	 */
	public String getStatus()
	{
		return (String) this.getKeyValue("status");

	}

	/**
	 * The method to set the value to status
	 * @param status A String representing the status
	 */
	public void setStatus(String status)
	{
		 this.addKeyValue("status", status);

	}

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return (String) this.getKeyValue("name");

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.addKeyValue("name", name);

	}
}