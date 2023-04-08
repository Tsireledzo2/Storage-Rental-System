/**
 * This is the StorageUnitType class
 * Author Ruvimbo Ndoro 220128871
 * Date 8May 2023
 */



package za.ac.cput.domain;

public class StorageUnitType {

    private String id;
    private double length;
    private double width;
    private double height;
    private int unitSize;
    private double price;

    private StorageUnitType() {
    }

    private StorageUnitType(Builder builder) {
        this.id = builder.id;
        this.length = builder.length;
        this.width = builder.width;
        this.height = builder.height;
        this.unitSize = builder.unitSize;
        this.price = builder.price;


    }


    public String getId() {
        return id;
    }



    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getUnitSize() {
        return unitSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "StorageUnitType{" +
                "id=" + id +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", unitSize=" + unitSize +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String id;
        private double length;
        private double width;
        private double height;
        private int unitSize;
        private double price;


        public Builder setId(String id) {
            this.id = id;
            return this;
        }



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
            this.id = storageUnitType.id;
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
