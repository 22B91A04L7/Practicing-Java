interface A {
    int age = 5; // variables in interfaces are always static and final
    String name = "Sharva";

    // by default all methods in interface are public and abstract
    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("in Show ()");
    }

    public void config() {
        System.out.println("In config()");
    }
}

public class Main {
    public static void main(String args[]) {
        A obj = new B();
        // sub class that implements interface can be instantiated but actual interface
        // cannot !
        obj.show();
        obj.config();
        System.out.println(A.name);
    }
}
