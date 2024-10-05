package com.pizzastore.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pizzastore.model.Validate;




@Controller
public class CustLogInController {


	@RequestMapping("/CheckCustomer")
	public ModelAndView displayForm() {
		return new ModelAndView("Validate", "checkObj", new Validate());
	}

	@RequestMapping(value = "/customerCheck", method = RequestMethod.POST)
	public String insertMovie(@ModelAttribute("checkObj") Validate val) {
		//System.out.println(val.getPassword());
		//System.out.println(val.getUserName());
		if((val.getUserName().equalsIgnoreCase("customer")) && (val.getPassword().equalsIgnoreCase("customer"))) {
			return "Customer";
		}
		return "Validate2";
	}
}
