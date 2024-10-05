package chapter4;

import java.util.Random;

/**
 * Create a board games
 * 20 spaces board
 * with 5 roll for a d6
 * player start from space 1
 */

public class Exercise3 {
    public static void main(String[] args) {

        //Initialize what I know
        int spaces=20;
        int totalRolls=5;
        int playerSpace=0;

        Random random = new Random();

        System.out.println("Come on! Roll the dice!");

        for (int i=1; i<=totalRolls; i++) {
            int dice=random.nextInt(6)+1;
            System.out.println("Roll number "+i+". The dice value is: "+dice);

            playerSpace=dice+playerSpace;

            System.out.println("You move of "+dice+" spaces! You are at the space #"+playerSpace);

            if(playerSpace == spaces){
                System.out.println("Congratulation! You Win!");
                break;
            } else if (playerSpace > spaces) {
                System.out.println("Sorry you have exceeded the last space. You lose!");
                break;
            } else if (i==totalRolls && playerSpace < spaces) {
                System.out.println("Sorry you have not achieved the last space. You lose!");
                break;
            } else {
                int remanent = spaces - playerSpace;
                System.out.println("You need only "+remanent+" space! Come on!");
            }
        }
    }
}
