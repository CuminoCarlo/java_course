package Exercise9;

public class Fruit {
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Fruit(int calories){
        setCalories(calories);
    }

    public void makeJuice(){
        System.out.println("Here is your fruit juice!");
    }
}
