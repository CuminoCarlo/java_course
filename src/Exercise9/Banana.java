package Exercise9;

public class Banana extends Fruit{

    @Override
    public void makeJuice() {
        System.out.println("It's hard making banana juice");
    }

    public void peel(){
        System.out.println("You can peel a banana with your hands");
    }

    public Banana(){
        super(9);
    }
}
