package com.wipro.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "AddressRelation")
public class Address {
	@Id
	@Column(name = "addcode")
	private int addresscode;
	public int getAddresscode() {
		return addresscode;
	}
	public void setAddresscode(int addresscode) {
		this.addresscode = addresscode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String city;
	private String state;
}