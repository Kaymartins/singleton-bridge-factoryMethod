package org.example;

public class BusinessTicketOrder implements IOrder{
    public String makeOrder(){
        return "Business Ticket Ordered";
    }

    public String cancelOrder(){
        return "Business Economy Ticket";
    }
}
