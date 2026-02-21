package abhijit.streams;

import java.util.Arrays;
import java.util.List;

public class VowelsCounting {
    public static void main(String[] args) {
        String str = "I am Learning Streams API in Java";
        // Display all the words having 2 vowels

        List<String> vowelCount = Arrays.stream(str.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2).toList();
        System.out.println(vowelCount);
    }
}
