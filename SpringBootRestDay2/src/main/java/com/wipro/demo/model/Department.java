package com.wipro.demo.model;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "DepartmentOnetomany")
public class Department {
	@Id
	@Column(name = "departmentcode")
	private int deptcode;
	private String deptname;
	public int getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	private String city;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentcode")
	private List<Employee> elist;
}
