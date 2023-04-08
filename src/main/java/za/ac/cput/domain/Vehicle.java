/**
 * Vehicle.java
 * Entity for the Vehicle
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.domain;

public class Vehicle {
    private String vehicleID;
    private String numberPlate;
    private boolean status;

    private Vehicle(){}

    //builder constructor
    private Vehicle(Builder builder){
        this.vehicleID = builder.vehicleID;
        this.numberPlate = builder.numberPlate;
        this.status = builder.status;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID='" + vehicleID + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", status=" + status +
                '}';
    }

    public static class Builder{
        private String vehicleID;
        private String numberPlate;
        private boolean status;

        public Builder setVehicleID(String vehicleID) {
            this.vehicleID = vehicleID;
            return this;
        }

        public Builder setNumberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder copy(Vehicle vehicle){
            this.vehicleID = vehicle.vehicleID;
            this.numberPlate = vehicle.numberPlate;
            this.status = vehicle.status;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}