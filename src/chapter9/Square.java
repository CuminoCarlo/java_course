package chapter9;

public class Square extends Rectangle {

    //We have to override the method to calculate the perimeter because it's different between rectangle and square
    @Override
    public double calculatePerimeter(){
        return sides*length;
    }

    //overload the print method in rectangle
    public void print(String what){ //this method pass a string named what
        System.out.println("I am a "+what);

    }
}
