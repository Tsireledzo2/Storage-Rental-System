/**
 * DriverRepositoryImpl.java
 * Class for the DriverRepositoryImpl
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.repository.impl;
import za.ac.cput.domain.Driver;
import za.ac.cput.repository.IDriverRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverRepositoryImpl implements IDriverRepository {

    private static DriverRepositoryImpl driverRepository = null;

    private Set<Driver> driverDB = null;

    private DriverRepositoryImpl(){
        driverDB = new HashSet<Driver>();
    }
    public static DriverRepositoryImpl getDriverRepository(){
        if(driverRepository==null){
            driverRepository = new DriverRepositoryImpl();
        }
        return driverRepository;
    }

    @Override
    public Driver create(Driver driver) {
        boolean success = driverDB.add(driver);
        System.out.println("Drivers: "+driverDB);
        if(!success)
            return null;
        return driver;
    }

    @Override
    public Driver read(String driverID) {
        Driver driver = driverDB.stream().filter(driver1 -> driver1.getDriverID().equals(driverID))
                .findAny()
                .orElse(null);

        return driver;
    }

    @Override
    public Driver update(Driver driver) {
        Driver oldDriver = read(driver.getDriverID());
        if(oldDriver != null){
            driverDB.remove(oldDriver);
            driverDB.add(driver);
            return driver;
        }
        return null;
    }

    @Override
    public boolean delete(String driverID) {
        Driver driverToDelete = read(driverID);
        if(driverToDelete==null)
            return false;
        driverDB.remove(driverToDelete);
        return true;
    }
    @Override
    public Set<Driver> getAll() {
        return driverDB;
    }
}
