/*
 * $Id: Licence.java,v 1.1 2007/01/16 15:38:04 tryggvil Exp $
 * Created on 3.2.2006 in project com.idega.licence
 *
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.licence;

import java.util.Date;


/**
 * <p>
 * Data structure for a licence
 * </p>
 *  Last modified: $Date: 2007/01/16 15:38:04 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class Licence {

	private String key;//kadsf86ada8af6a6d5adfgg5adef7
	private String type;//full,demo,test,development
	private String vendor;//idega Software
	private String licenceeName;//Nacka,
	private String applicationIdentifier;//ePlatform,eGov
	private String moduleIdentifier;//com.idega.core,none
	private String issuerName;//idega Software
	private String distributorName;//Agura IT, Landsteinar Strengur
	private String licenceModel;// PerUser,PerCpu,PerCitizen
	private Date issueDate;
	private Date validFrom;
	private Date validTo;
	private String validationUrl="https://store.idega.com/services/LicenceService";
	private String formatVersion="1.0";
	
	/**
	 * @return Returns the key.
	 */
	public String getKey() {
		return key;
	}

	
	/**
	 * @param key The key to set.
	 */
	public void setKey(String licenceKey) {
		this.key = licenceKey;
	}

	
	/**
	 * @return Returns the licenceeName.
	 */
	public String getLicenceeName() {
		return licenceeName;
	}

	
	/**
	 * @param licenceeName The licenceeName to set.
	 */
	public void setLicenceeName(String licenceOwner) {
		this.licenceeName = licenceOwner;
	}

	
	/**
	 * @return Returns the type.
	 */
	public String getType() {
		return type;
	}

	
	/**
	 * @param type The type to set.
	 */
	public void setType(String licenceType) {
		this.type = licenceType;
	}

	/**
	 * 
	 */
	public Licence() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	/**
	 * @return Returns the issueDate.
	 */
	public Date getIssueDate() {
		return issueDate;
	}


	
	/**
	 * @param issueDate The issueDate to set.
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}


	
	/**
	 * @return Returns the validFrom.
	 */
	public Date getValidFrom() {
		return validFrom;
	}


	
	/**
	 * @param validFrom The validFrom to set.
	 */
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}


	
	/**
	 * @return Returns the validTo.
	 */
	public Date getValidTo() {
		return validTo;
	}


	
	/**
	 * @param validTo The validTo to set.
	 */
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}


	
	/**
	 * @return Returns the applicationIdentifier.
	 */
	public String getApplicationIdentifier() {
		return applicationIdentifier;
	}


	
	/**
	 * @param applicationIdentifier The applicationIdentifier to set.
	 */
	public void setApplicationIdentifier(String applicationName) {
		this.applicationIdentifier = applicationName;
	}


	
	/**
	 * @return Returns the issuerName.
	 */
	public String getIssuerName() {
		return issuerName;
	}


	
	/**
	 * @param issuerName The issuerName to set.
	 */
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}


	
	/**
	 * @return Returns the distributorName.
	 */
	public String getDistributorName() {
		return distributorName;
	}


	
	/**
	 * @param distributorName The distributorName to set.
	 */
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}


	
	/**
	 * @return Returns the licenceModel.
	 */
	public String getLicenceModel() {
		return licenceModel;
	}


	
	/**
	 * @param licenceModel The licenceModel to set.
	 */
	public void setLicenceModel(String licenceModel) {
		this.licenceModel = licenceModel;
	}


	
	/**
	 * @return Returns the moduleIdentifier.
	 */
	public String getModuleIdentifier() {
		return moduleIdentifier;
	}


	
	/**
	 * @param moduleIdentifier The moduleIdentifier to set.
	 */
	public void setModuleIdentifier(String moduleIdentifier) {
		this.moduleIdentifier = moduleIdentifier;
	}


	
	/**
	 * @return Returns the validationUrl.
	 */
	public String getValidationUrl() {
		return validationUrl;
	}

	/**
	 * @param validationUrl The validationUrl to set.
	 */
	public void setValidationUrl(String validationUrl) {
		this.validationUrl = validationUrl;
	}
	
	/**
	 * @return Returns the vendor.
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * @param vendor The vendor to set.
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * <p>
	 * TODO tryggvil describe method toXML
	 * </p>
	 * @return
	 */
	public String toXML() {
		String xml = "<licence>";
		if(getKey()!=null){
			xml += "\n\t<key>"+getKey()+"</key>";
		}
		if(getType()!=null){
			xml += "\n\t<type>"+getType()+"</type>";
		}
		if(getLicenceeName()!=null){
			xml += "\n\t<licenceeName>"+getLicenceeName()+"</licenceeName>";
		}
		if(getVendor()!=null){
			xml += "\n\t<vendor>"+getVendor()+"</vendor>";
		}
		if(getApplicationIdentifier()!=null){
			xml += "\n\t<applicationIdentifier>"+getApplicationIdentifier()+"</applicationIdentifier>";
		}
		if(getModuleIdentifier()!=null){
			xml += "\n\t<moduleIdentifier>"+getModuleIdentifier()+"</moduleIdentifier>";
		}
		if(getIssuerName()!=null){
			xml += "\n\t<issuerName>"+getIssuerName()+"</issuerName>";
		}
		if(getDistributorName()!=null){
			xml += "\n\t<distributorName>"+getDistributorName()+"</distributorName>";
		}
		if(getLicenceModel()!=null){
			xml += "\n\t<licenceModel>"+getLicenceModel()+"</licenceModel>";
		}
		if(getIssueDate()!=null){
			xml += "\n\t<issueDate>"+getIssueDate()+"</issueDate>";
		}
		if(getValidFrom()!=null){
			xml += "\n\t<validFrom>"+getValidFrom()+"</validFrom>";
		}
		if(getValidTo()!=null){
			xml += "\n\t<validTo>"+getValidTo()+"</validTo>";
		}
		if(getValidationUrl()!=null){
			xml += "\n\t<validationUrl>"+getValidationUrl()+"</validationUrl>";
		}
		if(getFormatVersion()!=null){
			xml += "\n\t<formatVersion>"+getFormatVersion()+"</formatVersion>";
		}
		xml += "\n</licence>";
		return xml;
	}
	
	public String toString(){
		return toXML();
	}


	
	/**
	 * @return Returns the formatVersion.
	 */
	public String getFormatVersion() {
		return formatVersion;
	}


	
	/**
	 * @param formatVersion The formatVersion to set.
	 */
	public void setFormatVersion(String formatVersion) {
		this.formatVersion = formatVersion;
	}
}
