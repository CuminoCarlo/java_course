package Chapter7;
/*
 * Create a Lottery Quick Pick application that will generate a lottery ticket
 * with 6 random numbers, between 1 and 69.
 */

import java.util.Random;


public class LotteryTicket {
    private static final int LENGTH =6; //Variabile costante. Final indica che non si può editare, insieme a private e static
    private static final int MAX_TICKET_NUMBER=69;

    public static void main(String[] args) {
        int[] ticket= generateNumbers();
        printTicket(ticket);
    }

    //Default way
  /*  public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i=0; i<LENGTH; i++){
            ticket[i]=random.nextInt(MAX_TICKET_NUMBER)+1;
        }
        return ticket;
    } */

    //improved way
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
             */
            do {
                randomNumber=random.nextInt(MAX_TICKET_NUMBER)+1;
            } while(search(ticket, randomNumber));

            //Number is unique if we get here. Add it to the array.
            ticket[i]=randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        /**
         *This is called an enhanced loop.
         *It iterates through 'array' and
         *each time assigns the current element to 'value'
        */

        for (int value:array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static void printTicket(int ticket[]){
        System.out.println("The Lottery Numbers are:");
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i]+" | ");
        }

    }
}
