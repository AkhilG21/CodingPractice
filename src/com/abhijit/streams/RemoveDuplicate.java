package abhijit.streams;

import java.util.Arrays;

/**
 * This class demonstrates how to remove duplicate
 * characters from a String using Java Streams.
 */
public class RemoveDuplicate {

    public static void main(String[] args) {

        // Input String
        String str = "dabcadefg";

        // -----------------------------
        // Method 1: Using split("")
        // -----------------------------
        // 1. Split string into array of characters
        // 2. Convert array into Stream
        // 3. Use distinct() to remove duplicates
        // 4. Print characters in same line
        Arrays.stream(str.split(""))
                .distinct()
                .forEach(System.out::print);

        System.out.println(); // For formatting

        // -----------------------------
        // Method 2: Using chars()
        // -----------------------------
        // 1. Convert string into IntStream of ASCII values
        // 2. Use distinct() to remove duplicate ASCII values
        // 3. Convert int back to char
        // 4. Print each character
        str.chars()
                .distinct()
                .mapToObj(x -> (char) x)
                .forEach(System.out::print);
    }
}
