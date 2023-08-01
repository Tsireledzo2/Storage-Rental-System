package za.ac.cput.factory;

import za.ac.cput.domain.Driver;

public class DriverFactory {

    public static Driver buildDriver(String employeeNumber,String job_description,String licence_number, String first_name, String last_name, String email, String password){

        Driver driver = new Driver.Builder()
                .setJob_description(job_description)
                .setLicence_number(licence_number)
                .setEmployee(EmployeeFactory.buildEmployee(employeeNumber,first_name,last_name,email,password))
                .buildDriver();

        return driver;
    }
}
