
package com.training;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieRatingServiceImplService", targetNamespace = "http://service.training.com/", wsdlLocation = "http://localhost:7575/review?wsdl")
public class MovieRatingServiceImplService
    extends Service
{

    private final static URL MOVIERATINGSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIERATINGSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MOVIERATINGSERVICEIMPLSERVICE_QNAME = new QName("http://service.training.com/", "MovieRatingServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7575/review?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIERATINGSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MOVIERATINGSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MovieRatingServiceImplService() {
        super(__getWsdlLocation(), MOVIERATINGSERVICEIMPLSERVICE_QNAME);
    }

    public MovieRatingServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIERATINGSERVICEIMPLSERVICE_QNAME, features);
    }

    public MovieRatingServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, MOVIERATINGSERVICEIMPLSERVICE_QNAME);
    }

    public MovieRatingServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIERATINGSERVICEIMPLSERVICE_QNAME, features);
    }

    public MovieRatingServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieRatingServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RatingService
     */
    @WebEndpoint(name = "MovieRatingServiceImplPort")
    public RatingService getMovieRatingServiceImplPort() {
        return super.getPort(new QName("http://service.training.com/", "MovieRatingServiceImplPort"), RatingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RatingService
     */
    @WebEndpoint(name = "MovieRatingServiceImplPort")
    public RatingService getMovieRatingServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.training.com/", "MovieRatingServiceImplPort"), RatingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIERATINGSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MOVIERATINGSERVICEIMPLSERVICE_EXCEPTION;
        }
        return MOVIERATINGSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
