package Exercise9;

public class Strewbarry extends Fruit{
    public Strewbarry(){
        super(10);
    }

    @Override
    public void makeJuice() {
        System.out.println("Strawberry juice is unusual");
    }
}
