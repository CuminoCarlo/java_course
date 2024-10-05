package chapter3;

import java.util.Scanner;

/*
*IF ELSE
* All salespeople are expected to make at least 10 sales
* For those who, receive a congratulation message
* For those who don't, receive a message of how many sales they were short
 */
public class QuotaCalculator {

    public static void main(String[] args) {
        //Initialize the value we know
        int quota =10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sale= scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if (sale >= quota){
            System.out.println("Congratulation! Your quota is achieved!");
        } else{
            int salesShort = quota - sale;
            System.out.println("Your quota is not achieved yet! You miss "+salesShort+" sales.");
        }
    }
}
