package za.ac.cput.repository.impl;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Reservation;
import za.ac.cput.repository.IReservationRepository;

import java.util.HashSet;
import java.util.Set;

public class ReservationImpl implements IReservationRepository {

    private static ReservationImpl repository = new ReservationImpl();

    private Set<Reservation> ReservationDb = new HashSet<>();

    public static ReservationImpl getRepository() {return  repository;}
    @Override
    public Reservation create(Reservation reservation) {
        return ReservationDb.add(reservation) ? reservation : null;
    }

    @Override
    public Reservation read(String iD) {
        return ReservationDb.stream()
                .filter(res -> res.getBookingId().equals(iD))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return null;
    }

    @Override
    public boolean delete(String iD) {
        return ReservationDb.removeIf(res -> res.getBookingId().equals(iD));
    }

    @Override
    public Set<Reservation> getAll() {
        return ReservationDb;
    }
}