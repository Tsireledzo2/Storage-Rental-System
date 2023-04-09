package za.ac.cput.repository.impl;

/*
 * BookingImplTest.java
 * BookingImplTest Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 07 April 2023
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookingImplTest {

    private static final BookingImpl repository = BookingImpl.getRepository();

    // Date date = new Date();

    private static final Booking booking = BookingFactory.createBooking(
            new Date(2023, 3, 8)
            , new Date(2023, 12, 8)
            , new Date(2023, 6, 8), true, 25);

    @Test
    @Order(1)
    void create() {
        Booking created = repository.create(booking);
        assertNotNull(created);
        assertEquals(booking.getId(), created.getId());
        System.out.println("Create" + created);
    }

    @Test
    @Order(2)
    void read() {
        Booking reading = repository.read(booking.getId());
        assertNotNull(reading);
        System.out.println("Read" + reading);
    }

    @Test
    @Order(3)
    void update() {
        Booking updated = new Booking.Builder().copy(booking)
                .setDate(new Date(2023, 3, 8))
                .setStartDate(new Date(2023, 12, 8))
                .setEndDate(new Date(2023, 6, 8))
                .setAmount(25)
                .setCollection(true)
                .build();
        assertNotNull(repository.update(updated));
    }

    @Test
    @Order(5)
    void delete() {
        boolean deleted = repository.delete(booking.getId());
        assertTrue(deleted);
        System.out.println("Deleted" + deleted);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Show all");
        System.out.println(repository.getAll());
    }
}