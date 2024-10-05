package Chapter11;

//Product is similar to abstract but with other method than the abstract ones

public interface Product {

    //Getter and setter in an interface are final so are a constant
    double getPrice();
    void setPrice(double Price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    //default is a keyword to add new method without the need of implents them in other classese
    default String getBarcode(){
        return "No barcode";
    }
}
