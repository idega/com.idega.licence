/**
 * LicenceServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.idega.licence.server;

public interface LicenceServiceService extends javax.xml.rpc.Service {
    public java.lang.String getLicenceServiceAddress();

    public com.idega.licence.server.LicenceService getLicenceService() throws javax.xml.rpc.ServiceException;

    public com.idega.licence.server.LicenceService getLicenceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
