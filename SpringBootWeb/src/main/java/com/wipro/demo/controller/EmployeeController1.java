package com.wipro.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController1 {
	String empname="Rakesh veshala";
	@RequestMapping("/show")
	public ModelAndView display() {
		return new ModelAndView("Display", "empdata", empname);
	}
}
