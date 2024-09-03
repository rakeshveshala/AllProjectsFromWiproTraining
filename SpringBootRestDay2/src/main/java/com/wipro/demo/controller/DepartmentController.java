package com.wipro.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.demo.model.Department;
import com.wipro.demo.dao.DepartmentRepository;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentRepository deptrep;

	@PostMapping("/insertDepartment")
	public Department saveDepartment(@RequestBody Department d) {
		return deptrep.save(d);
	}
}