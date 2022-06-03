package com.hexaware.test.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionHandlingService {

	public String getResponse(String code) {
		if (code.equals("401")) {
			return "error message:you are not authorized";
		}
		else if(code.equals("404")) {
			return "errorMessage:resource not found";
		}
		else {
			return "no such code exists";
		}
	}
}
