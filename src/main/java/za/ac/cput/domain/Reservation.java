package za.ac.cput.domain;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import java.util.Date;
import java.util.Objects;

public class Reservation {

    private String iD, bookingId;
    private Date date;

    public Reservation(String bookingId, Date date) {
        this.bookingId = bookingId;
        this.date = date;
    }

    public Reservation(String iD, String bookingId, Date date) {
        this.iD = iD;
        this.bookingId = bookingId;
        this.date = date;
    }

    private Reservation(Builder builder) {
        this.iD = builder.iD;
        this.bookingId = builder.bookingId;
        this.date = builder.date;
    }

    public String getiD() {
        return iD;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "iD='" + iD + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(iD, that.iD) && Objects.equals(bookingId, that.bookingId) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, bookingId, date);
    }

    public static class Builder {
        private String iD, bookingId;
        private Date date;

        public Builder setiD(String iD) {
            this.iD = iD;
            return this;
        }

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder copy(Reservation reservation) {
            this.iD = reservation.iD;
            this.bookingId = reservation.bookingId;
            this.date = reservation.date;
            return this;
        }

        public Reservation build() {return new Reservation(this);}
    }
}

