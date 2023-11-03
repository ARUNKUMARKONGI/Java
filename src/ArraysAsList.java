import java.util.Arrays;
import java.util.List;
public class ArraysAsList {
    public static void main (String args[]) {

        Integer a1[] = new Integer[]{1, 2, 3, 4};
        List<Integer> list1 = Arrays.asList(a1);   //asList can not be modified
        //List<Integer> li = Arrays.asList(56,67,234,24534);
        //list1.add(5);
        System.out.println("The list is:" + list1);
        Studentdetails a2[] = new Studentdetails[]{new Studentdetails(1, "akash"),
                new Studentdetails(2, "sangeeta"),
                new Studentdetails(3, "Sonam")};
        List<Studentdetails> list2 = Arrays.asList(a2);
        System.out.println("The list is:" + list2);
    }
}
class Studentdetails {
    int rollNo;
    String name;
    Studentdetails(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString() {
        return "[" + this.rollNo + ", " + this.name + "]";
    }
}
