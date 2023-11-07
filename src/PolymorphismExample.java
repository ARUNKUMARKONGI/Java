import java.text.DecimalFormat;

class Shape {
    public double calculateArea() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle= new Rectangle(4.0, 6.0);

        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println("Area of the circle: " + df.format(circle.calculateArea()));
        System.out.println("Area of the rectangle: " + df.format(rectangle.calculateArea()));
    }
}
