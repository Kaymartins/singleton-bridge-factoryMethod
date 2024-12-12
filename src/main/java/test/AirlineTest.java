package test;

import org.example.Airline;
import org.example.AzulAirline;
import org.example.GolAirline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {

    @Test
    void testAirlineBooking(){
        Airline azul = new AzulAirline();
        Airline gol = new GolAirline();

        azul.bookFlight("Rio de janeiro");
        assertEquals("AzulAirline", azul.getClass().getSimpleName());

        gol.bookFlight("Porto Alegre");
        assertEquals("GolAirline", gol.getClass().getSimpleName());
    }


}
