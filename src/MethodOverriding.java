import java.util.Scanner;

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void calculateInterest() {
        System.out.println("Interest calculation depends on Accounts.");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.07;
        System.out.println("Interest for a savings account: Rs. " +  String.format("%.2f", interest));
    }
}

class FixedDepositAccount extends Account {
    public FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.09;
        System.out.println("Interest for a fixed deposit account: Rs. " +  String.format("%.2f", interest));
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sb = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        //System.out.print("Enter the fixed deposit account balance: ");
        double fd = scanner.nextDouble();

        Account savingsAccount = new SavingsAccount(sb);
        Account fixedDepositAccount = new FixedDepositAccount(fd);


        savingsAccount.calculateInterest();
        fixedDepositAccount.calculateInterest();

        scanner.close();
    }
}
