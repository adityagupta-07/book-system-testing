package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {

    int orderID;
    ArrayList<BookOrders> bookOrders;

    public Order(int orderID, ArrayList<BookOrders> bookOrders) {
        this.orderID = orderID;
        this.bookOrders = bookOrders;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public ArrayList<BookOrders> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(ArrayList<BookOrders> bookOrders) {
        this.bookOrders = bookOrders;
    }
}
