class vehicle {
    int speed;
    void setSpeed(int s) {
        speed = s;
    }
    void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
}

class car extends vehicle {
    int numWheels;
    void setWheels(int w) {
        numWheels = w;
    }
    void displayDetails() {
        System.out.println("Wheels: " + numWheels);
        displaySpeed();
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        car myCar = new car();
        myCar.setSpeed(120);
        myCar.setWheels(4);
        myCar.displayDetails();
    }
}
