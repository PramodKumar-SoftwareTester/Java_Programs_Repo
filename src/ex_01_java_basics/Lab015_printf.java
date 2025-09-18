package ex_01_java_basics;

public class Lab015_printf {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        System.out.print(a);
        System.out.print(b);
        System.out.println();

        System.out.printf("The value of a is %d and the value of b is %d", a, b);

        // %d -> integer, byte, short, long
        // %f -> float, double
        // %c -> character
        // %s -> string
    }
}
