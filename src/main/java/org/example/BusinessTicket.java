package org.example;

public class BusinessTicket extends Ticket{
    public BusinessTicket(Airline airline) {
        super(airline);
    }

    public void reserve(String destination){
        airline.bookFlight(destination);
    }
}
