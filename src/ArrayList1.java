import java.util.ArrayList;
import java.util.Scanner;

class boys {
    String name;
    int age;

    public boys(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class school {
    String name;

    public school(String name) {
        this.name = name;
    }
}

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<boys> stu = new ArrayList<>();
      //  The brackets in new ArrayList<Type>(); are used to specify type parameters or type arguments. In the context of ArrayList, they define the type of elements that the ArrayList can hold
        ArrayList<school> cl = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter student" + i + " name:");
            String name = scanner.nextLine();
            System.out.println("Enter student" + i + " age:");
            int age = Integer.parseInt(scanner.nextLine());

            boys student = new boys(name, age);
            stu.add(student);
        }

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter college" + i + " name: ");
            String name = scanner.nextLine();

            school college = new school(name);
            cl.add(college);
        }

        System.out.println("List of Students: ");
        for (boys i : stu) {                                         //collapse for with stream
            System.out.println("Name: " + i.name + ", Age: " + i.age);
        }

        System.out.println("\nList of Colleges: ");
        for (school c : cl) {
            System.out.println("College Name: " + c.name);
        }

        System.out.println("\nSize of Student List: " + stu.size());
        System.out.println("Is College List empty? " + cl.isEmpty());

        scanner.close();
    }
}
