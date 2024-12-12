package org.example;

public class EconomyTicketOrder implements IOrder{
    public String makeOrder(){
        return "Economy Ticket Ordered";
    }

    public String cancelOrder(){
        return "Cancelled Economy Ticket";
    }
}
