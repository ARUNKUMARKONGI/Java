import java.util.Arrays;
import java.util.List;
public class StreamExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        int res = stringList.stream().mapToInt(s -> s.length()).sum();
        System.out.println();
        System.out.println("Sum of string lengths: " + res);
    }
}
 /*  Stream processes sequence of data ata time,
  it converts the list of strings into a stream, and then a series of operations are applied */
