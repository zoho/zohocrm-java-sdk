package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class FileDetails implements Model
{
	private String extn;

	private Boolean isPreviewAvailable;

	private String downloadUrl;

	private String deleteUrl;

	private String entityId;

	private String mode;

	private String originalSizeByte;

	private String previewUrl;

	private String fileName;

	private String fileId;

	private String attachmentId;

	private String fileSize;

	private String creatorId;

	private Integer linkDocs;

	private String delete;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of extn
	 * @return A String representing the extn
	 */
	public String getExtn()
	{
		return  this.extn;

	}

	/**
	 * The method to set the value to extn
	 * @param extn A String representing the extn
	 */
	public void setExtn(String extn)
	{
		 this.extn=extn;

		 this.keyModified.put("extn", 1);

	}

	/**
	 * The method to get the value of isPreviewAvailable
	 * @return A Boolean representing the isPreviewAvailable
	 */
	public Boolean getIsPreviewAvailable()
	{
		return  this.isPreviewAvailable;

	}

	/**
	 * The method to set the value to isPreviewAvailable
	 * @param isPreviewAvailable A Boolean representing the isPreviewAvailable
	 */
	public void setIsPreviewAvailable(Boolean isPreviewAvailable)
	{
		 this.isPreviewAvailable=isPreviewAvailable;

		 this.keyModified.put("is_Preview_Available", 1);

	}

	/**
	 * The method to get the value of downloadUrl
	 * @return A String representing the downloadUrl
	 */
	public String getDownloadUrl()
	{
		return  this.downloadUrl;

	}

	/**
	 * The method to set the value to downloadUrl
	 * @param downloadUrl A String representing the downloadUrl
	 */
	public void setDownloadUrl(String downloadUrl)
	{
		 this.downloadUrl=downloadUrl;

		 this.keyModified.put("download_Url", 1);

	}

	/**
	 * The method to get the value of deleteUrl
	 * @return A String representing the deleteUrl
	 */
	public String getDeleteUrl()
	{
		return  this.deleteUrl;

	}

	/**
	 * The method to set the value to deleteUrl
	 * @param deleteUrl A String representing the deleteUrl
	 */
	public void setDeleteUrl(String deleteUrl)
	{
		 this.deleteUrl=deleteUrl;

		 this.keyModified.put("delete_Url", 1);

	}

	/**
	 * The method to get the value of entityId
	 * @return A String representing the entityId
	 */
	public String getEntityId()
	{
		return  this.entityId;

	}

	/**
	 * The method to set the value to entityId
	 * @param entityId A String representing the entityId
	 */
	public void setEntityId(String entityId)
	{
		 this.entityId=entityId;

		 this.keyModified.put("entity_Id", 1);

	}

	/**
	 * The method to get the value of mode
	 * @return A String representing the mode
	 */
	public String getMode()
	{
		return  this.mode;

	}

	/**
	 * The method to set the value to mode
	 * @param mode A String representing the mode
	 */
	public void setMode(String mode)
	{
		 this.mode=mode;

		 this.keyModified.put("mode", 1);

	}

	/**
	 * The method to get the value of originalSizeByte
	 * @return A String representing the originalSizeByte
	 */
	public String getOriginalSizeByte()
	{
		return  this.originalSizeByte;

	}

	/**
	 * The method to set the value to originalSizeByte
	 * @param originalSizeByte A String representing the originalSizeByte
	 */
	public void setOriginalSizeByte(String originalSizeByte)
	{
		 this.originalSizeByte=originalSizeByte;

		 this.keyModified.put("original_Size_Byte", 1);

	}

	/**
	 * The method to get the value of previewUrl
	 * @return A String representing the previewUrl
	 */
	public String getPreviewUrl()
	{
		return  this.previewUrl;

	}

	/**
	 * The method to set the value to previewUrl
	 * @param previewUrl A String representing the previewUrl
	 */
	public void setPreviewUrl(String previewUrl)
	{
		 this.previewUrl=previewUrl;

		 this.keyModified.put("preview_Url", 1);

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

		 this.keyModified.put("file_Name", 1);

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

		 this.keyModified.put("file_Id", 1);

	}

	/**
	 * The method to get the value of attachmentId
	 * @return A String representing the attachmentId
	 */
	public String getAttachmentId()
	{
		return  this.attachmentId;

	}

	/**
	 * The method to set the value to attachmentId
	 * @param attachmentId A String representing the attachmentId
	 */
	public void setAttachmentId(String attachmentId)
	{
		 this.attachmentId=attachmentId;

		 this.keyModified.put("attachment_Id", 1);

	}

	/**
	 * The method to get the value of fileSize
	 * @return A String representing the fileSize
	 */
	public String getFileSize()
	{
		return  this.fileSize;

	}

	/**
	 * The method to set the value to fileSize
	 * @param fileSize A String representing the fileSize
	 */
	public void setFileSize(String fileSize)
	{
		 this.fileSize=fileSize;

		 this.keyModified.put("file_Size", 1);

	}

	/**
	 * The method to get the value of creatorId
	 * @return A String representing the creatorId
	 */
	public String getCreatorId()
	{
		return  this.creatorId;

	}

	/**
	 * The method to set the value to creatorId
	 * @param creatorId A String representing the creatorId
	 */
	public void setCreatorId(String creatorId)
	{
		 this.creatorId=creatorId;

		 this.keyModified.put("creator_Id", 1);

	}

	/**
	 * The method to get the value of linkDocs
	 * @return An Integer representing the linkDocs
	 */
	public Integer getLinkDocs()
	{
		return  this.linkDocs;

	}

	/**
	 * The method to set the value to linkDocs
	 * @param linkDocs An Integer representing the linkDocs
	 */
	public void setLinkDocs(Integer linkDocs)
	{
		 this.linkDocs=linkDocs;

		 this.keyModified.put("link_Docs", 1);

	}

	/**
	 * The method to get the value of delete
	 * @return A String representing the delete
	 */
	public String getDelete()
	{
		return  this.delete;

	}

	/**
	 * The method to set the value to delete
	 * @param delete A String representing the delete
	 */
	public void setDelete(String delete)
	{
		 this.delete=delete;

		 this.keyModified.put("_delete", 1);

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