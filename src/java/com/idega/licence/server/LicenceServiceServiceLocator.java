/**
 * LicenceServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.idega.licence.server;

public class LicenceServiceServiceLocator extends org.apache.axis.client.Service implements com.idega.licence.server.LicenceServiceService {

    public LicenceServiceServiceLocator() {
    }


    public LicenceServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LicenceServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LicenceService
    private java.lang.String LicenceService_address = "http://licence.idega.com/services/LicenceService";

    public java.lang.String getLicenceServiceAddress() {
        return LicenceService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LicenceServiceWSDDServiceName = "LicenceService";

    public java.lang.String getLicenceServiceWSDDServiceName() {
        return LicenceServiceWSDDServiceName;
    }

    public void setLicenceServiceWSDDServiceName(java.lang.String name) {
        LicenceServiceWSDDServiceName = name;
    }

    public com.idega.licence.server.LicenceService getLicenceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LicenceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLicenceService(endpoint);
    }

    public com.idega.licence.server.LicenceService getLicenceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.idega.licence.server.LicenceServiceSoapBindingStub _stub = new com.idega.licence.server.LicenceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLicenceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLicenceServiceEndpointAddress(java.lang.String address) {
        LicenceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.idega.licence.server.LicenceService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.idega.licence.server.LicenceServiceSoapBindingStub _stub = new com.idega.licence.server.LicenceServiceSoapBindingStub(new java.net.URL(LicenceService_address), this);
                _stub.setPortName(getLicenceServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LicenceService".equals(inputPortName)) {
            return getLicenceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com.idega.licence", "LicenceServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com.idega.licence", "LicenceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LicenceService".equals(portName)) {
            setLicenceServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
