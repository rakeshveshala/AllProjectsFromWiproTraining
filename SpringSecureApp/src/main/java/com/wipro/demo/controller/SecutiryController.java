package com.wipro.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecutiryController {
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome this point is not secure";
	}

	@GetMapping("/userPage")
	@PreAuthorize("hasAnyRole('USER','ADMIN')")
	public String userProfile() {
		return "Welcome to User Page";
	}

	@GetMapping("/adminPage")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminProfiles() {
		return "Welcome to Admin page";
	}
}