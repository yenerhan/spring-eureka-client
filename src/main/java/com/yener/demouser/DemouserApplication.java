package com.yener.demouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemouserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemouserApplication.class, args);
	}

}
