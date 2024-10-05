package Chapter6.Exercise;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill vodafone = new PhoneBill(01, 30, 50,60);
        vodafone.printBill();

        PhoneBill tim = new PhoneBill(02,30, 60, 40);
        tim.printBill();

        PhoneBill iliad = new PhoneBill(11, 30, 100000, 30);
        iliad.printBill();
    }

}
