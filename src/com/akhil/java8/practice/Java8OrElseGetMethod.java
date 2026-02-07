package com.akhil.java8.practice;

import java.util.List;
import java.util.Optional;

public class Java8OrElseGetMethod {
	
	public static void main(String[] args) throws IllegalArgumentException {
		
		List<Employee> employeeList = EmployeeDataBase.getemployeeList();
		
		/*orElse() eagerly evaluates the default value,
		 while orElseGet() evaluates it lazily and only when the Optional is empty.
		 In terms or DB /API calls orElse() can be expensive
		*/
		Optional<Employee> employee = Optional.ofNullable(employeeList.stream().filter(e -> e.getAge() > 19).findFirst().orElseGet(() -> new Employee("Akash", 50)));
		System.out.println("Employee Name :: "+employee.get().getName());
		
		//orElseThrow throws exception in case element is not Found
		Optional<Employee> employee1 = Optional.ofNullable(employeeList.stream().filter(e -> e.getAge() > 80).findFirst().orElseThrow(() -> new IllegalArgumentException("Employee with age > 19 not found")));
		System.out.println("Employee Name :: "+employee1.get().getName());
	}

}
