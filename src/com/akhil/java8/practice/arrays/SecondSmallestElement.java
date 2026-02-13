package com.akhil.java8.arrays.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondSmallestElement {

	public static void main(String[] args) {
		
		int[] sampleIntArray = ArrayDataSet.getIntegerarray1();
		int secondSmallestElement = Arrays.stream(sampleIntArray).distinct().sorted().skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("There is no second largest Element present in Array"));
		System.out.println("Second smallest Element :: "+secondSmallestElement);

	}
	
}
