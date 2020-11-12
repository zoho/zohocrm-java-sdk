package samples.src.com.zoho.crm.api.notes;

import java.lang.reflect.Field;

import java.time.OffsetDateTime;

import java.time.ZoneOffset;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.HeaderMap;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.attachments.Attachment;

import com.zoho.crm.api.notes.APIException;

import com.zoho.crm.api.notes.ActionHandler;

import com.zoho.crm.api.notes.ActionResponse;

import com.zoho.crm.api.notes.ActionWrapper;

import com.zoho.crm.api.notes.BodyWrapper;

import com.zoho.crm.api.notes.Info;

import com.zoho.crm.api.notes.NotesOperations;

import com.zoho.crm.api.notes.NotesOperations.DeleteNotesParam;

import com.zoho.crm.api.notes.NotesOperations.GetNotesHeader;

import com.zoho.crm.api.notes.NotesOperations.GetNotesParam;

import com.zoho.crm.api.notes.ResponseHandler;

import com.zoho.crm.api.notes.ResponseWrapper;

import com.zoho.crm.api.notes.SuccessResponse;

import com.zoho.crm.api.record.Record;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Model;

public class Note
{
	/**
	 * <h3> Get Notes </h3>
	 * This method is used to get the list of notes and print the response.
	 * @throws Exception
	 */
	public static void getNotes() throws Exception
	{
		//Get instance of NotesOperations Class
		NotesOperations notesOperations = new NotesOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetNotesParam.PAGE, 1);
		
		//paramInstance.add(GetNotesParam.PER_PAGE, 1);
		
		//Get instance of HeaderMap Class
		HeaderMap headerInstance = new HeaderMap();
		
		OffsetDateTime startdatetime = OffsetDateTime.of(2021, 06, 01, 10, 00, 01, 00, ZoneOffset.of("+05:30"));
		
//		headerInstance.add(GetNotesHeader.IF_MODIFIED_SINCE, startdatetime);
		
		//Call getNotes method that takes paramInstance and headerInstance as parameters
		APIResponse<ResponseHandler> response = notesOperations.getNotes(paramInstance, headerInstance);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			if(Arrays.asList(204,304).contains(response.getStatusCode()))
			{
				System.out.println(response.getStatusCode() == 204? "No Content" : "Not Modified");
				return;
			}
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ResponseHandler responseHandler = response.getObject();
				
