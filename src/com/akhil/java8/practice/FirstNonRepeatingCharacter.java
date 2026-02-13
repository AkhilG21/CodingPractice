package com.akhil.java8.practice;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "swiss";
		
		Character ch = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter( e-> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		System.out.println("CH :: "+ch);
	}

}
