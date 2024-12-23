package org.example;

public abstract class Ticket {
    protected Airline airline;

    public Ticket(Airline airline) {
        this.airline = airline;
    }

    public abstract void reserve(String destination);
}
