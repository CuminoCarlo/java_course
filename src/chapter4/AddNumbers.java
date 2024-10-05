package chapter4;

import java.util.Scanner;

/**
 * Realize a program to sum two numbers
 * and continue until you give it stop
 * The control is after the test
 */

public class AddNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declare a boolean to use to stop the loop
        boolean again;

        //Do-while loop (do a thing until I'll give you a condition)

        do {
            //Put all the code to execute here
            System.out.println("Enter the first number");
            int num1= scanner.nextInt();
            System.out.println("Enter the second number");
            int num2 = scanner.nextInt();
            int sum= num1 + num2;
            System.out.println("the sum is "+sum);

            //Now I ask if I want start over.
            System.out.println("Do you want start again?");
            again = scanner.hasNextBoolean();

        } while (again);
        scanner.close();
    }
}
