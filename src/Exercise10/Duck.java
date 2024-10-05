package Exercise10;

public class Duck extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Quack Quack!");
    }

    public void eat(String seed){
        System.out.println("I am eating "+seed);
    }
}
