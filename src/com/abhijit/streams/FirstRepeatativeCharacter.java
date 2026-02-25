package com.abhijit.streams;

import java.util.Arrays;

public class FirstRepeatativeCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        String firstRepeatedCharacter = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) != str.lastIndexOf(c)).findFirst().get();
        System.out.println(firstRepeatedCharacter);
    }
}
