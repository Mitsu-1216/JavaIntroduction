package practice.practice6.practice11_3;

public class Book extends TangibleAsset {
    String isbn;

    public Book(String name, int price, String color, String isbr) {
        super(name, price, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }
}
