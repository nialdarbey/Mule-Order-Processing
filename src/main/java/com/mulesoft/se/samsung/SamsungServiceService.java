package com.mulesoft.se.samsung;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-05-05T15:57:38.034-03:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "SamsungServiceService", 
                  targetNamespace = "http://samsung.se.mulesoft.com/") 
public class SamsungServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://samsung.se.mulesoft.com/", "SamsungServiceService");
    public final static QName SamsungServicePort = new QName("http://samsung.se.mulesoft.com/", "SamsungServicePort");
    static {
    	 URL url = null;
         try {
 			Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:/samsung.wsdl");
 			if (resources.length > 0) {
 				url = resources[0].getURL();
 			}
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
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
