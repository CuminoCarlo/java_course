package Chapter11;

public class Rectangle extends Shape{
    private double length;
    private double heigth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public Rectangle(double length, double heigth){
        setHeigth(heigth);
        setLength(length);
    }

    @Override
    double calculateArea() {
       return length*heigth;
    }

    @Override
    public void print(){
        System.out.println("I am a rectangle");
    }
}
