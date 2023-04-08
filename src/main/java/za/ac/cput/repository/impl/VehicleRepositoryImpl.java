/**
 * VehicleRepositoryImpl.java
 * Class for the VehicleRepositoryImpl
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.repository.impl;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.repository.IVehicleRepository;
import java.util.HashSet;
import java.util.Set;

public class VehicleRepositoryImpl implements IVehicleRepository {
    private static VehicleRepositoryImpl vehicleRepository = null;

    private Set<Vehicle> vehicleDB = null;

    private VehicleRepositoryImpl(){
        vehicleDB = new HashSet<Vehicle>();
    }
    public static VehicleRepositoryImpl getVehicleRepository(){
        if(vehicleRepository ==null){
            vehicleRepository = new VehicleRepositoryImpl();
        }
        return vehicleRepository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        boolean success = vehicleDB.add(vehicle);
        System.out.println("Vehicles: "+vehicle);
        if(!success)
            return null;
        return vehicle;
    }

    @Override
    public Vehicle read(String vehicleID) {
        Vehicle vehicle = vehicleDB.stream().filter(vehicle1 -> vehicle1.getVehicleID().equals(vehicleID))
                .findAny()
                .orElse(null);

        return vehicle;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle oldVehicle = read(vehicle.getVehicleID());
        if(oldVehicle != null){
            vehicleDB.remove(oldVehicle);
            vehicleDB.add(vehicle);
            return vehicle;
        }
        return null;
    }

    @Override
    public boolean delete(String vehicleID) {
        Vehicle vehicleToDelete = read(vehicleID);
        if(vehicleToDelete==null)
            return false;
        vehicleDB.remove(vehicleToDelete);
        return true;
    }

    @Override
    public Set<Vehicle> getAll() {
        return vehicleDB;
    }
}
