/*
AdminRepositoryImplTest.java
This is the RepositoryImpl Test
author : Lithemba Nkqayi(220558558)
Date :8 April 2023
 */
package za.ac.cput.repository.impl;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminRepositoryImplTest {

    private static  AdminRepositoryImpl adminRepository = AdminRepositoryImpl.getAdminRepository();
    private static Admin admin = AdminFactory.createAdmin("Lilz","Lily","Lily7@gmail.com","802");

    @Test
    void a_create() {
        Admin createAdmin = adminRepository.create(admin);
        assertEquals(admin.getId(),createAdmin.getId());
        System.out.println("Created Admin : " +createAdmin );
    }

    @Test
    void b_read() {
        Admin readAdmin = adminRepository.read(admin.getId());
        assertNotNull(readAdmin);
        System.out.println("Admin: " +readAdmin);

    }
    @Test
    void c_update() {
        Admin newAdmin = new Admin.Builder().copy(admin)
                .setFirstName("Lilz")
                .setLastName("Lily")
                .setEmail("Li1@gmail.com")
                .setPassword("OP234")
                .build();

        assertNotNull(adminRepository.update(admin));
        System.out.println("Updated admin: " +newAdmin);
    }
    @Test
    void d_delete() {
        boolean success = adminRepository.delete(admin.getId());
        assertTrue(success);
        System.out.println("deleted");

    }
    @Test
    void e_getAll() {
        System.out.println("All admins: "+adminRepository.getAll());
    }


}