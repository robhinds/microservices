package com.tmm.ice.product

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
class ProductServiceApplication {

    static void main(String[] args) {
		System.setProperty("spring.config.name", "product-service");
        SpringApplication.run ProductServiceApplication, args
    }
}
