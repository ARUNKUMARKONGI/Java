import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(17, 18, 19, 28, 18, 28, 46, 7, 8, 9, 21, 12);
        NotLessThan18 res = new NotLessThan18();
        ages.stream().filter(res).forEach(System.out::println);
    }
}
class NotLessThan18 implements Predicate<Integer> {
    @Override
    public boolean test(Integer v) {
        Integer ADULT = 18;
        return v >= ADULT;
    }
}


/*
import java.util.function.Predicate;
public class PredicateExample {
    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserThan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserThan.test(10));
    }
}*/
