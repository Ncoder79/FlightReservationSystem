package com.company;

public class Tickets {
    public String pnr;
    public String departureCity;
    public String destinationCity;
    Flight flight;
    public String departureDateTime;
    public String arrivalDateTime;
    Passenger passenger;
    public String seatNo;
    public float price;
    public boolean cancelled;
    public String pnrStatus;

    public String checkStatus() {
        return pnrStatus;
    }

    public int getFlightDuration() {
        return 1;
    }

    public void cancel(){

    }

}
