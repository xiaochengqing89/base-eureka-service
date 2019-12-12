package com.sian.base.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BaseEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseEurekaServiceApplication.class, args);
    }

}