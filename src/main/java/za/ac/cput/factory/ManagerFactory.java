package za.ac.cput.factory;

import za.ac.cput.domain.Manager;

public class ManagerFactory {

    public static Manager buildManager(String employeeNumber,String job_description,String licence_number, String first_name, String last_name, String email, String password){

        Manager manager = new Manager.Builder()
                .setJob_description(job_description)
                .setEmployee(EmployeeFactory.buildEmployee(employeeNumber,first_name,last_name,email,password))
                .build();
        return manager;
    }
}
