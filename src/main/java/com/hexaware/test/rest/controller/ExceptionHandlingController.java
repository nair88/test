package com.hexaware.test.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.test.rest.service.ExceptionHandlingService;

@RestController
public class ExceptionHandlingController {
	@Autowired
public ExceptionHandlingService exceptionHandlingService;
	@RequestMapping(method=RequestMethod.GET,value="/api/testExceptionHandling")
	public String getResponse(@RequestParam("code") String code) {
		String result=exceptionHandlingService.getResponse(code);
		return result;
	}

}
