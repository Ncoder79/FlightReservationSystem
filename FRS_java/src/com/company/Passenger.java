package com.company;

public class Passenger {
    public int id;
    Address address;
    Contact contact;

    public Contact getContact() {
        return contact;
    }

    public Address getAddress(){
        return address;
    }
}
