package if_else_switch_conditiona_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grades_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Marks");
        int score = sc.nextInt();
        char grade = 0;

        if(score<0 || score>100)
        {
            System.out.println("invalid score entered");
            return;
        }

        switch(score/10)
            {
                case 10:
                    grade='E';
                    break;

                case 9:
                    grade='A';
                    break;

                case 8:
                    grade='B';
                    break;

                case 7:
                    grade='C';
                    break;

                case 6:
                    grade='D';
                    break;

                case 5:
                    grade='J';
                    break;

                default:
                    grade='F';
                    break;

            }
        System.out.println("Grade of the student is " + grade);



    }
}
