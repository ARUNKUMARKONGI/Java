import java.util.*;
public class beautifulnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        int smallest = SmallestBeautifulNumber(N);
        System.out.println("The smallest beautiful number greater than " + N + " is: " + smallest);
    }
    public static int SmallestBeautifulNumber(int N) {
        int num = N + 1;
        while (true)
        {
            if (BeautifulNumber(num))
            {
                return num;
            }
            num++;
        }
    }
    public static boolean BeautifulNumber(int num) {
        String Str = String.valueOf(num);
        int[] Counts = new int[10];

        for (int i = 0; i < Str.length(); i++) {
            int digit = Str.charAt(i) - '0';
            Counts[digit]++;
        }
        for (int i = 0; i < Str.length(); i++) {
            int digit = Str.charAt(i) - '0';

            if (Counts[digit] != digit) {
                return false;
            }
        }
        return true;
    }
}
