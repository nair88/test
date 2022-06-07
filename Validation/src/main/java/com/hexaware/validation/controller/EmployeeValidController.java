package com.hexaware.validation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.validation.entity.Employee;
import com.hexaware.validation.service.EmployeeService;

@RestController
public class EmployeeValidController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(method=RequestMethod.POST,value="/employee")
public ResponseEntity<String> addEmployee(@RequestBody @Valid Employee employee) {
	return employeeService.addEmployee(employee);
	
}
}
