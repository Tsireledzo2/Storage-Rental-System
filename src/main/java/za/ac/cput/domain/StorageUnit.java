/**
 * This is the StorageUnit class
 * Author Ruvimbo Ndoro 220128871
 * Date 8May 2023
 */

package za.ac.cput.domain;

public class StorageUnit {


    private String unitId;
    private String description;
    private int floor;

    private StorageUnit() {
    }

    private StorageUnit(Builder builder) {
        this.unitId = builder.unitId;
        this.description = builder.description;
        this.floor = builder.floor;
    }





    public String getUnitId() {
        return unitId;
    }

    public String getDescription() {
        return description;
    }

    public int getFloor() {
        return floor;
    }


    @Override
    public String toString() {
        return "StorageUnit{" +
                "unitId='" + unitId + '\'' +
                ", description='" + description + '\'' +
                ", floor=" + floor +
                '}';
    }

    public static class Builder {
        private String unitId;
        private String description;
        private int floor;

        public Builder setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setFloor(int floor) {
            this.floor = floor;
            return this;
        }

        public Builder copy(StorageUnit storageUnit) {
            this.unitId = storageUnit.unitId;
            this.description = storageUnit.description;
            this.floor = storageUnit.floor;
            return this;

        }

        public StorageUnit build() {
            return new StorageUnit(this);
        }

    }
}

