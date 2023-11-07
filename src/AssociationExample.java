import java.util.*;
class Mobile {
    private String no;

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }
}

class Persons {
    private String name;
    List<Mobile> numbers = new ArrayList<Mobile>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mobile> getNumbers() {
        return numbers;
    }

    public void addMobileDetails(Mobile m) {
        if (numbers.size() < 2) {
            numbers.add(m);
        } else {
            System.out.println("You can have a maximum of 2 mobile numbers.");
        }
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persons p = new Persons();

        //System.out.print("Enter the person's name: ");
        String name = scanner.nextLine();
        p.setName(name);

        for (int i = 0; i < 2; i++) {
            //System.out.print("Enter mobile number " + (i + 1) + ": ");
            String mobileNumber = scanner.nextLine();

            Mobile mobile = new Mobile();
            mobile.setNo(mobileNumber);
            p.addMobileDetails(mobile);
        }

        System.out.println(p.getName() + " has following mobile numbers:");
        for (Mobile mobile : p.getNumbers()) {
            System.out.println(mobile.getNo());
        }
    }
}

  /*The association is established by including a list of Mobile objects within the Persons class.
     This means that a Persons object can be associated with multiple Mobile objects,
     representing the mobile numbers of that person.*/