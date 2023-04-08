/*
ManagerRepositoryImpl.java
This is the ManagerRepositoryImpl class
author : Lithemba Nkqayi(220558558)
Date : 8 April 2023
 */
package za.ac.cput.repository.impl;

import za.ac.cput.domain.Manager;
import za.ac.cput.repository.IManagerRepository;

import java.util.HashSet;
import java.util.Set;

public class ManagerRepositoryImpl implements IManagerRepository{



        private static ManagerRepositoryImpl managerRepository = null;
        private Set<Manager> managerDB = null;

        private ManagerRepositoryImpl(){
            managerDB = new HashSet<Manager>();

        }
        public static ManagerRepositoryImpl getManagerRepository(){
            if (managerRepository == null) {
                managerRepository  = new ManagerRepositoryImpl();
            }
            return managerRepository;
        }

        @Override
        public Manager create(Manager manager) {
            boolean success = managerDB.add(manager);
            System.out.println("Managers: " + managerDB);
            if (!success)
                return null;
            return manager;
        }

        @Override
        public Manager read(String id) {
            Manager manager =managerDB.stream().filter(manager1 -> manager1.getId().equals(id))
                    .findAny()
                    .orElse(null);
            return manager;
        }

        @Override
        public Manager update(Manager manager) {
            Manager formerManager = read(manager.getId());
            if(formerManager != null){
                managerDB.remove(formerManager);
                managerDB.add(manager);
            }
            return null;
        }

        @Override
        public boolean delete(String id) {
            Manager managerToDelete = read(id);
            if(managerToDelete == null)
                return false;
            managerDB.remove(managerToDelete);
            return true;
        }

        @Override
        public Set<Manager> getAll() {
            return managerDB;
        }
    }


