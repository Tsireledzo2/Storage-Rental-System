package za.ac.cput.repository;

/*
 * ReservationRepository.java
 * Entity for ReservationRepository
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Reservation;

import java.util.Set;

public interface IReservationRepository extends IRepository<Reservation, String> {
    Set<Reservation> getAll();
}
