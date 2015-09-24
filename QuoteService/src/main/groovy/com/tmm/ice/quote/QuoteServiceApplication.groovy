package com.tmm.ice.quote

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
class QuoteServiceApplication {

	static void main(String[] args) {
		System.setProperty("spring.config.name", "quote-service");
		SpringApplication.run QuoteServiceApplication, args
    }
}
