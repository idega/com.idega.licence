/*
 * $Id: LicenceGenerator.java,v 1.1 2007/01/16 15:38:04 tryggvil Exp $
 * Created on 9.2.2006 in project com.idega.licence
 *
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.licence;

import java.util.Date;
import com.idega.idegaweb.IWMainApplication;
import com.idega.util.IWTimestamp;


/**
 * <p>
 * TODO tryggvil Describe Type LicenceGenerator
 * </p>
 *  Last modified: $Date: 2007/01/16 15:38:04 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class LicenceGenerator {

	/**
	 * 
	 */
	public LicenceGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args){
		Licence licence = generateISTLicence();
		LicenceEncryptor encLicence = new LicenceEncryptor(licence);
		
		String xml = licence.toXML();
		String enc = encLicence.getBase64EncryptedString();
		
		LicenceDecryptor decLicence = new LicenceDecryptor(enc);
		String decXml = decLicence.getDecryptedString();
		
		LicenceServiceBean serviceBean = new LicenceServiceBean();
		
		System.out.println("Licence xml:\n"+xml+"");
		System.out.println("Licence encrypted:\n"+enc+"");
		System.out.println("Licence decrypted:\n"+decXml+"");
		System.out.println("Licence valid="+serviceBean.validateEncryptedLicence(enc,"test","test"));
		
		//IWMainApplication.reg(enc,"test","test");
		
	}


	/**
	 * <p>
	 * TODO tryggvil describe method generateAguraITLicence
	 * </p>
	 */
	private static Licence generateAguraITLicence() {
		
		Date dateNow = IWTimestamp.getTimestampRightNow();
		
		Licence licence = new Licence();
		licence.setVendor("idega Software");
		licence.setDistributorName("Agura IT");
		licence.setLicenceeName("Agura IT");
		licence.setIssuerName("Tryggvi Larusson");
		licence.setIssueDate(dateNow);
		licence.setValidFrom(dateNow);
		licence.setApplicationIdentifier("ePlatform");
		String key = generateLicenceKey();
		licence.setKey(key);
	
		return licence;
	}
	
	/**
	 * <p>
	 * TODO tryggvil describe method generateAguraITLicence
	 * </p>
	 */
	private static Licence generateISTLicence() {
		
		Date dateNow = IWTimestamp.getTimestampRightNow();
		
		Licence licence = new Licence();
		licence.setVendor("idega Software");
		licence.setDistributorName("IST");
		licence.setLicenceeName("IST");
		licence.setIssuerName("Tryggvi Larusson");
		licence.setIssueDate(dateNow);
		licence.setValidFrom(dateNow);
		licence.setApplicationIdentifier("ePlatform");
		String key = generateLicenceKey();
		licence.setKey(key);
	
		return licence;
	}
	

	/**
	 * <p>
	 * TODO tryggvil describe method generateAguraITLicence
	 * </p>
	 */
	private static Licence generateIdegaDefaultLicence() {
		
		Date dateNow = IWTimestamp.getTimestampRightNow();
		
		Licence licence = new Licence();
		licence.setVendor("idega Software");
		licence.setDistributorName("idega Software");
		licence.setLicenceeName("Unspecified");
		licence.setIssuerName("Tryggvi Larusson");
		licence.setIssueDate(dateNow);
		licence.setValidFrom(dateNow);
		licence.setApplicationIdentifier("ePlatform");
		String key = generateLicenceKey();
		licence.setKey(key);
	
		return licence;
	}


	/**
	 * <p>
	 * TODO tryggvil describe method generateLicenceKey
	 * </p>
	 * @return
	 */
	private static String generateLicenceKey() {
		return "none";
	}

}
