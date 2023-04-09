/**
 * This is a basecode
 * IStorageUnitTypeRepository.java
 * Entity for the IStorageTypeRepository
 * @author: Ruvimbo Ndoro (220128871)
 * Date: 08 April 2023
 */




package za.ac.cput.repository;

import za.ac.cput.domain.StorageUnitType;

import java.util.Set;

    public interface IStorageUnitTypeRepository extends IRepository <StorageUnitType, String>{

        public Set<StorageUnitType> getAll();
    }


