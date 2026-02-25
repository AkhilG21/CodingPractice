package com.abhijit.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDescending {
    public static void main(String[] args) {
        int [] arr = {12, 10, 34, 7, 56, 99, 39};

        //Ascending
        List<Integer> ascending = Arrays.stream(arr).boxed().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(ascending);

        //Descending
        List<Integer> descending = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descending);
    }
}
