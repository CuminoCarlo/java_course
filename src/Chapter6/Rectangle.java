package Chapter6;
/* *
* Create a rectangle object with variable (fields) and methods
* to calculate perimeter and area.
* Then import that methods on another class
*/
public class Rectangle {
    private double base;
    private double altezza;

    //Constructor
    public Rectangle(){
        base=0;
        altezza=0;
    }

    //Create another constructor with different values
    public Rectangle(double base, double altezza){
        setAltezza(altezza); //we can use also the same syntax of setter methods
        setBase(base);
    }

    //Insert getter and setter to make able other person to use (set) or read (get) those values
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base=base;
    }

    public double getAltezza(){
        return altezza;
    }
    public void setAltezza(double altezza){
        this.altezza=altezza;
    }

    double calculatePerimeter(){
      return  (2 * base) + (2 * altezza);
    }

    double calculateArea(){
        return base * altezza;
    }

}
