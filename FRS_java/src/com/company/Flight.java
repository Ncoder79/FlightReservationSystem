package com.company;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    private int bookedSeats;

    public String getFlightDetails(){
        return flightNumber+ " "+airline;
    }
    public boolean checkAvailability(){
        if ((capacity - bookedSeats)!=0) return true;
        return false;
    }

    public void incrementBookingCounter(){

    }

}
