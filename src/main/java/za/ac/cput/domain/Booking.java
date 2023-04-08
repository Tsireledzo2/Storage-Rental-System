package za.ac.cput.domain;

/*
 * Booking.java
 * Booking Entity
 * @author: Argus Hakizimana Mbogo
 * Student N.o 220073260
 * Date: 07 April 2023
 */

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Booking {
    private String id;
    private Date date, startDate , endDate;
    private boolean collection;
    private double Amount;

    private Booking() {
    }

    private Booking(String id, Date date, Date startDate, Date endDate, boolean collection, double amount) {
        this.id = id;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
        this.collection = collection;
        Amount = amount;
    }

    private Booking (Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.collection = builder.collection;
        this.Amount = builder.Amount;

    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isCollection() {
        return collection;
    }

    public double getAmount() {
        return Amount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", collection=" + collection +
                ", Amount=" + Amount +
                '}';
    }

    public static class Builder {

        private String id;
        private Date date, startDate , endDate;
        private boolean collection;
        private double Amount;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setCollection(boolean collection) {
            this.collection = collection;
            return this;
        }

        public Builder setAmount(double amount) {
            Amount = amount;
            return this;
        }

        public Builder copy(Booking booking) {
            this.id = booking.id;
            this.date = booking.date;
            this.startDate = booking.startDate;
            this.endDate = booking.endDate;
            this.collection = booking.collection;
            this.Amount = booking.Amount;
            return this;
        }

        public Booking build() {return new Booking(this);}
    }
}

