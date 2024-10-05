package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	private int studentcode;
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
	public int getStudentscore() {
		return studentscore;
	}
	public void setStudentscore(int studentscore) {
		this.studentscore = studentscore;
	}
	private String studentname;
	private int studentscore;
}
