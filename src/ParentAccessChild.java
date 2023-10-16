class Parent {
    void method() {
        System.out.println("Method in Parent class");
    }
}

class Child extends Parent {
    @Override
    void method() {
        System.out.println("Method in Child class, updated from git");
    }
}

public class ParentAccessChild {
    public static void main(String[] args) {
        Parent parent = new Child(); // Polymorphism
        parent.method(); // Calls the method in Child class
    }
}
