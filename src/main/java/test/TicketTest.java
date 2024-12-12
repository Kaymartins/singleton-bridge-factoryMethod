package test;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    void testBusinessTicketReservation(){
        Airline azul = new AzulAirline();
        Ticket businessTicket = new BusinessTicket(azul);

        businessTicket.reserve("Curitiba");
        assertEquals("BusinessTicket", businessTicket.getClass().getSimpleName());
    }

    @Test
    void testEconomyTicketReservation() {
        Airline gol = new GolAirline();
        Ticket economyTicket = new EconomyTicket(gol);

        economyTicket.reserve("Florianópolis");
        assertEquals("EconomyTicket", economyTicket.getClass().getSimpleName());
    }
}
