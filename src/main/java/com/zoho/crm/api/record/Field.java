package com.zoho.crm.api.record;

import com.zoho.crm.api.layouts.Layout;
import com.zoho.crm.api.record.InventoryLineItems;
import com.zoho.crm.api.record.Participants;
import com.zoho.crm.api.record.PricingDetails;
import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.record.RecurringActivity;
import com.zoho.crm.api.record.RemindAt;
import com.zoho.crm.api.tags.Tag;
import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Choice;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

public class Field<T>
{
	private String apiName;

	/**
	 * Creates an instance of Field with the given parameters
	 * @param apiName A String representing the apiName
	 */
	public Field(String apiName)
	{
		 this.apiName=apiName;


	}

	/**
	 * The method to get the value of apiName
	 * @return A String representing the apiName
	 */
	public String getAPIName()
	{
		return  this.apiName;

	}
	public static class Products
	{
		public static final Field<Choice<String>> PRODUCT_CATEGORY=new Field<Choice<String>>("Product_Category");

		public static final Field<Double> QTY_IN_DEMAND=new Field<Double>("Qty_in_Demand");

		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<Record> VENDOR_NAME=new Field<Record>("Vendor_Name");

		public static final Field<List<Choice<String>>> TAX=new Field<List<Choice<String>>>("Tax");

		public static final Field<LocalDate> SALES_START_DATE=new Field<LocalDate>("Sales_Start_Date");

		public static final Field<Boolean> PRODUCT_ACTIVE=new Field<Boolean>("Product_Active");

		public static final Field<String> RECORD_IMAGE=new Field<String>("Record_Image");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> PRODUCT_CODE=new Field<String>("Product_Code");

		public static final Field<Choice<String>> MANUFACTURER=new Field<Choice<String>>("Manufacturer");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<LocalDate> SUPPORT_EXPIRY_DATE=new Field<LocalDate>("Support_Expiry_Date");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<Double> COMMISSION_RATE=new Field<Double>("Commission_Rate");

		public static final Field<String> PRODUCT_NAME=new Field<String>("Product_Name");

		public static final Field<User> HANDLER=new Field<User>("Handler");

		public static final Field<LocalDate> SUPPORT_START_DATE=new Field<LocalDate>("Support_Start_Date");

		public static final Field<Choice<String>> USAGE_UNIT=new Field<Choice<String>>("Usage_Unit");

		public static final Field<Double> QTY_ORDERED=new Field<Double>("Qty_Ordered");

		public static final Field<Double> QTY_IN_STOCK=new Field<Double>("Qty_in_Stock");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<LocalDate> SALES_END_DATE=new Field<LocalDate>("Sales_End_Date");

		public static final Field<Double> UNIT_PRICE=new Field<Double>("Unit_Price");

		public static final Field<Boolean> TAXABLE=new Field<Boolean>("Taxable");

		public static final Field<Double> REORDER_LEVEL=new Field<Double>("Reorder_Level");

	}

	public static class Tasks
	{
		public static final Field<Choice<String>> STATUS=new Field<Choice<String>>("Status");

		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<LocalDate> DUE_DATE=new Field<LocalDate>("Due_Date");

		public static final Field<Choice<String>> PRIORITY=new Field<Choice<String>>("Priority");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<OffsetDateTime> CLOSED_TIME=new Field<OffsetDateTime>("Closed_Time");

		public static final Field<String> SUBJECT=new Field<String>("Subject");

		public static final Field<Boolean> SEND_NOTIFICATION_EMAIL=new Field<Boolean>("Send_Notification_Email");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<RecurringActivity> RECURRING_ACTIVITY=new Field<RecurringActivity>("Recurring_Activity");

		public static final Field<Record> WHAT_ID=new Field<Record>("What_Id");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<RemindAt> REMIND_AT=new Field<RemindAt>("Remind_At");

		public static final Field<Record> WHO_ID=new Field<Record>("Who_Id");

	}

	public static class Vendors
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> EMAIL=new Field<String>("Email");

		public static final Field<String> CATEGORY=new Field<String>("Category");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<String> VENDOR_NAME=new Field<String>("Vendor_Name");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> WEBSITE=new Field<String>("Website");

