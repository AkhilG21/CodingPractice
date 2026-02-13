package com.akhil.java8.practice.arrays;

import java.util.Arrays;

public class FetchLengthOfLongeststringInArray {

	public static void main(String[] args) {
		String[] arr = {"Akhil", "Abhijit", "Kunal", "Nayan", "Sushant", "Venkatesh"};
		
		int lengthOfLargestString = Arrays.stream(arr).mapToInt(s -> s.length()).max().orElse(0);
		System.out.println("lengthOfLargestString :: "+lengthOfLargestString);
		
	}

}
