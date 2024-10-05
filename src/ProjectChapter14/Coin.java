package ProjectChapter14;

/**
 * The class coin must have:
 * A field called side
 * Encapsulation
 * Constant variables for head and tails
 * A method to random flipping the coin and assign the value
 */

public class Coin {
    //Initialize what I know
    private String side;

    public void setSide(String side) {
        this.side = side;
    }
    public String getSide(){
        return side;
    }

    private String HEAD = "head";
    private String TAIL = "tail";

    public String getHEAD(){
        return HEAD;
    }

    public String getTAIL(){
        return TAIL;
    }

    //Write a method to set the value of the coin
    public void flip(){
        if (Math.random() < 0.5){
            setSide(HEAD);
        } else {
            setSide(TAIL);
        }
    }


}
