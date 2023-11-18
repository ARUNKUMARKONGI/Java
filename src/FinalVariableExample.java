class Superclass1 {
    final int finalVar;
    public Superclass1(int value) {
        this.finalVar = value;
    }
}
class Subclass1 extends Superclass1 {
    public Subclass1(int value) {
        super(value);
    }
}
public class FinalVariableExample {
    public static void main(String[] args) {
        Superclass1 superObj = new Superclass1(42);
        System.out.println(superObj.finalVar);
        Subclass1 subObj = new Subclass1(100);
        System.out.println(subObj.finalVar);
        //subObj.finalVar=200;   //this leads to error as u cant modify final var directly from child class
        //System.out.println(finalVar);
    }
}
