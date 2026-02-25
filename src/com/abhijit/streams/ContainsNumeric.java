package com.abhijit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsNumeric {
    public static void main(String[] args) {
        String[] str = {"abc", "123", "456", "xyz"};

        List<Integer> numeric = Arrays.stream(str).filter(x -> x.matches("[0-9]+")).map(s -> Integer.valueOf(s)).collect(Collectors.toList());
        System.out.println(numeric);
    }
}
