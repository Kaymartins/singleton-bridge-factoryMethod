package org.example;

public class AzulAirline implements Airline{
    public void bookFlight(String destination) {
        System.out.println("AzulAirline: reserva feita " + destination);
    }
}
