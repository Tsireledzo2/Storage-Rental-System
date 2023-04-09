
/**
 *  StorageUnitFactoryTest.java
 * Author Ruvimbo Ndoro 220128871
 * Date 8May 2023
 */



package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;




import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StorageUnit;


import static org.junit.jupiter.api.Assertions.*;

    class StorageUnitFactoryTest {

        @Test
        void createStorageUnitFactory(){
            StorageUnit storageUnit = StorageUnitFactory.createStorageUnit("small",1);
            System.out.println("StorageUnit: " +storageUnit);
            assertNotNull(storageUnit.getDescription());
        }

    }

