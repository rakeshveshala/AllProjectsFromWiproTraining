package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.College;
import com.example.demo.model.Student;
import com.example.demo.repositories.CollegeRepository;

@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeRepository crep;
	String url = "http://localhost:8081/subjects";
	@Autowired
	RestTemplate template;
	
	@PostMapping("/insertCollege")
	public College insert(@RequestBody College col) {
		return crep.save(col);
	}
	@GetMapping("/byId/{id}")
	public Optional<College> byId(@PathVariable("id") int id){
		return crep.findById(id);
	}
	
	@GetMapping("/displayData/{id}")
	public Student getData(@PathVariable("id") int id) {
		return template.getForObject(url + "/byCode"+id, Student.class);
	}
}
