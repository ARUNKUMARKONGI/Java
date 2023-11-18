import java.util.regex.*;
public class PositiveLookbehindAssertion {
    public static void main(String[] args) {
        String text = "This is java programming in griet. before we covered C programming";
        Pattern pattern = Pattern.compile("(?<=java) programming");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
//matches occurrences of programming only if it is preceded by java