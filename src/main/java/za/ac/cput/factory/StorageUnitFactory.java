package za.ac.cput.factory;

import za.ac.cput.domain.StorageUnit;

public class StorageUnitFactory {
    public static StorageUnit buildStorageUnit(String id, String description ,int height,int length, int width, int unitSize, double price){

        StorageUnit storageUnit = new StorageUnit.Builder()
                .setUnitId(id)
                .setUnitSizeDescription(description)
                .setStorageUnitType(StorageUnitTypeFactory.buildStorageUnitType(height,length,width,unitSize,price))
                .build();

        return storageUnit;
    }
}
