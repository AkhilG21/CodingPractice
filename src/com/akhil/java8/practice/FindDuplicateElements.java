package com.akhil.java8.practice;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeDataBase.getemployeeList();
		List<String> duplicateemployeeNames = employeeList
				.stream().map(e -> e.getName()).collect(Collectors.toList());
		
		/*Set<String> namesSet = new HashSet();
		duplicateemployeeNames = duplicateemployeeNames.stream().filter(e -> !namesSet.add(e)).collect(Collectors.toList());
		
		System.out.println("Duplicate List : "+duplicateemployeeNames);*/
		
		
		//Use GroupingBY
		Map<String, Long> employeeMap = duplicateemployeeNames.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println("Employee Map :: "+employeeMap);
		Set<String> employeeSet = employeeMap.entrySet().stream().filter(entrySet -> entrySet.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toSet());
		System.out.println("Employee Set"+employeeSet);
		
		//Using Frequency
		Set<String> uniqueSetNames = duplicateemployeeNames.stream().filter(name -> Collections.frequency(duplicateemployeeNames, name) > 1).collect(Collectors.toSet());
		System.out.println("uniqueSetNames :: "+uniqueSetNames);
		
	}

}
