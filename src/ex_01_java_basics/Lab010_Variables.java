package ex_01_java_basics;

public class Lab010_Variables {
    public static void main(String[] args) {

        /* data_type variable_name or identifier = variable_value or literal */

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;   // Floating point number
        char myLetter = 'D';        // Character
        boolean myBool = true;      // Boolean
        String myText = "Hello";    // String
        long mylongnum = 555556666l; // long
        double mydnum = 222.33333;   // double

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);
        System.out.println("Long: " + mylongnum);
        System.out.println("Double: " + mydnum);
    }
}
