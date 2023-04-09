
/*
 * This is a basecode
 * StorageUnitFactory.java
 * @author:Ruvimbo Ndoro (220128871)
 * Date: 08 April 2023

 */



package za.ac.cput.factory;

import za.ac.cput.domain.StorageUnit;
import za.ac.cput.util.Helper;

public class StorageUnitFactory {

    public static StorageUnit createStorageUnit(String description, int floor) {

        String unitId = Helper.generateId();

        return new StorageUnit.Builder().setUnitId(unitId)
                .setDescription(description)
                .setFloor(floor)
                .build();


    }
}