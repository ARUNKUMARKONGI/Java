import java.util.*;
class Mobile {
    private String no;
    public void setno(String no) {
        this.no = no;
    }
    public String toString() {
        return no;
    }
}
class Persons {
    private String name;
    List<Mobile> numbers = new ArrayList<Mobile>();
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public List<Mobile> getnos() {
        return numbers;
    }
    public void AddMobiledetails(Mobile m) {
        numbers.add(m);
    }
}
public class AssociationExample {
    public static void main(String[] args) {
        Persons p = new Persons();
        p.setname("vivek");

        Mobile no1 = new Mobile();
        no1.setno("6584948584");
        Mobile no2 = new Mobile();
        no2.setno("7895848356");

        p.AddMobiledetails(no1);
        p.AddMobiledetails(no2);

        System.out.print(p.getname() + " has mobile numbers: ");
        for (Mobile i : p.getnos()) {
            System.out.print(i + " ");
        }
    }
}
  /*The association is established by including a list of Mobile objects within the Persons class.
     This means that a Persons object can be associated with multiple Mobile objects,
     representing the mobile numbers of that person.*/