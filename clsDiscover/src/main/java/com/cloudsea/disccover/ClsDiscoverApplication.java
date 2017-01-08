package com.cloudsea.disccover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClsDiscoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClsDiscoverApplication.class, args);
	}
}
