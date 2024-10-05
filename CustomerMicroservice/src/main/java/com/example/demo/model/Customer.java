package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="CustomerMicro")
public class Customer {
	@Id
	private int custcode;
	public int getCustcode() {
		return custcode;
	}
	public void setCustcode(int custcode) {
		this.custcode = custcode;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	private String custname;
	private String mobile;
}
