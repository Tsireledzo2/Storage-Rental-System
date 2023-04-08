/**
 *  StorageUnitImplTest.java
 * Author Ruvimbo Ndoro 220128871
 * Date 8April 2023
 */




package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.StorageUnit;

import za.ac.cput.factory.StorageUnitFactory;
import static org.junit.jupiter.api.Assertions.*;



@TestMethodOrder(MethodOrderer.MethodName.class)

class StorageUnitImplTest {

    private static StorageUnitImpl storageUnitRepository = StorageUnitImpl.getStorageUnitRepository();
    private static StorageUnit storageUnit = StorageUnitFactory.createStorageUnit("small", 1 );

    @Test
    void a_create() {
        StorageUnit createStorageUnit = storageUnitRepository.create(storageUnit);
        assertEquals(storageUnit.getDescription(), createStorageUnit.getDescription());
        System.out.println("Created storageUnit : " + createStorageUnit);
    }

    @Test
    void b_read() {
        StorageUnit readStorageUnit = storageUnitRepository.read(storageUnit.getUnitId());
        assertNotNull(readStorageUnit);
        System.out.println("StorageUnit: " + readStorageUnit);
    }
    @Test
    void c_update() {
        StorageUnit newStorageUnit= new StorageUnit.Builder().copy(storageUnit)
                .setDescription("small")
                .setFloor(1)

                .build();
        assertNotNull(storageUnitRepository.update(storageUnit));
        System.out.println("Updated storageUnit: " + newStorageUnit);
    }

    @Test
    void d_delete() {
        boolean success = storageUnitRepository.delete(storageUnit.getUnitId());
        assertTrue(success);
        System.out.println("deleted");
    }
    @Test
    void e_getAll() {
        System.out.println("All storageUnits: "+storageUnitRepository.getAll());
    }
}
