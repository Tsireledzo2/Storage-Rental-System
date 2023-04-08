package za.ac.cput.factory;

import za.ac.cput.domain.Driver;
import za.ac.cput.util.Helper;

public class DriverFactory {
    public static Driver buildDriver(String firstName, String lastName, String licenceNumber, String email, String password){
        if(Helper.isNullorEmpty(firstName)||Helper.isNullorEmpty(lastName)){
            return null;
        }

        String driverID = Helper.generateId();
        Helper.isValidEmial(email);

        Driver driver = new Driver.Builder()
                .setDriverID(driverID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setLicenceNumber(licenceNumber)
                .setEmail(email)
                .setPassword(password)
                .build();
        return driver;
    }
}
