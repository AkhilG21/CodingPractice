package com.abhijit.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {

        String[] str = {"pat", "tap", "pan", "nap", "team", "tree", "meat"};

        Collection<List<String>> anagrams = Arrays.stream(str).collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();

        System.out.println(anagrams);
    }
}
