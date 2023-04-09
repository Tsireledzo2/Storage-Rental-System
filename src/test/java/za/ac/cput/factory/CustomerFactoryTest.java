package za.ac.cput.factory;
/*
Author @Ndumiso Nkululeko Ngcobo
Date: 09/04/2023
Student Number: 220094861
This is a Customer Factory Test Class
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;
class CustomerFactoryTest {
    @Test
    void EqualityTest(){
        Customer customer = CustomerFactory.createCustomer("Wisdom","Makhado","Wizzy@gmail.com", "067 9580801");
        System.out.println("Customer: " + customer.toString());
        assertNotNull(customer);
    }

    @Test
    void test_fail (){
        Customer customer = CustomerFactory.createCustomer("","Makhado","Wizzy@gmail.com", "067 9580801");
        System.out.println("Customer: " + customer.toString());
        assertNotNull(customer);
    }

}
