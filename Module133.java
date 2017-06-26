package com.company;

public class Module133 {

    public static void main(String[] args) {
        //Create address objects
        Address home = new Address("Maja Svensson","Storgatan 21","2 tr",12245,"Stockholm","Sweden");
        Address delivery = new Address("Maja Svensson","Gammelvägen 13","2 tr",12245,"Stockholm","Sweden");
        Address invoice = new Address("Maja Svensson","Storgatan 21","2 tr",12245,"Stockholm","Sweden");

        //Create order object
        Order ord001 = new Order(13,"Banankaka",home,delivery,invoice);

        //Print entire invoice address
        System.out.println(ord001.invoice);

        //Print city and address using getter
        System.out.println(ord001.invoice.getCityAndCountry());
    }
}
