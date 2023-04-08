package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.repository.impl.BookingImpl;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void createBooking() {
        BookingImpl booking = BookingImpl.getRepository();
        System.out.println(booking);
        assertNotNull(booking);
    }
}