
/**
        * This is a basecode
        * StorageUnitTypeImpl.java
        * Entity for the StorageTypeImpl
        * @author: Ruvimbo Ndoro (220128871)
        * Date: 08 April 2023
 */


package za.ac.cput.repository.impl;


import za.ac.cput.domain.StorageUnit;
import za.ac.cput.domain.StorageUnitType;
import za.ac.cput.repository.IStorageUnitTypeRepository;

import java.util.HashSet;
import java.util.Set;

public class StorageUnitTypeImpl implements IStorageUnitTypeRepository {


    private static StorageUnitTypeImpl storageUnitTypeRepository= null;

    private Set<StorageUnitType> storageUnitTypeDB = null;

    private StorageUnitTypeImpl(){storageUnitTypeDB = new HashSet<StorageUnitType>();
    }

    public static StorageUnitTypeImpl getStorageUnitTypeRepository(){
        if (storageUnitTypeRepository ==null){
            storageUnitTypeRepository = new StorageUnitTypeImpl();
        }
        return storageUnitTypeRepository;
    }




    @Override
    public StorageUnitType create(StorageUnitType storageUnitType) {
            boolean success = storageUnitTypeDB.add(storageUnitType);
            System.out.println("StorageUnitTypes : "+storageUnitTypeDB);
            if (!success)
                return null;
            return storageUnitType;
    }

    @Override
    public StorageUnitType read(String id) {
        StorageUnitType storageUnitType = storageUnitTypeDB.stream().filter(storageUnitType1 -> storageUnitType1.getId().equals(id))
                .findAny()
                .orElse(null);
        return  storageUnitType;

    }

    @Override
    public StorageUnitType update(StorageUnitType storageUnitType) {
        StorageUnitType oldStorageUnitType = read(storageUnitType.getId());
        if (oldStorageUnitType != null) {
            storageUnitTypeDB.remove(oldStorageUnitType);
            storageUnitTypeDB.add(storageUnitType);
            return storageUnitType;

        }
        return null;
    }

    @Override
    public boolean delete(String id) {
            StorageUnitType storageUnitTypeToDelete = read( id);
            if(storageUnitTypeToDelete == null)
                return false;
            storageUnitTypeDB.remove(storageUnitTypeToDelete);
            return true;
        }




    @Override
    public Set<StorageUnitType> getAll() {
        return null;
    }
}
