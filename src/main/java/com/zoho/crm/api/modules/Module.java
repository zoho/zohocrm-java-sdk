package com.zoho.crm.api.modules;

import com.zoho.crm.api.customviews.CustomView;
import com.zoho.crm.api.profiles.Profile;
import com.zoho.crm.api.users.User;
import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

public class Module implements Model
{
	private String name;

	private Boolean globalSearchSupported;

	private Boolean kanbanView;

	private Boolean deletable;

	private String description;

	private Boolean creatable;

	private Boolean filterStatus;

	private Boolean inventoryTemplateSupported;

	private OffsetDateTime modifiedTime;

	private String pluralLabel;

	private Boolean presenceSubMenu;

	private Boolean triggersSupported;

	private Long id;

	private RelatedListProperties relatedListProperties;

	private List<String> properties;

	private Integer perPage;

	private Integer visibility;

	private Boolean convertable;

	private Boolean editable;

	private Boolean emailtemplateSupport;

	private List<Profile> profiles;

	private Boolean filterSupported;

	private String displayField;

	private List<String> searchLayoutFields;

	private Boolean kanbanViewSupported;

	private Boolean showAsTab;

	private String webLink;

	private Integer sequenceNumber;

	private String singularLabel;

	private Boolean viewable;

	private Boolean apiSupported;

	private String apiName;

	private Boolean quickCreate;

	private User modifiedBy;

	private Choice<String> generatedType;

	private Boolean feedsRequired;

	private Boolean scoringSupported;

	private Boolean webformSupported;

	private List<Argument> arguments;

	private String moduleName;

	private Integer businessCardFieldLimit;

	private CustomView customView;

	private Module parentModule;

	private Territory territory;

	private HashMap<String, Integer> keyModified=new HashMap<String, Integer>();


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
	 * The method to get the value of globalSearchSupported
	 * @return A Boolean representing the globalSearchSupported
	 */
	public Boolean getGlobalSearchSupported()
	{
		return  this.globalSearchSupported;

	}

	/**
	 * The method to set the value to globalSearchSupported
	 * @param globalSearchSupported A Boolean representing the globalSearchSupported
	 */
	public void setGlobalSearchSupported(Boolean globalSearchSupported)
	{
		 this.globalSearchSupported=globalSearchSupported;

		 this.keyModified.put("global_search_supported", 1);

	}

	/**
	 * The method to get the value of kanbanView
	 * @return A Boolean representing the kanbanView
	 */
	public Boolean getKanbanView()
	{
		return  this.kanbanView;

	}

	/**
	 * The method to set the value to kanbanView
	 * @param kanbanView A Boolean representing the kanbanView
	 */
	public void setKanbanView(Boolean kanbanView)
	{
		 this.kanbanView=kanbanView;

		 this.keyModified.put("kanban_view", 1);

	}

	/**
	 * The method to get the value of deletable
	 * @return A Boolean representing the deletable
	 */
	public Boolean getDeletable()
	{
		return  this.deletable;

	}

