package com.example.demo.model;
import jakarta.persistence.*;


@Entity
@Table (name="BookPojo")
public class Book {
@Id
private int bookno;
private String bookTitle;
public int getBookno() {
	return bookno;
}
public void setBookno(int bookno) {
	this.bookno = bookno;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
private double price;
private String authorname;
}