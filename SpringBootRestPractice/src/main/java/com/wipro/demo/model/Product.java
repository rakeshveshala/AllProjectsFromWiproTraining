package com.wipro.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product11")
public class Product {
	@Id
	private int productid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProfuctname() {
		return profuctname;
	}
	public void setProfuctname(String profuctname) {
		this.profuctname = profuctname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String profuctname;
	private double price;
}
