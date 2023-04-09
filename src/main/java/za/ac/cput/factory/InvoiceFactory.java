/**
 * invoicefactory.java
 * This is the model or factory class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Invoice;
import za.ac.cput.util.Helper;

public class InvoiceFactory {

    public static Invoice buildInvoice( float amount, String customerName){
        if(Helper.isNullorEmpty3(amount)||Helper.isNullorEmpty(customerName)){
            return null;
        }

        String invoiceid = Helper.generateId();

        Invoice invoice = new Invoice.Builder()
                .setInvoiceID(invoiceid)
                .setAmount(amount)
                .setCustomerName(customerName)
                .build();
        return invoice;

    }


}
