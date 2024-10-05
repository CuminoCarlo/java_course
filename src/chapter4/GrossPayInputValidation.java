package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main (String[] args){

        //Intialize know variables
        int maxHours= 40;
        int rate=15;

        //Get inout of know variable
        System.out.println("How many hours did you work this week?");
        Scanner scanner=new Scanner(System.in);
        double workedHours= scanner.nextDouble();


        //validate input

        /**
         * The program validate only a number between 1 and 40.
         * While means 'finché', so if the number is higher the loop return the error message
         * To evitate that people could put a rate < 1 I put a or (||) statement too
         */

        while (workedHours > maxHours || workedHours < 1){
            System.out.println("Invalid Input. The number of hours must be between 1 an 40.");
            workedHours=scanner.nextDouble();
        }
        scanner.close();

        //Calculate gross

        double grossRate= workedHours*rate;

        System.out.println("Gross rate: "+grossRate+"$.");
        
    }
}
