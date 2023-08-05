/**
 * DriverFactoryTest.java
 * Class for the DriverFactoryTest
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Vehicle;

import static org.junit.jupiter.api.Assertions.*;
class DriverFactoryTest {
    @Test
    void createVehicleFactory(){
        Driver driver = DriverFactory.buildDriver("Tsireledzo","Makhado","63562526726","tsire@gmail.com","tsie1234567");
        System.out.println("Driver: " +driver);
        assertNotNull(driver.getDriverID());
    }

}