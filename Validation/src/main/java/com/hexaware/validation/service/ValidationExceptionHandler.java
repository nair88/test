package com.hexaware.validation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.hexaware.validation.entity.ErrorDetails;

@ControllerAdvice
public class ValidationExceptionHandler {
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<Object> handleExceptions(MethodArgumentNotValidException ex,WebRequest request) {
		List<String> errors=new ArrayList<String>();
		    ex.getBindingResult().getAllErrors().forEach((error) -> {
		        String errorMessage = error.getDefaultMessage();
		        errors.add(errorMessage);
		    });
	       ErrorDetails errorDetails = new ErrorDetails("Error",errors.toString());
	        return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
	        //return errorDetails;
	    }

}
