package Chapter10;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }

    public void purr(){
        System.out.println("I love purring");
    }
}
