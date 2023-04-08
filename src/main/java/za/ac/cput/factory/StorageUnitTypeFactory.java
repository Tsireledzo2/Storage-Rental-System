
/*
 * This is a basecode
 * StorageUnitTypeFactory.java
 * @author:Ruvimbo Ndoro (220128871)
 * Date: 08 April 2023

 */

package za.ac.cput.factory;

import za.ac.cput.domain.StorageUnitType;
import za.ac.cput.util.Helper;

public class StorageUnitTypeFactory {

    public static StorageUnitType createStorageUnitType (double length, double width, double height, int unitSize, double price ) {

        String Id = Helper.generateId();

        return new StorageUnitType.Builder().setId(Id)
                .setLength(length)
                .setWidth(width)
                .setHeight(height)
                .setUnitSize(unitSize)
                .setPrice(price)
                .build();



    }
}
