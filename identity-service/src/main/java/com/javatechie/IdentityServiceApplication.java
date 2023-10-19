package com.javatechie;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class IdentityServiceApplication {

	public static void main(String[] args) {
//		MDC.put("SERVICE_NAME", "IDENTITY_SERVICE");
		System.setProperty("SERVICE_NAME", "IDENTITY_SERVICE");
		ConfigurableApplicationContext run = SpringApplication.run(IdentityServiceApplication.class, args);
		
	}

}
