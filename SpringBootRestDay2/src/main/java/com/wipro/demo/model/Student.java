package com.wipro.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "StudentRelation")
public class Student {
	@Id
	private int studentcode;
	private String studentname;
	private int score;
	@OneToOne(targetEntity=Address.class, cascade=CascadeType.ALL)
	@JoinColumn(name="addcode")
	private Address addobj;
	public int getStudentcode() {
		return studentcode;
	}
	public void setStudentcode(int studentcode) {
		this.studentcode = studentcode;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Address getAddobj() {
		return addobj;
	}
	public void setAddobj(Address addobj) {
		this.addobj = addobj;
	}
	
}