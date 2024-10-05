package chapter4;

/*
 * NESTED LOOPS
 * Find average of each student (24) test score
 * There 4 test for each students
 */

import java.util.Scanner;

public class AvarageTestScore {

    public static void main(String[] args) {

        //Initiliaze values
        int students=3;
        int tests=4;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<students; i++){
            double scoreSum=0;
            for (int j =0; j<tests; j++) {

                System.out.println("Insert the test #"+(j+1)+ " score");
                double score= scanner.nextDouble();
                scoreSum= scoreSum + score;
            }
            double scoreAv= scoreSum/tests;
            System.out.println("The average score for the student "+(i+1)+" is "+scoreAv);
        }

        scanner.close();
    }
}
