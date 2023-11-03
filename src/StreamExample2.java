import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class StreamExample2 {

    public static void main(String[] argvs)
    {

        List<String> lst = Arrays.asList("JAVA", "Java", "DS", "C", "C#");
        Optional<String> res = lst.stream()
                .filter(x -> !x.equalsIgnoreCase("java"))
                .findFirst();
        if (res.isPresent())
        {
            System.out.println(res.get());
        }
        else
        {
            System.out.println("no value");
        }
    }
}  