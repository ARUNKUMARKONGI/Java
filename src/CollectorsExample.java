import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> res = words.stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Original Words: " + words);
        System.out.println("Filtered Words: " + res);
    }
}
