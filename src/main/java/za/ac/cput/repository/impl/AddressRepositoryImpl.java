package za.ac.cput.repository.impl;
/*
This is a Customer Class
Author @Ndumiso Nkululeko Ngcobo
Date: 07-04-2023
Student Number: 220094861
 */
import za.ac.cput.domain.Address;
import za.ac.cput.repository.iAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class AddressRepositoryImpl implements iAddressRepository {
    private static AddressRepositoryImpl addressRepository = null;
    private Set <Address> addressDB = null;

    private AddressRepositoryImpl(){
        addressDB = new HashSet<Address>();
    }

    public static AddressRepositoryImpl getAddressRepository(){
        if (addressRepository == null){
            addressRepository = new AddressRepositoryImpl();
        }
        return addressRepository;
    }
    @Override
    public Address create(Address address) {
        boolean success = addressDB.add(address);
        System.out.println("Address: " + addressDB );
        if(!success)
        return null;
        return address;
    }

    @Override
    public Address read(String addressId) {
Address address = addressDB.stream()
                 .filter(address1 -> address1.getAddressID()
                 .equals(addressId))
                 .findAny()
                  .orElse(null);

        return null;
    }

    @Override
    public Address update(Address address) {
     Address updateAddress = read(address.getAddressID());
     if (updateAddress !=null){
         addressDB.remove(updateAddress);
     }
        return null;
    }

    @Override
    public boolean delete(String addressID) {
Address deleteAddress = read(addressID);
if (deleteAddress==null)

        return false;
addressDB.remove(deleteAddress);
return true;
    }

    @Override
    public Set<Address> getAll() {

        return null;
    }
}
