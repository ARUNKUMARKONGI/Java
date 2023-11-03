import java.util.regex.*;
public class NegativeLookaheadAssertion {
    public static void main(String[] args) {
        String text = "I like Mango. But not Mango juice";
        Pattern pattern = Pattern.compile("Mango(?! juice)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
//find all occurrences of "mango" that are not followed by "juice."