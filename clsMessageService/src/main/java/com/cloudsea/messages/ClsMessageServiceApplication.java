package com.cloudsea.messages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Shahbaz Khan
 *
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cloudsea.*")
public class ClsMessageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClsMessageServiceApplication.class, args);
	}
}
