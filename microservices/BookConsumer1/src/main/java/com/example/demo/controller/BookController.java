package com.example.demo.controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Book;
import com.example.demo.model.Cat;

@RestController
@RequestMapping("/consumer")
public class BookController {
	String url = "http://localhost:8090/Book";

	@Autowired
	RestTemplate template;

	@GetMapping("/displayData")
	public List<Book> getData() {
		Book bookarr[] = template.getForObject(url + "/getDetails", Book[].class);

		return Arrays.asList(bookarr);
	}

	@GetMapping("/catData")
	public Cat displayData(){
	Cat cat=template.getForObject("https://catfact.ninja/fact", Cat.class);
	return cat;
	}

}