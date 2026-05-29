package finalKeyword;

//final ---> variable, method, class

//final variables --> constant values
//final method --> cannot be overridden
//final class --> cannot be inherited

class A { // if class A is declared as final it cannot be inherited by B
    public void show() {
        System.out.println("In A show() ");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show() ");
    }

    // gives error because show() in A is declared as final;
}

public class Main {
    public static void main(String args[]) {
        int num1 = 9;
        final int num2 = 10;
        System.out.println(num1);
        System.out.println(num2);
        num1 = 15;
        // num2 = 10; // gives error because num2 is declared as final
        System.out.println(num1);
        System.out.println(num2);

        A obj = new A();
        A obj2 = new B();
        obj.show();
        obj2.show();
    }
}
