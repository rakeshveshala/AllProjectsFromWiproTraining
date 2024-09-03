package com.wipro.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> exceptionHandling(EmployeeNotFoundException ex) {
		return new ResponseEntity<>("Employee Not Found", HttpStatus.NOT_FOUND);
	}
}