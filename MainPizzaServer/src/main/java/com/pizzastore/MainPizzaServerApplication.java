package com.pizzastore;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MainPizzaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainPizzaServerApplication.class, args);
	}

}
