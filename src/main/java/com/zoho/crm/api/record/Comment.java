package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;

public class Comment implements Model
{
	private String commentedBy;

	private OffsetDateTime commentedTime;

	private String commentContent;

	private Long id;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


	/**
	 * The method to get the value of commentedBy
	 * @return A String representing the commentedBy
	 */
	public String getCommentedBy()
	{
		return  this.commentedBy;

	}

	/**
	 * The method to set the value to commentedBy
	 * @param commentedBy A String representing the commentedBy
	 */
	public void setCommentedBy(String commentedBy)
	{
		 this.commentedBy=commentedBy;

		 this.keyModified.put("commented_by", 1);

	}

	/**
	 * The method to get the value of commentedTime
	 * @return An instance of OffsetDateTime
	 */
	public OffsetDateTime getCommentedTime()
	{
		return  this.commentedTime;

	}

	/**
	 * The method to set the value to commentedTime
	 * @param commentedTime An instance of OffsetDateTime
	 */
	public void setCommentedTime(OffsetDateTime commentedTime)
	{
		 this.commentedTime=commentedTime;

		 this.keyModified.put("commented_time", 1);

	}

	/**
	 * The method to get the value of commentContent
	 * @return A String representing the commentContent
	 */
	public String getCommentContent()
	{
		return  this.commentContent;

	}

	/**
	 * The method to set the value to commentContent
	 * @param commentContent A String representing the commentContent
	 */
	public void setCommentContent(String commentContent)
	{
		 this.commentContent=commentContent;

		 this.keyModified.put("comment_content", 1);

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