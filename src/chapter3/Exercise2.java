package chapter3;

/*
 ** LOGICAL OPERATORS
 * Enter the value of different coin to achieve a 1 dollar
 * The types of coi to insert are pennies, nickel, dimes and quarties.
 * The program must return error messages if the result is more the 1$ or less than it
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main (String[] args) {
        // Inizialize your variable
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        //Get the value of the other moneys
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your pennies amount");
        int numberPenny = scanner.nextInt();
        System.out.println("Insert your nickel amount");
        int numberNickel = scanner.nextInt();
        System.out.println("Insert your dimes amount");
        int numberDime = scanner.nextInt();
        System.out.println("Insert your quarties amount");
        int numberQuarter = scanner.nextInt();
        scanner.close();

        double result = numberPenny * penny + numberNickel * nickel + numberDime * dime + numberQuarter * quarter;

        if (result < dollar) {
            double difference = dollar - result;
            System.out.println("You need " + String.format("%.2f", difference) + " cents to achieve 1$");
        } else if (result > dollar) {
            double excessive = result - dollar;
            System.out.println("You are exceeding the 1$ amount of " + String.format("%.2f", excessive) + " cents");
        } else {
            System.out.println("Congratulation! You reached the 1$ amount!");
        }
    }
}
