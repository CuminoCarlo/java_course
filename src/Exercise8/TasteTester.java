package Exercise8;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake("chocolate");
        System.out.println("The flavour of the cake is "+cake.getFlavour());

        BirthdayCake birthday = new BirthdayCake();
        birthday.setPrice(25.00);
        System.out.println("The flavour of the birthday cake is "+birthday.getFlavour()+
                " and its price "+birthday.getPrice()+"$");

        WeedingCake weedingCake = new WeedingCake();;
        weedingCake.setPrice(60.00);
        System.out.println("The flavour of the weeding cake is "+weedingCake.getFlavour()+
                " and its price "+weedingCake.getPrice()+"$");
    }
}
