package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/getData")
public class WebClientController {
	String serviceUrl="http://localhost:8030/productapi";
	private WebClient webclient;
	public WebClientController(WebClient.Builder webclientbuilder) 
	{
		this.webclient=webclientbuilder.baseUrl(serviceUrl).build();
	} 
	@GetMapping("/fetch-data")
	public Flux<String> fetchData()
	{
		return webclient.get().uri("/retriveProducts").retrieve().bodyToFlux(String.class);
	}
	@GetMapping("/fetchById/{productid}")
	public Mono<Product> fetchById(@PathVariable("productid")int pid)
	{
		return webclient.get().uri("/findByProductid/"+pid).retrieve().bodyToMono(Product.class);
	}
}
