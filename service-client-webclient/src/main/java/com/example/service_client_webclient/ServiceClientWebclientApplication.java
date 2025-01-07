package com.example.service_client_webclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class ServiceClientWebclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientWebclientApplication.class, args);
	}

}
