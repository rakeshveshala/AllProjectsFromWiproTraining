package com.wipro.demo.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.dao.ProductRepository;
import com.wipro.demo.model.Product;


@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productrep;

	@PostMapping("/insertProduct")
	public Product insertData(@RequestBody Product p) {
		p.setSellingprice(productrep.calculateSellingPrice(p.getBuyingprice()));
//		System.out.println("Selling price is "+p.getSellingprice());
		return productrep.save(p);
	}

	@GetMapping("/retreiveData")
	public List<Product> displayDetails() {
		return productrep.findAll();
	}
	
	@GetMapping("/data/{productid}")
	public Product findData(@PathVariable("productid") int id) {
		Product p = productrep.findById(id).get();
		return p;
	}
	
	@GetMapping("/byname/{productname}")
	public List<Product> byName(@PathVariable("productname") String pname){
		return productrep.findByProductname(pname);
	}

	@GetMapping("/caculateTotal")
	public String displayTotal() {
		return "Total Amount spent on products is " + productrep.calculateTotal();
	}
	@GetMapping("/profitDetailes")
	public List<Object> findProfits(){
		return productrep.findDetails();	
	}
	@GetMapping("/sortedData")
	public List<Product> findSorted(){
		return productrep.findByOrderByBuyingpriceAsc();
	}
	@GetMapping("/findBycategory/{category}")
	public List<Product> findByCat(@PathVariable("category") String cat){
		return productrep.findByCategory(cat);
	}
	@GetMapping("/findByPrice/{price}")
	public List<Product> findByPrice(@PathVariable("price") double bprice){
		return productrep.findByBuyingprice(bprice);
	}
}