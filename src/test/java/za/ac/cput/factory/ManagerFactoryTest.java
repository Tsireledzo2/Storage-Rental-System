/*
ManagerFactoryTest.java
This is the Factory test
author : Lithemba Nkqayi(220558558)
Date :8 April 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {

        @Test
        void createManagerFactory(){
            Manager manager = ManagerFactory.createManager("342","Licious","Lily","lily7@gmail.com");
            System.out.println("Manager: " +manager);
            assertNotNull(manager.getFirstName());
        }

    }

