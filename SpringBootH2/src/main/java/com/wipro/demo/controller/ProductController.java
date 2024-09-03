package com.wipro.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.model.Product;
import com.wipro.demo.model.ProductRepository;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productrep;
	
	@Operation(summary="Insert products into database",
			description="to insert products into database table")
	@PostMapping("/insertProduct")
	public Product insertData(@RequestBody Product p) {
		return productrep.save(p);
	}
	@Operation(summary="Retreiving All Products",
			description="Retreiving All Products from the database table")
	@GetMapping("/retrieveAll")
	public List<Product> retreiveAllProducts(){
		return productrep.findAll();
	}
	@Operation(summary="Retreiving Product by Id",
			description="Retreiving Particular product by its ProductId")
	@GetMapping("/retreiveById/{pid}")
	public Product retreiveById(@PathVariable("pid") int id)
	{
		Optional<Product> pro=productrep.findById(id);
		return pro.get();
	}
	@Operation(summary="Retreiving Product by Product Name",
			description="Retreiving Particular product By Product Name")
	@GetMapping("/retreivebyname/{productname}")
	public List<Product> retreiveByProductName(@PathVariable("productname") String name){
		return productrep.findByProductname(name);
	}
	@Operation(summary="Retreiving Products In The Order  ",
			description="Retreiving Products In Ascending order Of Price")
	@GetMapping("/retreiveorderbypiceOrder")
	public List<Product> retreiveBySalaryOrder(){
		return productrep.findByOrderByPriceAsc();
	}
	
}