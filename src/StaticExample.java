class Superclass {
    public static int data = 42;
    public static void staticMethod() {
        System.out.println("Static method in Superclass");
    }
}

class Subclass extends Superclass {
   int value;
    public void someMethod() {
        value = Superclass.data; // Accessing the static field of the superclass
        Superclass.staticMethod(); // Calling the static method of the superclass
    }
    public static void staticMethod() {
        System.out.println("Static method in Subclass");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.someMethod();
        obj.staticMethod();
        System.out.println(obj.value);
        System.out.println(obj.data);
    }
}
