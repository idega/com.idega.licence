/*
 * $Id: LicenceEncryptionBean.java,v 1.1 2007/01/16 15:38:04 tryggvil Exp $
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
 * TODO tryggvil Describe Type LicenceEncryptionBean
 * </p>
 *  Last modified: $Date: 2007/01/16 15:38:04 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class LicenceEncryptionBean extends RijndaelEncryptionBean {

	private String secretKey="aoipx7t98sf7f8acpc0j23hjzz8fkpq3";
	private byte[] IV = new byte[] {0x13, 0x34, 0x74, 0x6f, 0x2d, 0x79,  0x5a, 0x33, 0x43, 0x19, 0x38, 0x38, 0x2c, 0x6e, 0x23, 0x46 };
	
	private static LicenceEncryptionBean instance;
	
	/**
	 * 
	 */
	public LicenceEncryptionBean() {
		super();
		super.setSecretKey(secretKey);
		super.setIV(IV);
	}
	
	public static LicenceEncryptionBean getInstance(){
		if(instance==null){
			instance = new LicenceEncryptionBean();
		}
		return instance;
	}
}
