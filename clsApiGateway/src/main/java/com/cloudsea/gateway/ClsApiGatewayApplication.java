package com.cloudsea.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan("com.cloudsea.*")
@EnableCircuitBreaker
public class ClsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClsApiGatewayApplication.class, args);
	}

}
