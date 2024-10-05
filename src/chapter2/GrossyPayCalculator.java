package chapter2;

import java.util.Scanner;

public class GrossyPayCalculator {

    public static void main(String[] args){
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours worked by the employee");

        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println(hours);

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double gross= hours * rate;

        //4. Display result
        System.out.println("The gross pay is $"+gross);

    }
}
