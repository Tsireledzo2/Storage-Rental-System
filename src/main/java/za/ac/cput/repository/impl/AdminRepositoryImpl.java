/*
AdminRepositoryImpl.java
This is the AdminRepositoryImpl class
author : Lithemba Nkqayi(220558558)
Date : 8 April 2023
 */
package za.ac.cput.repository.impl;
import za.ac.cput.domain.Admin;
import za.ac.cput.repository.IAdminRepository;


import java.util.HashSet;
import java.util.Set;

public class AdminRepositoryImpl implements IAdminRepository{
 private static AdminRepositoryImpl adminRepository = null;
 private Set<Admin> adminDB = null;

 private AdminRepositoryImpl(){
     adminDB = new HashSet<Admin>();

 }
 public static AdminRepositoryImpl getAdminRepository(){
     if (adminRepository == null) {
         adminRepository  = new AdminRepositoryImpl ();
     }
     return adminRepository;
 }

 @Override
 public Admin create(Admin admin) {
     boolean success = adminDB.add(admin);
     System.out.println("Admin: " + adminDB);
     if (!success)
         return null;
     return admin;
 }

    @Override
    public Admin read(String id) {
     Admin admin =adminDB.stream().filter(admin1 -> admin1.getId().equals(id))
             .findAny()
             .orElse(null);
        return null;
    }

    @Override
    public Admin update(Admin admin) {
     Admin formerAdmin = read(admin.getId());
     if(formerAdmin != null){
         adminDB.remove(formerAdmin);
         adminDB.add(admin);
     }
        return null;
    }

    @Override
    public boolean delete(String id) {
     Admin adminToDelete = read(id);
     if(adminToDelete == null)
        return false;
     adminDB.remove(adminToDelete);
     return true;
    }

    @Override
    public Set<Admin> getAll() {
        return adminDB;
    }
}
