package ex_03_java_operators;

public class Lab031_Compound_Assignment_Operator {

    public static void main(String[] args) {

        int a = 5, b=10, c=20, d=30, e=133;
        a+=100; // a=a+100;
        b-=5;   // b= b-5
        c*=8;   // c=c*8;
        d/=2;   // d=d/2;
        e%=a;   // e=e%a;

        System.out.println("a= "+a);  // output - 105
        System.out.println("b= "+b);    // 5
        System.out.println("c= "+c);    // 160
        System.out.println("d= "+d);    // 15
        System.out.println("e= "+e);    // 28

    }
}
