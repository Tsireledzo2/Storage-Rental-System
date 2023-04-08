package za.ac.cput.factory;



import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;
public class CustomerFactory
{
    public static Customer createCustomer(String firstName,
                                          String lastName,
                                          String email,
                                          String phone){


        if (Helper.isNullorEmpty(firstName) ||
                Helper.isNullorEmpty(lastName) ||
                Helper.isNullorEmpty(phone)){
            return null;
        }
        String customerIdentityNum = Helper.generateId();
        if (!Helper.isValidEmial(email)){
            return null;
        }
    Customer customer = new Customer.Builder()
                        .setCustomerId(customerIdentityNum)
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setEmail(email)
                        .setPhone(phone)
                        .build();
        return customer;
    }
}
