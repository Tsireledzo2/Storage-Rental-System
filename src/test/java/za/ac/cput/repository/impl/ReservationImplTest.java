package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Reservation;
import za.ac.cput.factory.ReservationFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReservationImplTest {

    private static ReservationImpl repository = ReservationImpl.getRepository();
    private static Reservation reservation = ReservationFactory.createReservation("1234",new Date(2023,8,04));

    @Test
    @Order(1)
    void create() {
        Reservation create = repository.create(reservation);
        assertNotNull(create);
        System.out.println("Created" + create);
    }

    @Test
    @Order(2)
    void read() {
        Reservation read = repository.read(reservation.getiD());
        assertNotNull(read);
        System.out.println("Read" + read);
    }

    @Test
    @Order(3)
    void update() {
        Reservation updated = new Reservation.Builder()
                .copy(reservation)
                .setBookingId("456")
                .setDate(new Date(2023,4,9))
                .build();
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(5)
    void delete() {
        boolean delete = repository.delete(reservation.getiD());
        assertTrue(delete);
        System.out.println(delete);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Showin All");
        System.out.println(repository);
    }
}