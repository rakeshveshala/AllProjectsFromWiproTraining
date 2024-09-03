package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.*;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.*;

import myspring.controller.Product;

@Repository
public class ProductRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Product> findAll(){
		String query="select * from product";
		return jdbcTemplate.query(query, new ProductRowMapper());
	}
	public int insertData(Product p){
		String sqlquery="insert into product values(?,?,?,?)";
		return jdbcTemplate.update(sqlquery,p.getProductid(),p.getProductname(),p.getPrice(),p.getQuantity());
	}
	public int deleteData(Product p){
		String deletequery="delete from product where productid=?";
		return jdbcTemplate.update(deletequery,p.getProductid());
	}
}	
class ProductRowMapper implements RowMapper<Product>{
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		//TODO Auto-generated method stub
				Product p = new Product();
				p.setProductid(rs.getInt(1));
				p.setProductname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQuantity(rs.getInt(4));
				return p;
	}

}