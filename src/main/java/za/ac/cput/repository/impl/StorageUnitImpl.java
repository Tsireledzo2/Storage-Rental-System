
/**
 * This is a basecode
 * StorageUnitImpl.java
 * Entity for the StorageTypeImpl
 * @author: Ruvimbo Ndoro (220128871)
 * Date: 08 April 2023
 */





package za.ac.cput.repository.impl;

import za.ac.cput.domain.StorageUnit;
import za.ac.cput.repository.IStorageUnitRepository;

import java.util.HashSet;
import java.util.Set;

public class StorageUnitImpl implements IStorageUnitRepository {

    private static StorageUnitImpl storageUnitRepository= null;

    private Set<StorageUnit> storageUnitDB = null;

    private StorageUnitImpl(){storageUnitDB = new HashSet<StorageUnit>();
    }

    public static StorageUnitImpl getStorageUnitRepository(){
        if (storageUnitRepository ==null){
            storageUnitRepository = new StorageUnitImpl();
        }
        return storageUnitRepository;
    }
    @Override
    public StorageUnit create(StorageUnit storageUnit) {
        boolean success = storageUnitDB.add(storageUnit);
        System.out.println("StorageUnits : "+storageUnitDB);
        if (!success)
        return null;
        return storageUnit;
    }

    @Override
    public StorageUnit read(String unitId) {
        StorageUnit storageUnit = storageUnitDB.stream().filter(storageUnit1 -> storageUnit1.getUnitId().equals(unitId))
                .findAny()
                .orElse(null);
        return  storageUnit;
    }

    @Override
    public StorageUnit update(StorageUnit storageUnit) {
        StorageUnit oldStorageUnit = read(storageUnit.getUnitId());
        if(oldStorageUnit!= null){
            storageUnitDB.remove(oldStorageUnit);
            storageUnitDB.add(storageUnit);
            return storageUnit;
        }
        return null;
    }

    @Override
    public boolean delete(String unitID) {
        StorageUnit storageUnitToDelete = read(unitID);
        if(storageUnitToDelete == null)
        return false;
        storageUnitDB.remove(storageUnitToDelete);
        return true;
    }

    @Override
    public Set<StorageUnit> getAll() {
        return storageUnitDB;
    }
}
