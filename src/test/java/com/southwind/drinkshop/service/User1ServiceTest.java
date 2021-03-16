package com.southwind.drinkshop.service;

import com.southwind.drinkshop.entity.User1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class User1ServiceTest {

    @Autowired
    private User1Service service;
    @Test
    void test(){
        User1 user1 = new User1();
        user1.setLoginName("yihong");
        user1.setUserName("xiayihong");
        user1.setPassword("qwert");
//        user1.setGender(2);
        System.out.println(service.save(user1));
    }

}