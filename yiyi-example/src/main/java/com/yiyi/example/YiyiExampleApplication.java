package com.yiyi.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableFeignClients(basePackages = {"com.husky.intf"})
public class YiyiExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiyiExampleApplication.class, args);
    }
}
