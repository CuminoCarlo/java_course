package Chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private static String username;
    private static String oldPassword;
    private static boolean isValid;
    private static final Scanner scanner = new Scanner(System.in);

//    public PasswordValidator(String username, String oldPassword){
//        this.username=username;
//        this.oldPassword=oldPassword;
//    }

    public boolean isValid(){
        return isValid;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setOldPassword(String oldPassword){
        this.oldPassword=oldPassword;
    }

    public String getUsername(){
        return username;
    }

    public String getOldPassword(){
        return oldPassword;
    }

    public static String getProposedPassword(){
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Insert here your username");
        username=scanner.nextLine();
        System.out.println("Insert here your current password");
        oldPassword=scanner.nextLine();
        do {
            System.out.println("Insert here your proposed password");
            validPassword(getProposedPassword());
        } while (!isValid); {
            System.out.println("The password is valid");
            closeScanner();
        }

    }

    public static  void closeScanner() {
        scanner.close();
    }

    /*
     *Validate the password
     *@param newpsw Full string to be reverse
     */
    public static void validPassword(String newpsw){
        isValid=true;
        if (newpsw.length() < 8){
            isValid= false;
            System.out.println("The password must have more then 8 character");
        }

        if (newpsw.equals(oldPassword)) {
            isValid= false;
            System.out.println("The new password must be different from the older");
        }

        if (newpsw.equals(username)||newpsw.equals((username.toUpperCase()))){
            isValid= false;
            System.out.println("The password must be different from the username");
        }

        if (newpsw.equals(newpsw.toLowerCase())){
            isValid= false;
            System.out.println("The password must have at least one Uppercase letter!");
        }

        if(newpsw.matches("[a-zA-Z0-9 ]*")){ //regex for non special characters [a-zA-Z0-9 ]*
            isValid= false;
            System.out.println("The password must have one special character");

        }


    }
}

