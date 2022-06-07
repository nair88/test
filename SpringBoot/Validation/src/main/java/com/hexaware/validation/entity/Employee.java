package com.hexaware.validation.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Employee {
	@Size(min=4,message="name should be at least 4")
     String name;
	@Email
		String email;
		@Min(value=1000,message="salary should be greater than 1000")
		double salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		public Employee(String name, String email, long salary) {
			super();
			this.name = name;
			this.email = email;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + "]";
		}

	}



