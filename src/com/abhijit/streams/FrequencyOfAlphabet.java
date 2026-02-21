package com.abhijit.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfAlphabet {
    public static void main(String[] args) {
        String str = "Mississippi";
        Map<String, Long> frequency = Arrays.stream(str.split("")).map(String::toUpperCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);
    }
}
