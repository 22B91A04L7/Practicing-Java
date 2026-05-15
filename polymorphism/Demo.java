class Computer {
    public void show() {
        System.out.println("This is a computer");
    }
}

class Laptop extends Computer {
    public void show() {
        System.out.println("This is a laptop");
    }
}

class Tablet extends Computer {
    public void show() {
        System.out.println("This is a tablet");
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.show(); // reference of computer class and object of computer class

        obj = new Laptop();
        obj.show(); // reference of computer class and object of laptop class

        obj = new Tablet();
        obj.show(); // reference of computer class and object of tablet class

        // In above code same object is behaving diffrently at different times. This is
        // called dynamic method dispatch or runtime polymorphism.
        // above happens based on object belonging to class but not reference variable.
        // This is
        // called method overriding.
    }
}