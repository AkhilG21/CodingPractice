package abhijit.streams;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This class demonstrates how to find the word
 * with the highest length in a given sentence
 * using Java Streams API.
 */
public class HighestLength {

    public static void main(String[] args) {

        // Input sentence
        String str = "I am learning Java Streams";

        // 1. Split the sentence into words using space as delimiter
        // 2. Convert the array of words into a Stream
        // 3. Use max() with Comparator to compare words based on their length
        // 4. Get the word with maximum length
        String highestLen = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length))
                .get();

        // Print the result
        System.out.println("The Highest Length word is: " + highestLen);
    }
}

