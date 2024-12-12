package org.example;

public class ReservationManager {
    private static ReservationManager instance;

    private ReservationManager() {
    }

    public static ReservationManager getInstance() {
        if (instance == null) {
            instance = new ReservationManager();
        }
        return instance;
    }

    public void notifyReservation(String ticketType, String airline, String destination) {
        System.out.println("Reserva adicionada: " + ticketType + " - " + airline + " para " + destination);
    }
}
