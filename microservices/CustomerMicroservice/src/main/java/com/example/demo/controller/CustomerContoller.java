package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repositories.CustomerRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/customer")
public class CustomerContoller { 
	@Autowired
	CustomerRepository custrep;
	@Autowired 
	RestTemplate template;
	String baseUrl = "http://localhost:8010/products";

	@GetMapping("/retriveCustomer")
	public ResponseEntity<List<Customer>> displayData() {
		return new ResponseEntity<>(custrep.findAll(), HttpStatus.OK);
	}

	@PostMapping("/insertData")
	public Customer insertData(@RequestBody Customer cust) {
		return custrep.save(cust);
	}
	
	@CircuitBreaker(name = "myServiceCircuit Breaker", fallbackMethod = "retreiveData")
	@GetMapping("/ProductListById/{productid}")
	public Product retriveData(@PathVariable("productid") int pid) {
		ResponseEntity<Product> pfind = template.getForEntity(baseUrl + "/findById/" + pid, Product.class);
		if (pfind.getStatusCode() == HttpStatus.OK) {
			return pfind.getBody();
		} else {
			throw new RuntimeException("Exception is " + pfind.getStatusCode());
		}
	}

	@GetMapping("/displayData")
	public List<Product> getData() {
		Product proarr[] = template.getForObject(baseUrl + "/orderPrice", Product[].class);

		return Arrays.asList(proarr);
	}
	public Product retreiveData(Throwable throwable) { //Method for circuitBreaker reretreiveData must be same method as in circuit breaker fall back method
		System.out.println("Coming here ");
		Product p=new Product();
		p.setProductname("None");
		return p;
	}
}