class Human {
    private int age;
    String name;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String args[]) {
        Human obj = new Human();

        obj.name = "Venkat";
        obj.setAge(25);
        System.out.println("Name: " + obj.name);
        System.out.println("Age : " + obj.getAge());
    }
}

// private variables belongs to class only and cannot be accessed by any other
// class using object.
// private variables can be accesssed by using public methods of the class. i.e
// getters and setters
// This is called Encapsulation.
