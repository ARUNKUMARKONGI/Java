import java.util.*;
//import java.util.stream.Collectors;
import java.util.Comparator;

public class largestsmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        try {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                try {
                    int ele = in.nextInt();
                    if (set.add(ele)) {
                        count++;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    in.next();
                    i--;
                }
            }
            if (count< 2) {
                throw new IllegalArgumentException("Atleast 2 unique elements are required");
            }
            List<Integer> arr = new ArrayList<>(set);
            Collections.sort(arr);

            int small = arr.get(1);
            int large = arr.get(arr.size() - 2);

            System.out.println("Sorted data: " + arr);
            System.out.println("Second Largest Element: " + large);
            System.out.println("Second Smallest Element: " + small);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter only integers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        in.close();
    }
}
