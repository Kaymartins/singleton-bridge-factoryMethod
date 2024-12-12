package test;

import org.example.IOrder;
import org.example.TicketOrderFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketOrderFactoryTest {
    @Test
    void testValidTicketOrderCreation() {
        IOrder order = TicketOrderFactory.createTicketOrder("BusinessTicket");
        assertEquals("Business Ticket Ordered", order.makeOrder());
    }

    @Test
    void testInvalidTicketOrderCreation() {
        try {
            TicketOrderFactory.createTicketOrder("InvalidTicket");
        } catch (IllegalArgumentException e) {
            assertEquals("Order inexistent", e.getMessage());
        }
    }
}
