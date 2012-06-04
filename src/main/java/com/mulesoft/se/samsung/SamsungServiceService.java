package com.mulesoft.se.samsung;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-05-05T15:57:38.034-03:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "SamsungServiceService", 
                  wsdlLocation = "file:/Users/nialdarbey/connectors/beta33/src/main/resources/samsung.wsdl",
                  targetNamespace = "http://samsung.se.mulesoft.com/") 
public class SamsungServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://samsung.se.mulesoft.com/", "SamsungServiceService");
    public final static QName SamsungServicePort = new QName("http://samsung.se.mulesoft.com/", "SamsungServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/nialdarbey/connectors/beta33/src/main/resources/samsung.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SamsungServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/nialdarbey/connectors/beta33/src/main/resources/samsung.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SamsungServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SamsungServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SamsungServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SamsungService
     */
    @WebEndpoint(name = "SamsungServicePort")
    public SamsungService getSamsungServicePort() {
        return super.getPort(SamsungServicePort, SamsungService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SamsungService
     */
    @WebEndpoint(name = "SamsungServicePort")
    public SamsungService getSamsungServicePort(WebServiceFeature... features) {
        return super.getPort(SamsungServicePort, SamsungService.class, features);
    }

}