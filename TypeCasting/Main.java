class A {
    public void show1() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B");
    }
}

public class Main {
    public static void main(String args[]) {
        A obj = (A) new B(); // upcasting
        obj.show1(); // can acces only show1() because the type is of A.

        B obj3 = (B) obj; // reference changed from A to B
        // this is downcasting
        obj3.show1();
        obj3.show2();

    }
}