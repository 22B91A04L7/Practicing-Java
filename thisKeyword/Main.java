class Human {
    String name;
    private int age;

    public void setAge(int age) {
        this.age = age; // this refers to current object and used to differentiate
        // between local variable and instance variable when they have same name
    }

    public void getAge() {
        System.out.println("Age: " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.name = "John";
        obj1.setAge(20);

        obj1.getAge();

    }
}
