package ProjectChapter14;

import java.util.Scanner;

public class CoinTossGame {
    static Scanner scanner= new Scanner(System.in);
    static String guessPlayer1;
    static String guessPlayer2;

    public static void main(String[] args) {
        Coin coin=new Coin();
        String namePlayer1=SetName1();
        Player player1=new Player();
        player1.setName(namePlayer1);
        System.out.println("Welcome "+player1.getName());

        String namePlayer2=SetName2();
        Player player2= new Player();
        player2.setName(namePlayer2);
        System.out.println("Welcome "+player2.getName());

        System.out.println(player1.getName()+" insert here your guess.");
        System.out.println("Please, write in lower case.");
        guessPlayer1=SetGuess(guessPlayer1, guessPlayer2);
        player1.setGuess(guessPlayer1);


        if (guessPlayer1.equals(coin.getHEAD())){
            player2.setGuess(coin.getTAIL());
            guessPlayer2=player2.getName();
        } else if (guessPlayer1.equals(coin.getTAIL())) {
            player2.setGuess(coin.getHEAD());
            guessPlayer2=player2.getName();
        } else {
            System.out.println("The guess is invalid");
        }
        scanner.close();
        coin.flip();
        String sideCoin= coin.getSide();
        CheckFlip(sideCoin, guessPlayer1);

    }

    public static String SetName1(){
        System.out.println("Player 1 Insert here your name:");
       return scanner.next();
    }

    public static String SetGuess(String guessPlayer1, String guessPlayer2){
        System.out.println("Will it be head or tail?");
        return scanner.next();
    }

    public static String SetName2(){
        System.out.println("Player 2 insert here your name:");
        return scanner.next();
    }

    public static void CheckFlip(String side, String guess1){
        if (guess1.equals(side)){
            System.out.println("The side is "+ side+"! The winner is the player 1!");
        } else {
            System.out.println("The side is "+ side+"! The winner is the player 2!");
        }
    }
}
