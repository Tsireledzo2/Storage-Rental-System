package za.ac.cput.factory;
/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Reservation;
import za.ac.cput.util.Helper;

import java.util.Date;

public class ReservationFactory {
    public static Reservation createReservation(String bookingId, Date date) {

        if(Helper.isNullorEmpty(bookingId) || Helper.isNullorEmpty(date.toString())){
            return null;
        }

        String id = Helper.generateId();

        Reservation reservation = new Reservation.Builder()
                .setiD(id)
                .setBookingId(bookingId)
                .setDate(date)
                .build();
        return reservation;


    }
}
