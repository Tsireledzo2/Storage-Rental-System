package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class VehicleRepositoryImplTest {
    private static VehicleRepositoryImpl vehicleRepository = VehicleRepositoryImpl.getVehicleRepository();
    private static Vehicle vehicle = VehicleFactory.buildVehicle("ABF RTF",false);

    @Test
    void a_create() {
        Vehicle buildVehicle = vehicleRepository.create(vehicle);
        assertEquals(vehicle.getVehicleID(), buildVehicle.getVehicleID());
        System.out.println("Created vehicle : " +buildVehicle );
    }

    @Test
    void b_read() {
        Vehicle readVehicle = vehicleRepository.read(vehicle.getVehicleID());
        assertNotNull(readVehicle);
        System.out.println("Vehicle: " +readVehicle);
    }

    @Test
    void c_update() {
        Vehicle newVehicle = new Vehicle.Builder().copy(vehicle)
                .setStatus(true)
                .build();
        assertNotNull(vehicleRepository.update(vehicle));
        System.out.println("Updated Vehicle: " + newVehicle);
    }

    @Test
    void d_() {
        boolean success = vehicleRepository.delete(vehicle.getVehicleID());
        assertTrue(success);
        System.out.println("deleted");
    }

    @Test
    void getAll() {
        System.out.println("All drivers: "+vehicleRepository.getAll());
    }
}