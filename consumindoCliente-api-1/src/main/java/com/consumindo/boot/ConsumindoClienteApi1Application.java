package com.consumindo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumindoClienteApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoClienteApi1Application.class, args);
	}
	
	 @Bean
	 public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	 }

}
