package com.wipro.demo.controller;

import java.util.*;
	
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.dao.BookRepository;
import com.wipro.demo.model.Book;


@RestController
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
	BookRepository brep;
	@PostMapping("/insertBooks")
	public Book insertData(@RequestBody Book b) {
		return brep.save(b);
	}
	@DeleteMapping("/Delete/{bookid}")
	public void deleteData(@PathVariable("bookid") int id) {
		brep.deleteById(id);
	}
	
 	@PutMapping("/Update/{empid}")
	public Book updateData(@PathVariable("empid") int id, @RequestBody Book eupdate) {
		Optional<Book> data = brep.findById(id);
		Book updatedEmployee = null;
		if (data.isPresent()) {
			updatedEmployee = data.get();
			updatedEmployee.setTitle(eupdate.getTitle());
			updatedEmployee.setPrice(eupdate.getPrice());
			updatedEmployee.setAthor(eupdate.getAthor());
			updatedEmployee.setPublication(eupdate.getPublication());
			brep.save(updatedEmployee);
		}
		return updatedEmployee;
	}
	
}
