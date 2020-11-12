package samples.src.com.zoho.crm.api.relatedrecords;

import java.io.File;

import java.io.FileOutputStream;

import java.io.InputStream;

import java.io.OutputStream;

import java.time.OffsetDateTime;

import java.time.ZoneOffset;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Map;

import com.zoho.crm.api.HeaderMap;

import com.zoho.crm.api.ParameterMap;

import com.zoho.crm.api.attachments.Attachment;

import com.zoho.crm.api.layouts.Layout;

import com.zoho.crm.api.record.Comment;

import com.zoho.crm.api.record.Consent;

import com.zoho.crm.api.relatedrecords.FileBodyWrapper;

import com.zoho.crm.api.record.FileDetails;

import com.zoho.crm.api.record.Info;

import com.zoho.crm.api.record.InventoryLineItems;

import com.zoho.crm.api.record.LineItemProduct;

import com.zoho.crm.api.record.LineTax;

import com.zoho.crm.api.record.PricingDetails;

import com.zoho.crm.api.relatedrecords.APIException;

import com.zoho.crm.api.relatedrecords.ActionHandler;

import com.zoho.crm.api.relatedrecords.ActionResponse;

import com.zoho.crm.api.relatedrecords.ActionWrapper;

import com.zoho.crm.api.relatedrecords.BodyWrapper;

import com.zoho.crm.api.relatedrecords.RelatedRecordsOperations;

import com.zoho.crm.api.relatedrecords.RelatedRecordsOperations.DelinkRecordsParam;

import com.zoho.crm.api.relatedrecords.RelatedRecordsOperations.GetRelatedRecordHeader;

import com.zoho.crm.api.relatedrecords.RelatedRecordsOperations.GetRelatedRecordsHeader;

import com.zoho.crm.api.relatedrecords.RelatedRecordsOperations.GetRelatedRecordsParam;

import com.zoho.crm.api.relatedrecords.ResponseHandler;

import com.zoho.crm.api.relatedrecords.ResponseWrapper;

import com.zoho.crm.api.relatedrecords.SuccessResponse;

import com.zoho.crm.api.tags.Tag;

import com.zoho.crm.api.users.User;

import com.zoho.crm.api.util.APIResponse;

import com.zoho.crm.api.util.Choice;

import com.zoho.crm.api.util.Model;

import com.zoho.crm.api.util.StreamWrapper;

public class RelatedRecords
{
	/**
	 * <h3> Get Related Records </h3>
	 * This method is used to get the related list records and print the response.
	 * @param moduleAPIName - The API Name of the module to get related records.
	 * @param recordId - The ID of the record to be obtained.
	 * @param relatedListAPIName - The API name of the related list. To get the API name of the related list.
	 * @throws Exception
	 */
	public static void getRelatedRecords(String moduleAPIName, Long recordId, String relatedListAPIName) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002l;
		//String relatedListAPIName = "Products";
		
		//Get instance of RelatedRecordsOperations Class that takes relatedListAPIName, recordId and moduleAPIName as parameter
		RelatedRecordsOperations relatedRecordsOperations = new RelatedRecordsOperations(relatedListAPIName, recordId, moduleAPIName);
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		paramInstance.add(GetRelatedRecordsParam.PAGE, 1);
		
		paramInstance.add(GetRelatedRecordsParam.PER_PAGE, 2);
		
		//Get instance of HeaderMap Class
		HeaderMap headerInstance = new HeaderMap();
		
		OffsetDateTime startdatetime = OffsetDateTime.of(2019, 06, 01, 10, 00, 01, 00, ZoneOffset.of("+05:30"));
		
		headerInstance.add(GetRelatedRecordsHeader.IF_MODIFIED_SINCE, startdatetime);
		
		//Call getRelatedRecords method that takes paramInstance, headerInstance as parameter
		APIResponse<ResponseHandler> response = relatedRecordsOperations.getRelatedRecords(paramInstance, headerInstance);
		
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
					
					//Get the obtained Record instance
					List<com.zoho.crm.api.record.Record> records = responseWrapper.getData();
					
					for(com.zoho.crm.api.record.Record record : records)
					{					
						//Get the ID of each Record
						System.out.println("RelatedRecord ID: " + record.getId());
						
						//Get the createdBy User instance of each Record
						com.zoho.crm.api.users.User createdBy = record.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the ID of the createdBy User
							System.out.println("RelatedRecord Created By User-ID: " + createdBy.getId());
							
							//Get the name of the createdBy User
							System.out.println("RelatedRecord Created By User-Name: " + createdBy.getName());
							
							//Get the Email of the createdBy User
							System.out.println("RelatedRecord Created By User-Email: " + createdBy.getEmail());
						}
						
						//Get the CreatedTime of each Record
						System.out.println("RelatedRecord CreatedTime: " + record.getCreatedTime());
						
						//Get the modifiedBy User instance of each Record
						com.zoho.crm.api.users.User modifiedBy = record.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the ID of the modifiedBy User
							System.out.println("RelatedRecord Modified By User-ID: " + modifiedBy.getId());
							
							//Get the name of the modifiedBy User
							System.out.println("RelatedRecord Modified By User-Name: " + modifiedBy.getName());
							
