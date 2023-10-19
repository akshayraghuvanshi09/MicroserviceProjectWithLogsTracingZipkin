package com.javatechie;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SwiggyAppApplication {

	public static void main(String[] args) {
		MDC.put("SERVICE_NAME", "SwiggyService");
		SpringApplication.run(SwiggyAppApplication.class, args);
	}

}
