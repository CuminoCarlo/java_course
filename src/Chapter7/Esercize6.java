package Chapter7;

import java.util.Scanner;

public class Esercize6 {

    /*
     * Make an array that holds its actual values of the days of the week,
     * and then have the user input a number corresponding to some day of the week.
     * */

   public static Scanner scanner = new Scanner(System.in);
   public static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        System.out.println(getDay());
    }

    public static String getDay(){
        System.out.println("Insert here the number:");
        int index = scanner.nextInt();
        scanner.close();
        if (index > 7){
            return "Error!";
        }
        else {
            return "The day is "+days[index-1];
        }
    }
}
