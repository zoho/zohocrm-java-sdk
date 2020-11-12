package com.zoho.crm.api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;

/**
 * This class uses the SDK constants name reference.
 */
public class Constants
{
	public static final HashMap<String, Level> LOGGER_LEVELS = new HashMap<>();

	static
	{
		LOGGER_LEVELS.put("ALL", Level.ALL);

		LOGGER_LEVELS.put("FINEST", Level.FINEST);

		LOGGER_LEVELS.put("TRACE", Level.FINER);

		LOGGER_LEVELS.put("DEBUG", Level.FINE);

		LOGGER_LEVELS.put("CONFIG", Level.CONFIG);

		LOGGER_LEVELS.put("INFO", Level.INFO);

		LOGGER_LEVELS.put("WARNING", Level.WARNING);

		LOGGER_LEVELS.put("ERROR", Level.SEVERE);

		LOGGER_LEVELS.put("OFF", Level.OFF);
	}
	public static final String MODULE = "module";

	public static final String ACCESS_TOKEN = "access_token";

	public static final String GRANT_TYPE = "grant_type";

	public static final String GRANT_TOKEN = "grant_token";

	public static final String EXPIRY_TIME = "expiry_time";

	public static final String GRANT_TYPE_AUTH_CODE = "authorization_code";

	public static final String EXPIRES_IN = "expires_in";

	public static final String EXPIRES_IN_SEC = "expires_in_sec";

	public static final String REFRESH_TOKEN = "refresh_token";

	public static final String CLIENT_ID = "client_id";

	public static final String CLIENT_SECRET = "client_secret";

	public static final String REDIRECT_URL = "redirect_uri";

	public static final String OAUTH_HEADER_PREFIX = "Zoho-oauthtoken ";

	public static final String AUTHORIZATION = "Authorization";

	public static final String CODE = "code";

	public static final String LOGFILE_NAME = "SDKLogs.log";

	public static final String ZOHO_SDK = "X-ZOHO-SDK";

	public static final String SDK_VERSION = "3.0.0";

	public static final String TOKEN_STORE = "TOKEN_STORE";

	public static final String FIELD_DETAILS_DIRECTORY = "resources";

	public static final String INVALID_CLIENT_ERROR = "INVALID CLIENT ERROR";

	public static final String USER_AGENT = "Mozilla/5.0";

	public static final String USER_AGENT_KEY = "user-agent";

	public static final String ERROR_KEY = "error";

	public static final String MYSQL_HOST = "localhost";
	
	public static final String MYSQL_DRIVER = "jdbc:mysql://";

	public static final String MYSQL_DATABASE_NAME = "zohooauth";

	public static final String MYSQL_USER_NAME = "root";

	public static final String MYSQL_PORT_NUMBER = "3306";

	public static final String JDBC_DRIVER_NAME = "com.mysql.jdbc.Driver";

	public static final String USER_MAIL = "user_mail";
	
	public static final String REQUEST_CATEGORY_READ = "READ";
	
	public static final String REQUEST_CATEGORY_CREATE = "CREATE";
	
	public static final String REQUEST_CATEGORY_UPDATE = "UPDATE";

	public static final String REQUEST_METHOD_POST = "POST";

	public static final String REQUEST_METHOD_PUT = "PUT";

	public static final String REQUEST_METHOD_GET = "GET";

	public static final String REQUEST_METHOD_PATCH = "PATCH";

	public static final String REQUEST_METHOD_DELETE = "DELETE";
	
	public static final String REQUEST_CATEGORY_ACTION = "ACTION";

	public static final String INTERFACE = "interface";

	public static final String CLASSES = "classes";

	public static final String READ_ONLY = "read-only";

	public static final String NAME = "name";
	
	public static final String IS_KEY_MODIFIED = "isKeyModified";

	public static final String REQUIRED = "required";
	
	public static final String REQUIRED_IN_UPDATE = "required_in_update";
	
	public static final String PRIMARY = "primary";

