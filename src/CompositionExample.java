/*In Java, composition is a stronger form of aggregation.
In composition, an object is composed of other objects as its parts, and the composed objects cannot exist independently of the main object.
This relationship represents a "whole-part" or "has-a" relationship.*/
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();    //composition is created here

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car C= new Car();
        C.startCar();
    }
}
   /* When you create a Car, it creates an Engine.
        If the Car is destroyed or goes out of scope,
        the associated Engine is also destroyed.*/