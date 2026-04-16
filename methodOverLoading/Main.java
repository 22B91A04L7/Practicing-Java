class Addition {
    public void add(int a, int b) {
        int res = a + b;
        System.out.println("Addition with two numbers :" + res);

    }

    public void add(int a, int b, int c) {
        int res = a + b + c;
        System.out.println("int Addition between three Numbers: " + res);
    }

    public void add(double a, double b) {
        System.out.println("double Addition : " + a + b);
    }
}

public class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(5, 2); // cals int addition between 2 numbers.
        obj.add(5, 4, 3); // calls int addition between 3 numbers.
        obj.add(5.27, 4.906); // cals double addition between two numbers.
    }

}
// same method call be called based on different number and type of the
// parameters i.e called method Over Loading.
