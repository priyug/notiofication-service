package com.example.notiofication_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//simport org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class NotioficationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotioficationServiceApplication.class, args);
	}

}
