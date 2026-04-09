class A {
    public A() {
        System.out.println("Constructor called i.e Object is created");
    }

    public void show() {
        System.out.println("In show menthod");
    }
}

public class Main {
    public static void main(String args[]) {
        new A(); // Anonymous Object i.e Object without name or reference variable
        new A().show(); // new object is created. so we can't use objects without reference
    }
}
