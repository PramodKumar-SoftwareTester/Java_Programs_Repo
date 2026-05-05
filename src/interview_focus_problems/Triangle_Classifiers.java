package interview_focus_problems;

import java.util.Scanner;

public class Triangle_Classifiers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Side 1");
        int n1 = sc.nextInt();
        System.out.println("Enter Side 2");
        int n2 = sc.nextInt();
        System.out.println("Enter Side 3");
        int n3 = sc.nextInt();

        if(n1==n2 && n1==n3 && n2==n3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (n1==n2 || n1==n3 || n2==n3 )
        {
            System.out.println("2 side equal triangle");
        }
        else
        {
            System.out.println("scelene");
        }
    }
}
