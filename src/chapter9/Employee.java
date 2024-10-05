package chapter9;

import java.security.PrivateKey;

//Subclass who extends a superclass
public class Employee extends Person{

    private String employeeId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    private String title;

//    public Employee(){
//        super("Carlo");
//        System.out.println("In Employee default constructor");
//    }
    /*
     * Super class of constructor are run first of the subclass constructors.
     * use "super" in a subclass to recall a specific constructor with parameter from the super
     * The subclasses must explicity recall a constructor from the super class
     */

}
