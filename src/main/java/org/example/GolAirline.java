package org.example;

public class GolAirline implements Airline{
    public void bookFlight(String destination) {
        System.out.println("GolAirline: reserva feita " + destination);
    }
}
