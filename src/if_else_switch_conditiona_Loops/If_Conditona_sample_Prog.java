package if_else_switch_conditiona_Loops;

import java.util.Scanner;

public class If_Conditona_sample_Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a Number");
        int num=sc.nextInt();

        //Sample If Condition // by ternary operator
        /* String result= (num>0)? "Positive" : ((num<0)?"Negative":"num is 0");
        System.out.println(result); */

        //actual is condition
        if(num>0 && num!=0)
        {
            System.out.printf("Number %d is Positive",num, + num);
        } else if (num<0 && num!=0) {
            System.out.printf("Number %d is Negative",num, + num);
        }
        else {
            System.out.printf("Number %d is Zero",num, + num);
        }


    }
}