	public static final String SET_KEY_MODIFIED = "setKeyModified";

	public static final String TYPE = "type";

	public static final String PACKAGE_NAMESPACE = "com.zoho.crm.api";
	
	public static final String MODULE_NAMESPACE = "com.zoho.crm.api.modules.Module";

	public static final String USER_NAMESPACE = "com.zoho.crm.api.users.User";
	
	public static final String RECORD_NAMESPACE = "com.zoho.crm.api.record.Record";

	public static final String CHOICE_NAMESPACE = "com.zoho.crm.api.util.Choice";

	public static final String LIST_NAMESPACE = "java.util.List";

	public static final String MAP_NAMESPACE = "java.util.Map";

	public static final String STRING_NAMESPACE = "java.lang.String";

	public static final String BOOLEAN_NAMESPACE = "java.lang.Boolean";

	public static final String FLOAT_NAMESPACE = "java.lang.Float";

	public static final String INTEGER_NAMESPACE = "java.lang.Integer";

	public static final String LONG_NAMESPACE = "java.lang.Long";

	public static final String DOUBLE_NAMESPACE = "java.lang.Double";

	public static final String DATE_NAMESPACE = "java.time.LocalDate";

	public static final String DATETIME_NAMESPACE = "java.time.OffsetDateTime";
	
	public static final String FILE_NAMESPACE = "com.zoho.crm.api.util.StreamWrapper";

	public static final String STRUCTURE_NAME = "structure_name";

	public static final String KEY_VALUES = "keyValues";
	
	public static final String KEY_MODIFIED = "keyModified";

	public static final String KEYS = "keys";

	public static final String VALUES = "values";
	
	public static final String DELETE_MODULE_FROM_FIELDFILE_ERROR = "Exception in deleting module from Fields file : ";
	
	public static final String REFRESH_SINGLE_MODULE_FIELDS_ERROR = "Exception in refreshing fields of module : ";
	
	public static final String REFRESH_ALL_MODULE_FIELDS_ERROR = "Exception in refreshing fields of all modules : ";
	
	public static final String DELETE_FIELD_FILE_ERROR = "Exception in deleting Current User Fields file : ";
	
	public static final String DELETE_FIELD_FILES_ERROR = "Exception in deleting all Fields files : ";

	public static final String SAVE_TOKEN_ERROR = "Exception in saving tokens : ";

	public static final String GET_TOKEN_ERROR = "Exception in getting access token : ";

	public static final String GET_TOKEN_DB_ERROR = "Exception in getToken - DBStore : ";
	
	public static final String GET_TOKENS_DB_ERROR = "Exception in getTokens - DBStore : ";

	public static final String DELETE_TOKEN_DB_ERROR = "Exception in deleteToken - DBStore : ";
	
	public static final String DELETE_TOKENS_DB_ERROR = "Exception in deleteTokens - DBStore : ";

	public static final String SAVE_TOKEN_DB_ERROR = "Exception in saveToken - DBStore : ";

	public static final String GET_TOKEN_FILE_ERROR = "Exception in getToken - FileStore : ";
	
	public static final String GET_TOKENS_FILE_ERROR = "Exception in getTokens - FileStore : ";

	public static final String SAVE_TOKEN_FILE_ERROR = "Exception in saveToken - FileStore : ";

	public static final String DELETE_TOKEN_FILE_ERROR = "Exception in deleteToken - FileStore : ";
	
	public static final String DELETE_TOKENS_FILE_ERROR = "Exception in deleteTokens - FileStore : ";

	public static final String SDK_LOGGER_INITIALIZE = "Exception in Logger Initialization : ";

	public static final String FIELD = "field";

	public static final String CLASS = "class";

	public static final String INDEX = "index";

	public static final String ACCEPTED_VALUES = "accepted-values";

	public static final String UNACCEPTED_VALUES_ERROR = "UNACCEPTED VALUES ERROR";

	public static final String UNIQUE = "unique";

