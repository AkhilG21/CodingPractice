package com.akhil.java8.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Java8SummaryStatistics {
	
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDataBase.getemployeeList();
		List<Integer> agesList = employeeList.stream().map(e -> e.getAge()).collect(Collectors.toList());

		System.out.println("Ages List : "+agesList);
		
		//SummaryStatistics only work on Integers
		int maxInt = agesList.stream().mapToInt(x -> x).summaryStatistics().getMax();
		System.out.println("Max Integer value : "+maxInt);
		
		long sum = agesList.stream().mapToInt(x -> x).summaryStatistics().getSum();
		System.out.println("Sum Integer value : "+sum);
		
		//Slicing Operations
		List<Integer> slicedValues = agesList.stream().distinct().sorted().skip(1).limit(2).collect(Collectors.toList());
		System.out.println("Sliced Integer value : "+slicedValues);
		
		
		//Generate String using Delimiter as double quotes with employee name;
		String nameOfemployee = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining(", "));
		System.out.println("Employee Name : "+nameOfemployee);
			
		
	}
	
	
}
