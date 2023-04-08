package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.Helper;


public class AddressFactory {
    public static Address createAddress(String streetName,
                                        String state,
                                        String zipCode){
        if (     Helper.isNullorEmpty(streetName)
                 || Helper.isNullorEmpty(state)
                 || Helper.isNullorEmpty(zipCode)){
             return null;
        }
        String addressId = Helper.generateId();


        Address address =  new Address.Builder()
                .setAddressID(addressId)
                .setStreetName(streetName)
                .setState(state)
                .setZipCode(zipCode).build();

        return address;
    }

}
