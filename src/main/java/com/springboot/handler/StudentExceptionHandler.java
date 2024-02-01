package com.springboot.handler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springboot.exception.InvalidFieldException;


@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler
	@ResponseBody
	public String handleInvalidFieldException(InvalidFieldException exception) {
		return exception.getMessage();
	}
}