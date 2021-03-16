package com.southwind.drinkshop.service;

import com.southwind.drinkshop.entity.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrdersServiceTest {

    @Autowired
    private OrderService service;

    @Test
    void test(){
        Orders orders = new Orders();
        orders.setUserId(1);
        orders.setLoginName("1");
        orders.setUserAddress("dsaf");
        orders.setCost(100.0f);
        service.save(orders);

    }


}
