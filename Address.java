package com.company;

public class Address {
    private String name;
    private String addressline1;
    private String addressline2;
    private int zipcode;
    private String city;
    private String country;

    public Address (String name, String addressline1, String addressline2, int zipcode, String city, String country){
        this.name = name;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }

    public String toString () {
        return name + "\n" + addressline1 + "\n" + addressline2 + "\n" + zipcode + " " + city + "\n" + country ;
    }

    //Add on from 14
    public String getCityAndCountry() {
        return city + ", " + country;
    }
}
