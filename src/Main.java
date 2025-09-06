import models.Book;
import models.BookOrders;
import models.Genre;
import models.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Genre g1 = new Genre("Fiction", "Best Fiction");
        Genre g2 = new Genre("Biography", "Best Biography");

        Book b1 = new Book("Ready Player One", 1234, "Test Author", false, g1);
        Book b2 = new Book("Elon Musk", 1445, "Ashley Vans", false, g2);

        BookOrders bo1 = new BookOrders(5, b1);
        BookOrders bo2 = new BookOrders(1, b2);

        ArrayList<BookOrders> bookOrdersArrayList = new ArrayList<>();
        bookOrdersArrayList.add(bo1);
        bookOrdersArrayList.add(bo1);

        Order o1 = new Order(123, bookOrdersArrayList);

        System.out.println("Hiiiiiiiiiiiiiiii");
        System.out.println("Hiiiiiiiiiiiiiiii"); //for branch2
    }
}