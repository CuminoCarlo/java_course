package chapter2;

import java.util.Scanner;

public class Exercise1 {
    public static void main (String[] args){


    //1. Ask a season of of year
    System.out.println("Insert a season");
    Scanner scanner = new Scanner(System.in);
    String season= scanner.next();

    //2. Ask a number
    System.out.println("Insert a number");
    int number= scanner.nextInt();

    //3. Ask a adjective
    System.out.println("Insert an adjective");
    String adj=scanner.next();
    scanner.close();

    //4. Compose the string
    System.out.println("On a "+adj+" "+season+" day, I drink a minimum of "+number+ " cups of coffee");



    }
}
