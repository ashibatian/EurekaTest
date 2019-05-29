package com.example.stimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
public class StimulatorApplication {
    Map<String, Object> term;
    public static void main(String[] args) {
        SpringApplication.run(StimulatorApplication.class, args);
    }

}
