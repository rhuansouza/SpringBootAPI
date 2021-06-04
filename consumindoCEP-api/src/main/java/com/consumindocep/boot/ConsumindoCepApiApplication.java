package com.consumindocep.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumindoCepApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoCepApiApplication.class, args);
	}

}
