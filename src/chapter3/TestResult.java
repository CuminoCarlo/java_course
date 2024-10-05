package chapter3;

/*
 * IF-ELSE-IF
 *  Display a letter grade for the studentds accoriding their score
 */

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {

        //Get the score
        System.out.println("Enter the test Score");
        Scanner scanner= new Scanner(System.in);
        double score= scanner.nextDouble();
        scanner.close();

        //Determinate the grade
        char grade;

        if (score < 60){
            grade = 'F';
        }
        else if (score < 70) {
            grade = 'D';
        }
        else if (score < 80) {
            grade = 'C';
        }
        else if (score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is "+grade+" .");
    }
}
