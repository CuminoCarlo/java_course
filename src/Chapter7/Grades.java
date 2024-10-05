package Chapter7;

import java.util.Scanner;

public class Grades {
    /*
     * Create a program that allows a user to enter any
     * number of grades and provides them with their
     * average score, as well as the highest and lowest scores.
     */
    public static int grades[];
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many grade you want sum?");
        grades =new int [scanner.nextInt()]; //set the max number of position in the Array
        getGrades(); //to get grade

        System.out.println("The average of the grade is "+averageGrades());
        System.out.println("The highest of the grade is "+getHighest());
        System.out.println("The lowest of the grade is "+getLowest());


    }

    public static void getGrades(){
        //To assign the grades to the single elements
        for (int i=0; i < grades.length; i++){
            System.out.println("Insert the grade number "+(i+1)+" here:");
            grades[i]= scanner.nextInt(); //This time I set the single values of the element
        }
    }

    /*
     * Let's found the average
     * Create two method. One for sum the other to avarage
     * Let's return in main only the one for the average
     * */
    public static int sumGrades(){
        int sum=0;
        //use for-each loop. Syntax element:elements
        for(int grade : grades){
            sum= sum + grade;
        }
        return sum;
    }

    public static int averageGrades(){
        return sumGrades()/grades.length;
    }

    //Let's create a method to find the highest grade
    public static int getHighest(){
        //Create a variable highest, set to the first value of the array
        int highest = grades[0];
        //create a for-each loop
        for (int grade:grades) {
            //search if grade is bigget than highest
            if (grade > highest){
                //put the value of the grade in highest
                highest = grade;
            }
        }
        return highest;
    }

    //Let's create a method to find the lowest grade
    public static int getLowest(){
        //Create a variable highest, set to the first value of the array
        int lowest = grades[0];
        //create a for-each loop
        for (int grade:grades) {
            //search if grade is lowest than the lowest variable
            if (grade < lowest){
                //put the value of the grade in lowest
                lowest = grade;
            }
        }
        return lowest;
    }

}
