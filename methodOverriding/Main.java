class A {
    public void show() {
        System.out.println("In A show()");
    }

    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show()");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show(); // calls method in B

        A obj2 = new B();
        obj2.show(); // calls method in B

        // above two objects refers to same class.

        obj2.config(); // calls config() from A because config() is not present in B.

        // below object points to A only.
        A obj3 = new A();
        obj3.show(); // calls show() in A
    }
}
// Here method in the sub class is providing implementation of same method in
// super class i.e called method OverRiding.
