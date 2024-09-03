package com.wipro.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.model.Movie;

/*
 * Crud repository - contains method which can be used
 *  to insert,delete,update, view operation
 *  
 * Jpa repository-is extending from crud repository which contains 
 * all the methods of crud repository as well as contains pagination
 *  and sorting
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	public Movie findByMovietitle(String name); //FOR REST API AND FOR JPA ITS WITHOUT THIS METHOD
		/*
		 * select form MovieTable where title = "fighter"
		 */
}