/**
 * invoiceListFactory.java
 * This is the model or factory class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.repository.impl;

import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.repository.IInvoiceLineRepository;

import java.util.HashSet;
import java.util.Set;

public class InvoiceLineRepositoryImpl implements IInvoiceLineRepository {
    private static InvoiceLineRepositoryImpl InvoiceLineRepository= null;
    private Set<InvoiceLine> InvoiceLineDB =null;

    private InvoiceLineRepositoryImpl(){
        this.InvoiceLineDB = new HashSet<>();


    }

    public static InvoiceLineRepositoryImpl getRepository(){
        if (InvoiceLineRepository == null){
            InvoiceLineRepository = new InvoiceLineRepositoryImpl();

        }
        return InvoiceLineRepository;
    }


    @Override
    public InvoiceLine create(InvoiceLine invoiceLine) {
        boolean success = this .InvoiceLineDB.add(invoiceLine);

        if (!success){
            return null;
        }
        return invoiceLine;
    }

    @Override
    public InvoiceLine read(String s) {
        InvoiceLine read = this.InvoiceLineDB
                .stream()
                .filter(inc -> inc.getInvoiceListID().equals(s))
                .findAny()
                .orElse(null);
        return read;
    }

    @Override
    public InvoiceLine update(InvoiceLine invoiceLine) {
        InvoiceLine oldInvoiceLine = read(invoiceLine.getInvoiceListID());

        if (oldInvoiceLine != null){
            this.InvoiceLineDB.remove(oldInvoiceLine);
            this.InvoiceLineDB.add(invoiceLine);
            return invoiceLine;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        InvoiceLine invoiceLine = read(s);

        if (invoiceLine == null){
            return false;
        }
        this.InvoiceLineDB.remove(invoiceLine);
        return true;
    }
    @Override
    public Set<InvoiceLine> getAll() {
        return InvoiceLineDB;
    }
}
