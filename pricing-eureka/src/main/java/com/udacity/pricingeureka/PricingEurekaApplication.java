package com.udacity.pricingeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PricingEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PricingEurekaApplication.class, args);
	}
}
