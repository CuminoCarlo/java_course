package chapter3;

import java.util.Scanner;

/*
IF statement.
All salespeople have a payment of $1000 a week.
Salespeople who exceed 10 sales have a bonus of $250
 */
public class SalaryCalculator {

    public static void main (String[] args) {
        //initialize know values
        int salary=1000;
        int bonus=250;

        //Get valus from the unknow
        System.out.println("How many sales did the employee this week?");

        Scanner scanner = new Scanner(System.in);
        int sales=scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earned
        if(sales > 10) {
          salary = salary+bonus; //Update the value of the variable
        }
        //Output
        System.out.println("The employee's pay is $"+salary);
    }
}
