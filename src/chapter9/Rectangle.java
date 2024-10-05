package chapter9;

public class Rectangle {
    protected double length;
    protected double height;
    protected int sides = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double calculatePerimeter (){
        return (2*length)+(2*height);
    }

    //Overload inherit methods
    //Create her the super method
    public void print(){
        System.out.println("I am a rectangle!");
    }

}
