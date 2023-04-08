package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    @Test
    void createVehicleFactory(){
        Vehicle vehicle = VehicleFactory.buildVehicle("ABC 363",true);
        System.out.println("Vehicle: " +vehicle);
        assertNotNull(vehicle.getVehicleID());
    }

}