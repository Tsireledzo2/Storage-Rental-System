package za.ac.cput.factory;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Booking;
import za.ac.cput.util.Helper;

import java.util.Date;

public class BookingFactory {

    public static Booking createBooking(Date date, Date startDate, Date endDate, boolean collection, double amount) {

        if (Helper.isNullorEmpty(date.toString()) || Helper.isNullorEmpty(startDate.toString())) {
            return null;
        }

        String id = Helper.generateId();

        Booking booking = new Booking.Builder()
                .setId(id)
                .setDate(date)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setCollection(collection)
                .setAmount(amount)
                .build();
        return booking;

    }
}
