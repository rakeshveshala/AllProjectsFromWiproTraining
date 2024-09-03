package com.wipro.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.dao.MovieRepository;
import com.wipro.demo.model.Movie;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movierep;
	public void insertData(Movie m) {
		movierep.save(m);
	}
	
}