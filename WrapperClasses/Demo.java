// Java Collections work only with Object data types. so Wrapper classes are introduced.
// Wrapper classes contains data types that extends object class
// int - Integer, float - Flaot
// char - Character, double - Double
public class Demo {
    public static void main(String args[]) {
        int num1 = 7;
        Integer num2 = num1; // Auto boxing
        // conversion from primitive typre to object type
        System.out.println(num2);
        int num3 = num2; // Auto unboxing
        // conversion from object type to primitive type
        System.out.println(num3);
    }
}
