package za.ac.cput.repository;
/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

public interface IRepository<objectType, t> {
    //crud
    objectType create(objectType objectType);

    objectType read(t t);

    objectType update(objectType objectType);

    boolean delete(t t);


}
