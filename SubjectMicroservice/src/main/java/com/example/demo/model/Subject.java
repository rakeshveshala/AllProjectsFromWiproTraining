package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SubjectMs")
public class Subject {
	@Id
	private int subjectcode;
	public int getSubjectcode() {
		return subjectcode;
	}
	public void setSubjectcode(int subjectcode) {
		this.subjectcode = subjectcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String title;
	
}
