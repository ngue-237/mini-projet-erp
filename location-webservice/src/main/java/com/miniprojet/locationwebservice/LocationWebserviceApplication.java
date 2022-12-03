package com.miniprojet.locationwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LocationWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationWebserviceApplication.class, args);
	}

}
