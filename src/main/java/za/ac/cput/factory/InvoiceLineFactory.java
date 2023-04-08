/**
 * invoiceListFactory.java
 * This is the model or factory class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.util.Helper;

import java.util.List;

public class InvoiceLineFactory {
    public static InvoiceLine buildInvoiceLine( List invoiceline) {
        if ( Helper.isNullorEmpty2(invoiceline)) {
            return null;
        }
        String invoiceLineId = Helper.generateId();

        InvoiceLine invoiceList = new InvoiceLine.Builder()
                .setInvoiceline(invoiceline)
                .setInvoiceListID(invoiceLineId)
                .build();
        return invoiceList;
    }
}
