package Chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        //createNewFile();
        numberOfExceptionsHandlings();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            //System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void numberOfExceptionsHandlings(){
        File file= new File("resources/Numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            //to read the lines
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
            
        } catch (FileNotFoundException |InputMismatchException e){ //You can put other catch block, it's a way to save code
            e.printStackTrace();
        } finally {
            fileReader.close();
        }

    }
}
