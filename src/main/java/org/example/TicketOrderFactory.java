package org.example;

public class TicketOrderFactory {
    public static IOrder createTicketOrder(String order) {
        Class classe = null;
        Object object = null;

        try{
            classe = Class.forName("org.example." + order + "Order");
            object = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Order inexistent");
        }

        if(!(object instanceof IOrder)){
            throw new IllegalArgumentException("Order invalid");
        }

        return (IOrder)object;

    }
}
