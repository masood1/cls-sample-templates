package com.cloudsea.messages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Shahbaz Khan
 *
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cloudsea.*")
@EnableDiscoveryClient
public class ClsMessageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClsMessageServiceApplication.class, args);
	}
}

@RestController
@RefreshScope
class TestControler {

	@Value("${message}")
	private String messageHello;

	@RequestMapping("/hello")
	public String getProertyMessage() {
		return messageHello;
	}

}
