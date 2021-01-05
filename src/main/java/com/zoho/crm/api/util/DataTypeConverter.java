package com.zoho.crm.api.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * This class converts JSON value to the expected data type.
 */
public class DataTypeConverter
{
	private static final HashMap<String, PreConverter<?>> PRE_CONVERTER_MAP = new HashMap<>();
	
	private static final HashMap<String, PostConverter<?>> POST_CONVERTER_MAP = new HashMap<>();

	/**
	 * This method is to initialize the PreConverter and PostConverter lambda functions.
	 */
	private synchronized static void init()
	{
		if (!PRE_CONVERTER_MAP.isEmpty() && !POST_CONVERTER_MAP.isEmpty())
		{
			return;
		}

		addToMap(LocalDate.class.getName(), obj ->
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			return LocalDate.parse(obj.toString(), formatter);
		}, date ->
		{
			return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		});

		addToMap(OffsetDateTime.class.getName(), obj ->
		{
			return OffsetDateTime.ofInstant(Instant.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(obj.toString())), ZoneId.systemDefault());
		}, dateTime ->
		{
			return dateTime.withNano(0).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		});

		addToMap(String.class.getName(), obj ->
		{
			return obj.toString();
		}, stringValue -> stringValue);

		addToMap(Long.class.getName(), obj ->
		{
			return ((obj.toString().equalsIgnoreCase(Constants.NULL_VALUE)) ? null : Long.parseLong(obj.toString()));
		}, longValue -> longValue);

		addToMap(Integer.class.getName(), obj ->
		{
			return Integer.parseInt(obj.toString());
		}, integerValue -> integerValue);

		addToMap(Boolean.class.getName(), obj ->
		{
			return Boolean.parseBoolean(obj.toString());
		}, bool -> bool);
		
		addToMap(Double.class.getName(), obj ->
		{
			return Double.parseDouble(obj.toString());
		}, doubleValue -> doubleValue);
		
		addToMap(Object.class.getName(), obj ->
		{
			return DataTypeConverter.preConvertObjectData(obj);
		}, objectValue -> 
		{
			return DataTypeConverter.postConvertObjectData(objectValue);
		}
		);
	}
	
	private static Object preConvertObjectData(Object obj) throws Exception
	{
		if (obj == null)
		{
			return null;
		}
		
		if(obj instanceof JSONArray)
		{
			JSONArray jsonArray = (JSONArray)obj;
			
			ArrayList<Object> values = new ArrayList<Object>();
			
			if(jsonArray.length() > 0)
			{
				for (Object response : jsonArray)
				{
					values.add(DataTypeConverter.preConvertObjectData(response));
				}
			}
			
			return values;
		}
		else if(obj instanceof JSONObject)
		{
			JSONObject jsonObject = (JSONObject)obj;
			
			Map<Object, Object> mapInstance = new HashMap<>();
			
			if(jsonObject.length() > 0)
			{	
				for (String memberName : jsonObject.keySet())
				{
					Object jsonValue = jsonObject.get(memberName);
					
					mapInstance.put(memberName, DataTypeConverter.preConvertObjectData(jsonValue));
				}
			}
			
			return mapInstance;
		}
		else if(obj.getClass().getName().equalsIgnoreCase("Object"))
		{
			return obj;
		}
		else
		{
			return DataTypeConverter.preConvert(obj, obj.getClass().getName());
		}
	}
	
	@SuppressWarnings("rawtypes")
	private static Object postConvertObjectData(Object obj) throws Exception
	{
		if(obj == null)
        {
			return JSONObject.NULL;
		}
			
		if(obj instanceof List)
		{
			JSONArray list = new JSONArray();
			
			for(Object value : (List)obj)
			{
				list.put(DataTypeConverter.postConvertObjectData(value));
			}
			
			return list;
		}
		else if(obj instanceof Map)
		{
			JSONObject value = new JSONObject();
			
			HashMap<?, ?> requestObject = (HashMap<?, ?>) obj;

			if (requestObject.size() > 0)
			{
				for (Object key : requestObject.keySet())
				{
					Object keyValue = requestObject.get(key);
					
					value.put((String) key, DataTypeConverter.postConvertObjectData(keyValue));
				}
			}
			
			return value;
		}
		else if(obj.getClass().getName().equalsIgnoreCase("Object"))
		{
			return obj;
		}
		else
		{
			return DataTypeConverter.postConvert(obj, obj.getClass().getName());
		}
	}

	/**
	 * This method is to add PreConverter and PostConverter instance.
	 * @param <R> A T containing the specified data type.
	 * @param name A String containing the data type class name.
	 * @param preConverter A PreConverter interface.
	 * @param postConverter A PostConverter interface.
	 */
	private static <R> void addToMap(String name, PreConverter<R> preConverter, PostConverter<R> postConverter)
	{
		PRE_CONVERTER_MAP.put(name, preConverter);
		
		POST_CONVERTER_MAP.put(name, postConverter);
	}

	/**
	 * This method is to convert JSON value to expected data value.
	 * @param <R> A R containing the specified data type.
	 * @param obj A Object containing the JSON value.
	 * @param type A String containing the expected method return type.
	 * @return A R containing the expected data value.
	 * @throws Exception if a problem occurs.
	 */
	@SuppressWarnings("unchecked")
	public static <R> R preConvert(Object obj, String type) throws Exception
	{
		init();
		
		return (R) PRE_CONVERTER_MAP.get(type).convert(obj);
	}

	/**
	 * This method to convert Java data to JSON data value.
	 * @param <R> A R containing the specified data type.
	 * @param obj A R containing the Java data value.
	 * @param type A String containing the expected method return type.
	 * @return A Object containing the expected data value.
	 * @throws Exception if a problem occurs.
	 */
	@SuppressWarnings("unchecked")
	public static <R> Object postConvert(R obj, String type) throws Exception
	{
		init();
		
		return ((PostConverter<R>) POST_CONVERTER_MAP.get(type)).convert(obj);
	}
	
	/**
	 * This interface converts JSON value to Java data.
	 * @param <R> A R containing the specified data type.
	 */
	private static interface PreConverter<R>
	{
		R convert(Object obj) throws Exception;
	}

	/**
	 * This interface converts Java data to a JSON value.
	 * @param <R> A R containing the specified data type.
	 */
	private static interface PostConverter<R>
	{
		Object convert(R r) throws Exception;
	}
}