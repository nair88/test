package com.assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Functionalites {

	public Map<String, Long> countEmployees(List<Employee> list) {
		Map<String, Long> empCount = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		return empCount;
	}

	public Map<String, List<String>> listEmployees(List<Employee> list) {
		Map<String, List<String>> empName = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));
		return empName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = new ArrayList<Employee>();

		employee.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employee.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employee.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employee.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employee.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employee.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employee.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employee.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employee.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));
		Functionalites f = new Functionalites();
		System.out.println("***count of department***");
		Map<String, Long> map = f.countEmployees(employee);
		map.forEach((k, v) -> System.out.println("dept " + k + " " + "count " + v));
		System.out.println("***employee names in department***");
		Map<String, List<String>> mapName = f.listEmployees(employee);
		mapName.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
