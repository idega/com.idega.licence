/**
 * LicenceServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.idega.licence.server;

public class LicenceServiceSoapBindingSkeleton implements com.idega.licence.server.LicenceService, org.apache.axis.wsdl.Skeleton {
    private com.idega.licence.server.LicenceService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validateEncryptedLicence", _params, new javax.xml.namespace.QName("", "validateEncryptedLicenceReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:com.idega.licence", "validateEncryptedLicence"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validateEncryptedLicence") == null) {
            _myOperations.put("validateEncryptedLicence", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validateEncryptedLicence")).add(_oper);
    }

    public LicenceServiceSoapBindingSkeleton() {
        this.impl = new com.idega.licence.server.LicenceServiceSoapBindingImpl();
    }

    public LicenceServiceSoapBindingSkeleton(com.idega.licence.server.LicenceService impl) {
        this.impl = impl;
    }
    public boolean validateEncryptedLicence(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException
    {
        boolean ret = impl.validateEncryptedLicence(in0, in1, in2);
        return ret;
    }

}
