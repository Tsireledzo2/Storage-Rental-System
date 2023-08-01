package za.ac.cput.factory;

import za.ac.cput.domain.Employee;

public class EmployeeFactory {

    public static Employee buildEmployee(String employeeNumber, String first_name, String last_name, String email, String password){

        Employee employee = new Employee.Builder()
                .setEmployeeNumber(employeeNumber)
                .setFirst_name(first_name)
                .setLast_name(last_name)
                .setEmail(email)
                .setPassword(password)
                .buildEmployee();

        return employee;
    }
}
