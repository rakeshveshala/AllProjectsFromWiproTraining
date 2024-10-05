package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subject;
import com.example.demo.repositories.SubjectRepository;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	@Autowired
	SubjectRepository subrep;
	
	@PostMapping("/insertSubjects")
	public Subject insert(@RequestBody Subject sub) {
		return subrep.save(sub);
	}
	@GetMapping("/byCode/{bcode}")
	public Optional<Subject> getByCode(@PathVariable("bcode") int code){
		return subrep.findById(code);
	}
}
