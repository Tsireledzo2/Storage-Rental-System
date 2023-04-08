/**
 * This is a basecode
 * VehicleType.java
 * Entity for the VehicleType
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */

package za.ac.cput.domain;

public class VehicleType {
    private String name;
    private String category;
    private int capacity;
    private double price;

    private VehicleType(){}

    private VehicleType(Builder builder){
        this.name = builder.name;
        this.category = builder.category;
        this.capacity = builder.capacity;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "VehicleType{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public static class Builder{
        private String name;
        private String category;
        private int capacity;
        private double price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder copy(VehicleType vehicleType){
            this.name = vehicleType.name;
            this.category = vehicleType.category;
            this.capacity = vehicleType.capacity;
            this.price = vehicleType.price;
            return this;
        }

        public VehicleType build(){
            return new VehicleType(this);
        }
    }
}