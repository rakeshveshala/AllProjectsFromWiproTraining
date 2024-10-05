package com.wipro.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/greeting")
	public Mono<String> greeting() {
		return Mono.just("Hello, Reactive World!");
	}
	/*
	 * @GetMapping("/greeting") 
	 * public String greet() { 
	 * return "Hello";
	 * }
	 */
	@GetMapping("/retreivList")
	public Mono<List<String>> data() {
	List<String> astr=new ArrayList<>();
	astr.add("welcome");
	astr.add("Java");
	astr.add("net");
	return Mono.just(astr);
	}
}