							//Get the Email of the modifiedBy User
							System.out.println("RelatedRecord Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the ModifiedTime of each Record
						System.out.println("RelatedRecord ModifiedTime: " + record.getModifiedTime());
						
						//Get the list of Tag instance each Record
						List<Tag> tags = record.getTag();
						
						//Check if tags is not null
						if(tags != null)
						{
							for(Tag tag : tags)
							{
								//Get the Name of each Tag
								System.out.println("RelatedRecord Tag Name: " + tag.getName());
								
								//Get the Id of each Tag
								System.out.println("RelatedRecord Tag ID: " + tag.getId());
							}
						}
						
						//To get particular field value 
						System.out.println("RelatedRecord Field Value: " + record.getKeyValue("Last_Name"));// FieldApiName
						
						System.out.println("RelatedRecord KeyValues: " );
						
						//Get the KeyValue map
						for(Map.Entry<String, Object> entry : record.getKeyValues().entrySet())
						{
							String keyName = entry.getKey();
							
							Object value = entry.getValue();
							
							if(value instanceof List)
							{
								List<?> dataList = (List<?>) value;
								
								if(dataList.size() > 0)
								{
									if(dataList.get(0) instanceof FileDetails)
									{
										@SuppressWarnings("unchecked")
										List<FileDetails> fileDetails = (List<FileDetails>) value;
										
										for(FileDetails fileDetail : fileDetails)
										{
											//Get the Extn of each FileDetails
											System.out.println("RelatedRecord FileDetails Extn: " + fileDetail.getExtn());
											
											//Get the IsPreviewAvailable of each FileDetails
											System.out.println("RelatedRecord FileDetails IsPreviewAvailable: " + fileDetail.getIsPreviewAvailable());
											
											//Get the DownloadUrl of each FileDetails
											System.out.println("RelatedRecord FileDetails DownloadUrl: " + fileDetail.getDownloadUrl());
											
											//Get the DeleteUrl of each FileDetails
											System.out.println("RelatedRecord FileDetails DeleteUrl: " + fileDetail.getDeleteUrl());
											
											//Get the EntityId of each FileDetails
											System.out.println("RelatedRecord FileDetails EntityId: " + fileDetail.getEntityId());
											
											//Get the Mode of each FileDetails
											System.out.println("RelatedRecord FileDetails Mode: " + fileDetail.getMode());
											
											//Get the OriginalSizeByte of each FileDetails
											System.out.println("RelatedRecord FileDetails OriginalSizeByte: " + fileDetail.getOriginalSizeByte());
											
											//Get the PreviewUrl of each FileDetails
											System.out.println("RelatedRecord FileDetails PreviewUrl: " + fileDetail.getPreviewUrl());
											
											//Get the FileName of each FileDetails
											System.out.println("RelatedRecord FileDetails FileName: " + fileDetail.getFileName());
											
											//Get the FileId of each FileDetails
											System.out.println("RelatedRecord FileDetails FileId: " + fileDetail.getFileId());
											
											//Get the AttachmentId of each FileDetails
											System.out.println("RelatedRecord FileDetails AttachmentId: " + fileDetail.getAttachmentId());
											
											//Get the FileSize of each FileDetails
											System.out.println("RelatedRecord FileDetails FileSize: " + fileDetail.getFileSize());
											
											//Get the CreatorId of each FileDetails
											System.out.println("RelatedRecord FileDetails CreatorId: " + fileDetail.getCreatorId());
											
											//Get the LinkDocs of each FileDetails
											System.out.println("RelatedRecord FileDetails LinkDocs: " + fileDetail.getLinkDocs());
										}
									}
									else if(dataList.get(0) instanceof InventoryLineItems)
									{
										@SuppressWarnings("unchecked")
										List<InventoryLineItems> productDetails = (List<InventoryLineItems>) value;
										
										for(InventoryLineItems productDetail : productDetails)
										{
											LineItemProduct lineItemProduct = productDetail.getProduct();
											
											if(lineItemProduct != null)
											{
												System.out.println("RelatedRecord ProductDetails LineItemProduct ProductCode: " + lineItemProduct.getProductCode());
												
												System.out.println("RelatedRecord ProductDetails LineItemProduct Currency: " + lineItemProduct.getCurrency());
												
												System.out.println("RelatedRecord ProductDetails LineItemProduct Name: " + lineItemProduct.getName());
												
												System.out.println("RelatedRecord ProductDetails LineItemProduct Id: " + lineItemProduct.getId());
											}
											
											System.out.println("RelatedRecord ProductDetails Quantity: " + productDetail.getQuantity().toString());
											
											System.out.println("RelatedRecord ProductDetails Discount: " + productDetail.getDiscount());
											
											System.out.println("RelatedRecord ProductDetails TotalAfterDiscount: " + productDetail.getTotalAfterDiscount().toString());
											
											System.out.println("RelatedRecord ProductDetails NetTotal: " + productDetail.getNetTotal().toString());
											
											if(productDetail.getBook() != null)
											{
												System.out.println("RelatedRecord ProductDetails Book: " + productDetail.getBook().toString());
											}
											
											System.out.println("RelatedRecord ProductDetails Tax: " + productDetail.getTax().toString());
											
											System.out.println("RelatedRecord ProductDetails ListPrice: " + productDetail.getListPrice().toString());
											
											System.out.println("RelatedRecord ProductDetails UnitPrice: " + productDetail.getUnitPrice().toString());
											
											System.out.println("RelatedRecord ProductDetails QuantityInStock: " + productDetail.getQuantityInStock().toString());
											
											System.out.println("RelatedRecord ProductDetails Total: " + productDetail.getTotal().toString());
											
											System.out.println("RelatedRecord ProductDetails ID: " + productDetail.getId());
											
											System.out.println("RelatedRecord ProductDetails ProductDescription: " + productDetail.getProductDescription());
											
											List<LineTax> lineTaxes = productDetail.getLineTax();
											
											for(LineTax lineTax : lineTaxes)
											{
												System.out.println("RelatedRecord ProductDetails LineTax Percentage: " + lineTax.getPercentage().toString());
												
												System.out.println("RelatedRecord ProductDetails LineTax Name: " + lineTax.getName());
												
												System.out.println("RelatedRecord ProductDetails LineTax Id: " + lineTax.getId());
												
												System.out.println("RelatedRecord ProductDetails LineTax Value: " + lineTax.getValue().toString());
											}
										}
									}
									else if(dataList.get(0) instanceof Tag)
									{
										@SuppressWarnings("unchecked")
										List<Tag> tagList = (List<Tag>) value;
										
										for(Tag tag : tagList)
										{
											//Get the Name of each Tag
											System.out.println("RelatedRecord Tag Name: " + tag.getName());
											
											//Get the Id of each Tag
											System.out.println("RelatedRecord Tag ID: " + tag.getId());
										}
									}
									else if(dataList.get(0) instanceof PricingDetails)
									{
										@SuppressWarnings("unchecked")
										List<PricingDetails> pricingDetails = (List<PricingDetails>) value;
										
										for(PricingDetails pricingDetail : pricingDetails)
										{
											System.out.println("RelatedRecord PricingDetails ToRange: " + pricingDetail.getToRange().toString());
											
											System.out.println("RelatedRecord PricingDetails Discount: " + pricingDetail.getDiscount().toString());
											
											System.out.println("RelatedRecord PricingDetails ID: " + pricingDetail.getId());
											
											System.out.println("RelatedRecord PricingDetails FromRange: " + pricingDetail.getFromRange().toString());
										}
									}
									else if(dataList.get(0) instanceof com.zoho.crm.api.record.Record)
									{
										@SuppressWarnings("unchecked")
										List<com.zoho.crm.api.record.Record> recordList = (List<com.zoho.crm.api.record.Record>) dataList;
										
										for(com.zoho.crm.api.record.Record record1 : recordList)
										{
											//Get the details map
											for(Map.Entry<String, Object> entry1 : record1.getKeyValues().entrySet())
											{
												//Get each value in the map
												System.out.println(entry1.getKey() + ": " + entry1.getValue());
											}
										}
									}
									else if(dataList.get(0) instanceof LineTax)
									{
										@SuppressWarnings("unchecked")
										List<LineTax> lineTaxes = (List<LineTax>) dataList;
										
										for(LineTax lineTax : lineTaxes)
										{
											System.out.println("RelatedRecord ProductDetails LineTax Percentage: " + lineTax.getPercentage().toString());
											
											System.out.println("RelatedRecord ProductDetails LineTax Name: " + lineTax.getName());
											
											System.out.println("RelatedRecord ProductDetails LineTax Id: " + lineTax.getId());
											
											System.out.println("RelatedRecord ProductDetails LineTax Value: " + lineTax.getValue().toString());
										}
									}
									else if(dataList.get(0) instanceof Choice)
									{
										@SuppressWarnings({ "unchecked", "rawtypes" })
										List<Choice> choice = (List<Choice>) dataList;
										
										for(@SuppressWarnings("rawtypes") Choice choiceValue : choice)
										{
											System.out.println("RelatedRecord " + keyName + " : " + choiceValue.getValue());
										}
									}
									else if(dataList.get(0) instanceof Comment)
									{
										@SuppressWarnings("unchecked")
										List<Comment> comments = (List<Comment>) dataList;
										
										for(Comment comment : comments)
										{
											System.out.println("Record Comment CommentedBy: " + comment.getCommentedBy());
											
											System.out.println("Record Comment CommentedTime: " + comment.getCommentedTime().toString());
											
											System.out.println("Record Comment CommentContent: " + comment.getCommentContent());
											
											System.out.println("Record Comment Id: " + comment.getId());
										}
									}
									else if(dataList.get(0) instanceof Attachment)
									{
										//Get the list of obtained Attachment instances
										@SuppressWarnings("unchecked")
										List<com.zoho.crm.api.attachments.Attachment> attachments = (List<Attachment>) dataList;;
									
										for(com.zoho.crm.api.attachments.Attachment attachment : attachments)
										{
											//Get the owner User instance of each attachment
											com.zoho.crm.api.users.User owner = attachment.getOwner();
											
											//Check if owner is not null
											if(owner != null)
											{
												//Get the Name of the Owner
												System.out.println("Record Attachment Owner User-Name: " + owner.getName());
												
												//Get the ID of the Owner
												System.out.println("Record Attachment Owner User-ID: " + owner.getId());
												
												//Get the Email of the Owner
												System.out.println("Record Attachment Owner User-Email: " + owner.getEmail());
											}
											
											//Get the modified time of each attachment
											System.out.println("Record Attachment Modified Time: " + attachment.getModifiedTime().toString());
											
											//Get the name of the File
											System.out.println("Record Attachment File Name: " + attachment.getFileName());
											
											//Get the created time of each attachment
											System.out.println("Record Attachment Created Time: " + attachment.getCreatedTime().toString());
											
											//Get the Attachment file size
											System.out.println("Record Attachment File Size: " + attachment.getSize().toString());
											
											//Get the parentId Record instance of each attachment
											com.zoho.crm.api.record.Record parentId = attachment.getParentId();
											
											//Check if parentId is not null
											if(parentId != null)
											{	
												//Get the parent record Name of each attachment
												System.out.println("Record Attachment parent record Name: " + parentId.getKeyValue("name"));
												
												//Get the parent record ID of each attachment
												System.out.println("Record Attachment parent record ID: " + parentId.getId());
											}
											
											//Get the attachment is Editable
											System.out.println("Record Attachment is Editable: " + attachment.getEditable().toString());
											
											//Get the file ID of each attachment
											System.out.println("Record Attachment File ID: " + attachment.getFileId());
											
											//Get the type of each attachment
											System.out.println("Record Attachment File Type: " + attachment.getType());
											
											//Get the seModule of each attachment
											System.out.println("Record Attachment seModule: " + attachment.getSeModule());
											
											//Get the modifiedBy User instance of each attachment
											modifiedBy = attachment.getModifiedBy();
											
											//Check if modifiedBy is not null
											if(modifiedBy != null)
											{
												//Get the Name of the modifiedBy User
												System.out.println("Record Attachment Modified By User-Name: " + modifiedBy.getName());
												
												//Get the ID of the modifiedBy User
												System.out.println("Record Attachment Modified By User-ID: " + modifiedBy.getId());
												
												//Get the Email of the modifiedBy User
												System.out.println("Record Attachment Modified By User-Email: " + modifiedBy.getEmail());
											}
											
											//Get the state of each attachment
											System.out.println("Record Attachment State: " + attachment.getState());
											
											//Get the ID of each attachment
											System.out.println("Record Attachment ID: " + attachment.getId());
											
											//Get the createdBy User instance of each attachment
											createdBy = attachment.getCreatedBy();
											
											//Check if createdBy is not null
											if(createdBy != null)
											{
												//Get the name of the createdBy User
												System.out.println("Record Attachment Created By User-Name: " + createdBy.getName());
												
												//Get the ID of the createdBy User
												System.out.println("Record Attachment Created By User-ID: " + createdBy.getId());
												
												//Get the Email of the createdBy User
												System.out.println("Record Attachment Created By User-Email: " + createdBy.getEmail());
											}
											
											//Get the linkUrl of each attachment
											System.out.println("Record Attachment LinkUrl: " + attachment.getLinkUrl());
										}
									}
									else
									{
										System.out.println(keyName + ": " + value);
									}
								}
							}
							else if(value instanceof Layout)
							{
								com.zoho.crm.api.layouts.Layout layout = (Layout) value;
								
								if(layout != null)
								{
									System.out.println("RelatedRecord " + keyName + " ID: " + layout.getId());
									
									System.out.println("RelatedRecord " + keyName + " Name: " + layout.getName());
								}
							}
							else if(value instanceof User)
							{
								com.zoho.crm.api.users.User user = (User) value;
								
								if(user != null)
								{
									System.out.println("RelatedRecord " + keyName + " User-ID: " + user.getId());
									
									System.out.println("RelatedRecord " + keyName + " User-Name: " + user.getName());
									
									System.out.println("RelatedRecord " + keyName + " User-Email: " + user.getEmail());
								}
							}
							else if( value instanceof com.zoho.crm.api.record.Record)
							{
								com.zoho.crm.api.record.Record recordValue = (com.zoho.crm.api.record.Record) value;
								
								System.out.println("RelatedRecord " + keyName + " ID: " + recordValue.getId());
								
								System.out.println("RelatedRecord " + keyName + " Name: " + recordValue.getKeyValue("name"));
							}
							else if(value instanceof Choice)
							{
								@SuppressWarnings("rawtypes")
								Choice choiceValue = (Choice) value;
								
								System.out.println("RelatedRecord " + keyName + " : " + choiceValue.getValue());
							}
							else if(value instanceof Consent)
							{
								Consent consent = (Consent)value;
								
								System.out.println("Record Consent ID: " + consent.getId());

                                //Get the Owner User instance of each attachment
                                User owner = consent.getOwner();
                                
                                //Check if owner is not null
                                if(owner != null)
                                {
                                    //Get the name of the owner User
                                    System.out.println("Record Consent Owner Name: " + owner.getName());
                                    
                                    //Get the ID of the owner User
                                    System.out.println("Record Consent Owner ID: " + owner.getId());
                                    
                                    //Get the Email of the owner User
                                    System.out.println("Record Consent Owner Email: " + owner.getEmail());
                                }

                                User consentCreatedBy = consent.getCreatedBy();
                                
                                //Check if createdBy is not null
                                if(consentCreatedBy != null)
                                {
                                    //Get the name of the CreatedBy User
                                    System.out.println("Record Consent CreatedBy Name: " + consentCreatedBy.getName());
                                    
                                    //Get the ID of the CreatedBy User
                                    System.out.println("Record Consent CreatedBy ID: " + consentCreatedBy.getId());
                                    
                                    //Get the Email of the CreatedBy User
                                    System.out.println("Record Consent CreatedBy Email: " + consentCreatedBy.getEmail());
                                }
                                
                                User consentModifiedBy = consent.getModifiedBy();
                                
                                //Check if createdBy is not null
                                if(consentModifiedBy != null)
                                {
                                    //Get the name of the ModifiedBy User
                                    System.out.println("Record Consent ModifiedBy Name: " + consentModifiedBy.getName());
                                    
                                    //Get the ID of the ModifiedBy User
                                    System.out.println("Record Consent ModifiedBy ID: " + consentModifiedBy.getId());
                                    
                                    //Get the Email of the ModifiedBy User
                                    System.out.println("Record Consent ModifiedBy Email: " + consentModifiedBy.getEmail());
                                }
                                
                                System.out.println("Record Consent CreatedTime: " + consent.getCreatedTime());
                                
                                System.out.println("Record Consent ModifiedTime: " + consent.getModifiedTime());

                                System.out.println("Record Consent ContactThroughEmail: " + consent.getContactThroughEmail());
                                
                                System.out.println("Record Consent ContactThroughSocial: " + consent.getContactThroughSocial());
                                
                                System.out.println("Record Consent ContactThroughSurvey: " + consent.getContactThroughSurvey());
                                
                                System.out.println("Record Consent ContactThroughPhone: " + consent.getContactThroughPhone());

                                System.out.println("Record Consent MailSentTime: " + consent.getMailSentTime().toString());

                                System.out.println("Record Consent ConsentDate: " + consent.getConsentDate().toString());

                                System.out.println("Record Consent ConsentRemarks: " + consent.getConsentRemarks());

                                System.out.println("Record Consent ConsentThrough: " + consent.getConsentThrough());

                                System.out.println("Record Consent DataProcessingBasis: " + consent.getDataProcessingBasis());

                                //To get custom values
                                System.out.println("Record Consent Lawful Reason: " + consent.getKeyValue("Lawful_Reason"));
							}
							else
							{
								//Get each value in the map
								System.out.println(keyName + ": " + value);
							}
						}
					}
					
