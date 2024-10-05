package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {

//        Person person = new Person();
//        person.setGender("NonBinary");

//        Employee employee = new Employee();
//        employee.setTitle("Doctor");
//        employee.setEmployeeId("3A1");

        //Override inherit methods
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square!");

        Mother mom = new Mother();

        mom.setName("Lyla");
        System.out.println("The mom name is "+mom.getName()+" and she is a "+mom.getGender());


    }
}