				if(responseHandler instanceof ResponseWrapper)
				{
					//Get the received ResponseWrapper instance
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the list of obtained Note instances
					List<com.zoho.crm.api.notes.Note> notes = responseWrapper.getData();
				
					for(com.zoho.crm.api.notes.Note note : notes)
					{
						//Get the owner User instance of each Note
						com.zoho.crm.api.users.User owner = note.getOwner();
						
						//Check if owner is not null
						if(owner != null)
						{
							//Get the name of the owner User
							System.out.println("Note Owner User-Name: " + owner.getName());
							
							//Get the ID of the owner User
							System.out.println("Note Owner User-ID: " + owner.getId());
							
							//Get the Email of the owner User
							System.out.println("Note Owner Email: " + owner.getEmail());
						}
						
						//Get the ModifiedTime of each Module
						System.out.println("Note ModifiedTime: " + note.getModifiedTime());
						
						//Get the list of Attachment instance each Note
						List<Attachment> attachments = note.getAttachments();
						
						//Check if attachments is not null
						if(attachments != null)
						{
							for(Attachment attachment : attachments)
							{
								printAttachment(attachment);
							}
						}
						
						//Get the CreatedTime of each Note
						System.out.println("Note CreatedTime: " + note.getCreatedTime());
						
						//Get the parentId Record instance of each Note
						Record parentId = note.getParentId();
						
						//Check if parentId is not null
						if(parentId != null)
						{
							if(parentId.getKeyValue("name") != null)
							{
								//Get the parent record Name of each Note
								System.out.println("Note parent record Name: " + parentId.getKeyValue("name"));
							}
							
							//Get the parent record ID of each Note
							System.out.println("Note parent record ID: " + parentId.getId());
						}
						
						//Get the Editable of each Note
						System.out.println("Note Editable: " + note.getEditable().toString());
						
						//Get the SeModule of each Note
						System.out.println("Note SeModule: " + note.getSeModule());
						
						//Get the IsSharedToClient of each Note
						System.out.println("Note IsSharedToClient: " + note.getIsSharedToClient().toString());
						
						//Get the modifiedBy User instance of each Note
						com.zoho.crm.api.users.User modifiedBy = note.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Note Modified By User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Note Modified By User-ID: " + modifiedBy.getId());
							
							//Get the Email of the modifiedBy User
							System.out.println("Note Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the Size of each Note
						System.out.println("Note Size: " + note.getSize());
						
						//Get the State of each Note
						System.out.println("Note State: " + note.getState());
						
						//Get the VoiceNote of each Note
						System.out.println("Note VoiceNote: " + note.getVoiceNote().toString());
						
						//Get the Id of each Note
						System.out.println("Note Id: " + note.getId());
						
						//Get the createdBy User instance of each Note
						com.zoho.crm.api.users.User createdBy = note.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Note Created By User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Note Created By User-ID: " + createdBy.getId());
							
							//Get the Email of the createdBy User
							System.out.println("Note Created By User-Email: " + createdBy.getEmail());
						}
						
						//Get the NoteTitle of each Note
						System.out.println("Note NoteTitle: " + note.getNoteTitle());
						
						//Get the NoteContent of each Note
						System.out.println("Note NoteContent: " + note.getNoteContent());
					}
					
					//Get the Object obtained Info instance
					Info info = responseWrapper.getInfo();
					
					if(info != null)
					{
						if(info.getPerPage() != null)
						{
							//Get the PerPage of the Info
							System.out.println("Note Info PerPage: " + info.getPerPage().toString());
						}
						
						if(info.getCount() != null)
						{
							//Get the Count of the Info
							System.out.println("Note Info Count: " + info.getCount().toString());
						}
						
						if(info.getPage() != null)
						{
							//Get the Default of the Info
							System.out.println("Note Info Page: " + info.getPage());
						}
						
						if(info.getMoreRecords() != null)
						{
							//Get the Default of the Info
							System.out.println("Note Info MoreRecords: " + info.getMoreRecords().toString());
						}
					}
					
				}
				//Check if the request returned an exception
				else if(responseHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) responseHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	private static void printAttachment(Attachment attachment)
	{
		//Get the Owner User instance of each attachment
		com.zoho.crm.api.users.User owner = attachment.getOwner();
		
		//Check if owner is not null
		if(owner != null)
		{
			//Get the Name of the Owner
			System.out.println("Note Attachment Owner User-Name: " + owner.getName());
			
			//Get the ID of the Owner
			System.out.println("Note Attachment Owner User-ID: " + owner.getId());
			
			//Get the Email of the Owner
			System.out.println("Note Attachment Owner User-Email: " + owner.getEmail());
		}
		
		//Get the modified time of each attachment
		System.out.println("Note Attachment Modified Time: " + attachment.getModifiedTime().toString());
		
		//Get the name of the File
		System.out.println("Note Attachment File Name: " + attachment.getFileName());
		
		//Get the created time of each attachment
		System.out.println("Note Attachment Created Time: " + attachment.getCreatedTime().toString());
		
		//Get the Attachment file size
		System.out.println("Note Attachment File Size: " + attachment.getSize().toString());
		
		//Get the parentId Record instance of each attachment
		Record parentId = attachment.getParentId();
		
		//Check if parentId is not null
		if(parentId != null)
		{	
			//Get the parent record Name of each attachment
			System.out.println("Note Attachment parent record Name: " + parentId.getKeyValue("name"));
			
			//Get the parent record ID of each attachment
			System.out.println("Note Attachment parent record ID: " + parentId.getId());
		}
		
		//Get the attachment is Editable
		System.out.println("Note Attachment is Editable: " + attachment.getEditable().toString());
		
		//Get the file ID of each attachment
		System.out.println("Note Attachment File ID: " + attachment.getFileId());
		
		//Get the type of each attachment
		System.out.println("Note Attachment File Type: " + attachment.getType());
		
		//Get the seModule of each attachment
		System.out.println("Note Attachment seModule: " + attachment.getSeModule());
		
		//Get the modifiedBy User instance of each attachment
		com.zoho.crm.api.users.User modifiedBy = attachment.getModifiedBy();
		
		//Check if modifiedBy is not null
		if(modifiedBy != null)
		{
			//Get the Name of the modifiedBy User
			System.out.println("Note Attachment Modified By User-Name: " + modifiedBy.getName());
			
			//Get the ID of the modifiedBy User
			System.out.println("Note Attachment Modified By User-ID: " + modifiedBy.getId());
			
			//Get the Email of the modifiedBy User
			System.out.println("Note Attachment Modified By User-Email: " + modifiedBy.getEmail());
		}
		
		//Get the state of each attachment
		System.out.println("Note Attachment State: " + attachment.getState());
		
		//Get the ID of each attachment
		System.out.println("Note Attachment ID: " + attachment.getId());
		
		//Get the createdBy User instance of each attachment
		com.zoho.crm.api.users.User createdBy = attachment.getCreatedBy();
		
		//Check if createdBy is not null
		if(createdBy != null)
		{
			//Get the name of the createdBy User
			System.out.println("Note Attachment Created By User-Name: " + createdBy.getName());
			
			//Get the ID of the createdBy User
			System.out.println("Note Attachment Created By User-ID: " + createdBy.getId());
			
			//Get the Email of the createdBy User
			System.out.println("Note Attachment Created By User-Email: " + createdBy.getEmail());
		}
		
		//Get the linkUrl of each attachment
		System.out.println("Note Attachment LinkUrl: " + attachment.getLinkUrl());
	}
	
