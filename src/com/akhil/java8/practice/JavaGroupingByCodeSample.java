package com.akhil.java8.practice;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;



public class JavaGroupingByCodeSample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Akhil", 29);
		Employee e2 = new Employee("Akash", 30);
		Employee e3 = new Employee("Ssnket", 39);
		Employee e4 = new Employee("Piyush", 29);
		Employee e5 = new Employee("Indra", 29);
		Employee e6 = new Employee("Akhil", 29);

		List<Employee> employeeList = List.of(e1, e2, e3, e4, e5, e6);
		
		Map<Integer, List<Employee>> employeeMapList = employeeList.stream().collect(Collectors.groupingBy(e -> e.getAge()));
		System.out.println("EmployeeGroupedByMap"+employeeMapList);

		
		Map<Integer, Set<Employee>> employeeMapByAge = employeeList.stream().collect(Collectors.groupingBy(x -> x.getAge(),Collectors.toSet()));
		System.out.println("EmployeeGroupedByMap"+employeeMapByAge);

		
		Map<Integer, Set<Employee>> sortedEmployeeMap = employeeList.stream().collect(Collectors.groupingBy(x -> x.getAge(), TreeMap::new,Collectors.toSet()));
		System.out.println("EmployeeGroupedByMap"+sortedEmployeeMap);
	}

}
