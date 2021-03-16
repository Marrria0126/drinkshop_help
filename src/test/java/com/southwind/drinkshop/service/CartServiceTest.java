package com.southwind.drinkshop.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CartServiceTest {

//    @AfterEach
//    void tearDown() {
//    }
    @Autowired
    private CartService cartService;

    @Test
    void findAllCartVOByUserId() {
        cartService.findAllCartVOByUserId(10).forEach(System.out::println);
    }
}