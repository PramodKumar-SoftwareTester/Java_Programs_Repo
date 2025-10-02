package ex_04_java_literals_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Pramod";
        String last_name = "Kumar";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); //PramodKumar1010
        System.out.println(a + b + first_name + last_name); //20PramodKumar

        //         // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b)); //PramodKumar20
    }
}
