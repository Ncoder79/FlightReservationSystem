package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address address = new Address();
        address.street = "Greenfield";
        address.city   = "Faridabad";
        address.state  = "Haryana";
        System.out.println(address.getAddressDetails());
        //System.out.println("hello");
    }
}
