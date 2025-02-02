package com.wipro.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.dao.StudentRepository;
import com.wipro.demo.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentRepository studentrep;

	@PostMapping("/insertStudent")
	public Student insertData(@RequestBody Student s) {
		return studentrep.save(s);
	}
}