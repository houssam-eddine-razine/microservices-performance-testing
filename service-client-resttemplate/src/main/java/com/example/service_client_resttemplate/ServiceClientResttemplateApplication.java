package com.example.service_client_resttemplate;

import jakarta.websocket.ClientEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class ServiceClientResttemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientResttemplateApplication.class, args);
	}

}
