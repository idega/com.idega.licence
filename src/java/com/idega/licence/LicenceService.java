/*
 * $Id: LicenceService.java,v 1.1 2007/01/16 15:38:04 tryggvil Exp $
 * Created on 5.2.2006 in project com.idega.licence
 *
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.licence;

/**
 * <p>
 * TODO tryggvil Describe Type LicenceServiceBean
 * </p>
 *  Last modified: $Date: 2007/01/16 15:38:04 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public interface LicenceService {
	
	public boolean validateEncryptedLicence(String encryptedLicence,String systemIdentifier,String productInfo);
	
	//public boolean validateLicence(Licence licence,String systemIdentifier,String productInfo);
}