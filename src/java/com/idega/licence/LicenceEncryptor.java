/*
 * $Id: LicenceEncryptor.java,v 1.1 2007/01/16 15:38:03 tryggvil Exp $
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
 *  Last modified: $Date: 2007/01/16 15:38:03 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class LicenceEncryptor {
	

	private Licence licence;
	private String base64String;

	/**
	 * 
	 */
	public LicenceEncryptor(Licence licence) {
		this.licence=licence;
	}
	
	String getBase64EncryptedString(){
		if(base64String==null){
			RijndaelEncryptionBean bean = getEncryptionBean();
			base64String=bean.encrypt(licence.toXML());
		}
		return base64String;
	}
	
	RijndaelEncryptionBean getEncryptionBean(){
		return LicenceEncryptionBean.getInstance();
	}
	
}