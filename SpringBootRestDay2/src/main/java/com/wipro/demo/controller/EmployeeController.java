package com.wipro.demo.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.dao.EmployeeRepository;
import com.wipro.demo.exceptions.EmployeeNotFoundException;
import com.wipro.demo.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeRepository emprep;
	
	@GetMapping("/retreive/{empid}")
	public Employee retreiveData(@PathVariable("empid")int eid){
		Employee findemp=emprep.findById(eid).orElseThrow(()->new EmployeeNotFoundException());
		return findemp;
	}
	
	@GetMapping("/retreiveAll")
	public List<Employee> retreiveAllEmployees() {
		return emprep.findAll();
	}

	@PostMapping("/insert")
	public Employee insertData(@RequestBody Employee e) {
		return emprep.save(e);
	}

	@DeleteMapping("/Delete/{empid}")
	public void deleteData(@PathVariable("empid") int id) {
		emprep.deleteById(id);
	}

	@PutMapping("/Update/{empid}")
	public Employee updateData(@PathVariable("empid") int id, @RequestBody Employee eupdate) {
		Optional<Employee> data = emprep.findById(id);
		Employee updatedEmployee = null;
		if (data.isPresent()) {
			updatedEmployee = data.get();
			updatedEmployee.setEmpid(eupdate.getEmpid());
			updatedEmployee.setEmpname(eupdate.getEmpname());
			updatedEmployee.setSalary(eupdate.getSalary());
			updatedEmployee.setDepartmentname(eupdate.getDepartmentname());
			updatedEmployee.setAddress(eupdate.getAddress());
			emprep.save(updatedEmployee);
		}
		return updatedEmployee;
	}

	@PostMapping("/multipleinsert")
	public List<Employee> insertData(@RequestBody ArrayList<Employee> emplist) {
		return emprep.saveAllAndFlush(emplist);
	}

	@GetMapping("/sortedData")
	public List<Employee> retreiveData() {
		return emprep.findByOrderBySalaryAsc();
	}
	@GetMapping("/findByDept/{deptname}")
	public List<Employee> retreiveDataByDepartmentname(@PathVariable("deptname") String name) {
		return emprep.findByDepartmentname(name);
	}
	@GetMapping("/sortedBySalaryTop2")
	public List<Employee> retreiveDataTop2Salary() {
		return emprep.findTop3ByOrderBySalaryDesc();
	}
	@GetMapping("/findyByEmpidAndEmpname/{empid},{empname}")
	public List<Employee> retreiveIdName(@PathVariable("empid")int id,@PathVariable("empname") String name)
	{
		return emprep.findByEmpidAndEmpname(id, name);
	}
	@GetMapping("/retreiveEmplyees")
	public List<Employee> retreiveBySalary(){
		return emprep.getDetails();
	}
}