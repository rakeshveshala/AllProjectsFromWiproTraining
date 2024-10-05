package com.example.demo;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class ConfigurationDemo {
@Bean 
public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
return builder.routes().route("ProductMicroservices" ,r->r.path("/products/**")
		.uri("http://localhost:8010/")
		)
		.route("Customer Microservice", r-> r.path("/customer/**") 
				.uri("http://localhost:8020/"))
		.build();
		
}
}