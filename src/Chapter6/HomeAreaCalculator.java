package Chapter6;
/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String[] args) {
        /*******************
         * RECTANGLE 1
         ********************/
        //Create instance
        Rectangle room1 = new Rectangle(); //if I don't put anything I use the first constructor
        room1.setBase(25);
        room1.setAltezza(50);
        double areaRoom1= room1.calculateArea();
        double perimeterRoom1=room1.calculatePerimeter();

        /*******************
         * RECTANGLE 2
         ********************/
        Rectangle room2=new Rectangle(30,75); //Look how I save space
        double areaRoom2= room2.calculateArea();

        //calculate the total area of rooms
        double areaTotal= areaRoom1 + areaRoom2;

        System.out.println("The total of the areas is "+String.format("%.0f",areaTotal));



    }
}
