package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;

import com.example.demo.model.Product;
import com.example.demo.repositories.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@EnableWebFlux
@RequestMapping("/productapi")
public class ProductController {
	@Autowired
private ProductRepository productRepository;
	@GetMapping("/retriveProducts")
	public Flux<Product> getAllProducts()
	{
		return productRepository.findAll();
	} 
	@GetMapping("/findByProductid/{productid}")
	public Mono<Product> retriveData(@PathVariable("productid")int pid ) 
	{
		return productRepository.findById(pid);
	} 
	@PostMapping("/insertData")
	public Mono<Product> insertData(@RequestBody Product p)
	{
		return productRepository.save(p);
	}
}