	/**
	 * The method to set the value to deletable
	 * @param deletable A Boolean representing the deletable
	 */
	public void setDeletable(Boolean deletable)
	{
		 this.deletable=deletable;

		 this.keyModified.put("deletable", 1);

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
	 * The method to get the value of creatable
	 * @return A Boolean representing the creatable
	 */
	public Boolean getCreatable()
	{
		return  this.creatable;

	}

	/**
	 * The method to set the value to creatable
	 * @param creatable A Boolean representing the creatable
	 */
	public void setCreatable(Boolean creatable)
	{
		 this.creatable=creatable;

		 this.keyModified.put("creatable", 1);

	}

	/**
	 * The method to get the value of filterStatus
	 * @return A Boolean representing the filterStatus
	 */
	public Boolean getFilterStatus()
	{
		return  this.filterStatus;

	}

	/**
	 * The method to set the value to filterStatus
	 * @param filterStatus A Boolean representing the filterStatus
	 */
	public void setFilterStatus(Boolean filterStatus)
	{
		 this.filterStatus=filterStatus;

		 this.keyModified.put("filter_status", 1);

	}

	/**
	 * The method to get the value of inventoryTemplateSupported
	 * @return A Boolean representing the inventoryTemplateSupported
	 */
	public Boolean getInventoryTemplateSupported()
	{
		return  this.inventoryTemplateSupported;

	}

	/**
	 * The method to set the value to inventoryTemplateSupported
	 * @param inventoryTemplateSupported A Boolean representing the inventoryTemplateSupported
	 */
	public void setInventoryTemplateSupported(Boolean inventoryTemplateSupported)
	{
		 this.inventoryTemplateSupported=inventoryTemplateSupported;

		 this.keyModified.put("inventory_template_supported", 1);

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

		 this.keyModified.put("modified_time", 1);

	}

	/**
	 * The method to get the value of pluralLabel
	 * @return A String representing the pluralLabel
	 */
	public String getPluralLabel()
	{
		return  this.pluralLabel;

	}

	/**
	 * The method to set the value to pluralLabel
	 * @param pluralLabel A String representing the pluralLabel
	 */
	public void setPluralLabel(String pluralLabel)
	{
		 this.pluralLabel=pluralLabel;

		 this.keyModified.put("plural_label", 1);

	}

	/**
	 * The method to get the value of presenceSubMenu
	 * @return A Boolean representing the presenceSubMenu
	 */
	public Boolean getPresenceSubMenu()
	{
		return  this.presenceSubMenu;

	}

	/**
	 * The method to set the value to presenceSubMenu
	 * @param presenceSubMenu A Boolean representing the presenceSubMenu
	 */
	public void setPresenceSubMenu(Boolean presenceSubMenu)
	{
		 this.presenceSubMenu=presenceSubMenu;

		 this.keyModified.put("presence_sub_menu", 1);

	}

	/**
	 * The method to get the value of triggersSupported
	 * @return A Boolean representing the triggersSupported
	 */
	public Boolean getTriggersSupported()
	{
		return  this.triggersSupported;

	}

	/**
	 * The method to set the value to triggersSupported
	 * @param triggersSupported A Boolean representing the triggersSupported
	 */
	public void setTriggersSupported(Boolean triggersSupported)
	{
		 this.triggersSupported=triggersSupported;

		 this.keyModified.put("triggers_supported", 1);

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
	 * The method to get the value of relatedListProperties
	 * @return An instance of RelatedListProperties
	 */
	public RelatedListProperties getRelatedListProperties()
	{
		return  this.relatedListProperties;

	}

	/**
	 * The method to set the value to relatedListProperties
	 * @param relatedListProperties An instance of RelatedListProperties
	 */
	public void setRelatedListProperties(RelatedListProperties relatedListProperties)
	{
		 this.relatedListProperties=relatedListProperties;

		 this.keyModified.put("related_list_properties", 1);

	}

	/**
	 * The method to get the value of properties
	 * @return An instance of List<String>
	 */
	public List<String> getProperties()
	{
		return  this.properties;

	}

	/**
	 * The method to set the value to properties
	 * @param properties An instance of List<String>
	 */
	public void setProperties(List<String> properties)
	{
		 this.properties=properties;

		 this.keyModified.put("$properties", 1);

	}

	/**
	 * The method to get the value of perPage
	 * @return An Integer representing the perPage
	 */
	public Integer getPerPage()
	{
		return  this.perPage;

	}

	/**
	 * The method to set the value to perPage
	 * @param perPage An Integer representing the perPage
	 */
	public void setPerPage(Integer perPage)
	{
		 this.perPage=perPage;

		 this.keyModified.put("per_page", 1);

	}

	/**
	 * The method to get the value of visibility
	 * @return An Integer representing the visibility
	 */
	public Integer getVisibility()
	{
		return  this.visibility;

	}

	/**
	 * The method to set the value to visibility
	 * @param visibility An Integer representing the visibility
	 */
	public void setVisibility(Integer visibility)
	{
		 this.visibility=visibility;

		 this.keyModified.put("visibility", 1);

	}

	/**
	 * The method to get the value of convertable
	 * @return A Boolean representing the convertable
	 */
	public Boolean getConvertable()
	{
		return  this.convertable;

	}

	/**
	 * The method to set the value to convertable
	 * @param convertable A Boolean representing the convertable
	 */
	public void setConvertable(Boolean convertable)
	{
		 this.convertable=convertable;

		 this.keyModified.put("convertable", 1);

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

		 this.keyModified.put("editable", 1);

	}

	/**
	 * The method to get the value of emailtemplateSupport
	 * @return A Boolean representing the emailtemplateSupport
	 */
	public Boolean getEmailtemplateSupport()
	{
		return  this.emailtemplateSupport;

	}

	/**
	 * The method to set the value to emailtemplateSupport
	 * @param emailtemplateSupport A Boolean representing the emailtemplateSupport
	 */
	public void setEmailtemplateSupport(Boolean emailtemplateSupport)
	{
		 this.emailtemplateSupport=emailtemplateSupport;

		 this.keyModified.put("emailTemplate_support", 1);

	}

	/**
	 * The method to get the value of profiles
	 * @return An instance of List<Profile>
	 */
	public List<Profile> getProfiles()
	{
		return  this.profiles;

	}

	/**
	 * The method to set the value to profiles
	 * @param profiles An instance of List<Profile>
	 */
	public void setProfiles(List<Profile> profiles)
	{
		 this.profiles=profiles;

		 this.keyModified.put("profiles", 1);

	}

	/**
	 * The method to get the value of filterSupported
	 * @return A Boolean representing the filterSupported
	 */
	public Boolean getFilterSupported()
	{
		return  this.filterSupported;

	}

	/**
	 * The method to set the value to filterSupported
	 * @param filterSupported A Boolean representing the filterSupported
	 */
	public void setFilterSupported(Boolean filterSupported)
	{
		 this.filterSupported=filterSupported;

		 this.keyModified.put("filter_supported", 1);

	}

	/**
	 * The method to get the value of displayField
	 * @return A String representing the displayField
	 */
	public String getDisplayField()
	{
		return  this.displayField;

	}

	/**
	 * The method to set the value to displayField
	 * @param displayField A String representing the displayField
	 */
	public void setDisplayField(String displayField)
	{
		 this.displayField=displayField;

		 this.keyModified.put("display_field", 1);

	}

	/**
	 * The method to get the value of searchLayoutFields
	 * @return An instance of List<String>
	 */
	public List<String> getSearchLayoutFields()
	{
		return  this.searchLayoutFields;

	}

	/**
	 * The method to set the value to searchLayoutFields
	 * @param searchLayoutFields An instance of List<String>
	 */
	public void setSearchLayoutFields(List<String> searchLayoutFields)
	{
		 this.searchLayoutFields=searchLayoutFields;

		 this.keyModified.put("search_layout_fields", 1);

	}

	/**
	 * The method to get the value of kanbanViewSupported
	 * @return A Boolean representing the kanbanViewSupported
	 */
	public Boolean getKanbanViewSupported()
	{
		return  this.kanbanViewSupported;

	}

	/**
	 * The method to set the value to kanbanViewSupported
	 * @param kanbanViewSupported A Boolean representing the kanbanViewSupported
	 */
	public void setKanbanViewSupported(Boolean kanbanViewSupported)
	{
		 this.kanbanViewSupported=kanbanViewSupported;

		 this.keyModified.put("kanban_view_supported", 1);

	}

	/**
	 * The method to get the value of showAsTab
	 * @return A Boolean representing the showAsTab
	 */
	public Boolean getShowAsTab()
	{
		return  this.showAsTab;

	}

	/**
	 * The method to set the value to showAsTab
	 * @param showAsTab A Boolean representing the showAsTab
	 */
	public void setShowAsTab(Boolean showAsTab)
	{
		 this.showAsTab=showAsTab;

		 this.keyModified.put("show_as_tab", 1);

	}

	/**
	 * The method to get the value of webLink
	 * @return A String representing the webLink
	 */
	public String getWebLink()
	{
		return  this.webLink;

	}

	/**
	 * The method to set the value to webLink
	 * @param webLink A String representing the webLink
	 */
	public void setWebLink(String webLink)
	{
		 this.webLink=webLink;

		 this.keyModified.put("web_link", 1);

	}

	/**
	 * The method to get the value of sequenceNumber
	 * @return An Integer representing the sequenceNumber
	 */
	public Integer getSequenceNumber()
	{
		return  this.sequenceNumber;

	}

	/**
	 * The method to set the value to sequenceNumber
	 * @param sequenceNumber An Integer representing the sequenceNumber
	 */
	public void setSequenceNumber(Integer sequenceNumber)
	{
		 this.sequenceNumber=sequenceNumber;

		 this.keyModified.put("sequence_number", 1);

	}

	/**
	 * The method to get the value of singularLabel
	 * @return A String representing the singularLabel
	 */
	public String getSingularLabel()
	{
		return  this.singularLabel;

	}

	/**
	 * The method to set the value to singularLabel
	 * @param singularLabel A String representing the singularLabel
	 */
	public void setSingularLabel(String singularLabel)
	{
		 this.singularLabel=singularLabel;

		 this.keyModified.put("singular_label", 1);

	}

	/**
	 * The method to get the value of viewable
	 * @return A Boolean representing the viewable
	 */
	public Boolean getViewable()
	{
		return  this.viewable;

	}

	/**
	 * The method to set the value to viewable
	 * @param viewable A Boolean representing the viewable
	 */
	public void setViewable(Boolean viewable)
	{
		 this.viewable=viewable;

		 this.keyModified.put("viewable", 1);

	}

	/**
	 * The method to get the value of apiSupported
	 * @return A Boolean representing the apiSupported
	 */
	public Boolean getAPISupported()
	{
		return  this.apiSupported;

	}

	/**
	 * The method to set the value to apiSupported
	 * @param apiSupported A Boolean representing the apiSupported
	 */
	public void setAPISupported(Boolean apiSupported)
	{
		 this.apiSupported=apiSupported;

		 this.keyModified.put("api_supported", 1);

	}

	/**
	 * The method to get the value of apiName
	 * @return A String representing the apiName
	 */
	public String getAPIName()
	{
		return  this.apiName;

	}

	/**
	 * The method to set the value to apiName
	 * @param apiName A String representing the apiName
	 */
	public void setAPIName(String apiName)
	{
		 this.apiName=apiName;

		 this.keyModified.put("api_name", 1);

	}

	/**
	 * The method to get the value of quickCreate
	 * @return A Boolean representing the quickCreate
	 */
	public Boolean getQuickCreate()
	{
		return  this.quickCreate;

	}

	/**
	 * The method to set the value to quickCreate
	 * @param quickCreate A Boolean representing the quickCreate
	 */
	public void setQuickCreate(Boolean quickCreate)
	{
		 this.quickCreate=quickCreate;

		 this.keyModified.put("quick_create", 1);

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

		 this.keyModified.put("modified_by", 1);

	}

	/**
	 * The method to get the value of generatedType
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getGeneratedType()
	{
		return  this.generatedType;

	}

	/**
	 * The method to set the value to generatedType
	 * @param generatedType An instance of Choice<String>
	 */
	public void setGeneratedType(Choice<String> generatedType)
	{
		 this.generatedType=generatedType;

		 this.keyModified.put("generated_type", 1);

	}

	/**
	 * The method to get the value of feedsRequired
	 * @return A Boolean representing the feedsRequired
	 */
	public Boolean getFeedsRequired()
	{
		return  this.feedsRequired;

	}

	/**
	 * The method to set the value to feedsRequired
	 * @param feedsRequired A Boolean representing the feedsRequired
	 */
	public void setFeedsRequired(Boolean feedsRequired)
	{
		 this.feedsRequired=feedsRequired;

		 this.keyModified.put("feeds_required", 1);

	}

	/**
	 * The method to get the value of scoringSupported
	 * @return A Boolean representing the scoringSupported
	 */
	public Boolean getScoringSupported()
	{
		return  this.scoringSupported;

	}

	/**
	 * The method to set the value to scoringSupported
	 * @param scoringSupported A Boolean representing the scoringSupported
	 */
	public void setScoringSupported(Boolean scoringSupported)
	{
		 this.scoringSupported=scoringSupported;

		 this.keyModified.put("scoring_supported", 1);

	}

	/**
	 * The method to get the value of webformSupported
	 * @return A Boolean representing the webformSupported
	 */
	public Boolean getWebformSupported()
	{
		return  this.webformSupported;

	}

	/**
	 * The method to set the value to webformSupported
	 * @param webformSupported A Boolean representing the webformSupported
	 */
	public void setWebformSupported(Boolean webformSupported)
	{
		 this.webformSupported=webformSupported;

		 this.keyModified.put("webform_supported", 1);

	}

	/**
	 * The method to get the value of arguments
	 * @return An instance of List<Argument>
	 */
	public List<Argument> getArguments()
	{
		return  this.arguments;

	}

	/**
	 * The method to set the value to arguments
	 * @param arguments An instance of List<Argument>
	 */
	public void setArguments(List<Argument> arguments)
	{
		 this.arguments=arguments;

		 this.keyModified.put("arguments", 1);

	}

	/**
	 * The method to get the value of moduleName
	 * @return A String representing the moduleName
	 */
	public String getModuleName()
	{
		return  this.moduleName;

	}

	/**
	 * The method to set the value to moduleName
	 * @param moduleName A String representing the moduleName
	 */
	public void setModuleName(String moduleName)
	{
		 this.moduleName=moduleName;

		 this.keyModified.put("module_name", 1);

	}

	/**
	 * The method to get the value of businessCardFieldLimit
	 * @return An Integer representing the businessCardFieldLimit
	 */
	public Integer getBusinessCardFieldLimit()
	{
		return  this.businessCardFieldLimit;

	}

	/**
	 * The method to set the value to businessCardFieldLimit
	 * @param businessCardFieldLimit An Integer representing the businessCardFieldLimit
	 */
	public void setBusinessCardFieldLimit(Integer businessCardFieldLimit)
	{
		 this.businessCardFieldLimit=businessCardFieldLimit;

		 this.keyModified.put("business_card_field_limit", 1);

	}

	/**
	 * The method to get the value of customView
	 * @return An instance of CustomView
	 */
	public CustomView getCustomView()
	{
		return  this.customView;

	}

	/**
	 * The method to set the value to customView
	 * @param customView An instance of CustomView
	 */
	public void setCustomView(CustomView customView)
	{
		 this.customView=customView;

		 this.keyModified.put("custom_view", 1);

	}

	/**
	 * The method to get the value of parentModule
	 * @return An instance of Module
	 */
	public Module getParentModule()
	{
		return  this.parentModule;

	}

	/**
	 * The method to set the value to parentModule
	 * @param parentModule An instance of Module
	 */
	public void setParentModule(Module parentModule)
	{
		 this.parentModule=parentModule;

		 this.keyModified.put("parent_module", 1);

	}

	/**
	 * The method to get the value of territory
	 * @return An instance of Territory
	 */
	public Territory getTerritory()
	{
		return  this.territory;

	}

	/**
	 * The method to set the value to territory
	 * @param territory An instance of Territory
	 */
	public void setTerritory(Territory territory)
	{
		 this.territory=territory;

		 this.keyModified.put("territory", 1);

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