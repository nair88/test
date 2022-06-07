package com.hexaware.validation.service;
import com.hexaware.validation.entity.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
List<Employee> empList=new ArrayList<Employee>();
public ResponseEntity<String> addEmployee(Employee employee) {
	empList.add(employee);
	return ResponseEntity.ok("status:valid");
	
}
}
