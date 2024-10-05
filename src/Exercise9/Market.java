package Exercise9;

public class Market {

    public static void main(String[] args) {
        Fruit frutto =new Fruit(50);
        frutto.makeJuice();

        Orange sicilian = new Orange();
        sicilian.makeJuice();
        System.out.println("The calories in an orange are "+sicilian.getCalories());
        sicilian.peel();

        Banana banana = new Banana();
        banana.makeJuice();
        banana.peel();
        eatInOneBite(banana);

        Strewbarry strawberry= new Strewbarry();
        strawberry.makeJuice();
        eatInOneBite(strawberry);
    }

    public static void eatInOneBite(Fruit fruit){
        if (fruit instanceof Strewbarry){
            System.out.println("You can eat it in one bite. It's small");
        } else {
            System.out.println("You can't eat it in a one bite. It's too big");
        }

    }
}
