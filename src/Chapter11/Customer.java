package Chapter11;

public class Customer {
    public static void main(String[] args) {
        Book book = new Book();
        book.setPrice(9.99);

        System.out.println(book.getPrice());
    }
}
