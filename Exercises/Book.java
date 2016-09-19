/**
 * Created by jc247746 on 19/09/16.
 */
public abstract class Book {
    String bookTitle;
    double price;

    public Book(String bookTitle) {
        System.out.println(bookTitle + " costs " + price);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}
