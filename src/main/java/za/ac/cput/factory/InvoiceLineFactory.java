package za.ac.cput.factory;

import za.ac.cput.domain.InvoiceLine;

public class InvoiceLineFactory {

    public static InvoiceLine buildInvoiceLine(String invoiceLineId,String serviceDescription,int quantity,double unitPrice,double lineTotalAmount ){

        InvoiceLine invoiceLine = new InvoiceLine.Builder()
                .setInvoiceLineId(invoiceLineId)
                .setServiceDescription(serviceDescription)
                .setQuantity(quantity)
                .setUnitPrice(unitPrice)
                .setLineTotalAmount(lineTotalAmount)
                .build();
        return invoiceLine;
    }
}
