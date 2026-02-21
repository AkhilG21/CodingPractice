package abhijit.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfWord {
    public static void main(String[] args) {
        String str = "I am Learning Learning Streams API API in in Java Java";
        Map<String, Long> occurenceOfWord = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurenceOfWord);
    }
}
