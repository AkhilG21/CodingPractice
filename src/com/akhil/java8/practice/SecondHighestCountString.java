package com.akhil.java8.practice;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "im learning Stream API in java";
		int secondHighestWordLength = Arrays.stream(s.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondHighestWordLength "+secondHighestWordLength);
		
		String secondHighestWord = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println("secondHighestWord "+secondHighestWord);
	}

}
