package com.akhil.java8.practice;

import java.util.List;

public class EmployeeDataBase {

	public static List<Employee> getemployeeList(){
		
		Employee e1 = new Employee("Akhil", 29);
		Employee e2 = new Employee("Akash", 30);
		Employee e3 = new Employee("Ssnket", 39);
		Employee e4 = new Employee("Piyush", 29);
		Employee e5 = new Employee("Indra", 29);
		Employee e6 = new Employee("Akhil", 29);

		List<Employee> employeeList = List.of(e1, e2, e3, e4, e5, e6);
		
		return employeeList;
	}
	
	public List<Integer> getAgesList(){
		
		List<Integer> integerList = List.of(10 , 5, 7,1,2,6);
		return integerList;
	}
	
}
