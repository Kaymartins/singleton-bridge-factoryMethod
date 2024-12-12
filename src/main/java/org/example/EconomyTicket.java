package org.example;

public class EconomyTicket extends Ticket {
    public EconomyTicket(Airline airline) {
        super(airline);
    }

    public void reserve(String destination){
        airline.bookFlight(destination);
    }
}
