package com.akhil.java8.practice;

import java.util.List;
import java.util.Optional;

public class Java8IsPresent {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeDataBase.getemployeeList();
		Optional<Employee> employee = employeeList.stream().filter(e -> e.getAge() > 10).findFirst();
		
		employee.ifPresentOrElse(e -> employee.get().getName(), () -> System.out.println("Employee age greater than 90 Not found"));
		System.out.println("Employee :: "+employee.get());

	}

}
