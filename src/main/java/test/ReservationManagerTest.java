package test;

import org.example.ReservationManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationManagerTest {

    @Test
    void testSingletonInstance() {
        ReservationManager instance1 = ReservationManager.getInstance();
        ReservationManager instance2 = ReservationManager.getInstance();

        assertEquals(instance1, instance2);
    }

    @Test
    void testAddReservation() {
        ReservationManager manager = ReservationManager.getInstance();
        manager.notifyReservation("Business", "AzulAirline", "São Paulo");
        assertEquals(manager, ReservationManager.getInstance());
    }
}
