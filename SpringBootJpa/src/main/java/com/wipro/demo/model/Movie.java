package com.wipro.demo.model;

import jakarta.persistence.*;

@Entity 
@Table(name="MovieTable")
public class Movie { 
	@Id //it will make movie code as primary key 
	@Column(name="MovieCode")
private int moviecode; 
	@Column(name="MovieTitle")
private String movietitle;  
	@Column(name="MoviePrice")
private double price; 
	@Column(name="MovieDuration")
private int duration;
public int getMoviecode() {
	return moviecode;
}
public void setMoviecode(int moviecode) {
	this.moviecode = moviecode;
}
public String getMovietitle() {
	return movietitle;
}
public void setMovietitle(String movietitle) {
	this.movietitle = movietitle;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
}