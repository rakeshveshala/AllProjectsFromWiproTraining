package com.pizzastore.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pizzastore.model.Validate;


@Controller
public class AdminLogInController {


	@RequestMapping("/Check")
	public ModelAndView displayForm() {
		return new ModelAndView("Validate", "checkObj", new Validate());
	}

	@RequestMapping(value = "/checkAdmin", method = RequestMethod.POST)
	public String insertMovie(@ModelAttribute("checkObj") Validate val) {
		//System.out.println(val.getPassword());
		//System.out.println(val.getUserName());
		if((val.getUserName().equalsIgnoreCase("admin")) && (val.getPassword().equalsIgnoreCase("admin"))) {
			return "AdminPage";
		}
		return "Validate2";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String insertMovie1() {
		return "Register";
	}
}
