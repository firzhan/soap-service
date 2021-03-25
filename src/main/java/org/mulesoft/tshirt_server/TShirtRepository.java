package org.mulesoft.tshirt_server;


import com.soap.service.client.gen.OrderTshirtResponse;
import org.mulesoft.tshirt_service.OrderTshirtRequest;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
public class TShirtRepository {

    @PostConstruct
    public void initData() {
        // initialize countries map
    }

    public OrderTshirtResponse acceptOrder(OrderTshirtRequest orderTshirt) {
        OrderTshirtResponse orderTshirtResponse = new OrderTshirtResponse();
        orderTshirtResponse.setOrderId(UUID.randomUUID().toString());
        return orderTshirtResponse;
    }
}
