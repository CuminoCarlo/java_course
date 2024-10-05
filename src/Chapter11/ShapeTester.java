package Chapter11;

public class ShapeTester {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle(8,6.5);
        rectangle.print();
        System.out.println("The area is "+rectangle.calculateArea());
    }
}
