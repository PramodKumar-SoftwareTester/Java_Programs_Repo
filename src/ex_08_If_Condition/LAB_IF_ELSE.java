package ex_08_If_Condition;

import java.util.Scanner;

public class LAB_IF_ELSE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();

        if (age>20)
        {
            System.out.println("age is More than 20");
        }
        else if(age<20)
        {
            System.out.println("age is less than 20");
        }
        else
        {
            System.out.println("age is 20");
        }

    }
}
