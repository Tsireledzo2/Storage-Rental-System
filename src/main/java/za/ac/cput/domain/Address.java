package za.ac.cput.domain;
/*
This is a Address Class
Author @Ndumiso Nkululeko Ngcobo
Date: 07-04-2023
Student Number: 220094861
 */
public class Address {
    private String addressID;
    private String streetName;
    private String state;
    private String zipCode;

    public String getAddressID() {
        return addressID;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
    private Address(){

    }
    private Address(Builder builder){

        this.addressID = builder.addressID;
        this.state = builder.state;
        this.zipCode  = builder.zipCode;
        this.streetName = builder.streetName;
    }
    public static class Builder{
        private String addressID;
        private String streetName;
        private String state;
        private String zipCode;

        public Builder setAddressID(String addressID) {
            this.addressID = addressID;
            return this;
        }


        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Builder copy(Address address){
            this.addressID = address.addressID;
            this.state = address.state;
            this.zipCode = address.zipCode;
            this.streetName = address.streetName;
            return this;
        }

        public Address build() {
            return new Address(this);

        }
    }

}


