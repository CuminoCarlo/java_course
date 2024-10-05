package chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class IstantCreditCheck {

    //Declare what I know (global variables)
    static int requiredSalary=25000;
    static int creditScore=700;
    //Declare also scanner to make it re-callable by other methods
   static  Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        //First method: Get the salary with a method
        double salary=getSalary();
        //Second method: Get Score with a method
        int score=getScore();
        scanner.close();

        //Third Method, check if the user id qualified
       boolean qualified= isQualified(salary, score);

       //forth method Print message
        notifyUser(qualified); //Method which print a message doesn't need a variable
    }

    //method getSalary
    public static double getSalary(){
        System.out.println("Enter your salary");
        return scanner.nextDouble();
    }

    //method getScore
    public static int getScore(){
        System.out.println("Enter your score");
        return scanner.nextInt();
    }

    public static boolean isQualified(double inputSalary, int inputScore){
        return inputSalary >= requiredSalary && inputScore >= creditScore;
    }

    public static void notifyUser(boolean b){
        if (b){
            System.out.println("Congratulations! You are available for the credit!");
        } else{
            System.out.println("Sorry! You are not available for the credit!");
        }
    }
}
