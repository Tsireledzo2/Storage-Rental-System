/**
 * This is the StorageUnitType class
 * Author Ruvimbo Ndoro 220128871
 * Date 8May 2023
 */

/**
 *  StorageUnitType.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */
package za.ac.cput.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class StorageUnitType implements Serializable {

    private double length;
    private double width;
    private double height;
    private int unitSize;
    private double price;

    public StorageUnitType() {
    }

    private StorageUnitType(Builder builder) {

        this.length = builder.length;
        this.width = builder.width;
        this.height = builder.height;
        this.unitSize = builder.unitSize;
        this.price = builder.price;


    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getUnitSize() {
        return unitSize;
    }

    public void setUnitSize(int unitSize) {
        this.unitSize = unitSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageUnitType that = (StorageUnitType) o;
        return Double.compare(that.length, length) == 0 && Double.compare(that.width, width) == 0 && Double.compare(that.height, height) == 0 && unitSize == that.unitSize && Double.compare(that.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height, unitSize, price);
    }

    @Override
    public String toString() {
        return "StorageUnitType{" +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", unitSize=" + unitSize +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private double length;
        private double width;
        private double height;
        private int unitSize;
        private double price;


        public Builder setLength(double length) {
            this.length = length;
            return this;
        }

        public Builder setWidth(double width) {
            this.width = width;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setUnitSize(int UnitSize) {
            this.unitSize = unitSize;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder copy(StorageUnitType storageUnitType) {
            this.length = storageUnitType.length;
            this.width = storageUnitType.width;
            this.height = storageUnitType.height;
            this.unitSize = storageUnitType.unitSize;
            this.price = storageUnitType.price;
            return this;
        }

        public StorageUnitType build() {
            return new StorageUnitType(this);

        }
    }
}