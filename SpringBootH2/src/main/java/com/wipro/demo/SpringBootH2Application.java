package com.wipro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product API", version = "2.0", description = "CRUD API for Product"))
public class SpringBootH2Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2Application.class, args);
	}
}