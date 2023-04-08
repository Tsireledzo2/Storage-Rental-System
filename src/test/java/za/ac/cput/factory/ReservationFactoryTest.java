package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.repository.impl.BookingImpl;
import za.ac.cput.repository.impl.ReservationImpl;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFactoryTest {

    @Test
    void createReservation() {
        ReservationImpl reservation = ReservationImpl.getRepository();
        System.out.println(reservation);
        assertNotNull(reservation);
    }
}