	public static final String FIRST_INDEX = "first-index";

	public static final String NEXT_INDEX = "next-index";

	public static final String UNIQUE_KEY_ERROR = "UNIQUE KEY ERROR";

	public static final String MIN_LENGTH = "min-length";

	public static final String MAX_LENGTH = "max-length";

	public static final String MAXIMUM_LENGTH = "maximum-length";

	public static final String MAXIMUM_LENGTH_ERROR = "MAXIMUM LENGTH ERROR";

	public static final String MINIMUM_LENGTH = "minimum-length";

	public static final String MINIMUM_LENGTH_ERROR = "MINIMUM LENGTH ERROR";

	public static final String REGEX = "regex";

	public static final String INSTANCE_NUMBER = "instance-number";

	public static final String REGEX_MISMATCH_ERROR = "REGEX MISMATCH ERROR";

	public static final String STREAM_WRAPPER_CLASS_PATH = "com.zoho.crm.api.util.StreamWrapper";

	public static final String CONTENT_DISPOSITION = "Content-Disposition";

	public static final String EXCEPTION_IS_KEY_MODIFIED = "Exception in calling isKeyModified : ";

	public static final String MANDATORY_KEY_ERROR = "Value missing or null for mandatory key(s) :";

	public static final String PRIMARY_KEY_ERROR = "Value missing or null for required key(s) : ";
	
	public static final String MANDATORY_VALUE_ERROR = "MANDATORY VALUE ERROR";

	public static final String EXCEPTION_SET_KEY_MODIFIED = "Exception in calling setKeyModified : ";

	public static final String JSON_DETAILS_ERROR = "ERROR IN READING JSONDETAILS FILE";

	public static final String INITIALIZATION_EXCEPTION = "Exception in initialization : ";
	
	public static final String INITIALIZATION_ERROR = "INITIALIZATION ERROR";
	
	public static final String REQUEST_PROXY_ERROR = "REQUESTPROXY ERROR";
	
	public static final String SWITCH_USER_ERROR = "SWITCH USER ERROR";
	
	public static final String SDK_UNINITIALIZATION_ERROR = "SDK UNINITIALIZED ERROR";
	
	public static final String SDK_UNINITIALIZATION_MESSAGE = "SDK is UnInitialized";

	public static final String EXCEPTION_JSONDETAILS = "Exception in loading JSONDetails : ";

	public static final String JSON_DETAILS_FILE_PATH = "/resources/JSONDetails.json";

	public static final String EMAIL_REGEX = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$";

	public static final String USER_SIGNATURE_ERROR = "USERSIGNATURE ERROR";
	
	public static final String USER_EMAIL_REGEX_ERROR = "UserSignature Email Regex Mismatch";

	public static final String EMAIL = "email";

	public static final String EXPECTED_TYPE = "expected-type";

	public static final String FILEBODYWRAPPER = "FileBodyWrapper";

	public static final String PARAMNAME = "ParamName";
	
	public static final String MANDATORY_NOT_FOUND = "Mandatory key Not Found";
	
	public static final String FIELD_FILE_NAMESPACE = "com.zoho.crm.api.record.FileDetails";
	
	public static final String INVENTORY_LINE_ITEMS = "com.zoho.crm.api.record.InventoryLineItems";
	
	public static final String PRICINGDETAILS = "com.zoho.crm.api.record.PricingDetails";
	
	public static final String PARTICIPANTS = "com.zoho.crm.api.record.Participants";
	
	public static final String COMMENT_NAMESPACE = "com.zoho.crm.api.record.Comment";
	
	public static final String LINE_TAX_NAMESPACE= "com.zoho.crm.api.record.LineTax";
	
	public static final ArrayList<String> INVENTORY_MODULES = new ArrayList<String>(Arrays.asList("invoices", "sales_orders","purchase_orders","quotes"));
	
	public static final String PRICE_BOOKS = "Price_Books";
	
	public static final String EVENTS = "Events";
	
