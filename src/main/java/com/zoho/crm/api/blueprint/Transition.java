package com.zoho.crm.api.blueprint;

import com.zoho.crm.api.fields.Field;
import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

public class Transition implements Model
{
	private List<NextTransition> nextTransitions;

	private Double percentPartialSave;

	private Record data;

	private String nextFieldValue;

	private String name;

	private Boolean criteriaMatched;

	private Long id;

	private List<Field> fields;

	private String criteriaMessage;

	private String type;

	private OffsetDateTime executionTime;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of nextTransitions
	 * @return An instance of List<NextTransition>
	 */
	public List<NextTransition> getNextTransitions()
	{
		return  this.nextTransitions;

	}

	/**
	 * The method to set the value to nextTransitions
	 * @param nextTransitions An instance of List<NextTransition>
	 */
	public void setNextTransitions(List<NextTransition> nextTransitions)
	{
		 this.nextTransitions=nextTransitions;

		 this.keyModified.put("next_transitions", 1);

	}

	/**
	 * The method to get the value of percentPartialSave
	 * @return An instance of Double
	 */
	public Double getPercentPartialSave()
	{
		return  this.percentPartialSave;

	}

	/**
	 * The method to set the value to percentPartialSave
	 * @param percentPartialSave An instance of Double
	 */
	public void setPercentPartialSave(Double percentPartialSave)
	{
		 this.percentPartialSave=percentPartialSave;

		 this.keyModified.put("percent_partial_save", 1);

	}

	/**
	 * The method to get the value of data
	 * @return An instance of Record
	 */
	public Record getData()
	{
		return  this.data;

	}

	/**
	 * The method to set the value to data
	 * @param data An instance of Record
	 */
	public void setData(Record data)
	{
		 this.data=data;

		 this.keyModified.put("data", 1);

	}

	/**
	 * The method to get the value of nextFieldValue
	 * @return A String representing the nextFieldValue
	 */
	public String getNextFieldValue()
	{
		return  this.nextFieldValue;

	}

	/**
	 * The method to set the value to nextFieldValue
	 * @param nextFieldValue A String representing the nextFieldValue
	 */
	public void setNextFieldValue(String nextFieldValue)
	{
		 this.nextFieldValue=nextFieldValue;

		 this.keyModified.put("next_field_value", 1);

	}

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return  this.name;

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.name=name;

		 this.keyModified.put("name", 1);

	}

	/**
	 * The method to get the value of criteriaMatched
	 * @return A Boolean representing the criteriaMatched
	 */
	public Boolean getCriteriaMatched()
	{
		return  this.criteriaMatched;

	}

	/**
	 * The method to set the value to criteriaMatched
	 * @param criteriaMatched A Boolean representing the criteriaMatched
	 */
	public void setCriteriaMatched(Boolean criteriaMatched)
	{
		 this.criteriaMatched=criteriaMatched;

		 this.keyModified.put("criteria_matched", 1);

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
	 * The method to get the value of fields
	 * @return An instance of List<Field>
	 */
	public List<Field> getFields()
	{
		return  this.fields;

	}

	/**
	 * The method to set the value to fields
	 * @param fields An instance of List<Field>
	 */
	public void setFields(List<Field> fields)
	{
		 this.fields=fields;

		 this.keyModified.put("fields", 1);

	}

	/**
	 * The method to get the value of criteriaMessage
	 * @return A String representing the criteriaMessage
	 */
	public String getCriteriaMessage()
	{
		return  this.criteriaMessage;

	}

	/**
	 * The method to set the value to criteriaMessage
	 * @param criteriaMessage A String representing the criteriaMessage
	 */
	public void setCriteriaMessage(String criteriaMessage)
	{
		 this.criteriaMessage=criteriaMessage;

		 this.keyModified.put("criteria_message", 1);

	}

	/**
	 * The method to get the value of type
	 * @return A String representing the type
	 */
	public String getType()
	{
		return  this.type;

	}

	/**
	 * The method to set the value to type
	 * @param type A String representing the type
	 */
	public void setType(String type)
	{
		 this.type=type;

		 this.keyModified.put("type", 1);

	}

	/**
	 * The method to get the value of executionTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getExecutionTime()
	{
		return  this.executionTime;

	}

	/**
	 * The method to set the value to executionTime
	 * @param executionTime An instance of OffsetDateTime
	 */
	public void setExecutionTime(OffsetDateTime executionTime)
	{
		 this.executionTime=executionTime;

		 this.keyModified.put("execution_time", 1);

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