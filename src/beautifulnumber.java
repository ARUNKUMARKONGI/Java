import java.util.*;

public class beautifulnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        int smallest = findSmallestBeautifulNumber(N);

        System.out.println("The smallest beautiful number greater than " + N + " is: " + smallest);
    }

    public static int findSmallestBeautifulNumber(int N) {
        int num = N + 1;
        while (true) {
            if (isBeautifulNumber(num)) {
                return num;
            }
            num++;
        }
    }

    public static boolean isBeautifulNumber(int num) {
        String numStr = String.valueOf(num);
        int[] digitCounts = new int[10];

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            digitCounts[digit]++;
        }

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';

            if (digitCounts[digit] != digit) {
                return false;
            }
        }
        return true;
    }
}
