package com.akhil.java8.practice;

import java.util.Arrays;

public class FindwordsWithSpecifiedVowels {

	public static void main(String[] args) {
		
		String s = "Im learning stream api in java";
		Arrays.stream(s.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2).forEach(System.out::println);

	}

}
