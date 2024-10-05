package Chapter10;
//Class to test polymorphism

public class AnimalTester {
    public static void main(String[] args) {
        Animal unknow = new Animal();
        unknow.makeSound();

        Dog Lillo = new Dog();
        Lillo.makeSound();
        feed(Lillo);

        Cat briciola = new Cat();
        briciola.makeSound();
        briciola.purr();
        feed(briciola);
    }

    //instance of

    //Create a method in the tester class than put different output for the different animals

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Here is your dog food!");
        } else if (animal instanceof Cat) {
            System.out.println("Here is your cat food!");
        }
    }
}
