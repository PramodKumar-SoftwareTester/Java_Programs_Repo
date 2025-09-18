package ex_03_java_operators;

public class Lab030_Logical_Operaters {

    public static void main(String[] args) {

        boolean a=true;
        System.out.println("!a = "+!a); // Not Operator // output - false

        boolean b = true || false;
        System.out.println("or of b is: " + b); // OR operator - output - true

        boolean c = true && false;
        System.out.println("and of c: " + c); // AND Operator - output - false

        boolean d = true;
        System.out.println(!!d); // out put - true - Not of Not of d
    }
}
