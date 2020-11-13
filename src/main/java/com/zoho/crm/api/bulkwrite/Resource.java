package com.zoho.crm.api.bulkwrite;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class Resource implements Model
{
	private Choice<String> status;

	private Choice<String> type;

	private String module;

	private String fileId;

	private Boolean ignoreEmpty;

	private String findBy;

	private List<FieldMapping> fieldMappings;

	private File file;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of status
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getStatus()
	{
		return  this.status;

	}

	/**
	 * The method to set the value to status
	 * @param status An instance of Choice<String>
	 */
	public void setStatus(Choice<String> status)
	{
		 this.status=status;

		 this.keyModified.put("status", 1);

	}

	/**
	 * The method to get the value of type
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getType()
	{
		return  this.type;

	}

	/**
	 * The method to set the value to type
	 * @param type An instance of Choice<String>
	 */
	public void setType(Choice<String> type)
	{
		 this.type=type;

		 this.keyModified.put("type", 1);

	}

	/**
	 * The method to get the value of module
	 * @return A String representing the module
	 */
	public String getModule()
	{
		return  this.module;

	}

	/**
	 * The method to set the value to module
	 * @param module A String representing the module
	 */
	public void setModule(String module)
	{
		 this.module=module;

		 this.keyModified.put("module", 1);

	}

	/**
	 * The method to get the value of fileId
	 * @return A String representing the fileId
	 */
	public String getFileId()
	{
		return  this.fileId;

	}

	/**
	 * The method to set the value to fileId
	 * @param fileId A String representing the fileId
	 */
	public void setFileId(String fileId)
	{
		 this.fileId=fileId;

		 this.keyModified.put("file_id", 1);

	}

	/**
	 * The method to get the value of ignoreEmpty
	 * @return A Boolean representing the ignoreEmpty
	 */
	public Boolean getIgnoreEmpty()
	{
		return  this.ignoreEmpty;

	}

	/**
	 * The method to set the value to ignoreEmpty
	 * @param ignoreEmpty A Boolean representing the ignoreEmpty
	 */
	public void setIgnoreEmpty(Boolean ignoreEmpty)
	{
		 this.ignoreEmpty=ignoreEmpty;

		 this.keyModified.put("ignore_empty", 1);

	}

	/**
	 * The method to get the value of findBy
	 * @return A String representing the findBy
	 */
	public String getFindBy()
	{
		return  this.findBy;

	}

	/**
	 * The method to set the value to findBy
	 * @param findBy A String representing the findBy
	 */
	public void setFindBy(String findBy)
	{
		 this.findBy=findBy;

		 this.keyModified.put("find_by", 1);

	}

	/**
	 * The method to get the value of fieldMappings
	 * @return An instance of List<FieldMapping>
	 */
	public List<FieldMapping> getFieldMappings()
	{
		return  this.fieldMappings;

	}

	/**
	 * The method to set the value to fieldMappings
	 * @param fieldMappings An instance of List<FieldMapping>
	 */
	public void setFieldMappings(List<FieldMapping> fieldMappings)
	{
		 this.fieldMappings=fieldMappings;

		 this.keyModified.put("field_mappings", 1);

	}

	/**
	 * The method to get the value of file
	 * @return An instance of File
	 */
	public File getFile()
	{
		return  this.file;

	}

	/**
	 * The method to set the value to file
	 * @param file An instance of File
	 */
	public void setFile(File file)
	{
		 this.file=file;

		 this.keyModified.put("file", 1);

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