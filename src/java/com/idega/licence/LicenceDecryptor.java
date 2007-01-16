/*
 * $Id: LicenceDecryptor.java,v 1.1 2007/01/16 15:38:04 tryggvil Exp $
 * Created on 9.2.2006 in project com.idega.licence
 *
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.licence;

import com.idega.util.encryption.RijndaelEncryptionBean;


/**
 * <p>
 * TODO tryggvil Describe Type LicenceEncryptor
 * </p>
 *  Last modified: $Date: 2007/01/16 15:38:04 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class LicenceDecryptor {
	
	private String base64String;
	private String decryptedString;

	/**
	 * 
	 */
	public LicenceDecryptor(String base64String) {
		this.base64String=base64String;
	}
	
	String getBase64EncryptedString(){
		return base64String;
	}
	
	public String getDecryptedString(){
		if(decryptedString==null){
			RijndaelEncryptionBean bean = LicenceEncryptionBean.getInstance();
			decryptedString=bean.decrypt(getBase64EncryptedString());
		}
		return decryptedString;
	}
	
}