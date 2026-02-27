package com.abhijit.streams;

import java.util.Arrays;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        String firstNonRepeatedCharacter = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
        System.out.println(firstNonRepeatedCharacter);
    }
}
