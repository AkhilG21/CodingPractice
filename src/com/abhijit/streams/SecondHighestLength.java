package abhijit.streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestLength {
    public static void main(String[] args) {
        // Input sentence
        String str = "I am learning Java Streams";

        int secondHighestLength = Arrays.stream(str.split(" ")).map(String::length).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("The Second Highest Length Word is: " + secondHighestLength);

        Integer highestLength = Arrays.stream(str.split(" ")).map(String::length).sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("Highest Length Word is: " +highestLength);

    }
}
