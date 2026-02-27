package com.abhijit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.stream(arr).boxed().toList();

        Map<Boolean, List<Integer>> oddEvenMap = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));
        System.out.println(oddEvenMap);

        // Second Method
        List<List<Integer>> evenOddMap = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList())).entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
        System.out.println(evenOddMap);
    }
}
