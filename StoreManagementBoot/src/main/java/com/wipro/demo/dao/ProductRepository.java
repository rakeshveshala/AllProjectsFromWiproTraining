package com.wipro.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wipro.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	@Query
	("select ((:price*0.5)+:price)")
	public double calculateSellingPrice(@Param("price") double buyingprice);
	
	public List<Product> findByProductname(String pname);
	
	@Query
	("select sum(p.buyingprice) from Product p")
	public double calculateTotal();
	
	@Query("select sum(p.sellingprice-p.buyingprice),p.category from Product p group by p.category")
	public List<Object> findDetails();
	
	public List<Product> findByOrderByBuyingpriceAsc();
	
	public List<Product> findByCategory(String cat);
	
	public List<Product> findByBuyingprice(double bprice);
}
