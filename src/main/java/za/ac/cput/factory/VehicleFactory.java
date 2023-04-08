package za.ac.cput.factory;

import za.ac.cput.domain.Vehicle;
import za.ac.cput.util.Helper;

public class VehicleFactory {
    public static Vehicle buildVehicle(String numberPlate, boolean status){
        if(Helper.isNullorEmpty(numberPlate)){
            return null;
        }

        String vehicleID = Helper.generateId();

        Vehicle vehicle = new Vehicle.Builder()
                .setVehicleID(vehicleID)
                .setNumberPlate(numberPlate)
                .setStatus(status)
                .build();
        return vehicle;
    }
}
