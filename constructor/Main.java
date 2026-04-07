class Human {
    String name;
    private int age;

    // constructor
    public Human() {
        System.out.println("Constructor called");
        name = "Unknown";
        age = 0;
        // constructor is used to initialize the object
        // constructor is called when the object is created

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// constructor is a special method that is used to initialize the object
// constructor is called when the object is created
public class Main {
    public static void main(String[] args) {
        Human obj1 = new Human();
        System.out.println("Name :" + obj1.name + ", Age: " + obj1.getAge());

        obj1.setAge(20);
        obj1.name = "Alice";
        System.out.println("Name :" + obj1.name + ", Age: " + obj1.getAge());
    }
}