	public static final String CALLS = "Calls";
	
	public static final String ACCOUNTS = "Accounts";
	
	public static final String CALL_DURATION = "Call_Duration";
	
	public static final String ACTIVITIES = "Activities";
	
	public static final String SOLUTIONS = "Solutions";
	
	public static final String CASES = "Cases";
	
	public static final String PRODUCT_DETAILS = "Product_Details";
	
	public static final String PRICING_DETAILS = "Pricing_Details";
	
	public static final String PARTICIPANT_API_NAME = "Participants";
	
	public static final String COMMENTS = "Comments";
	
	public static final String EXCEPTION = "Exception";
	
	public static final String MODULEPACKAGENAME = "modulePackageName";
	
	public static final String MODULEDETAILS = "moduleDetails";
	
	public static final String SUBFORM = "subform";
	
	public static final String LOOKUP = "lookup";
	
	public static final String CONSENT_LOOKUP = "consent_lookup";
	
	public static final String SE_MODULE = "se_module";
	
	public static final ArrayList<String> KEYS_TO_SKIP = new ArrayList<String>(Arrays.asList("Created_Time", "Modified_Time", "Created_By", "Modified_By", "Tag"));
	
	public static final ArrayList<String> SET_TO_CONTENT_TYPE = new ArrayList<String>(Arrays.asList("/crm/bulk/v2/read", "/crm/bulk/v2/write"));
	
	public static final String LINE_TAX = "$line_tax";
	
	public static final String LAYOUT = "Layout";
	
	public static final String FORMULA = "formula";
	
	public static final String LAYOUT_NAMESPACE = "com.zoho.crm.api.layouts.Layout";
	
	public static final String REMINDAT_NAMESPACE = "com.zoho.crm.api.record.RemindAt";
	
	public static final String CONSENT_NAMESPACE = "com.zoho.crm.api.record.Consent";
	
	public static final String RECURRING_ACTIVITY_NAMESPACE = "com.zoho.crm.api.record.RecurringActivity";
	
	public static final String REMINDER_NAMESPACE = "com.zoho.crm.api.record.Reminder";
	
	public static final String ATTACHMENT_ID = "attachment_id";
	
	public static final String FILE_ID = "file_id";
	
	public static final String FIELDS_LAST_MODIFIED_TIME = "FIELDS-LAST-MODIFIED-TIME";
	
	public static final String HTTP = "http";
	
	public static final String CONTENT_API_URL = "content.zohoapis.com";
	
	public static final String INVALID_URL_ERROR = "Invalid URL Error";
	
	public static final String SET_API_URL_EXCEPTION = "Exception in setting API URL : ";
	
	public static final String AUTHENTICATION_EXCEPTION = "Exception in authenticating current request : ";
	
	public static final String FORM_REQUEST_EXCEPTION = "Exception in forming request body : ";
	
	public static final String API_CALL_EXCEPTION = "Exception in current API call execution : ";
	
	public static final String URL = "URL";
	
	public static final String HEADERS = "HEADERS";
	
	public static final String PARAMS = "PARAMS";
	
	public static final String CANT_DISCLOSE = " ## can't disclose ## ";
	
	public static final String INITIALIZATION_SUCCESSFUL = "Initialization successful ";
	
	public static final String INITIALIZATION_SWITCHED = "Initialization switched ";
	
	public static final String IN_ENVIRONMENT = " in Environment : ";
	
	public static final String FOR_EMAIL_ID = "for Email Id : ";
	
	public static final String REFRESH_TOKEN_MESSAGE = "Access Token has expired. Hence refreshing.";
	
	public static final String RESOURCE_PATH_ERROR_MESSAGE = "Resource Path MUST NOT be null/empty.";
	
	public static final String USERSIGNATURE_ERROR_MESSAGE = "UserSignature MUST NOT be null.";
	
	public static final String HOST_ERROR_MESSAGE = "Host MUST NOT be null.";
	
