/*
ManagerRepositoryImplTest.java
This is the RepositoryImpl Test
author : Lithemba Nkqayi(220558558)
Date :8 April 2023
 */
package za.ac.cput.repository.impl;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Manager;
import za.ac.cput.factory.ManagerFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ManagerRepositoryImplTest {
    private static ManagerRepositoryImpl managerRepository = ManagerRepositoryImpl.getManagerRepository();
    private static Manager manager = ManagerFactory.createManager("Lithemba","Nkqayi","lee@gmail.com","234Q");

    @Test
    void a_create() {
        Manager createManager = managerRepository.create(manager);
        assertEquals(manager.getId(),createManager.getId());
        System.out.println("Created manager : " +createManager);
    }
    @Test
    void b_read() {
        Manager readManager = managerRepository.read(manager.getId());
        assertNotNull(readManager);
        System.out.println("Manager: " +readManager);

    }
    @Test
    void c_update() {
        Manager newManager = new Manager.Builder().copy(manager)
                .setFirstName("Lithemba")
                .setLastName("Nkqayi")
                .setEmail("Lee@gmail.com")
                .setPassword("214WER")
                .build();

        assertNotNull(managerRepository .update(manager));
        System.out.println("Updated Manager: " +newManager);
    }
    @Test
    void d_delete() {
        boolean success = managerRepository.delete(manager.getId());
        assertTrue(success);
        System.out.println("deleted");

    }
    @Test
    void e_getAll() {
        System.out.println("All Managers: "+managerRepository.getAll());
    }

}