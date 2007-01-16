/**
 * LicenceServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.idega.licence.server;

import com.idega.licence.LicenceServiceBean;

public class LicenceServiceSoapBindingImpl implements com.idega.licence.server.LicenceService{
    public boolean validateEncryptedLicence(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException {
        
    		LicenceServiceBean service = new LicenceServiceBean();
    		return service.validateEncryptedLicence(in0,in1,in2);
    }

}
