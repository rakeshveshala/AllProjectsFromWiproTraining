package com.wipro.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Springbootemp")
public class Employee {
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	@Id
	@Column(name = "Employeeid")
	private int empid;
	@Column(name = "EmployeeName")
	private String empname;
	@Column(name = "Salary")
	private double salary;
	@Column(name = "Address")
	private String address;
	@Column(name = "departmentName")
	private String departmentname;
}