interface A {
    void methodA();
}
interface B {
    void methodB();
}

// Class implementing both interfaces
class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }
}

public class MultipleInheritanceThroughInterface {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        myObject.methodA();
        myObject.methodB();
    }
}
