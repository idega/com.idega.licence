/*
 * $Id: LicenceServiceBean.java,v 1.1 2007/01/16 15:38:04 tryggvil Exp $
 * Created on 3.2.2006 in project com.idega.licence
 *
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.licence;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.handler.MessageContext;
import org.apache.axis.Constants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * <p>
 * TODO tryggvil Describe Type LicenceServiceBean
 * </p>
 *  Last modified: $Date: 2007/01/16 15:38:04 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class LicenceServiceBean implements LicenceService {

	public Logger log = Logger.getLogger(LicenceServiceBean.class.getName());
	
	/**
	 * 
	 */
	public LicenceServiceBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean validateLicence(Licence licence,String systemIdentifier,String productInfo){
		
		MessageContext mc = org.apache.axis.MessageContext.getCurrentContext();
		if(mc==null){
			log.info("Incoming licence with key: "+licence.getKey()+" from system: "+systemIdentifier);
		}
		else{
			Object ipProperty = mc.getProperty(Constants.MC_REMOTE_ADDR);
			String remoteIp = ipProperty.toString();
			
			log.info("Incoming licence with key: "+licence.getKey()+" from system: "+systemIdentifier+" with ip: "+remoteIp);
		}
		
		return true;
	}


	/* (non-Javadoc)
	 * @see com.idega.licence.LicenceService#validateEncryptedLicence(java.lang.String, java.lang.String, java.lang.String)
	 */
	public boolean validateEncryptedLicence(String encryptedLicence, String systemIdentifier, String productInfo) {
		MessageContext mc = org.apache.axis.MessageContext.getCurrentContext();

		LicenceDecryptor decryptor = new LicenceDecryptor(encryptedLicence);
		String xml = decryptor.getDecryptedString();
		
		if(mc==null){
			log.info("Incoming licence from system: "+systemIdentifier+" , productInfo='"+productInfo+"'. Licence is:\n"+xml);
		}
		else{
			Object ipProperty = mc.getProperty(Constants.MC_REMOTE_ADDR);
			String remoteIp = ipProperty.toString();
			log.info("Incoming licence from system: "+systemIdentifier+" , productInfo='"+productInfo+"' and ip='"+remoteIp+". Licence is:\n"+xml);
		}
		try {
			DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = fact.newDocumentBuilder();
			byte[] bytes = xml.getBytes();
			Document doc = builder.parse(new ByteArrayInputStream(bytes));
			Element licenceElement = doc.getDocumentElement();
			
			//Node licenceElement = doc.getFirstChild();
			
			if(licenceElement.getNodeName().equals("licence")){
				
				NodeList children = licenceElement.getElementsByTagName("key");
				Node keyNode = children.item(0);
				String key = keyNode.getFirstChild().getNodeValue();
				//todo: validate key
				
				//valid xml:
				return true;
			}
		}
		catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		catch (SAXException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
