package za.ac.cput.repository;

/*
 * BookingRepository.java
 * BookingRepository Entity
 * @author: Argus Hakizimana Mbogo (220073260)
 * Date: 07 April 2023
 */

import za.ac.cput.domain.Booking;

import java.util.Set;

public interface IBookingRepository extends IRepository<Booking, String> {

    Set<Booking> getAll();
}
