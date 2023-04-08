/**
 * This is a basecode
 * StorageUnitRepository.java
 * Entity for the StorageUnitRepository
 * @author: Ruvimbo Ndoro (220128871)
 * Date: 08 April 2023
 */





package za.ac.cput.repository;

import za.ac.cput.domain.StorageUnit;

import java.util.Set;

public interface IStorageUnitRepository extends IRepository <StorageUnit, String>{

    public Set<StorageUnit> getAll();
}
