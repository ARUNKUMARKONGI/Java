// Abstract class
abstract class Shape1 {
    public abstract double calculateArea();
    
}


class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle1 extends Shape1 {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle1 circle1= new Circle1(5.0);
        Rectangle1 rectangle1 = new Rectangle1(4.0, 6.0);

        System.out.println("Area of the circle: " + String.format("%.2f", circle1.calculateArea()));
        System.out.println("Area of the rectangle: " + rectangle1.calculateArea());
        System.out.println("thisis coming from github");
    }
}
