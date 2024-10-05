package Exercise9;

public class Orange extends Fruit{

    @Override
    public void makeJuice() {
        System.out.println("Here is the orange juice");
    }

    public void peel(){
        System.out.println("You can also peel the orange");
    }

    //Overload
    public Orange(){
        super(76);
    }
}
