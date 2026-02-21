package abhijit.streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {
    public static void main(String[] args) {
        // Input sentence
        String str = "I am learning Java Streams";

        String secondHighest = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println("The Second Highest Word is: " +secondHighest);

    }
}
