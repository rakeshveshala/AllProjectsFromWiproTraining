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

import com.wipro.demo.dao.MovieRepository;
import com.wipro.demo.model.Movie;
@RestController
@RequestMapping("/Movies")
public class MovieRestController {
	@Autowired
	MovieRepository movierep;
	@GetMapping("/retreive")
	public List<Movie> retreiveAllData()
	{
		return movierep.findAll();
	}
	@GetMapping("/retreive/{mcode}")
	public ResponseEntity<Object> retreiveById(@PathVariable("mcode") int id)
	{
		Optional<Movie> movieob=movierep.findById(id);
		if(movieob.isEmpty())
		{
			return new ResponseEntity<>("Not Able to Find",HttpStatus.NOT_FOUND);
		}
		return  ResponseEntity.status(201).body(movieob.get());
	}
	@GetMapping("/retreiveByTitle/{title}")
	public ResponseEntity<Movie> retreiveByName(@PathVariable("title") String title)
	{
		Movie movieob=movierep.findByMovietitle(title);
	    return ResponseEntity.status(201).body(movieob);
	}
	@PostMapping("/insertData")
	public Movie insertData(@RequestBody Movie moviedata)
	{
		return movierep.save(moviedata);
	}
	

}