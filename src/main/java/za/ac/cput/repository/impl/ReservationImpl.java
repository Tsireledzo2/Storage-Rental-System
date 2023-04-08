package za.ac.cput.repository.impl;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Reservation;
import za.ac.cput.repository.IReservationRepository;

import java.util.HashSet;
import java.util.Set;

public class ReservationImpl implements IReservationRepository {

    private static ReservationImpl repository = null;

    private Set<Reservation> reservationDb;

    public  ReservationImpl() {
        reservationDb = new HashSet<>();
    }

    public static ReservationImpl getRepository() {
        return (repository == null) ? repository = new ReservationImpl() : repository;}
    @Override
    public Reservation create(Reservation reservation) {

        return reservationDb.add(reservation) ? reservation : null;
    }

    @Override
    public Reservation read(String iD) {
        return reservationDb.stream()
                .filter(reservation -> reservation.getiD().equals(iD))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Reservation update(Reservation reservation) {
        Reservation oldReservation = read(reservation.getiD());
        if(oldReservation != null){
            reservationDb.remove(oldReservation);
            reservationDb.add(reservation);
            return reservation;
        }
        return null;
    }

    @Override
    public boolean delete(String iD) {
        return reservationDb.removeIf(reservation -> reservation.getiD().equals(iD));
    }

    @Override
    public Set<Reservation> getAll() {
        return reservationDb;
    }
}