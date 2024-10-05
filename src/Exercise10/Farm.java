package Exercise10;

public class Farm {
    public static void main(String[] args) {
        Pig porky = new Pig();
        porky.makeSound();
        porky.eat();

        Duck paolinus = new Duck();
        paolinus.makeSound();
        paolinus.eat("corn");
    }
}
