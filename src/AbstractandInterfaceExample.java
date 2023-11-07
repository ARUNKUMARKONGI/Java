// Abstract class
abstract class AbstractShape {
    // Concrete method
    public void printDescription() {
        System.out.println("This is a shape.");
    }
    public abstract double calculate();
}

interface Drawable {
    // Abstract method
    void draw();
}

class Circle2 extends AbstractShape implements Drawable {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractandInterfaceExample {
    public static void main(String[] args) {
        Circle2 circle1 = new Circle2(5.0);
        circle1.printDescription(); // Inherited from AbstractShape
        System.out.println("Area of the circle: " + circle1.calculate());
        circle1.draw(); // Implemented from Drawable
    }
}
