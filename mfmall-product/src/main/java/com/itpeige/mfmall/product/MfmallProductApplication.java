package com.itpeige.mfmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MfmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MfmallProductApplication.class, args);
    }

}
