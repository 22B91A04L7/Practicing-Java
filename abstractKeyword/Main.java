abstract class Car {
    public abstract void drive();

    // abstract methods are those without implementation. but only the definition
    // abstract methods can be present in only abstract class
    // but abstract class can have both abstract and concrete methods
    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving...");
    }

    public void stop() { // concrete method
        System.out.println("Car Stopped..");
    }
}

public class Main {
    public static void main(String[] args) {
        WagonR obj = new WagonR();
        // object cannot be created for abstract class
        obj.drive();
        obj.stop();
    }
}