package Chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen=calculator.getRoom();
        Rectangle bathroom=calculator.getRoom();
        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("Area totale: "+area);

        calculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Inserisci base:");
        double base= scanner.nextDouble();
        System.out.println("Inserisci altezza:");
        double altezza= scanner.nextDouble();

        return new Rectangle(base, altezza);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
