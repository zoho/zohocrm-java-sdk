package com.zoho.crm.api.attachments;

import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class Attachment implements Model
{
	private User owner;

	private OffsetDateTime modifiedTime;

	private String fileName;

	private OffsetDateTime createdTime;

	private Long size;

	private Record parentId;

	private Boolean editable;

	private String fileId;

	private String type;

	private String seModule;

	private User modifiedBy;

	private String state;

	private Long id;

	private User createdBy;

	private String linkUrl;

	private String description;

	private String category;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of owner
	 * @return An instance of User
	 */
	public User getOwner()
	{
		return  this.owner;

	}

	/**
	 * The method to set the value to owner
	 * @param owner An instance of User
	 */
	public void setOwner(User owner)
	{
		 this.owner=owner;

		 this.keyModified.put("Owner", 1);

	}

	/**
	 * The method to get the value of modifiedTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getModifiedTime()
	{
		return  this.modifiedTime;

	}

	/**
	 * The method to set the value to modifiedTime
	 * @param modifiedTime An instance of OffsetDateTime
	 */
	public void setModifiedTime(OffsetDateTime modifiedTime)
	{
		 this.modifiedTime=modifiedTime;

		 this.keyModified.put("Modified_Time", 1);

	}

	/**
	 * The method to get the value of fileName
	 * @return A String representing the fileName
	 */
	public String getFileName()
	{
		return  this.fileName;

	}

	/**
	 * The method to set the value to fileName
	 * @param fileName A String representing the fileName
	 */
	public void setFileName(String fileName)
	{
		 this.fileName=fileName;

		 this.keyModified.put("File_Name", 1);

	}

	/**
	 * The method to get the value of createdTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getCreatedTime()
	{
		return  this.createdTime;

	}

	/**
	 * The method to set the value to createdTime
	 * @param createdTime An instance of OffsetDateTime
	 */
	public void setCreatedTime(OffsetDateTime createdTime)
	{
		 this.createdTime=createdTime;

		 this.keyModified.put("Created_Time", 1);

	}

	/**
	 * The method to get the value of size
	 * @return A Long representing the size
	 */
	public Long getSize()
	{
		return  this.size;

	}

	/**
	 * The method to set the value to size
	 * @param size A Long representing the size
	 */
	public void setSize(Long size)
	{
		 this.size=size;

		 this.keyModified.put("Size", 1);

	}

	/**
	 * The method to get the value of parentId
	 * @return An instance of Record
	 */
	public Record getParentId()
	{
		return  this.parentId;

	}

	/**
	 * The method to set the value to parentId
	 * @param parentId An instance of Record
	 */
	public void setParentId(Record parentId)
	{
		 this.parentId=parentId;

		 this.keyModified.put("Parent_Id", 1);

	}

	/**
	 * The method to get the value of editable
	 * @return A Boolean representing the editable
	 */
	public Boolean getEditable()
	{
		return  this.editable;

	}

	/**
	 * The method to set the value to editable
	 * @param editable A Boolean representing the editable
	 */
	public void setEditable(Boolean editable)
	{
		 this.editable=editable;

		 this.keyModified.put("$editable", 1);

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

		 this.keyModified.put("$file_id", 1);

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

		 this.keyModified.put("$type", 1);

	}

	/**
	 * The method to get the value of seModule
	 * @return A String representing the seModule
	 */
	public String getSeModule()
	{
		return  this.seModule;

	}

	/**
	 * The method to set the value to seModule
	 * @param seModule A String representing the seModule
	 */
	public void setSeModule(String seModule)
	{
		 this.seModule=seModule;

		 this.keyModified.put("$se_module", 1);

	}

	/**
	 * The method to get the value of modifiedBy
	 * @return An instance of User
	 */
	public User getModifiedBy()
	{
		return  this.modifiedBy;

	}

	/**
	 * The method to set the value to modifiedBy
	 * @param modifiedBy An instance of User
	 */
	public void setModifiedBy(User modifiedBy)
	{
		 this.modifiedBy=modifiedBy;

		 this.keyModified.put("Modified_By", 1);

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

		 this.keyModified.put("$state", 1);

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
	 * The method to get the value of createdBy
	 * @return An instance of User
	 */
	public User getCreatedBy()
	{
		return  this.createdBy;

	}

	/**
	 * The method to set the value to createdBy
	 * @param createdBy An instance of User
	 */
	public void setCreatedBy(User createdBy)
	{
		 this.createdBy=createdBy;

		 this.keyModified.put("Created_By", 1);

	}

	/**
	 * The method to get the value of linkUrl
	 * @return A String representing the linkUrl
	 */
	public String getLinkUrl()
	{
		return  this.linkUrl;

	}

	/**
	 * The method to set the value to linkUrl
	 * @param linkUrl A String representing the linkUrl
	 */
	public void setLinkUrl(String linkUrl)
	{
		 this.linkUrl=linkUrl;

		 this.keyModified.put("$link_url", 1);

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
	 * The method to get the value of category
	 * @return A String representing the category
	 */
	public String getCategory()
	{
		return  this.category;

	}

	/**
	 * The method to set the value to category
	 * @param category A String representing the category
	 */
	public void setCategory(String category)
	{
		 this.category=category;

		 this.keyModified.put("category", 1);

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