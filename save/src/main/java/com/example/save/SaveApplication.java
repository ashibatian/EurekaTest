package com.example.save;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.save.Remote")
public class SaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaveApplication.class, args);
    }

}
