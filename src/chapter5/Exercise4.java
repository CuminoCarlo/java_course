package chapter5;

import java.util.Scanner;


public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Allow the operator to set plan fee and overage minutes
        System.out.println("Insert here the plan fee:");
        double planFee = scanner.nextDouble();
        System.out.println("Insert here the overage minutes:");
        int overMinutes= scanner.nextInt();
        scanner.close();

        //charge the user of 0.25 for every minute
        double overRage= getOverage(overMinutes);
        double subTotal= planFee + overRage;

        //tax 15% on subtotal
        double totalTax=getTax(subTotal);

        //Print the bill. Void method without return
        printBill(planFee, overRage, totalTax);
    }

    public static double getOverage(int min){
        return min*0.25;
    }

    public static double getTax(double subTot){
        return subTot*0.15;
    }

    public static void printBill(double base, double over, double taxBill){
        double total= base+over+taxBill;
        System.out.println("Your phone bill");
        System.out.println("The base is $"+String.format("%.2f", base));
        System.out.println("The overage is $"+String.format("%.2f", over));
        System.out.println("The tax is $"+String.format("%.2f", taxBill));
        System.out.println("The total of the bill is $"+String.format("%.2f", total));
    }
}
