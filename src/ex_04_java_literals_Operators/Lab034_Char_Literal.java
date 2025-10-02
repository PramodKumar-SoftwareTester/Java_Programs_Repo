package ex_04_java_literals_Operators;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //        char c = "A"; // "" == String = Bunch of Char


        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodKumar");
        System.out.println("Pramod"+new_line+"Kumar");
        System.out.println("Pramod\nKumar");
        System.out.println("Pramod"+tab_line+"Kumar");
        System.out.println("Pramod"+back_space+"Kumar");
        System.out.println( " ----- ");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';


    }
}
