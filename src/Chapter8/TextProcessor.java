package Chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("Hello!It'sMe!Hello!");
    }

    /*
     *Split String into array by tokenizing it.
     *Counts words and prints them
     *@param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords=words.length;
        String message = String.format("Your test contain %d words", numberOfWords);
        System.out.println(message);

        for (int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }


    }

    /*
     *Reverse String
     *@param text Full string to be reverse
     */
    public static void reverseString(String text) {
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }

    }

    /*
     *Split String where is a capital letter
     *@param text Full string to be split
     */
    public static void addSpaces(String text){
        var modifiedText= new StringBuilder(text);

        for (int i=0; i<modifiedText.length(); i++) { //search for the length of modifiedText
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))) { //if after the first character the char is an upper case
                modifiedText.insert(i, " "); //Insert a space after the char
                i++;
            }
        }
        System.out.println(modifiedText);
    }


}
