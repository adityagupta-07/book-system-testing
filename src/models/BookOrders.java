package models;

public class BookOrders {

    int quantity;
    Book book;

    public BookOrders(int quantity, Book book) {
        this.quantity = quantity;
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
