package org.mulesoft.tshirt_server;


import com.soap.service.client.gen.OrderTshirtResponse;
import org.mulesoft.tshirt_service.OrderTshirtRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.UUID;

@Endpoint
public class TShirtEndpoint {

    private static final String NAMESPACE_URI = "http://mulesoft.org/tshirt-service";

    private TShirtRepository tShirtRepository;


    public TShirtEndpoint(TShirtRepository tShirtRepository) {
        this.tShirtRepository = tShirtRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OrderTshirtRequest")
    @ResponsePayload
    public OrderTshirtResponse addOrder(@RequestPayload OrderTshirtRequest request) {
        OrderTshirtResponse orderTshirtResponse = new OrderTshirtResponse();
        orderTshirtResponse.setOrderId(UUID.randomUUID().toString());
        return orderTshirtResponse;

    }
}
