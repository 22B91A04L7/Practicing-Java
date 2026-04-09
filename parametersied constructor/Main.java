class Car {
    String name;
    int price;

    // Default constructor
    public Car() {
        this.name = "Not defined";
        this.price = 0;
        System.out.println("Default Constructor Called");
    }

    // parameterised constructor
    public Car(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Parametrized Constructor Called");
    }

}

public class Main {
    public static void main(String args[]) {
        Car obj1 = new Car();
        Car obj2 = new Car("Ferari", 50000);
    }
}
