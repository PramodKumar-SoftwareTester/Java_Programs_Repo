package ex_01_java_basics;

public class Lab016_Constants {

    public static void main(String[] args) {

        int a = 10;
        a = 20; // Variables can be reassigned
        System.out.println("Value of a: " + a);  // prints 20, not 10, because a was reassigned


        final int b = 99;  // Constants are declared with 'final' keyword
//        b = 100;         // compilation error, java: cannot assign a value to final variable b

        System.out.println("Value of b: " + b);
    }

}
