package com.wipro.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.demo.model.Movie;
import com.wipro.demo.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	MovieService mservice;

	@RequestMapping("/InsertMovie")
	public ModelAndView displayForm() {
		return new ModelAndView("MovieForm", "movieobj", new Movie());
	}

	@RequestMapping(value = "/MovieData", method = RequestMethod.POST)
	public String insertMovie(@ModelAttribute("movieobj") Movie m) {
//		System.out.println("Movie title is " + m.getMovietitle());
//		System.out.println("Movie code is " + m.getMoviecode());
//		mservice.insertData(m);
		if(m.getDuration()!=m.getPrice()) {
			System.out.println("NOT EQUAL");
			return "success";
		}
		return "succes";
	}
}