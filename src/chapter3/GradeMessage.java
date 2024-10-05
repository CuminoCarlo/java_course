package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main (String[] args) {

        System.out.println("Enter your letter Grade.");
        Scanner scanner= new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;;

        //Switch statements
        switch(grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "We have to wok on!";
                break;
            case "F":
                message = "Uh - Oh!";
                break;
            default:
                message = "Invalid grade!";
                break;
        }

        System.out.println(message);
    }
}