		public static final Field<String> CITY=new Field<String>("City");

		public static final Field<String> RECORD_IMAGE=new Field<String>("Record_Image");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> PHONE=new Field<String>("Phone");

		public static final Field<String> STATE=new Field<String>("State");

		public static final Field<Choice<String>> GL_ACCOUNT=new Field<Choice<String>>("GL_Account");

		public static final Field<String> STREET=new Field<String>("Street");

		public static final Field<String> COUNTRY=new Field<String>("Country");

		public static final Field<String> ZIP_CODE=new Field<String>("Zip_Code");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

	}

	public static class Calls
	{
		public static final Field<String> CALL_DURATION=new Field<String>("Call_Duration");

		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<Choice<String>> REMINDER=new Field<Choice<String>>("Reminder");

		public static final Field<String> CALLER_ID=new Field<String>("Caller_ID");

		public static final Field<Boolean> CTI_ENTRY=new Field<Boolean>("CTI_Entry");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<OffsetDateTime> CALL_START_TIME=new Field<OffsetDateTime>("Call_Start_Time");

		public static final Field<String> SUBJECT=new Field<String>("Subject");

		public static final Field<String> CALL_AGENDA=new Field<String>("Call_Agenda");

		public static final Field<String> CALL_RESULT=new Field<String>("Call_Result");

		public static final Field<Choice<String>> CALL_TYPE=new Field<Choice<String>>("Call_Type");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<Record> WHAT_ID=new Field<Record>("What_Id");

		public static final Field<Integer> CALL_DURATION_IN_SECONDS=new Field<Integer>("Call_Duration_in_seconds");

		public static final Field<Choice<String>> CALL_PURPOSE=new Field<Choice<String>>("Call_Purpose");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<String> DIALLED_NUMBER=new Field<String>("Dialled_Number");

		public static final Field<Choice<String>> CALL_STATUS=new Field<Choice<String>>("Call_Status");

		public static final Field<Record> WHO_ID=new Field<Record>("Who_Id");

	}

	public static class Leads
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<String> COMPANY=new Field<String>("Company");

		public static final Field<String> EMAIL=new Field<String>("Email");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<Choice<String>> RATING=new Field<Choice<String>>("Rating");

		public static final Field<String> WEBSITE=new Field<String>("Website");

		public static final Field<String> TWITTER=new Field<String>("Twitter");

		public static final Field<Choice<String>> SALUTATION=new Field<Choice<String>>("Salutation");

		public static final Field<OffsetDateTime> LAST_ACTIVITY_TIME=new Field<OffsetDateTime>("Last_Activity_Time");

		public static final Field<String> FIRST_NAME=new Field<String>("First_Name");

		public static final Field<String> FULL_NAME=new Field<String>("Full_Name");

		public static final Field<Choice<String>> LEAD_STATUS=new Field<Choice<String>>("Lead_Status");

		public static final Field<Choice<String>> INDUSTRY=new Field<Choice<String>>("Industry");

		public static final Field<String> RECORD_IMAGE=new Field<String>("Record_Image");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> SKYPE_ID=new Field<String>("Skype_ID");

		public static final Field<String> PHONE=new Field<String>("Phone");

		public static final Field<String> STREET=new Field<String>("Street");

		public static final Field<String> ZIP_CODE=new Field<String>("Zip_Code");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Boolean> EMAIL_OPT_OUT=new Field<Boolean>("Email_Opt_Out");

		public static final Field<String> DESIGNATION=new Field<String>("Designation");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> CITY=new Field<String>("City");

		public static final Field<Integer> NO_OF_EMPLOYEES=new Field<Integer>("No_of_Employees");

		public static final Field<String> MOBILE=new Field<String>("Mobile");

		public static final Field<OffsetDateTime> CONVERTED_DATE_TIME=new Field<OffsetDateTime>("Converted_Date_Time");

		public static final Field<String> LAST_NAME=new Field<String>("Last_Name");

		public static final Field<Layout> LAYOUT=new Field<Layout>("Layout");

		public static final Field<String> STATE=new Field<String>("State");

		public static final Field<Choice<String>> LEAD_SOURCE=new Field<Choice<String>>("Lead_Source");

		public static final Field<Boolean> IS_RECORD_DUPLICATE=new Field<Boolean>("Is_Record_Duplicate");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<String> FAX=new Field<String>("Fax");

		public static final Field<Double> ANNUAL_REVENUE=new Field<Double>("Annual_Revenue");

		public static final Field<String> SECONDARY_EMAIL=new Field<String>("Secondary_Email");

	}

	public static class Deals
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<Record> CAMPAIGN_SOURCE=new Field<Record>("Campaign_Source");

		public static final Field<LocalDate> CLOSING_DATE=new Field<LocalDate>("Closing_Date");

		public static final Field<OffsetDateTime> LAST_ACTIVITY_TIME=new Field<OffsetDateTime>("Last_Activity_Time");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<Integer> LEAD_CONVERSION_TIME=new Field<Integer>("Lead_Conversion_Time");

		public static final Field<String> DEAL_NAME=new Field<String>("Deal_Name");

		public static final Field<Double> EXPECTED_REVENUE=new Field<Double>("Expected_Revenue");

		public static final Field<Integer> OVERALL_SALES_DURATION=new Field<Integer>("Overall_Sales_Duration");

		public static final Field<Choice<String>> STAGE=new Field<Choice<String>>("Stage");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> TERRITORY=new Field<String>("Territory");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<Double> AMOUNT=new Field<Double>("Amount");

		public static final Field<Integer> PROBABILITY=new Field<Integer>("Probability");

		public static final Field<String> NEXT_STEP=new Field<String>("Next_Step");

		public static final Field<Record> CONTACT_NAME=new Field<Record>("Contact_Name");

		public static final Field<Integer> SALES_CYCLE_DURATION=new Field<Integer>("Sales_Cycle_Duration");

		public static final Field<Choice<String>> TYPE=new Field<Choice<String>>("Type");

		public static final Field<Choice<String>> DEAL_CATEGORY_STATUS=new Field<Choice<String>>("Deal_Category_Status");

		public static final Field<Choice<String>> LEAD_SOURCE=new Field<Choice<String>>("Lead_Source");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

	}

	public static class Campaigns
	{
		public static final Field<Choice<String>> STATUS=new Field<Choice<String>>("Status");

		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<String> CAMPAIGN_NAME=new Field<String>("Campaign_Name");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<LocalDate> END_DATE=new Field<LocalDate>("End_Date");

		public static final Field<Choice<String>> TYPE=new Field<Choice<String>>("Type");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<Long> NUM_SENT=new Field<Long>("Num_sent");

		public static final Field<Double> EXPECTED_REVENUE=new Field<Double>("Expected_Revenue");

		public static final Field<Double> ACTUAL_COST=new Field<Double>("Actual_Cost");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Long> EXPECTED_RESPONSE=new Field<Long>("Expected_Response");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<Record> PARENT_CAMPAIGN=new Field<Record>("Parent_Campaign");

		public static final Field<LocalDate> START_DATE=new Field<LocalDate>("Start_Date");

		public static final Field<Double> BUDGETED_COST=new Field<Double>("Budgeted_Cost");

	}

	public static class Quotes
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<Double> DISCOUNT=new Field<Double>("Discount");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<String> SHIPPING_STATE=new Field<String>("Shipping_State");

		public static final Field<Double> TAX=new Field<Double>("Tax");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<Record> DEAL_NAME=new Field<Record>("Deal_Name");

		public static final Field<LocalDate> VALID_TILL=new Field<LocalDate>("Valid_Till");

		public static final Field<String> BILLING_COUNTRY=new Field<String>("Billing_Country");

		public static final Field<Record> ACCOUNT_NAME=new Field<Record>("Account_Name");

		public static final Field<String> TEAM=new Field<String>("Team");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Choice<String>> CARRIER=new Field<Choice<String>>("Carrier");

		public static final Field<Choice<String>> QUOTE_STAGE=new Field<Choice<String>>("Quote_Stage");

		public static final Field<Double> GRAND_TOTAL=new Field<Double>("Grand_Total");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> BILLING_STREET=new Field<String>("Billing_Street");

		public static final Field<Double> ADJUSTMENT=new Field<Double>("Adjustment");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> TERMS_AND_CONDITIONS=new Field<String>("Terms_and_Conditions");

		public static final Field<Double> SUB_TOTAL=new Field<Double>("Sub_Total");

		public static final Field<String> BILLING_CODE=new Field<String>("Billing_Code");

		public static final Field<List<InventoryLineItems>> PRODUCT_DETAILS=new Field<List<InventoryLineItems>>("Product_Details");

		public static final Field<String> SUBJECT=new Field<String>("Subject");

		public static final Field<Record> CONTACT_NAME=new Field<Record>("Contact_Name");

		public static final Field<String> SHIPPING_CITY=new Field<String>("Shipping_City");

		public static final Field<String> SHIPPING_COUNTRY=new Field<String>("Shipping_Country");

		public static final Field<String> SHIPPING_CODE=new Field<String>("Shipping_Code");

		public static final Field<String> BILLING_CITY=new Field<String>("Billing_City");

		public static final Field<Long> QUOTE_NUMBER=new Field<Long>("Quote_Number");

		public static final Field<String> BILLING_STATE=new Field<String>("Billing_State");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<String> SHIPPING_STREET=new Field<String>("Shipping_Street");

	}

	public static class Invoices
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<Double> DISCOUNT=new Field<Double>("Discount");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<String> SHIPPING_STATE=new Field<String>("Shipping_State");

		public static final Field<Double> TAX=new Field<Double>("Tax");

		public static final Field<LocalDate> INVOICE_DATE=new Field<LocalDate>("Invoice_Date");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> BILLING_COUNTRY=new Field<String>("Billing_Country");

		public static final Field<Record> ACCOUNT_NAME=new Field<Record>("Account_Name");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Record> SALES_ORDER=new Field<Record>("Sales_Order");

		public static final Field<Choice<String>> STATUS=new Field<Choice<String>>("Status");

		public static final Field<Double> GRAND_TOTAL=new Field<Double>("Grand_Total");

		public static final Field<Double> SALES_COMMISSION=new Field<Double>("Sales_Commission");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<LocalDate> DUE_DATE=new Field<LocalDate>("Due_Date");

		public static final Field<String> BILLING_STREET=new Field<String>("Billing_Street");

		public static final Field<Double> ADJUSTMENT=new Field<Double>("Adjustment");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> TERMS_AND_CONDITIONS=new Field<String>("Terms_and_Conditions");

		public static final Field<Double> SUB_TOTAL=new Field<Double>("Sub_Total");

		public static final Field<Long> INVOICE_NUMBER=new Field<Long>("Invoice_Number");

		public static final Field<String> BILLING_CODE=new Field<String>("Billing_Code");

		public static final Field<List<InventoryLineItems>> PRODUCT_DETAILS=new Field<List<InventoryLineItems>>("Product_Details");

		public static final Field<String> SUBJECT=new Field<String>("Subject");

		public static final Field<Record> CONTACT_NAME=new Field<Record>("Contact_Name");

		public static final Field<Double> EXCISE_DUTY=new Field<Double>("Excise_Duty");

		public static final Field<String> SHIPPING_CITY=new Field<String>("Shipping_City");

		public static final Field<String> SHIPPING_COUNTRY=new Field<String>("Shipping_Country");

		public static final Field<String> SHIPPING_CODE=new Field<String>("Shipping_Code");

		public static final Field<String> BILLING_CITY=new Field<String>("Billing_City");

		public static final Field<String> PURCHASE_ORDER=new Field<String>("Purchase_Order");

		public static final Field<String> BILLING_STATE=new Field<String>("Billing_State");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<String> SHIPPING_STREET=new Field<String>("Shipping_Street");

	}

	public static class Attachments
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> FILE_NAME=new Field<String>("File_Name");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> SIZE=new Field<String>("Size");

		public static final Field<Record> PARENT_ID=new Field<Record>("Parent_Id");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

	}

	public static class Price_Books
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<Boolean> ACTIVE=new Field<Boolean>("Active");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<List<PricingDetails>> PRICING_DETAILS=new Field<List<PricingDetails>>("Pricing_Details");

		public static final Field<Choice<String>> PRICING_MODEL=new Field<Choice<String>>("Pricing_Model");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> PRICE_BOOK_NAME=new Field<String>("Price_Book_Name");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

	}

	public static class Sales_Orders
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<Double> DISCOUNT=new Field<Double>("Discount");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<String> CUSTOMER_NO=new Field<String>("Customer_No");

		public static final Field<String> SHIPPING_STATE=new Field<String>("Shipping_State");

		public static final Field<Double> TAX=new Field<Double>("Tax");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<Record> DEAL_NAME=new Field<Record>("Deal_Name");

		public static final Field<String> BILLING_COUNTRY=new Field<String>("Billing_Country");

		public static final Field<Record> ACCOUNT_NAME=new Field<Record>("Account_Name");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Choice<String>> CARRIER=new Field<Choice<String>>("Carrier");

		public static final Field<Record> QUOTE_NAME=new Field<Record>("Quote_Name");

		public static final Field<Choice<String>> STATUS=new Field<Choice<String>>("Status");

		public static final Field<Double> SALES_COMMISSION=new Field<Double>("Sales_Commission");

		public static final Field<Double> GRAND_TOTAL=new Field<Double>("Grand_Total");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<LocalDate> DUE_DATE=new Field<LocalDate>("Due_Date");

		public static final Field<String> BILLING_STREET=new Field<String>("Billing_Street");

		public static final Field<Double> ADJUSTMENT=new Field<Double>("Adjustment");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> TERMS_AND_CONDITIONS=new Field<String>("Terms_and_Conditions");

		public static final Field<Double> SUB_TOTAL=new Field<Double>("Sub_Total");

		public static final Field<String> BILLING_CODE=new Field<String>("Billing_Code");

		public static final Field<List<InventoryLineItems>> PRODUCT_DETAILS=new Field<List<InventoryLineItems>>("Product_Details");

		public static final Field<String> SUBJECT=new Field<String>("Subject");

		public static final Field<Record> CONTACT_NAME=new Field<Record>("Contact_Name");

		public static final Field<Double> EXCISE_DUTY=new Field<Double>("Excise_Duty");

		public static final Field<String> SHIPPING_CITY=new Field<String>("Shipping_City");

		public static final Field<String> SHIPPING_COUNTRY=new Field<String>("Shipping_Country");

		public static final Field<String> SHIPPING_CODE=new Field<String>("Shipping_Code");

		public static final Field<String> BILLING_CITY=new Field<String>("Billing_City");

		public static final Field<Long> SO_NUMBER=new Field<Long>("SO_Number");

		public static final Field<String> PURCHASE_ORDER=new Field<String>("Purchase_Order");

		public static final Field<String> BILLING_STATE=new Field<String>("Billing_State");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<String> PENDING=new Field<String>("Pending");

		public static final Field<String> SHIPPING_STREET=new Field<String>("Shipping_Street");

	}

	public static class Contacts
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<String> EMAIL=new Field<String>("Email");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<Record> VENDOR_NAME=new Field<Record>("Vendor_Name");

		public static final Field<String> MAILING_ZIP=new Field<String>("Mailing_Zip");

		public static final Field<String> REPORTS_TO=new Field<String>("Reports_To");

		public static final Field<String> OTHER_PHONE=new Field<String>("Other_Phone");

		public static final Field<String> MAILING_STATE=new Field<String>("Mailing_State");

		public static final Field<String> TWITTER=new Field<String>("Twitter");

		public static final Field<String> OTHER_ZIP=new Field<String>("Other_Zip");

		public static final Field<String> MAILING_STREET=new Field<String>("Mailing_Street");

		public static final Field<String> OTHER_STATE=new Field<String>("Other_State");

		public static final Field<Choice<String>> SALUTATION=new Field<Choice<String>>("Salutation");

		public static final Field<String> OTHER_COUNTRY=new Field<String>("Other_Country");

		public static final Field<OffsetDateTime> LAST_ACTIVITY_TIME=new Field<OffsetDateTime>("Last_Activity_Time");

		public static final Field<String> FIRST_NAME=new Field<String>("First_Name");

		public static final Field<String> FULL_NAME=new Field<String>("Full_Name");

		public static final Field<String> ASST_PHONE=new Field<String>("Asst_Phone");

		public static final Field<String> RECORD_IMAGE=new Field<String>("Record_Image");

		public static final Field<String> DEPARTMENT=new Field<String>("Department");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> SKYPE_ID=new Field<String>("Skype_ID");

		public static final Field<String> ASSISTANT=new Field<String>("Assistant");

		public static final Field<String> PHONE=new Field<String>("Phone");

		public static final Field<String> MAILING_COUNTRY=new Field<String>("Mailing_Country");

		public static final Field<Record> ACCOUNT_NAME=new Field<Record>("Account_Name");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Boolean> EMAIL_OPT_OUT=new Field<Boolean>("Email_Opt_Out");

		public static final Field<Record> REPORTING_TO=new Field<Record>("Reporting_To");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<LocalDate> DATE_OF_BIRTH=new Field<LocalDate>("Date_of_Birth");

		public static final Field<String> MAILING_CITY=new Field<String>("Mailing_City");

		public static final Field<String> OTHER_CITY=new Field<String>("Other_City");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> TITLE=new Field<String>("Title");

		public static final Field<String> OTHER_STREET=new Field<String>("Other_Street");

		public static final Field<String> MOBILE=new Field<String>("Mobile");

		public static final Field<String> TERRITORIES=new Field<String>("Territories");

		public static final Field<String> HOME_PHONE=new Field<String>("Home_Phone");

		public static final Field<String> LAST_NAME=new Field<String>("Last_Name");

		public static final Field<Choice<String>> LEAD_SOURCE=new Field<Choice<String>>("Lead_Source");

		public static final Field<Boolean> IS_RECORD_DUPLICATE=new Field<Boolean>("Is_Record_Duplicate");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<String> FAX=new Field<String>("Fax");

		public static final Field<String> SECONDARY_EMAIL=new Field<String>("Secondary_Email");

	}

	public static class Solutions
	{
		public static final Field<Choice<String>> STATUS=new Field<Choice<String>>("Status");

		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> COMMENTS=new Field<String>("Comments");

		public static final Field<Integer> NO_OF_COMMENTS=new Field<Integer>("No_of_comments");

		public static final Field<Record> PRODUCT_NAME=new Field<Record>("Product_Name");

		public static final Field<String> ADD_COMMENT=new Field<String>("Add_Comment");

		public static final Field<Long> SOLUTION_NUMBER=new Field<Long>("Solution_Number");

		public static final Field<String> ANSWER=new Field<String>("Answer");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> SOLUTION_TITLE=new Field<String>("Solution_Title");

		public static final Field<Boolean> PUBLISHED=new Field<Boolean>("Published");

		public static final Field<String> QUESTION=new Field<String>("Question");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

	}

	public static class Events
	{
		public static final Field<Boolean> ALL_DAY=new Field<Boolean>("All_day");

		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<String> CHECK_IN_STATE=new Field<String>("Check_In_State");

		public static final Field<String> CHECK_IN_ADDRESS=new Field<String>("Check_In_Address");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<OffsetDateTime> START_DATETIME=new Field<OffsetDateTime>("Start_DateTime");

		public static final Field<Double> LATITUDE=new Field<Double>("Latitude");

		public static final Field<List<Participants>> PARTICIPANTS=new Field<List<Participants>>("Participants");

		public static final Field<String> EVENT_TITLE=new Field<String>("Event_Title");

		public static final Field<OffsetDateTime> END_DATETIME=new Field<OffsetDateTime>("End_DateTime");

		public static final Field<User> CHECK_IN_BY=new Field<User>("Check_In_By");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> CHECK_IN_CITY=new Field<String>("Check_In_City");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<String> CHECK_IN_COMMENT=new Field<String>("Check_In_Comment");

		public static final Field<OffsetDateTime> REMIND_AT=new Field<OffsetDateTime>("Remind_At");

		public static final Field<Record> WHO_ID=new Field<Record>("Who_Id");

		public static final Field<String> CHECK_IN_STATUS=new Field<String>("Check_In_Status");

		public static final Field<String> CHECK_IN_COUNTRY=new Field<String>("Check_In_Country");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> VENUE=new Field<String>("Venue");

		public static final Field<String> ZIP_CODE=new Field<String>("ZIP_Code");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<Double> LONGITUDE=new Field<Double>("Longitude");

		public static final Field<OffsetDateTime> CHECK_IN_TIME=new Field<OffsetDateTime>("Check_In_Time");

		public static final Field<RecurringActivity> RECURRING_ACTIVITY=new Field<RecurringActivity>("Recurring_Activity");

		public static final Field<Record> WHAT_ID=new Field<Record>("What_Id");

		public static final Field<String> CHECK_IN_SUB_LOCALITY=new Field<String>("Check_In_Sub_Locality");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

	}

	public static class Purchase_Orders
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<Double> DISCOUNT=new Field<Double>("Discount");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<Record> VENDOR_NAME=new Field<Record>("Vendor_Name");

		public static final Field<String> SHIPPING_STATE=new Field<String>("Shipping_State");

		public static final Field<Double> TAX=new Field<Double>("Tax");

		public static final Field<LocalDate> PO_DATE=new Field<LocalDate>("PO_Date");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> BILLING_COUNTRY=new Field<String>("Billing_Country");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Choice<String>> CARRIER=new Field<Choice<String>>("Carrier");

		public static final Field<Choice<String>> STATUS=new Field<Choice<String>>("Status");

		public static final Field<Double> GRAND_TOTAL=new Field<Double>("Grand_Total");

		public static final Field<Double> SALES_COMMISSION=new Field<Double>("Sales_Commission");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> PO_NUMBER=new Field<String>("PO_Number");

		public static final Field<LocalDate> DUE_DATE=new Field<LocalDate>("Due_Date");

		public static final Field<String> BILLING_STREET=new Field<String>("Billing_Street");

		public static final Field<Double> ADJUSTMENT=new Field<Double>("Adjustment");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> TERMS_AND_CONDITIONS=new Field<String>("Terms_and_Conditions");

		public static final Field<Double> SUB_TOTAL=new Field<Double>("Sub_Total");

		public static final Field<String> BILLING_CODE=new Field<String>("Billing_Code");

		public static final Field<List<InventoryLineItems>> PRODUCT_DETAILS=new Field<List<InventoryLineItems>>("Product_Details");

		public static final Field<String> SUBJECT=new Field<String>("Subject");

		public static final Field<String> TRACKING_NUMBER=new Field<String>("Tracking_Number");

		public static final Field<Record> CONTACT_NAME=new Field<Record>("Contact_Name");

		public static final Field<Double> EXCISE_DUTY=new Field<Double>("Excise_Duty");

		public static final Field<String> SHIPPING_CITY=new Field<String>("Shipping_City");

		public static final Field<String> SHIPPING_COUNTRY=new Field<String>("Shipping_Country");

		public static final Field<String> SHIPPING_CODE=new Field<String>("Shipping_Code");

		public static final Field<String> BILLING_CITY=new Field<String>("Billing_City");

		public static final Field<String> REQUISITION_NO=new Field<String>("Requisition_No");

		public static final Field<String> BILLING_STATE=new Field<String>("Billing_State");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<String> SHIPPING_STREET=new Field<String>("Shipping_Street");

	}

	public static class Accounts
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<Choice<String>> OWNERSHIP=new Field<Choice<String>>("Ownership");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<Choice<String>> ACCOUNT_TYPE=new Field<Choice<String>>("Account_Type");

		public static final Field<Choice<String>> RATING=new Field<Choice<String>>("Rating");

		public static final Field<Integer> SIC_CODE=new Field<Integer>("SIC_Code");

		public static final Field<String> SHIPPING_STATE=new Field<String>("Shipping_State");

		public static final Field<String> WEBSITE=new Field<String>("Website");

		public static final Field<Integer> EMPLOYEES=new Field<Integer>("Employees");

		public static final Field<OffsetDateTime> LAST_ACTIVITY_TIME=new Field<OffsetDateTime>("Last_Activity_Time");

		public static final Field<Choice<String>> INDUSTRY=new Field<Choice<String>>("Industry");

		public static final Field<String> RECORD_IMAGE=new Field<String>("Record_Image");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<String> ACCOUNT_SITE=new Field<String>("Account_Site");

		public static final Field<String> PHONE=new Field<String>("Phone");

		public static final Field<String> BILLING_COUNTRY=new Field<String>("Billing_Country");

		public static final Field<String> ACCOUNT_NAME=new Field<String>("Account_Name");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<Long> ACCOUNT_NUMBER=new Field<Long>("Account_Number");

		public static final Field<String> TICKER_SYMBOL=new Field<String>("Ticker_Symbol");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<String> BILLING_STREET=new Field<String>("Billing_Street");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> BILLING_CODE=new Field<String>("Billing_Code");

		public static final Field<String> TERRITORIES=new Field<String>("Territories");

		public static final Field<Record> PARENT_ACCOUNT=new Field<Record>("Parent_Account");

		public static final Field<String> SHIPPING_CITY=new Field<String>("Shipping_City");

		public static final Field<String> SHIPPING_COUNTRY=new Field<String>("Shipping_Country");

		public static final Field<String> SHIPPING_CODE=new Field<String>("Shipping_Code");

		public static final Field<String> BILLING_CITY=new Field<String>("Billing_City");

		public static final Field<String> BILLING_STATE=new Field<String>("Billing_State");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<String> FAX=new Field<String>("Fax");

		public static final Field<Double> ANNUAL_REVENUE=new Field<Double>("Annual_Revenue");

		public static final Field<String> SHIPPING_STREET=new Field<String>("Shipping_Street");

	}

	public static class Cases
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<String> EMAIL=new Field<String>("Email");

		public static final Field<String> DESCRIPTION=new Field<String>("Description");

		public static final Field<String> INTERNAL_COMMENTS=new Field<String>("Internal_Comments");

		public static final Field<Integer> NO_OF_COMMENTS=new Field<Integer>("No_of_comments");

		public static final Field<String> REPORTED_BY=new Field<String>("Reported_By");

		public static final Field<Long> CASE_NUMBER=new Field<Long>("Case_Number");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<Record> DEAL_NAME=new Field<Record>("Deal_Name");

		public static final Field<String> PHONE=new Field<String>("Phone");

		public static final Field<Record> ACCOUNT_NAME=new Field<Record>("Account_Name");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<String> SOLUTION=new Field<String>("Solution");

		public static final Field<Choice<String>> STATUS=new Field<Choice<String>>("Status");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<Choice<String>> PRIORITY=new Field<Choice<String>>("Priority");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<String> COMMENTS=new Field<String>("Comments");

		public static final Field<Record> PRODUCT_NAME=new Field<Record>("Product_Name");

		public static final Field<String> ADD_COMMENT=new Field<String>("Add_Comment");

		public static final Field<Choice<String>> CASE_ORIGIN=new Field<Choice<String>>("Case_Origin");

		public static final Field<String> SUBJECT=new Field<String>("Subject");

		public static final Field<Choice<String>> CASE_REASON=new Field<Choice<String>>("Case_Reason");

		public static final Field<Choice<String>> TYPE=new Field<Choice<String>>("Type");

		public static final Field<Boolean> IS_RECORD_DUPLICATE=new Field<Boolean>("Is_Record_Duplicate");

		public static final Field<List<Tag>> TAG=new Field<List<Tag>>("Tag");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<Record> RELATED_TO=new Field<Record>("Related_To");

	}

	public static class Notes
	{
		public static final Field<User> OWNER=new Field<User>("Owner");

		public static final Field<User> MODIFIED_BY=new Field<User>("Modified_By");

		public static final Field<OffsetDateTime> MODIFIED_TIME=new Field<OffsetDateTime>("Modified_Time");

		public static final Field<OffsetDateTime> CREATED_TIME=new Field<OffsetDateTime>("Created_Time");

		public static final Field<Record> PARENT_ID=new Field<Record>("Parent_Id");

		public static final Field<Long> ID=new Field<Long>("id");

		public static final Field<User> CREATED_BY=new Field<User>("Created_By");

		public static final Field<String> NOTE_TITLE=new Field<String>("Note_Title");

		public static final Field<String> NOTE_CONTENT=new Field<String>("Note_Content");

	}
}