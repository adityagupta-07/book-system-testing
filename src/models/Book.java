package models;

public class Book {

    String name;
    int price;
    String author;
    boolean isDiscounted;
    Genre genre;

    public Book(String name, int price, String author, boolean isDiscounted, Genre genre) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isDiscounted = isDiscounted;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
