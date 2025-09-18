package ex_01_java_basics;

public class Lab014_Byte {
    public static void main(String[] args) {

        byte age = 10;  // byte range is -128 to 127
        byte age2 = 127;  // max value for byte
        byte age3 = -128; // min value for byte
//        byte age4 = 128; // overflow example

        System.out.println(age);   // 10
        System.out.println(age2);  // 127
        System.out.println(age3);  // -128
//        System.out.println(age4);  // overflow example
    }
}
