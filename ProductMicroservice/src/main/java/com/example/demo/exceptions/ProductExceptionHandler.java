package com.example.demo.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> excepionHandler(ProductNotFoundException ex) {
		return new ResponseEntity<>("Not able to find Product", HttpStatus.NOT_FOUND);
	}

}