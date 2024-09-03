package com.wipro.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/home")
	public String getPage() {
		return "Welcome to Spring Security";
	}
}