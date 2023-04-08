/*
IAdminRepository.java
This is the IAdminRepository interface
author : Lithemba Nkqayi(220558558)
Date : 8 April 2023
 */
package za.ac.cput.repository;
import za.ac.cput.domain.Admin;

import java.util.Set;

public interface IAdminRepository extends IRepository<Admin,String>{

    public Set<Admin> getAll();
}
