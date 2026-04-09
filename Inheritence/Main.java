class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

// extends is used to inherit other classes
// Here AdvCalc class has all methods inherited from Calc class
class AdvvCalc extends Calc {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String args[]) {
        Calc obj1 = new Calc();
        // can access only methods in Calc i.e only add() and sub()
        int n1 = obj1.add(5, 10);
        int n2 = obj1.sub(10, 5);
        System.out.println("Add: " + n1 + " Sub: " + n2);

        // AdvCalc class can access all methods
        AdvvCalc obj2 = new AdvvCalc();
        int n3 = obj2.add(3, 5);
        int n4 = obj2.sub(6, 3);
        int n5 = obj2.mul(4, 6);
        int n6 = obj2.div(10, 2);
        System.out.println("Add : " + n3 + " Sub: " + n4 + " Mul: " + n5 + " Div: " + n6);

    }

}
