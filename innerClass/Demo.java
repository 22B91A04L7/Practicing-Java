class A {
    int num = 7;

    public void show1() {
        System.out.println("In A show() ");
    }

    // inner class
    class B {
        int val = 9;

        public void config() {
            System.out.println("In inner class B");
        }
    }

    // static class --> only inner classes can be made static
    // if class is static it can be accessed without object
    static class C {
        public void config2() {
            System.out.println("Waiting in C");
        }
    }

}

public class Demo {
    public static void main(String args[]) {
        A obj = new A(); // object created for A
        obj.show1(); // method in A class accessed by object of A

        // members of B can be accessed by object of B but we cannot directly access
        // with object of B
        // We need reference and object of A to create object of B

        A.B obj2 = obj.new B();
        obj2.config();

        A.C obj3 = new A.C();
        obj3.config2();

    }
}
