package com.wipro.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.dao.ProductRepository;
import com.wipro.demo.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository prep;
	@PostMapping("/insert")
	public Product insertProduct(@RequestBody Product p){
		return prep.save(p);
	}
	@PutMapping("/update/{productid}")
	public Product updateProduct(@PathVariable("productid") int id,@RequestBody Product pupdate) {
		Optional<Product> data = prep.findById(id);
		Product pupdated = null;
		if(data.isPresent()) {
			pupdated=data.get();
			pupdated.setPrice(pupdate.getPrice());
			pupdated.setProfuctname(pupdate.getProfuctname());
			prep.save(pupdated);
		}
		return pupdated;
	}
}
