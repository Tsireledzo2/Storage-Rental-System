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
        this.InvoiceDB = new HashSet<>();
    }
    public static InvoiceRepositpryImpl getRepository(){
        if (InvoiceRepositpry == null ){
            InvoiceRepositpry = new InvoiceRepositpryImpl();
        }
        return InvoiceRepositpry;
    }



    @Override
    public Invoice create(Invoice invoice) {
        boolean success = this.InvoiceDB.add(invoice);
        if (!success){
            return null;
        }
        return invoice;
    }

    @Override
    public Invoice read(String s) {
        Invoice read = this.InvoiceDB
                .stream()
                .filter(in ->in.getInvoiceID().equals(s))
                .findAny()
                .orElse(null);
        return read;
    }

    @Override
    public Invoice update(Invoice invoice) {
        Invoice oldInvoice = read(invoice.getInvoiceID());

        if (oldInvoice != null){
            this.InvoiceDB.remove(oldInvoice);
            this.InvoiceDB.add(invoice);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Invoice invoice = read(s);
        if (invoice == null){
            return false;
        }
        this.InvoiceDB.remove(invoice);
        return true;
    }
    @Override
    public Set<Invoice> getAll() {
        return InvoiceDB;
    }
}
