/**
 * DriverRepositoryImplTest.java
 * Class for the DriverRepositoryImplTest
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.repository.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DriverRepositoryImplTest {

    private static DriverRepositoryImpl driverRepository = DriverRepositoryImpl.getDriverRepository();
    private static Driver driver = DriverFactory.buildDriver("Tsire","Makhado","34334343453453","tsire@gmail.com","tsire83638622");


    @Test
    void a_create() {
        Driver buildDriver = driverRepository.create(driver);
        assertEquals(driver.getDriverID(), buildDriver.getDriverID());
        System.out.println("Created driver : " +buildDriver );
    }

    @Test
    void b_read() {
        Driver readDriver = driverRepository.read(driver.getDriverID());
        assertNotNull(readDriver);
        System.out.println("Driver: " +readDriver);
    }

    @Test
    void c_update() {
        Driver newDriver = new Driver.Builder().copy(driver)
                .setFirstName("Wisdom")
                .setLastName("Khados")
                .setEmail("tsire33@gmail.com")
                .setLicenceNumber("67387723333378")
                .setPassword("dsdsdf343g$3")
                .build();
        assertNotNull(driverRepository.update(driver));
        System.out.println("Updated Driver: " + newDriver);
    }

    //@Disabled
    @Test
    void d_delete() {
        boolean success = driverRepository.delete(driver.getDriverID());
        assertTrue(success);
        System.out.println("deleted");
    }

    @Test
    void e_getAll() {
        System.out.println("All drivers: "+driverRepository.getAll());
    }
}