	public static final String PORT_ERROR_MESSAGE = "Port MUST NOT be null.";
	
	public static final String ENVIRONMENT_ERROR_MESSAGE = "Environment MUST NOT be null.";
	
	public static final String TOKEN_ERROR_MESSAGE = "Token MUST NOT be null.";
	
	public static final String STORE_ERROR_MESSAGE = "Store MUST NOT be null.";
	
	public static final String SDK_CONFIG_ERROR_MESSAGE = "sdkConfig MUST NOT be null.";
	
	public static final String RESOURCE_PATH = "EMPTY_RESOURCE_PATH";
	
	public static final String API_EXCEPTION = "API_EXCEPTION";
	
	public static final String STATUS = "status";
	
	public static final String MESSAGE = "message";
	
	public static final String UNDERSCORE = "_";
	
	public static final String RELATED_LISTS = "Related_Lists";
	
	public static final String API_NAME = "api_name";
	
	public static final String HREF = "href";
	
	public static final String ID ="id";
	
	public static final int NO_CONTENT_STATUS_CODE = 204;
	
	public static final int NOT_MODIFIED_STATUS_CODE = 304;
	
	public static final String GIVEN_TYPE = "given-type";
	
	public static final String GIVEN_LENGTH = "given-length";
	
	public static final String TYPE_ERROR = "TYPE ERROR";
	
	public static final String ARRAYLIST_NAMESPACE = "java.util.ArrayList";
	
	public static final String OBJECT_NAMESPACE = "java.lang.Object";

	public static final String HASHMAP_NAMESPACE = "java.util.HashMap";

	public static final String SKIP_MANDATORY = "skip_mandatory";
	
	public static final String DELETE = "delete";
	
	public static final String NOTES = "Notes";
	
	public static final String ATTACHMENTS = "$attachments";
	
	public static final String ATTACHMENTS_NAMESPACE = "com.zoho.crm.api.attachments.Attachment";
	
	public static final String PICKLIST = "picklist";
	
	public static final String NULL_VALUE = "null";
	
	public static final String UNSUPPORTED_IN_API = "API UNSUPPORTED OPERATION";
	
	public static final String UNSUPPORTED_IN_API_MESSAGE = " Operation is not supported by API";
	
	public static final String PARAMETER_NULL_ERROR = "NULL PARAMETER ERROR";
	
	public static final String HEADER_NULL_ERROR = "NULL HEADER ERROR";
	
	public static final String PARAM_NAME_NULL_ERROR = "NULL PARAM NAME ERROR";
	
	public static final String HEADER_NAME_NULL_ERROR = "NULL HEADER NAME ERROR";
	
	public static final String PARAM_NAME_NULL_ERROR_MESSAGE = "Param Name MUST NOT be null";
	
	public static final String HEADER_NAME_NULL_ERROR_MESSAGE = "Header Name MUST NOT be null";
	
	public static final String NULL_VALUE_ERROR_MESSAGE = " MUST NOT be null";
	
	public static final String PARAM_INSTANCE_NULL_ERROR = "Param<T> Instance MUST NOT be null";
	
	public static final String HEADER_INSTANCE_NULL_ERROR = "Header<T> Instance MUST NOT be null";
	
	public static final String PROXY_SETTINGS = "Proxy settings - ";
	
	public static final String PROXY_HOST = "Host: ";
	
	public static final String PROXY_PORT = "Port: ";
	
	public static final String PROXY_USER = "User: ";
	
	public static final String PROXY_DOMAIN = "Domain: ";
	
	public static final String USER_MAIL_NULL_ERROR = "USER MAIL NULL ERROR";
	
	public static final String USER_MAIL_NULL_ERROR_MESSAGE = "User Mail MUST NOT be null. Use setUserMail() to set value.";
	
	public static final String JSON_FILE_EXTENSION = ".json";
	
    public static final String FILE_ERROR = "file_error";
    
    public static final String FILE_DOES_NOT_EXISTS = "file does not exists";
}