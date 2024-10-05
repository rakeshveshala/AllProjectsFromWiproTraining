package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/consumerapi")
public class ConsumerController {
	String serviceUrl = "http://localhost:8871/webapi";
	private WebClient webclient;

	public ConsumerController(WebClient.Builder webclientbuilder) {
		this.webclient = webclientbuilder.baseUrl(serviceUrl).build();
	}

	@GetMapping("/fetch-data")
	public Mono<String> fetchGreet() {
		return webclient.get().uri("/greet").retrieve().bodyToMono(String.class);
	}
	@GetMapping("/fetch-list")
	public Flux<String> printList(){
		return webclient.get().uri("/ListStrings").retrieve().bodyToFlux(String.class);
	}
}
