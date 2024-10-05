package com.example.demo.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webapi")
public class HelloController {
	@GetMapping("/greet")
	public Mono<String> greet() {
		return Mono.just("Welcome to First MicroService");
	}
	@GetMapping("/ListStrings")
	public Flux<List<String>> print(){
		List<String> languages=new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C#");
		return Flux.just(languages);
	}
}
