package if_else_switch_conditiona_Loops;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year ");
        int year=sc.nextInt();
        //boolean Result = leap_year(year);
        //System.out.println("the Year is " + leap_year(year));
        leap_year(year);


    }
    public static void leap_year(int year)
    {
        if ((year%4==0 && year%100!=0) || (year %400 == 0))
        {
            System.out.println("Its a Leap Year");
            //return true;
        }

        else {
            System.out.println("not a leap Year");
            //return false;
        }

    }
}
