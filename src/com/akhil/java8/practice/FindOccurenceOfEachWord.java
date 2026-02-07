package com.akhil.java8.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurenceOfEachWord {

	public static void main(String[] args) {
		
		String s = "Im learning Stream API in java java";
		Map<String, Long> map = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
		System.out.println("Map :: "+map);
		

	}

}
