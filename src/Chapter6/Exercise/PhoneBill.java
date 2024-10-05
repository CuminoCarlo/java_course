package Chapter6.Exercise;

public class PhoneBill {
    //required variable
    private int id;
    private double planFlee;
    private double allotedMinutes;
    private double usedMinutes;

    public PhoneBill(int id, double planFlee, double allotedMinutes, double usedMinutes){
        this.id=id;
        this.planFlee=planFlee;
        this.allotedMinutes=allotedMinutes;
        this.usedMinutes=usedMinutes;
    }

    public int geId(){
        return id;
    }

    public double getPlanFlee() {
        return planFlee;
    }

    public double getAllotedMinutes() {
        return allotedMinutes;
    }

    public double getUsedMinutes() {
        return usedMinutes;
    }

    public double calculateOverageMinutes(){
        double overMinutes= usedMinutes-allotedMinutes;

        if (usedMinutes < allotedMinutes){
            overMinutes= 0;
        }
        return overMinutes*0.25;
    }

    public double calculateTax() {
        return (planFlee + calculateOverageMinutes())*0.15;
    }

    public double total() {
        return planFlee+calculateTax()+calculateOverageMinutes();
    }

    public void printBill(){
        System.out.println("Your phone bill");
        System.out.println("ID "+id);
        System.out.println("The base is $"+String.format("%.2f", planFlee));
        System.out.println("The used minutes are "+String.format("%.2f",usedMinutes));
        System.out.println("The allotted minutes are "+String.format("%.2f",allotedMinutes));
        System.out.println("The overage minutes are "+String.format("%.2f", calculateOverageMinutes()));
        System.out.println("The tax is $"+String.format("%.2f", calculateTax()));
        System.out.println("The total of the bill is $"+String.format("%.2f", total()));
    }


}
