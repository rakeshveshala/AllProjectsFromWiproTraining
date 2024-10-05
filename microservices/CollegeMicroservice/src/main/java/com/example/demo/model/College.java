package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="College")
public class College {
	@Id
	private int collegecode;
	public int getCollegecode() {
		return collegecode;
	}
	public void setCollegecode(int collegecode) {
		this.collegecode = collegecode;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String collegename;
	private String city;
	
}
