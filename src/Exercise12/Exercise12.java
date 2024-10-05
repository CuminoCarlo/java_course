package Exercise12;

public class Exercise12 {

    public static void main(String[] args) {


        try{
            int c =(30/0);
            System.out.println("The result is: "+c);
        } catch (ArithmeticException e) {
            System.out.println("Impossibile dividing for 0");
            e.printStackTrace();
        } finally {
            System.out.println("Dividing is fun!");
        }
    }
}
