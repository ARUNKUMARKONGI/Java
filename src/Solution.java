import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List<cricketers> players = new ArrayList<>();
        players.add(new cricketers("Virat Kohli", 34, 78));
        players.add(new cricketers("Rohit Sharma",33, 65));
        players.add(new cricketers("K L Rahul", 30, 50));
        players.add(new cricketers("sKY", 27, 45));
        /*Person s1=new Person("sky",27,45);
        players.add(s1);*/

        Scanner s= new Scanner(System.in);
        String str=s.next().trim();
        Sortbyvalue(players, str);

        for (cricketers p : players) {
            System.out.println(p);
        }
    }
    public static class cricketers {
        private String name;
        private int age;
        private int rank;

        public cricketers(String name, int age, int rank) {
            this.name = name;
            this.age = age;
            this.rank = rank;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return "{name='" + name + "', age=" + age + ", id=" + rank + '}';
        }
    }
    public static void Sortbyvalue(List<cricketers> list, String str) {
        switch (str) {
            case "name":
                Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
                break;
            case "age":
                Collections.sort(list, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
                break;
            case "id":
                Collections.sort(list, Comparator.comparingInt(cricketers::getRank));
                break;
            default:
                System.out.println("Invalid sort value.");
        }
    }
}

