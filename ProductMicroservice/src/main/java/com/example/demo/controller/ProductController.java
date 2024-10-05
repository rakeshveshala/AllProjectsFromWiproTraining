package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.exceptions.ProductNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repositories.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productrep;

    // Retrieve all products
    @GetMapping("/retrieveProducts")
    public ResponseEntity<List<Product>> retrieveData() {
        List<Product> productList = productrep.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    // Insert a new product
    @PostMapping("/insertProduct")
    public Product insertData(@RequestBody Product p) {
        return productrep.save(p);
    }

    // Update a product
    @PutMapping("/updateProduct/{pid}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product p, @PathVariable("pid") int id) {
        Product findProduct = productrep.findById(id)
                .orElseThrow(() -> new ProductNotFoundException());
        
        findProduct.setProductname(p.getProductname());
        findProduct.setQuantity(p.getQuantity());
        findProduct.setPrice(p.getPrice());
        
        Product updatedProduct = productrep.save(findProduct);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    // Retrieve a product by ID
    @GetMapping("/findById/{id}")
    public Product retrieveById(@PathVariable("id") int productid) {
        return productrep.findById(productid)
                .orElseThrow(() -> new ProductNotFoundException());
    }
    @GetMapping("/orderPrice")
    public ResponseEntity<List<Product>> retriveByOrder(){
    	List<Product> plist = productrep.findByOrderByPriceAsc();
    	return new ResponseEntity<>(plist,HttpStatus.OK);
    }
}