package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.VehicleType;

import static org.junit.jupiter.api.Assertions.*;
class VehicleTypeFactoryTest {
    @Test
    void createVehicleFactory(){
        VehicleType vehicleType = VehicleTypeFactory.buildVehicleType("Toyota","Truck",100,6352);
        System.out.println("Driver: " +vehicleType);
        assertNotNull(vehicleType.getName());
    }
  
}