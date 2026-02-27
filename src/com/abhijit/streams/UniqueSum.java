package com.abhijit.streams;

import java.util.Arrays;

public class UniqueSum {
    public static void main(String[] args) {

        int[] arr = {1, 6, 7, 8, 1, 1, 8, 8, 7};

        int sumOfDistinctNo = Arrays.stream(arr).boxed().distinct().mapToInt(x -> x).sum();
        System.out.println(sumOfDistinctNo);
    }
}
