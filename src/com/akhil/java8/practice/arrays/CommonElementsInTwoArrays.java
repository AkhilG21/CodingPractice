package com.akhil.java8.arrays.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		
		int[] intArray1 = ArrayDataSet.getIntegerarray1();
		int[] intArray2 = ArrayDataSet.getIntegerarray2();
		
		List<Integer> commonElements = Arrays.stream(intArray1)
				.filter(e -> Arrays.stream(intArray2)
						.anyMatch(arr2Val -> arr2Val == e))
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println("Common Elements List :: "+commonElements);
		
	}

}
