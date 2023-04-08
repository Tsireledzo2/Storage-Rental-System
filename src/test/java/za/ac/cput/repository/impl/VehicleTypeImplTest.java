package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.VehicleType;
import za.ac.cput.factory.VehicleTypeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class VehicleTypeImplTest {
    private static VehicleTypeImpl vehicleTypeRepository = VehicleTypeImpl.getVehicleTypeRepository();
    private static VehicleType vehicleType = VehicleTypeFactory.buildVehicleType("A417","Tsire",323,323);


    @Test
    void a_create() {
        VehicleType buildVehicle = vehicleTypeRepository.create(vehicleType);
        assertEquals(vehicleType.getName(),buildVehicle.getName());
        System.out.println("Created vehicleType : " +buildVehicle );
    }

    @Test
    void b_read() {
        VehicleType readVehicleType = vehicleTypeRepository.read(vehicleType.getName());
        assertNotNull(readVehicleType);
        System.out.println("VehicleType: " +readVehicleType);

    }

    @Test
    void c_update() {
        VehicleType newVehicleType = new VehicleType.Builder().copy(vehicleType)
                .setName("Isuzu")
                .setCategory("bakkie")
                .setCapacity(34)
                .setPrice(434)
                .build();
        assertNotNull(vehicleTypeRepository.update(vehicleType));
        System.out.println("Updated vehicleType: " + newVehicleType);
    }

    @Test
    void d_delete() {
        boolean success = vehicleTypeRepository.delete(vehicleType.getName());
        assertTrue(success);
        System.out.println("deleted");

    }

    @Test
    void e_getAll() {
        System.out.println("All vehicleTypes: "+vehicleTypeRepository.getAll());
    }
}