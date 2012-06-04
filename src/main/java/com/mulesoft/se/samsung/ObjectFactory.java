
package com.mulesoft.se.samsung;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.se.samsung package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderResponse_QNAME = new QName("http://samsung.se.mulesoft.com/", "orderResponse");
    private final static QName _Purchase_QNAME = new QName("http://samsung.se.mulesoft.com/", "purchase");
    private final static QName _OrderRequest_QNAME = new QName("http://samsung.se.mulesoft.com/", "orderRequest");
    private final static QName _PurchaseResponse_QNAME = new QName("http://samsung.se.mulesoft.com/", "purchaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.se.samsung
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link PurchaseResponse }
     * 
     */
    public PurchaseResponse createPurchaseResponse() {
        return new PurchaseResponse();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://samsung.se.mulesoft.com/", name = "orderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://samsung.se.mulesoft.com/", name = "purchase")
    public JAXBElement<Purchase> createPurchase(Purchase value) {
        return new JAXBElement<Purchase>(_Purchase_QNAME, Purchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://samsung.se.mulesoft.com/", name = "orderRequest")
    public JAXBElement<OrderRequest> createOrderRequest(OrderRequest value) {
        return new JAXBElement<OrderRequest>(_OrderRequest_QNAME, OrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://samsung.se.mulesoft.com/", name = "purchaseResponse")
    public JAXBElement<PurchaseResponse> createPurchaseResponse(PurchaseResponse value) {
        return new JAXBElement<PurchaseResponse>(_PurchaseResponse_QNAME, PurchaseResponse.class, null, value);
    }

}
