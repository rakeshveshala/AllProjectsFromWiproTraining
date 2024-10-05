package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@RestController
@RequestMapping("/Book")
public class BookController {
	@Autowired
	BookRepository brep;
	
	@PostMapping("/insertData")
	public Book insertBooks(@RequestBody Book b){
		return brep.save(b);
	}
	@GetMapping("/getDetails")
	public List<Book> getBooks(){
		return brep.findAll();	
	}
	@DeleteMapping("/delete/{del}")
	public void deleteById(@PathVariable("del") int id) {
		brep.deleteById(id);
	}
	@PutMapping("/update/{uid}")
	public Book updateData(@PathVariable("uid") int id, @RequestBody Book bupdate) {
		Optional<Book> data = brep.findById(id);
		Book updatedBook = null;
		if (data.isPresent()) {
			updatedBook = data.get();
			updatedBook.setBookTitle(bupdate.getBookTitle());
			updatedBook.setPrice(bupdate.getPrice());
			updatedBook.setAuthorname(bupdate.getAuthorname());
			brep.save(updatedBook);
		}
		return updatedBook;
	}
}
