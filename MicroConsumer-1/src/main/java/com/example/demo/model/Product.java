package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Product {
@Id
private int productid;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
private String productname;
private double price;
private int quantity;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
