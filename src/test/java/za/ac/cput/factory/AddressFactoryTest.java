package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.*;
class AddressFactoryTest {
    @Test
    void EqualityTest(){
        Address address = AddressFactory.createAddress(" 10 Dorsert","Woodstock","8001");
        System.out.println("Address: " +address.toString());
        assertNotNull(address);
    }

    @Test
    void test_fail (){
        Address address = AddressFactory.createAddress("","Woodstock","8001");
        System.out.println("Address: " +address.toString());
        assertNotNull(address);
    }

}


  
