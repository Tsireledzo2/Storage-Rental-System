/**
 * invoiceListFactory.java
 * This is the model or factory class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.repository.impl;

import za.ac.cput.domain.Invoice;
import za.ac.cput.repository.IInvoiceRepository;

import java.util.HashSet;
import java.util.Set;

public class InvoiceRepositpryImpl implements IInvoiceRepository {
    private  static InvoiceRepositpryImpl InvoiceRepositpry = null;
    private Set<Invoice> InvoiceDB = null;

    private InvoiceRepositpryImpl(){
        this.InvoiceDB = new HashSet<Invoice>();
    }
    public static InvoiceRepositpryImpl getRepository(){
        if (InvoiceRepositpry == null ){
            InvoiceRepositpry = new InvoiceRepositpryImpl();
        }
        return InvoiceRepositpry;
    }



    @Override
    public Invoice create(Invoice invoice) {
        boolean success = InvoiceDB.add(invoice);
        System.out.println("Invoice: "+InvoiceDB );
        if (!success)
            return null;
        return invoice;
    }

    @Override
    public Invoice read(String invoiceId) {
        Invoice invoice = InvoiceDB
                .stream()
                .filter(invoice1 -> invoice1.getInvoiceID().equals(invoiceId))
                .findAny()
                .orElse(null);
        return invoice;
    }

    @Override
    public Invoice update(Invoice invoice) {
        Invoice oldInvoice = read(invoice.getInvoiceID());
        if (oldInvoice != null){
            InvoiceDB.remove(oldInvoice);
            InvoiceDB.add(invoice);
            return invoice;
        }
        return null;
    }

    @Override
    public boolean delete(String invoiceId) {
        Invoice invoice = read(invoiceId);
        if (invoice == null)
            return false;
        InvoiceDB.remove(invoice);
        return true;
    }
    @Override
    public Set<Invoice> getAll() {
        return InvoiceDB;
    }
}
