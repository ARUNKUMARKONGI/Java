interface griet {
    String print(String str);
}

public class Lambda1 {
    public static void main(String[] args) {
        griet branchid = (s) -> s + "05";
        griet pin = (s) -> s + "500085";
        display("CSE-", branchid);
        display("Bachupally-", pin);
    }
    public static void display(String str, griet g) {
        String result = g.print(str);
        System.out.println(result);
    }
}
