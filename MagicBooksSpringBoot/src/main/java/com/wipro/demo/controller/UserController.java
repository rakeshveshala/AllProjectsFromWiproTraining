package com.wipro.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.dao.BookRepository;
import com.wipro.demo.model.Book;

@RestController
@RequestMapping("/User")
public class UserController {
	private List<Book> favouritebooks;
	@Autowired
	BookRepository brep;

	@GetMapping("/retreiveAll")
	public List<Book> retreiveAllBooks() {
		return brep.findAll();
	}
	@GetMapping("/findByAuthor/{athor}")
	public List<Book> retreiveByAuthor(@PathVariable("athor") String author)
	{
		return brep.findByAthor(author);
	}
	@GetMapping("/findByTitle/{title}")
	public List<Book> retreiveByTitle(@PathVariable("title")String title)
	{
		return brep.findByTitle(title);
	}
	@GetMapping("/findByPublication/{publication}")
	public List<Book> retreiveByPublication(@PathVariable("publication")String pub)
	{
		return brep.findByPublication(pub);
	}
	@GetMapping("/findByPrice/{price}")
	public Optional<Book> retreiveByPrice(@PathVariable("price")double price)
	{
		return brep.findByPrice(price);
	}
	@GetMapping("/sortedData")
	public List<Book> retreivePrices()
	{
		return brep.findByOrderByPriceAsc();
	}
	@PostMapping("/addtoFavourite")
	public List<Book> addbooks(@RequestBody List<Book> list)
	{
		favouritebooks=new ArrayList<>();
		favouritebooks.addAll(list);
		return favouritebooks;
	}
	@GetMapping("/retreiveBooks")
	public List<Book> retreiveByPriceRange()
	{
		return brep.getDetails();
	}

}