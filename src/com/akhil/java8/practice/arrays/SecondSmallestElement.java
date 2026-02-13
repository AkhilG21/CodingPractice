package com.akhil.java8.practice.arrays;

import java.util.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		
		int[] sampleIntArray = ArrayDataSet.getIntegerarray1();
		int secondSmallestElement = Arrays.stream(sampleIntArray).distinct().sorted().skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("There is no second largest Element present in Array"));
		System.out.println("Second smallest Element :: "+secondSmallestElement);

	}
	
}
