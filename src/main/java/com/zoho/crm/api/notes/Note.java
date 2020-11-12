package com.zoho.crm.api.notes;

import com.zoho.crm.api.attachments.Attachment;
import com.zoho.crm.api.record.Record;
import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

public class Note implements Model
{
	private User owner;

	private OffsetDateTime modifiedTime;

	private List<Attachment> attachments;

	private OffsetDateTime createdTime;

	private Record parentId;

	private Boolean editable;

	private String seModule;

	private Boolean isSharedToClient;

	private User modifiedBy;

	private String size;

	private String state;

	private Boolean voiceNote;

	private Long id;

	private User createdBy;

	private String noteTitle;

	private String noteContent;

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
	 * The method to get the value of attachments
	 * @return An instance of List<Attachment>
	 */
	public List<Attachment> getAttachments()
	{
		return  this.attachments;

	}

	/**
	 * The method to set the value to attachments
	 * @param attachments An instance of List<Attachment>
	 */
	public void setAttachments(List<Attachment> attachments)
	{
		 this.attachments=attachments;

		 this.keyModified.put("$attachments", 1);

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
	 * The method to get the value of isSharedToClient
	 * @return A Boolean representing the isSharedToClient
	 */
	public Boolean getIsSharedToClient()
	{
		return  this.isSharedToClient;

	}

	/**
	 * The method to set the value to isSharedToClient
	 * @param isSharedToClient A Boolean representing the isSharedToClient
	 */
	public void setIsSharedToClient(Boolean isSharedToClient)
	{
		 this.isSharedToClient=isSharedToClient;

		 this.keyModified.put("$is_shared_to_client", 1);

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
	 * The method to get the value of size
	 * @return A String representing the size
	 */
	public String getSize()
	{
		return  this.size;

	}

	/**
	 * The method to set the value to size
	 * @param size A String representing the size
	 */
	public void setSize(String size)
	{
		 this.size=size;

		 this.keyModified.put("$size", 1);

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
	 * The method to get the value of voiceNote
	 * @return A Boolean representing the voiceNote
	 */
	public Boolean getVoiceNote()
	{
		return  this.voiceNote;

	}

	/**
	 * The method to set the value to voiceNote
	 * @param voiceNote A Boolean representing the voiceNote
	 */
	public void setVoiceNote(Boolean voiceNote)
	{
		 this.voiceNote=voiceNote;

		 this.keyModified.put("$voice_note", 1);

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
	 * The method to get the value of noteTitle
	 * @return A String representing the noteTitle
	 */
	public String getNoteTitle()
	{
		return  this.noteTitle;

	}

	/**
	 * The method to set the value to noteTitle
	 * @param noteTitle A String representing the noteTitle
	 */
	public void setNoteTitle(String noteTitle)
	{
		 this.noteTitle=noteTitle;

		 this.keyModified.put("Note_Title", 1);

	}

	/**
	 * The method to get the value of noteContent
	 * @return A String representing the noteContent
	 */
	public String getNoteContent()
	{
		return  this.noteContent;

	}

	/**
	 * The method to set the value to noteContent
	 * @param noteContent A String representing the noteContent
	 */
	public void setNoteContent(String noteContent)
	{
		 this.noteContent=noteContent;

		 this.keyModified.put("Note_Content", 1);

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