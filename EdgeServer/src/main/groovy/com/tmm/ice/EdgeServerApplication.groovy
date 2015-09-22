package com.tmm.ice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy


@SpringBootApplication
@EnableZuulProxy
class EdgeServerApplication {

    static void main(String[] args) {
		System.setProperty("spring.config.name", "edge-server");
        SpringApplication.run EdgeServerApplication, args
    }
}