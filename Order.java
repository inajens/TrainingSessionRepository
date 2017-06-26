package com.company;

public class Order {
    public int id;
    public String product;
    public Address home;
    public Address delivery;
    public Address invoice;

    public Order (int id, String product, Address home, Address delivery, Address invoice) {
        this.id = id;
        this.product = product;
        this.home = home;
        this.delivery = delivery;
        this.invoice = invoice;
    }
}
