class A {
    public A() {
        super(); // extends object class and executes default constructor of Object class that
                 // prints nothing.
        System.out.println("In A");
    }

    public A(int n) {

        System.out.println("In A parameterised constructor");
    }
}

class B extends A {
    public B() {
        this(6);
        // super(); // its there even if not mentioned - calls default constructor of
        // super class.
        System.out.println("In B");
    }

    public B(int n) {
        // super(n); // calls parameterised constructor in super class.
        // this(); // calls default constructor of same class and must be in
        // parameterised contructor
        System.out.println("In B parameterised constructor");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
    }
}

// By default every constructor is having super() that calls constructor of
// super class.

// constructors are called based on object creation.