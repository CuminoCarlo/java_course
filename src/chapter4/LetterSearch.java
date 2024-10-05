package chapter4;

/*
 * Search a letter in a string that you insert
 */

import java.util.Scanner;

public class LetterSearch {
    public static void main (String[] args){
        //Get the text
        System.out.println("Enter here your text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        //write a loop to search for letter "A" using method .length
        boolean letterFound= false;

        for (int i=0; i<text.length(); i++){

            char currentLetter= text.charAt(i);

            //Create a boolean to find the letter


            if(currentLetter == 'A'|| currentLetter =='a') {
                letterFound=true;
                break;       //After founding an A/a we stop the loop with a break
            }
        }
        if (letterFound){
            System.out.println("The text has a letter 'A'.");
        } else {
            System.out.println("The text hasn't a letter 'A'.");
        }
    }
}
