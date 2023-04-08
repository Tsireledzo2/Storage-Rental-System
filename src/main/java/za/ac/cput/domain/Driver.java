/**
 * Driver.java
 * Entity for the Driver
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 08 April 2023
 */
package za.ac.cput.domain;

public class Driver {
    private String driverID;
    private String firstName;
    private String lastName;
    private String licenceNumber;
    private String email;
    private String password;

    private Driver(){}

    private Driver(Builder builder){
        this.driverID = builder.driverID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.licenceNumber = builder.licenceNumber;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getDriverID() {
        return driverID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID=" + driverID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String driverID;
        private String firstName;
        private String lastName;
        private String licenceNumber;
        private String email;
        private String password;

        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setLicenceNumber(String licenceNumber) {
            this.licenceNumber = licenceNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(Driver driver){
            this.driverID = driver.driverID;
            this.firstName = driver.firstName;
            this.lastName = driver.lastName;
            this.licenceNumber = driver.licenceNumber;
            this.email = driver.email;
            this.password = driver.password;
            return this;
        }

        public Driver build(){
            return new Driver(this);
        }
    }
}