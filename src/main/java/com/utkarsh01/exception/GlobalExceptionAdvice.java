package com.utkarsh01.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionAdvice {
	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<app>
}
