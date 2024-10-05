package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlingException {
@ExceptionHandler(Exception.class) 
public ResponseEntity<String> ex(Exception e) 
{
	return new ResponseEntity<>("NotAble to findProduct",HttpStatus.NOT_FOUND);
}
}