package ProjectChapter14;

import java.util.Scanner;

public class CoinTossGame {
    static Scanner scanner= new Scanner(System.in);
    static String guessPlayer1;
    static String guessPlayer2;

    public static void main(String[] args) {
        CoinTossGame game= new CoinTossGame();
        Coin coin=new Coin();
        Player player1=new Player();
        player1.setName(game.AskName());
        System.out.println("Welcome "+player1.getName());

        Player player2= new Player();
        player2.setName(game.AskName());
        System.out.println("Welcome "+player2.getName());

        System.out.println(player1.getName()+" insert here your guess.");
        System.out.println("Please, write in lower case.");
        guessPlayer1=SetGuess();
        player1.setGuess(guessPlayer1);


        if (guessPlayer1.equals(coin.getHEAD())){
            player2.setGuess(coin.getTAIL());
            guessPlayer2=player2.getName();
        } else if (guessPlayer1.equals(coin.getTAIL())) {
            player2.setGuess(coin.getHEAD());
            guessPlayer2=player2.getName();
        } else {
            System.out.println("The guess is invalid");
            guessPlayer1=SetGuess();
        }
        scanner.close();
        coin.flip();
        coin.getSide();
        CheckFlip(coin.getSide(), guessPlayer1, player1, player2);

    }

    public static String AskName(){
        System.out.println("Insert here your name:");
       return scanner.next();
    }

    public static String SetGuess(){
        System.out.println("Will it be head or tail?");
        return scanner.next();
    }

    public static void CheckFlip(String side, String guess1, Player p, Player p2){
        if (guess1.equals(side)){
            System.out.println("The side is "+ side+"! "+p.getName()+", you are the winner!");
        } else {
            System.out.println("The side is "+ side+"! "+p2.getName()+", you are the winner!");
        }
    }
}
