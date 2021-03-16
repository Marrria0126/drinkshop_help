package com.southwind.drinkshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.southwind.drinkshop.mapper")
public class DrinkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrinkshopApplication.class, args);
    }

}
