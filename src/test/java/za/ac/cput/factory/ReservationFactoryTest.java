package za.ac.cput.factory;

/*
 * ReservationFactoryTest.java
 * Entity for ReservationFactoryTest
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 07 April 2023
 */

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Reservation;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFactoryTest {

    @Test
    void testObjectEquality() {
        Reservation reservation1 = new Reservation("1234", new Date(2023, 8, 04));
        Reservation reservation2 = new Reservation("1234", new Date(2023, 8, 04));

        assertEquals(reservation1, reservation2, "Passed");
    }

    @Test
    void testObjectIdentity() {
        Reservation reservation1 = new Reservation("1011", new Date(2021, 7, 9));
        Reservation reservation2 = new Reservation("6798", new Date(2023, 8, 4));

        assertNotSame(reservation1, reservation2, "Passed");
    }

    @Test
    void testObjectFailing() {
        Reservation reservation1 = new Reservation("1234", new Date(2023, 5, 4));
        Reservation reservation2 = new Reservation("1234", new Date(2023, 8, 4));
        assertNotEquals(reservation2, reservation1, "Test passed");
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        Reservation reservation1 = new Reservation("1234", new Date(2023, 8, 04));
        Reservation reservation2 = new Reservation("1234", new Date(2023, 8, 04));

        assertEquals(reservation1, reservation2, "Passed");
    }

    @Test
    @Ignore("This test is not implemented")
    void testDisabling() {
        Reservation reservation1 = new Reservation("1234", new Date(2023, 8, 04));
        Reservation reservation2 = new Reservation("1234", new Date(2023, 8, 04));

        assertEquals(reservation1, reservation2, "Passed");
    }
}