					//Get the Object obtained Info instance
					Info info = responseWrapper.getInfo();
					
					//Check if info is not null
					if(info != null)
					{
						if(info.getPerPage() != null)
						{
							//Get the PerPage of the Info
							System.out.println("RelatedRecord Info PerPage: " + info.getPerPage().toString());
						}
						
						if(info.getCount() != null)
						{
							//Get the Count of the Info
							System.out.println("RelatedRecord Info Count: " + info.getCount().toString());
						}
	
						if(info.getPage() != null)
						{
							//Get the Page of the Info
							System.out.println("RelatedRecord Info Page: " + info.getPage().toString());
						}
						
						if(info.getMoreRecords() != null)
						{
							//Get the MoreRecords of the Info
							System.out.println("RelatedRecord Info MoreRecords: " + info.getMoreRecords().toString());
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
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}

	/**
	 * <h3> Update Related Records </h3>
	 * This method is used to update the relation between the records and print the response.
	 * @param moduleAPIName - The API Name of the module to update related records.
	 * @param recordId - The ID of the record to be obtained.
	 * @param relatedListAPIName - The API name of the related list. To get the API name of the related list.
	 * @throws Exception
	 */
	public static void updateRelatedRecords(String moduleAPIName, Long recordId, String relatedListAPIName) throws Exception
	{
		//API Name of the module 
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002l;
		//String relatedListAPIName = "Products";
		
		//Get instance of RelatedRecordsOperations Class that takes relatedListAPIName, recordId and moduleAPIName as parameter
		RelatedRecordsOperations relatedRecordsOperations = new RelatedRecordsOperations(relatedListAPIName, recordId, moduleAPIName);
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Record instances
		List<com.zoho.crm.api.record.Record> records = new ArrayList<com.zoho.crm.api.record.Record>();
		
		//Get instance of Record Class
		com.zoho.crm.api.record.Record record1 = new com.zoho.crm.api.record.Record();
		
		/*
		 * Call addKeyValue method that takes two arguments
		 * 1 -> A string that is the Field's API Name
		 * 2 -> Value
		 */
		record1.addKeyValue("id", 3477061000007246019l);
		
		record1.addKeyValue("list_price", 50.56);
		
		//Add Record instance to the list
		records.add(record1);
		
		//Get instance of Record Class
		com.zoho.crm.api.record.Record record2 = new com.zoho.crm.api.record.Record();
		
		/*
		 * Call addKeyValue method that takes two arguments
		 * 1 -> A string that is the Field's API Name
		 * 2 -> Value
		 */
		record2.addKeyValue("id", 3477061000007246019l) ;
		
		record2.addKeyValue("list_price", 50.56);
		
		//Add Record instance to the list
		records.add(record2);
		
		//Set the list to Records in BodyWrapper instance
		request.setData(records);
	
		//Call updateRelatedRecords method that takes BodyWrapper instance as parameter.
		APIResponse<ActionHandler> response = relatedRecordsOperations.updateRelatedRecords(request);
		
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
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Delink Records </h3>
	 * This method is used to delete the association between modules and print the response.
	 * @param moduleAPIName - The API Name of the module to delink related records.
	 * @param recordId - The ID of the record
	 * @param relatedListAPIName - The API name of the related list. To get the API name of the related list.
	 * @param relatedListIds - The List of related record IDs.
	 * @throws Exception
	 */
	public static void delinkRecords(String moduleAPIName, Long recordId, String relatedListAPIName, List<Long> relatedListIds) throws Exception
	{
		//API Name of the module 
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002l;
		//String relatedListAPIName = "Products";
		//List<Long> relatedListIds = new ArrayList<Long>(Arrays.asList(3477061000005919001l, 3477061000005917011l));
		
		//Get instance of RelatedRecordsOperations Class that takes relatedListAPIName, recordId and moduleAPIName as parameter
		RelatedRecordsOperations relatedRecordsOperations = new RelatedRecordsOperations(relatedListAPIName, recordId, moduleAPIName);
		
		//Get instance of ParameterMap Class
		ParameterMap paramInstance = new ParameterMap();
		
		for(Long relatedListId : relatedListIds)
		{
			paramInstance.add(DelinkRecordsParam.IDS, relatedListId);
		}
		
		//Call delinkRecords method that takes paramInstance instance as parameter.
		APIResponse<ActionHandler> response = relatedRecordsOperations.delinkRecords(paramInstance);
		
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
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}

	/**
	 * <h3> Get Related Record </h3>
	 * This method is used to get the single related list record and print the response.
	 * @param moduleAPIName - The API Name of the module to get related record.
	 * @param recordId - The ID of the record to be get Related List.
	 * @param relatedListAPIName - The API name of the related list. To get the API name of the related list.
	 * @param relatedListId - The ID of the related record.
	 * @param destinationFolder - The absolute path of the destination folder to store the file.
	 * @throws Exception
	 */
	public static void getRelatedRecord(String moduleAPIName, Long recordId, String relatedListAPIName, Long relatedListId, String destinationFolder) throws Exception
	{
		//example
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002l;
		//String relatedListAPIName = "Products";
		//Long relatedListId = 3477061000004994115l;
		//String destinationFolder = "/Users/user_name/Desktop";
		
		//Get instance of RelatedRecordsOperations Class that takes relatedListAPIName, recordId and moduleAPIName as parameter
    	RelatedRecordsOperations relatedRecordsOperations = new RelatedRecordsOperations(relatedListAPIName, recordId, moduleAPIName);
		
		HeaderMap headerInstance = new HeaderMap();
		
		OffsetDateTime startdatetime = OffsetDateTime.of(2019, 06, 01, 10, 00, 01, 00, ZoneOffset.of("+05:30"));
		
		headerInstance.add(GetRelatedRecordHeader.IF_MODIFIED_SINCE, startdatetime);
		
		//Call getRelatedRecord method that takes relatedRecordId and headerInstance as parameter
		APIResponse<ResponseHandler> response = relatedRecordsOperations.getRelatedRecord(relatedListId, headerInstance);
		
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
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					
					//Get the obtained Record instance
					List<com.zoho.crm.api.record.Record> records = responseWrapper.getData();
					
					for(com.zoho.crm.api.record.Record record : records)
					{					
						//Get the ID of each Record
						System.out.println("RelatedRecord ID: " + record.getId());
						
						//Get the createdBy User instance of each Record
						com.zoho.crm.api.users.User createdBy = record.getCreatedBy();
						
						//Check if createdBy is not null
						if(createdBy != null)
						{
							//Get the ID of the createdBy User
							System.out.println("RelatedRecord Created By User-ID: " + createdBy.getId());
							
							//Get the name of the createdBy User
							System.out.println("RelatedRecord Created By User-Name: " + createdBy.getName());
							
							//Get the Email of the createdBy User
							System.out.println("RelatedRecord Created By User-Email: " + createdBy.getEmail());
						}
						
						//Get the CreatedTime of each Record
						System.out.println("RelatedRecord CreatedTime: " + record.getCreatedTime());
						
						//Get the modifiedBy User instance of each Record
						com.zoho.crm.api.users.User modifiedBy = record.getModifiedBy();
						
						//Check if modifiedBy is not null
						if(modifiedBy != null)
						{
							//Get the ID of the modifiedBy User
							System.out.println("RelatedRecord Modified By User-ID: " + modifiedBy.getId());
							
							//Get the name of the modifiedBy User
							System.out.println("RelatedRecord Modified By User-Name: " + modifiedBy.getName());
							
							//Get the Email of the modifiedBy User
							System.out.println("RelatedRecord Modified By User-Email: " + modifiedBy.getEmail());
						}
						
						//Get the ModifiedTime of each Record
						System.out.println("RelatedRecord ModifiedTime: " + record.getModifiedTime());
						
						//Get the list of Tag instance each Record
						List<Tag> tags = record.getTag();
						
						//Check if tags is not null
						if(tags != null)
						{
							for(Tag tag : tags)
							{
								//Get the Name of each Tag
								System.out.println("RelatedRecord Tag Name: " + tag.getName());
								
								//Get the Id of each Tag
								System.out.println("RelatedRecord Tag ID: " + tag.getId());
							}
						}
						
						//To get particular field value 
						System.out.println("RelatedRecord Field Value: " + record.getKeyValue("Last_Name"));// FieldApiName
						
						System.out.println("RelatedRecord KeyValues: " );
						
						//Get the KeyValue map
						for(Map.Entry<String, Object> entry : record.getKeyValues().entrySet())
						{
							String keyName = entry.getKey();
							
							Object value = entry.getValue();
							
							if(value instanceof List)
							{
								List<?> dataList = (List<?>) value;
								
								if(dataList.size() > 0)
								{
									if(dataList.get(0) instanceof FileDetails)
									{
										@SuppressWarnings("unchecked")
										List<FileDetails> fileDetails = (List<FileDetails>) value;
										
										for(FileDetails fileDetail : fileDetails)
										{
											//Get the Extn of each FileDetails
											System.out.println("RelatedRecord FileDetails Extn: " + fileDetail.getExtn());
											
											//Get the IsPreviewAvailable of each FileDetails
											System.out.println("RelatedRecord FileDetails IsPreviewAvailable: " + fileDetail.getIsPreviewAvailable());
											
											//Get the DownloadUrl of each FileDetails
											System.out.println("RelatedRecord FileDetails DownloadUrl: " + fileDetail.getDownloadUrl());
											
											//Get the DeleteUrl of each FileDetails
											System.out.println("RelatedRecord FileDetails DeleteUrl: " + fileDetail.getDeleteUrl());
											
											//Get the EntityId of each FileDetails
											System.out.println("RelatedRecord FileDetails EntityId: " + fileDetail.getEntityId());
											
											//Get the Mode of each FileDetails
											System.out.println("RelatedRecord FileDetails Mode: " + fileDetail.getMode());
											
											//Get the OriginalSizeByte of each FileDetails
											System.out.println("RelatedRecord FileDetails OriginalSizeByte: " + fileDetail.getOriginalSizeByte());
											
											//Get the PreviewUrl of each FileDetails
											System.out.println("RelatedRecord FileDetails PreviewUrl: " + fileDetail.getPreviewUrl());
											
											//Get the FileName of each FileDetails
											System.out.println("RelatedRecord FileDetails FileName: " + fileDetail.getFileName());
											
											//Get the FileId of each FileDetails
											System.out.println("RelatedRecord FileDetails FileId: " + fileDetail.getFileId());
											
											//Get the AttachmentId of each FileDetails
											System.out.println("RelatedRecord FileDetails AttachmentId: " + fileDetail.getAttachmentId());
											
											//Get the FileSize of each FileDetails
											System.out.println("RelatedRecord FileDetails FileSize: " + fileDetail.getFileSize());
											
											//Get the CreatorId of each FileDetails
											System.out.println("RelatedRecord FileDetails CreatorId: " + fileDetail.getCreatorId());
											
											//Get the LinkDocs of each FileDetails
											System.out.println("RelatedRecord FileDetails LinkDocs: " + fileDetail.getLinkDocs());
										}
									}
									else if(dataList.get(0) instanceof InventoryLineItems)
									{
										@SuppressWarnings("unchecked")
										List<InventoryLineItems> productDetails = (List<InventoryLineItems>) value;
										
										for(InventoryLineItems productDetail : productDetails)
										{
											LineItemProduct lineItemProduct = productDetail.getProduct();
											
											if(lineItemProduct != null)
											{
												System.out.println("RelatedRecord ProductDetails LineItemProduct ProductCode: " + lineItemProduct.getProductCode());
												
												System.out.println("RelatedRecord ProductDetails LineItemProduct Currency: " + lineItemProduct.getCurrency());
												
												System.out.println("RelatedRecord ProductDetails LineItemProduct Name: " + lineItemProduct.getName());
												
												System.out.println("RelatedRecord ProductDetails LineItemProduct Id: " + lineItemProduct.getId());
											}
											
											System.out.println("RelatedRecord ProductDetails Quantity: " + productDetail.getQuantity().toString());
											
											System.out.println("RelatedRecord ProductDetails Discount: " + productDetail.getDiscount());
											
											System.out.println("RelatedRecord ProductDetails TotalAfterDiscount: " + productDetail.getTotalAfterDiscount().toString());
											
											System.out.println("RelatedRecord ProductDetails NetTotal: " + productDetail.getNetTotal().toString());
											
											if(productDetail.getBook() != null)
											{
												System.out.println("RelatedRecord ProductDetails Book: " + productDetail.getBook().toString());
											}
											
											System.out.println("RelatedRecord ProductDetails Tax: " + productDetail.getTax().toString());
											
											System.out.println("RelatedRecord ProductDetails ListPrice: " + productDetail.getListPrice().toString());
											
											System.out.println("RelatedRecord ProductDetails UnitPrice: " + productDetail.getUnitPrice().toString());
											
											System.out.println("RelatedRecord ProductDetails QuantityInStock: " + productDetail.getQuantityInStock().toString());
											
											System.out.println("RelatedRecord ProductDetails Total: " + productDetail.getTotal().toString());
											
											System.out.println("RelatedRecord ProductDetails ID: " + productDetail.getId());
											
											System.out.println("RelatedRecord ProductDetails ProductDescription: " + productDetail.getProductDescription());
											
											List<LineTax> lineTaxes = productDetail.getLineTax();
											
											for(LineTax lineTax : lineTaxes)
											{
												System.out.println("RelatedRecord ProductDetails LineTax Percentage: " + lineTax.getPercentage().toString());
												
												System.out.println("RelatedRecord ProductDetails LineTax Name: " + lineTax.getName());
												
												System.out.println("RelatedRecord ProductDetails LineTax Id: " + lineTax.getId());
												
												System.out.println("RelatedRecord ProductDetails LineTax Value: " + lineTax.getValue().toString());
											}
										}
									}
									else if(dataList.get(0) instanceof Tag)
									{
										@SuppressWarnings("unchecked")
										List<Tag> tagList = (List<Tag>) value;
										
										for(Tag tag : tagList)
										{
											//Get the Name of each Tag
											System.out.println("RelatedRecord Tag Name: " + tag.getName());
											
											//Get the Id of each Tag
											System.out.println("RelatedRecord Tag ID: " + tag.getId());
										}
									}
									else if(dataList.get(0) instanceof PricingDetails)
									{
										@SuppressWarnings("unchecked")
										List<PricingDetails> pricingDetails = (List<PricingDetails>) value;
										
										for(PricingDetails pricingDetail : pricingDetails)
										{
											System.out.println("RelatedRecord PricingDetails ToRange: " + pricingDetail.getToRange().toString());
											
											System.out.println("RelatedRecord PricingDetails Discount: " + pricingDetail.getDiscount().toString());
											
											System.out.println("RelatedRecord PricingDetails ID: " + pricingDetail.getId());
											
											System.out.println("RelatedRecord PricingDetails FromRange: " + pricingDetail.getFromRange().toString());
										}
									}
									else if(dataList.get(0) instanceof com.zoho.crm.api.record.Record)
									{
										@SuppressWarnings("unchecked")
										List<com.zoho.crm.api.record.Record> recordList = (List<com.zoho.crm.api.record.Record>) dataList;
										
										for(com.zoho.crm.api.record.Record record1 : recordList)
										{
											//Get the details map
											for(Map.Entry<String, Object> entry1 : record1.getKeyValues().entrySet())
											{
												//Get each value in the map
												System.out.println(entry1.getKey() + ": " + entry1.getValue());
											}
										}
									}
									else if(dataList.get(0) instanceof LineTax)
									{
										@SuppressWarnings("unchecked")
										List<LineTax> lineTaxes = (List<LineTax>) dataList;
										
										for(LineTax lineTax : lineTaxes)
										{
											System.out.println("RelatedRecord ProductDetails LineTax Percentage: " + lineTax.getPercentage().toString());
											
											System.out.println("RelatedRecord ProductDetails LineTax Name: " + lineTax.getName());
											
											System.out.println("RelatedRecord ProductDetails LineTax Id: " + lineTax.getId());
											
											System.out.println("RelatedRecord ProductDetails LineTax Value: " + lineTax.getValue().toString());
										}
									}
									else if(dataList.get(0) instanceof Choice)
									{
										@SuppressWarnings({ "unchecked", "rawtypes" })
										List<Choice> choice = (List<Choice>) dataList;
										
										for(@SuppressWarnings("rawtypes") Choice choiceValue : choice)
										{
											System.out.println("RelatedRecord " + keyName + " : " + choiceValue.getValue());
										}
									}
									else if(dataList.get(0) instanceof Comment)
									{
										@SuppressWarnings("unchecked")
										List<Comment> comments = (List<Comment>) dataList;
										
										for(Comment comment : comments)
										{
											System.out.println("Record Comment CommentedBy: " + comment.getCommentedBy());
											
											System.out.println("Record Comment CommentedTime: " + comment.getCommentedTime().toString());
											
											System.out.println("Record Comment CommentContent: " + comment.getCommentContent());
											
											System.out.println("Record Comment Id: " + comment.getId());
										}
									}
									else if(dataList.get(0) instanceof Attachment)
									{
										//Get the list of obtained Attachment instances
										@SuppressWarnings("unchecked")
										List<com.zoho.crm.api.attachments.Attachment> attachments = (List<Attachment>) dataList;;
									
										for(com.zoho.crm.api.attachments.Attachment attachment : attachments)
										{
											//Get the owner User instance of each attachment
											com.zoho.crm.api.users.User owner = attachment.getOwner();
											
											//Check if owner is not null
											if(owner != null)
											{
												//Get the Name of the Owner
												System.out.println("Record Attachment Owner User-Name: " + owner.getName());
												
												//Get the ID of the Owner
												System.out.println("Record Attachment Owner User-ID: " + owner.getId());
												
												//Get the Email of the Owner
												System.out.println("Record Attachment Owner User-Email: " + owner.getEmail());
											}
											
											//Get the modified time of each attachment
											System.out.println("Record Attachment Modified Time: " + attachment.getModifiedTime().toString());
											
											//Get the name of the File
											System.out.println("Record Attachment File Name: " + attachment.getFileName());
											
											//Get the created time of each attachment
											System.out.println("Record Attachment Created Time: " + attachment.getCreatedTime().toString());
											
											//Get the Attachment file size
											System.out.println("Record Attachment File Size: " + attachment.getSize().toString());
											
											//Get the parentId Record instance of each attachment
											com.zoho.crm.api.record.Record parentId = attachment.getParentId();
											
											//Check if parentId is not null
											if(parentId != null)
											{	
												//Get the parent record Name of each attachment
												System.out.println("Record Attachment parent record Name: " + parentId.getKeyValue("name"));
												
												//Get the parent record ID of each attachment
												System.out.println("Record Attachment parent record ID: " + parentId.getId());
											}
											
											//Get the attachment is Editable
											System.out.println("Record Attachment is Editable: " + attachment.getEditable().toString());
											
											//Get the file ID of each attachment
											System.out.println("Record Attachment File ID: " + attachment.getFileId());
											
											//Get the type of each attachment
											System.out.println("Record Attachment File Type: " + attachment.getType());
											
											//Get the seModule of each attachment
											System.out.println("Record Attachment seModule: " + attachment.getSeModule());
											
											//Get the modifiedBy User instance of each attachment
											modifiedBy = attachment.getModifiedBy();
											
											//Check if modifiedBy is not null
											if(modifiedBy != null)
											{
												//Get the Name of the modifiedBy User
												System.out.println("Record Attachment Modified By User-Name: " + modifiedBy.getName());
												
												//Get the ID of the modifiedBy User
												System.out.println("Record Attachment Modified By User-ID: " + modifiedBy.getId());
												
												//Get the Email of the modifiedBy User
												System.out.println("Record Attachment Modified By User-Email: " + modifiedBy.getEmail());
											}
											
											//Get the state of each attachment
											System.out.println("Record Attachment State: " + attachment.getState());
											
											//Get the ID of each attachment
											System.out.println("Record Attachment ID: " + attachment.getId());
											
											//Get the createdBy User instance of each attachment
											createdBy = attachment.getCreatedBy();
											
											//Check if createdBy is not null
											if(createdBy != null)
											{
												//Get the name of the createdBy User
												System.out.println("Record Attachment Created By User-Name: " + createdBy.getName());
												
												//Get the ID of the createdBy User
												System.out.println("Record Attachment Created By User-ID: " + createdBy.getId());
												
												//Get the Email of the createdBy User
												System.out.println("Record Attachment Created By User-Email: " + createdBy.getEmail());
											}
											
											//Get the linkUrl of each attachment
											System.out.println("Record Attachment LinkUrl: " + attachment.getLinkUrl());
										}
									}
									else
									{
										System.out.println(keyName + ": " + value);
									}
								}
							}
							else if(value instanceof Layout)
							{
								com.zoho.crm.api.layouts.Layout layout = (Layout) value;
								
								if(layout != null)
								{
									System.out.println("RelatedRecord " + keyName + " ID: " + layout.getId());
									
									System.out.println("RelatedRecord " + keyName + " Name: " + layout.getName());
								}
							}
							else if(value instanceof User)
							{
								com.zoho.crm.api.users.User user = (User) value;
								
								if(user != null)
								{
									System.out.println("RelatedRecord " + keyName + " User-ID: " + user.getId());
									
									System.out.println("RelatedRecord " + keyName + " User-Name: " + user.getName());
									
									System.out.println("RelatedRecord " + keyName + " User-Email: " + user.getEmail());
								}
							}
							else if( value instanceof com.zoho.crm.api.record.Record)
							{
								com.zoho.crm.api.record.Record recordValue = (com.zoho.crm.api.record.Record) value;
								
								System.out.println("RelatedRecord " + keyName + " ID: " + recordValue.getId());
								
								System.out.println("RelatedRecord " + keyName + " Name: " + recordValue.getKeyValue("name"));
							}
							else if(value instanceof Choice)
							{
								@SuppressWarnings("rawtypes")
								Choice choiceValue = (Choice) value;
								
								System.out.println("RelatedRecord " + keyName + " : " + choiceValue.getValue());
							}
							else if(value instanceof Consent)
							{
								Consent consent = (Consent)value;
								
								System.out.println("Record Consent ID: " + consent.getId());

                                //Get the Owner User instance of each attachment
                                User owner = consent.getOwner();
                                
                                //Check if owner is not null
                                if(owner != null)
                                {
                                    //Get the name of the owner User
                                    System.out.println("Record Consent Owner Name: " + owner.getName());
                                    
                                    //Get the ID of the owner User
                                    System.out.println("Record Consent Owner ID: " + owner.getId());
                                    
                                    //Get the Email of the owner User
                                    System.out.println("Record Consent Owner Email: " + owner.getEmail());
                                }

                                User consentCreatedBy = consent.getCreatedBy();
                                
                                //Check if createdBy is not null
                                if(consentCreatedBy != null)
                                {
                                    //Get the name of the CreatedBy User
                                    System.out.println("Record Consent CreatedBy Name: " + consentCreatedBy.getName());
                                    
                                    //Get the ID of the CreatedBy User
                                    System.out.println("Record Consent CreatedBy ID: " + consentCreatedBy.getId());
                                    
                                    //Get the Email of the CreatedBy User
                                    System.out.println("Record Consent CreatedBy Email: " + consentCreatedBy.getEmail());
                                }
                                
                                User consentModifiedBy = consent.getModifiedBy();
                                
                                //Check if createdBy is not null
                                if(consentModifiedBy != null)
                                {
                                    //Get the name of the ModifiedBy User
                                    System.out.println("Record Consent ModifiedBy Name: " + consentModifiedBy.getName());
                                    
                                    //Get the ID of the ModifiedBy User
                                    System.out.println("Record Consent ModifiedBy ID: " + consentModifiedBy.getId());
                                    
                                    //Get the Email of the ModifiedBy User
                                    System.out.println("Record Consent ModifiedBy Email: " + consentModifiedBy.getEmail());
                                }
                                
                                System.out.println("Record Consent CreatedTime: " + consent.getCreatedTime());
                                
                                System.out.println("Record Consent ModifiedTime: " + consent.getModifiedTime());

                                System.out.println("Record Consent ContactThroughEmail: " + consent.getContactThroughEmail());
                                
                                System.out.println("Record Consent ContactThroughSocial: " + consent.getContactThroughSocial());
                                
                                System.out.println("Record Consent ContactThroughSurvey: " + consent.getContactThroughSurvey());
                                
                                System.out.println("Record Consent ContactThroughPhone: " + consent.getContactThroughPhone());

                                System.out.println("Record Consent MailSentTime: " + consent.getMailSentTime().toString());

                                System.out.println("Record Consent ConsentDate: " + consent.getConsentDate().toString());

                                System.out.println("Record Consent ConsentRemarks: " + consent.getConsentRemarks());

                                System.out.println("Record Consent ConsentThrough: " + consent.getConsentThrough());

                                System.out.println("Record Consent DataProcessingBasis: " + consent.getDataProcessingBasis());

                                //To get custom values
                                System.out.println("Record Consent Lawful Reason: " + consent.getKeyValue("Lawful_Reason"));
							}
							else
							{
								//Get each value in the map
								System.out.println(keyName + ": " + value);
							}
						}
					}
				}
				else if(responseHandler instanceof FileBodyWrapper)
				{
					//Get object from response
					FileBodyWrapper fileBodyWrapper = (FileBodyWrapper)responseHandler;
					
					//Get StreamWrapper instance from the returned FileBodyWrapper instance
					StreamWrapper streamWrapper = fileBodyWrapper.getFile();
					
					//Create a file instance with the absolute_file_path
					File file = new File(destinationFolder + File.separatorChar + streamWrapper.getName());
					
					//Get InputStream from the response
					InputStream is = streamWrapper.getStream();
					
					//Create an OutputStream for the destination file
					OutputStream os = new FileOutputStream(file);
					
					byte[] buffer = new byte[1024];
					
			        int bytesRead;
			        
			        //read the InputStream till the end
			        while((bytesRead = is.read(buffer)) != -1)
			        {
			        	//write data to OutputStream
			        	os.write(buffer, 0, bytesRead);
			        }
			        
			        //Close the InputStream
			        is.close();
			        
			        //Flush and close the OutputStream
			        os.flush();
			        
			        os.close();
				}
				else if(responseHandler instanceof APIException)
				{
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
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}

	/**
	 * <h3> Update Related Record </h3>
	 * This method is used to update the relation between the records and print the response.
	 * @param moduleAPIName - The API Name of the module to update related record.
	 * @param recordId - The ID of the record to be obtained.
	 * @param relatedListAPIName - The API name of the related list. To get the API name of the related list.
	 * @param relatedListId - The ID of the related record.
	 * @throws Exception
	 */
	public static void updateRelatedRecord(String moduleAPIName, Long recordId, String relatedListAPIName, Long relatedListId) throws Exception
	{
		//API Name of the module 
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002l;
		//String relatedListAPIName = "Products";
		//Long relatedListId = 3477061000004994115l;
		
		//Get instance of RelatedRecordsOperations Class that takes relatedListAPIName, recordId and moduleAPIName as parameter
    	RelatedRecordsOperations relatedRecordsOperations = new RelatedRecordsOperations(relatedListAPIName, recordId, moduleAPIName);
		
		//Get instance of BodyWrapper Class that will contain the request body
		BodyWrapper request = new BodyWrapper();
		
		//List of Record instances
		List<com.zoho.crm.api.record.Record> records = new ArrayList<com.zoho.crm.api.record.Record>();
		
		//Get instance of Record Class
		com.zoho.crm.api.record.Record record1 = new com.zoho.crm.api.record.Record();
		
		/*
		 * Call addKeyValue method that takes two arguments
		 * 1 -> A string that is the Field's API Name
		 * 2 -> Value
		 */
		
		record1.addKeyValue("list_price", 50.56);
		
		//Add Record instance to the list
		records.add(record1);
		
		//Set the list to Records in BodyWrapper instance
		request.setData(records);
	
		//Call updateRelatedRecord method that takes relatedRecordId and BodyWrapper instance as parameter.
		APIResponse<ActionHandler> response = relatedRecordsOperations.updateRelatedRecord(relatedListId, request);
		
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
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
	
	/**
	 * <h3> Delink Record </h3>
	 * This method is used to delete the association between modules and print the response.
	 * @param moduleAPIName - The API Name of the module to delink related record.
	 * @param recordId - The ID of the record to be obtained.
	 * @param relatedListAPIName - The API name of the related list. To get the API name of the related list.
	 * @param relatedListId - The ID of the related record.
	 * @throws Exception
	 */
	public static void delinkRecord(String moduleAPIName, Long recordId, String relatedListAPIName, Long relatedListId) throws Exception
	{
		//API Name of the module 
		//String moduleAPIName = "Leads";
		//Long recordId = 3477061000005177002l;
		//String relatedListAPIName = "Products";
		//Long relatedListId = 3477061000004994115l;
		
		//Get instance of RelatedRecordsOperations Class that takes relatedListAPIName, recordId and moduleAPIName as parameter
    	RelatedRecordsOperations relatedRecordsOperations = new RelatedRecordsOperations(relatedListAPIName, recordId, moduleAPIName);
		
		//Call delinkRecord method that takes relatedListId as parameter.
		APIResponse<ActionHandler> response = relatedRecordsOperations.delinkRecord(relatedListId);
		
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
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				
				for(java.lang.reflect.Field field : fields)
				{
					//Get each value
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}
}