package com.wipro.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

	List<Book> findByAthor(String author);

	List<Book> findAll();
	
	List<Book> findByTitle(String title);
	
	List<Book> findByPublication(String pub);
	
	Optional<Book> findByPrice(double price);
	
	public List<Book> findByOrderByPriceAsc();
	
	@Query("select b from Book b where b.price between 1000 and 3000")
	public List<Book> getDetails();
}
