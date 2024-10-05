package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main (String[] args) {
        //Initialize what we know
        int requiredSalary=30000;
        int requiredYears= 2;

        //Get what we don't
        System.out.println("What is your salary?");
        Scanner scanner = new Scanner(System.in);
        double salary= scanner.nextDouble();

        System.out.println("How many are your year of work?");
        double years= scanner.nextDouble();

        scanner.close();


        //Make decision

        if (salary >= requiredSalary && years >= requiredYears){
            System.out.println("Congratulation. You have the required salary and years for the loan!");
        } else {
            System.out.println("Sorry. You have earned "+requiredSalary+"$ of salary and "
                    +requiredYears+" years of job to require the loan.");
        }
    }
}
