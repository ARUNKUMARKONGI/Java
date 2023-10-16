import java.util.*;

class Course {
    private String title;
    private List<Student> students=new ArrayList<>();
    public Course(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        students.add(s);
    }
}
class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }
   public String toString() {
        return name;
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void addCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // associate student with course, this refers to current student object
    }
}
public class ManyToManyAssociationExample {
    public static void main(String[] args) {
        Student a = new Student("Akash");
        Student b = new Student("abhi");

        Course java = new Course("JAVA");
        Course python = new Course("PYTHON");

        a.addCourse(java);
        a.addCourse(python);
        b.addCourse(java);

        System.out.println("Student " + a + " is enrolled in following courses: ");
        for (Course c : a.getCourses()) {
            System.out.println(c);
        }

        if (python.getStudents().isEmpty()) {
            System.out.println("There are no students listed for the python course.");
        } else {
            System.out.println("Students opted for the python course:");
            for (Student s : python.getStudents()) {
                System.out.println(s);
            }
        }
    }
}