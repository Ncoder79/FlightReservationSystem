package com.company;

public class TouristTicket {
    public String hotelAddress;
    public String[] selectedTouristLocation = new String[5];
    public String getHotelAddress(){
        return hotelAddress;
    }
    public String[] getTouristLocation(){
        return selectedTouristLocation;
    }

    public void removeTouristLocation(String location){

    }

    public void addTouristLocation(String location){

    }

}