package chapter4;

import java.util.Scanner;

/**
 * Create a program for a cashier
 * which scan a determinate number of objects.
 * and Tally the cost
 * FOR LOOP - control on quantity
 */

public class Cashier {
    public static void main (String[] args) {

        //Get Number of object
        System.out.println("How many object you want scan?");
        Scanner scanner = new Scanner(System.in);
        int objects= scanner.nextInt();
        double total=0;

        //Create a loop to insert the cost of item and accumulate the cost
        for (int i=0; i < objects; i++){
            System.out.println("Insert the price of your object");
            double price= scanner.nextDouble();
            total=price+total;
        }
        scanner.close();
        System.out.println("Your total is "+total+"€.");
    }
}
