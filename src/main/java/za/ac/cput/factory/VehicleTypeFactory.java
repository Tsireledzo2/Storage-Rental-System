/**
 * This is a basecode
 * VehicleTypeFactory.java
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.VehicleType;
import za.ac.cput.util.Helper;

public class VehicleTypeFactory {


    public static VehicleType buildVehicleType(String name, String category,int capacity,double price){
        if(Helper.isNullorEmpty(name)||Helper.isNullorEmpty(category)){
            return null;
        }

        VehicleType vehicleType = new VehicleType.Builder()
                .setName(name)
                .setCategory(category)
                .setCapacity(capacity)
                .setPrice(price)
                .build();
        return vehicleType;
    }
}