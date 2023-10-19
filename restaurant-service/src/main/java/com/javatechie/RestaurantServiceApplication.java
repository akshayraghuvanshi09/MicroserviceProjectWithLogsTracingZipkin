package com.javatechie;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantServiceApplication {

	public static void main(String[] args) {
		MDC.put("SERVICE_NAME", "RestaurantService");
		SpringApplication.run(RestaurantServiceApplication.class, args);
	}

}
