package com.wipro.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
