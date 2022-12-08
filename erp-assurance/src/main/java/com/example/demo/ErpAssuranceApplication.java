package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ErpAssuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpAssuranceApplication.class, args);
	}
	@RestController
	class ServiceInstanceRestController{
		@Autowired
		private DiscoveryClient discoveryClient;
		
		@RequestMapping("/service-instances/{applicationName}")
		public List<ServiceInstance> ServiceInstancesByApplicationName(
				@PathVariable String applicationName){
			return this.discoveryClient.getInstances(applicationName);
		}
	}
}
