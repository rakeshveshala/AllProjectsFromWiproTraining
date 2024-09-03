package com.wipro.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.demo.dao.EmployeeDAO;
import com.wipro.demo.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAO emprep;
	@RequestMapping("/hello")
	public String getPage() {
		System.out.println("coming");
		return "Welcome";
	}
	@RequestMapping("/empdata")
	public ModelAndView display() {
		Employee e=new Employee();
		e.setEmpid(1);
		e.setEmpname("Rakesh veshala");
		e.setSalary(60000);
		return new ModelAndView("EmployeeFirst","edata",e);
	}
	@RequestMapping("/EmpForm") //THIS AND FOLLOWING BELOW METHOD RELATED, WHEN THIS PAGE LOADED IT GOES TO EMPLOYEEFORM JSP PAGE AND THERE IT SEES ACTION isertEmployee THEN THE FOLLOWING MAPPING EXECUTES
	public ModelAndView displayForm(){
		return new ModelAndView("EmployeeForm", "eobj", new Employee());
	}
	@RequestMapping(value="insertEmployee", method=RequestMethod.POST)
	public String insertData(@ModelAttribute("eobj") Employee e1){
		System.out.println("Employee Name is"+e1.getEmpname()); 
		emprep.insertEmployee(e1);
		return "success";
	}
}