	/**
	 * <h3> Create Notes </h3>
	 * This method is used to add new notes and print the response.
	 * @throws Exception 
	 */
	public static void createNotes() throws Exception
	{	
		//Get instance of NotesOperations Class
		NotesOperations notesOperations = new NotesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Note instances
		List<com.zoho.crm.api.notes.Note> notes = new ArrayList<com.zoho.crm.api.notes.Note>();
		
		for(int i = 1; i <= 5; i++)
		{
			//Get instance of Note Class
			com.zoho.crm.api.notes.Note note = new com.zoho.crm.api.notes.Note();
			
			//Set Note_Title of the Note
			note.setNoteTitle("Contacted");
			
			//Set NoteContent of the Note
			note.setNoteContent("Need to do further tracking");
			
			//Get instance of Record Class
			Record parentRecord = new Record();
			
			//Set ID of the Record
			parentRecord.setId(3477061000007250001l);
			
			//Set ParentId of the Note
			note.setParentId(parentRecord);
			
			//Set SeModule of the Record
			note.setSeModule("Leads");
			
			//Add Note instance to the list
			notes.add(note);
		}
		
		//Set the list to notes in BodyWrapper instance
		bodyWrapper.setData(notes);
		
		//Call createNotes method that takes BodyWrapper instance as parameter 
		APIResponse<ActionHandler> response = notesOperations.createNotes(bodyWrapper);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
					for(ActionResponse actionResponse : actionResponses)
					{
						//Check if the request is successful
						if(actionResponse instanceof SuccessResponse)
						{
							//Get the received SuccessResponse instance
							SuccessResponse successResponse = (SuccessResponse)actionResponse;
							
							//Get the Status
							System.out.println("Status: " + successResponse.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + successResponse.getCode().getValue());
							
							System.out.println("Details: " );
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + successResponse.getMessage().getValue());
						}
						//Check if the request returned an exception
						else if(actionResponse instanceof APIException)
						{
							//Get the received APIException instance
							APIException exception = (APIException) actionResponse;
							
							//Get the Status
							System.out.println("Status: " + exception.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + exception.getCode().getValue());
							
							System.out.println("Details: " );
							
							//Get the details map
							for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Update Notes</h3>
	 * This method is used to update an existing note and print the response.
	 * @throws Exception
	 */
	public static void updateNotes() throws Exception
	{
		//Get instance of NotesOperations Class
		NotesOperations notesOperations = new NotesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Note instances
		List<com.zoho.crm.api.notes.Note> notes = new ArrayList<com.zoho.crm.api.notes.Note>();
		
		//Get instance of Note Class
		com.zoho.crm.api.notes.Note note = new com.zoho.crm.api.notes.Note();
		
		note.setId(3477061000007376026l);
		
		//Set Note_Title of the Note
		note.setNoteTitle("Contacted12");
		
		//Set NoteContent of the Note
		note.setNoteContent("Need to do further tracking12");
		
		//Add Note instance to the list
		notes.add(note);
		
		note = new com.zoho.crm.api.notes.Note();
		
		note.setId(3477061000007376025l);
		
		//Set Note_Title of the Note
		note.setNoteTitle("Contacted13");
		
		//Set NoteContent of the Note
		note.setNoteContent("Need to do further tracking13");
		
		//Add Note instance to the list
		notes.add(note);
		
		//Set the list to notes in BodyWrapper instance
		bodyWrapper.setData(notes);
		
		//Call updateNotes method that takes BodyWrapper instance as parameter 
		APIResponse<ActionHandler> response = notesOperations.updateNotes(bodyWrapper);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
					for(ActionResponse actionResponse : actionResponses)
					{
						//Check if the request is successful
						if(actionResponse instanceof SuccessResponse)
						{
							//Get the received SuccessResponse instance
							SuccessResponse successResponse = (SuccessResponse)actionResponse;
							
							//Get the Status
							System.out.println("Status: " + successResponse.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + successResponse.getCode().getValue());
							
							System.out.println("Details: " );
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + successResponse.getMessage().getValue());
						}
						//Check if the request returned an exception
						else if(actionResponse instanceof APIException)
						{
							//Get the received APIException instance
							APIException exception = (APIException) actionResponse;
							
							//Get the Status
							System.out.println("Status: " + exception.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + exception.getCode().getValue());
							
							System.out.println("Details: " );
							
							if(exception.getDetails() != null)
							{
								//Get the details map
								for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
								{
									//Get each value in the map
									System.out.println(entry.getKey() + ": " + entry.getValue());
								}
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * This method is used to delete notes in bulk and print the response.
	 * @param notesID - The List of Note IDs to be deleted
	 * @throws Exception
	 */
	public static void deleteNotes(List<Long> notesId) throws Exception
	{
		//example 
		//ArrayList<Long> notesId = new ArrayList<Long>(Arrays.asList(3477061000006153001l,3477061000006153002l));
		
		//Get instance of NotesOperations Class
		NotesOperations notesOperations = new NotesOperations();
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		for(Long id : notesId)
		{
			paramInstance.add(DeleteNotesParam.IDS, id);
		}
		
		//Call deleteNotes method that takes paramInstance as parameter 
		APIResponse<ActionHandler> response = notesOperations.deleteNotes(paramInstance);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
					for(ActionResponse actionResponse : actionResponses)
					{
						//Check if the request is successful
						if(actionResponse instanceof SuccessResponse)
						{
							//Get the received SuccessResponse instance
							SuccessResponse successResponse = (SuccessResponse)actionResponse;
							
							//Get the Status
							System.out.println("Status: " + successResponse.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + successResponse.getCode().getValue());
							
							System.out.println("Details: " );
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + successResponse.getMessage().getValue());
						}
						//Check if the request returned an exception
						else if(actionResponse instanceof APIException)
						{
							//Get the received APIException instance
							APIException exception = (APIException) actionResponse;
							
							//Get the Status
							System.out.println("Status: " + exception.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + exception.getCode().getValue());
							
							System.out.println("Details: " );
							
							if(exception.getDetails() != null)
							{
								//Get the details map
								for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
								{
									//Get each value in the map
									System.out.println(entry.getKey() + ": " + entry.getValue());
								}
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Get Note </h3>
	 * This method is used to get the note and print the response.
	 * @param noteId - The ID of the Note to be obtained
	 * @throws Exception
	 */
	public static void getNote(Long noteId) throws Exception
	{
		//example
		//Long noteId = 3477061000006153005l;
		
		//Get instance of NotesOperations Class
		NotesOperations notesOperations = new NotesOperations();
		
		ParameterMap paramInstance = new ParameterMap();
		
		HeaderMap headerInstance = new HeaderMap();
		
		//Call getNote method that takes noteId as parameter
		APIResponse<ResponseHandler> response = notesOperations.getNote(noteId, paramInstance, headerInstance);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			if(Arrays.asList(204,304).contains(response.getStatusCode()))
			{
				System.out.println(response.getStatusCode() == 204? "No Content" : "Not Modified");
				return;
			}
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ResponseHandler responseHandler = response.getObject();
				
				if(responseHandler instanceof ResponseWrapper)
				{
					//Get the received ResponseWrapper instance
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the list of obtained Note instances
					List<com.zoho.crm.api.notes.Note> notes = responseWrapper.getData();
				
					for(com.zoho.crm.api.notes.Note note : notes)
					{
						//Get the owner User instance of each Note
						com.zoho.crm.api.users.User owner = note.getOwner();
						
						//Check if owner is not null
						if(owner != null)
						{
							//Get the name of the owner User
							System.out.println("Note Owner User-Name: " + owner.getName());
							
							//Get the ID of the owner User
							System.out.println("Note Owner User-ID: " + owner.getId());
							
							//Get the Email of the owner User
							System.out.println("Note Owner Email: " + owner.getEmail());
						}
						
						//Get the ModifiedTime of each Module
						System.out.println("Note ModifiedTime: " + note.getModifiedTime());
						
						//Get the list of Attachment instance each Note
						List<Attachment> attachments = note.getAttachments();
						
						//Check if attachments is not null
						if(attachments != null)
						{
							for(Attachment attachment : attachments)
							{
								printAttachment(attachment);
							}
						}
						
						//Get the CreatedTime of each Note
						System.out.println("Note CreatedTime: " + note.getCreatedTime());
						
						//Get the parentId Record instance of each Note
						Record parentId = note.getParentId();
						
						//Check if parentId is not null
						if(parentId != null)
						{
							if(parentId.getKeyValue("name") != null)
							{
								//Get the parent record Name of each Note
								System.out.println("Note parent record Name: " + parentId.getKeyValue("name"));
							}
							
							//Get the parent record ID of each Note
							System.out.println("Note parent record ID: " + parentId.getId());
						}
						
						//Get the Editable of each Note
						System.out.println("Note Editable: " + note.getEditable().toString());
						
						//Get the SeModule of each Note
						System.out.println("Note SeModule: " + note.getSeModule());
						
						//Get the IsSharedToClient of each Note
						System.out.println("Note IsSharedToClient: " + note.getIsSharedToClient().toString());
						
						//Get the modifiedBy User instance of each Note
						com.zoho.crm.api.users.User modifiedBy = note.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the Name of the modifiedBy User
							System.out.println("Note Modified By User-Name: " + modifiedBy.getName());
							
							//Get the ID of the modifiedBy User
							System.out.println("Note Modified By User-ID: " + modifiedBy.getId());
							
							//Get the Email of the modifiedBy User
							System.out.println("Note Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the Size of each Note
						System.out.println("Note Size: " + note.getSize());
						
						//Get the State of each Note
						System.out.println("Note State: " + note.getState());
						
						//Get the VoiceNote of each Note
						System.out.println("Note VoiceNote: " + note.getVoiceNote().toString());
						
						//Get the Id of each Note
						System.out.println("Note Id: " + note.getId());
						
						//Get the createdBy User instance of each Note
						com.zoho.crm.api.users.User createdBy = note.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the Name of the createdBy User
							System.out.println("Note Created By User-Name: " + createdBy.getName());
							
							//Get the ID of the createdBy User
							System.out.println("Note Created By User-ID: " + createdBy.getId());
							
							//Get the Email of the createdBy User
							System.out.println("Note Created By User-Email: " + createdBy.getEmail());
						}
						
						//Get the NoteTitle of each Note
						System.out.println("Note NoteTitle: " + note.getNoteTitle());
						
						//Get the NoteContent of each Note
						System.out.println("Note NoteContent: " + note.getNoteContent());
					}
				}
				//Check if the request returned an exception
				else if(responseHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) responseHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Update Note</h3>
	 * This method is used to update an existing note and print the response.
	 * @param noteId - The ID of the Note to be obtained
	 * @throws Exception
	 */
	public static void updateNote(Long noteId) throws Exception
	{
		//example
		//Long noteId = 3477061000006153005l;
		
		//Get instance of NotesOperations Class
		NotesOperations notesOperations = new NotesOperations();
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper bodyWrapper = new BodyWrapper();
		
		//List of Note instances
		List<com.zoho.crm.api.notes.Note> notes = new ArrayList<com.zoho.crm.api.notes.Note>();
		
		com.zoho.crm.api.notes.Note note = new com.zoho.crm.api.notes.Note();
		
		//Set Note_Title of the Note
		note.setNoteTitle("Contacted12");
		
		//Set NoteContent of the Note
		note.setNoteContent("Need to do further tracking12");
		
		//Get instance of Record Class
		Record parentRecord = new Record();
		
		//Set ID of the Record
		parentRecord.setId(3477061000007255001l);
		
		//Set ParentId of the Note
		note.setParentId(parentRecord);
		
		//Set SeModule of the Record
		note.setSeModule("Contacts");
		
		//Add Note instance to the list
		notes.add(note);
		
		//Set the list to notes in BodyWrapper instance
		bodyWrapper.setData(notes);
		
		//Call updateNote method that takes noteId and BodyWrapper instance as parameter 
		APIResponse<ActionHandler> response = notesOperations.updateNote(noteId, bodyWrapper);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
					for(ActionResponse actionResponse : actionResponses)
					{
						//Check if the request is successful
						if(actionResponse instanceof SuccessResponse)
						{
							//Get the received SuccessResponse instance
							SuccessResponse successResponse = (SuccessResponse)actionResponse;
							
							//Get the Status
							System.out.println("Status: " + successResponse.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + successResponse.getCode().getValue());
							
							System.out.println("Details: " );
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + successResponse.getMessage().getValue());
						}
						//Check if the request returned an exception
						else if(actionResponse instanceof APIException)
						{
							//Get the received APIException instance
							APIException exception = (APIException) actionResponse;
							
							//Get the Status
							System.out.println("Status: " + exception.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + exception.getCode().getValue());
							
							System.out.println("Details: " );
							
							if(exception.getDetails() != null)
							{
								//Get the details map
								for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
								{
									//Get each value in the map
									System.out.println(entry.getKey() + ": " + entry.getValue());
								}
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Delete Note </h3>
	 * This method is used to delete single Note with ID and print the response.
	 * @param notesID - The ID of the Note to be deleted
	 * @throws Exception
	 */
	public static void deleteNote(Long noteID) throws Exception
	{
		//example
		//Long noteId = 3477061000006153005l;
		
		//Get instance of NotesOperations Class
		NotesOperations notesOperations = new NotesOperations();
		
		//Call deleteNote method that takes noteID as parameter 
		APIResponse<ActionHandler> response = notesOperations.deleteNote(noteID);
		
		if(response != null)
		{
			//Get the status code from response
			System.out.println("Status Code: " + response.getStatusCode());
			
			//Check if expected response is received
			if(response.isExpected())
			{
				//Get object from response
				ActionHandler actionHandler = response.getObject();
				
				if(actionHandler instanceof ActionWrapper)
				{
					//Get the received ActionWrapper instance
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					
					//Get the list of obtained ActionResponse instances
					List<ActionResponse> actionResponses = actionWrapper.getData();
					
					for(ActionResponse actionResponse : actionResponses)
					{
						//Check if the request is successful
						if(actionResponse instanceof SuccessResponse)
						{
							//Get the received SuccessResponse instance
							SuccessResponse successResponse = (SuccessResponse)actionResponse;
							
							//Get the Status
							System.out.println("Status: " + successResponse.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + successResponse.getCode().getValue());
							
							System.out.println("Details: " );
							
							//Get the details map
							for(Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								//Get each value in the map
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							
							//Get the Message
							System.out.println("Message: " + successResponse.getMessage().getValue());
						}
						//Check if the request returned an exception
						else if(actionResponse instanceof APIException)
						{
							//Get the received APIException instance
							APIException exception = (APIException) actionResponse;
							
							//Get the Status
							System.out.println("Status: " + exception.getStatus().getValue());
							
							//Get the Code
							System.out.println("Code: " + exception.getCode().getValue());
							
							System.out.println("Details: " );
							
							if(exception.getDetails() != null)
							{
								//Get the details map
								for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
								{
									//Get each value in the map
									System.out.println(entry.getKey() + ": " + entry.getValue());
								}
							}
							
							//Get the Message
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				//Check if the request returned an exception
				else if(actionHandler instanceof APIException)
				{
					//Get the received APIException instance
					APIException exception = (APIException) actionHandler;
					
					//Get the Status
					System.out.println("Status: " + exception.getStatus().getValue());
					
					//Get the Code
					System.out.println("Code: " + exception.getCode().getValue());
					
					System.out.println("Details: " );
					
					//Get the details map
					for(Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						//Get each value in the map
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					
					//Get the Message
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{//If response is not as expected
				
				//Get model object from response
				Model responseObject = response.getModel();
				
				//Get the response object's class
				Class<? extends Model> clas = responseObject.getClass();
				
				//Get all declared fields of the response class
				Field[] fields = clas.getDeclaredFields();
				
				for(Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
}
