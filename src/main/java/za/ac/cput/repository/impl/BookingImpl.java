package za.ac.cput.repository.impl;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Booking;
import za.ac.cput.repository.IBookingRepository;

import java.util.HashSet;
import java.util.Set;

public class BookingImpl implements IBookingRepository {

    public static BookingImpl repository = null;

    public Set<Booking> bookingDb;

    private BookingImpl() { bookingDb = new HashSet<>();}

    public static BookingImpl getRepository() {
        if(repository == null){
            repository = new BookingImpl();
        }
        return repository;
    }
    @Override
    public Booking create(Booking booking) {
        boolean added = bookingDb.add(booking);
        if(!added){
            return null;
        }
        return booking;
    }

    @Override
    public Booking read(String id) {
        return bookingDb.stream()
                .filter(Book -> Book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        Booking oldBooking = read(booking.getId());
        if(oldBooking != null){
            bookingDb.remove(oldBooking);
            bookingDb.add(booking);
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Booking bookingToDelete = read(id);
        if(bookingToDelete == null){
            return false;
        }
        bookingDb.remove(bookingToDelete);
        return true;
    }

    @Override
    public Set<Booking> getAll() {
        return bookingDb;
    }
}
