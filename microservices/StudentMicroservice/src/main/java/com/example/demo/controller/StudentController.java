package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentRepository srep;
	
	@PostMapping("/insert")
	public Student insertStudents(@RequestBody Student s) {
		return srep.save(s);
	}
	@GetMapping("/findById/{id}")
	public Optional<Student> byId(@PathVariable("id") int id){
		return srep.findById(id);
	}
}

