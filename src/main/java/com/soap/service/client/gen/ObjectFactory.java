
package com.soap.service.client.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.service.client.gen package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.service.client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link APIUsageInformation }
     * 
     */
    public APIUsageInformation createAPIUsageInformation() {
        return new APIUsageInformation();
    }

    /**
     * Create an instance of {@link AuthenticationHeader }
     * 
     */
    public AuthenticationHeader createAuthenticationHeader() {
        return new AuthenticationHeader();
    }

    /**
     * Create an instance of {@link ListInventoryRequest }
     * 
     */
    public ListInventoryRequest createListInventoryRequest() {
        return new ListInventoryRequest();
    }

    /**
     * Create an instance of {@link ListInventoryResponse }
     * 
     */
    public ListInventoryResponse createListInventoryResponse() {
        return new ListInventoryResponse();
    }

    /**
     * Create an instance of {@link InventoryItem }
     * 
     */
    public InventoryItem createInventoryItem() {
        return new InventoryItem();
    }

    /**
     * Create an instance of {@link OrderTshirtRequest }
     * 
     */
    public OrderTshirtRequest createOrderTshirtRequest() {
        return new OrderTshirtRequest();
    }

    /**
     * Create an instance of {@link OrderTshirtResponse }
     * 
     */
    public OrderTshirtResponse createOrderTshirtResponse() {
        return new OrderTshirtResponse();
    }

    /**
     * Create an instance of {@link TrackOrderRequest }
     * 
     */
    public TrackOrderRequest createTrackOrderRequest() {
        return new TrackOrderRequest();
    }

    /**
     * Create an instance of {@link TrackOrderResponse }
     * 
     */
    public TrackOrderResponse createTrackOrderResponse() {
        return new TrackOrderResponse();
    }

    /**
     * Create an instance of {@link TshirtFault }
     * 
     */
    public TshirtFault createTshirtFault() {
        return new TshirtFault();
    }

}
