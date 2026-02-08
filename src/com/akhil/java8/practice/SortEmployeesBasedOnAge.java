package com.akhil.java8.practice;

import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesBasedOnAge {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeDataBase.getemployeeList();
		
		employeeList = employeeList.stream().sorted((o1 ,o2) -> o2.getAge() - o1.getAge()).skip(2).limit(3).collect(Collectors.toList());
		System.out.println("Sorted employee List :: "+employeeList);
		
	}

}
